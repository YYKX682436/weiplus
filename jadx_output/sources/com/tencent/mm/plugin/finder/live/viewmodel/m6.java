package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class m6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.o f117253e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, yl2.o oVar) {
        super(0);
        this.f117252d = b8Var;
        this.f117253e = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = this.f117252d;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = b8Var.f116937e;
        yf2.s0 s0Var = lVar != null ? (yf2.s0) lVar.U0(yf2.s0.class) : null;
        boolean z17 = false;
        if (s0Var != null) {
            if (s0Var.b7() == 1) {
                z17 = true;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleAuthResult: authReq=");
        yl2.o oVar = this.f117253e;
        sb6.append(oVar);
        sb6.append(", isLicenseConfirmed=");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", sb6.toString());
        if (oVar instanceof yl2.n) {
            if (z17) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "handleAuthResult: passed and license confirmed, starting live");
                b8Var.i7();
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "handleAuthResult: passed but license not confirmed, showing license sheet");
                b8Var.d7(yf2.j2.f461731e, null);
            }
        } else if (oVar instanceof yl2.m) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "handleAuthResult: need auth, showing auth sheet");
            b8Var.d7(yf2.j2.f461732f, (yl2.m) oVar);
        } else if (oVar instanceof yl2.l) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleAuthResult: blocked, errCode=");
            yl2.l lVar2 = (yl2.l) oVar;
            sb7.append(lVar2.f463040a);
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", sb7.toString());
            b8Var.V6(lVar2.f463040a);
        }
        return jz5.f0.f302826a;
    }
}
