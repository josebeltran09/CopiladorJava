// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/LexerColor.flex

import compilerTools.TextColor;
import java.awt.Color;


@SuppressWarnings("fallthrough")
class LexerColor {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\2\0\1\5\1\6\1\0\1\7\1\0\1\10\1\11"+
    "\1\12\1\0\1\13\1\14\1\15\1\16\1\17\11\20"+
    "\1\21\1\22\2\0\1\23\2\0\1\24\1\25\1\26"+
    "\1\24\1\27\7\24\1\30\1\31\1\32\1\33\12\24"+
    "\4\0\1\24\1\0\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\2\24\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\4\24"+
    "\1\57\1\60\1\61\1\62\7\0\1\3\73\0\1\24"+
    "\7\0\1\24\3\0\1\24\3\0\1\24\1\0\1\24"+
    "\6\0\1\24\1\0\1\24\4\0\1\24\7\0\1\24"+
    "\3\0\1\24\3\0\1\24\1\0\1\24\6\0\1\24"+
    "\1\0\1\24\u012b\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\2\1\1\3\4\1\2\4\16\1"+
    "\5\0\1\5\20\1\1\6\2\1\3\0\1\7\2\0"+
    "\2\5\20\1\1\10\1\1\2\0\1\5\16\1\1\6"+
    "\1\0\1\1\1\11\2\1\1\12\6\1\1\13\1\1"+
    "\1\0\6\1\1\14\1\1\1\15\1\10\5\1\1\16"+
    "\33\1\1\17\6\1\1\20\2\1\1\21\3\1\1\16"+
    "\1\1";

