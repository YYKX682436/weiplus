package gr;

/* loaded from: classes15.dex */
public final class n extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f274672b = new java.util.ArrayList();

    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(parser, "parser");
        if (!kotlin.jvm.internal.o.b(tag, "VerRange")) {
            g(parser);
            return;
        }
        jz5.u b17 = r26.q0.b(r26.n0.W(d(parser, "min"), "0x"), 16);
        int i17 = b17 != null ? b17.f302848d : 0;
        jz5.u b18 = r26.q0.b(r26.n0.W(d(parser, "max"), "0x"), 16);
        ((java.util.ArrayList) this.f274672b).add(new jz5.l(new jz5.u(i17), new jz5.u(b18 != null ? b18.f302848d : 0)));
        g(parser);
    }
}
