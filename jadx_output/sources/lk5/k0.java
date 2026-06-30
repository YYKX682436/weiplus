package lk5;

/* loaded from: classes2.dex */
public final class k0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f319040d;

    public k0(kotlin.jvm.internal.f0 f0Var) {
        this.f319040d = f0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f319040d.f310116d++;
        java.lang.System.currentTimeMillis();
    }
}
