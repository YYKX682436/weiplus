package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class nr implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135348e;

    public nr(android.view.View view, in5.s0 s0Var) {
        this.f135347d = view;
        this.f135348e = s0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View view = this.f135347d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ((java.lang.Integer) animatedValue).intValue();
        view.requestLayout();
        in5.s0 s0Var = this.f135348e;
        androidx.recyclerview.widget.RecyclerView o17 = s0Var.o();
        if (o17 == null || (adapter = o17.getAdapter()) == null) {
            return;
        }
        adapter.notifyItemChanged(s0Var.getAdapterPosition(), new jz5.l(47, null));
    }
}
