package tt5;

/* loaded from: classes13.dex */
public class h extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.scanlib.ui.ScanView f422051a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.scanlib.ui.ScanView scanView, android.os.Looper looper) {
        super(looper);
        this.f422051a = scanView;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.f422051a.f215305h = java.lang.System.currentTimeMillis();
        com.tencent.stubs.logger.Log.i("ScanView", "take one shot");
        if (((qt5.c) this.f422051a.f215302e).f366658c) {
            com.tencent.scanlib.ui.ScanView scanView = this.f422051a;
            ((qt5.c) scanView.f215302e).n(scanView);
        }
    }
}
