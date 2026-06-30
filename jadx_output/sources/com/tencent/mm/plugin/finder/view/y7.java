package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class y7 extends y9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderDraggableIndicator f133379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f133380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133381c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f133383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f133384f;

    public y7(com.tencent.mm.plugin.finder.view.FinderDraggableIndicator finderDraggableIndicator, float f17, android.view.View view, android.view.View view2, float f18, float f19) {
        this.f133379a = finderDraggableIndicator;
        this.f133380b = f17;
        this.f133381c = view;
        this.f133382d = view2;
        this.f133383e = f18;
        this.f133384f = f19;
    }

    @Override // y9.c
    public void a(android.view.View view, float f17) {
        float f18;
        kotlin.jvm.internal.o.g(view, "view");
        float f19 = 0.0f;
        if (java.lang.Float.isNaN(f17)) {
            f18 = 0.0f;
        } else {
            float max = java.lang.Math.max(java.lang.Math.min(java.lang.Math.abs(view.getHeight() * f17) / this.f133380b, 1.0f), 0.0f);
            f19 = max;
            f18 = java.lang.Math.max(java.lang.Math.min((max - 0.5f) * 2.0f, 1.0f), 0.0f);
        }
        android.view.View view2 = this.f133381c;
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            int i17 = com.tencent.mm.plugin.finder.view.FinderDraggableIndicator.f130979i;
            float f27 = this.f133384f;
            float f28 = this.f133383e;
            layoutParams.height = (int) (f28 + (f19 * (f27 - f28)));
        } else {
            layoutParams = null;
        }
        view2.setLayoutParams(layoutParams);
        android.view.View view3 = this.f133382d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderDraggableIndicator$connectToBottomSheetBehavior$1$2", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/FinderDraggableIndicator$connectToBottomSheetBehavior$1$2", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // y9.c
    public void b(android.view.View view, int i17) {
        yz5.a onBottomSheetDismiss;
        kotlin.jvm.internal.o.g(view, "view");
        if ((i17 == 4 || i17 == 5) && (onBottomSheetDismiss = this.f133379a.getOnBottomSheetDismiss()) != null) {
            onBottomSheetDismiss.invoke();
        }
    }
}
