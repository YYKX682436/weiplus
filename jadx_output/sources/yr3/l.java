package yr3;

/* loaded from: classes11.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.o f464917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yr3.m f464918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yr3.o oVar, yr3.m mVar, java.lang.String str) {
        super(1);
        this.f464917d = oVar;
        this.f464918e = mVar;
        this.f464919f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        l81.b1 b1Var = new l81.b1();
        yr3.m mVar = this.f464918e;
        yr3.f fVar = mVar.f464929e;
        kotlin.jvm.internal.o.d(fVar);
        b1Var.f317032k = fVar.f464805d == sr3.a.f411829e ? 1338 : 1414;
        b1Var.f317034l = "3";
        b1Var.f317016c = intValue;
        b1Var.f317014b = "wx0b2ec076ec39c786";
        yr3.f fVar2 = mVar.f464929e;
        kotlin.jvm.internal.o.d(fVar2);
        b1Var.f317022f = fVar2.f464803b.f381919l1;
        r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
        yr3.f fVar3 = mVar.f464929e;
        kotlin.jvm.internal.o.d(fVar3);
        b1Var.f317028i = l1Var.Bi(fVar3.f464805d.f411832d, this.f464919f);
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Bi()) {
            b1Var.f317018d = 447;
        }
        i95.m c17 = i95.n0.c(tk.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        tk.r rVar = (tk.r) c17;
        yr3.o oVar = this.f464917d;
        boolean Wf = tk.r.Wf(rVar, oVar.f464961d, b1Var, null, 4, null);
        gr3.b bVar = gr3.b.f274847a;
        if (Wf) {
            com.tencent.mars.xlog.Log.i("FeatureMsgUtil", "modify jumpWxa: use new editor");
            gr3.b.d(bVar, mVar.f464929e, 107L, mVar.f464928d, mVar.f464930f, 0, 16, null);
        } else {
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(oVar.f464961d, b1Var);
            gr3.b.d(bVar, mVar.f464929e, 107L, mVar.f464928d, mVar.f464930f, 0, 16, null);
        }
        return jz5.f0.f302826a;
    }
}
