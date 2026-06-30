package p05;

/* loaded from: classes15.dex */
public final class b3 extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f350462b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f350463c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f350464d = "";

    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(parser, "parser");
        int hashCode = tag.hashCode();
        if (hashCode != 75327) {
            if (hashCode != 2420395) {
                if (hashCode == 2575653 && tag.equals("Sha1")) {
                    this.f350464d = f(parser);
                    return;
                }
            } else if (tag.equals("Name")) {
                this.f350463c = f(parser);
                return;
            }
        } else if (tag.equals("Key")) {
            this.f350462b = f(parser);
            return;
        }
        g(parser);
    }
}
