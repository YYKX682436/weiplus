package sr2;

/* loaded from: classes10.dex */
public final class p implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.r f411668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f411669b;

    public p(sr2.r rVar, int i17) {
        this.f411668a = rVar;
        this.f411669b = i17;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        sr2.r rVar = this.f411668a;
        rVar.f411691c = this.f411669b;
        yz5.a aVar = rVar.f411690b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