  private static int [] zzUnpackAction() {
    int [] result = new int[170];
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
    "\0\0\0\63\0\63\0\146\0\231\0\314\0\63\0\377"+
    "\0\u0132\0\u0165\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264\0\u0297"+
    "\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc\0\u042f"+
    "\0\u0462\0\u0495\0\u04c8\0\u04fb\0\u052e\0\u0561\0\u0594\0\u05c7"+
    "\0\u05fa\0\u062d\0\u0660\0\u0693\0\u06c6\0\u06f9\0\u072c\0\u075f"+
    "\0\u0792\0\u07c5\0\u07f8\0\u082b\0\u085e\0\u0891\0\u08c4\0\u08f7"+
    "\0\u092a\0\u095d\0\u0990\0\u09c3\0\u09f6\0\u0a29\0\u0a5c\0\63"+
    "\0\u0a8f\0\u0ac2\0\63\0\u0af5\0\u0b28\0\u0b5b\0\u0b8e\0\u0bc1"+
    "\0\u0bf4\0\u0c27\0\u0c5a\0\u0c8d\0\u0cc0\0\u0cf3\0\u0d26\0\u0d59"+
    "\0\u0d8c\0\u0dbf\0\u0df2\0\u0e25\0\u0231\0\u0e58\0\u0e8b\0\u0ebe"+
    "\0\u0a8f\0\u0ef1\0\u0f24\0\u0f57\0\u0f8a\0\u0fbd\0\u0ff0\0\u1023"+
    "\0\u1056\0\u1089\0\u10bc\0\u10ef\0\u1122\0\u1155\0\u1188\0\u0231"+
    "\0\u11bb\0\u11ee\0\u0231\0\u1221\0\u1254\0\u0231\0\u1287\0\u12ba"+
    "\0\u12ed\0\u1320\0\u1353\0\u1386\0\u0231\0\u13b9\0\u13ec\0\u141f"+
    "\0\u1452\0\u1485\0\u14b8\0\u14eb\0\u151e\0\u0231\0\u1551\0\63"+
    "\0\u1485\0\u1584\0\u15b7\0\u15ea\0\u161d\0\u1650\0\u1683\0\u16b6"+
    "\0\u16e9\0\u171c\0\u174f\0\u1782\0\u17b5\0\u17e8\0\u181b\0\u184e"+
    "\0\u1881\0\u18b4\0\u18e7\0\u191a\0\u194d\0\u1980\0\u19b3\0\u19e6"+
    "\0\u1a19\0\u1a4c\0\u1a7f\0\u1ab2\0\u1ae5\0\u1b18\0\u1b4b\0\u1b7e"+
    "\0\u1bb1\0\u1be4\0\u0231\0\u1c17\0\u1c4a\0\u1c7d\0\u1cb0\0\u1ce3"+
    "\0\u1d16\0\u0231\0\u1d49\0\u1d7c\0\u0231\0\u1daf\0\u1de2\0\u1e15"+
    "\0\u0231\0\u1e48";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\2\2\1\11\1\12\1\2\1\13\1\14\1\15\3\2"+
    "\10\16\1\17\1\16\1\20\1\21\1\22\1\23\2\16"+
    "\1\24\1\25\1\16\1\26\1\27\1\30\1\16\1\31"+
    "\1\32\1\33\2\16\1\2\1\7\1\2\65\0\1\3"+
    "\77\0\2\34\3\0\34\34\1\0\1\34\25\0\34\16"+
    "\14\0\1\35\73\0\1\36\54\0\1\37\60\0\1\40"+
    "\3\0\1\41\63\0\1\2\1\42\61\0\2\15\61\0"+
    "\2\16\3\0\34\16\22\0\2\16\3\0\13\16\1\43"+
    "\15\16\1\44\2\16\22\0\2\16\3\0\24\16\1\45"+
    "\7\16\22\0\2\16\3\0\14\16\1\46\17\16\22\0"+
    "\2\16\3\0\30\16\1\47\3\16\22\0\2\16\3\0"+
    "\20\16\1\50\6\16\1\51\4\16\22\0\2\16\3\0"+
    "\23\16\1\52\7\16\1\53\22\0\2\16\3\0\10\16"+
    "\1\54\23\16\22\0\2\16\3\0\24\16\1\55\5\16"+
    "\1\56\1\16\22\0\2\16\3\0\14\16\1\22\17\16"+
    "\22\0\2\16\3\0\20\16\1\57\3\16\1\60\7\16"+
    "\22\0\2\16\3\0\14\16\1\61\17\16\22\0\2\16"+
    "\3\0\20\16\1\62\11\16\1\63\1\16\22\0\2\16"+
    "\3\0\24\16\1\64\7\16\22\0\2\65\3\0\34\65"+
    "\1\0\1\65\61\0\1\66\17\0\1\67\70\0\1\70"+
    "\37\0\12\71\1\72\50\71\2\41\1\73\1\41\1\74"+
    "\56\41\17\0\2\42\61\0\2\16\3\0\14\16\1\75"+
    "\17\16\22\0\2\16\3\0\27\16\1\76\4\16\22\0"+
    "\2\16\3\0\21\16\1\77\12\16\22\0\2\16\3\0"+
    "\27\16\1\100\1\16\1\101\2\16\22\0\2\16\3\0"+
    "\31\16\1\102\2\16\22\0\2\16\3\0\23\16\1\103"+
    "\10\16\22\0\2\16\3\0\14\16\1\104\17\16\22\0"+
    "\2\16\3\0\31\16\1\105\2\16\22\0\2\16\3\0"+
    "\26\16\1\106\5\16\22\0\2\16\3\0\23\16\1\107"+
    "\10\16\22\0\2\16\3\0\27\16\1\47\4\16\22\0"+
    "\2\16\3\0\22\16\1\110\11\16\22\0\2\16\3\0"+
    "\23\16\1\111\10\16\22\0\2\16\3\0\23\16\1\112"+
    "\10\16\22\0\2\16\3\0\25\16\1\113\6\16\22\0"+
    "\2\16\3\0\23\16\1\114\10\16\22\0\2\16\3\0"+
    "\27\16\1\115\4\16\22\0\2\16\3\0\22\16\1\116"+
    "\11\16\22\0\2\117\3\0\34\117\1\0\1\117\63\0"+
    "\1\70\21\0\1\70\41\0\12\71\1\120\62\71\1\120"+
    "\3\71\1\121\44\71\2\0\1\73\77\0\2\16\3\0"+
    "\21\16\1\122\12\16\22\0\2\16\3\0\10\16\1\123"+
    "\23\16\22\0\2\16\3\0\24\16\1\124\7\16\22\0"+
    "\2\16\3\0\14\16\1\125\17\16\22\0\2\16\3\0"+
    "\14\16\1\126\17\16\22\0\2\16\3\0\14\16\1\115"+
    "\17\16\22\0\2\16\3\0\10\16\1\127\23\16\22\0"+
    "\2\16\3\0\23\16\1\130\10\16\22\0\2\16\3\0"+
    "\14\16\1\131\17\16\22\0\2\16\3\0\32\16\1\132"+
    "\1\16\22\0\2\16\3\0\33\16\1\133\22\0\2\16"+
    "\3\0\14\16\1\134\17\16\22\0\2\16\3\0\31\16"+
    "\1\135\2\16\22\0\2\16\3\0\14\16\1\136\17\16"+
    "\22\0\2\16\3\0\14\16\1\137\17\16\22\0\2\16"+
    "\3\0\24\16\1\140\7\16\22\0\2\16\3\0\10\16"+
    "\1\136\23\16\22\0\2\141\3\0\34\141\1\0\1\141"+
    "\1\0\12\71\1\120\3\71\1\73\44\71\17\0\2\16"+
    "\3\0\10\16\1\142\23\16\22\0\2\16\3\0\30\16"+
    "\1\115\3\16\22\0\2\16\3\0\27\16\1\143\4\16"+
    "\22\0\2\16\3\0\12\16\1\144\21\16\22\0\2\16"+
    "\3\0\23\16\1\145\10\16\22\0\2\16\3\0\21\16"+
    "\1\146\12\16\22\0\2\16\3\0\31\16\1\147\2\16"+
    "\22\0\2\16\3\0\27\16\1\150\4\16\22\0\2\16"+
    "\3\0\20\16\1\151\13\16\22\0\2\16\3\0\10\16"+
    "\1\152\23\16\22\0\2\16\3\0\27\16\1\153\4\16"+
    "\22\0\2\16\3\0\10\16\1\154\23\16\22\0\2\16"+
    "\3\0\27\16\1\155\4\16\22\0\2\16\3\0\31\16"+
    "\1\156\2\16\22\0\2\157\3\0\34\157\1\0\1\157"+
    "\20\0\2\16\3\0\23\16\1\47\10\16\22\0\2\16"+
    "\3\0\17\16\1\160\14\16\22\0\2\16\3\0\14\16"+
    "\1\161\17\16\22\0\2\16\3\0\14\16\1\162\17\16"+
    "\22\0\2\16\3\0\27\16\1\163\4\16\22\0\2\16"+
    "\3\0\14\16\1\164\17\16\22\0\2\16\3\0\27\16"+
    "\1\165\4\16\22\0\2\16\3\0\24\16\1\143\7\16"+
    "\22\0\2\16\3\0\27\16\1\166\4\16\22\0\2\16"+
    "\3\0\20\16\1\167\13\16\22\0\2\170\3\0\34\170"+
    "\1\0\1\170\20\0\2\16\3\0\10\16\1\171\23\16"+
    "\22\0\2\16\3\0\27\16\1\172\4\16\22\0\2\16"+
    "\3\0\3\16\1\173\30\16\22\0\2\16\3\0\32\16"+
    "\1\174\1\16\22\0\2\16\3\0\27\16\1\175\4\16"+
    "\22\0\2\16\3\0\4\16\1\176\27\16\22\0\2\16"+
    "\3\0\27\16\1\177\4\16\22\0\2\16\3\0\7\16"+
    "\1\200\24\16\22\0\2\16\3\0\30\16\1\201\3\16"+
    "\22\0\2\16\3\0\22\16\1\202\11\16\22\0\2\16"+
    "\3\0\13\16\1\160\20\16\22\0\2\16\3\0\24\16"+
    "\1\203\7\16\22\0\2\16\3\0\4\16\1\204\27\16"+
    "\22\0\2\16\3\0\20\16\1\205\13\16\22\0\2\16"+
    "\3\0\1\16\1\206\1\207\2\16\1\210\1\211\25\16"+
    "\22\0\2\16\3\0\25\16\1\212\6\16\22\0\2\16"+
    "\3\0\23\16\1\213\10\16\22\0\2\16\3\0\20\16"+
    "\1\214\13\16\22\0\2\16\3\0\23\16\1\215\10\16"+
    "\22\0\2\16\3\0\10\16\1\216\10\16\1\217\12\16"+
    "\22\0\2\16\3\0\21\16\1\220\12\16\22\0\2\16"+
    "\3\0\14\16\1\221\17\16\22\0\2\16\3\0\11\16"+
    "\1\222\22\16\22\0\2\16\3\0\20\16\1\223\13\16"+
    "\22\0\2\16\3\0\14\16\1\224\17\16\22\0\2\16"+
    "\3\0\14\16\1\225\17\16\22\0\2\16\3\0\31\16"+
    "\1\226\2\16\22\0\2\16\3\0\21\16\1\227\12\16"+
    "\22\0\2\16\3\0\10\16\1\230\23\16\22\0\2\16"+
    "\3\0\10\16\1\231\23\16\22\0\2\16\3\0\16\16"+
    "\1\231\15\16\22\0\2\16\3\0\30\16\1\232\3\16"+
    "\22\0\2\16\3\0\27\16\1\233\4\16\22\0\2\16"+
    "\3\0\13\16\1\234\20\16\22\0\2\16\3\0\23\16"+
    "\1\235\10\16\22\0\2\16\3\0\10\16\1\223\23\16"+
    "\22\0\2\16\3\0\20\16\1\236\13\16\22\0\2\16"+
    "\3\0\23\16\1\237\10\16\22\0\2\16\3\0\27\16"+
    "\1\240\4\16\22\0\2\16\3\0\31\16\1\241\2\16"+
    "\22\0\2\16\3\0\10\16\1\242\23\16\22\0\2\16"+
    "\3\0\31\16\1\243\2\16\22\0\2\16\3\0\33\16"+
    "\1\244\22\0\2\16\3\0\12\16\1\240\21\16\22\0"+
    "\2\16\3\0\24\16\1\245\7\16\22\0\2\16\3\0"+
    "\10\16\1\246\23\16\22\0\2\16\3\0\27\16\1\247"+
    "\4\16\22\0\2\16\3\0\10\16\1\245\23\16\22\0"+
    "\2\16\3\0\12\16\1\250\21\16\22\0\2\16\3\0"+
    "\10\16\1\251\23\16\22\0\2\16\3\0\32\16\1\252"+
    "\1\16\22\0\2\16\3\0\21\16\1\240\12\16\3\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[7803];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\1\11\24\1\5\0\24\1\3\0"+
    "\1\11\2\0\1\11\23\1\2\0\20\1\1\0\15\1"+
    "\1\0\10\1\1\11\62\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[170];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private TextColor textColor(long start, int size, Color color){
        return new TextColor((int) start, size, color);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerColor(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public TextColor yylex() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { /* Ignorar */
            }
          // fall through
          case 18: break;
          case 2:
            { /*Ignorar*/
            }
          // fall through
          case 19: break;
          case 3:
            { return textColor(yychar, yylength(), new Color(48, 63, 159));
            }
          // fall through
          case 20: break;
          case 4:
            { return textColor(yychar, yylength(), new Color(35, 120, 147));
            }
          // fall through
          case 21: break;
          case 5:
            { return textColor(yychar, yylength(), new Color(146, 146, 146));
            }
          // fall through
          case 22: break;
          case 6:
            { return textColor(yychar, yylength(), new Color(48, 62, 129));
            }
          // fall through
          case 23: break;
          case 7:
            { return textColor(yychar, yylength(), new Color(169, 155, 179));
            }
          // fall through
          case 24: break;
          case 8:
            { return textColor(yychar, yylength(), new Color(17, 94, 153));
            }
          // fall through
          case 25: break;
          case 9:
            { return textColor(yychar, yylength(), new Color(148, 58, 173));
            }
          // fall through
          case 26: break;
          case 10:
            { return textColor(yychar, yylength(), new Color(198, 40, 40));
            }
          // fall through
          case 27: break;
          case 11:
            { return textColor(yychar, yylength(), new Color(102, 41, 120));
            }
          // fall through
          case 28: break;
          case 12:
            { return textColor(yychar, yylength(), new Color(212, 129, 06));
            }
          // fall through
          case 29: break;
          case 13:
            { return textColor(yychar, yylength(), new Color(224, 195, 12));
            }
          // fall through
          case 30: break;
          case 14:
            { return textColor(yychar, yylength(), new Color(121, 107, 255));
            }
          // fall through
          case 31: break;
          case 15:
            { return textColor(yychar, yylength(), new Color(255, 64, 129));
            }
          // fall through
          case 32: break;
          case 16:
            { return textColor(yychar, yylength(), new Color(239, 108, 0));
            }
          // fall through
          case 33: break;
          case 17:
            { return textColor(yychar, yylength(), new Color(150, 0, 80));
            }
          // fall through
          case 34: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
