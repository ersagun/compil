/* The following code was generated by JFlex 1.4.3 on 27/02/15 00:25 */

/* auteur : ersagun.yalcintepe@etu.univ-lorraine.fr - julien.remy@etu.univ-lorraine.fr */
/* (c) 2015 */


package fr.ul.miage.exemple.generated;
import java_cup.runtime.Symbol;
import java.lang.StringBuffer;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 27/02/15 00:25 from the specification file
 * <tt>C:/Users/Ersagun/Desktop/Miage/Git/Compilation/analyse-log/src/Scanner.lex</tt>
 */
public class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\6\2\0\1\10\22\0\1\2\1\0\1\12\10\0"+
    "\1\3\1\0\1\4\1\11\1\42\12\5\1\41\6\0\1\23\2\0"+
    "\1\40\1\0\1\16\3\0\1\13\2\0\1\21\1\35\1\32\3\0"+
    "\1\31\7\0\1\43\1\0\1\44\3\0\1\14\1\20\1\33\1\0"+
    "\1\17\1\0\1\30\4\0\1\27\1\0\1\15\1\36\1\24\1\0"+
    "\1\22\1\0\1\34\1\26\1\37\2\0\1\25\2\0\1\7\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\1\1\3\1\0\1\4\11\1"+
    "\1\5\1\6\1\7\1\10\1\0\1\11\1\3\3\0"+
    "\1\12\13\0\1\3\2\0\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\0\1\3\2\0\1\27\1\30\5\0\3\31";

  private static int [] zzUnpackAction() {
    int [] result = new int[68];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\45\0\45\0\112\0\157\0\224\0\271\0\45"+
    "\0\336\0\u0103\0\u0128\0\u014d\0\u0172\0\u0197\0\u01bc\0\u01e1"+
    "\0\u0206\0\45\0\45\0\45\0\45\0\u022b\0\157\0\u0250"+
    "\0\u0275\0\u029a\0\336\0\336\0\u02bf\0\u02e4\0\u0309\0\u032e"+
    "\0\u0353\0\u0378\0\u039d\0\u03c2\0\u03e7\0\u040c\0\u0431\0\u0456"+
    "\0\u047b\0\u04a0\0\45\0\45\0\45\0\45\0\45\0\45"+
    "\0\45\0\45\0\45\0\45\0\45\0\45\0\u04c5\0\u04ea"+
    "\0\u050f\0\u0534\0\45\0\45\0\u0559\0\u057e\0\u05a3\0\u05c8"+
    "\0\u05ed\0\u0612\0\u0637\0\45";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[68];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\2\5\1\6\1\7\1\2\1\10"+
    "\1\2\1\11\1\12\2\2\1\13\2\2\1\14\1\2"+
    "\1\15\5\2\1\16\1\17\2\2\1\20\2\2\1\21"+
    "\1\22\1\23\1\24\1\25\51\0\1\26\45\0\1\27"+
    "\44\0\1\30\3\0\1\31\42\0\1\32\35\0\6\33"+
    "\1\0\3\33\1\34\32\33\14\0\1\35\11\0\1\36"+
    "\35\0\1\37\41\0\1\40\54\0\1\41\1\0\1\42"+
    "\35\0\1\43\60\0\1\44\47\0\1\45\25\0\1\46"+
    "\27\0\1\47\47\0\1\50\3\0\1\31\40\0\1\51"+
    "\47\0\1\52\51\0\1\53\44\0\1\54\11\0\1\55"+
    "\35\0\1\56\46\0\1\57\2\0\1\60\41\0\1\61"+
    "\52\0\1\62\40\0\1\63\54\0\1\64\47\0\1\65"+
    "\40\0\1\66\15\0\1\67\45\0\1\70\3\0\1\31"+
    "\40\0\1\71\3\0\1\72\41\0\1\73\40\0\1\74"+
    "\47\0\1\70\44\0\1\75\3\0\1\72\40\0\1\76"+
    "\50\0\1\72\40\0\1\77\3\0\1\100\40\0\1\101"+
    "\3\0\1\100\40\0\1\102\50\0\1\100\40\0\1\103"+
    "\44\0\1\104\37\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1628];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\1\0\1\11\11\1\4\11\1\0"+
    "\2\1\3\0\1\1\13\0\1\1\2\0\14\11\1\0"+
    "\1\1\2\0\2\11\5\0\2\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[68];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 120) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 20: 
          { System.out.print(yytext());return new Symbol(ParserSym.OCT);
          }
        case 26: break;
        case 17: 
          { System.out.print(yytext());return new Symbol(ParserSym.AVR);
          }
        case 27: break;
        case 22: 
          { System.out.print(yytext());return new Symbol(ParserSym.DEC);
          }
        case 28: break;
        case 1: 
          { return null;
          }
        case 29: break;
        case 3: 
          { System.out.print(yytext());return new Symbol(ParserSym.NUM);
          }
        case 30: break;
        case 21: 
          { System.out.print(yytext());return new Symbol(ParserSym.NOV);
          }
        case 31: break;
        case 11: 
          { System.out.print(yytext());return new Symbol(ParserSym.JAN);
          }
        case 32: break;
        case 15: 
          { System.out.print(yytext());return new Symbol(ParserSym.MAR);
          }
        case 33: break;
        case 13: 
          { System.out.print(yytext());return new Symbol(ParserSym.JUIL);
          }
        case 34: break;
        case 5: 
          { System.out.print(yytext());return new Symbol(ParserSym.DP);
          }
        case 35: break;
        case 16: 
          { System.out.print(yytext());return new Symbol(ParserSym.MAI);
          }
        case 36: break;
        case 6: 
          { System.out.print(yytext());return new Symbol(ParserSym.SL);
          }
        case 37: break;
        case 9: 
          { System.out.print(yytext());return new Symbol(ParserSym.DECAL,new Integer(yytext()));
          }
        case 38: break;
        case 12: 
          { System.out.print(yytext());return new Symbol(ParserSym.JUIN);
          }
        case 39: break;
        case 19: 
          { System.out.print(yytext());return new Symbol(ParserSym.SEP);
          }
        case 40: break;
        case 7: 
          { System.out.print(yytext());return new Symbol(ParserSym.CO);
          }
        case 41: break;
        case 25: 
          { System.out.print(yytext());return new Symbol(ParserSym.IP, new String(yytext()));
          }
        case 42: break;
        case 8: 
          { System.out.print(yytext());return new Symbol(ParserSym.CF);
          }
        case 43: break;
        case 18: 
          { System.out.print(yytext());return new Symbol(ParserSym.AOU);
          }
        case 44: break;
        case 2: 
          { ;
          }
        case 45: break;
        case 24: 
          { System.out.print(yytext());return new Symbol(ParserSym.TIRET);
          }
        case 46: break;
        case 10: 
          { System.out.print(yytext());return new Symbol(ParserSym.ACTION);
          }
        case 47: break;
        case 23: 
          { return new Symbol(ParserSym.EOF);
          }
        case 48: break;
        case 14: 
          { System.out.print(yytext());return new Symbol(ParserSym.FEV);
          }
        case 49: break;
        case 4: 
          { System.out.print(yytext());return new Symbol(ParserSym.EOF);
          }
        case 50: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(ParserSym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
