package px2;

/* loaded from: classes2.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout f358923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f358924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy) {
        super(0);
        this.f358923d = finderVideoLandscapePreviewLayout;
        this.f358924e = finderThumbPlayerProxy;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var;
        ow2.h hVar;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.qj2 nativeDramaInfo;
        in5.s0 s0Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLockArea ");
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout = this.f358923d;
        sb6.append(finderVideoLandscapePreviewLayout.U);
        com.tencent.mars.xlog.Log.i("HorizontalVideoPreviewLayout", sb6.toString());
        if (finderVideoLandscapePreviewLayout.U != null) {
            float f17 = finderVideoLandscapePreviewLayout.f132584x0;
            finderVideoLandscapePreviewLayout.f132585x1 = true;
            finderVideoLandscapePreviewLayout.f132586y0 = true;
            this.f358924e.setPlaySpeed(f17);
            px2.v0 v0Var = finderVideoLandscapePreviewLayout.callback;
            so2.j5 j5Var = (v0Var == null || (s0Var2 = ((com.tencent.mm.plugin.finder.viewmodel.component.at) v0Var).f133803b.f135616q) == null) ? null : (so2.j5) s0Var2.f293125i;
            if (!(j5Var instanceof so2.j5)) {
                j5Var = null;
            }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (nativeDramaInfo = feedObject.getNativeDramaInfo()) != null) {
                ey2.v2 v2Var = (ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class);
                java.lang.Long valueOf = java.lang.Long.valueOf(nativeDramaInfo.getLong(0));
                android.content.Context context = finderVideoLandscapePreviewLayout.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                v2Var.V6(valueOf, nyVar != null ? java.lang.Integer.valueOf(nyVar.V6().getInteger(5)) : null, f17);
            }
            px2.v0 v0Var2 = finderVideoLandscapePreviewLayout.callback;
            if (v0Var2 != null && (s0Var = ((com.tencent.mm.plugin.finder.viewmodel.component.at) v0Var2).f133803b.f135616q) != null && (hVar = finderVideoLandscapePreviewLayout.W) != null) {
                hVar.g(f17, 2000L, new px2.o0(f17, finderVideoLandscapePreviewLayout, s0Var), com.tencent.mm.plugin.finder.view.yk.f133398d, s0Var, true);
            }
            com.tencent.mars.xlog.Log.i("HorizontalVideoPreviewLayout", "lockSpeed: speed=" + f17);
            finderVideoLandscapePreviewLayout.y();
        }
        return jz5.f0.f302826a;
    }
}
