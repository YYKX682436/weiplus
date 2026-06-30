package ns4;

/* loaded from: classes3.dex */
public final class j0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.p0 f339552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f339553e;

    public j0(ns4.p0 p0Var, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f339552d = p0Var;
        this.f339553e = z2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        if (com.tencent.mm.ui.w9.c(this.f339552d.f339608a) || com.tencent.mm.ui.bk.g0() || com.tencent.mm.ui.bk.f0() || !fp.h.a(30)) {
            return;
        }
        android.view.View view = this.f339553e.f212058g;
        java.lang.Object animatedValue = anim.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setPadding(0, 0, 0, ((java.lang.Integer) animatedValue).intValue());
    }
}
