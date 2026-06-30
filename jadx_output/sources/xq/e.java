package xq;

/* loaded from: classes15.dex */
public final class e extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public int f455976b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f455977c = new java.util.ArrayList();

    @Override // gr.b
    public void a(org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(parser, "parser");
        this.f455977c.clear();
        super.a(parser);
    }

    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(parser, "parser");
        int hashCode = tag.hashCode();
        if (hashCode != 3242771) {
            if (hashCode != 96632902) {
                if (hashCode == 1660947809 && tag.equals("emojiAnimVersion")) {
                    this.f455976b = e(parser);
                    return;
                }
            } else if (tag.equals("emoji")) {
                return;
            }
        } else if (tag.equals("item")) {
            xq.c cVar = new xq.c();
            cVar.a(parser);
            this.f455977c.add(cVar);
            return;
        }
        g(parser);
    }
}
