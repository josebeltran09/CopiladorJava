import compilerTools.Token;

%%
%class Lexer
%type Token
%line
%column
%{
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }
%}
/* Variables básicas de comentarios y espacios */
TerminadorDeLinea = \r|\n|\r\n
EntradaDeCaracter = [^\r\n]
EspacioEnBlanco = {TerminadorDeLinea} | [ \t\f]
ComentarioTradicional = "/*" [^*] ~"*/" | "/*" "*"+ "/"
FinDeLineaComentario = "//" {EntradaDeCaracter}* {TerminadorDeLinea}?
ContenidoComentario = ( [^*] | \*+ [^/*] )*
ComentarioDeDocumentacion = "/**" {ContenidoComentario} "*"+ "/"

/* Comentario */
Comentario = {ComentarioTradicional} | {FinDeLineaComentario} | {ComentarioDeDocumentacion}

/* Identificador */
Letra = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
Digito = [0-9]
Identificador = {Letra}({Letra}|{Digito})*

/* Número */
Numero = 0 | [1-9][0-9]*
%%

/* Comentarios o espacios en blanco */
{Comentario}|{EspacioEnBlanco} { /*Ignorar*/ }

/* Identificador */
\$ {Identificador} {return token(yytext(), "Identificador", yyline, yycolumn);}

/* Tipos de datos */
numero |
color {return token(yytext(), "TIPO_DATO", yyline, yycolumn);}

/* Numero */
{Numero} {return token(yytext(), "NUMERO", yyline, yycolumn);}

/* Colores */
#[{Letra}|{Digito}] {6} { return token(yytext(), "COLOR", yyline, yycolumn);}

/* Operadores de agrupacion */
"(" {return token(yytext(), "PARENTESIS_A", yyline, yycolumn);}
")" {return token(yytext(), "PARENTESIS_B", yyline, yycolumn);}
"{" {return token(yytext(), "LLAVE_A", yyline, yycolumn);}
"}" {return token(yytext(), "LLAVE_C", yyline, yycolumn);}

/* Signos de puntuacion */
"," {return token(yytext(), "COMA", yyline, yycolumn);}
";" {return token(yytext(), "PUNTO_COMA", yyline, yycolumn);}
"." {return token(yytext(), "PUNTO", yyline, yycolumn);}
":" {return token(yytext(), "DOS_PUNTOS", yyline, yycolumn);}

/* Operador de asignacion */
--> {return token(yytext(), "OP_ASIG", yyline, yycolumn);}

/* Movimiento */
adelante |
atras |
izquierda |
derecha |
norte |
sur |
este |
oeste {return token(yytext(), "MOVIMIENTO", yyline, yycolumn);}

/* Pintar */
pintar {return token(yytext(), "PINTAR", yyline, yycolumn);}

/* Detener Pintar */
detenerPintar {return token(yytext(), "DETENER_PINTAR", yyline, yycolumn);}

/* Tomar */
tomar |
poner {return token(yytext(), "TOMAR", yyline, yycolumn);}

/* Lanzar Moneda */
lanzarMoneda {return token(yytext(), "LANZAR_MONEDA", yyline, yycolumn);}

/* ver */
izquierdaEsObstaculo |
izquierdaEsClaro |
izquierdaEsBaliza |
izquierdaEsBlanco | 
izquierdaEsNegro |
frenteEsObstaculo |
frenteEsClaro |
frenteEsBaliza |
frenteEsBlanco |
frenteEsNegro |
derechaEsObstaculo |
derechaEsClaro |
derechaEsBaliza |
derechaEsBlanco |
derechaEsNegro {return token(yytext(), "VER", yyline, yycolumn);}

/* Repetir */
repetir |
repetirMientra {return token(yytext(), "REPETIR", yyline, yycolumn);}

/* Detener Repetir */
interrumpir {return token(yytext(), "DETERNER_REPETIR", yyline, yycolumn);}

/* Estructura si */
si |
sino {return token(yytext(), "ESTRUCTURA_SI", yyline, yycolumn);}

/* Operadores logicos */
"&" |
"|" {return token(yytext(), "OP_LOGICO", yyline, yycolumn);} 

/* Final */
final {return token(yytext(), "FINAL", yyline, yycolumn);}

//Numero erroneo
0{Numero} {return token(yytext(), "ERROR_1", yyline, yycolumn);}
//Identificador erroneo
{Identificador} {return token(yytext(), "ERROR_2", yyline, yycolumn);}

. { return token(yytext(), "ERROR", yyline, yycolumn); }