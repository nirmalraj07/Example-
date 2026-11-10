# Example-
html
<!DOCTYPE html>
<html>
<head>
    <title>My Cloud Website</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <header>
        <h1>Welcome to My Cloud Website</h1>
        <p>Hosted using Amazon S3 and CloudFront</p>
    </header>

    <section class="container">
        <h2>Cloud Computing Practical</h2>

        <p>
            This website is created using HTML, CSS
            and JavaScript and hosted on Amazon S3.
        </p>

        <p>
            Amazon CloudFront provides faster content
            delivery to users around the world.
        </p>

        <button onclick="showMessage()">
            Click Here
        </button>

        <h3 id="message"></h3>
    </section>

    <footer>
        <p>Created for Cloud Computing Laboratory</p>
    </footer>

    <script src="script.js"></script>
</body>
</html>

css
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    font-family: Arial, sans-serif;
    background-color: #f0f4f8;
    text-align: center;
}

header {
    background-color: #232f3e;
    color: white;
    padding: 40px;
}

header h1 {
    margin-bottom: 15px;
}

.container {
    background-color: white;
    margin: 60px auto;
    padding: 40px;
    width: 80%;
    max-width: 700px;
    border-radius: 10px;
}

.container h2 {
    color: #232f3e;
    margin-bottom: 20px;
}

.container p {
    margin: 15px;
    line-height: 1.6;
}

button {
    background-color: #ff9900;
    color: white;
    padding: 12px 25px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    margin-top: 20px;
}

button:hover {
    background-color: #e68a00;
}

#message {
    margin-top: 20px;
    color: green;
}

footer {
    background-color: #232f3e;
    color: white;
    padding: 20px;
}

js
function showMessage() {
    document.getElementById("message").innerHTML =
        "Your Static Website is Successfully Hosted!";
}


my-static-cloud-website
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Sid": "PublicReadGetObject",
      "Effect": "Allow",
      "Principal": "*",
      "Action": "s3:GetObject",
      "Resource": "arn:aws:s3:::my-static-cloud-website/*"
    }
  ]
}

