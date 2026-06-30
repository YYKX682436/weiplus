package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class z6 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView f116854d;

    public z6(com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView) {
        this.f116854d = finderLiveMiniView;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        dk2.xf k17;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView = this.f116854d;
        com.tencent.mars.xlog.Log.i(finderLiveMiniView.getTAG(), "switch audio only mode to " + booleanValue + " from mini window");
        finderLiveMiniView.f116039n.setImageResource(booleanValue ? com.tencent.mm.R.raw.icons_eyes_on_filled : com.tencent.mm.R.raw.icons_filled_mini_win_ear);
        gk2.e eVar = gk2.e.f272471n;
        if (eVar != null && (k17 = dk2.ef.f233372a.k(eVar)) != null) {
            if (((dk2.r4) k17).t(booleanValue, true)) {
                finderLiveMiniView.b(booleanValue, false);
            } else {
                com.tencent.mars.xlog.Log.w(finderLiveMiniView.getTAG(), "cdn switch audio only to " + booleanValue + " failed. Could because cdn failure or that the user is already in the target mode");
            }
        }
        return jz5.f0.f302826a;
    }
}
