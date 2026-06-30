package sz3;

/* loaded from: classes15.dex */
public final class c0 implements com.tencent.mm.plugin.scanner.model.e1 {

    /* renamed from: d, reason: collision with root package name */
    public static final sz3.c0 f413973d = new sz3.c0();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsNoModelDetectManager", "release on task");
        if (sz3.d0.f413997g) {
            com.tencent.mm.plugin.scanner.model.d1.l();
            sz3.d0.f413997g = false;
        }
        sz3.d0.f413999i = false;
        sz3.d0.f414004n = null;
        sz3.d0.f414005o = null;
    }
}
