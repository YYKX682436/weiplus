package ea3;

/* loaded from: classes10.dex */
public class y implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f250680a = new ea3.x(this);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ea3.p f250681b;

    public y(ea3.p pVar) {
        this.f250681b = pVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        ea3.p pVar = this.f250681b;
        pVar.f250663v.setVisibility(0);
        pVar.f250663v.postDelayed(this.f250680a, 4000L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
