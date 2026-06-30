package mx0;

/* loaded from: classes5.dex */
public final class a3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f331822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f331823e;

    public a3(android.animation.AnimatorListenerAdapter animatorListenerAdapter, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f331822d = animatorListenerAdapter;
        this.f331823e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "playReverseAni no record >> end");
        this.f331822d.onAnimationEnd(animation);
        this.f331823e.setListener(null);
    }
}
