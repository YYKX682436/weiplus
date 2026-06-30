package nn0;

/* loaded from: classes14.dex */
public class e implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.h f338560d;

    public e(nn0.h hVar) {
        this.f338560d = hVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        nn0.h hVar = this.f338560d;
        com.tencent.mars.xlog.Log.i(hVar.f338563d, "onSurfaceTextureAvailable " + hVar.f338575s + " " + hVar.f338576t);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        nn0.h hVar = this.f338560d;
        if (hVar.f338581y) {
            hVar.f338580x = surfaceTexture;
        } else {
            if (surfaceTexture == hVar.f338580x) {
                hVar.f338580x = null;
            }
            hVar.f338571o = null;
        }
        com.tencent.mars.xlog.Log.i(hVar.f338563d, "onSurfaceTextureDestroyed");
        return hVar.f338580x == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        nn0.h hVar = this.f338560d;
        hVar.u(i17, i18);
        com.tencent.mars.xlog.Log.i(hVar.f338563d, "onSurfaceTextureSizeChanged " + hVar.f338575s + " " + hVar.f338576t);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i(this.f338560d.f338563d, "onSurfaceTextureUpdated");
    }
}
