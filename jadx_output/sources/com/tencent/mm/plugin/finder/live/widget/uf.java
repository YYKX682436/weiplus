package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class uf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget f119971d;

    public uf(com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget finderLiveFansClubTagWidget) {
        this.f119971d = finderLiveFansClubTagWidget;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zl2.q4 q4Var = zl2.q4.f473933a;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget finderLiveFansClubTagWidget = this.f119971d;
        zl2.q4.k(q4Var, finderLiveFansClubTagWidget.getTagTv(), finderLiveFansClubTagWidget.getTagTv().getMeasuredWidth(), 0, 0L, new com.tencent.mm.plugin.finder.live.widget.sf(finderLiveFansClubTagWidget), 8, null);
        com.tencent.mars.xlog.Log.i("FinderLiveFansClubTagWidget", "showTag reset tag!");
        finderLiveFansClubTagWidget.post(new com.tencent.mm.plugin.finder.live.widget.tf(finderLiveFansClubTagWidget));
    }
}
