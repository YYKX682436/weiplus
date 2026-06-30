package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes10.dex */
public class VoIPVideoView extends com.tencent.mm.ui.base.MMTextureView implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f177099h;

    public VoIPVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        E();
    }

    public final void E() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f177099h = paint;
        paint.setColor(-16777216);
        this.f177099h.setFilterBitmap(true);
        this.f177099h.setTextSize(40.0f);
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(surfaceTexture != null);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureAvailable %b %d %d", objArr);
        C();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(surfaceTexture != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureDestroyed %b", objArr);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(surfaceTexture != null);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureSizeChanged %b %d %d", objArr);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public VoIPVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        E();
    }
}
