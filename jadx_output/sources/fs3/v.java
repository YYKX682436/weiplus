package fs3;

/* loaded from: classes15.dex */
public class v implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f266324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fs3.y f266325b;

    public v(fs3.y yVar, android.view.View view) {
        this.f266325b = yVar;
        this.f266324a = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f266324a.startAnimation(this.f266325b.f266333g);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
