package f73;

/* loaded from: classes15.dex */
public abstract class g extends f73.a {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f260056a = jz5.h.b(new f73.f(this));

    @Override // f73.a
    public void a(org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(parser, "parser");
        java.lang.String e17 = e(parser, dm.i4.COL_ID);
        long d17 = d(parser, "createtime");
        g().setId(e17);
        g().setCreateTime(d17);
        super.a(parser);
    }

    @Override // f73.a
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(parser, "parser");
        if (kotlin.jvm.internal.o.b(tag, "displaySourceName")) {
            g().setDisplaySourceName(f(parser));
        }
    }

    public final com.tencent.mm.plugin.handoff.model.HandOff g() {
        return (com.tencent.mm.plugin.handoff.model.HandOff) ((jz5.n) this.f260056a).getValue();
    }

    public abstract com.tencent.mm.plugin.handoff.model.HandOff h();
}
