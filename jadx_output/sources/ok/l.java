package ok;

/* loaded from: classes10.dex */
public class l implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ok.m f345940d;

    public l(ok.m mVar) {
        this.f345940d = mVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        ok.m mVar = this.f345940d;
        mVar.f345927a = true;
        mVar.f345946h = 0.0f;
        mVar.f345947i = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        ok.m mVar = this.f345940d;
        mVar.f345927a = true;
        mVar.f345946h = 0.0f;
        mVar.f345947i = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        ok.m mVar = this.f345940d;
        mVar.f345927a = false;
        mVar.f345946h = 0.0f;
        mVar.f345947i = 0.0f;
    }
}
