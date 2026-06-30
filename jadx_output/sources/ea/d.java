package ea;

/* loaded from: classes15.dex */
public class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f250469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ea.l f250470e;

    public d(ea.l lVar, boolean z17, ea.i iVar) {
        this.f250470e = lVar;
        this.f250469d = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        ea.l lVar = this.f250470e;
        lVar.f250480a = 0;
        lVar.f250481b = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        ea.l lVar = this.f250470e;
        lVar.f250498s.a(0, this.f250469d);
        lVar.f250480a = 2;
        lVar.f250481b = animator;
    }
}
