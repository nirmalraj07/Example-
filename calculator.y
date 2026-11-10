
%{
#include <stdio.h>
int yylex(void);
int yyerror(const char *s);
%}

%token NUMBER
%left '+' '-'
%left '*' '/'

%%

input:
    expr { printf("Result = %d\n", $1); }
    ;

expr:
    expr '+' expr { $$ = $1 + $3; }
  | expr '-' expr { $$ = $1 - $3; }
  | expr '*' expr { $$ = $1 * $3; }
  | expr '/' expr { $$ = $1 / $3; }
  | NUMBER        { $$ = $1; }
    ;

%%

int main()
{
    printf("Enter expression: ");
    yyparse();
    return 0;
}

int yyerror(const char *s)
{
    printf("Invalid Expression\n");
    return 0;
}
