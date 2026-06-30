package kz0;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f313775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.r f313776g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f313777h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.p f313778i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.p f313779m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f313780n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(n0.v2 v2Var, int i17, float f17, yz5.r rVar, yz5.p pVar, yz5.p pVar2, yz5.p pVar3, boolean z17) {
        super(2);
        this.f313773d = v2Var;
        this.f313774e = i17;
        this.f313775f = f17;
        this.f313776g = rVar;
        this.f313777h = pVar;
        this.f313778i = pVar2;
        this.f313779m = pVar3;
        this.f313780n = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        s1.o1 o1Var;
        s1.l2 SubcomposeLayout = (s1.l2) obj;
        long j17 = ((p2.c) obj2).f351377a;
        kotlin.jvm.internal.o.g(SubcomposeLayout, "$this$SubcomposeLayout");
        s1.l0 l0Var = (s1.l0) SubcomposeLayout;
        s1.r0 r0Var = (s1.r0) kz5.n0.Z(l0Var.b(4, u0.j.c(578447562, true, new kz0.m(this.f313777h))));
        s1.o1 m17 = r0Var != null ? r0Var.m(j17) : null;
        s1.r0 r0Var2 = (s1.r0) kz5.n0.Z(l0Var.b(1, u0.j.c(1921984377, true, new kz0.k(this.f313778i))));
        s1.o1 m18 = r0Var2 != null ? r0Var2.m(j17) : null;
        n0.v2 v2Var = this.f313773d;
        if (m17 != null && m17.x() != 0) {
            v2Var.setValue(java.lang.Integer.valueOf(m17.x()));
        }
        int x17 = m18 != null ? m18.x() : 0;
        int g17 = p2.c.g(j17) - x17;
        int g18 = p2.c.g(j17) - this.f313774e;
        int i18 = x17 + ((int) this.f313775f);
        jz5.l lVar = (jz5.l) this.f313776g.C(java.lang.Integer.valueOf(p2.c.h(j17)), java.lang.Integer.valueOf(g18), v2Var.getValue(), java.lang.Integer.valueOf(x17));
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        float floatValue = ((java.lang.Number) lVar.f302834e).floatValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateUIPage", "PreviewPageStructure: " + ((java.lang.Number) v2Var.getValue()).intValue() + ", " + x17 + ", " + i18 + ", " + intValue + ", " + floatValue + ", [" + p2.c.h(j17) + ',' + g18 + ']');
        s1.r0 r0Var3 = (s1.r0) kz5.n0.Z(l0Var.b(2, u0.j.c(2016075740, true, new kz0.l(this.f313779m))));
        if (r0Var3 != null) {
            i17 = i18;
            o1Var = r0Var3.m(p2.c.a(j17, 0, 0, 0, java.lang.Math.max(0, intValue), 7, null));
        } else {
            i17 = i18;
            o1Var = null;
        }
        s1.r0 r0Var4 = (s1.r0) kz5.n0.Z(l0Var.b(3, kz0.c.f313668a));
        return s1.v0.b(SubcomposeLayout, p2.c.h(j17), p2.c.g(j17), null, new kz0.j(o1Var, floatValue, this.f313780n, r0Var4 != null ? r0Var4.m(p2.c.a(j17, 0, 0, 0, i17, 7, null)) : null, m17, m18, g17, j17), 4, null);
    }
}
