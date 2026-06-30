package gi;

/* loaded from: classes12.dex */
public abstract class o1 {
    public static void a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        if (xmlPullParser.getName().equals(str)) {
            return;
        }
        throw new org.xmlpull.v1.XmlPullParserException("Unexpected start tag: found " + xmlPullParser.getName() + ", expected " + str);
    }
}
