package kt3;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt3.l f311982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kt3.l lVar) {
        super(1);
        this.f311982d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kt3.l lVar = this.f311982d;
        if (booleanValue) {
            lVar.z();
            com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = lVar.B;
            if ((mMSightCameraGLSurfaceView != null ? mMSightCameraGLSurfaceView.getEglContext() : null) != null) {
                com.tencent.mm.plugin.api.recordView.m mVar = lVar.f312004x;
                if (mVar != null) {
                    com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView2 = lVar.B;
                    mVar.b(mMSightCameraGLSurfaceView2 != null ? mMSightCameraGLSurfaceView2.getEglContext() : null);
                    com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView3 = lVar.B;
                    if (mMSightCameraGLSurfaceView3 != null) {
                        mMSightCameraGLSurfaceView3.setVisibility(0);
                    }
                } else {
                    com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView4 = lVar.B;
                    if (mMSightCameraGLSurfaceView4 != null) {
                        mMSightCameraGLSurfaceView4.setVisibility(8);
                    }
                }
            } else {
                com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView5 = lVar.B;
                if (mMSightCameraGLSurfaceView5 != null) {
                    mMSightCameraGLSurfaceView5.setOnEglEnableListener(new kt3.c(lVar));
                }
            }
            com.tencent.mm.sdk.platformtools.u3.i(new kt3.d(lVar), 100L);
        } else {
            bi3.f fVar = lVar.f312001u;
            if (fVar != null) {
                fVar.a();
            }
        }
        return jz5.f0.f302826a;
    }
}
