package s4;

/* loaded from: classes15.dex */
public class f implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout f402881a;

    public f(androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
        this.f402881a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout = this.f402881a;
        if (!swipeRefreshLayout.f12355e) {
            swipeRefreshLayout.f();
            return;
        }
        swipeRefreshLayout.D.setAlpha(255);
        swipeRefreshLayout.D.start();
        if (swipeRefreshLayout.I) {
            swipeRefreshLayout.getClass();
        }
        swipeRefreshLayout.f12365r = swipeRefreshLayout.f12371x.getTop();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
