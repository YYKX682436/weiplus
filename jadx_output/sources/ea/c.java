package ea;

/* loaded from: classes15.dex */
public class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f250466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f250467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ea.l f250468f;

    public c(ea.l lVar, boolean z17, ea.i iVar) {
        this.f250468f = lVar;
        this.f250467e = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f250466d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        ea.l lVar = this.f250468f;
        lVar.f250480a = 0;
        lVar.f250481b = null;
        if (this.f250466d) {
            return;
        }
        com.google.android.material.internal.VisibilityAwareImageButton visibilityAwareImageButton = lVar.f250498s;
        boolean z17 = this.f250467e;
        visibilityAwareImageButton.a(z17 ? 8 : 4, z17);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        ea.l lVar = this.f250468f;
        lVar.f250498s.a(0, this.f250467e);
        lVar.f250480a = 1;
        lVar.f250481b = animator;
        this.f250466d = false;
    }
}
