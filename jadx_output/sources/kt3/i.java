package kt3;

/* loaded from: classes10.dex */
public final class i implements com.tencent.mm.plugin.api.recordView.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kt3.l f311987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView f311988b;

    public i(kt3.l lVar, com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView) {
        this.f311987a = lVar;
        this.f311988b = mMSightCameraGLSurfaceView;
    }

    @Override // com.tencent.mm.plugin.api.recordView.d
    public final void y() {
        kt3.l lVar = this.f311987a;
        com.tencent.mm.plugin.api.recordView.m mVar = lVar.f312004x;
        if (mVar != null) {
            mVar.b(this.f311988b.getEglContext());
        }
        com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = lVar.B;
        if (mMSightCameraGLSurfaceView != null) {
            mMSightCameraGLSurfaceView.setOnEglEnableListener(null);
        }
    }
}
