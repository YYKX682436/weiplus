package km2;

/* loaded from: classes3.dex */
public final class f0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km2.g0 f309097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.i f309098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f309099c;

    public f0(km2.g0 g0Var, com.tencent.mm.modelbase.i iVar, kotlin.coroutines.Continuation continuation) {
        this.f309097a = g0Var;
        this.f309098b = iVar;
        this.f309099c = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        long j17;
        r45.vr1 vr1Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.d(fVar);
        lm2.x xVar = (lm2.x) this.f309097a;
        xVar.getClass();
        com.tencent.mm.modelbase.i cgi = this.f309098b;
        kotlin.jvm.internal.o.g(cgi, "cgi");
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && (vr1Var = (r45.vr1) fVar.f70618d) != null) {
            j17 = vr1Var.f388461d;
            lm2.p pVar = lm2.h0.f319392i;
            java.util.LinkedList box_readdot_list = vr1Var.f388462e;
            kotlin.jvm.internal.o.f(box_readdot_list, "box_readdot_list");
            java.lang.String str = "polling reddot resp, ".concat(kz5.n0.g0(box_readdot_list, null, null, null, 0, null, lm2.u.f319452d, 31, null));
            kotlin.jvm.internal.o.g(str, "str");
            com.tencent.mars.xlog.Log.i("Finder.BoxDataStore", "redDotFlowLog ".concat(str));
            if (box_readdot_list.size() > 0) {
                kotlinx.coroutines.l.f(null, new lm2.w(vr1Var, xVar.f319462c, cgi, null), 1, null);
            }
        } else {
            j17 = 1000;
        }
        this.f309099c.resumeWith(kotlin.Result.m521constructorimpl(new km2.j0(true, j17)));
        return jz5.f0.f302826a;
    }
}
