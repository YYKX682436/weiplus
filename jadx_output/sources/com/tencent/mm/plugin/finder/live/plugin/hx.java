package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hx implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f112874a;

    public hx(com.tencent.mm.plugin.finder.live.plugin.ty tyVar) {
        this.f112874a = tyVar;
    }

    @Override // com.google.android.material.appbar.e
    public void a(com.google.android.material.appbar.AppBarLayout view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f112874a;
        tyVar.f114487p1.invalidateOutline();
        if (tyVar.f114487p1.getVisibility() == 0) {
            android.view.ViewGroup.LayoutParams layoutParams = tyVar.f114487p1.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            r1 = (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + tyVar.f114487p1.getHeight() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        }
        com.google.android.material.appbar.AppBarLayout appBarLayout = tyVar.f114496x0;
        int totalScrollRange = (appBarLayout != null ? appBarLayout.getTotalScrollRange() : tyVar.f114499y0) - r1;
        float min = totalScrollRange == 0 ? 0.0f : java.lang.Math.min(java.lang.Math.abs(i17 * 1.0f) / totalScrollRange, 1.0f);
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = tyVar.S;
        int i18 = tyVar.f114484l1;
        tyVar.getClass();
        roundCornerRelativeLayout.setBackgroundColor(android.graphics.Color.argb((int) (android.graphics.Color.alpha(i18) * min), android.graphics.Color.red(i18), android.graphics.Color.green(i18), android.graphics.Color.blue(i18)));
        com.tencent.mars.xlog.Log.i(tyVar.f114488q, "onOffsetChanged fraction:" + min + " offset " + i17);
    }
}
