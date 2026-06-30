package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class bw implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f133932d;

    public bw(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        this.f133932d = sxVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("search device times:");
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f133932d;
        sb6.append(sxVar.L);
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", sb6.toString());
        int i17 = sxVar.L;
        boolean z17 = false;
        if (i17 >= sxVar.K) {
            sxVar.L = 0;
            sxVar.getClass();
            pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.zw(sxVar));
            return false;
        }
        sxVar.L = i17 + 1;
        java.lang.String a17 = nf.s.a();
        java.lang.String b17 = nf.s.b();
        int i18 = y91.i0.f460281h;
        y91.i0 i0Var = y91.h0.f460277a;
        if (com.tencent.mm.sdk.platformtools.a2.b(a17) && com.tencent.mm.sdk.platformtools.a2.b(b17)) {
            z17 = true;
        }
        i0Var.f(z17);
        return true;
    }
}
