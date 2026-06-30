package nn0;

/* loaded from: classes14.dex */
public class d implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.h f338557d;

    public d(nn0.h hVar) {
        this.f338557d = hVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        nn0.h hVar = this.f338557d;
        if (hVar.f338580x != null) {
            android.graphics.SurfaceTexture surfaceTexture2 = hVar.f338569m.getSurfaceTexture();
            android.graphics.SurfaceTexture surfaceTexture3 = hVar.f338580x;
            if (surfaceTexture2 != surfaceTexture3) {
                try {
                    hVar.f338569m.setSurfaceTexture(surfaceTexture3);
                    hVar.f338571o = hVar.f338580x;
                    hVar.f338580x = null;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.i(hVar.f338563d, "setSurfaceTexture error onSurfacetextureAvailable " + e17);
                    hVar.f338571o = surfaceTexture;
                }
                hVar.f338572p = null;
                hVar.f338573q = null;
                hVar.K = true;
                hVar.u(i17, i18);
                com.tencent.mars.xlog.Log.i(hVar.f338563d, "onSurfaceTextureAvailable " + hVar.f338575s + " " + hVar.f338576t);
            }
        }
        hVar.f338571o = surfaceTexture;
        hVar.f338572p = null;
        hVar.f338573q = null;
        hVar.K = true;
        hVar.u(i17, i18);
        com.tencent.mars.xlog.Log.i(hVar.f338563d, "onSurfaceTextureAvailable " + hVar.f338575s + " " + hVar.f338576t);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        nn0.h hVar = this.f338557d;
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
        nn0.h hVar = this.f338557d;
        hVar.u(i17, i18);
        com.tencent.mars.xlog.Log.i(hVar.f338563d, "onSurfaceTextureSizeChanged " + hVar.f338575s + " " + hVar.f338576t);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }
}
