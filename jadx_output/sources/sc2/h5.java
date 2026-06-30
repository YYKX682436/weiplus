package sc2;

/* loaded from: classes2.dex */
public final class h5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405947d;

    public h5(android.view.View view) {
        this.f405947d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        pm0.v.X(new sc2.g5(it, this.f405947d));
    }
}
