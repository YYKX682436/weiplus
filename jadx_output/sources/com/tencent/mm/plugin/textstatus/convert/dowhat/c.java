package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes3.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.dowhat.i f173225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f173226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f173227f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f173228g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f173229h;

    public c(com.tencent.mm.plugin.textstatus.convert.dowhat.i iVar, android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2) {
        this.f173225d = iVar;
        this.f173226e = context;
        this.f173227f = viewGroup;
        this.f173228g = view;
        this.f173229h = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        it.getAnimatedFraction();
        float animatedFraction = it.getAnimatedFraction();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f173225d.f173238i;
        if (mMEditText != null) {
            mMEditText.setVisibility(0);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f173225d.f173238i;
        int a17 = (int) (ym5.x.a(this.f173226e, 48.0f) * animatedFraction);
        if (mMEditText2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = mMEditText2.getLayoutParams();
            layoutParams.height = a17;
            mMEditText2.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.textstatus.convert.dowhat.i iVar = this.f173225d;
        android.view.ViewGroup viewGroup = this.f173227f;
        int a18 = (int) (ym5.x.a(this.f173226e, 64.0f) * animatedFraction);
        iVar.getClass();
        if (viewGroup != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            layoutParams2.height = a18;
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (animatedFraction >= 0.5f) {
            android.view.View view = this.f173228g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$expand$3$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$expand$3$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f173229h.setBackground(this.f173226e.getDrawable(com.tencent.mm.R.drawable.btn));
        }
        if (animatedFraction >= 1.0d) {
            com.tencent.mm.ui.widget.MMEditText mMEditText3 = this.f173225d.f173238i;
            if (mMEditText3 != null) {
                mMEditText3.requestFocus();
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.textstatus.convert.dowhat.b bVar = new com.tencent.mm.plugin.textstatus.convert.dowhat.b(this.f173225d, this.f173226e);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(bVar, 50L, false);
        }
    }
}
