package kt3;

/* loaded from: classes10.dex */
public final class c implements com.tencent.mm.plugin.api.recordView.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kt3.l f311980a;

    public c(kt3.l lVar) {
        this.f311980a = lVar;
    }

    @Override // com.tencent.mm.plugin.api.recordView.d
    public final void y() {
        kt3.l lVar = this.f311980a;
        com.tencent.mm.plugin.api.recordView.m mVar = lVar.f312004x;
        if (mVar != null) {
            if (mVar != null) {
                com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = lVar.B;
                mVar.b(mMSightCameraGLSurfaceView != null ? mMSightCameraGLSurfaceView.getEglContext() : null);
            }
            com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView2 = lVar.B;
            if (mMSightCameraGLSurfaceView2 != null) {
                mMSightCameraGLSurfaceView2.setVisibility(0);
            }
        } else {
            com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView3 = lVar.B;
            if (mMSightCameraGLSurfaceView3 != null) {
                mMSightCameraGLSurfaceView3.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView4 = lVar.B;
        if (mMSightCameraGLSurfaceView4 != null) {
            mMSightCameraGLSurfaceView4.setOnEglEnableListener(null);
        }
    }
}
