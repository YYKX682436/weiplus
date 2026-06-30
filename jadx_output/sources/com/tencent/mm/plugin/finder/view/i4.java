package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f132285d;

    public i4(com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout) {
        this.f132285d = finderColumnFrameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout.H;
        com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout = this.f132285d;
        finderColumnFrameLayout.getClass();
        int f17 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479672c9);
        int width = finderColumnFrameLayout.c().getWidth();
        int min = ((width - java.lang.Math.min(width, (int) (r2.getHeight() * 0.5625f))) / 2) - com.tencent.mm.plugin.finder.view.x.f133311d;
        if (min >= f17) {
            f17 = min;
        }
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView recyclerView = finderColumnFrameLayout.getRecyclerView();
        recyclerView.setPadding(f17, recyclerView.getPaddingTop(), f17, recyclerView.getPaddingBottom());
        finderColumnFrameLayout.getRecyclerView().setClipToPadding(false);
    }
}
