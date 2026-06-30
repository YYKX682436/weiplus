package s4;

/* loaded from: classes15.dex */
public class j implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout f402887a;

    public j(androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
        this.f402887a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout = this.f402887a;
        swipeRefreshLayout.getClass();
        s4.h hVar = new s4.h(swipeRefreshLayout);
        swipeRefreshLayout.F = hVar;
        hVar.setDuration(150L);
        s4.a aVar = swipeRefreshLayout.f12371x;
        aVar.f402846d = null;
        aVar.clearAnimation();
        swipeRefreshLayout.f12371x.startAnimation(swipeRefreshLayout.F);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
