package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class l extends y9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e0 f118875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f118876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f118877c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f118878d;

    public l(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, float f17, float f18, float f19) {
        this.f118875a = e0Var;
        this.f118876b = f17;
        this.f118877c = f18;
        this.f118878d = f19;
    }

    @Override // y9.c
    public void a(android.view.View view, float f17) {
        float f18;
        kotlin.jvm.internal.o.g(view, "view");
        boolean isNaN = java.lang.Float.isNaN(f17);
        com.tencent.mm.plugin.finder.live.widget.e0 e0Var = this.f118875a;
        float f19 = 0.0f;
        if (isNaN) {
            f18 = 0.0f;
        } else {
            boolean z17 = e0Var.f118183e.getResources().getConfiguration().orientation == 2;
            float height = view.getHeight();
            float max = java.lang.Math.max(java.lang.Math.min(java.lang.Math.abs(z17 ? height * (1.0f - java.lang.Math.abs(f17)) : height * f17) / this.f118876b, 1.0f), 0.0f);
            f19 = max;
            f18 = java.lang.Math.max(java.lang.Math.min((max - 0.5f) * 2.0f, 1.0f), 0.0f);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveBottomSheet", "onSlide " + f17 + ", percent:" + f19 + ", arrowPercent:" + f18);
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) e0Var.f118201z).getValue()).getLayoutParams();
        kotlin.jvm.internal.o.f(layoutParams, "getLayoutParams(...)");
        float f27 = this.f118878d;
        float f28 = this.f118877c;
        layoutParams.height = (int) (f28 + (f19 * (f27 - f28)));
        ((android.view.View) ((jz5.n) e0Var.f118201z).getValue()).setLayoutParams(layoutParams);
        android.view.View view2 = (android.view.View) ((jz5.n) e0Var.A).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage$enableScrollHeaderLine$1", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage$enableScrollHeaderLine$1", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // y9.c
    public void b(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStateChanged ");
        sb6.append(i17);
        sb6.append(", isShowing:");
        com.tencent.mm.plugin.finder.live.widget.e0 e0Var = this.f118875a;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = e0Var.B;
        sb6.append(y1Var != null ? java.lang.Boolean.valueOf(y1Var.f()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveBottomSheet", sb6.toString());
        if (i17 == 5) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var2 = e0Var.B;
            if (y1Var2 != null && y1Var2.f()) {
                com.tencent.mm.plugin.finder.live.widget.e0.t(e0Var, false, 1, null);
            }
        }
        if (i17 == 4) {
            if (e0Var.f118183e.getResources().getConfiguration().orientation == 2) {
                com.tencent.mm.ui.widget.dialog.y1 y1Var3 = e0Var.B;
                if (y1Var3 != null && y1Var3.f()) {
                    com.tencent.mm.plugin.finder.live.widget.e0.t(e0Var, false, 1, null);
                }
            }
        }
    }
}
