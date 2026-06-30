package x2;

/* loaded from: classes13.dex */
public class c implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f451477d;

    public c(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        this.f451477d = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f451477d.r(0);
        return true;
    }
}
