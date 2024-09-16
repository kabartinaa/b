<!DOCTYPE html>
<html lang="en">
<head>
    
    <title>Atomic Template</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <nav>
            <div class="logo">Atomic</div>
            <ul id="li">
                <li>Home</li>
                <li>About</li>
                <li>Services</li>
                <li>Gallery</li>
                <li>Blog</li>
                <li>Contact</li>
            </ul>
        </nav>
    </header>

    <section class="hero">
        <div class="hero-content">
            <h1>Design a better website template.</h1>
            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
           <button class="but">Free Download</button>
        </div>
        <div class="hero-video">
            <img src="plant.jpg" alt="plant hero-imagee"class="hero-image">
            <button class="play-button">&#9658;</button>
        </div>
   </section><br>
   <section></section>
   <div class="bo"
    <h3 class="h3"><strong>HERE IS DANCING BOT</strong></h3>
    </div>
    </section>
   <section>
     <img id="robot"  class="bot"
    src="https://blob.sololearn.com/courses/robot-c.jpg"><br>
    <button class="b1"
    onclick="robot.src='https://blob.sololearn.com/courses/robot-l.jpg'">
    Left</button>
    <button class="b2"
    onclick="robot.src='https://blob.sololearn.com/courses/robot-r.jpg'">
    Right</button>    
    
    <button class="b3" onclick="robot.src='https://blob.sololearn.com/courses/robot-c.jpg'">Reset</button>
   </section>

    <section class="features">
        <div class="feature">
            <h3>Intuitive Thinking</h3>
            <p>A small river named Duden flows by their place and supplies it with the necessary...</p>
        </div>
        <div class="feature">
            <h3>Orange for Carrots</h3>
            <p>A small river named Duden flows by their place and supplies it with the necessary...</p>
        </div>
        <div class="feature">
            <h3>Infinite Possibilities</h3>
            <p>A small river named Duden flows by their place and supplies it with the necessary...</p>
        </div>
    </section>

    <footer>
        <p>&copy; 2024 Atomic. All rights reserved.</p>
    </footer>
</body>
</html>
 {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    font-family: Arial, sans-serif;
    line-height: 1.6;
}

header {
    background: #fff;
    padding: 20px 0;
    border-bottom: 1px solid #ddd;
}

nav {
    display: flex;
    justify-content: space-between;
    align-items: center;
    max-width: 1200px;
    margin: 0 auto;
    padding: 0 20px;
}

nav ul {
    list-style: none;
    display: flex;
}

nav ul li {
    margin-left: 20px;
}

nav ul li a {
    text-decoration: none;
    color: #333;
    font-weight: bold;
}

.hero {
    display: flex;
    justify-content: space-between;
    align-items: center;
    background: #f4f4f4;
    padding: 50px 20px;
}

.hero-content {
    max-width: 50%;
}

.hero-content h1 {
    font-size: 2.5rem;
    color: #333;
    margin-bottom: 20px;
}

.hero-content p {
    font-size: 1.2rem;
    margin-bottom: 20px;
    color: #666;
}

.hero-content .btn {
    background-color: #3498db;
    color: #fff;
    padding: 10px 20px;
    text-decoration: none;
    border-radius: 5px;
    font-weight: bold;
}

.hero-video {
    position: relative;
}

.hero-image {
    max-width: 100%;
    border-radius: 10px;
}

.play-button {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    font-size: 40px;
    background-color: rgba(0, 0, 0, 0.5);
    color: white;
    border: none;
    border-radius: 50%;
    cursor: pointer;
    padding: 10px;
}

.features {
    display: flex;
    justify-content: space-around;
    padding: 50px 20px;
    background: #fff;
}

.feature {
    text-align: center;
    max-width: 30%;
}

.feature h3 {
    font-size: 1.5rem;
    color: #333;
    margin-bottom: 10px;
}

.feature p {
    font-size: 1rem;
    color: #666;
}
.li{
  font-style: arial black;
}
.but{
  border:solid 10px blue;
  background-color:blue;
  color:white;
  font-size:20px;
  
}
.bot{
  margin-left: 500px;
}
.b1{
  margin-left: 350px;
  font-size: 20px;
}
.b2{
   font-size: 20px;
}
.b3{
   font-size: 20px;
}

.bo{
  text-align: center;
  font-style: italic;
  font-size: 30px;
}
footer {
    text-align: center;
    padding: 20px;
    background-color: #f4f4f4;
    color: #333;
    border-top: 1px solid #ddd;
}
