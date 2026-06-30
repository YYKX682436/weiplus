package n54;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f335135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f335136e;

    public g(boolean z17, float f17) {
        this.f335135d = z17;
        this.f335136e = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar;
        try {
            if (!this.f335135d || (aVar = n54.i.f335139a) == null) {
                return;
            }
            aVar.a(this.f335136e);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdHalfScreenLandingPageState", "onHalfScreenHeightChange, exp=" + th6.toString());
        }
    }
}
