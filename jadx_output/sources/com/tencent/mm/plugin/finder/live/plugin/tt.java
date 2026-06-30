package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tt implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f114476a;

    public tt(com.tencent.mm.plugin.finder.live.plugin.iv ivVar) {
        this.f114476a = ivVar;
    }

    @Override // com.google.android.material.appbar.e
    public void a(com.google.android.material.appbar.AppBarLayout view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f114476a;
        ivVar.E1.invalidateOutline();
        if (ivVar.E1.getVisibility() == 0) {
            android.view.ViewGroup.LayoutParams layoutParams = ivVar.E1.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            r1 = (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + ivVar.E1.getHeight() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        }
        com.google.android.material.appbar.AppBarLayout appBarLayout = ivVar.B1;
        int totalScrollRange = (appBarLayout != null ? appBarLayout.getTotalScrollRange() : ivVar.C1) - r1;
        float min = totalScrollRange == 0 ? 0.0f : java.lang.Math.min(java.lang.Math.abs(i17 * 1.0f) / totalScrollRange, 1.0f);
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = ivVar.Y;
        int i18 = ivVar.D1;
        ivVar.getClass();
        roundCornerRelativeLayout.setBackgroundColor(android.graphics.Color.argb((int) (android.graphics.Color.alpha(i18) * min), android.graphics.Color.red(i18), android.graphics.Color.green(i18), android.graphics.Color.blue(i18)));
        com.tencent.mars.xlog.Log.i(ivVar.f113016r, "onOffsetChanged fraction:" + min + " offset " + i17);
    }
}
