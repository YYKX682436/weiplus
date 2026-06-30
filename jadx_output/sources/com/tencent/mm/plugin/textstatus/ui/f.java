package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.CustomStatusView f173853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f173854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f173855f;

    public f(com.tencent.mm.plugin.textstatus.ui.CustomStatusView customStatusView, android.content.Context context, android.view.View view) {
        this.f173853d = customStatusView;
        this.f173854e = context;
        this.f173855f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        it.getAnimatedFraction();
        float animatedFraction = it.getAnimatedFraction();
        com.tencent.mm.plugin.textstatus.ui.CustomStatusView customStatusView = this.f173853d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = customStatusView.f173408g;
        android.content.Context context = this.f173854e;
        com.tencent.mm.plugin.textstatus.ui.CustomStatusView.a(customStatusView, mMEditText, 0, (int) (ym5.x.a(context, 48.0f) - (ym5.x.a(context, 48.0f) * animatedFraction)));
        com.tencent.mm.plugin.textstatus.ui.CustomStatusView.a(customStatusView, customStatusView.f173413o, 0, (int) (ym5.x.a(context, 64.0f) - (ym5.x.a(context, 64.0f) * animatedFraction)));
        if (animatedFraction >= 0.5f) {
            android.view.View view = customStatusView.f173412n;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$fold$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/CustomStatusView$fold$1$2$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = customStatusView.f173415q;
            if (view2 != null) {
                view2.setBackground(null);
            }
            this.f173855f.setBackground(context.getDrawable(com.tencent.mm.R.drawable.b6i));
        }
        if (animatedFraction >= 1.0d) {
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = customStatusView.f173408g;
            if (mMEditText2 != null) {
                mMEditText2.setVisibility(8);
            }
            android.widget.TextView tvInputTips = customStatusView.getTvInputTips();
            if (tvInputTips != null) {
                tvInputTips.setVisibility(0);
            }
        }
    }
}
