package f73;

/* loaded from: classes15.dex */
public abstract class a {
    public void a(org.xmlpull.v1.XmlPullParser parser) {
        java.lang.String name;
        kotlin.jvm.internal.o.g(parser, "parser");
        while (parser.next() != 3 && parser.getEventType() != 1) {
            if (parser.getEventType() == 2 && (name = parser.getName()) != null) {
                b(name, parser);
            }
        }
    }

    public abstract void b(java.lang.String str, org.xmlpull.v1.XmlPullParser xmlPullParser);

    public final int c(org.xmlpull.v1.XmlPullParser parser, java.lang.String name) {
        kotlin.jvm.internal.o.g(parser, "parser");
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.String e17 = e(parser, name);
        if (e17.length() == 0) {
            return 0;
        }
        return java.lang.Integer.parseInt(e17);
    }

    public final long d(org.xmlpull.v1.XmlPullParser parser, java.lang.String name) {
        kotlin.jvm.internal.o.g(parser, "parser");
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.String e17 = e(parser, name);
        if (e17.length() == 0) {
            return 0L;
        }
        return java.lang.Long.parseLong(e17);
    }

    public final java.lang.String e(org.xmlpull.v1.XmlPullParser parser, java.lang.String name) {
        java.lang.String obj;
        kotlin.jvm.internal.o.g(parser, "parser");
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.String attributeValue = parser.getAttributeValue(null, name);
        return (attributeValue == null || (obj = r26.n0.u0(attributeValue).toString()) == null) ? "" : obj;
    }

    public final java.lang.String f(org.xmlpull.v1.XmlPullParser parser) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(parser, "parser");
        if (parser.next() == 4) {
            str = parser.getText();
            kotlin.jvm.internal.o.f(str, "getText(...)");
            parser.nextTag();
        } else {
            str = "";
        }
        return r26.n0.u0(str).toString();
    }
}
