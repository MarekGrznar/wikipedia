package abstracts;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Matej Toma
 *
 */
public class TestParsedWikiTextWithCleanedText {

	@Test
	public void testParsedText(){
		String realText = "McConnell v. Federal Election Commission, [[Case citation|540 U.S. 93]] (2003),<ref></ref> is a case in which the [[Supreme Court of the United States|United States Supreme Court]] upheld the [[constitutionality]] of most of the [[Bipartisan Campaign Reform Act of 2002]] (BCRA), often referred to as the [[John McCain|McCain]]–[[Russell Feingold|Feingold]] Act.The case takes its name from Senator [[Mitch McConnell]], [[Republican Party (United States)|Republican]] of [[Kentucky]], and the [[Federal Election Commission]], the federal agency that oversees U.S. campaign finance laws.It was partially overruled by [[Citizens United v. Federal Election Commission]], 558 U.S. 310 (2010).<ref></ref>The case was brought by groups such as the [[California Democratic Party]] and the [[National Rifle Association]],<ref></ref> and individuals including U.S. Senator Mitch McConnell, then the Senate [[whip (politics)|Majority Whip]], who argued that the legislation was an unconstitutional infringement on their [[First Amendment to the United States Constitution|First Amendment]] rights.<ref></ref> Senator McConnell had been a longtime opponent of BCRA in the Senate, and had led several Senate [[filibuster]]s to block its passage.<ref></ref><ref name =\"MIT Herrnson\"></ref>In early 2002, a multi-year effort by Senators John McCain and Russell Feingold to reform the way money is raised and spent on political campaigns culminated in the passage of the Bipartisan Campaign Reform Act of 2002 (the so-called McCain-Feingold bill).<ref name =\"MIT Herrnson\"/> Its key provisions were 1) a ban on unrestricted (\"soft money\") donations made directly to political parties (often by corporations, unions, or wealthy individuals) and on the solicitation of those donations by elected officials; 2) limits on the advertising that unions, corporations, and non-profit organizations can engage in up to 60 days prior to an election; and 3) restrictions on political parties' use of their funds for advertising on behalf of candidates (in the form of \"issue ads\" or \"coordinated expenditures\").<ref></ref>In May 2003, the [[United States District Court for the District of Columbia]] issued a ruling on the constitutionality of the law, but the ruling never took effect because the case was immediately appealed to the U.S. Supreme Court.The Supreme Court heard oral arguments in a special session on September 8, 2003.  On Wednesday, December 10, 2003, it issued a complicated decision totaling 272 pages in length, that, with a 5-4 majority, upheld the key provisions of McCain-Feingold including (1) the \"electioneering communication\" provisions (which required disclosure of and prohibited the use of corporate and union treasury funds to pay for or broadcast cable and satellite ads clearly identifying a federal candidate targeted to the candidate's electorate within 30 days of a primary or 60 days of a general election); and (2) the \"soft money\" ban (which prohibited federal parties, candidates, and officeholders from raising or spending funds not in compliance with contribution restrictions, and prohibited state parties from using such \"soft money\" in connection with federal elections).Justices [[Stephen Breyer|Breyer]], [[John Paul Stevens|Stevens]], [[Sandra Day O'Connor|O'Connor]], [[David Souter|Souter]], and [[Ruth Bader Ginsburg|Ginsburg]] established the majority for two parts of the Court's opinion:*With respect to Titles I and II of the BCRA, Justices [[John Paul Stevens|Stevens]], [[Sandra Day O'Connor|O'Connor]] wrote the opinion of the Court.*With respect to Title V of the BCRA, Justice [[Stephen Breyer|Breyer]] wrote the Court's opinion.Because the regulations dealt mostly with soft-money contributions that were used to register voters and increase attendance at the polls, not with campaign expenditures (which are more explicitly a statement of political values and therefore deserve more protection), the Court held that the restriction on free speech was minimal. It then found that the restriction was justified by the government's legitimate interest in preventing \"both the actual corruption threatened by large financial contributions and... the appearance of corruption\" that might result from those contributions.In response to challenges that the law was too broad and unnecessarily regulated conduct that had not been shown to cause corruption (such as advertisements paid for by corporations or unions), the Court found that such regulation was necessary to prevent the groups from circumventing the law. Justices O'Connor and Stevens wrote that \"money, like water, will always find an outlet\" and that the government was therefore justified in taking steps to prevent schemes developed to get around the contribution limits.The Court also rejected the argument that Congress had exceeded its authority to regulate elections under Article I, Section 4 of the Constitution. The Court found that the law only affected state elections in which federal candidates were involved and also that it did not prevent states from creating separate election laws for state and local elections.Two dissenting opinions were included in the decision:*Justice [[John Paul Stevens|Stevens]], joined by Justices [[Ruth Bader Ginsburg|Ginsburg]], and [[Stephen Breyer|Breyer]], dissented on one section of the part of the Court's opinion written by the Chief Justice.*The Chief Justice, joined by Justice [[Anthony Kennedy|Kennedy]] and [[Antonin Scalia|Scalia]], issued a 15-page dissent against the Court's opinion with respect to Titles I and V of the BCRA.Three other justices wrote separate opinions on the decision:*Justice [[Anthony Kennedy|Kennedy]], joined by the Chief Justice, issued a 68-page dissenting opinion and appendix, noting that BCRA forces \"speakers to abandon their own preference for speaking through parties and organizations.\"*Justice [[Clarence Thomas|Thomas]] issued a separate 25-page dissenting opinion noting that the Court was upholding the \"most significant abridgment of the freedoms of [[freedom of speech|speech]] and [[freedom of association|association]] since the [[American Civil War|Civil War]].\"*Justice [[Antonin Scalia|Scalia]] issued a separate 19-page dissenting opinion, a \"few words of [his] own,\" because of the \"extraordinary importance\" of the cases.On July 5, 2007, in [[Federal Election Commission v. Wisconsin Right to Life, Inc.]], the Supreme Court ruled that the organizations engaged in genuine discussion of issues were entitled to a broad, \"as applied\" exemption from the electioneering communications provisions of BCRA (those portions of BCRA that limited advertising that named a particular candidate by name within 30 days of a primary election and 60 days of a general election, if the ad was paid for by a corporation or union).  Many observers argue that the exemption crafted by the Court effectively nullifies those provisions of the Act and overrules that portion of McConnell, but the full impact of Wisconsin Right to Life remains to be seen.*[[List of United States Supreme Court cases, volume 540]]*[[List of United States Supreme Court cases]]*[[Buckley v. Valeo]] (1976), regarding [[Federal Election Campaign Act]] of 1971****[http://web.archive.org/web/20070927233927/http://www.oyez.org/oyez/resource/case/1637/ Summary of case from OYEZ].";
		
		try{
			CosineSimilartyBasedOnParsedAbstracts.singleFileReader("VINF_GIT_sample_input_enwiki-latest-pages-articles9",false);
		}
		catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		
		}
		
		String parsedText = CosineSimilartyBasedOnParsedAbstracts.allPages.get(0).getTextTag();

		assertEquals("Zhoda stringov", realText, parsedText);
		System.out.println("@Test - testParsedText - prebehol uspesne");
	}
	
	@Test
	public void testNumberOfGoodResults(){
		assertEquals("Pocet dobrych zaznamom", 2, CosineSimilartyBasedOnParsedAbstracts.allPages.size());

		System.out.println("@Test - testNumberOfGoodResults - prebehol uspesne");
	}
}
