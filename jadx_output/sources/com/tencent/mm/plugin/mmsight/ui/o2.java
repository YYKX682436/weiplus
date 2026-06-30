package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class o2 implements fo4.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149380d;

    public o2(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149380d = sightCaptureUI;
    }

    @Override // fo4.b
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "callback onSurfaceTextureAvailable set local surface: %s", surfaceTexture);
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149380d;
        sightCaptureUI.f149251y = surfaceTexture;
        if (sightCaptureUI.a7(false)) {
            sightCaptureUI.i7(1);
        } else {
            sightCaptureUI.i7(8);
        }
    }
}
