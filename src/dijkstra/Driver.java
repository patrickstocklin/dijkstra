package dijkstra;

import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		
		Graph america = new Graph();
		
		Node california = new Node("CA");
		Node nevada = new Node("NV");
		Node oregon = new Node("OR");
		Node washington = new Node("WA");
		Node arizona = new Node("AZ");
		Node utah = new Node("UT");
		Node idaho = new Node("ID");
		Node newmexico = new Node("NM");
		Node colorado = new Node("CO");
		Node wyoming = new Node("WY");
		Node montana = new Node("MT");
		Node texas = new Node("TX");
		Node oklahoma = new Node("OK");
		Node kansas = new Node("KS");
		Node nebraska = new Node("NE");
		Node southdakota = new Node("SD");
		Node northdakota = new Node("ND");
		Node louisiana = new Node("LA");
		Node arkansas = new Node("AK");
		Node missouri = new Node("MO");
		Node iowa = new Node("IA");
		Node minnesota = new Node("MN");
		Node mississippi = new Node("MS");
		Node illinois = new Node("IL");
		Node wisconsin = new Node("WI");
		Node alabama = new Node("AL");
		Node tennessee = new Node("TN");
		Node kentucky = new Node("KY");
		Node indiana = new Node("IN");
		Node michigan = new Node("MI");
		Node florida = new Node("FL");
		Node georgia = new Node("GA");
		Node virginia = new Node("VA");
		Node westvirginia = new Node("WV");
		Node ohio = new Node("OH");
		Node southcarolina = new Node("SC");
		Node northcarolina = new Node("NC");
		Node maryland = new Node("MD");
		Node pennsylvania = new Node("PA");
		Node delaware = new Node("DE");
		Node newjersey = new Node("NJ");
		Node newyork = new Node("NY");
		Node vermont = new Node("VT");
		Node connecticut = new Node("CT");
		Node massachusetts = new Node("MA");
		Node newhampshire = new Node("NH");
		Node rhodeisland = new Node("RI");
		Node maine = new Node("ME");

//				CA: [OR, 535],[NV, 129],[AZ, 755]
		california.addDestination(oregon, 535);
		california.addDestination(nevada, 129);
		california.addDestination(arizona, 755);
//				NV: [OR, 663],[ID, 541],[UT, 534],[AZ, 713],[CA, 129]
		nevada.addDestination(oregon, 663);
		nevada.addDestination(idaho, 541);
		nevada.addDestination(utah, 534);
		nevada.addDestination(arizona, 713);
		nevada.addDestination(california, 129);
//				OR: [WA, 160],[ID, 441],[NV, 663],[CA, 535]
		oregon.addDestination(washington, 160);
		oregon.addDestination(idaho, 441);
		oregon.addDestination(nevada, 663);
		oregon.addDestination(california, 535);
//				WA: [ID, 619],[OR, 160]
		washington.addDestination(idaho, 619);
		washington.addDestination(oregon, 160);
//				AZ: [UT, 652],[NM, 476],[NV, 713],[CA, 755]
		arizona.addDestination(utah, 652);
		arizona.addDestination(newmexico, 476);
		arizona.addDestination(nevada, 713);
		arizona.addDestination(california, 755);
//				UT: [ID, 338],[WY, 435],[CO, 488],[AZ, 652],[NV, 534]
		utah.addDestination(idaho, 338);
		utah.addDestination(wyoming, 435);
		utah.addDestination(colorado, 488);
		utah.addDestination(arizona, 652);
		utah.addDestination(nevada, 534);
//				ID: [MT, 438],[WY, 727],[UT, 338],[WA, 619],[OR, 441],[NV, 541]
		idaho.addDestination(montana, 438);
		idaho.addDestination(wyoming, 727);
		idaho.addDestination(utah, 338);
		idaho.addDestination(washington, 619);
		idaho.addDestination(oregon, 441);
		idaho.addDestination(nevada, 541);
//				NM: [CO, 355],[OK, 585],[TX, 697],[AZ, 476]
		newmexico.addDestination(colorado, 355);
		newmexico.addDestination(oklahoma, 585);
		newmexico.addDestination(texas, 697);
		newmexico.addDestination(arizona, 476);
//				CO: [WY, 100],[NE, 486],[KS, 536],[OK, 626],[NM, 355],[UT, 488]
		colorado.addDestination(wyoming, 100);
		colorado.addDestination(nebraska, 486);
		colorado.addDestination(kansas, 536);
		colorado.addDestination(oklahoma, 626);
		colorado.addDestination(newmexico, 355);
		colorado.addDestination(utah, 488);
