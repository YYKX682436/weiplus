package yf5;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f461853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf5.d f461854e;

    public c(int i17, yf5.d dVar) {
        this.f461853d = i17;
        this.f461854e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvListViewPool", "start to per inflate view");
        yf5.d dVar = this.f461854e;
        dVar.getClass();
        int i17 = this.f461853d;
        if (i17 > 18) {
            i17 = 18;
        }
        for (int i18 = 0; i18 < i17; i18++) {
            android.view.View b17 = dVar.b();
            synchronized (dVar) {
                ((java.util.ArrayDeque) dVar.f461860b).offer(b17);
            }
        }
        dVar.f461861c.set(false);
    }
}
