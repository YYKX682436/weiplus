package n54;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f335137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f335138e;

    public h(boolean z17, boolean z18) {
        this.f335137d = z17;
        this.f335138e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = n54.i.f335139a;
            if (aVar == null) {
                return;
            }
            boolean z17 = this.f335137d;
            boolean z18 = this.f335138e;
            if (z17) {
                aVar.c(true, z18, 0);
            } else {
                aVar.c(false, z18, 0);
                if (!z18) {
                    n54.i.f335139a.b();
                    n54.i.e(null);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdHalfScreenLandingPageState", "onHalfScreenAnimationChange, exp=" + th6.toString());
        }
    }
}
