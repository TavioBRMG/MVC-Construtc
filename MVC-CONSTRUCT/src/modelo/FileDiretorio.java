package modelo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDiretorio {

 public int i, J1 = 0, B1 = 0, A1 = 0, F1 = 0, XA = 0;
 private String nome;


 public void getNome(String nome) {
  this.nome = nome;
 }

 public String setNome() {
  return nome;
 }

 public void exec() throws IOException {

  File d[] = new File[9];
  if (XA == 1) {
   d[0] = new File("C:/xampp/htdocs/", setNome());
  } else {
   d[0] = new File(setNome());
  }
  d[1] = new File(d[0], "project");
  d[2] = new File(d[1], "model");
  d[3] = new File(d[1], "view");
  d[4] = new File(d[1], "controller");
  d[5] = new File(d[2], "bds");
  d[6] = new File(d[2], "css");
  d[7] = new File(d[2], "js");
  d[8] = new File(d[2], "img");

  for (i = 0; i < 9; i++) {
   d[i].mkdir();
  }

  String p = "index.php";
  File a[] = new File[12];
  a[0] = new File(d[0], p);
  a[1] = new File(d[1], p);
  a[2] = new File(d[2], p);
  a[3] = new File(d[3], p);
  a[4] = new File(d[4], p);
  a[5] = new File(d[5], p);
  a[6] = new File(d[6], p);
  a[7] = new File(d[7], p);
  a[8] = new File(d[8], p);
  a[9] = new File(d[5], "conexao.php");
  a[10] = new File(d[5], "cod_bds.txt");
  a[11] = new File(d[6], "style.css");


  String t[] = new String[12];
  String url[] = new String[2];
  url[0] = "<?php\n header('Location: ";
	url[1] = "');\n?>";

  t[0] = (url[0] + "project/view/index.php" + url[1]);
  t[1] = (url[0] + "view/index.php" + url[1]);
  t[2] = (url[0] + "../view/index.php" + url[1]);
  t[4] = (url[0] + "../view/index.php" + url[1]);
  t[5] = (url[0] + "../../view/index.php" + url[1]);
  t[6] = (url[0] + "../../view/index.php" + url[1]);
  t[7] = (url[0] + "../../view/index.php" + url[1]);
  t[8] = (url[0] + "../../view/index.php" + url[1]);

  t[3] = ("<html lang='pt-br'>\n<head>\n");
  t[3] += (" <meta charset='utf-8'>\n ");
  t[3] += ("<link rel='stylesheet' href='../model/css/style.css' type='text/css' media='screen'>\n");

  //index

  if (J1 == 1 && B1 == 0) {
   t[3] += " <script src='http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js'></script>\n";
  }

  if (A1 == 1) {
   t[3] += (" <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css'>\n");
  }
  if (F1 == 1) {
   t[3] += (" <script src='https://kit.fontawesome.com/43222aca40.js' crossorigin='anonymous'></script>\n");
  }

  if (B1 == 1) {
   t[3] += (" <link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'");
   t[3] += ("integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anonymous'>\n");
   t[3] += (" <title> " + setNome() + " </title>\n");
   t[3] += ("</head>\n <body>\n\n\n\n\n\n");
   t[3] += (" <!--Script-->\n <script src='https://code.jquery.com/jquery-3.3.1.slim.min.js' integrity='sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo' crossorigin='anonymous'></script>\n");
   t[3] += (" <script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js' integrity='sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1' crossorigin='anonymous'></script>\n");
   t[3] += (" <script src='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js' integrity='sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM' crossorigin='anonymous'></script>\n");
  }

  if (B1 != 1) {
   t[3] += (" <title> " + setNome() + " </title>\n");
  }
  if (B1 != 1) {
   t[3] += ("</head>\n <body>\n\n\n ");
  }
  t[3] += (" </body>\n</html>\n");

  // fim index

  t[9] = ("<?php\n$dbname = '';\n  $host = 'localhost';\n   $user = 'root';\n  $password = '';\n");
	t[9] +=  (" $con = mysqli_connect(''.$host.'',''.$user.'',''.$password.'',''.$dbname.'');\n?>");

  t[10] = ("Deixe o codigo do banco de dados aqui para\nexecutar em qualquer Sistema Operacional.");

  t[11] = ("/* - - - - - Configuração Padrão - - - - -*/\n \n body{\n   background-image:url('this');");
  t[11] += ("\n   background-attachment: fixed;\n   background-size: 100%;\n   background-repeat: no-repeat;");
  t[11] += ("\n   background-color: #fff;\n   font-family: Arial;\n }\n \n *{\n");
  t[11] += ("   margin: 0;\n   padding: 0;\n   box-sizing: 0;\n   border: 0;\n }\n");



  for (i = 0; i < 12; i++) {
   FileWriter writer = new FileWriter(a[i]);
   BufferedWriter txt = new BufferedWriter(writer);
   txt.write(t[i]);

   txt.close();
   writer.close();
  }

  for (i = 0; i < 12; i++) {
   a[i].createNewFile();
  }
 }
}