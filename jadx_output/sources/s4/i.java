package s4;

/* loaded from: classes15.dex */
public class i extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f402884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f402885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout f402886f;

    public i(androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout, int i17, int i18) {
        this.f402886f = swipeRefreshLayout;
        this.f402884d = i17;
        this.f402885e = i18;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        this.f402886f.D.setAlpha((int) (this.f402884d + ((this.f402885e - r0) * f17)));
    }
}
