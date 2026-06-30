package fs3;

/* loaded from: classes15.dex */
public class w implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f266326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fs3.y f266327b;

    public w(fs3.y yVar, android.view.View view) {
        this.f266327b = yVar;
        this.f266326a = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f266326a.startAnimation(this.f266327b.f266334h);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
