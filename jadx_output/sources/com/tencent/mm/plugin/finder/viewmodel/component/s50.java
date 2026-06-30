package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class s50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC f135862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s50(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC, in5.s0 s0Var) {
        super(0);
        this.f135862d = finderSpeedControlUIC;
        this.f135863e = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.qj2 nativeDramaInfo;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC = this.f135862d;
        float f17 = finderSpeedControlUIC.f133651v;
        in5.s0 s0Var = this.f135863e;
        if (s0Var.p(com.tencent.mm.R.id.uql) == null) {
            com.tencent.mars.xlog.Log.i("FinderSpeedControlUIC", "lockSpeed playSpeedLockLayout is null");
        } else {
            com.tencent.mars.xlog.Log.i("FinderSpeedControlUIC", "lockSpeed speed: " + f17);
            finderSpeedControlUIC.f133652w = true;
            so2.j5 j5Var = (so2.j5) s0Var.f293125i;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (nativeDramaInfo = feedObject.getNativeDramaInfo()) != null) {
                ey2.v2 v2Var = (ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class);
                java.lang.Long valueOf = java.lang.Long.valueOf(nativeDramaInfo.getLong(0));
                android.app.Activity context = finderSpeedControlUIC.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                v2Var.V6(valueOf, nyVar != null ? java.lang.Integer.valueOf(nyVar.V6().getInteger(5)) : null, f17);
            }
            finderSpeedControlUIC.f133648s.g(f17, 2000L, new com.tencent.mm.plugin.finder.viewmodel.component.v50(f17, finderSpeedControlUIC, s0Var), com.tencent.mm.plugin.finder.view.yk.f133398d, s0Var, false);
            finderSpeedControlUIC.W6(s0Var);
        }
        return jz5.f0.f302826a;
    }
}
