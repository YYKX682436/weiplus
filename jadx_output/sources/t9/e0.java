package t9;

/* loaded from: classes12.dex */
public abstract class e0 {
    public static java.lang.String a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i17 = 0; i17 < attributeCount; i17++) {
            if (str.equals(xmlPullParser.getAttributeName(i17))) {
                return xmlPullParser.getAttributeValue(i17);
            }
        }
        return null;
    }
}
