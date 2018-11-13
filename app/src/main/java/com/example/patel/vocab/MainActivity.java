package com.example.patel.vocab;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.renderscript.Element;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


import java.io.IOException;
import java.util.Random;


public class MainActivity extends ActionBarActivity {

    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=openOrCreateDatabase("vocab",MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS definations(word VARCHAR,small VARCHAR,large VARCHAR);");



        Button search=(Button)findViewById(R.id.search_button);
        Button random=(Button)findViewById(R.id.randomButton);

        final String words[]={"abacus","abate","abdication","aberration","abet","abeyance","abhor","abide","abjure","abraded","abrogate","abscond","abstruse","abut","abysmal","acarpous","acclaimed","accolade","accretion","adamant","admonitory","adorn","adulteration","affable","affinity","aggravate","agile","agog","ail","alacrity","alcove","allegiance","alleviate","alloy","aloof","amalgamate","ambidextrous","ambiguous","ambivalent","ameliorate","amortize","anguish","animosity","antidote","antithetical","apartheid","aplomb","apostate","apotheosis","appease","apprehensive","apprise","approbation","apropos","apt","arabesque","arboreal","ardor","arduous","argot","arrant","arrogance","articulate","ascend","ascertain","ascetic","ascribe","aseptic","asperity","aspersion","assail","assiduous","assuage","asterisk","astringent","astute","atonement","attenuate","attune","audacious","augury","august","auspicious","austere","auxiliary","aver","aversion","avid","avow","baleful","balk","baneful","barrage","barren","bask","beatify","bedizen","belabor","bellicose","belligerent","benefactor","benevolence","benign","bequest","berate","bereft","bewilder","bigot","bilge","blandishment","blandness","blatant","blithe","bogus","boisterous","bolster","boorish","brash","brass","brazen","breach","brittle","broach","brook","buoyant","burgeon","burnish","cabal","cadge","cajole","calipers","calumny","candid","cant","cantankerous","canvass","castigate","castigation","catalyst","caustic","censure","centurion","chary","chastened","chastisement","chauvinist","chicanery","chisel","churl","clamor","clientele","clinch","cling","clot","cloture","coagulation","coalescing","coax","coda","coddle","coerce","coeval","cogent","cogitate","cognizant","colander","collusion","combustion","commemorate","commodious","commuter","complaisance","compunction","conceal","conceit","conciliatory","concord","concur","condense","condone","congeal","conjoin","connoisseur","connotation","consequential","console","conspicuous","consternation","constrain","constrict","consume","consummate","contemn","contentious","contiguous","contrite","contumacious","conundrum","conviction","convoke","convoluted","cordial","cordon","cornucopia","corporeal","correlate","corroboration","countenance","counterfeit","countervail","covert","covetous","cower","coy","crass","cravat","craven","crease","credulity","credulous","crush","cryptic","cumbersome","curmudgeon","curriculum","cursory","curtail","dainty","daunt","dawdler","dearth","debacle","decorum","decree","decry","defer","deferential","defiance","delineate","deluge","demagogue","demur","denigrate","denouement","deplete","deposition","deprave","deprecate","dereliction","derision","derivative","derogatory","descry","desiccant","desuetude","desultory","deter","detraction","detumescence","deviance","dexterity","diaphanous","diatribe","diffidence","dilate","disallow","discern","discomfit","disconcert","discountenance","discourse","discredit","discreet","discrete","disdain","disencumber","disheveled","disingenuous","disinter","dislodge","dismal","disparate","disproof","dissemble","disseminate","dissent","dissolution","distraught","divergence","divestiture","divulge","doggerel","dogmatic","dolt","dormant","dote","drawl","droll","drone","drowsiness","dubious","dud","dulcet","dupe","duplicity","duress","dwarf","dynamo","earthenware","ebullience","ebullient","ecumenical","edacious","eddy","edible","effete","efficacy","effluvia","effrontery","egress","elaborate","elegy","elicit","eloquence","emaciate","embellish","embezzle","emote","empirical","encapsulate","encomium","encumbrance","endearing","endemic","endorse","enduring","enervate","engender","engrave","engrossing","engulf","enigma","enmity","ensign","entangle","enthral","entice","entreat","enunciate","enzyme","epicurean","epistle","epithet","epitome","equable","equanimity","equilibrium","equipoise","equivocal","equivocate","eradicate","erratic","erudite","eschew","esoteric","espouse","eulogy","euphoria","euthanasia","evasive","evince","evoke","excoriation","exculpate","exhaustive","exigency","exoneration","exorbitant","expatiate","expedient","expiation","exploit","expostulate","expurgate","exscind","extant","extempore","extenuate","extinct","extinguish","extirpate","extol","extort","extralegal","extricable","extrovert","exuberance","facetious","facile","fallacious","falter","fatuous","fawn","feckless","fecund","feint","felicitous","felon","ferment","ferocity","ferret","fervid","fervor","fetid","fetter","feud","fidelity","fidget","figurehead","finesse","finical","finicky","fission","fixate","flak","flamboyant","flaunting","flax","fledged","fleet","flinch","flop","florid","flout","fluke","fluster","foible","foil","foment","foolproof","foppish","forage","forbear","forbearance","ford","forestall","forfeit","forge","forgery","forswear","foster","fracas","fragile","fragrant","frantic","frenetic","fret","fringe","froward","frugal","fulmination","fulsome","gainsay","garble","garment","garner","garrulity","garrulous","gaucherie","germane","gist","glean","glib","glimmer","gloat","glut","gnaw","goad","gorge","gossamer","gouge","grandiloquent","grave","graze","gregarious","grievous","grovel","guile","gullible","gush","gust","hack","halcyon","hallow","harangue","harbinger","harrow","haughty","heed","heinous","heresy","hermetic","heterogeneous","hew","highbrow","hirsute","hoax","hoi","hollow","holster","homiletics","hone","hoodwink","hospitable","hubris","hush","husk","hypocrisy","iconoclast","idiosyncrasy","idolatry","idyll","ignoble","ignominious","illicit","imbroglio","immaculate","imminent","immutable","impair","impassive","impecunious","impede","impediment","impending","imperative","imperious","impermeable","imperturbable","impervious","imperviousness","impetuous","impiety","implacable","implicate","implicit","implosion","importune","imprecation","impromptu","impudent","impugned","impute","inadvertent","inane","inasmuch","incense","incessant","inchoate","incipient","incise","incite","inclined","incongruous","incorrigibility","incredulous","inculcate","incumbents","incursion","indefatigability","indelible","indigence","indigenous","indistinct","indolence","indomitable","indulge","indulgent","ineffable","ineluctable","inept","ineptitude","inferno","infuriate","infuse","ingenuous","ingest","inimical","inimitable","innocuous","inscrutable","insensible","insinuate","insipid","insouciant","insularity","insurrection","interdict","interim","intersperse","intransigence","intransigent","intrepid","introspection","inundate","inured","invective","inveigh","inveterate","invincible","involute","irascible","irate","ire","irksome","irresolute","irrevocable","itinerate","jabber","jibe","jocular","judicious","knit","labyrinthine","lachrymose","lackluster","lament","lassitude","latent","laudatory","lavish","legacy","levee","levity","libel","liberality","libertine","lien","limn","limp","lionize","lithe","loll","lope","loquacious","lucubrate","luculent","lugubrious","lull","lumber","luminary","lurk","lustrous","macabre","macerate","machination","maladroit","malapropism","malevolence","malign","malinger","malleable","manacle","massacre","matriculation","maudlin","maul","maverick","mellifluous","mendacity","mendicant","mercurial","meretricious","mesmerize","meticulous","mettle","mettlesome","middling","minatory","mince","misanthrope","mischievous","miser","misogynist","moderation","mollify","molt","morbid","morose","muffler","multifarious","mundane","myriad","nadir","nascent","nebulous","negligent","neophyte","nexus","nibble","noisome","nonchalant","nonplused","nostrum","noxious","nugatory","obdurate","obfuscate","oblivious","obloquy","obsequious","obstreperous","obtain","obtrusive","obtuse","obviate","occluded","odious","odium","odor","officious","ominous","onerous","opaqueness","opprobrious","ossify","ostensible","ostentation","ostracism","overhaul","overweening","paean","palate","palatial","palliate","palpability","palpitate","panegyric","paradigm","parenthesis","pariah","parsimonious","partisan","patron","paucity","peccadillo","pedantic","pedestrian","pellucid","penchant","penitent","penurious","penury","peregrination","peremptory","perfidious","perfidy","perfunctory","perilous","peripatetic","perish","perjury","permeate","pernicious","perpetrate","personable","perspicacity","pertain","pest","petrified","petrify","petrous","petulant","philistine","phlegmatic","picaresque","pied","pinch","pine","pious","piquant","pique","pitfall","pith","pivotal","placate","plaintive","plaque","platitude","plea","plead","plethora","pliant","plod","pluck","plumb","plummet","plunge","poignant","poncho","ponderous","portent","precarious","precepts","preclude","precursory","predilection","predominate","preen","premature","preponderance","presage","presumption","preternatural","prevalent","prevaricate","prim","pristine","probity","proclivity","procrastination","prodigal","prodigious","profane","profligacy","profligate","profundity","profuse","proliferate","prolix","prone","propagation","propinquity","propitiatory","propitious","prosaic","proscribe","protracted","provident","provisional","provoke","prudence","prudish","prune","pry","pucker","pugnacious","puissance","punctilious","pundit","pungency","purvey","pusillanimous","putrefaction","pyre","quack","quaff","quail","qualm","quandary","quell","quibble","quiescence","quiescent","quirk","quixotic","quotidian","rabble","raconteur","raffish","ramify","rancorous","rant","rapacious","rarefy","rave","reactionary","rebuff","recalcitrant","recant","recast","recidivism","reciprocity","recitals","recluse","recompense","reconcile","recondite","recreancy","recuperate","redeem","redoubtable","refine","refractory","refulgent","regale","regicide","reiterate","rejuvenation","relapse","remonstrate","render","renovate","renowned","repast","repel","repine","reproach","reprobate","repudiate","repulsive","requite","rescind","resigned","resilience","resort","restive","resuscitation","retard","reticent","revere","reverent","riddle","rift","rivet","roll","rotund","ruffian","rumple","sagacious","salacious","salubrious","salutary","sanctimony","sanction","sanguine","sanity","sash","satiate","saturnine","savant","savor","sawdust","scabbard","scent","scorch","scribble","scurvy","secular","sedulous","seminal","sententious","sequence","sere","sermon","serrated","serration","servile","sever","severance","shallow","shard","sheath","shrewd","shrill","shun","shunt","sidestep","simper","sinuous","skiff","skit","slack","slake","slate","sluggard","slur","smolder","snare","snub","soar","sober","sobriety","sodden","soggy","solvent","somatic","soot","sophisticated","sophistry","sophomoric","soporific","sordid","spear","specious","splenetic","splice","sponge","spurious","spurn","squalid","squander","squat","stanch","steeply","stentorian","stickler","stigma","stigmatize","sting","stingy","stint","stipple","stipulate","stolid","stray","streak","striated","stride","strut","stygian","stymie","subdue","sublime","submerge","suborn","subpoena","substantiation","subsume","succor","suffice","suffocate","sullied","summarily","sumptuous","sundry","supercilious","superfluous","superimpose","supersede","supine","suppliant","supplicate","suppress","surcharge","surfeit","susceptibility","swerve","sycophant","synopsis","taciturn","tadpole","talon","tamp","tamper","tangential","tarnished","tassel","taunt","taut","tautology","tawdry","teetotal","temerity","temperance","temperate","tenacity","tenuous","tepid","terse","testiness","thrift","thwart","timid","timorous","toady","tonic","topple","torment","torpid","torque","tortuous","tout","tractable","transgress","transient","transitory","travesty","trenchant","trepidation","trickle","trifling","trite","truce","truculence","trudge","turbid","turbulence","turgid","turmoil","turpitude","turquoise","tyro","ubiquitous","ulterior","umbrage","uncouth","underbid","undermine","undulate","unearth","unencumbered","unfeigned","unscathed","untoward","upbraid","urbane","vacillation","vagary","vain","valiant","valorous","vanquish","veer","venal","veneer","veneration","veracity","verdant","verisimilitude","veritable","verve","vestige","vex","vigilance","vigilant","vigorous","vilify","vindictive","virago","visceral","viscous","vitiate","vituperate","vivacious","volatile","volubility","voluble","waffle","waft","wag","warmonger","warrant","wean","weigh","welter","wend","whimsical","wince","woo","writ","yarn"};

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText searchBox=(EditText)findViewById(R.id.searchTerm);
                String term=searchBox.getText().toString();
                Cursor resultSet = db.rawQuery("Select * from definations where word=?",new String[]{term});
                if(resultSet.getCount()!=0)
                {
                    //load from database
                    resultSet.moveToFirst();
                    TextView tv1=(TextView)findViewById(R.id.resultSmall);
                    TextView tv2=(TextView)findViewById(R.id.resultLarge);
                    tv1.setText(resultSet.getString(1));
                    tv2.setText(resultSet.getString(2));


                }
                else
                {
                    // fetch from internet and insert into database
                    new loadDefination().execute(term);

                }




            }
        });

        random.setOnClickListener(new View.OnClickListener(){

            Random ran=new Random();
            public void onClick(View v) {
                EditText searchBox=(EditText)findViewById(R.id.searchTerm);
                searchBox.setText(words[ran.nextInt(words.length)]);

                String term=searchBox.getText().toString();
                Cursor resultSet = db.rawQuery("Select * from definations where word=?",new String[]{term});
                if(resultSet.getCount()!=0)
                {
                    //load from database
                    resultSet.moveToFirst();
                    TextView tv1=(TextView)findViewById(R.id.resultSmall);
                    TextView tv2=(TextView)findViewById(R.id.resultLarge);
                    tv1.setText(resultSet.getString(1));
                    tv2.setText(resultSet.getString(2));


                }
                else
                {
                    // fetch from internet and insert into database
                    new loadDefination().execute(term);

                }


            }



        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public class loadDefination extends AsyncTask<String,String,String[]>{

        @Override
        protected String[] doInBackground(String... params) {


            String shortText=null,longText=null;
            try {
                Document doc= Jsoup.connect("https://www.vocabulary.com/dictionary/"+params[0]).get();
                if(doc.select(".blurb .short").first()!=null) {
                    shortText = doc.select(".blurb .short").first().text();
                    longText = doc.select(".blurb .long").first().text();
                }
                else
                {
                    shortText="Nothing Available";
                    longText="";
                }
                //String def=doc.
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] res={params[0],shortText,longText};


            return res;

        }
        protected void onPostExecute(String[] result){

            ContentValues values=new ContentValues();
            values.put("word",result[0]);
            values.put("small",result[1]);
            values.put("large",result[2]);

            db.insert("definations",null,values);

            TextView tv1=(TextView)findViewById(R.id.resultSmall);
            TextView tv2=(TextView)findViewById(R.id.resultLarge);
            tv1.setText(result[1]);
            tv2.setText(result[2]);


        }
    }

}
