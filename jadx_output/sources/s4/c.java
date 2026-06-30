package s4;

/* loaded from: classes15.dex */
public class c implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s4.d f402849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s4.e f402850e;

    public c(s4.e eVar, s4.d dVar) {
        this.f402850e = eVar;
        this.f402849d = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        s4.e eVar = this.f402850e;
        s4.d dVar = this.f402849d;
        eVar.a(1.0f, dVar, true);
        dVar.f402861k = dVar.f402855e;
        dVar.f402862l = dVar.f402856f;
        dVar.f402863m = dVar.f402857g;
        dVar.a((dVar.f402860j + 1) % dVar.f402859i.length);
        if (!eVar.f402880i) {
            eVar.f402879h += 1.0f;
            return;
        }
        eVar.f402880i = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (dVar.f402864n) {
            dVar.f402864n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f402850e.f402879h = 0.0f;
    }
}
