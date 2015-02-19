/*
 * analyseur lexical du langage exemple-expr:
 * (voir support de cours CUP)
 *
 * auteur : azim.roussanaly@univ-lorraine.fr
 * (c) 2015
 */

package fr.ul.miage.exemple.generated;
import java_cup.runtime.Symbol;

%%

/* options */
%line
%public
%cupsym ParserSym
%cup

/* macros */
SEP     =   [ \t]
NUM     =   [0-9]+

%%

/* regles */

"- -"         { return new Symbol(ParserSym.ADD);}
"*"         { return new Symbol(ParserSym.MUL);}
"("         { return new Symbol(ParserSym.PO);}
")"         { return new Symbol(ParserSym.PF);}
{NUM}       { return new Symbol(ParserSym.NUM);}

{SEP}       { ; }
"\r"		{ return new Symbol(ParserSym.EOF);}


/* regles pour la date */
"Jan"		{ return new Symbol(ParserSym.JAN);}
"Feb"		{ return new Symbol(ParserSym.FEV);}
"Mar"		{ return new Symbol(ParserSym.MAR);}
"Apr"		{ return new Symbol(ParserSym.AVR);}
"May"		{ return new Symbol(ParserSym.MAI);}
"Jun"		{ return new Symbol(ParserSym.JUIN);}
"Jul"		{ return new Symbol(ParserSym.JUIL);}
"Aug"		{ return new Symbol(ParserSym.AOU);}
"Sep"		{ return new Symbol(ParserSym.SEP);}
"Oct"		{ return new Symbol(ParserSym.OCT);}
"Nov"		{ return new Symbol(ParserSym.NOV);}
"Dec"		{ return new Symbol(ParserSym.DEC);}
":"         { return new Symbol(ParserSym.DP);}
"/"         { return new Symbol(ParserSym.SL);}
"["         { return new Symbol(ParserSym.CO);}
"]"         { return new Symbol(ParserSym.CF);}
{DECAL}     { return new Symbol(ParserSym.DECAL,new Integer(yytext()));}
{NUM}       { return new Symbol(ParserSym.NUM, new Integer(yytext()));}
{SEP}       { ; }
{FIN}		{ return new Symbol(ParserSym.EOF);}
.			{ return null;}


