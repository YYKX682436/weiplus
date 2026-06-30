package fl1;

/* loaded from: classes4.dex */
public class s0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f263863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f263864e;

    public s0(fl1.c1 c1Var, java.lang.Runnable runnable) {
        this.f263864e = c1Var;
        this.f263863d = runnable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f263864e.a();
        this.f263863d.run();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
