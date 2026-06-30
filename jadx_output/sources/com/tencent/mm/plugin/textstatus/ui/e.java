package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.CustomStatusView f173818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f173819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f173820f;

    public e(com.tencent.mm.plugin.textstatus.ui.CustomStatusView customStatusView, android.content.Context context, android.view.View view) {
        this.f173818d = customStatusView;
        this.f173819e = context;
        this.f173820f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        it.getAnimatedFraction();
        float animatedFraction = it.getAnimatedFraction();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f173818d.f173408g;
        if (mMEditText != null) {
            mMEditText.setVisibility(0);
        }
        com.tencent.mm.plugin.textstatus.ui.CustomStatusView customStatusView = this.f173818d;
        com.tencent.mm.plugin.textstatus.ui.CustomStatusView.a(customStatusView, customStatusView.f173408g, 0, (int) (ym5.x.a(this.f173819e, 48.0f) * animatedFraction));
        com.tencent.mm.plugin.textstatus.ui.CustomStatusView customStatusView2 = this.f173818d;
        com.tencent.mm.plugin.textstatus.ui.CustomStatusView.a(customStatusView2, customStatusView2.f173413o, 0, (int) (ym5.x.a(this.f173819e, 64.0f) * animatedFraction));
        if (animatedFraction >= 0.5f) {
            if (bk4.i.a().y()) {
                android.view.View view = this.f173818d.f173412n;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$expand$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$expand$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.view.View view2 = this.f173818d.f173412n;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$expand$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$expand$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            android.view.View view3 = this.f173818d.f173415q;
            if (view3 != null) {
                view3.setBackground(this.f173819e.getDrawable(com.tencent.mm.R.drawable.b6h));
            }
            this.f173820f.setBackground(this.f173819e.getDrawable(com.tencent.mm.R.drawable.btj));
        }
        if (animatedFraction >= 1.0d) {
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f173818d.f173408g;
            if (mMEditText2 != null) {
                mMEditText2.requestFocus();
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.textstatus.ui.d dVar = new com.tencent.mm.plugin.textstatus.ui.d(this.f173818d, this.f173819e);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(dVar, 50L, false);
        }
    }
}
