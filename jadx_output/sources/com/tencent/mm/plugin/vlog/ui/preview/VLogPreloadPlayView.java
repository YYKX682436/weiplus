package com.tencent.mm.plugin.vlog.ui.preview;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019B\u001d\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u001aJ\"\u0010\u0007\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003J\"\u0010\n\u001a\u00020\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPreloadPlayView;", "Lcom/tencent/mm/ui/base/MMTextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lkotlin/Function2;", "", "Ljz5/f0;", "onSizeChanged", "setOnSizeChangedListener", "", "onProgress", "setOnProgressListener", "", "mute", "setMute", "Landroid/graphics/Rect;", "rect", "setCropRect", "Landroid/util/Size;", "getSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class VLogPreloadPlayView extends com.tencent.mm.ui.base.MMTextureView implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: h, reason: collision with root package name */
    public final android.os.HandlerThread f175977h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f175978i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f175979m;

    public VLogPreloadPlayView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int i18 = pu5.i.f358473b;
        this.f175977h = pu5.f.a("VLogPlayView_PreviewPlayer", -4);
        setSurfaceTextureListener(this);
        int i19 = ap4.a.f12789a;
    }

    public final android.util.Size getSize() {
        return null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogPreloadPlayView", "surfaceAvailable, surfaceTexture:" + surfaceTexture + ", width:" + i17 + ", height:" + i18);
        android.os.HandlerThread handlerThread = this.f175977h;
        if (handlerThread.isAlive()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogPreloadPlayView", "previewPlayerThread is alive");
        } else {
            handlerThread.start();
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogPreloadPlayView", "previewPlayerThread is not alive, start");
        }
        this.f175978i = new com.tencent.mm.sdk.platformtools.n3(handlerThread.getLooper());
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogPreloadPlayView", "bindPreloadManager surfaceTexture:" + surfaceTexture);
        int i19 = ap4.a.f12789a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogPreloadPlayView", "vLogDirector init : 0, vLogSurface : 0");
        yz5.p pVar = this.f175979m;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogPreloadPlayView", "surfaceDestroy");
        surface.release();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogPreloadPlayView", "surfaceSizeChanged, surfaceTexture:" + surfaceTexture + ", width:" + i17 + ", height:" + i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }

    public final void setCropRect(android.graphics.Rect rect) {
    }

    public final void setMute(boolean z17) {
    }

    public final void setOnProgressListener(yz5.p pVar) {
    }

    public final void setOnSizeChangedListener(yz5.p pVar) {
        this.f175979m = pVar;
    }

    public VLogPreloadPlayView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int i17 = pu5.i.f358473b;
        this.f175977h = pu5.f.a("VLogPlayView_PreviewPlayer", -4);
        setSurfaceTextureListener(this);
        int i18 = ap4.a.f12789a;
    }
}
