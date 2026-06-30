package s4;

/* loaded from: classes15.dex */
public class l extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout f402889d;

    public l(androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
        this.f402889d = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        this.f402889d.e(f17);
    }
}
