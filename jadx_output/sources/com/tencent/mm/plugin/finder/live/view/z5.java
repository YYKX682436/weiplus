package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes5.dex */
public final class z5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveLinkIndicator f116853d;

    public z5(com.tencent.mm.plugin.finder.live.view.FinderLiveLinkIndicator finderLiveLinkIndicator) {
        this.f116853d = finderLiveLinkIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveLinkIndicator finderLiveLinkIndicator = this.f116853d;
        finderLiveLinkIndicator.f115999d.getLayoutParams().width = finderLiveLinkIndicator.f116000e.getMeasuredWidth();
        finderLiveLinkIndicator.f115999d.requestLayout();
    }
}
