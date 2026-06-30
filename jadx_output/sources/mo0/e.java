package mo0;

/* loaded from: classes3.dex */
public final class e implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.view.LivePreviewView f330259d;

    public e(com.tencent.mm.live.core.view.LivePreviewView livePreviewView) {
        this.f330259d = livePreviewView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView = this.f330259d;
        com.tencent.mars.xlog.Log.i(livePreviewView.f68605d, "onSurfaceTextureAvailable " + surface);
        yz5.l lVar = livePreviewView.f68610i;
        if (lVar != null) {
        }
        yz5.p pVar = livePreviewView.f68611m;
        if (pVar != null) {
        }
        yz5.a aVar = livePreviewView.f68613o;
        if (aVar != null) {
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i(this.f330259d.f68605d, "onSurfaceTextureDestroyed " + surface);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView = this.f330259d;
        com.tencent.mars.xlog.Log.i(livePreviewView.f68605d, "onSurfaceTextureSizeChanged width is " + i17 + " and height is " + i18 + ' ' + surface);
        yz5.p pVar = livePreviewView.f68611m;
        if (pVar != null) {
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i(this.f330259d.f68605d, "onSurfaceTextureUpdated " + surface);
    }
}
