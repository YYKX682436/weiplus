package oa5;

/* loaded from: classes8.dex */
public class k implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f343885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oa5.m f343886e;

    public k(oa5.m mVar, android.animation.ValueAnimator valueAnimator) {
        this.f343886e = mVar;
        this.f343885d = valueAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        oa5.m mVar = this.f343886e;
        android.animation.Animator.AnimatorListener animatorListener = mVar.f343883h;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(null);
        }
        java.util.HashMap hashMap = mVar.f343856b;
        if (hashMap != null) {
            hashMap.remove(this.f343885d);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        oa5.m mVar = this.f343886e;
        mVar.getClass();
        android.animation.Animator.AnimatorListener animatorListener = mVar.f343883h;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(null);
        }
        java.util.HashMap hashMap = mVar.f343856b;
        if (hashMap != null) {
            android.animation.ValueAnimator valueAnimator = this.f343885d;
            java.lang.Runnable runnable = (java.lang.Runnable) hashMap.get(valueAnimator);
            if (runnable != null) {
                runnable.run();
            }
            mVar.f343856b.remove(valueAnimator);
        }
        java.util.HashMap hashMap2 = mVar.f343856b;
        if (hashMap2 != null && hashMap2.isEmpty()) {
            mVar.f343883h = null;
        }
        mVar.f343859e = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f343886e.f343883h;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        oa5.m mVar = this.f343886e;
        android.animation.Animator.AnimatorListener animatorListener = mVar.f343883h;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(null);
        }
        java.util.HashMap hashMap = mVar.f343855a;
        if (hashMap != null) {
            android.animation.ValueAnimator valueAnimator = this.f343885d;
            java.lang.Runnable runnable = (java.lang.Runnable) hashMap.get(valueAnimator);
            if (runnable != null) {
                runnable.run();
            }
            mVar.f343855a.remove(valueAnimator);
        }
        mVar.getClass();
    }
}
