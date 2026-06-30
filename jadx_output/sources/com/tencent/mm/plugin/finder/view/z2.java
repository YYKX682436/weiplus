package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public class z2 extends y9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f133445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f133446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f133447c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f133448d;

    public z2(com.tencent.mm.plugin.finder.view.e3 e3Var, float f17, float f18, float f19) {
        this.f133448d = e3Var;
        this.f133445a = f17;
        this.f133446b = f18;
        this.f133447c = f19;
    }

    @Override // y9.c
    public void a(android.view.View view, float f17) {
        float f18;
        boolean isNaN = java.lang.Float.isNaN(f17);
        com.tencent.mm.plugin.finder.view.e3 e3Var = this.f133448d;
        float f19 = 0.0f;
        if (isNaN) {
            f18 = 0.0f;
        } else {
            boolean d17 = e3Var.d();
            float height = view.getHeight();
            float max = java.lang.Math.max(java.lang.Math.min(java.lang.Math.abs(d17 ? height * (1.0f - java.lang.Math.abs(f17)) : height * f17) / this.f133445a, 1.0f), 0.0f);
            f19 = max;
            f18 = java.lang.Math.max(java.lang.Math.min((max - 0.5f) * 2.0f, 1.0f), 0.0f);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderBottomSheet", "onSlide " + f17 + ", percent:" + f19 + ", arrowPercent:" + f18);
        android.view.ViewGroup.LayoutParams layoutParams = e3Var.B.getLayoutParams();
        float f27 = this.f133447c;
        float f28 = this.f133446b;
        layoutParams.height = (int) (f28 + (f19 * (f27 - f28)));
        e3Var.B.setLayoutParams(layoutParams);
        android.view.View view2 = e3Var.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderBottomSheet$3", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/FinderBottomSheet$3", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // y9.c
    public void b(android.view.View view, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStateChanged ");
        sb6.append(i17);
        sb6.append(", isShowing:");
        com.tencent.mm.plugin.finder.view.e3 e3Var = this.f133448d;
        sb6.append(e3Var.f131957d.isShowing());
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderBottomSheet", sb6.toString());
        if (i17 == 5 && e3Var.f131957d.isShowing()) {
            e3Var.h();
        }
        if (i17 == 4 && e3Var.d() && e3Var.f131957d.isShowing()) {
            e3Var.h();
        }
    }
}
