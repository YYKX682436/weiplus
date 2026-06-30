package cw2;

/* loaded from: classes2.dex */
public final class t2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.w2 f224015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f224016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f224017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cw2.f8 f224018g;

    public t2(cw2.w2 w2Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, cw2.f8 f8Var) {
        this.f224015d = w2Var;
        this.f224016e = s0Var;
        this.f224017f = baseFinderFeed;
        this.f224018g = f8Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.nm2 nm2Var = (r45.nm2) obj;
        cw2.w2 w2Var = this.f224015d;
        if (w2Var.f224081f || nm2Var == null) {
            return;
        }
        w2Var.f224081f = true;
        wu5.c cVar = w2Var.f224080e;
        if (cVar != null) {
            cVar.cancel(false);
        }
        az2.f fVar = w2Var.f224077b;
        if (fVar != null) {
            fVar.b();
        }
        androidx.lifecycle.j0 j0Var = w2Var.f224079d;
        if (j0Var != null) {
            j0Var.removeObserver(this);
        }
        w2Var.f224080e = null;
        w2Var.f224082g = false;
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        cw2.f8 f8Var = this.f224018g;
        y4Var.M(w2Var.f224076a, this.f224016e, this.f224017f, f8Var);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2137, 4);
    }
}
