// Generated from Solidity.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, NatSpecSingleLine=94, 
		NatSpecMultiLine=95, Int=96, Uint=97, Byte=98, Fixed=99, Ufixed=100, BooleanLiteral=101, 
		DecimalNumber=102, HexNumber=103, NumberUnit=104, HexLiteral=105, ReservedKeyword=106, 
		AnonymousKeyword=107, BreakKeyword=108, ConstantKeyword=109, ContinueKeyword=110, 
		LeaveKeyword=111, ExternalKeyword=112, IndexedKeyword=113, InternalKeyword=114, 
		PayableKeyword=115, PrivateKeyword=116, PublicKeyword=117, PureKeyword=118, 
		TypeKeyword=119, ViewKeyword=120, Identifier=121, StringLiteral=122, WS=123, 
		COMMENT=124, LINE_COMMENT=125;
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_pragmaName = 2, RULE_importDeclaration = 3, 
		RULE_importDirective = 4, RULE_natSpec = 5, RULE_contractDefinition = 6, 
		RULE_inheritanceSpecifier = 7, RULE_contractPart = 8, RULE_stateVariableDeclaration = 9, 
		RULE_usingForDeclaration = 10, RULE_structDefinition = 11, RULE_constructorDefinition = 12, 
		RULE_modifierDefinition = 13, RULE_modifierInvocation = 14, RULE_functionDefinition = 15, 
		RULE_returnParameters = 16, RULE_modifierList = 17, RULE_eventDefinition = 18, 
		RULE_enumValue = 19, RULE_enumDefinition = 20, RULE_parameterList = 21, 
		RULE_parameter = 22, RULE_eventParameterList = 23, RULE_eventParameter = 24, 
		RULE_functionTypeParameterList = 25, RULE_functionTypeParameter = 26, 
		RULE_variableDeclaration = 27, RULE_typeName = 28, RULE_userDefinedTypeName = 29, 
		RULE_mapping = 30, RULE_functionTypeName = 31, RULE_storageLocation = 32, 
		RULE_stateMutability = 33, RULE_block = 34, RULE_statement = 35, RULE_expressionStatement = 36, 
		RULE_ifStatement = 37, RULE_tryStatement = 38, RULE_catchClause = 39, 
		RULE_whileStatement = 40, RULE_simpleStatement = 41, RULE_forStatement = 42, 
		RULE_inlineAssemblyStatement = 43, RULE_doWhileStatement = 44, RULE_continueStatement = 45, 
		RULE_breakStatement = 46, RULE_returnStatement = 47, RULE_throwStatement = 48, 
		RULE_emitStatement = 49, RULE_variableDeclarationStatement = 50, RULE_variableDeclarationList = 51, 
		RULE_identifierList = 52, RULE_elementaryTypeName = 53, RULE_expression = 54, 
		RULE_primaryExpression = 55, RULE_expressionList = 56, RULE_newExpression = 57, 
		RULE_memberAccess = 58, RULE_nameValueList = 59, RULE_nameValue = 60, 
		RULE_functionCallArguments = 61, RULE_functionCall = 62, RULE_assemblyBlock = 63, 
		RULE_assemblyItem = 64, RULE_assemblyExpression = 65, RULE_assemblyCall = 66, 
		RULE_assemblyLocalDefinition = 67, RULE_assemblyAssignment = 68, RULE_assemblyIdentifierOrList = 69, 
		RULE_assemblyIdentifierList = 70, RULE_assemblyStackAssignment = 71, RULE_labelDefinition = 72, 
		RULE_assemblySwitch = 73, RULE_assemblyCase = 74, RULE_assemblyFunctionDefinition = 75, 
		RULE_assemblyFunctionReturns = 76, RULE_assemblyFor = 77, RULE_assemblyIf = 78, 
		RULE_assemblyLiteral = 79, RULE_subAssembly = 80, RULE_tupleExpression = 81, 
		RULE_typeNameExpression = 82, RULE_numberLiteral = 83, RULE_identifier = 84, 
		RULE_overrideSpecifier = 85;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragmaDirective", "pragmaName", "importDeclaration", "importDirective", 
			"natSpec", "contractDefinition", "inheritanceSpecifier", "contractPart", 
			"stateVariableDeclaration", "usingForDeclaration", "structDefinition", 
			"constructorDefinition", "modifierDefinition", "modifierInvocation", 
			"functionDefinition", "returnParameters", "modifierList", "eventDefinition", 
			"enumValue", "enumDefinition", "parameterList", "parameter", "eventParameterList", 
			"eventParameter", "functionTypeParameterList", "functionTypeParameter", 
			"variableDeclaration", "typeName", "userDefinedTypeName", "mapping", 
			"functionTypeName", "storageLocation", "stateMutability", "block", "statement", 
			"expressionStatement", "ifStatement", "tryStatement", "catchClause", 
			"whileStatement", "simpleStatement", "forStatement", "inlineAssemblyStatement", 
			"doWhileStatement", "continueStatement", "breakStatement", "returnStatement", 
			"throwStatement", "emitStatement", "variableDeclarationStatement", "variableDeclarationList", 
			"identifierList", "elementaryTypeName", "expression", "primaryExpression", 
			"expressionList", "newExpression", "memberAccess", "nameValueList", "nameValue", 
			"functionCallArguments", "functionCall", "assemblyBlock", "assemblyItem", 
			"assemblyExpression", "assemblyCall", "assemblyLocalDefinition", "assemblyAssignment", 
			"assemblyIdentifierOrList", "assemblyIdentifierList", "assemblyStackAssignment", 
			"labelDefinition", "assemblySwitch", "assemblyCase", "assemblyFunctionDefinition", 
			"assemblyFunctionReturns", "assemblyFor", "assemblyIf", "assemblyLiteral", 
			"subAssembly", "tupleExpression", "typeNameExpression", "numberLiteral", 
			"identifier", "overrideSpecifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pragma'", "';'", "'as'", "'import'", "'*'", "'from'", "'{'", 
			"','", "'}'", "'contract'", "'interface'", "'library'", "'is'", "'('", 
			"')'", "'='", "'using'", "'for'", "'struct'", "'constructor'", "'modifier'", 
			"'function'", "'returns'", "'event'", "'enum'", "'['", "']'", "'address'", 
			"'.'", "'mapping'", "'=>'", "'memory'", "'storage'", "'calldata'", "'if'", 
			"'else'", "'try'", "'catch'", "'while'", "'assembly'", "'do'", "'return'", 
			"'throw'", "'emit'", "'var'", "'bool'", "'string'", "'byte'", "'++'", 
			"'--'", "':'", "'+'", "'-'", "'after'", "'delete'", "'!'", "'~'", "'**'", 
			"'/'", "'%'", "'<<'", "'>>'", "'&'", "'^'", "'|'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'&&'", "'||'", "'?'", "'|='", "'^='", "'&='", 
			"'<<='", "'>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'new'", "'let'", 
			"':='", "'=:'", "'switch'", "'case'", "'default'", "'->'", "'override'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'anonymous'", "'break'", "'constant'", "'continue'", "'leave'", 
			"'external'", "'indexed'", "'internal'", "'payable'", "'private'", "'public'", 
			"'pure'", "'type'", "'view'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "NatSpecSingleLine", 
			"NatSpecMultiLine", "Int", "Uint", "Byte", "Fixed", "Ufixed", "BooleanLiteral", 
			"DecimalNumber", "HexNumber", "NumberUnit", "HexLiteral", "ReservedKeyword", 
			"AnonymousKeyword", "BreakKeyword", "ConstantKeyword", "ContinueKeyword", 
			"LeaveKeyword", "ExternalKeyword", "IndexedKeyword", "InternalKeyword", 
			"PayableKeyword", "PrivateKeyword", "PublicKeyword", "PureKeyword", "TypeKeyword", 
			"ViewKeyword", "Identifier", "StringLiteral", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceUnit(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || _la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(175);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(172);
					pragmaDirective();
					}
					break;
				case T__3:
					{
					setState(173);
					importDirective();
					}
					break;
				case T__9:
				case T__10:
				case T__11:
				case NatSpecSingleLine:
				case NatSpecMultiLine:
					{
					setState(174);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaDirectiveContext extends ParserRuleContext {
		public PragmaNameContext pragmaName() {
			return getRuleContext(PragmaNameContext.class,0);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaDirective(this);
		}
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaDirective);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__0);
			setState(183);
			pragmaName();
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(184);
					matchWildcard();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(190);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public PragmaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaName(this);
		}
	}

	public final PragmaNameContext pragmaName() throws RecognitionException {
		PragmaNameContext _localctx = new PragmaNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			identifier();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(195);
				match(T__2);
				setState(196);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDirectiveContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDirective(this);
		}
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importDirective);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(T__3);
				setState(200);
				match(StringLiteral);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(201);
					match(T__2);
					setState(202);
					identifier();
					}
				}

				setState(205);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(T__3);
				setState(209);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(207);
					match(T__4);
					}
					break;
				case T__5:
				case T__33:
				case Identifier:
					{
					setState(208);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(211);
					match(T__2);
					setState(212);
					identifier();
					}
				}

				setState(215);
				match(T__5);
				setState(216);
				match(StringLiteral);
				setState(217);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(T__3);
				setState(219);
				match(T__6);
				setState(220);
				importDeclaration();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(221);
					match(T__7);
					setState(222);
					importDeclaration();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				match(T__8);
				setState(229);
				match(T__5);
				setState(230);
				match(StringLiteral);
				setState(231);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NatSpecContext extends ParserRuleContext {
		public TerminalNode NatSpecSingleLine() { return getToken(SolidityParser.NatSpecSingleLine, 0); }
		public TerminalNode NatSpecMultiLine() { return getToken(SolidityParser.NatSpecMultiLine, 0); }
		public NatSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNatSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNatSpec(this);
		}
	}

	public final NatSpecContext natSpec() throws RecognitionException {
		NatSpecContext _localctx = new NatSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_natSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==NatSpecSingleLine || _la==NatSpecMultiLine) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<ContractPartContext> contractPart() {
			return getRuleContexts(ContractPartContext.class);
		}
		public ContractPartContext contractPart(int i) {
			return getRuleContext(ContractPartContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractDefinition(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(237);
				natSpec();
				}
			}

			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(241);
			identifier();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(242);
				match(T__12);
				setState(243);
				inheritanceSpecifier();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(244);
					match(T__7);
					setState(245);
					inheritanceSpecifier();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(253);
			match(T__6);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (NatSpecSingleLine - 94)) | (1L << (NatSpecMultiLine - 94)) | (1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (Identifier - 94)))) != 0)) {
				{
				{
				setState(254);
				contractPart();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInheritanceSpecifier(this);
		}
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			userDefinedTypeName();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(263);
				match(T__13);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
					{
					setState(264);
					expressionList();
					}
				}

				setState(267);
				match(T__14);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractPartContext extends ParserRuleContext {
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public ConstructorDefinitionContext constructorDefinition() {
			return getRuleContext(ConstructorDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public ContractPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractPart(this);
		}
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_contractPart);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(277);
				enumDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateVariableDeclaration(this);
		}
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			typeName(0);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (T__92 - 93)) | (1L << (ConstantKeyword - 93)) | (1L << (InternalKeyword - 93)) | (1L << (PrivateKeyword - 93)) | (1L << (PublicKeyword - 93)))) != 0)) {
				{
				setState(286);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PublicKeyword:
					{
					setState(281);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(282);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(283);
					match(PrivateKeyword);
					}
					break;
				case ConstantKeyword:
					{
					setState(284);
					match(ConstantKeyword);
					}
					break;
				case T__92:
					{
					setState(285);
					overrideSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			identifier();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(292);
				match(T__15);
				setState(293);
				expression(0);
				}
			}

			setState(296);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingForDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUsingForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUsingForDeclaration(this);
		}
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__16);
			setState(299);
			identifier();
			setState(300);
			match(T__17);
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(301);
				match(T__4);
				}
				break;
			case T__5:
			case T__21:
			case T__27:
			case T__29:
			case T__33:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(302);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(305);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStructDefinition(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__18);
			setState(308);
			identifier();
			setState(309);
			match(T__6);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(310);
				variableDeclaration();
				setState(311);
				match(T__1);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
					{
					{
					setState(312);
					variableDeclaration();
					setState(313);
					match(T__1);
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(322);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDefinitionContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterConstructorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitConstructorDefinition(this);
		}
	}

	public final ConstructorDefinitionContext constructorDefinition() throws RecognitionException {
		ConstructorDefinitionContext _localctx = new ConstructorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constructorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__19);
			setState(325);
			parameterList();
			setState(326);
			modifierList();
			setState(327);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierDefinition(this);
		}
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__20);
			setState(330);
			identifier();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(331);
				parameterList();
				}
			}

			setState(334);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierInvocation(this);
		}
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			identifier();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(337);
				match(T__13);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
					{
					setState(338);
					expressionList();
					}
				}

				setState(341);
				match(T__14);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(344);
				natSpec();
				}
			}

			setState(347);
			match(T__21);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__33 || _la==Identifier) {
				{
				setState(348);
				identifier();
				}
			}

			setState(351);
			parameterList();
			setState(352);
			modifierList();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(353);
				returnParameters();
				}
			}

			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(356);
				match(T__1);
				}
				break;
			case T__6:
				{
				setState(357);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturnParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnParameters(this);
		}
	}

	public final ReturnParametersContext returnParameters() throws RecognitionException {
		ReturnParametersContext _localctx = new ReturnParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__22);
			setState(361);
			parameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierListContext extends ParserRuleContext {
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierList(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__33 || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ConstantKeyword - 109)) | (1L << (ExternalKeyword - 109)) | (1L << (InternalKeyword - 109)) | (1L << (PayableKeyword - 109)) | (1L << (PrivateKeyword - 109)) | (1L << (PublicKeyword - 109)) | (1L << (PureKeyword - 109)) | (1L << (ViewKeyword - 109)) | (1L << (Identifier - 109)))) != 0)) {
				{
				setState(369);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__33:
				case Identifier:
					{
					setState(363);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(364);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(365);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(366);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(367);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(368);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterListContext eventParameterList() {
			return getRuleContext(EventParameterListContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventDefinition(this);
		}
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(374);
				natSpec();
				}
			}

			setState(377);
			match(T__23);
			setState(378);
			identifier();
			setState(379);
			eventParameterList();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(380);
				match(AnonymousKeyword);
				}
			}

			setState(383);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumValue(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumDefinition(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__24);
			setState(388);
			identifier();
			setState(389);
			match(T__6);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__33 || _la==Identifier) {
				{
				setState(390);
				enumValue();
				}
			}

			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(393);
				match(T__7);
				setState(394);
				enumValue();
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(T__13);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(403);
				parameter();
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(404);
					match(T__7);
					setState(405);
					parameter();
					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(413);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			typeName(0);
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(416);
				storageLocation();
				}
				break;
			}
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__33 || _la==Identifier) {
				{
				setState(419);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterListContext extends ParserRuleContext {
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public EventParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameterList(this);
		}
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__13);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(423);
				eventParameter();
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(424);
					match(T__7);
					setState(425);
					eventParameter();
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(433);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityParser.IndexedKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameter(this);
		}
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			typeName(0);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(436);
				match(IndexedKeyword);
				}
			}

			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__33 || _la==Identifier) {
				{
				setState(439);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeParameterListContext extends ParserRuleContext {
		public List<FunctionTypeParameterContext> functionTypeParameter() {
			return getRuleContexts(FunctionTypeParameterContext.class);
		}
		public FunctionTypeParameterContext functionTypeParameter(int i) {
			return getRuleContext(FunctionTypeParameterContext.class,i);
		}
		public FunctionTypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameterList(this);
		}
	}

	public final FunctionTypeParameterListContext functionTypeParameterList() throws RecognitionException {
		FunctionTypeParameterListContext _localctx = new FunctionTypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(T__13);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(443);
				functionTypeParameter();
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(444);
					match(T__7);
					setState(445);
					functionTypeParameter();
					}
					}
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(453);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public FunctionTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameter(this);
		}
	}

	public final FunctionTypeParameterContext functionTypeParameter() throws RecognitionException {
		FunctionTypeParameterContext _localctx = new FunctionTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			typeName(0);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) {
				{
				setState(456);
				storageLocation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			typeName(0);
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(460);
				storageLocation();
				}
				break;
			}
			setState(463);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(466);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(467);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(468);
				mapping();
				}
				break;
			case 4:
				{
				setState(469);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(470);
				match(T__27);
				setState(471);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(474);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(475);
					match(T__25);
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
						{
						setState(476);
						expression(0);
						}
					}

					setState(479);
					match(T__26);
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UserDefinedTypeNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UserDefinedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUserDefinedTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUserDefinedTypeName(this);
		}
	}

	public final UserDefinedTypeNameContext userDefinedTypeName() throws RecognitionException {
		UserDefinedTypeNameContext _localctx = new UserDefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			identifier();
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(486);
					match(T__28);
					setState(487);
					identifier();
					}
					} 
				}
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMapping(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(T__29);
			setState(494);
			match(T__13);
			setState(495);
			elementaryTypeName();
			setState(496);
			match(T__30);
			setState(497);
			typeName(0);
			setState(498);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public List<FunctionTypeParameterListContext> functionTypeParameterList() {
			return getRuleContexts(FunctionTypeParameterListContext.class);
		}
		public FunctionTypeParameterListContext functionTypeParameterList(int i) {
			return getRuleContext(FunctionTypeParameterListContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeName(this);
		}
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(T__21);
			setState(501);
			functionTypeParameterList();
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(505);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(502);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(503);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(504);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(510);
				match(T__22);
				setState(511);
				functionTypeParameterList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageLocationContext extends ParserRuleContext {
		public StorageLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStorageLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStorageLocation(this);
		}
	}

	public final StorageLocationContext storageLocation() throws RecognitionException {
		StorageLocationContext _localctx = new StorageLocationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateMutability(this);
		}
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_la = _input.LA(1);
			if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ConstantKeyword - 109)) | (1L << (PayableKeyword - 109)) | (1L << (PureKeyword - 109)) | (1L << (ViewKeyword - 109)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(T__6);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__13) | (1L << T__17) | (1L << T__21) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (BreakKeyword - 85)) | (1L << (ContinueKeyword - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
				{
				{
				setState(519);
				statement();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InlineAssemblyStatementContext inlineAssemblyStatement() {
			return getRuleContext(InlineAssemblyStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statement);
		try {
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				ifStatement();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				tryStatement();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				whileStatement();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				forStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				block();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 6);
				{
				setState(532);
				inlineAssemblyStatement();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 7);
				{
				setState(533);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(534);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 9);
				{
				setState(535);
				breakStatement();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 10);
				{
				setState(536);
				returnStatement();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 11);
				{
				setState(537);
				throwStatement();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 12);
				{
				setState(538);
				emitStatement();
				}
				break;
			case T__5:
			case T__13:
			case T__21:
			case T__25:
			case T__27:
			case T__29:
			case T__33:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__84:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 13);
				{
				setState(539);
				simpleStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			expression(0);
			setState(543);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(T__34);
			setState(546);
			match(T__13);
			setState(547);
			expression(0);
			setState(548);
			match(T__14);
			setState(549);
			statement();
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(550);
				match(T__35);
				setState(551);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(T__36);
			setState(555);
			expression(0);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(556);
				match(T__22);
				setState(557);
				parameterList();
				}
			}

			setState(560);
			block();
			setState(562); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(561);
				catchClause();
				}
				}
				setState(564); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__37 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(T__37);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__33 || _la==Identifier) {
				{
				setState(567);
				identifier();
				}
			}

			setState(570);
			parameterList();
			setState(571);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(T__38);
			setState(574);
			match(T__13);
			setState(575);
			expression(0);
			setState(576);
			match(T__14);
			setState(577);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(579);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(580);
				expressionStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(T__17);
			setState(584);
			match(T__13);
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__13:
			case T__21:
			case T__25:
			case T__27:
			case T__29:
			case T__33:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__84:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				{
				setState(585);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(586);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__13:
			case T__25:
			case T__27:
			case T__33:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__84:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				{
				setState(589);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(590);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
				{
				setState(593);
				expression(0);
				}
			}

			setState(596);
			match(T__14);
			setState(597);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineAssemblyStatementContext extends ParserRuleContext {
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInlineAssemblyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInlineAssemblyStatement(this);
		}
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(T__39);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(600);
				match(StringLiteral);
				}
			}

			setState(603);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDoWhileStatement(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(T__40);
			setState(606);
			statement();
			setState(607);
			match(T__38);
			setState(608);
			match(T__13);
			setState(609);
			expression(0);
			setState(610);
			match(T__14);
			setState(611);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(ContinueKeyword);
			setState(614);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(BreakKeyword);
			setState(617);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(T__41);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
				{
				setState(620);
				expression(0);
				}
			}

			setState(623);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(T__42);
			setState(626);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmitStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEmitStatement(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(T__43);
			setState(629);
			functionCall();
			setState(630);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationStatement(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(632);
				match(T__44);
				setState(633);
				identifierList();
				}
				break;
			case 2:
				{
				setState(634);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(635);
				match(T__13);
				setState(636);
				variableDeclarationList();
				setState(637);
				match(T__14);
				}
				break;
			}
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(641);
				match(T__15);
				setState(642);
				expression(0);
				}
			}

			setState(645);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(647);
				variableDeclaration();
				}
			}

			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(650);
				match(T__7);
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
					{
					setState(651);
					variableDeclaration();
					}
				}

				}
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(T__13);
			setState(666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(661);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5 || _la==T__33 || _la==Identifier) {
						{
						setState(660);
						identifier();
						}
					}

					setState(663);
					match(T__7);
					}
					} 
				}
				setState(668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__33 || _la==Identifier) {
				{
				setState(669);
				identifier();
				}
			}

			setState(672);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterElementaryTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitElementaryTypeName(this);
		}
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(677);
				newExpression();
				}
				break;
			case 2:
				{
				setState(678);
				match(T__13);
				setState(679);
				expression(0);
				setState(680);
				match(T__14);
				}
				break;
			case 3:
				{
				setState(682);
				_la = _input.LA(1);
				if ( !(_la==T__48 || _la==T__49) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(683);
				expression(19);
				}
				break;
			case 4:
				{
				setState(684);
				_la = _input.LA(1);
				if ( !(_la==T__51 || _la==T__52) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(685);
				expression(18);
				}
				break;
			case 5:
				{
				setState(686);
				_la = _input.LA(1);
				if ( !(_la==T__53 || _la==T__54) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(687);
				expression(17);
				}
				break;
			case 6:
				{
				setState(688);
				match(T__55);
				setState(689);
				expression(16);
				}
				break;
			case 7:
				{
				setState(690);
				match(T__56);
				setState(691);
				expression(15);
				}
				break;
			case 8:
				{
				setState(692);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(763);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(695);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(696);
						match(T__57);
						setState(697);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(698);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(699);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__58) | (1L << T__59))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(700);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(701);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(702);
						_la = _input.LA(1);
						if ( !(_la==T__51 || _la==T__52) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(703);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(704);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(705);
						_la = _input.LA(1);
						if ( !(_la==T__60 || _la==T__61) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(706);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(707);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(708);
						match(T__62);
						setState(709);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(710);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(711);
						match(T__63);
						setState(712);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(713);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(714);
						match(T__64);
						setState(715);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(716);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(717);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(718);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(719);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(720);
						_la = _input.LA(1);
						if ( !(_la==T__69 || _la==T__70) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(721);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(722);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(723);
						match(T__71);
						setState(724);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(725);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(726);
						match(T__72);
						setState(727);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(728);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(729);
						match(T__73);
						setState(730);
						expression(0);
						setState(731);
						match(T__50);
						setState(732);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(734);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(735);
						_la = _input.LA(1);
						if ( !(_la==T__15 || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T__74 - 75)) | (1L << (T__75 - 75)) | (1L << (T__76 - 75)) | (1L << (T__77 - 75)) | (1L << (T__78 - 75)) | (1L << (T__79 - 75)) | (1L << (T__80 - 75)) | (1L << (T__81 - 75)) | (1L << (T__82 - 75)) | (1L << (T__83 - 75)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(736);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(737);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(738);
						_la = _input.LA(1);
						if ( !(_la==T__48 || _la==T__49) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(739);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(740);
						match(T__25);
						setState(742);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
							{
							setState(741);
							expression(0);
							}
						}

						setState(744);
						match(T__26);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(745);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(746);
						match(T__25);
						setState(748);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
							{
							setState(747);
							expression(0);
							}
						}

						setState(750);
						match(T__50);
						setState(752);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
							{
							setState(751);
							expression(0);
							}
						}

						setState(754);
						match(T__26);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(755);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(756);
						match(T__28);
						setState(757);
						identifier();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(758);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(759);
						match(T__13);
						setState(760);
						functionCallArguments();
						setState(761);
						match(T__14);
						}
						break;
					}
					} 
				}
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TypeNameExpressionContext typeNameExpression() {
			return getRuleContext(TypeNameExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_primaryExpression);
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(770);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(771);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(772);
				identifier();
				setState(775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(773);
					match(T__25);
					setState(774);
					match(T__26);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(777);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(778);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(779);
				typeNameExpression();
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(780);
					match(T__25);
					setState(781);
					match(T__26);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			expression(0);
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(787);
				match(T__7);
				setState(788);
				expression(0);
				}
				}
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNewExpression(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_newExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(T__84);
			setState(795);
			typeName(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberAccessContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMemberAccess(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			expression(0);
			setState(798);
			match(T__28);
			setState(799);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameValueListContext extends ParserRuleContext {
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public NameValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValueList(this);
		}
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			nameValue();
			setState(806);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(802);
					match(T__7);
					setState(803);
					nameValue();
					}
					} 
				}
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(809);
				match(T__7);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValue(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			identifier();
			setState(813);
			match(T__50);
			setState(814);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCallArguments(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_functionCallArguments);
		int _la;
		try {
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				match(T__6);
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5 || _la==T__33 || _la==Identifier) {
					{
					setState(817);
					nameValueList();
					}
				}

				setState(820);
				match(T__8);
				}
				break;
			case T__5:
			case T__13:
			case T__14:
			case T__25:
			case T__27:
			case T__33:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__84:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
					{
					setState(821);
					expressionList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			expression(0);
			setState(827);
			match(T__13);
			setState(828);
			functionCallArguments();
			setState(829);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyBlockContext extends ParserRuleContext {
		public List<AssemblyItemContext> assemblyItem() {
			return getRuleContexts(AssemblyItemContext.class);
		}
		public AssemblyItemContext assemblyItem(int i) {
			return getRuleContext(AssemblyItemContext.class,i);
		}
		public AssemblyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyBlock(this);
		}
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(T__6);
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__13) | (1L << T__17) | (1L << T__21) | (1L << T__27) | (1L << T__33) | (1L << T__34) | (1L << T__39) | (1L << T__41) | (1L << T__47))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (T__85 - 86)) | (1L << (T__87 - 86)) | (1L << (T__88 - 86)) | (1L << (DecimalNumber - 86)) | (1L << (HexNumber - 86)) | (1L << (HexLiteral - 86)) | (1L << (BreakKeyword - 86)) | (1L << (ContinueKeyword - 86)) | (1L << (LeaveKeyword - 86)) | (1L << (Identifier - 86)) | (1L << (StringLiteral - 86)))) != 0)) {
				{
				{
				setState(832);
				assemblyItem();
				}
				}
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(838);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext assemblyLocalDefinition() {
			return getRuleContext(AssemblyLocalDefinitionContext.class,0);
		}
		public AssemblyAssignmentContext assemblyAssignment() {
			return getRuleContext(AssemblyAssignmentContext.class,0);
		}
		public AssemblyStackAssignmentContext assemblyStackAssignment() {
			return getRuleContext(AssemblyStackAssignmentContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AssemblySwitchContext assemblySwitch() {
			return getRuleContext(AssemblySwitchContext.class,0);
		}
		public AssemblyFunctionDefinitionContext assemblyFunctionDefinition() {
			return getRuleContext(AssemblyFunctionDefinitionContext.class,0);
		}
		public AssemblyForContext assemblyFor() {
			return getRuleContext(AssemblyForContext.class,0);
		}
		public AssemblyIfContext assemblyIf() {
			return getRuleContext(AssemblyIfContext.class,0);
		}
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public TerminalNode LeaveKeyword() { return getToken(SolidityParser.LeaveKeyword, 0); }
		public SubAssemblyContext subAssembly() {
			return getRuleContext(SubAssemblyContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyItem(this);
		}
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_assemblyItem);
		try {
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(843);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(844);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(845);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(846);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(847);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(848);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(849);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(850);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(851);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(852);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(853);
				match(LeaveKeyword);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(854);
				subAssembly();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(855);
				numberLiteral();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(856);
				match(StringLiteral);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(857);
				match(HexLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyExpressionContext extends ParserRuleContext {
		public AssemblyCallContext assemblyCall() {
			return getRuleContext(AssemblyCallContext.class,0);
		}
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyExpression(this);
		}
	}

	public final AssemblyExpressionContext assemblyExpression() throws RecognitionException {
		AssemblyExpressionContext _localctx = new AssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_assemblyExpression);
		try {
			setState(862);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__27:
			case T__33:
			case T__41:
			case T__47:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				assemblyLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public AssemblyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCall(this);
		}
	}

	public final AssemblyCallContext assemblyCall() throws RecognitionException {
		AssemblyCallContext _localctx = new AssemblyCallContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				{
				setState(864);
				match(T__41);
				}
				break;
			case T__27:
				{
				setState(865);
				match(T__27);
				}
				break;
			case T__47:
				{
				setState(866);
				match(T__47);
				}
				break;
			case T__5:
			case T__33:
			case Identifier:
				{
				setState(867);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(870);
				match(T__13);
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__27) | (1L << T__33) | (1L << T__41) | (1L << T__47))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (Identifier - 102)) | (1L << (StringLiteral - 102)))) != 0)) {
					{
					setState(871);
					assemblyExpression();
					}
				}

				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(874);
					match(T__7);
					setState(875);
					assemblyExpression();
					}
					}
					setState(880);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(881);
				match(T__14);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyLocalDefinitionContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLocalDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLocalDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLocalDefinition(this);
		}
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(T__85);
			setState(885);
			assemblyIdentifierOrList();
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__86) {
				{
				setState(886);
				match(T__86);
				setState(887);
				assemblyExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyAssignmentContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyAssignment(this);
		}
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			assemblyIdentifierOrList();
			setState(891);
			match(T__86);
			setState(892);
			assemblyExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIdentifierOrListContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyIdentifierOrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierOrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierOrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierOrList(this);
		}
	}

	public final AssemblyIdentifierOrListContext assemblyIdentifierOrList() throws RecognitionException {
		AssemblyIdentifierOrListContext _localctx = new AssemblyIdentifierOrListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assemblyIdentifierOrList);
		try {
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__33:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				identifier();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				match(T__13);
				setState(896);
				assemblyIdentifierList();
				setState(897);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AssemblyIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierList(this);
		}
	}

	public final AssemblyIdentifierListContext assemblyIdentifierList() throws RecognitionException {
		AssemblyIdentifierListContext _localctx = new AssemblyIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			identifier();
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(902);
				match(T__7);
				setState(903);
				identifier();
				}
				}
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyStackAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyStackAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStackAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyStackAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyStackAssignment(this);
		}
	}

	public final AssemblyStackAssignmentContext assemblyStackAssignment() throws RecognitionException {
		AssemblyStackAssignmentContext _localctx = new AssemblyStackAssignmentContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(T__87);
			setState(910);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLabelDefinition(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			identifier();
			setState(913);
			match(T__50);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblySwitchContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public List<AssemblyCaseContext> assemblyCase() {
			return getRuleContexts(AssemblyCaseContext.class);
		}
		public AssemblyCaseContext assemblyCase(int i) {
			return getRuleContext(AssemblyCaseContext.class,i);
		}
		public AssemblySwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblySwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblySwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblySwitch(this);
		}
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(T__88);
			setState(916);
			assemblyExpression();
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__89 || _la==T__90) {
				{
				{
				setState(917);
				assemblyCase();
				}
				}
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyCaseContext extends ParserRuleContext {
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCase(this);
		}
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_assemblyCase);
		try {
			setState(929);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__89:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				match(T__89);
				setState(924);
				assemblyLiteral();
				setState(925);
				assemblyBlock();
				}
				break;
			case T__90:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				match(T__90);
				setState(928);
				assemblyBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyFunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext assemblyFunctionReturns() {
			return getRuleContext(AssemblyFunctionReturnsContext.class,0);
		}
		public AssemblyFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionDefinition(this);
		}
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(T__21);
			setState(932);
			identifier();
			setState(933);
			match(T__13);
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__33 || _la==Identifier) {
				{
				setState(934);
				assemblyIdentifierList();
				}
			}

			setState(937);
			match(T__14);
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__91) {
				{
				setState(938);
				assemblyFunctionReturns();
				}
			}

			setState(941);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyFunctionReturnsContext extends ParserRuleContext {
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionReturns(this);
		}
	}

	public final AssemblyFunctionReturnsContext assemblyFunctionReturns() throws RecognitionException {
		AssemblyFunctionReturnsContext _localctx = new AssemblyFunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(943);
			match(T__91);
			setState(944);
			assemblyIdentifierList();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyForContext extends ParserRuleContext {
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public AssemblyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFor(this);
		}
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(T__17);
			setState(949);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(947);
				assemblyBlock();
				}
				break;
			case T__5:
			case T__27:
			case T__33:
			case T__41:
			case T__47:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(948);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(951);
			assemblyExpression();
			setState(954);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(952);
				assemblyBlock();
				}
				break;
			case T__5:
			case T__27:
			case T__33:
			case T__41:
			case T__47:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(953);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(956);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIfContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIf(this);
		}
	}

	public final AssemblyIfContext assemblyIf() throws RecognitionException {
		AssemblyIfContext _localctx = new AssemblyIfContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(T__34);
			setState(959);
			assemblyExpression();
			setState(960);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLiteral(this);
		}
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (StringLiteral - 102)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubAssemblyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public SubAssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAssembly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSubAssembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSubAssembly(this);
		}
	}

	public final SubAssemblyContext subAssembly() throws RecognitionException {
		SubAssemblyContext _localctx = new SubAssemblyContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(T__39);
			setState(965);
			identifier();
			setState(966);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTupleExpression(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_tupleExpression);
		int _la;
		try {
			setState(994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				match(T__13);
				{
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
					{
					setState(969);
					expression(0);
					}
				}

				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(972);
					match(T__7);
					setState(974);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
						{
						setState(973);
						expression(0);
						}
					}

					}
					}
					setState(980);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(981);
				match(T__14);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
				match(T__25);
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
					{
					setState(983);
					expression(0);
					setState(988);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(984);
						match(T__7);
						setState(985);
						expression(0);
						}
						}
						setState(990);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(993);
				match(T__26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameExpressionContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public TypeNameExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNameExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeNameExpression(this);
		}
	}

	public final TypeNameExpressionContext typeNameExpression() throws RecognitionException {
		TypeNameExpressionContext _localctx = new TypeNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_typeNameExpression);
		try {
			setState(998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(996);
				elementaryTypeName();
				}
				break;
			case T__5:
			case T__33:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				userDefinedTypeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNumberLiteral(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1001);
				match(NumberUnit);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__33 || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverrideSpecifierContext extends ParserRuleContext {
		public List<UserDefinedTypeNameContext> userDefinedTypeName() {
			return getRuleContexts(UserDefinedTypeNameContext.class);
		}
		public UserDefinedTypeNameContext userDefinedTypeName(int i) {
			return getRuleContext(UserDefinedTypeNameContext.class,i);
		}
		public OverrideSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOverrideSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOverrideSpecifier(this);
		}
	}

	public final OverrideSpecifierContext overrideSpecifier() throws RecognitionException {
		OverrideSpecifierContext _localctx = new OverrideSpecifierContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_overrideSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(T__92);
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(1007);
				match(T__13);
				setState(1008);
				userDefinedTypeName();
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(1009);
					match(T__7);
					setState(1010);
					userDefinedTypeName();
					}
					}
					setState(1015);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1016);
				match(T__14);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 54:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 26);
		case 15:
			return precpred(_ctx, 24);
		case 16:
			return precpred(_ctx, 23);
		case 17:
			return precpred(_ctx, 22);
		case 18:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\177\u03ff\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\7\2\u00b2\n\2\f\2\16\2\u00b5\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\7\3\u00bc\n\3\f\3\16\3\u00bf\13\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\5\5\u00c8\n\5\3\6\3\6\3\6\3\6\5\6\u00ce\n\6\3\6\3\6\3\6\3\6\5\6"+
		"\u00d4\n\6\3\6\3\6\5\6\u00d8\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00e2"+
		"\n\6\f\6\16\6\u00e5\13\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ec\n\6\3\7\3\7\3\b"+
		"\5\b\u00f1\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00f9\n\b\f\b\16\b\u00fc\13"+
		"\b\5\b\u00fe\n\b\3\b\3\b\7\b\u0102\n\b\f\b\16\b\u0105\13\b\3\b\3\b\3\t"+
		"\3\t\3\t\5\t\u010c\n\t\3\t\5\t\u010f\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0119\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0121\n\13\f\13\16"+
		"\13\u0124\13\13\3\13\3\13\3\13\5\13\u0129\n\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u0132\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u013e"+
		"\n\r\f\r\16\r\u0141\13\r\5\r\u0143\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\5\17\u014f\n\17\3\17\3\17\3\20\3\20\3\20\5\20\u0156\n"+
		"\20\3\20\5\20\u0159\n\20\3\21\5\21\u015c\n\21\3\21\3\21\5\21\u0160\n\21"+
		"\3\21\3\21\3\21\5\21\u0165\n\21\3\21\3\21\5\21\u0169\n\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0174\n\23\f\23\16\23\u0177\13"+
		"\23\3\24\5\24\u017a\n\24\3\24\3\24\3\24\3\24\5\24\u0180\n\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u018a\n\26\3\26\3\26\7\26\u018e\n"+
		"\26\f\26\16\26\u0191\13\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0199\n"+
		"\27\f\27\16\27\u019c\13\27\5\27\u019e\n\27\3\27\3\27\3\30\3\30\5\30\u01a4"+
		"\n\30\3\30\5\30\u01a7\n\30\3\31\3\31\3\31\3\31\7\31\u01ad\n\31\f\31\16"+
		"\31\u01b0\13\31\5\31\u01b2\n\31\3\31\3\31\3\32\3\32\5\32\u01b8\n\32\3"+
		"\32\5\32\u01bb\n\32\3\33\3\33\3\33\3\33\7\33\u01c1\n\33\f\33\16\33\u01c4"+
		"\13\33\5\33\u01c6\n\33\3\33\3\33\3\34\3\34\5\34\u01cc\n\34\3\35\3\35\5"+
		"\35\u01d0\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01db"+
		"\n\36\3\36\3\36\3\36\5\36\u01e0\n\36\3\36\7\36\u01e3\n\36\f\36\16\36\u01e6"+
		"\13\36\3\37\3\37\3\37\7\37\u01eb\n\37\f\37\16\37\u01ee\13\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\7!\u01fc\n!\f!\16!\u01ff\13!\3!\3!\5!\u0203"+
		"\n!\3\"\3\"\3#\3#\3$\3$\7$\u020b\n$\f$\16$\u020e\13$\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u021f\n%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\5\'\u022b\n\'\3(\3(\3(\3(\5(\u0231\n(\3(\3(\6(\u0235\n(\r(\16"+
		"(\u0236\3)\3)\5)\u023b\n)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\5+\u0248\n"+
		"+\3,\3,\3,\3,\5,\u024e\n,\3,\3,\5,\u0252\n,\3,\5,\u0255\n,\3,\3,\3,\3"+
		"-\3-\5-\u025c\n-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\5\61\u0270\n\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0282\n\64\3\64\3\64\5\64\u0286"+
		"\n\64\3\64\3\64\3\65\5\65\u028b\n\65\3\65\3\65\5\65\u028f\n\65\7\65\u0291"+
		"\n\65\f\65\16\65\u0294\13\65\3\66\3\66\5\66\u0298\n\66\3\66\7\66\u029b"+
		"\n\66\f\66\16\66\u029e\13\66\3\66\5\66\u02a1\n\66\3\66\3\66\3\67\3\67"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u02b8\n8\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58"+
		"\u02e9\n8\38\38\38\38\58\u02ef\n8\38\38\58\u02f3\n8\38\38\38\38\38\38"+
		"\38\38\38\78\u02fe\n8\f8\168\u0301\138\39\39\39\39\39\39\39\59\u030a\n"+
		"9\39\39\39\39\39\59\u0311\n9\59\u0313\n9\3:\3:\3:\7:\u0318\n:\f:\16:\u031b"+
		"\13:\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\7=\u0327\n=\f=\16=\u032a\13=\3=\5="+
		"\u032d\n=\3>\3>\3>\3>\3?\3?\5?\u0335\n?\3?\3?\5?\u0339\n?\5?\u033b\n?"+
		"\3@\3@\3@\3@\3@\3A\3A\7A\u0344\nA\fA\16A\u0347\13A\3A\3A\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u035d\nB\3C\3C\5C\u0361\n"+
		"C\3D\3D\3D\3D\5D\u0367\nD\3D\3D\5D\u036b\nD\3D\3D\7D\u036f\nD\fD\16D\u0372"+
		"\13D\3D\5D\u0375\nD\3E\3E\3E\3E\5E\u037b\nE\3F\3F\3F\3F\3G\3G\3G\3G\3"+
		"G\5G\u0386\nG\3H\3H\3H\7H\u038b\nH\fH\16H\u038e\13H\3I\3I\3I\3J\3J\3J"+
		"\3K\3K\3K\7K\u0399\nK\fK\16K\u039c\13K\3L\3L\3L\3L\3L\3L\5L\u03a4\nL\3"+
		"M\3M\3M\3M\5M\u03aa\nM\3M\3M\5M\u03ae\nM\3M\3M\3N\3N\3N\3O\3O\3O\5O\u03b8"+
		"\nO\3O\3O\3O\5O\u03bd\nO\3O\3O\3P\3P\3P\3P\3Q\3Q\3R\3R\3R\3R\3S\3S\5S"+
		"\u03cd\nS\3S\3S\5S\u03d1\nS\7S\u03d3\nS\fS\16S\u03d6\13S\3S\3S\3S\3S\3"+
		"S\7S\u03dd\nS\fS\16S\u03e0\13S\5S\u03e2\nS\3S\5S\u03e5\nS\3T\3T\5T\u03e9"+
		"\nT\3U\3U\5U\u03ed\nU\3V\3V\3W\3W\3W\3W\3W\7W\u03f6\nW\fW\16W\u03f9\13"+
		"W\3W\3W\5W\u03fd\nW\3W\3\u00bd\4:nX\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\2\22\3\2`a\3\2"+
		"\f\16\3\2\"$\6\2oouuxxzz\5\2\36\36/\62bf\3\2\63\64\3\2\66\67\3\289\4\2"+
		"\7\7=>\3\2?@\3\2DG\3\2HI\4\2\22\22MV\5\2hikk||\3\2hi\5\2\b\b$${{\2\u0468"+
		"\2\u00b3\3\2\2\2\4\u00b8\3\2\2\2\6\u00c2\3\2\2\2\b\u00c4\3\2\2\2\n\u00eb"+
		"\3\2\2\2\f\u00ed\3\2\2\2\16\u00f0\3\2\2\2\20\u0108\3\2\2\2\22\u0118\3"+
		"\2\2\2\24\u011a\3\2\2\2\26\u012c\3\2\2\2\30\u0135\3\2\2\2\32\u0146\3\2"+
		"\2\2\34\u014b\3\2\2\2\36\u0152\3\2\2\2 \u015b\3\2\2\2\"\u016a\3\2\2\2"+
		"$\u0175\3\2\2\2&\u0179\3\2\2\2(\u0183\3\2\2\2*\u0185\3\2\2\2,\u0194\3"+
		"\2\2\2.\u01a1\3\2\2\2\60\u01a8\3\2\2\2\62\u01b5\3\2\2\2\64\u01bc\3\2\2"+
		"\2\66\u01c9\3\2\2\28\u01cd\3\2\2\2:\u01da\3\2\2\2<\u01e7\3\2\2\2>\u01ef"+
		"\3\2\2\2@\u01f6\3\2\2\2B\u0204\3\2\2\2D\u0206\3\2\2\2F\u0208\3\2\2\2H"+
		"\u021e\3\2\2\2J\u0220\3\2\2\2L\u0223\3\2\2\2N\u022c\3\2\2\2P\u0238\3\2"+
		"\2\2R\u023f\3\2\2\2T\u0247\3\2\2\2V\u0249\3\2\2\2X\u0259\3\2\2\2Z\u025f"+
		"\3\2\2\2\\\u0267\3\2\2\2^\u026a\3\2\2\2`\u026d\3\2\2\2b\u0273\3\2\2\2"+
		"d\u0276\3\2\2\2f\u0281\3\2\2\2h\u028a\3\2\2\2j\u0295\3\2\2\2l\u02a4\3"+
		"\2\2\2n\u02b7\3\2\2\2p\u0312\3\2\2\2r\u0314\3\2\2\2t\u031c\3\2\2\2v\u031f"+
		"\3\2\2\2x\u0323\3\2\2\2z\u032e\3\2\2\2|\u033a\3\2\2\2~\u033c\3\2\2\2\u0080"+
		"\u0341\3\2\2\2\u0082\u035c\3\2\2\2\u0084\u0360\3\2\2\2\u0086\u0366\3\2"+
		"\2\2\u0088\u0376\3\2\2\2\u008a\u037c\3\2\2\2\u008c\u0385\3\2\2\2\u008e"+
		"\u0387\3\2\2\2\u0090\u038f\3\2\2\2\u0092\u0392\3\2\2\2\u0094\u0395\3\2"+
		"\2\2\u0096\u03a3\3\2\2\2\u0098\u03a5\3\2\2\2\u009a\u03b1\3\2\2\2\u009c"+
		"\u03b4\3\2\2\2\u009e\u03c0\3\2\2\2\u00a0\u03c4\3\2\2\2\u00a2\u03c6\3\2"+
		"\2\2\u00a4\u03e4\3\2\2\2\u00a6\u03e8\3\2\2\2\u00a8\u03ea\3\2\2\2\u00aa"+
		"\u03ee\3\2\2\2\u00ac\u03f0\3\2\2\2\u00ae\u00b2\5\4\3\2\u00af\u00b2\5\n"+
		"\6\2\u00b0\u00b2\5\16\b\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\2\2\3\u00b7"+
		"\3\3\2\2\2\u00b8\u00b9\7\3\2\2\u00b9\u00bd\5\6\4\2\u00ba\u00bc\13\2\2"+
		"\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00be\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\4\2\2\u00c1"+
		"\5\3\2\2\2\u00c2\u00c3\7{\2\2\u00c3\7\3\2\2\2\u00c4\u00c7\5\u00aaV\2\u00c5"+
		"\u00c6\7\5\2\2\u00c6\u00c8\5\u00aaV\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\t\3\2\2\2\u00c9\u00ca\7\6\2\2\u00ca\u00cd\7|\2\2\u00cb"+
		"\u00cc\7\5\2\2\u00cc\u00ce\5\u00aaV\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00ec\7\4\2\2\u00d0\u00d3\7\6\2\2\u00d1"+
		"\u00d4\7\7\2\2\u00d2\u00d4\5\u00aaV\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d6\7\5\2\2\u00d6\u00d8\5\u00aaV"+
		"\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da"+
		"\7\b\2\2\u00da\u00db\7|\2\2\u00db\u00ec\7\4\2\2\u00dc\u00dd\7\6\2\2\u00dd"+
		"\u00de\7\t\2\2\u00de\u00e3\5\b\5\2\u00df\u00e0\7\n\2\2\u00e0\u00e2\5\b"+
		"\5\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\13"+
		"\2\2\u00e7\u00e8\7\b\2\2\u00e8\u00e9\7|\2\2\u00e9\u00ea\7\4\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00c9\3\2\2\2\u00eb\u00d0\3\2\2\2\u00eb\u00dc\3\2"+
		"\2\2\u00ec\13\3\2\2\2\u00ed\u00ee\t\2\2\2\u00ee\r\3\2\2\2\u00ef\u00f1"+
		"\5\f\7\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\t\3\2\2\u00f3\u00fd\5\u00aaV\2\u00f4\u00f5\7\17\2\2\u00f5\u00fa"+
		"\5\20\t\2\u00f6\u00f7\7\n\2\2\u00f7\u00f9\5\20\t\2\u00f8\u00f6\3\2\2\2"+
		"\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0103\7\t\2\2\u0100\u0102\5\22\n\2\u0101\u0100\3"+
		"\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\13\2\2\u0107\17\3\2\2"+
		"\2\u0108\u010e\5<\37\2\u0109\u010b\7\20\2\2\u010a\u010c\5r:\2\u010b\u010a"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\7\21\2\2"+
		"\u010e\u0109\3\2\2\2\u010e\u010f\3\2\2\2\u010f\21\3\2\2\2\u0110\u0119"+
		"\5\24\13\2\u0111\u0119\5\26\f\2\u0112\u0119\5\30\r\2\u0113\u0119\5\32"+
		"\16\2\u0114\u0119\5\34\17\2\u0115\u0119\5 \21\2\u0116\u0119\5&\24\2\u0117"+
		"\u0119\5*\26\2\u0118\u0110\3\2\2\2\u0118\u0111\3\2\2\2\u0118\u0112\3\2"+
		"\2\2\u0118\u0113\3\2\2\2\u0118\u0114\3\2\2\2\u0118\u0115\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119\23\3\2\2\2\u011a\u0122\5:\36"+
		"\2\u011b\u0121\7w\2\2\u011c\u0121\7t\2\2\u011d\u0121\7v\2\2\u011e\u0121"+
		"\7o\2\2\u011f\u0121\5\u00acW\2\u0120\u011b\3\2\2\2\u0120\u011c\3\2\2\2"+
		"\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0124"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0128\5\u00aaV\2\u0126\u0127\7\22\2\2\u0127\u0129"+
		"\5n8\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\7\4\2\2\u012b\25\3\2\2\2\u012c\u012d\7\23\2\2\u012d\u012e\5\u00aa"+
		"V\2\u012e\u0131\7\24\2\2\u012f\u0132\7\7\2\2\u0130\u0132\5:\36\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7\4"+
		"\2\2\u0134\27\3\2\2\2\u0135\u0136\7\25\2\2\u0136\u0137\5\u00aaV\2\u0137"+
		"\u0142\7\t\2\2\u0138\u0139\58\35\2\u0139\u013f\7\4\2\2\u013a\u013b\58"+
		"\35\2\u013b\u013c\7\4\2\2\u013c\u013e\3\2\2\2\u013d\u013a\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0143\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0142\u0138\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\7\13\2\2\u0145\31\3\2\2\2\u0146\u0147\7\26"+
		"\2\2\u0147\u0148\5,\27\2\u0148\u0149\5$\23\2\u0149\u014a\5F$\2\u014a\33"+
		"\3\2\2\2\u014b\u014c\7\27\2\2\u014c\u014e\5\u00aaV\2\u014d\u014f\5,\27"+
		"\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151"+
		"\5F$\2\u0151\35\3\2\2\2\u0152\u0158\5\u00aaV\2\u0153\u0155\7\20\2\2\u0154"+
		"\u0156\5r:\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2"+
		"\2\u0157\u0159\7\21\2\2\u0158\u0153\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\37\3\2\2\2\u015a\u015c\5\f\7\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2"+
		"\2\u015c\u015d\3\2\2\2\u015d\u015f\7\30\2\2\u015e\u0160\5\u00aaV\2\u015f"+
		"\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\5,"+
		"\27\2\u0162\u0164\5$\23\2\u0163\u0165\5\"\22\2\u0164\u0163\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0169\7\4\2\2\u0167\u0169\5F"+
		"$\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169!\3\2\2\2\u016a\u016b"+
		"\7\31\2\2\u016b\u016c\5,\27\2\u016c#\3\2\2\2\u016d\u0174\5\36\20\2\u016e"+
		"\u0174\5D#\2\u016f\u0174\7r\2\2\u0170\u0174\7w\2\2\u0171\u0174\7t\2\2"+
		"\u0172\u0174\7v\2\2\u0173\u016d\3\2\2\2\u0173\u016e\3\2\2\2\u0173\u016f"+
		"\3\2\2\2\u0173\u0170\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176%\3\2\2\2"+
		"\u0177\u0175\3\2\2\2\u0178\u017a\5\f\7\2\u0179\u0178\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\7\32\2\2\u017c\u017d\5\u00aa"+
		"V\2\u017d\u017f\5\60\31\2\u017e\u0180\7m\2\2\u017f\u017e\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\4\2\2\u0182\'\3\2\2\2"+
		"\u0183\u0184\5\u00aaV\2\u0184)\3\2\2\2\u0185\u0186\7\33\2\2\u0186\u0187"+
		"\5\u00aaV\2\u0187\u0189\7\t\2\2\u0188\u018a\5(\25\2\u0189\u0188\3\2\2"+
		"\2\u0189\u018a\3\2\2\2\u018a\u018f\3\2\2\2\u018b\u018c\7\n\2\2\u018c\u018e"+
		"\5(\25\2\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\7\13"+
		"\2\2\u0193+\3\2\2\2\u0194\u019d\7\20\2\2\u0195\u019a\5.\30\2\u0196\u0197"+
		"\7\n\2\2\u0197\u0199\5.\30\2\u0198\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019d\u0195\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\7\21\2\2\u01a0-\3\2\2\2\u01a1\u01a3\5:\36\2\u01a2\u01a4\5B\"\2"+
		"\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a7"+
		"\5\u00aaV\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7/\3\2\2\2\u01a8"+
		"\u01b1\7\20\2\2\u01a9\u01ae\5\62\32\2\u01aa\u01ab\7\n\2\2\u01ab\u01ad"+
		"\5\62\32\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2"+
		"\u01ae\u01af\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01a9"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\7\21\2\2"+
		"\u01b4\61\3\2\2\2\u01b5\u01b7\5:\36\2\u01b6\u01b8\7s\2\2\u01b7\u01b6\3"+
		"\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01bb\5\u00aaV\2"+
		"\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\63\3\2\2\2\u01bc\u01c5"+
		"\7\20\2\2\u01bd\u01c2\5\66\34\2\u01be\u01bf\7\n\2\2\u01bf\u01c1\5\66\34"+
		"\2\u01c0\u01be\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3"+
		"\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01bd\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7\21\2\2\u01c8\65\3\2\2"+
		"\2\u01c9\u01cb\5:\36\2\u01ca\u01cc\5B\"\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\67\3\2\2\2\u01cd\u01cf\5:\36\2\u01ce\u01d0\5B\"\2\u01cf"+
		"\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\5\u00aa"+
		"V\2\u01d29\3\2\2\2\u01d3\u01d4\b\36\1\2\u01d4\u01db\5l\67\2\u01d5\u01db"+
		"\5<\37\2\u01d6\u01db\5> \2\u01d7\u01db\5@!\2\u01d8\u01d9\7\36\2\2\u01d9"+
		"\u01db\7u\2\2\u01da\u01d3\3\2\2\2\u01da\u01d5\3\2\2\2\u01da\u01d6\3\2"+
		"\2\2\u01da\u01d7\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01e4\3\2\2\2\u01dc"+
		"\u01dd\f\5\2\2\u01dd\u01df\7\34\2\2\u01de\u01e0\5n8\2\u01df\u01de\3\2"+
		"\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\7\35\2\2\u01e2"+
		"\u01dc\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5;\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01ec\5\u00aaV\2\u01e8\u01e9"+
		"\7\37\2\2\u01e9\u01eb\5\u00aaV\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee\3\2\2"+
		"\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed=\3\2\2\2\u01ee\u01ec"+
		"\3\2\2\2\u01ef\u01f0\7 \2\2\u01f0\u01f1\7\20\2\2\u01f1\u01f2\5l\67\2\u01f2"+
		"\u01f3\7!\2\2\u01f3\u01f4\5:\36\2\u01f4\u01f5\7\21\2\2\u01f5?\3\2\2\2"+
		"\u01f6\u01f7\7\30\2\2\u01f7\u01fd\5\64\33\2\u01f8\u01fc\7t\2\2\u01f9\u01fc"+
		"\7r\2\2\u01fa\u01fc\5D#\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u0202\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7\31\2\2\u0201"+
		"\u0203\5\64\33\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203A\3\2\2"+
		"\2\u0204\u0205\t\4\2\2\u0205C\3\2\2\2\u0206\u0207\t\5\2\2\u0207E\3\2\2"+
		"\2\u0208\u020c\7\t\2\2\u0209\u020b\5H%\2\u020a\u0209\3\2\2\2\u020b\u020e"+
		"\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e"+
		"\u020c\3\2\2\2\u020f\u0210\7\13\2\2\u0210G\3\2\2\2\u0211\u021f\5L\'\2"+
		"\u0212\u021f\5N(\2\u0213\u021f\5R*\2\u0214\u021f\5V,\2\u0215\u021f\5F"+
		"$\2\u0216\u021f\5X-\2\u0217\u021f\5Z.\2\u0218\u021f\5\\/\2\u0219\u021f"+
		"\5^\60\2\u021a\u021f\5`\61\2\u021b\u021f\5b\62\2\u021c\u021f\5d\63\2\u021d"+
		"\u021f\5T+\2\u021e\u0211\3\2\2\2\u021e\u0212\3\2\2\2\u021e\u0213\3\2\2"+
		"\2\u021e\u0214\3\2\2\2\u021e\u0215\3\2\2\2\u021e\u0216\3\2\2\2\u021e\u0217"+
		"\3\2\2\2\u021e\u0218\3\2\2\2\u021e\u0219\3\2\2\2\u021e\u021a\3\2\2\2\u021e"+
		"\u021b\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021d\3\2\2\2\u021fI\3\2\2\2"+
		"\u0220\u0221\5n8\2\u0221\u0222\7\4\2\2\u0222K\3\2\2\2\u0223\u0224\7%\2"+
		"\2\u0224\u0225\7\20\2\2\u0225\u0226\5n8\2\u0226\u0227\7\21\2\2\u0227\u022a"+
		"\5H%\2\u0228\u0229\7&\2\2\u0229\u022b\5H%\2\u022a\u0228\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022bM\3\2\2\2\u022c\u022d\7\'\2\2\u022d\u0230\5n8\2\u022e"+
		"\u022f\7\31\2\2\u022f\u0231\5,\27\2\u0230\u022e\3\2\2\2\u0230\u0231\3"+
		"\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\5F$\2\u0233\u0235\5P)\2\u0234\u0233"+
		"\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"O\3\2\2\2\u0238\u023a\7(\2\2\u0239\u023b\5\u00aaV\2\u023a\u0239\3\2\2"+
		"\2\u023a\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\5,\27\2\u023d\u023e"+
		"\5F$\2\u023eQ\3\2\2\2\u023f\u0240\7)\2\2\u0240\u0241\7\20\2\2\u0241\u0242"+
		"\5n8\2\u0242\u0243\7\21\2\2\u0243\u0244\5H%\2\u0244S\3\2\2\2\u0245\u0248"+
		"\5f\64\2\u0246\u0248\5J&\2\u0247\u0245\3\2\2\2\u0247\u0246\3\2\2\2\u0248"+
		"U\3\2\2\2\u0249\u024a\7\24\2\2\u024a\u024d\7\20\2\2\u024b\u024e\5T+\2"+
		"\u024c\u024e\7\4\2\2\u024d\u024b\3\2\2\2\u024d\u024c\3\2\2\2\u024e\u0251"+
		"\3\2\2\2\u024f\u0252\5J&\2\u0250\u0252\7\4\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0250\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0255\5n8\2\u0254\u0253\3\2\2"+
		"\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\7\21\2\2\u0257"+
		"\u0258\5H%\2\u0258W\3\2\2\2\u0259\u025b\7*\2\2\u025a\u025c\7|\2\2\u025b"+
		"\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\5\u0080"+
		"A\2\u025eY\3\2\2\2\u025f\u0260\7+\2\2\u0260\u0261\5H%\2\u0261\u0262\7"+
		")\2\2\u0262\u0263\7\20\2\2\u0263\u0264\5n8\2\u0264\u0265\7\21\2\2\u0265"+
		"\u0266\7\4\2\2\u0266[\3\2\2\2\u0267\u0268\7p\2\2\u0268\u0269\7\4\2\2\u0269"+
		"]\3\2\2\2\u026a\u026b\7n\2\2\u026b\u026c\7\4\2\2\u026c_\3\2\2\2\u026d"+
		"\u026f\7,\2\2\u026e\u0270\5n8\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2"+
		"\2\u0270\u0271\3\2\2\2\u0271\u0272\7\4\2\2\u0272a\3\2\2\2\u0273\u0274"+
		"\7-\2\2\u0274\u0275\7\4\2\2\u0275c\3\2\2\2\u0276\u0277\7.\2\2\u0277\u0278"+
		"\5~@\2\u0278\u0279\7\4\2\2\u0279e\3\2\2\2\u027a\u027b\7/\2\2\u027b\u0282"+
		"\5j\66\2\u027c\u0282\58\35\2\u027d\u027e\7\20\2\2\u027e\u027f\5h\65\2"+
		"\u027f\u0280\7\21\2\2\u0280\u0282\3\2\2\2\u0281\u027a\3\2\2\2\u0281\u027c"+
		"\3\2\2\2\u0281\u027d\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0284\7\22\2\2"+
		"\u0284\u0286\5n8\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287"+
		"\3\2\2\2\u0287\u0288\7\4\2\2\u0288g\3\2\2\2\u0289\u028b\58\35\2\u028a"+
		"\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0292\3\2\2\2\u028c\u028e\7\n"+
		"\2\2\u028d\u028f\58\35\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0291\3\2\2\2\u0290\u028c\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2"+
		"\2\2\u0292\u0293\3\2\2\2\u0293i\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u029c"+
		"\7\20\2\2\u0296\u0298\5\u00aaV\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2"+
		"\2\u0298\u0299\3\2\2\2\u0299\u029b\7\n\2\2\u029a\u0297\3\2\2\2\u029b\u029e"+
		"\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a0\3\2\2\2\u029e"+
		"\u029c\3\2\2\2\u029f\u02a1\5\u00aaV\2\u02a0\u029f\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\7\21\2\2\u02a3k\3\2\2\2\u02a4"+
		"\u02a5\t\6\2\2\u02a5m\3\2\2\2\u02a6\u02a7\b8\1\2\u02a7\u02b8\5t;\2\u02a8"+
		"\u02a9\7\20\2\2\u02a9\u02aa\5n8\2\u02aa\u02ab\7\21\2\2\u02ab\u02b8\3\2"+
		"\2\2\u02ac\u02ad\t\7\2\2\u02ad\u02b8\5n8\25\u02ae\u02af\t\b\2\2\u02af"+
		"\u02b8\5n8\24\u02b0\u02b1\t\t\2\2\u02b1\u02b8\5n8\23\u02b2\u02b3\7:\2"+
		"\2\u02b3\u02b8\5n8\22\u02b4\u02b5\7;\2\2\u02b5\u02b8\5n8\21\u02b6\u02b8"+
		"\5p9\2\u02b7\u02a6\3\2\2\2\u02b7\u02a8\3\2\2\2\u02b7\u02ac\3\2\2\2\u02b7"+
		"\u02ae\3\2\2\2\u02b7\u02b0\3\2\2\2\u02b7\u02b2\3\2\2\2\u02b7\u02b4\3\2"+
		"\2\2\u02b7\u02b6\3\2\2\2\u02b8\u02ff\3\2\2\2\u02b9\u02ba\f\20\2\2\u02ba"+
		"\u02bb\7<\2\2\u02bb\u02fe\5n8\21\u02bc\u02bd\f\17\2\2\u02bd\u02be\t\n"+
		"\2\2\u02be\u02fe\5n8\20\u02bf\u02c0\f\16\2\2\u02c0\u02c1\t\b\2\2\u02c1"+
		"\u02fe\5n8\17\u02c2\u02c3\f\r\2\2\u02c3\u02c4\t\13\2\2\u02c4\u02fe\5n"+
		"8\16\u02c5\u02c6\f\f\2\2\u02c6\u02c7\7A\2\2\u02c7\u02fe\5n8\r\u02c8\u02c9"+
		"\f\13\2\2\u02c9\u02ca\7B\2\2\u02ca\u02fe\5n8\f\u02cb\u02cc\f\n\2\2\u02cc"+
		"\u02cd\7C\2\2\u02cd\u02fe\5n8\13\u02ce\u02cf\f\t\2\2\u02cf\u02d0\t\f\2"+
		"\2\u02d0\u02fe\5n8\n\u02d1\u02d2\f\b\2\2\u02d2\u02d3\t\r\2\2\u02d3\u02fe"+
		"\5n8\t\u02d4\u02d5\f\7\2\2\u02d5\u02d6\7J\2\2\u02d6\u02fe\5n8\b\u02d7"+
		"\u02d8\f\6\2\2\u02d8\u02d9\7K\2\2\u02d9\u02fe\5n8\7\u02da\u02db\f\5\2"+
		"\2\u02db\u02dc\7L\2\2\u02dc\u02dd\5n8\2\u02dd\u02de\7\65\2\2\u02de\u02df"+
		"\5n8\6\u02df\u02fe\3\2\2\2\u02e0\u02e1\f\4\2\2\u02e1\u02e2\t\16\2\2\u02e2"+
		"\u02fe\5n8\5\u02e3\u02e4\f\34\2\2\u02e4\u02fe\t\7\2\2\u02e5\u02e6\f\32"+
		"\2\2\u02e6\u02e8\7\34\2\2\u02e7\u02e9\5n8\2\u02e8\u02e7\3\2\2\2\u02e8"+
		"\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02fe\7\35\2\2\u02eb\u02ec\f"+
		"\31\2\2\u02ec\u02ee\7\34\2\2\u02ed\u02ef\5n8\2\u02ee\u02ed\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f2\7\65\2\2\u02f1\u02f3\5"+
		"n8\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02fe\7\35\2\2\u02f5\u02f6\f\30\2\2\u02f6\u02f7\7\37\2\2\u02f7\u02fe"+
		"\5\u00aaV\2\u02f8\u02f9\f\27\2\2\u02f9\u02fa\7\20\2\2\u02fa\u02fb\5|?"+
		"\2\u02fb\u02fc\7\21\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02b9\3\2\2\2\u02fd"+
		"\u02bc\3\2\2\2\u02fd\u02bf\3\2\2\2\u02fd\u02c2\3\2\2\2\u02fd\u02c5\3\2"+
		"\2\2\u02fd\u02c8\3\2\2\2\u02fd\u02cb\3\2\2\2\u02fd\u02ce\3\2\2\2\u02fd"+
		"\u02d1\3\2\2\2\u02fd\u02d4\3\2\2\2\u02fd\u02d7\3\2\2\2\u02fd\u02da\3\2"+
		"\2\2\u02fd\u02e0\3\2\2\2\u02fd\u02e3\3\2\2\2\u02fd\u02e5\3\2\2\2\u02fd"+
		"\u02eb\3\2\2\2\u02fd\u02f5\3\2\2\2\u02fd\u02f8\3\2\2\2\u02fe\u0301\3\2"+
		"\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300o\3\2\2\2\u0301\u02ff"+
		"\3\2\2\2\u0302\u0313\7g\2\2\u0303\u0313\5\u00a8U\2\u0304\u0313\7k\2\2"+
		"\u0305\u0313\7|\2\2\u0306\u0309\5\u00aaV\2\u0307\u0308\7\34\2\2\u0308"+
		"\u030a\7\35\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u0313\3"+
		"\2\2\2\u030b\u0313\7y\2\2\u030c\u0313\5\u00a4S\2\u030d\u0310\5\u00a6T"+
		"\2\u030e\u030f\7\34\2\2\u030f\u0311\7\35\2\2\u0310\u030e\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311\u0313\3\2\2\2\u0312\u0302\3\2\2\2\u0312\u0303\3\2"+
		"\2\2\u0312\u0304\3\2\2\2\u0312\u0305\3\2\2\2\u0312\u0306\3\2\2\2\u0312"+
		"\u030b\3\2\2\2\u0312\u030c\3\2\2\2\u0312\u030d\3\2\2\2\u0313q\3\2\2\2"+
		"\u0314\u0319\5n8\2\u0315\u0316\7\n\2\2\u0316\u0318\5n8\2\u0317\u0315\3"+
		"\2\2\2\u0318\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"s\3\2\2\2\u031b\u0319\3\2\2\2\u031c\u031d\7W\2\2\u031d\u031e\5:\36\2\u031e"+
		"u\3\2\2\2\u031f\u0320\5n8\2\u0320\u0321\7\37\2\2\u0321\u0322\5\u00aaV"+
		"\2\u0322w\3\2\2\2\u0323\u0328\5z>\2\u0324\u0325\7\n\2\2\u0325\u0327\5"+
		"z>\2\u0326\u0324\3\2\2\2\u0327\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0328"+
		"\u0329\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032b\u032d\7\n"+
		"\2\2\u032c\u032b\3\2\2\2\u032c\u032d\3\2\2\2\u032dy\3\2\2\2\u032e\u032f"+
		"\5\u00aaV\2\u032f\u0330\7\65\2\2\u0330\u0331\5n8\2\u0331{\3\2\2\2\u0332"+
		"\u0334\7\t\2\2\u0333\u0335\5x=\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2"+
		"\2\u0335\u0336\3\2\2\2\u0336\u033b\7\13\2\2\u0337\u0339\5r:\2\u0338\u0337"+
		"\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\3\2\2\2\u033a\u0332\3\2\2\2\u033a"+
		"\u0338\3\2\2\2\u033b}\3\2\2\2\u033c\u033d\5n8\2\u033d\u033e\7\20\2\2\u033e"+
		"\u033f\5|?\2\u033f\u0340\7\21\2\2\u0340\177\3\2\2\2\u0341\u0345\7\t\2"+
		"\2\u0342\u0344\5\u0082B\2\u0343\u0342\3\2\2\2\u0344\u0347\3\2\2\2\u0345"+
		"\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u0345\3\2"+
		"\2\2\u0348\u0349\7\13\2\2\u0349\u0081\3\2\2\2\u034a\u035d\5\u00aaV\2\u034b"+
		"\u035d\5\u0080A\2\u034c\u035d\5\u0084C\2\u034d\u035d\5\u0088E\2\u034e"+
		"\u035d\5\u008aF\2\u034f\u035d\5\u0090I\2\u0350\u035d\5\u0092J\2\u0351"+
		"\u035d\5\u0094K\2\u0352\u035d\5\u0098M\2\u0353\u035d\5\u009cO\2\u0354"+
		"\u035d\5\u009eP\2\u0355\u035d\7n\2\2\u0356\u035d\7p\2\2\u0357\u035d\7"+
		"q\2\2\u0358\u035d\5\u00a2R\2\u0359\u035d\5\u00a8U\2\u035a\u035d\7|\2\2"+
		"\u035b\u035d\7k\2\2\u035c\u034a\3\2\2\2\u035c\u034b\3\2\2\2\u035c\u034c"+
		"\3\2\2\2\u035c\u034d\3\2\2\2\u035c\u034e\3\2\2\2\u035c\u034f\3\2\2\2\u035c"+
		"\u0350\3\2\2\2\u035c\u0351\3\2\2\2\u035c\u0352\3\2\2\2\u035c\u0353\3\2"+
		"\2\2\u035c\u0354\3\2\2\2\u035c\u0355\3\2\2\2\u035c\u0356\3\2\2\2\u035c"+
		"\u0357\3\2\2\2\u035c\u0358\3\2\2\2\u035c\u0359\3\2\2\2\u035c\u035a\3\2"+
		"\2\2\u035c\u035b\3\2\2\2\u035d\u0083\3\2\2\2\u035e\u0361\5\u0086D\2\u035f"+
		"\u0361\5\u00a0Q\2\u0360\u035e\3\2\2\2\u0360\u035f\3\2\2\2\u0361\u0085"+
		"\3\2\2\2\u0362\u0367\7,\2\2\u0363\u0367\7\36\2\2\u0364\u0367\7\62\2\2"+
		"\u0365\u0367\5\u00aaV\2\u0366\u0362\3\2\2\2\u0366\u0363\3\2\2\2\u0366"+
		"\u0364\3\2\2\2\u0366\u0365\3\2\2\2\u0367\u0374\3\2\2\2\u0368\u036a\7\20"+
		"\2\2\u0369\u036b\5\u0084C\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u0370\3\2\2\2\u036c\u036d\7\n\2\2\u036d\u036f\5\u0084C\2\u036e\u036c"+
		"\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"\u0373\3\2\2\2\u0372\u0370\3\2\2\2\u0373\u0375\7\21\2\2\u0374\u0368\3"+
		"\2\2\2\u0374\u0375\3\2\2\2\u0375\u0087\3\2\2\2\u0376\u0377\7X\2\2\u0377"+
		"\u037a\5\u008cG\2\u0378\u0379\7Y\2\2\u0379\u037b\5\u0084C\2\u037a\u0378"+
		"\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0089\3\2\2\2\u037c\u037d\5\u008cG"+
		"\2\u037d\u037e\7Y\2\2\u037e\u037f\5\u0084C\2\u037f\u008b\3\2\2\2\u0380"+
		"\u0386\5\u00aaV\2\u0381\u0382\7\20\2\2\u0382\u0383\5\u008eH\2\u0383\u0384"+
		"\7\21\2\2\u0384\u0386\3\2\2\2\u0385\u0380\3\2\2\2\u0385\u0381\3\2\2\2"+
		"\u0386\u008d\3\2\2\2\u0387\u038c\5\u00aaV\2\u0388\u0389\7\n\2\2\u0389"+
		"\u038b\5\u00aaV\2\u038a\u0388\3\2\2\2\u038b\u038e\3\2\2\2\u038c\u038a"+
		"\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u008f\3\2\2\2\u038e\u038c\3\2\2\2\u038f"+
		"\u0390\7Z\2\2\u0390\u0391\5\u00aaV\2\u0391\u0091\3\2\2\2\u0392\u0393\5"+
		"\u00aaV\2\u0393\u0394\7\65\2\2\u0394\u0093\3\2\2\2\u0395\u0396\7[\2\2"+
		"\u0396\u039a\5\u0084C\2\u0397\u0399\5\u0096L\2\u0398\u0397\3\2\2\2\u0399"+
		"\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u0095\3\2"+
		"\2\2\u039c\u039a\3\2\2\2\u039d\u039e\7\\\2\2\u039e\u039f\5\u00a0Q\2\u039f"+
		"\u03a0\5\u0080A\2\u03a0\u03a4\3\2\2\2\u03a1\u03a2\7]\2\2\u03a2\u03a4\5"+
		"\u0080A\2\u03a3\u039d\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a4\u0097\3\2\2\2"+
		"\u03a5\u03a6\7\30\2\2\u03a6\u03a7\5\u00aaV\2\u03a7\u03a9\7\20\2\2\u03a8"+
		"\u03aa\5\u008eH\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab"+
		"\3\2\2\2\u03ab\u03ad\7\21\2\2\u03ac\u03ae\5\u009aN\2\u03ad\u03ac\3\2\2"+
		"\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\5\u0080A\2\u03b0"+
		"\u0099\3\2\2\2\u03b1\u03b2\7^\2\2\u03b2\u03b3\5\u008eH\2\u03b3\u009b\3"+
		"\2\2\2\u03b4\u03b7\7\24\2\2\u03b5\u03b8\5\u0080A\2\u03b6\u03b8\5\u0084"+
		"C\2\u03b7\u03b5\3\2\2\2\u03b7\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9"+
		"\u03bc\5\u0084C\2\u03ba\u03bd\5\u0080A\2\u03bb\u03bd\5\u0084C\2\u03bc"+
		"\u03ba\3\2\2\2\u03bc\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\5\u0080"+
		"A\2\u03bf\u009d\3\2\2\2\u03c0\u03c1\7%\2\2\u03c1\u03c2\5\u0084C\2\u03c2"+
		"\u03c3\5\u0080A\2\u03c3\u009f\3\2\2\2\u03c4\u03c5\t\17\2\2\u03c5\u00a1"+
		"\3\2\2\2\u03c6\u03c7\7*\2\2\u03c7\u03c8\5\u00aaV\2\u03c8\u03c9\5\u0080"+
		"A\2\u03c9\u00a3\3\2\2\2\u03ca\u03cc\7\20\2\2\u03cb\u03cd\5n8\2\u03cc\u03cb"+
		"\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03d4\3\2\2\2\u03ce\u03d0\7\n\2\2\u03cf"+
		"\u03d1\5n8\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d3\3\2\2"+
		"\2\u03d2\u03ce\3\2\2\2\u03d3\u03d6\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5"+
		"\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d7\u03e5\7\21\2\2"+
		"\u03d8\u03e1\7\34\2\2\u03d9\u03de\5n8\2\u03da\u03db\7\n\2\2\u03db\u03dd"+
		"\5n8\2\u03dc\u03da\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03d9\3\2"+
		"\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e5\7\35\2\2\u03e4"+
		"\u03ca\3\2\2\2\u03e4\u03d8\3\2\2\2\u03e5\u00a5\3\2\2\2\u03e6\u03e9\5l"+
		"\67\2\u03e7\u03e9\5<\37\2\u03e8\u03e6\3\2\2\2\u03e8\u03e7\3\2\2\2\u03e9"+
		"\u00a7\3\2\2\2\u03ea\u03ec\t\20\2\2\u03eb\u03ed\7j\2\2\u03ec\u03eb\3\2"+
		"\2\2\u03ec\u03ed\3\2\2\2\u03ed\u00a9\3\2\2\2\u03ee\u03ef\t\21\2\2\u03ef"+
		"\u00ab\3\2\2\2\u03f0\u03fc\7_\2\2\u03f1\u03f2\7\20\2\2\u03f2\u03f7\5<"+
		"\37\2\u03f3\u03f4\7\n\2\2\u03f4\u03f6\5<\37\2\u03f5\u03f3\3\2\2\2\u03f6"+
		"\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\3\2"+
		"\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fb\7\21\2\2\u03fb\u03fd\3\2\2\2\u03fc"+
		"\u03f1\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u00ad\3\2\2\2u\u00b1\u00b3\u00bd"+
		"\u00c7\u00cd\u00d3\u00d7\u00e3\u00eb\u00f0\u00fa\u00fd\u0103\u010b\u010e"+
		"\u0118\u0120\u0122\u0128\u0131\u013f\u0142\u014e\u0155\u0158\u015b\u015f"+
		"\u0164\u0168\u0173\u0175\u0179\u017f\u0189\u018f\u019a\u019d\u01a3\u01a6"+
		"\u01ae\u01b1\u01b7\u01ba\u01c2\u01c5\u01cb\u01cf\u01da\u01df\u01e4\u01ec"+
		"\u01fb\u01fd\u0202\u020c\u021e\u022a\u0230\u0236\u023a\u0247\u024d\u0251"+
		"\u0254\u025b\u026f\u0281\u0285\u028a\u028e\u0292\u0297\u029c\u02a0\u02b7"+
		"\u02e8\u02ee\u02f2\u02fd\u02ff\u0309\u0310\u0312\u0319\u0328\u032c\u0334"+
		"\u0338\u033a\u0345\u035c\u0360\u0366\u036a\u0370\u0374\u037a\u0385\u038c"+
		"\u039a\u03a3\u03a9\u03ad\u03b7\u03bc\u03cc\u03d0\u03d4\u03de\u03e1\u03e4"+
		"\u03e8\u03ec\u03f7\u03fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}