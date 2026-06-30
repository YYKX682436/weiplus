package j1;

/* loaded from: classes13.dex */
public abstract class c {
    public static final e1.r a(d3.d dVar) {
        android.graphics.Shader shader = dVar.f226084a;
        boolean z17 = true;
        if (!(shader != null) && dVar.f226085b == 0) {
            z17 = false;
        }
        if (z17) {
            return shader != null ? new e1.s(shader) : new e1.e1(e1.a0.b(dVar.f226085b), null);
        }
        return null;
    }

    public static final org.xmlpull.v1.XmlPullParser b(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        kotlin.jvm.internal.o.g(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
    }
}