//				WY: [MT, 675],[SD, 455],[NE, 444],[CO, 100],[ID, 727],[UT, 435]
		wyoming.addDestination(montana, 675);
		wyoming.addDestination(southdakota, 455);
		wyoming.addDestination(nebraska, 444);
		wyoming.addDestination(colorado, 100);
		wyoming.addDestination(idaho, 727);;
		wyoming.addDestination(utah, 435);
//				MT: [ND, 624],[SD, 742],[WY, 675],[ID, 438]
		montana.addDestination(northdakota, 624);
		montana.addDestination(southdakota, 742);
		montana.addDestination(wyoming, 675);
		montana.addDestination(idaho, 438);
//				TX: [OK, 388],[AR, 504],[LA, 430],[NM, 697]
		texas.addDestination(oklahoma, 388);
		texas.addDestination(arkansas, 504);
		texas.addDestination(louisiana, 430);
		texas.addDestination(newmexico, 697);
//				OK: [KS, 293],[MO, 416],[AR, 337],[TX, 388],[CO, 626],[NM, 585]
		oklahoma.addDestination(kansas, 293);
		oklahoma.addDestination(missouri, 416);
		oklahoma.addDestination(arkansas, 337);
		oklahoma.addDestination(texas, 388);
		oklahoma.addDestination(colorado, 626);
		oklahoma.addDestination(newmexico, 585);
//				KS: [NE, 165],[MO, 204],[OK, 293],[CO, 536]
		kansas.addDestination(nebraska, 165);
		kansas.addDestination(missouri, 204);
		kansas.addDestination(oklahoma, 293);
		kansas.addDestination(colorado, 536);
//				NE: [SD, 392],[IA, 187],[MO, 343],[KS, 165],[WY, 444],[CO, 486]
		nebraska.addDestination(southdakota, 392);
		nebraska.addDestination(iowa, 187);
		nebraska.addDestination(missouri, 343);
		nebraska.addDestination(kansas, 165);
		nebraska.addDestination(wyoming, 444);
		nebraska.addDestination(colorado, 486);
//				SD: [ND, 215],[MN, 404],[IA, 490],[NE, 392],[MT, 742],[WY, 455]
		southdakota.addDestination(northdakota, 215);
		southdakota.addDestination(minnesota, 404);
		southdakota.addDestination(iowa, 490);
		southdakota.addDestination(nebraska, 392);
		southdakota.addDestination(montana, 742);
		southdakota.addDestination(wyoming, 455);
//				ND: [MN, 435],[SD, 215],[MT, 624]
		northdakota.addDestination(minnesota, 435);
		northdakota.addDestination(southdakota, 215);
		northdakota.addDestination(montana, 624);
//				LA: [AR, 416],[MS, 150],[TX, 430]
		louisiana.addDestination(arkansas, 416);
		louisiana.addDestination(mississippi, 150);
		louisiana.addDestination(texas, 430);
//				AR: [MO, 340],[TN, 344],[MS, 253],[LA, 416],[OK, 337],[TX, 504]
		arkansas.addDestination(missouri, 340);
		arkansas.addDestination(tennessee, 344);
		arkansas.addDestination(mississippi, 253);
		arkansas.addDestination(louisiana, 416);
		arkansas.addDestination(oklahoma, 337);
		arkansas.addDestination(texas, 504);
//				MO: [IA, 255],[IL, 192],[KY, 562],[TN, 453],[AR, 340],[NE, 343],[KS, 204],[OK, 416]
		missouri.addDestination(iowa, 255);
		missouri.addDestination(illinois, 192);
		missouri.addDestination(kentucky, 562);
		missouri.addDestination(tennessee, 453);
		missouri.addDestination(arkansas, 340);
		missouri.addDestination(nebraska, 343);
		missouri.addDestination(kansas, 204);
		missouri.addDestination(oklahoma, 416);
//				IA: [MN, 244],[WI, 279],[IL, 291],[MO, 255],[SD, 490],[NE, 187]
		iowa.addDestination(minnesota, 244);
		iowa.addDestination(wisconsin, 279);
		iowa.addDestination(illinois, 291);
		iowa.addDestination(missouri, 255);
		iowa.addDestination(southdakota, 490);
		iowa.addDestination(nebraska, 187);
//				MN: [WI, 258],[IA, 244],[ND, 435],[SD, 404]
		minnesota.addDestination(wisconsin, 258);
		minnesota.addDestination(iowa, 244);
		minnesota.addDestination(northdakota, 435);
		minnesota.addDestination(southdakota, 404);
