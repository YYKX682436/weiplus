package s4;

/* loaded from: classes15.dex */
public class g extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout f402882d;

    public g(androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
        this.f402882d = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        this.f402882d.setAnimationProgress(f17);
    }
}
