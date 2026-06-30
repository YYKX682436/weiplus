package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class sc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLandscapeSpeedIndicatorView f133032d;

    public sc(com.tencent.mm.plugin.finder.view.FinderLandscapeSpeedIndicatorView finderLandscapeSpeedIndicatorView) {
        this.f133032d = finderLandscapeSpeedIndicatorView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderLandscapeSpeedIndicatorView finderLandscapeSpeedIndicatorView = this.f133032d;
        yz5.a aVar = finderLandscapeSpeedIndicatorView.A;
        boolean z17 = false;
        if (aVar != null && ((java.lang.Boolean) aVar.invoke()).booleanValue()) {
            z17 = true;
        }
        if (z17) {
            finderLandscapeSpeedIndicatorView.k(finderLandscapeSpeedIndicatorView.getF131477p());
        }
    }
}