//				MS: [TN, 392],[AL, 242],[AR, 253],[LA, 150]
		mississippi.addDestination(tennessee, 392);
		mississippi.addDestination(alabama, 242);
		mississippi.addDestination(arkansas, 253);
		mississippi.addDestination(louisiana, 150);
//				IL: [WI, 249],[IN, 190],[KY, 415],[IA, 291],[MO, 192]
		illinois.addDestination(wisconsin, 249);
		illinois.addDestination(indiana, 190);
		illinois.addDestination(kentucky, 415);
		illinois.addDestination(iowa, 291);
		illinois.addDestination(missouri, 192);
//				WI: [MI, 614],[IL, 249],[MN, 258],[IA, 279]
		wisconsin.addDestination(michigan, 614);
		wisconsin.addDestination(illinois, 249);
		wisconsin.addDestination(minnesota, 258);
		wisconsin.addDestination(iowa, 279);
//				AL: [TN, 282],[GA, 160],[FL, 205],[MS, 242]
		alabama.addDestination(tennessee, 282);
		alabama.addDestination(georgia, 160);
		alabama.addDestination(florida, 205);
		alabama.addDestination(mississippi, 242);
//				TN: [KY, 203],[VA, 597],[NC, 530],[GA, 255],[AL, 282],[MS, 392],[MO, 453],[AR, 344]
		tennessee.addDestination(kentucky, 203);
		tennessee.addDestination(virginia, 597);
		tennessee.addDestination(northcarolina, 530);
		tennessee.addDestination(georgia, 255);
		tennessee.addDestination(alabama, 282);
		tennessee.addDestination(mississippi, 392);
		tennessee.addDestination(missouri, 453);
		tennessee.addDestination(arkansas, 344);
//				KY: [IN, 145],[OH, 186],[WV, 197],[VA, 532],[TN, 203],[IL, 415],[MO, 562]
		kentucky.addDestination(indiana, 145);
		kentucky.addDestination(ohio, 186);
		kentucky.addDestination(westvirginia, 197);
		kentucky.addDestination(virginia, 532);
		kentucky.addDestination(tennessee, 203);
		kentucky.addDestination(illinois, 415);
		kentucky.addDestination(missouri, 562);
//				IN: [MI, 244],[OH, 175],[KY, 145],[IL, 190]
		indiana.addDestination(michigan, 244);
		indiana.addDestination(ohio, 175);
		indiana.addDestination(kentucky, 145);
		indiana.addDestination(illinois, 190);
//				MI: [OH, 237],[IN, 244],[WI, 614]
		michigan.addDestination(ohio, 237);
		michigan.addDestination(indiana, 244);
		michigan.addDestination(wisconsin, 614);
//				FL: [GA, 252],[AL, 205]
		florida.addDestination(georgia, 252);
		florida.addDestination(alabama, 205);
//				GA: [NC, 434],[SC, 212],[FL, 252],[TN, 255],[AL, 160]
		georgia.addDestination(northcarolina, 434);
		georgia.addDestination(southcarolina, 212);
		georgia.addDestination(florida, 252);
		georgia.addDestination(tennessee, 255);
		georgia.addDestination(alabama, 160);
//				VA: [WV, 302],[MD, 129],[NC, 156],[KY, 532],[TN, 597]
		virginia.addDestination(westvirginia, 302);
		virginia.addDestination(maryland, 129);
		virginia.addDestination(northcarolina, 156);
		virginia.addDestination(kentucky, 532);
		virginia.addDestination(tennessee, 597);
//				WV: [OH, 160],[PA, 354],[MD, 397],[VA, 302],[KY, 197]
		westvirginia.addDestination(ohio, 160);
		westvirginia.addDestination(pennsylvania, 354);
		westvirginia.addDestination(maryland, 397);
		westvirginia.addDestination(virginia, 302);
		westvirginia.addDestination(kentucky, 197);
//				OH: [PA, 425],[WV, 160],[MI, 237],[IN, 175],[KY, 186]
		ohio.addDestination(pennsylvania, 425);
		ohio.addDestination(westvirginia, 160);
		ohio.addDestination(michigan, 237);
		ohio.addDestination(indiana, 175);
		ohio.addDestination(kentucky, 186);
//				SC: [NC, 200],[GA, 212]
		southcarolina.addDestination(northcarolina, 200);
		southcarolina.addDestination(georgia, 212);
