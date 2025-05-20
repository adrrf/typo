package adrf.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import adrf.xtext.services.TypoDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTypoDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DATE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'doc'", "'{'", "'title:'", "'author:'", "'date:'", "'tldr:'", "'}'", "'+section'", "'+sub'", "'+p'", "'+img'", "'url:'", "'width:'", "'height:'", "'caption:'", "'+code'", "'language:'", "'text:'", "'+list'", "'-'", "'*'", "'~bold'", "'~italic'", "'~link'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DATE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTypoDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTypoDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTypoDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTypoDSL.g"; }



     	private TypoDSLGrammarAccess grammarAccess;

        public InternalTypoDSLParser(TokenStream input, TypoDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Document";
       	}

       	@Override
       	protected TypoDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDocument"
    // InternalTypoDSL.g:64:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalTypoDSL.g:64:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalTypoDSL.g:65:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalTypoDSL.g:71:1: ruleDocument returns [EObject current=null] : (otherlv_0= 'doc' otherlv_1= '{' otherlv_2= 'title:' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= 'author:' ( (lv_author_5_0= RULE_STRING ) ) otherlv_6= 'date:' ( (lv_datetime_7_0= RULE_DATE ) ) otherlv_8= 'tldr:' ( (lv_tldr_9_0= RULE_STRING ) ) ( (lv_blocks_10_0= ruleBlocks ) )* otherlv_11= '}' ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_title_3_0=null;
        Token otherlv_4=null;
        Token lv_author_5_0=null;
        Token otherlv_6=null;
        Token lv_datetime_7_0=null;
        Token otherlv_8=null;
        Token lv_tldr_9_0=null;
        Token otherlv_11=null;
        EObject lv_blocks_10_0 = null;



        	enterRule();

        try {
            // InternalTypoDSL.g:77:2: ( (otherlv_0= 'doc' otherlv_1= '{' otherlv_2= 'title:' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= 'author:' ( (lv_author_5_0= RULE_STRING ) ) otherlv_6= 'date:' ( (lv_datetime_7_0= RULE_DATE ) ) otherlv_8= 'tldr:' ( (lv_tldr_9_0= RULE_STRING ) ) ( (lv_blocks_10_0= ruleBlocks ) )* otherlv_11= '}' ) )
            // InternalTypoDSL.g:78:2: (otherlv_0= 'doc' otherlv_1= '{' otherlv_2= 'title:' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= 'author:' ( (lv_author_5_0= RULE_STRING ) ) otherlv_6= 'date:' ( (lv_datetime_7_0= RULE_DATE ) ) otherlv_8= 'tldr:' ( (lv_tldr_9_0= RULE_STRING ) ) ( (lv_blocks_10_0= ruleBlocks ) )* otherlv_11= '}' )
            {
            // InternalTypoDSL.g:78:2: (otherlv_0= 'doc' otherlv_1= '{' otherlv_2= 'title:' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= 'author:' ( (lv_author_5_0= RULE_STRING ) ) otherlv_6= 'date:' ( (lv_datetime_7_0= RULE_DATE ) ) otherlv_8= 'tldr:' ( (lv_tldr_9_0= RULE_STRING ) ) ( (lv_blocks_10_0= ruleBlocks ) )* otherlv_11= '}' )
            // InternalTypoDSL.g:79:3: otherlv_0= 'doc' otherlv_1= '{' otherlv_2= 'title:' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= 'author:' ( (lv_author_5_0= RULE_STRING ) ) otherlv_6= 'date:' ( (lv_datetime_7_0= RULE_DATE ) ) otherlv_8= 'tldr:' ( (lv_tldr_9_0= RULE_STRING ) ) ( (lv_blocks_10_0= ruleBlocks ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDocumentAccess().getDocKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDocumentAccess().getTitleKeyword_2());
            		
            // InternalTypoDSL.g:91:3: ( (lv_title_3_0= RULE_STRING ) )
            // InternalTypoDSL.g:92:4: (lv_title_3_0= RULE_STRING )
            {
            // InternalTypoDSL.g:92:4: (lv_title_3_0= RULE_STRING )
            // InternalTypoDSL.g:93:5: lv_title_3_0= RULE_STRING
            {
            lv_title_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_title_3_0, grammarAccess.getDocumentAccess().getTitleSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getDocumentAccess().getAuthorKeyword_4());
            		
            // InternalTypoDSL.g:113:3: ( (lv_author_5_0= RULE_STRING ) )
            // InternalTypoDSL.g:114:4: (lv_author_5_0= RULE_STRING )
            {
            // InternalTypoDSL.g:114:4: (lv_author_5_0= RULE_STRING )
            // InternalTypoDSL.g:115:5: lv_author_5_0= RULE_STRING
            {
            lv_author_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_author_5_0, grammarAccess.getDocumentAccess().getAuthorSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"author",
            						lv_author_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getDocumentAccess().getDateKeyword_6());
            		
            // InternalTypoDSL.g:135:3: ( (lv_datetime_7_0= RULE_DATE ) )
            // InternalTypoDSL.g:136:4: (lv_datetime_7_0= RULE_DATE )
            {
            // InternalTypoDSL.g:136:4: (lv_datetime_7_0= RULE_DATE )
            // InternalTypoDSL.g:137:5: lv_datetime_7_0= RULE_DATE
            {
            lv_datetime_7_0=(Token)match(input,RULE_DATE,FOLLOW_9); 

            					newLeafNode(lv_datetime_7_0, grammarAccess.getDocumentAccess().getDatetimeDATETerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"datetime",
            						lv_datetime_7_0,
            						"adrf.xtext.TypoDSL.DATE");
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getDocumentAccess().getTldrKeyword_8());
            		
            // InternalTypoDSL.g:157:3: ( (lv_tldr_9_0= RULE_STRING ) )
            // InternalTypoDSL.g:158:4: (lv_tldr_9_0= RULE_STRING )
            {
            // InternalTypoDSL.g:158:4: (lv_tldr_9_0= RULE_STRING )
            // InternalTypoDSL.g:159:5: lv_tldr_9_0= RULE_STRING
            {
            lv_tldr_9_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_tldr_9_0, grammarAccess.getDocumentAccess().getTldrSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tldr",
            						lv_tldr_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTypoDSL.g:175:3: ( (lv_blocks_10_0= ruleBlocks ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=19 && LA1_0<=22)||LA1_0==27||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTypoDSL.g:176:4: (lv_blocks_10_0= ruleBlocks )
            	    {
            	    // InternalTypoDSL.g:176:4: (lv_blocks_10_0= ruleBlocks )
            	    // InternalTypoDSL.g:177:5: lv_blocks_10_0= ruleBlocks
            	    {

            	    					newCompositeNode(grammarAccess.getDocumentAccess().getBlocksBlocksParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_blocks_10_0=ruleBlocks();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"blocks",
            	    						lv_blocks_10_0,
            	    						"adrf.xtext.TypoDSL.Blocks");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDocumentAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleBlocks"
    // InternalTypoDSL.g:202:1: entryRuleBlocks returns [EObject current=null] : iv_ruleBlocks= ruleBlocks EOF ;
    public final EObject entryRuleBlocks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlocks = null;


        try {
            // InternalTypoDSL.g:202:47: (iv_ruleBlocks= ruleBlocks EOF )
            // InternalTypoDSL.g:203:2: iv_ruleBlocks= ruleBlocks EOF
            {
             newCompositeNode(grammarAccess.getBlocksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlocks=ruleBlocks();

            state._fsp--;

             current =iv_ruleBlocks; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlocks"


    // $ANTLR start "ruleBlocks"
    // InternalTypoDSL.g:209:1: ruleBlocks returns [EObject current=null] : (this_Section_0= ruleSection | this_Subsection_1= ruleSubsection | this_Paragraph_2= ruleParagraph | this_Image_3= ruleImage | this_CodeBlock_4= ruleCodeBlock | this_Itemize_5= ruleItemize ) ;
    public final EObject ruleBlocks() throws RecognitionException {
        EObject current = null;

        EObject this_Section_0 = null;

        EObject this_Subsection_1 = null;

        EObject this_Paragraph_2 = null;

        EObject this_Image_3 = null;

        EObject this_CodeBlock_4 = null;

        EObject this_Itemize_5 = null;



        	enterRule();

        try {
            // InternalTypoDSL.g:215:2: ( (this_Section_0= ruleSection | this_Subsection_1= ruleSubsection | this_Paragraph_2= ruleParagraph | this_Image_3= ruleImage | this_CodeBlock_4= ruleCodeBlock | this_Itemize_5= ruleItemize ) )
            // InternalTypoDSL.g:216:2: (this_Section_0= ruleSection | this_Subsection_1= ruleSubsection | this_Paragraph_2= ruleParagraph | this_Image_3= ruleImage | this_CodeBlock_4= ruleCodeBlock | this_Itemize_5= ruleItemize )
            {
            // InternalTypoDSL.g:216:2: (this_Section_0= ruleSection | this_Subsection_1= ruleSubsection | this_Paragraph_2= ruleParagraph | this_Image_3= ruleImage | this_CodeBlock_4= ruleCodeBlock | this_Itemize_5= ruleItemize )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            case 30:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTypoDSL.g:217:3: this_Section_0= ruleSection
                    {

                    			newCompositeNode(grammarAccess.getBlocksAccess().getSectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Section_0=ruleSection();

                    state._fsp--;


                    			current = this_Section_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTypoDSL.g:226:3: this_Subsection_1= ruleSubsection
                    {

                    			newCompositeNode(grammarAccess.getBlocksAccess().getSubsectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Subsection_1=ruleSubsection();

                    state._fsp--;


                    			current = this_Subsection_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTypoDSL.g:235:3: this_Paragraph_2= ruleParagraph
                    {

                    			newCompositeNode(grammarAccess.getBlocksAccess().getParagraphParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Paragraph_2=ruleParagraph();

                    state._fsp--;


                    			current = this_Paragraph_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTypoDSL.g:244:3: this_Image_3= ruleImage
                    {

                    			newCompositeNode(grammarAccess.getBlocksAccess().getImageParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Image_3=ruleImage();

                    state._fsp--;


                    			current = this_Image_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTypoDSL.g:253:3: this_CodeBlock_4= ruleCodeBlock
                    {

                    			newCompositeNode(grammarAccess.getBlocksAccess().getCodeBlockParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodeBlock_4=ruleCodeBlock();

                    state._fsp--;


                    			current = this_CodeBlock_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTypoDSL.g:262:3: this_Itemize_5= ruleItemize
                    {

                    			newCompositeNode(grammarAccess.getBlocksAccess().getItemizeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Itemize_5=ruleItemize();

                    state._fsp--;


                    			current = this_Itemize_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlocks"


    // $ANTLR start "entryRuleSection"
    // InternalTypoDSL.g:274:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalTypoDSL.g:274:48: (iv_ruleSection= ruleSection EOF )
            // InternalTypoDSL.g:275:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalTypoDSL.g:281:1: ruleSection returns [EObject current=null] : (otherlv_0= '+section' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_blocks_2_0= ruleBlocks ) )* ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        EObject lv_blocks_2_0 = null;



        	enterRule();

        try {
            // InternalTypoDSL.g:287:2: ( (otherlv_0= '+section' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_blocks_2_0= ruleBlocks ) )* ) )
            // InternalTypoDSL.g:288:2: (otherlv_0= '+section' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_blocks_2_0= ruleBlocks ) )* )
            {
            // InternalTypoDSL.g:288:2: (otherlv_0= '+section' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_blocks_2_0= ruleBlocks ) )* )
            // InternalTypoDSL.g:289:3: otherlv_0= '+section' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_blocks_2_0= ruleBlocks ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            // InternalTypoDSL.g:293:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalTypoDSL.g:294:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalTypoDSL.g:294:4: (lv_title_1_0= RULE_STRING )
            // InternalTypoDSL.g:295:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_title_1_0, grammarAccess.getSectionAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTypoDSL.g:311:3: ( (lv_blocks_2_0= ruleBlocks ) )*
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt3=1;
                    }
                    break;
                case 20:
                    {
                    alt3=1;
                    }
                    break;
                case 21:
                    {
                    alt3=1;
                    }
                    break;
                case 22:
                    {
                    alt3=1;
                    }
                    break;
                case 27:
                    {
                    alt3=1;
                    }
                    break;
                case 30:
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalTypoDSL.g:312:4: (lv_blocks_2_0= ruleBlocks )
            	    {
            	    // InternalTypoDSL.g:312:4: (lv_blocks_2_0= ruleBlocks )
            	    // InternalTypoDSL.g:313:5: lv_blocks_2_0= ruleBlocks
            	    {

            	    					newCompositeNode(grammarAccess.getSectionAccess().getBlocksBlocksParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_blocks_2_0=ruleBlocks();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"blocks",
            	    						lv_blocks_2_0,
            	    						"adrf.xtext.TypoDSL.Blocks");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSubsection"
    // InternalTypoDSL.g:334:1: entryRuleSubsection returns [EObject current=null] : iv_ruleSubsection= ruleSubsection EOF ;
    public final EObject entryRuleSubsection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsection = null;


        try {
            // InternalTypoDSL.g:334:51: (iv_ruleSubsection= ruleSubsection EOF )
            // InternalTypoDSL.g:335:2: iv_ruleSubsection= ruleSubsection EOF
            {
             newCompositeNode(grammarAccess.getSubsectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubsection=ruleSubsection();

            state._fsp--;

             current =iv_ruleSubsection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubsection"


    // $ANTLR start "ruleSubsection"
    // InternalTypoDSL.g:341:1: ruleSubsection returns [EObject current=null] : (otherlv_0= '+sub' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_blocks_2_0= ruleBlocks ) )* ) ;
    public final EObject ruleSubsection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        EObject lv_blocks_2_0 = null;



        	enterRule();

        try {
            // InternalTypoDSL.g:347:2: ( (otherlv_0= '+sub' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_blocks_2_0= ruleBlocks ) )* ) )
            // InternalTypoDSL.g:348:2: (otherlv_0= '+sub' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_blocks_2_0= ruleBlocks ) )* )
            {
            // InternalTypoDSL.g:348:2: (otherlv_0= '+sub' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_blocks_2_0= ruleBlocks ) )* )
            // InternalTypoDSL.g:349:3: otherlv_0= '+sub' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_blocks_2_0= ruleBlocks ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSubsectionAccess().getSubKeyword_0());
            		
            // InternalTypoDSL.g:353:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalTypoDSL.g:354:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalTypoDSL.g:354:4: (lv_title_1_0= RULE_STRING )
            // InternalTypoDSL.g:355:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_title_1_0, grammarAccess.getSubsectionAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubsectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTypoDSL.g:371:3: ( (lv_blocks_2_0= ruleBlocks ) )*
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt4=1;
                    }
                    break;
                case 20:
                    {
                    alt4=1;
                    }
                    break;
                case 21:
                    {
                    alt4=1;
                    }
                    break;
                case 22:
                    {
                    alt4=1;
                    }
                    break;
                case 27:
                    {
                    alt4=1;
                    }
                    break;
                case 30:
                    {
                    alt4=1;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // InternalTypoDSL.g:372:4: (lv_blocks_2_0= ruleBlocks )
            	    {
            	    // InternalTypoDSL.g:372:4: (lv_blocks_2_0= ruleBlocks )
            	    // InternalTypoDSL.g:373:5: lv_blocks_2_0= ruleBlocks
            	    {

            	    					newCompositeNode(grammarAccess.getSubsectionAccess().getBlocksBlocksParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_blocks_2_0=ruleBlocks();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubsectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"blocks",
            	    						lv_blocks_2_0,
            	    						"adrf.xtext.TypoDSL.Blocks");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubsection"


    // $ANTLR start "entryRuleParagraph"
    // InternalTypoDSL.g:394:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // InternalTypoDSL.g:394:50: (iv_ruleParagraph= ruleParagraph EOF )
            // InternalTypoDSL.g:395:2: iv_ruleParagraph= ruleParagraph EOF
            {
             newCompositeNode(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParagraph=ruleParagraph();

            state._fsp--;

             current =iv_ruleParagraph; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // InternalTypoDSL.g:401:1: ruleParagraph returns [EObject current=null] : (otherlv_0= '+p' ( (lv_inlineitems_1_0= ruleInlineItem ) )+ ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_inlineitems_1_0 = null;



        	enterRule();

        try {
            // InternalTypoDSL.g:407:2: ( (otherlv_0= '+p' ( (lv_inlineitems_1_0= ruleInlineItem ) )+ ) )
            // InternalTypoDSL.g:408:2: (otherlv_0= '+p' ( (lv_inlineitems_1_0= ruleInlineItem ) )+ )
            {
            // InternalTypoDSL.g:408:2: (otherlv_0= '+p' ( (lv_inlineitems_1_0= ruleInlineItem ) )+ )
            // InternalTypoDSL.g:409:3: otherlv_0= '+p' ( (lv_inlineitems_1_0= ruleInlineItem ) )+
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getParagraphAccess().getPKeyword_0());
            		
            // InternalTypoDSL.g:413:3: ( (lv_inlineitems_1_0= ruleInlineItem ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=32 && LA5_0<=35)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTypoDSL.g:414:4: (lv_inlineitems_1_0= ruleInlineItem )
            	    {
            	    // InternalTypoDSL.g:414:4: (lv_inlineitems_1_0= ruleInlineItem )
            	    // InternalTypoDSL.g:415:5: lv_inlineitems_1_0= ruleInlineItem
            	    {

            	    					newCompositeNode(grammarAccess.getParagraphAccess().getInlineitemsInlineItemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_inlineitems_1_0=ruleInlineItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParagraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inlineitems",
            	    						lv_inlineitems_1_0,
            	    						"adrf.xtext.TypoDSL.InlineItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleImage"
    // InternalTypoDSL.g:436:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalTypoDSL.g:436:46: (iv_ruleImage= ruleImage EOF )
            // InternalTypoDSL.g:437:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalTypoDSL.g:443:1: ruleImage returns [EObject current=null] : (otherlv_0= '+img' otherlv_1= '{' otherlv_2= 'url:' ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height:' ( (lv_height_7_0= RULE_INT ) ) (otherlv_8= 'caption:' ( (lv_caption_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_url_3_0=null;
        Token otherlv_4=null;
        Token lv_width_5_0=null;
        Token otherlv_6=null;
        Token lv_height_7_0=null;
        Token otherlv_8=null;
        Token lv_caption_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalTypoDSL.g:449:2: ( (otherlv_0= '+img' otherlv_1= '{' otherlv_2= 'url:' ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height:' ( (lv_height_7_0= RULE_INT ) ) (otherlv_8= 'caption:' ( (lv_caption_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalTypoDSL.g:450:2: (otherlv_0= '+img' otherlv_1= '{' otherlv_2= 'url:' ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height:' ( (lv_height_7_0= RULE_INT ) ) (otherlv_8= 'caption:' ( (lv_caption_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalTypoDSL.g:450:2: (otherlv_0= '+img' otherlv_1= '{' otherlv_2= 'url:' ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height:' ( (lv_height_7_0= RULE_INT ) ) (otherlv_8= 'caption:' ( (lv_caption_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalTypoDSL.g:451:3: otherlv_0= '+img' otherlv_1= '{' otherlv_2= 'url:' ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height:' ( (lv_height_7_0= RULE_INT ) ) (otherlv_8= 'caption:' ( (lv_caption_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImgKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getImageAccess().getUrlKeyword_2());
            		
            // InternalTypoDSL.g:463:3: ( (lv_url_3_0= RULE_STRING ) )
            // InternalTypoDSL.g:464:4: (lv_url_3_0= RULE_STRING )
            {
            // InternalTypoDSL.g:464:4: (lv_url_3_0= RULE_STRING )
            // InternalTypoDSL.g:465:5: lv_url_3_0= RULE_STRING
            {
            lv_url_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_url_3_0, grammarAccess.getImageAccess().getUrlSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getImageAccess().getWidthKeyword_4());
            		
            // InternalTypoDSL.g:485:3: ( (lv_width_5_0= RULE_INT ) )
            // InternalTypoDSL.g:486:4: (lv_width_5_0= RULE_INT )
            {
            // InternalTypoDSL.g:486:4: (lv_width_5_0= RULE_INT )
            // InternalTypoDSL.g:487:5: lv_width_5_0= RULE_INT
            {
            lv_width_5_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_width_5_0, grammarAccess.getImageAccess().getWidthINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getImageAccess().getHeightKeyword_6());
            		
            // InternalTypoDSL.g:507:3: ( (lv_height_7_0= RULE_INT ) )
            // InternalTypoDSL.g:508:4: (lv_height_7_0= RULE_INT )
            {
            // InternalTypoDSL.g:508:4: (lv_height_7_0= RULE_INT )
            // InternalTypoDSL.g:509:5: lv_height_7_0= RULE_INT
            {
            lv_height_7_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_height_7_0, grammarAccess.getImageAccess().getHeightINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalTypoDSL.g:525:3: (otherlv_8= 'caption:' ( (lv_caption_9_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTypoDSL.g:526:4: otherlv_8= 'caption:' ( (lv_caption_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getImageAccess().getCaptionKeyword_8_0());
                    			
                    // InternalTypoDSL.g:530:4: ( (lv_caption_9_0= RULE_STRING ) )
                    // InternalTypoDSL.g:531:5: (lv_caption_9_0= RULE_STRING )
                    {
                    // InternalTypoDSL.g:531:5: (lv_caption_9_0= RULE_STRING )
                    // InternalTypoDSL.g:532:6: lv_caption_9_0= RULE_STRING
                    {
                    lv_caption_9_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    						newLeafNode(lv_caption_9_0, grammarAccess.getImageAccess().getCaptionSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"caption",
                    							lv_caption_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getImageAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleCodeBlock"
    // InternalTypoDSL.g:557:1: entryRuleCodeBlock returns [EObject current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final EObject entryRuleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeBlock = null;


        try {
            // InternalTypoDSL.g:557:50: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // InternalTypoDSL.g:558:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
             newCompositeNode(grammarAccess.getCodeBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeBlock=ruleCodeBlock();

            state._fsp--;

             current =iv_ruleCodeBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeBlock"


    // $ANTLR start "ruleCodeBlock"
    // InternalTypoDSL.g:564:1: ruleCodeBlock returns [EObject current=null] : (otherlv_0= '+code' otherlv_1= '{' otherlv_2= 'language:' ( (lv_language_3_0= RULE_STRING ) ) otherlv_4= 'text:' ( (lv_text_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleCodeBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_language_3_0=null;
        Token otherlv_4=null;
        Token lv_text_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalTypoDSL.g:570:2: ( (otherlv_0= '+code' otherlv_1= '{' otherlv_2= 'language:' ( (lv_language_3_0= RULE_STRING ) ) otherlv_4= 'text:' ( (lv_text_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalTypoDSL.g:571:2: (otherlv_0= '+code' otherlv_1= '{' otherlv_2= 'language:' ( (lv_language_3_0= RULE_STRING ) ) otherlv_4= 'text:' ( (lv_text_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalTypoDSL.g:571:2: (otherlv_0= '+code' otherlv_1= '{' otherlv_2= 'language:' ( (lv_language_3_0= RULE_STRING ) ) otherlv_4= 'text:' ( (lv_text_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalTypoDSL.g:572:3: otherlv_0= '+code' otherlv_1= '{' otherlv_2= 'language:' ( (lv_language_3_0= RULE_STRING ) ) otherlv_4= 'text:' ( (lv_text_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCodeBlockAccess().getCodeKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCodeBlockAccess().getLanguageKeyword_2());
            		
            // InternalTypoDSL.g:584:3: ( (lv_language_3_0= RULE_STRING ) )
            // InternalTypoDSL.g:585:4: (lv_language_3_0= RULE_STRING )
            {
            // InternalTypoDSL.g:585:4: (lv_language_3_0= RULE_STRING )
            // InternalTypoDSL.g:586:5: lv_language_3_0= RULE_STRING
            {
            lv_language_3_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_language_3_0, grammarAccess.getCodeBlockAccess().getLanguageSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCodeBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getCodeBlockAccess().getTextKeyword_4());
            		
            // InternalTypoDSL.g:606:3: ( (lv_text_5_0= RULE_STRING ) )
            // InternalTypoDSL.g:607:4: (lv_text_5_0= RULE_STRING )
            {
            // InternalTypoDSL.g:607:4: (lv_text_5_0= RULE_STRING )
            // InternalTypoDSL.g:608:5: lv_text_5_0= RULE_STRING
            {
            lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_text_5_0, grammarAccess.getCodeBlockAccess().getTextSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCodeBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCodeBlockAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeBlock"


    // $ANTLR start "entryRuleItemize"
    // InternalTypoDSL.g:632:1: entryRuleItemize returns [EObject current=null] : iv_ruleItemize= ruleItemize EOF ;
    public final EObject entryRuleItemize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemize = null;


        try {
            // InternalTypoDSL.g:632:48: (iv_ruleItemize= ruleItemize EOF )
            // InternalTypoDSL.g:633:2: iv_ruleItemize= ruleItemize EOF
            {
             newCompositeNode(grammarAccess.getItemizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemize=ruleItemize();

            state._fsp--;

             current =iv_ruleItemize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemize"


    // $ANTLR start "ruleItemize"
    // InternalTypoDSL.g:639:1: ruleItemize returns [EObject current=null] : (otherlv_0= '+list' ( (lv_items_1_0= ruleListItem ) )+ ) ;
    public final EObject ruleItemize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalTypoDSL.g:645:2: ( (otherlv_0= '+list' ( (lv_items_1_0= ruleListItem ) )+ ) )
            // InternalTypoDSL.g:646:2: (otherlv_0= '+list' ( (lv_items_1_0= ruleListItem ) )+ )
            {
            // InternalTypoDSL.g:646:2: (otherlv_0= '+list' ( (lv_items_1_0= ruleListItem ) )+ )
            // InternalTypoDSL.g:647:3: otherlv_0= '+list' ( (lv_items_1_0= ruleListItem ) )+
            {
            otherlv_0=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getItemizeAccess().getListKeyword_0());
            		
            // InternalTypoDSL.g:651:3: ( (lv_items_1_0= ruleListItem ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTypoDSL.g:652:4: (lv_items_1_0= ruleListItem )
            	    {
            	    // InternalTypoDSL.g:652:4: (lv_items_1_0= ruleListItem )
            	    // InternalTypoDSL.g:653:5: lv_items_1_0= ruleListItem
            	    {

            	    					newCompositeNode(grammarAccess.getItemizeAccess().getItemsListItemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_items_1_0=ruleListItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getItemizeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_1_0,
            	    						"adrf.xtext.TypoDSL.ListItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemize"


    // $ANTLR start "entryRuleListItem"
    // InternalTypoDSL.g:674:1: entryRuleListItem returns [EObject current=null] : iv_ruleListItem= ruleListItem EOF ;
    public final EObject entryRuleListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListItem = null;


        try {
            // InternalTypoDSL.g:674:49: (iv_ruleListItem= ruleListItem EOF )
            // InternalTypoDSL.g:675:2: iv_ruleListItem= ruleListItem EOF
            {
             newCompositeNode(grammarAccess.getListItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListItem=ruleListItem();

            state._fsp--;

             current =iv_ruleListItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListItem"


    // $ANTLR start "ruleListItem"
    // InternalTypoDSL.g:681:1: ruleListItem returns [EObject current=null] : (otherlv_0= '-' ( (lv_inline_1_0= ruleInlineItem ) ) ) ;
    public final EObject ruleListItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_inline_1_0 = null;



        	enterRule();

        try {
            // InternalTypoDSL.g:687:2: ( (otherlv_0= '-' ( (lv_inline_1_0= ruleInlineItem ) ) ) )
            // InternalTypoDSL.g:688:2: (otherlv_0= '-' ( (lv_inline_1_0= ruleInlineItem ) ) )
            {
            // InternalTypoDSL.g:688:2: (otherlv_0= '-' ( (lv_inline_1_0= ruleInlineItem ) ) )
            // InternalTypoDSL.g:689:3: otherlv_0= '-' ( (lv_inline_1_0= ruleInlineItem ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getListItemAccess().getHyphenMinusKeyword_0());
            		
            // InternalTypoDSL.g:693:3: ( (lv_inline_1_0= ruleInlineItem ) )
            // InternalTypoDSL.g:694:4: (lv_inline_1_0= ruleInlineItem )
            {
            // InternalTypoDSL.g:694:4: (lv_inline_1_0= ruleInlineItem )
            // InternalTypoDSL.g:695:5: lv_inline_1_0= ruleInlineItem
            {

            					newCompositeNode(grammarAccess.getListItemAccess().getInlineInlineItemParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_inline_1_0=ruleInlineItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListItemRule());
            					}
            					add(
            						current,
            						"inline",
            						lv_inline_1_0,
            						"adrf.xtext.TypoDSL.InlineItem");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListItem"


    // $ANTLR start "entryRuleInlineItem"
    // InternalTypoDSL.g:716:1: entryRuleInlineItem returns [EObject current=null] : iv_ruleInlineItem= ruleInlineItem EOF ;
    public final EObject entryRuleInlineItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineItem = null;


        try {
            // InternalTypoDSL.g:716:51: (iv_ruleInlineItem= ruleInlineItem EOF )
            // InternalTypoDSL.g:717:2: iv_ruleInlineItem= ruleInlineItem EOF
            {
             newCompositeNode(grammarAccess.getInlineItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInlineItem=ruleInlineItem();

            state._fsp--;

             current =iv_ruleInlineItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInlineItem"


    // $ANTLR start "ruleInlineItem"
    // InternalTypoDSL.g:723:1: ruleInlineItem returns [EObject current=null] : (this_Normal_0= ruleNormal | this_Bold_1= ruleBold | this_Italic_2= ruleItalic | this_Link_3= ruleLink ) ;
    public final EObject ruleInlineItem() throws RecognitionException {
        EObject current = null;

        EObject this_Normal_0 = null;

        EObject this_Bold_1 = null;

        EObject this_Italic_2 = null;

        EObject this_Link_3 = null;



        	enterRule();

        try {
            // InternalTypoDSL.g:729:2: ( (this_Normal_0= ruleNormal | this_Bold_1= ruleBold | this_Italic_2= ruleItalic | this_Link_3= ruleLink ) )
            // InternalTypoDSL.g:730:2: (this_Normal_0= ruleNormal | this_Bold_1= ruleBold | this_Italic_2= ruleItalic | this_Link_3= ruleLink )
            {
            // InternalTypoDSL.g:730:2: (this_Normal_0= ruleNormal | this_Bold_1= ruleBold | this_Italic_2= ruleItalic | this_Link_3= ruleLink )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            case 35:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTypoDSL.g:731:3: this_Normal_0= ruleNormal
                    {

                    			newCompositeNode(grammarAccess.getInlineItemAccess().getNormalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Normal_0=ruleNormal();

                    state._fsp--;


                    			current = this_Normal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTypoDSL.g:740:3: this_Bold_1= ruleBold
                    {

                    			newCompositeNode(grammarAccess.getInlineItemAccess().getBoldParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bold_1=ruleBold();

                    state._fsp--;


                    			current = this_Bold_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTypoDSL.g:749:3: this_Italic_2= ruleItalic
                    {

                    			newCompositeNode(grammarAccess.getInlineItemAccess().getItalicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Italic_2=ruleItalic();

                    state._fsp--;


                    			current = this_Italic_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTypoDSL.g:758:3: this_Link_3= ruleLink
                    {

                    			newCompositeNode(grammarAccess.getInlineItemAccess().getLinkParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Link_3=ruleLink();

                    state._fsp--;


                    			current = this_Link_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInlineItem"


    // $ANTLR start "entryRuleNormal"
    // InternalTypoDSL.g:770:1: entryRuleNormal returns [EObject current=null] : iv_ruleNormal= ruleNormal EOF ;
    public final EObject entryRuleNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormal = null;


        try {
            // InternalTypoDSL.g:770:47: (iv_ruleNormal= ruleNormal EOF )
            // InternalTypoDSL.g:771:2: iv_ruleNormal= ruleNormal EOF
            {
             newCompositeNode(grammarAccess.getNormalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormal=ruleNormal();

            state._fsp--;

             current =iv_ruleNormal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNormal"


    // $ANTLR start "ruleNormal"
    // InternalTypoDSL.g:777:1: ruleNormal returns [EObject current=null] : (otherlv_0= '*' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNormal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalTypoDSL.g:783:2: ( (otherlv_0= '*' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalTypoDSL.g:784:2: (otherlv_0= '*' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalTypoDSL.g:784:2: (otherlv_0= '*' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalTypoDSL.g:785:3: otherlv_0= '*' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNormalAccess().getAsteriskKeyword_0());
            		
            // InternalTypoDSL.g:789:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalTypoDSL.g:790:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalTypoDSL.g:790:4: (lv_text_1_0= RULE_STRING )
            // InternalTypoDSL.g:791:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getNormalAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNormalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNormal"


    // $ANTLR start "entryRuleBold"
    // InternalTypoDSL.g:811:1: entryRuleBold returns [EObject current=null] : iv_ruleBold= ruleBold EOF ;
    public final EObject entryRuleBold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBold = null;


        try {
            // InternalTypoDSL.g:811:45: (iv_ruleBold= ruleBold EOF )
            // InternalTypoDSL.g:812:2: iv_ruleBold= ruleBold EOF
            {
             newCompositeNode(grammarAccess.getBoldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBold=ruleBold();

            state._fsp--;

             current =iv_ruleBold; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBold"


    // $ANTLR start "ruleBold"
    // InternalTypoDSL.g:818:1: ruleBold returns [EObject current=null] : (otherlv_0= '~bold' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalTypoDSL.g:824:2: ( (otherlv_0= '~bold' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalTypoDSL.g:825:2: (otherlv_0= '~bold' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalTypoDSL.g:825:2: (otherlv_0= '~bold' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalTypoDSL.g:826:3: otherlv_0= '~bold' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBoldAccess().getBoldKeyword_0());
            		
            // InternalTypoDSL.g:830:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalTypoDSL.g:831:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalTypoDSL.g:831:4: (lv_text_1_0= RULE_STRING )
            // InternalTypoDSL.g:832:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getBoldAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBold"


    // $ANTLR start "entryRuleItalic"
    // InternalTypoDSL.g:852:1: entryRuleItalic returns [EObject current=null] : iv_ruleItalic= ruleItalic EOF ;
    public final EObject entryRuleItalic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalic = null;


        try {
            // InternalTypoDSL.g:852:47: (iv_ruleItalic= ruleItalic EOF )
            // InternalTypoDSL.g:853:2: iv_ruleItalic= ruleItalic EOF
            {
             newCompositeNode(grammarAccess.getItalicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItalic=ruleItalic();

            state._fsp--;

             current =iv_ruleItalic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItalic"


    // $ANTLR start "ruleItalic"
    // InternalTypoDSL.g:859:1: ruleItalic returns [EObject current=null] : (otherlv_0= '~italic' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleItalic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalTypoDSL.g:865:2: ( (otherlv_0= '~italic' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalTypoDSL.g:866:2: (otherlv_0= '~italic' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalTypoDSL.g:866:2: (otherlv_0= '~italic' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalTypoDSL.g:867:3: otherlv_0= '~italic' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getItalicAccess().getItalicKeyword_0());
            		
            // InternalTypoDSL.g:871:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalTypoDSL.g:872:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalTypoDSL.g:872:4: (lv_text_1_0= RULE_STRING )
            // InternalTypoDSL.g:873:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getItalicAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItalicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItalic"


    // $ANTLR start "entryRuleLink"
    // InternalTypoDSL.g:893:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalTypoDSL.g:893:45: (iv_ruleLink= ruleLink EOF )
            // InternalTypoDSL.g:894:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalTypoDSL.g:900:1: ruleLink returns [EObject current=null] : (otherlv_0= '~link' otherlv_1= '{' otherlv_2= 'url:' ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= 'text:' ( (lv_text_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_url_3_0=null;
        Token otherlv_4=null;
        Token lv_text_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalTypoDSL.g:906:2: ( (otherlv_0= '~link' otherlv_1= '{' otherlv_2= 'url:' ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= 'text:' ( (lv_text_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalTypoDSL.g:907:2: (otherlv_0= '~link' otherlv_1= '{' otherlv_2= 'url:' ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= 'text:' ( (lv_text_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalTypoDSL.g:907:2: (otherlv_0= '~link' otherlv_1= '{' otherlv_2= 'url:' ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= 'text:' ( (lv_text_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalTypoDSL.g:908:3: otherlv_0= '~link' otherlv_1= '{' otherlv_2= 'url:' ( (lv_url_3_0= RULE_STRING ) ) otherlv_4= 'text:' ( (lv_text_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getUrlKeyword_2());
            		
            // InternalTypoDSL.g:920:3: ( (lv_url_3_0= RULE_STRING ) )
            // InternalTypoDSL.g:921:4: (lv_url_3_0= RULE_STRING )
            {
            // InternalTypoDSL.g:921:4: (lv_url_3_0= RULE_STRING )
            // InternalTypoDSL.g:922:5: lv_url_3_0= RULE_STRING
            {
            lv_url_3_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_url_3_0, grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getTextKeyword_4());
            		
            // InternalTypoDSL.g:942:3: ( (lv_text_5_0= RULE_STRING ) )
            // InternalTypoDSL.g:943:4: (lv_text_5_0= RULE_STRING )
            {
            // InternalTypoDSL.g:943:4: (lv_text_5_0= RULE_STRING )
            // InternalTypoDSL.g:944:5: lv_text_5_0= RULE_STRING
            {
            lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_text_5_0, grammarAccess.getLinkAccess().getTextSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000487C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000048780002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});

}