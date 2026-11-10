
%{
#include <stdio.h>
%}

%token NUMBER
%left '+' '-'
%left '*' '/'

%%

expr:
    expr '+' expr { printf("Result = %d\n", $1+$3); }
  | expr '-' expr { printf("Result = %d\n", $1-$3); }
  | expr '*' expr { printf("Result = %d\n", $1*$3); }
  | expr '/' expr { printf("Result = %d\n", $1/$3); }
  | NUMBER
  ;

%%

int main()
{
    printf("Enter an expression: ");
    yyparse();
    return 0;
}

int yyerror()
{
    printf("Invalid Expression\n");
    return 0;
}
