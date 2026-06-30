package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.ScanCardRectView f159969d;

    public p(com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView) {
        this.f159969d = scanCardRectView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector scanCameraLightDetector = com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.f159829l;
        int i17 = com.tencent.mm.plugin.scanner.view.ScanCardRectView.A;
        try {
            scanCameraLightDetector.f159831b = ((xy3.a) this.f159969d.f215302e).d(true);
            scanCameraLightDetector.c();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanCameraLightDetector", e17, "start error: %s", e17.getMessage());
        }
    }
}
