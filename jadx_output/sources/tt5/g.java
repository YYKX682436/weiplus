package tt5;

/* loaded from: classes14.dex */
public class g extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.scanlib.ui.ScanView f422050a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.scanlib.ui.ScanView scanView, android.os.Looper looper) {
        super(looper);
        this.f422050a = scanView;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.f422050a.f215306i = java.lang.System.currentTimeMillis();
        if (((qt5.c) this.f422050a.f215302e).f366658c) {
            if (!"auto".equals(((qt5.c) this.f422050a.f215302e).d(true))) {
                ((qt5.c) this.f422050a.f215302e).j("auto");
            }
            com.tencent.scanlib.ui.ScanView scanView = this.f422050a;
            qt5.c cVar = (qt5.c) scanView.f215302e;
            if (cVar.f366656a != null && cVar.f366658c) {
                try {
                    cVar.f366656a.autoFocus(scanView);
                } catch (java.lang.Exception e17) {
                    com.tencent.stubs.logger.Log.w(qt5.c.f366655u, "autoFocus() " + e17.getMessage());
                }
            }
            com.tencent.stubs.logger.Log.i("ScanView", "do auto focus");
        }
    }
}
