package xq;

/* loaded from: classes15.dex */
public final class d extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public int f455974b;

    /* renamed from: c, reason: collision with root package name */
    public int f455975c;

    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(parser, "parser");
        int hashCode = tag.hashCode();
        if (hashCode != -1086372345) {
            if (hashCode != -1017208180) {
                if (hashCode == 95467907 && tag.equals("delay")) {
                    this.f455974b = e(parser);
                    return;
                }
            } else if (tag.equals("effectId")) {
                f(parser);
                return;
            }
        } else if (tag.equals("effectVersion")) {
            this.f455975c = e(parser);
            return;
        }
        g(parser);
    }
}
