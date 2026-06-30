package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class l6 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final android.view.animation.DecelerateInterpolator f129457n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.o6 f129458o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.LayoutManager f129459p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(com.tencent.mm.plugin.finder.ui.o6 o6Var, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.content.Context context) {
        super(context);
        this.f129458o = o6Var;
        this.f129459p = layoutManager;
        this.f129457n = new android.view.animation.DecelerateInterpolator(2.0f);
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void e(android.view.View targetView, androidx.recyclerview.widget.h3 state, androidx.recyclerview.widget.e3 action) {
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        int[] c17 = this.f129458o.c(this.f129459p, targetView);
        int i17 = c17[0];
        int i18 = c17[1];
        int k17 = k(java.lang.Math.max(java.lang.Math.abs(i17), java.lang.Math.abs(i18)));
        if (k17 > 0) {
            action.b(i17, i18, k17, this.f129457n);
        }
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        int i17;
        kotlin.jvm.internal.o.g(displayMetrics, "displayMetrics");
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) this.f129459p;
        finderLinearLayoutManager.getClass();
        float f17 = finderLinearLayoutManager.f132640y;
        if (f17 > 0.0f) {
            i17 = displayMetrics.heightPixels;
        } else {
            f17 = finderLinearLayoutManager.f132639x;
            i17 = displayMetrics.densityDpi;
        }
        return f17 / i17;
    }
}
