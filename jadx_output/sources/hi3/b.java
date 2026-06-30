package hi3;

/* loaded from: classes10.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final di3.o f281509a = new hi3.a(this);

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView f281510b;

    public b(com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView) {
        this.f281510b = mMSightCameraGLSurfaceView;
    }

    public void a(byte[] bArr, boolean z17, int i17) {
        com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = this.f281510b;
        if (mMSightCameraGLSurfaceView != null) {
            if (bArr == null) {
                mMSightCameraGLSurfaceView.getClass();
                return;
            }
            hi3.c cVar = mMSightCameraGLSurfaceView.f149302d;
            if (cVar == null || cVar.f281516c) {
                return;
            }
            cVar.a(bArr, mMSightCameraGLSurfaceView.f149303e, mMSightCameraGLSurfaceView.f149304f, i17, z17);
            mMSightCameraGLSurfaceView.requestRender();
        }
    }

    public void b(int i17, int i18, int i19) {
        com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = this.f281510b;
        if (mMSightCameraGLSurfaceView != null) {
            int i27 = (i19 == 0 || i19 == 180) ? i17 : i18;
            if (i19 == 0 || i19 == 180) {
                i17 = i18;
            }
            mMSightCameraGLSurfaceView.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraGLSurfaceView", "setFrameInfo, width: %s, height: %s, rotate: %s this: %s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), mMSightCameraGLSurfaceView);
            mMSightCameraGLSurfaceView.f149303e = i27;
            mMSightCameraGLSurfaceView.f149304f = i17;
            mMSightCameraGLSurfaceView.f149305g = i19;
        }
    }
}
