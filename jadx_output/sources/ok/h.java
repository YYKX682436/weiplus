package ok;

/* loaded from: classes10.dex */
public final class h implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ok.i f345930d;

    public h(ok.i iVar) {
        this.f345930d = iVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        ok.i iVar = this.f345930d;
        iVar.f345927a = true;
        iVar.f345928b = false;
        iVar.f345935g = 0.0f;
        iVar.f345936h = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        ok.i iVar = this.f345930d;
        iVar.f345927a = true;
        iVar.f345928b = false;
        iVar.f345935g = 0.0f;
        iVar.f345936h = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        ok.i iVar = this.f345930d;
        iVar.f345927a = false;
        iVar.f345935g = 0.0f;
        iVar.f345936h = 0.0f;
    }
}
