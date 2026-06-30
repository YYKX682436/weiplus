package hi3;

/* loaded from: classes10.dex */
public class a implements di3.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hi3.b f281508d;

    public a(hi3.b bVar) {
        this.f281508d = bVar;
    }

    @Override // di3.o
    public boolean a(byte[] bArr) {
        com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = this.f281508d.f281510b;
        if (mMSightCameraGLSurfaceView == null) {
            return false;
        }
        if (bArr == null) {
            mMSightCameraGLSurfaceView.getClass();
            return false;
        }
        hi3.c cVar = mMSightCameraGLSurfaceView.f149302d;
        if (cVar == null || cVar.f281516c) {
            return false;
        }
        cVar.a(bArr, mMSightCameraGLSurfaceView.f149303e, mMSightCameraGLSurfaceView.f149304f, mMSightCameraGLSurfaceView.f149305g, false);
        mMSightCameraGLSurfaceView.requestRender();
        return false;
    }
}
