package e04;

/* loaded from: classes13.dex */
public class d1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector f245886a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector scanCameraLightDetector, android.os.Looper looper) {
        super(looper);
        this.f245886a = scanCameraLightDetector;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        e04.e1 e1Var;
        if (message.what != 233 || (e1Var = (e04.e1) message.obj) == null) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        byte[] bArr = e1Var.f245892a;
        int i17 = e1Var.f245893b;
        int i18 = e1Var.f245894c;
        com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector scanCameraLightDetector = this.f245886a;
        boolean a17 = com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.a(scanCameraLightDetector, bArr, i17, i18);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        scanCameraLightDetector.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraLightDetector", "isYuvDark: %s, currentLight: %s, used %sms", valueOf, java.lang.Float.valueOf(-1.0f), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        if (!a17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraLightDetector", "not dark");
            scanCameraLightDetector.f159832c = 0;
            com.tencent.mm.sdk.platformtools.u3.h(new e04.c1(this));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraLightDetector", "is dark now");
        scanCameraLightDetector.f159832c++;
        if (!scanCameraLightDetector.f159831b.equals("continuous-video") || scanCameraLightDetector.f159832c >= 2) {
            scanCameraLightDetector.f159832c = 0;
            com.tencent.mm.sdk.platformtools.u3.h(new e04.b1(this));
        }
    }
}
