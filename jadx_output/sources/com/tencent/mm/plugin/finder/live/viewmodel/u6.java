package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class u6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yl2.h f117456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yl2.m f117458f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(yl2.h hVar, com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, yl2.m mVar) {
        super(0);
        this.f117456d = hVar;
        this.f117457e = b8Var;
        this.f117458f = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int ordinal = this.f117456d.ordinal();
        com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = this.f117457e;
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "handleRealnameAuth: auth succeeded");
            if (b8Var.f116952w != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAuthSuccess: precheckType=");
                yl2.m mVar = this.f117458f;
                sb6.append(mVar.f463044a);
                com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", sb6.toString());
                ae2.in.f3688a.S().o();
                if (mVar.f463044a != -1) {
                    b8Var.b7(new com.tencent.mm.plugin.finder.live.viewmodel.y6(b8Var));
                } else {
                    b8Var.b7(new com.tencent.mm.plugin.finder.live.viewmodel.z6(b8Var));
                }
            }
        } else if (ordinal == 1) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "handleRealnameAuth: auth failed");
        } else if (ordinal == 2) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "handleRealnameAuth: need refresh, setting needRefreshUserFlag=true");
            b8Var.f116953x = true;
            ae2.in.f3688a.S().o();
        }
        return jz5.f0.f302826a;
    }
}
