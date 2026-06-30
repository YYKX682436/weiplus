package mx0;

/* loaded from: classes5.dex */
public final class b3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f331844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f331845e;

    public b3(android.animation.AnimatorListenerAdapter animatorListenerAdapter, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f331844d = animatorListenerAdapter;
        this.f331845e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "playReverseAni is record >> ani end");
        this.f331844d.onAnimationEnd(animation);
        this.f331845e.setListener(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "playReverseAni is record >> ani start");
        this.f331844d.onAnimationStart(animation);
    }
}
