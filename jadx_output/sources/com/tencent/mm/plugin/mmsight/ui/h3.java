package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class h3 implements fo4.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149341d;

    public h3(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149341d = sightCaptureUI;
    }

    @Override // fo4.b
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        hi3.c cVar;
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149341d;
        com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = sightCaptureUI.D.f281510b;
        if (mMSightCameraGLSurfaceView != null && (cVar = mMSightCameraGLSurfaceView.f149302d) != null) {
            cVar.f281534u = true;
            mMSightCameraGLSurfaceView.requestRender();
        }
        sightCaptureUI.f149236n.setTextureChangeCallback(null);
    }
}
