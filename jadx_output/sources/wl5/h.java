package wl5;

/* loaded from: classes4.dex */
public class h implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl5.x f447111d;

    public h(wl5.x xVar) {
        this.f447111d = xVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        wl5.x xVar = this.f447111d;
        if (!xVar.K) {
            return true;
        }
        xVar.K = false;
        android.view.View view = xVar.f447165j;
        java.lang.Runnable runnable = xVar.U;
        view.removeCallbacks(runnable);
        xVar.f447165j.postDelayed(runnable, 100);
        return true;
    }
}
