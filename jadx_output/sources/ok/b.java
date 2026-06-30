package ok;

/* loaded from: classes10.dex */
public class b implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ok.c f345911d;

    public b(ok.c cVar) {
        this.f345911d = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        ok.c cVar = this.f345911d;
        cVar.f345927a = true;
        cVar.f345928b = false;
        cVar.f345920k = 0L;
        cVar.f345913d.O();
        cVar.f345913d.s();
        android.animation.Animator.AnimatorListener animatorListener = cVar.f345921l;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        ok.c cVar = this.f345911d;
        cVar.f345913d.P = true;
        cVar.f345927a = false;
        cVar.f345928b = true;
    }
}
