package com.tencent.mm.plugin.video;

/* loaded from: classes10.dex */
public class ObservableTextureView extends com.tencent.mm.ui.base.MMTextureView implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: h, reason: collision with root package name */
    public fo4.b f175527h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f175528i;

    public ObservableTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f175528i = false;
        setSurfaceTextureListener(this);
        getSurfaceTexture();
    }

    @Override // android.view.TextureView
    public boolean isAvailable() {
        return this.f175528i;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ObservableTextureView", "onSurfaceTextureAvailable");
        C();
        this.f175528i = true;
        fo4.b bVar = this.f175527h;
        if (bVar != null) {
            bVar.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ObservableTextureView", "onSurfaceTextureDestroyed");
        this.f175528i = false;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public void setTextureChangeCallback(fo4.b bVar) {
        this.f175527h = bVar;
    }

    public ObservableTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f175528i = false;
    }
}
