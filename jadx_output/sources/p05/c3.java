package p05;

/* loaded from: classes15.dex */
public final class c3 extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public int f350472b;

    /* renamed from: c, reason: collision with root package name */
    public int f350473c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f350474d = new java.util.LinkedList();

    @Override // gr.b
    public void a(org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(parser, "parser");
        this.f350474d.clear();
        super.a(parser);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(parser, "parser");
        switch (tag.hashCode()) {
            case -6913209:
                if (tag.equals("ModelList")) {
                    return;
                }
                g(parser);
                return;
            case 74517257:
                if (tag.equals(androidx.exifinterface.media.ExifInterface.TAG_MODEL)) {
                    p05.b3 b3Var = new p05.b3();
                    b3Var.a(parser);
                    this.f350474d.add(b3Var);
                    return;
                }
                g(parser);
                return;
            case 632394518:
                if (tag.equals("ConfigVersion")) {
                    this.f350473c = e(parser);
                    return;
                }
                g(parser);
                return;
            case 2099446622:
                if (tag.equals("SDKVersion")) {
                    this.f350472b = e(parser);
                    return;
                }
                g(parser);
                return;
            default:
                g(parser);
                return;
        }
    }
}
