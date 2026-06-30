package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public interface ep0 {
    private default boolean E(android.content.Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    cm2.t A();

    void B(android.os.Bundle bundle, java.lang.Object obj, long j17);

    default void R(com.tencent.mm.plugin.finder.live.plugin.l plugin, yz5.a callback) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3866r7).getValue()).r()).intValue() == 1) {
            if (!q0()) {
                com.tencent.mars.xlog.Log.e("IFinderLivePromoteItem", "runDelShopBubbleAnimateV2 when shopping not visible");
                callback.invoke();
                return;
            }
            android.view.View view = getView();
            if (view.findViewById(com.tencent.mm.R.id.f484816fm5) == null) {
                com.tencent.mars.xlog.Log.e("IFinderLivePromoteItem", "try del anim when bubble not attached");
                return;
            }
            android.graphics.Rect p17 = p(view);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            com.tencent.mm.plugin.finder.live.util.y.m(plugin, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.live.plugin.wo0(this, view, p17, callback, null), 2, null);
            return;
        }
        android.view.View view2 = getView();
        kotlin.jvm.internal.o.g(view2, "view");
        int measuredWidth = view2.getMeasuredWidth();
        int measuredHeight = view2.getMeasuredHeight();
        int[] t17 = pm0.v.t(view2);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (zl2.r4.f473950a.w1()) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = k0Var != null ? (com.tencent.mm.plugin.finder.live.plugin.c4) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.c4.class) : null;
            if (c4Var != null) {
                int[] t18 = pm0.v.t(c4Var.f112105y.f456666o);
                android.content.Context context = view2.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                if (E(context)) {
                    rect.left = (int) ((t18[0] - ((measuredWidth * 0.8f) / 2)) - t17[0]);
                } else {
                    int i17 = t18[0];
                    int i18 = measuredWidth / 2;
                    int i19 = i17 - i18;
                    rect.left = i19;
                    if (i17 >= i18) {
                        rect.left = i19 + ((int) ((measuredWidth * 0.2f) / 2));
                    }
                }
                rect.bottom = -((int) (measuredHeight * 0.6f));
            }
        } else {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
            com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = k0Var2 != null ? (com.tencent.mm.plugin.finder.live.plugin.ag0) k0Var2.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ag0.class) : null;
            if (ag0Var != null) {
                int[] H1 = ag0Var.H1();
                android.content.Context context2 = view2.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                if (E(context2)) {
                    rect.left = (int) ((H1[0] - ((measuredWidth * 0.8f) / 2)) - t17[0]);
                } else {
                    int i27 = H1[0];
                    int i28 = measuredWidth / 2;
                    int i29 = i27 - i28;
                    rect.left = i29;
                    if (i27 >= i28) {
                        rect.left = i29 + ((int) ((measuredWidth * 0.2f) / 2));
                    }
                }
                rect.bottom = -((int) (measuredHeight * 0.6f));
            }
        }
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.2f, 1.0f).setDuration(300L);
        duration.addUpdateListener(new com.tencent.mm.plugin.finder.live.plugin.uo0(view2, rect));
        duration.addListener(new com.tencent.mm.plugin.finder.live.plugin.vo0(callback));
        duration.start();
    }

    void U();

    int e0();

    void f0(java.lang.Object obj);

    android.view.View getView();

    void l(java.lang.Object obj);

    void l0();

    default void onPause() {
    }

    default void onResume() {
    }

    default android.graphics.Rect p(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        int measuredHeight = view.getMeasuredHeight();
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.hal);
        if (findViewById == null) {
            return new android.graphics.Rect(0, 0, 0, 0);
        }
        int measuredWidth = findViewById.getMeasuredWidth();
        findViewById.getMeasuredHeight();
        int[] t17 = pm0.v.t(view);
        int[] t18 = pm0.v.t(findViewById);
        float dimension = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (zl2.r4.f473950a.w1()) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = k0Var != null ? (com.tencent.mm.plugin.finder.live.plugin.c4) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.c4.class) : null;
            if (c4Var != null) {
                xt2.d dVar = c4Var.f112105y;
                int[] t19 = pm0.v.t(dVar.c());
                int[] t27 = pm0.v.t(dVar.f456666o);
                int measuredWidth2 = dVar.f456666o.getMeasuredWidth();
                rect.left = (t27[0] - t17[0]) + ((int) ((measuredWidth2 / 2) - (((t18[0] - r18) + (measuredWidth / 2)) * 0.3f)));
                int i17 = t19[1] - t17[1];
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                rect.top = (int) ((i17 - ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r8.bottomMargin : 0)) - dimension);
                com.tencent.mars.xlog.Log.i("IFinderLivePromoteItem", "get source rect, entrance loc = " + kz5.z.c0(t27, null, null, null, 0, null, null, 63, null) + " view loc = " + kz5.z.c0(t17, null, null, null, 0, null, null, 63, null) + ", viewHeight = " + measuredHeight + ", top = " + rect.top);
            }
        } else {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
            com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = k0Var2 != null ? (com.tencent.mm.plugin.finder.live.plugin.ag0) k0Var2.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ag0.class) : null;
            if (ag0Var != null) {
                int[] t28 = pm0.v.t(ag0Var.f111883y.c());
                int[] H1 = ag0Var.H1();
                int measuredWidth3 = ag0Var.f111883y.h().getMeasuredWidth();
                rect.left = (H1[0] - t17[0]) + ((int) ((measuredWidth3 / 2) - (((t18[0] - r18) + (measuredWidth / 2)) * 0.3f)));
                int i18 = t28[1] - t17[1];
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                rect.top = (int) ((i18 - ((layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null) != null ? r8.bottomMargin : 0)) - dimension);
                com.tencent.mars.xlog.Log.i("IFinderLivePromoteItem", "get source rect, entrance loc = " + kz5.z.c0(H1, null, null, null, 0, null, null, 63, null) + " view loc = " + kz5.z.c0(t17, null, null, null, 0, null, null, 63, null) + ", viewHeight = " + measuredHeight + ", imgWidth = " + measuredWidth + ", top = " + rect.top);
            }
        }
        return rect;
    }

    int p0();

    default boolean q0() {
        if (zl2.r4.f473950a.w1()) {
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = k0Var != null ? (com.tencent.mm.plugin.finder.live.plugin.c4) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.c4.class) : null;
            if (c4Var != null && c4Var.f112105y.isVisible()) {
                return true;
            }
        } else {
            dk2.ef efVar2 = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
            com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = k0Var2 != null ? (com.tencent.mm.plugin.finder.live.plugin.ag0) k0Var2.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ag0.class) : null;
            if (ag0Var != null && ag0Var.f111883y.isVisible()) {
                return true;
            }
        }
        return false;
    }

    default void r0(android.os.Bundle bundle, long j17) {
    }

    default void t() {
    }
}
