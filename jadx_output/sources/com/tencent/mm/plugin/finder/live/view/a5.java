package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class a5 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 f116176d;

    public a5(com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 finderLiveFloatContainerV2) {
        this.f116176d = finderLiveFloatContainerV2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 finderLiveFloatContainerV2;
        com.tencent.mm.plugin.finder.live.view.v4 v4Var;
        if ((i28 == i17 && i29 == i18 && i37 == i19 && i38 == i27) || (v4Var = (finderLiveFloatContainerV2 = this.f116176d).f115873d) == com.tencent.mm.plugin.finder.live.view.v4.f116732e || v4Var == com.tencent.mm.plugin.finder.live.view.v4.f116731d) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "handle parent layout changed");
        finderLiveFloatContainerV2.i(false);
    }
}
