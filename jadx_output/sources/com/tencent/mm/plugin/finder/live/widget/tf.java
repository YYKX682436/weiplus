package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class tf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget f119883d;

    public tf(com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget finderLiveFansClubTagWidget) {
        this.f119883d = finderLiveFansClubTagWidget;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget finderLiveFansClubTagWidget = this.f119883d;
        finderLiveFansClubTagWidget.getHitRect(rect);
        int i17 = -com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        rect.inset(i17, i17);
        java.lang.Object parent = finderLiveFansClubTagWidget.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, finderLiveFansClubTagWidget));
    }
}
