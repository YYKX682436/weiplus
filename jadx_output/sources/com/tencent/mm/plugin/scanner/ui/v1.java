package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes14.dex */
public class v1 implements android.hardware.Camera.AutoFocusCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.w1 f159658d;

    public v1(com.tencent.mm.plugin.scanner.ui.w1 w1Var) {
        this.f159658d = w1Var;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "camera auto focus call back");
        com.tencent.mm.plugin.scanner.ui.w1 w1Var = this.f159658d;
        xy3.a aVar = w1Var.f159663d.f159352f;
        aVar.getClass();
        try {
            android.hardware.Camera camera2 = aVar.f366656a;
            if (camera2 != null) {
                camera2.cancelAutoFocus();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.w(qt5.c.f366655u, "cancelAutoFocus " + e17.getMessage());
        }
        w1Var.f159663d.f159352f.u();
    }
}
