package s4;

/* loaded from: classes15.dex */
public class k extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout f402888d;

    public k(androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
        this.f402888d = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout = this.f402888d;
        swipeRefreshLayout.getClass();
        int abs = swipeRefreshLayout.B - java.lang.Math.abs(swipeRefreshLayout.A);
        swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.f12373z + ((int) ((abs - r0) * f17))) - swipeRefreshLayout.f12371x.getTop());
        s4.e eVar = swipeRefreshLayout.D;
        float f18 = 1.0f - f17;
        s4.d dVar = eVar.f402875d;
        if (f18 != dVar.f402866p) {
            dVar.f402866p = f18;
        }
        eVar.invalidateSelf();
    }
}
