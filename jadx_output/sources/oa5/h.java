package oa5;

/* loaded from: classes8.dex */
public class h implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f343879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oa5.j f343880e;

    public h(oa5.j jVar, android.animation.ValueAnimator valueAnimator) {
        this.f343880e = jVar;
        this.f343879d = valueAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        oa5.j jVar = this.f343880e;
        android.animation.Animator.AnimatorListener animatorListener = jVar.f343883h;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(null);
        }
        jVar.f343884i = null;
        java.util.HashMap hashMap = jVar.f343856b;
        if (hashMap != null) {
            hashMap.remove(this.f343879d);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        oa5.j jVar = this.f343880e;
        jVar.getClass();
        jVar.f343884i = null;
        android.animation.Animator.AnimatorListener animatorListener = jVar.f343883h;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(null);
        }
        java.util.HashMap hashMap = jVar.f343856b;
        if (hashMap != null) {
            android.animation.ValueAnimator valueAnimator = this.f343879d;
            java.lang.Runnable runnable = (java.lang.Runnable) hashMap.get(valueAnimator);
            if (runnable != null) {
                runnable.run();
            }
            jVar.f343856b.remove(valueAnimator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f343880e.f343883h;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        oa5.j jVar = this.f343880e;
        android.animation.Animator.AnimatorListener animatorListener = jVar.f343883h;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(null);
        }
        java.util.HashMap hashMap = jVar.f343855a;
        if (hashMap != null) {
            android.animation.ValueAnimator valueAnimator = this.f343879d;
            java.lang.Runnable runnable = (java.lang.Runnable) hashMap.get(valueAnimator);
            if (runnable != null) {
                runnable.run();
            }
            jVar.f343855a.remove(valueAnimator);
        }
        jVar.getClass();
    }
}
