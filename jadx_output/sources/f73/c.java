package f73;

/* loaded from: classes15.dex */
public final class c extends f73.a {

    /* renamed from: a, reason: collision with root package name */
    public final e73.k f260053a = new e73.k(0, null, 0, 7, null);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f260054b = new java.util.ArrayList();

    @Override // f73.a
    public void a(org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(parser, "parser");
        int c17 = c(parser, "opcode");
        e73.k kVar = this.f260053a;
        kVar.f249952a = c17;
        d(parser, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ);
        kVar.getClass();
        super.a(parser);
        java.util.List list = this.f260054b;
        kVar.getClass();
        kotlin.jvm.internal.o.g(list, "<set-?>");
        kVar.f249953b = list;
    }

    @Override // f73.a
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(parser, "parser");
        if (kotlin.jvm.internal.o.b(tag, "handoff")) {
            int c17 = c(parser, "type");
            f73.g dVar = c17 != 1 ? c17 != 2 ? c17 != 3 ? c17 != 4 ? null : new f73.d() : new f73.e() : new f73.h() : new f73.b();
            if (dVar != null) {
                dVar.a(parser);
                com.tencent.mm.plugin.handoff.model.HandOff g17 = dVar.g();
                if (g17 != null) {
                    ((java.util.ArrayList) this.f260054b).add(g17);
                }
            }
        }
    }
}
