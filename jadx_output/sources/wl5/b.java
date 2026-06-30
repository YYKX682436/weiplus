package wl5;

/* loaded from: classes15.dex */
public class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl5.x f447105d;

    public b(wl5.x xVar) {
        this.f447105d = xVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        wl5.x xVar = this.f447105d;
        xVar.f447165j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (xVar.f447166k != null) {
            xVar.f447165j.getLocationInWindow(xVar.R);
        }
    }
}