//				NC: [SC, 200],[VA, 156],[GA, 434],[TN, 530]
		northcarolina.addDestination(southcarolina, 200);
		northcarolina.addDestination(virginia, 156);
		northcarolina.addDestination(georgia, 434);
		northcarolina.addDestination(tennessee, 530);
//				MD: [PA, 103],[DE,  62],[WV, 397],[VA, 129]
		maryland.addDestination(pennsylvania, 103);
		maryland.addDestination(delaware, 62);
		maryland.addDestination(westvirginia, 397);
		maryland.addDestination(virginia, 129);
//				PA: [NY, 268],[NJ, 127],[DE, 124],[MD, 103],[OH, 425],[WV, 354]
		pennsylvania.addDestination(newyork, 268);
		pennsylvania.addDestination(newjersey, 127);
		pennsylvania.addDestination(delaware, 124);
		pennsylvania.addDestination(maryland, 103);
		pennsylvania.addDestination(ohio, 425);
		pennsylvania.addDestination(westvirginia, 354);
//				DE: [NJ, 108],[PA, 124],[MD,  62]
		delaware.addDestination(newjersey, 108);
		delaware.addDestination(pennsylvania, 124);
		delaware.addDestination(maryland, 62);
//				NJ: [NY, 193],[DE, 108],[PA, 127]
		newjersey.addDestination(newyork, 193);
		newjersey.addDestination(delaware, 108);
		newjersey.addDestination(pennsylvania, 127);
//				NY: [VT, 153],[MA, 165],[CT, 111],[NJ, 193],[PA, 268]
		newyork.addDestination(vermont, 153);
		newyork.addDestination(massachusetts, 165);
		newyork.addDestination(connecticut, 111);
		newyork.addDestination(newjersey, 193);
		newyork.addDestination(pennsylvania, 268);
//				VT: [NH, 106],[MA, 236],[NY, 153]
		vermont.addDestination(newhampshire, 106);
		vermont.addDestination(massachusetts, 236);
		vermont.addDestination(newyork, 153);
//				CT: [MA, 101],[RI, 72],[NY, 111]
		connecticut.addDestination(massachusetts, 101);
		connecticut.addDestination(rhodeisland, 72);
		connecticut.addDestination(newyork, 111);
//				MA: [NH,  68],[RI, 45],[CT, 101],[VT, 236],[NY, 165]
		massachusetts.addDestination(newhampshire, 68);
		massachusetts.addDestination(rhodeisland, 45);
		massachusetts.addDestination(connecticut, 101);
		massachusetts.addDestination(vermont, 236);
		massachusetts.addDestination(newyork, 165);
//				NH: [ME, 139],[MA,  68],[VT, 106]
		newhampshire.addDestination(maine, 139);
		newhampshire.addDestination(massachusetts, 68);
		newhampshire.addDestination(vermont, 106);
//				RI: [MA,  45],[CT,  72]
		rhodeisland.addDestination(massachusetts, 45);
		rhodeisland.addDestination(connecticut, 72);
//				ME: [NH, 139]
		maine.addDestination(newhampshire, 139);
		
		america.addNode(california);
		america.addNode(nevada);
		america.addNode(oregon);
		america.addNode(washington);
		america.addNode(arizona);
		america.addNode(utah);
		america.addNode(idaho);
		america.addNode(newmexico);
		america.addNode(colorado);
		america.addNode(wyoming);
		america.addNode(montana);
		america.addNode(texas);
		america.addNode(oklahoma);
		america.addNode(kansas);
		america.addNode(nebraska);
		america.addNode(southdakota);
		america.addNode(northdakota);
		america.addNode(louisiana);
		america.addNode(arkansas);
		america.addNode(missouri);
		america.addNode(iowa);
		america.addNode(minnesota);
		america.addNode(mississippi);
		america.addNode(illinois);
		america.addNode(wisconsin);
		america.addNode(alabama);
		america.addNode(tennessee);
		america.addNode(kentucky);
		america.addNode(indiana);
		america.addNode(michigan);
		america.addNode(florida);
		america.addNode(georgia);
		america.addNode(virginia);
		america.addNode(westvirginia);
		america.addNode(ohio);
		america.addNode(southcarolina);
		america.addNode(northcarolina);
		america.addNode(maryland);
		america.addNode(pennsylvania);
		america.addNode(delaware);
		america.addNode(newjersey);
		america.addNode(newyork);
		america.addNode(vermont);
		america.addNode(connecticut);
		america.addNode(massachusetts);
		america.addNode(newhampshire);
		america.addNode(rhodeisland);
		america.addNode(maine);
		
		america = Dijkstra.calculateShortestPathFromSource(america, texas);		
	}

}
