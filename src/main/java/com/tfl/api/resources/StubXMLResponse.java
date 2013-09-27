package com.tfl.api.resources;

public class StubXMLResponse {
	public final static String ESUI_XML = "<ExternalWebServiceDisruptions>"
			+ "<SevereDisruption CurrentSevereDisruptions=\"false\" SevereDisruptionType=\"SevereDisruption\"/>"
			+ "<LineStatus>"
			+ "<Line LineID=\"1\" LineName=\"Bakerloo\">"
			+ "<Disruptions>"
			+ "<Disruption>"
			+ "<Status ID=\"GS\" Description=\"Good Service\" Priority=\"10\"/>"
			+ "</Disruption>"
			+ "</Disruptions>"
			+ "</Line>"
			+ "<Line LineID=\"82\" LineName=\"Overground\">"
			+ "<Disruptions>"
			+ "<Disruption>"
			+ "<StationFrom ID=\"108\" Name=\"Highbury Islington\"/>"
			+ "<StationTo ID=\"366\" Name=\"West Croydon\"/>"
			+ "<Status ID=\"MD\" Description=\"Minor Delays\" Priority=\"9\"/>"
			+ "</Disruption>"
			+ "<Disruption>"
			+ "<StationFrom ID=\"109\" Name=\"Highbury Islington\"/>"
			+ "<StationTo ID=\"365\" Name=\"West Croydon\"/>"
			+ "<Status ID=\"MD\" Description=\"Severe Delays\" Priority=\"9\"/>"
			+ "</Disruption>" + "<Disruption>"
			+ "<StationFrom ID=\"103\" Name=\"Highbury Islington\"/>"
			+ "<StationTo ID=\"362\" Name=\"West Croydon\"/>"
			+ "<Status ID=\"MD\" Description=\"Minor Delays\" Priority=\"9\"/>"
			+ "</Disruption>" + "</Disruptions>" + "</Line>" + "</LineStatus>"
			+ "</ExternalWebServiceDisruptions>";
	
	public final static String TRAM_ICS_DISTRUBTION_XML = "<feed version=\"201003031709\" schema=\"http://www.tfl.gov.uk/tfl/feeds/xsd/disruptions-trams-offset.xsd\" attribution=\"http://www.tfl.gov.uk/tfl/feeds/attribution/disruptions-trams-offset.xml\" generated=\"2013-07-05T13:40:19Z\" datetimestamp=\"2013-07-05T13:39:32Z\" from=\"2013-07-05T13:40:19Z\" to=\"2013-07-05T13:40:19Z\">"
			+"<period from=\"2013-07-05T13:40:19Z\" to=\"2013-07-05T13:40:19Z\">"
			+"<index><key>Tramway Tramlink 1</key></index>"
			+"<lines>"
			+"<line name=\"Route 1\" status=\"Minor delays\">"
			+"<disruptions>"
			+"<disruption id=\"30073579_TfL_ICSTFL\" affectTimetable=\"true\" created=\"2013-07-05T12:32:09Z\" status=\"Minor delays\">"
			+"<stops/>"
			+"<text>Minor delays on tram due to trespassers on line.</text>"
			+"</disruption>"
			+"</disruptions>"
			+"</line>"
			+"</lines>"
			+"<stops/>"
			+"</period>"
			+"</feed>";
		
