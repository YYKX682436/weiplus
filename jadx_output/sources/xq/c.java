package xq;

/* loaded from: classes15.dex */
public final class c extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f455971b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f455972c = "";

    /* renamed from: d, reason: collision with root package name */
    public xq.d f455973d;

    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(parser, "parser");
        int hashCode = tag.hashCode();
        if (hashCode != -2092800739) {
            if (hashCode != -796017875) {
                if (hashCode == 106079 && tag.equals("key")) {
                    this.f455971b = f(parser);
                    return;
                }
            } else if (tag.equals("animFile")) {
                this.f455972c = f(parser);
                return;
            }
        } else if (tag.equals("screenEffect")) {
            xq.d dVar = new xq.d();
            dVar.a(parser);
            this.f455973d = dVar;
            return;
        }
        g(parser);
    }
}
