package hr3;

/* loaded from: classes11.dex */
public class sh implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f283987d;

    public sh(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, java.lang.Runnable runnable) {
        this.f283987d = runnable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.Runnable runnable = this.f283987d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
