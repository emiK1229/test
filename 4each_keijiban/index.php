<!DOCTYPE HTML>
<html lang="ja">

<head>
  <meta charset="UTF-8">
  <title>4eachblog 掲示板</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>
<?php
  
  mb_internal_encoding("utf8");
  $pdo = new PDO("mysql:dbname=kitamura01;host=localhost;","root","mysql");
  $stmt = $pdo->query("select * from 4each_keijiban");
 
  ?>
  
   
  
<header>
<img src="4eachblog_logo.jpg">
<ul class="menu">
 <li>トップ</li>
 <li>プロフィール</li>
 <li>4eachについて</li>
 <li>登録フォーム</li>
 <li>問い合わせ</li>
 <li>その他</li>
</ul>
</header>   

<main>
<div class="main-container">
<div class="left">
  
 <h1>プログラミングに役立つ書籍</h1>
   
   <form method="post" action="insert.php">
     <div>
     <label class="teme">入力フォーム</label>
     </div>
    <div>
      <label>ハンドルネーム</label>
      <br>
      <input type="text" class="text" size="35" name="handlename">
     </div>
    <div>
      <label>タイトル</label>
      <br>
      <input type="text" class="text" size="35" name="title">
    </div>
    <div>
      <label>コメント</label>
      <br>
      <textarea cols="35" rows="7" name="comments"></textarea>
    </div>
     
    <div>
     <input type="submit" class="submit" value="投稿する" >
    </div> 
  </form>
   <br>
  
  
  <?php
     
  while($row = $stmt->fetch()){
   
   echo "<div class='kiji'>";
   echo "<h3>".$row ['title']."</h3>";
   echo "<div class='contents'>";
   echo $row['comments'];
   echo "<div class='handlename'>posted by".$row['handlename']."</div>";
   echo "</div>";
   echo "</div>";

  }
  ?>

 
 </div>     
   
   
  
   
  
<div class="right">
<h2>人気の記事</h2>   
    <ul class="menu2">
    <li>PHP　オススメ本</li>
    <li>PHP MyAdminの使い方</li>
    <li>今人気のエディタ　Top5</li>
    <li>HTMLの基礎</li>
    </ul>
<h2>オススメリンク</h2>
    <ul class="menu3">
    <li>インターノウス株式会社</li>
    <li>XAMPPのダウンロード</li>
    <li>Eclipseのダウンロード</li>
    <li>Bracketsのダウンロード</li>
    </ul>
<h2>カテゴリ</h2>
    <ul class="menu4">
    <li>HTML</li>
    <li>PHP</li>
    <li>MySQL</li>
    <li>JavaScript</li>
    </ul>    
 </div>

 </div>
 </main>
    
    
<footer>
Copyright © internous | 4each blog is the one which provides A to Z about programming.
</footer>





</body>
</html>