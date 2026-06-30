package pn0;

/* loaded from: classes14.dex */
public class f implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn0.h f356953d;

    public f(pn0.h hVar) {
        this.f356953d = hVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        pn0.h hVar = this.f356953d;
        android.graphics.SurfaceTexture Da = hVar.f356946j.Da();
        if (Da == null || hVar.f356956m.getSurfaceTexture() == Da) {
            hVar.f356957n = surfaceTexture;
        } else {
            try {
                hVar.f356956m.setSurfaceTexture(Da);
                hVar.f356957n = Da;
                hVar.f356946j.v3(null);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i(hVar.f356955l, "setSurfaceTexture error onSurfacetextureAvailable " + e17);
                hVar.f356957n = surfaceTexture;
            }
        }
        hVar.f356944h = true;
        hVar.u(i17, i18);
        com.tencent.mars.xlog.Log.i(hVar.f356955l, "onSurfaceTextureAvailable surfaceTexture = " + surfaceTexture + " " + hVar.f356937a + " " + hVar.f356938b);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        pn0.h hVar = this.f356953d;
        if (hVar.f356958o) {
            hVar.f356946j.v3(surfaceTexture);
        } else {
            if (surfaceTexture == hVar.f356946j.Da()) {
                hVar.f356946j.v3(null);
            }
            hVar.f356957n = null;
        }
        com.tencent.mars.xlog.Log.i(hVar.f356955l, "onSurfaceTextureDestroyed mSaveSurfaceTexture = " + hVar.f356946j.Da());
        return hVar.f356946j.Da() == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        pn0.h hVar = this.f356953d;
        hVar.u(i17, i18);
        com.tencent.mars.xlog.Log.i(hVar.f356955l, "onSurfaceTextureSizeChanged " + surfaceTexture + " " + hVar.f356937a + " " + hVar.f356938b);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }
}
