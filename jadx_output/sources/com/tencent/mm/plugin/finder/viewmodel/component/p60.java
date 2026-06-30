package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class p60 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.x60 f135530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135531e;

    public p60(com.tencent.mm.plugin.finder.viewmodel.component.x60 x60Var, android.view.View view) {
        this.f135530d = x60Var;
        this.f135531e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.viewmodel.component.x60 x60Var = this.f135530d;
        android.view.View decorView = x60Var.f136404a.getWindow().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.removeView(x60Var.b());
        }
        this.f135531e.animate().setListener(null).cancel();
    }
}