	public final static String TUBE_ICS_WEEKEND_XML = "<feed version=\"201003031709\" schema=\"http://www.tfl.gov.uk/tfl/feeds/xsd/disruptions-track-offset.xsd\" attribution=\"http://www.tfl.gov.uk/tfl/feeds/attribution/disruptions-trams-offset.xml\" generated=\"2013-07-05T13:40:19Z\" datetimestamp=\"2013-07-05T13:39:32Z\" from=\"2013-07-05T13:40:19Z\" to=\"2013-07-05T13:40:19Z\">"
			+"<period from=\"2013-07-05T13:40:19Z\" to=\"2013-07-05T13:40:19Z\">"
			+"<lines>"
			+"<line id=\"01CIR\" name=\"Circle\" shortname=\"circle\" status=\"Good service\"><disruptions/></line>"
			+"<line id=\"01NTN\" name=\"Northern\" shortname=\"northern\" status=\"Good service\"><disruptions/></line>"
			+ "<line id=\"01BAK\" name=\"Bakerloo\" shortname=\"bakerloo\" status=\"Part closure\">"
			+"<disruptions><disruption id=\"1156167_TfL\" affectTimetable=\"true\" created=\"2013-07-10T07:24:56Z\" status=\"Part closure\">"
			+"<stops><stop id=\"1000101\" name=\"Harrow and Wealdstone Station\"/><stop id=\"1000124\" name=\"Kenton\"/><stop id=\"1000213\" name=\"South Kenton\"/>"
			+"<stop id=\"1000163\" name=\"North Wembley\"/><stop id=\"1000256\" name=\"Wembley Central\"/><stop id=\"1000224\" name=\"Stonebridge Park\"/><stop id=\"1000100\" name=\"Harlesden\"/>"
			+"<stop id=\"1000271\" name=\"Willesden Junction\"/><stop id=\"1000122\" name=\"Kensal Green\"/><stop id=\"1000186\" name=\"Queen's Park\"/></stops>"
			+"<text>Sunday 28 July, no service between Queen's Park and Harrow Wealdstone due to planned engineering works. In addition, no London Overground service between Queen's Park and Watford Junction. Replacement buses operate.</text>"
			+"</disruption></disruptions>"
			+"</line>"
			+"</lines>"
			+"</period>"
			+"</feed>";
	
	public final static String STOPPOINT_ICS_XML = "<feed version=\"201003031709\" schema=\"http://www.tfl.gov.uk/tfl/feeds/xsd/disruptions-track-offset.xsd\" attribution=\"http://www.tfl.gov.uk/tfl/feeds/attribution/disruptions-trams-offset.xml\" generated=\"2013-07-05T13:40:19Z\" datetimestamp=\"2013-07-05T13:39:32Z\" from=\"2013-07-05T13:40:19Z\" to=\"2013-07-05T13:40:19Z\">"
			+"<period from=\"2013-07-05T13:40:19Z\" to=\"2013-07-05T13:40:19Z\">"
			+"<stops>"
			+"<stop id=\"1000013\" name=\"Bank\"><text>Reduced escalator service until the end of November 2013.</text></stop>"
			+"<stop id=\"1000013\" name=\"Bank\"><text>From Thursday 18 April until late 2013, as part of the Tube improvement plan both escalators leading to the Northern line ticket hall are being replaced.</text></stop>"
			+"<stop id=\"1000013\" name=\"Edgware Road (Bakerloo Line)\" closed=\"True\"><text>Closed due to lift replacement work. Edgware Road (Circle) is the nearest alternative station.</text></stop>"
			+"<stop id=\"1000013\" name=\"Hammersmith (Dist &amp; Pic lines)\"><text>There is no step-free access at Hammersmith (District &amp; Piccadilly) station from 13 May.</text></stop>"
			+"<stop id=\"1000013\" name=\"Heathrow Central (1-2-3)\"><text>FLYING FROM HEATHROW? You are advised to check in as early as possible.</text></stop>"
			+"<stop id=\"1000013\" name=\"Earl's Court\"><text>Reduced escalator service until late July 2013.</text></stop>"
			+"</stops>"
			+"</period>"
			+"</feed>";
	
	public final static String PREDICTION_TRACKER_NET_BAKERLOO_BAKERSTREET = "﻿<?xml version=\"1.0\" encoding=\"utf-8\"?><ROOT xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns=\"http://trackernet.lul.co.uk\"><Line>B</Line><LineName>Bakerloo Line</LineName></ROOT>";
}
