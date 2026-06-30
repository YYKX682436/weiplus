package gr;

/* loaded from: classes15.dex */
public final class l extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public final f21.h f274670b = new f21.h();

    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(parser, "parser");
        boolean b17 = kotlin.jvm.internal.o.b(tag, "AppId");
        f21.h hVar = this.f274670b;
        if (b17) {
            hVar.f258904d = f(parser);
        } else if (kotlin.jvm.internal.o.b(tag, "UserName")) {
            hVar.f258905e = f(parser);
        } else {
            g(parser);
        }
    }
}
