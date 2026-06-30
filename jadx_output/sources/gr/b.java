package gr;

/* loaded from: classes15.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final gr.a f274661a = new gr.a(null);

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
        java.lang.String d17 = d(parser, name);
        if (d17.length() == 0) {
            return 0;
        }
        return java.lang.Integer.parseInt(d17);
    }

    public final java.lang.String d(org.xmlpull.v1.XmlPullParser parser, java.lang.String name) {
        kotlin.jvm.internal.o.g(parser, "parser");
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.String attributeValue = parser.getAttributeValue(null, name);
        return attributeValue == null ? "" : attributeValue;
    }

    public final int e(org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(parser, "parser");
        java.lang.String f17 = f(parser);
        if (f17.length() == 0) {
            return 0;
        }
        return java.lang.Integer.parseInt(f17);
    }

    public final java.lang.String f(org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(parser, "parser");
        if (parser.next() != 4) {
            return "";
        }
        java.lang.String text = parser.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        parser.nextTag();
        return text;
    }

    public final void g(org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(parser, "parser");
        if (parser.getEventType() != 2) {
            throw new java.lang.IllegalStateException();
        }
        int i17 = 1;
        while (i17 != 0) {
            int next = parser.next();
            if (next == 2) {
                i17++;
            } else if (next == 3) {
                i17--;
            }
        }
    }
}
