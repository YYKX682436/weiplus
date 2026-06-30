package px2;

/* loaded from: classes2.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout f358901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout) {
        super(1);
        this.f358901d = finderVideoLandscapePreviewLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar;
        in5.s0 s0Var;
        float floatValue = ((java.lang.Number) obj).floatValue();
        int i17 = com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout.C1;
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout = this.f358901d;
        finderVideoLandscapePreviewLayout.getClass();
        com.tencent.mars.xlog.Log.i("HorizontalVideoPreviewLayout", "handleSpeedIndicatorClick: clickedSpeed=" + floatValue);
        px2.v0 v0Var = finderVideoLandscapePreviewLayout.callback;
        if (v0Var != null && (s0Var = (ptVar = ((com.tencent.mm.plugin.finder.viewmodel.component.at) v0Var).f133803b).f135616q) != null) {
            android.view.View view = ptVar.f135613n;
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = view instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) view : null;
            if (finderThumbPlayerProxy != null) {
                android.content.Context context = finderVideoLandscapePreviewLayout.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
                com.tencent.mm.plugin.finder.viewmodel.component.k60 k60Var = com.tencent.mm.plugin.finder.viewmodel.component.k60.f134925e;
                kz5.p0 p0Var = kz5.p0.f313996d;
                ow2.h hVar = finderVideoLandscapePreviewLayout.W;
                kotlin.jvm.internal.o.d(finderSpeedControlUIC);
                com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.a7(finderSpeedControlUIC, s0Var, p0Var, finderThumbPlayerProxy, k60Var, null, hVar, 16, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
