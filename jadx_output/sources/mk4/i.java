package mk4;

/* loaded from: classes14.dex */
public final class i implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender f327160d;

    public i(com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender mMTextureViewRender) {
        this.f327160d = mMTextureViewRender;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender mMTextureViewRender = this.f327160d;
        com.tencent.mars.xlog.Log.i(mMTextureViewRender.getLogTag(), "onSurfaceTextureAvailable surface:" + surface + " [" + i17 + ", " + i18 + "] listener:" + mMTextureViewRender.f174505e);
        mMTextureViewRender.getClass();
        mk4.a aVar = mMTextureViewRender.f174505e;
        if (aVar != null) {
            aVar.c(surface, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender mMTextureViewRender = this.f327160d;
        mk4.a aVar = mMTextureViewRender.f174505e;
        boolean a17 = aVar != null ? aVar.a(surface) : true;
        com.tencent.mars.xlog.Log.i(mMTextureViewRender.getLogTag(), "onSurfaceTextureDestroyed surface:" + surface + " result:" + a17 + " listener:" + mMTextureViewRender.f174505e);
        return a17;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender mMTextureViewRender = this.f327160d;
        com.tencent.mars.xlog.Log.i(mMTextureViewRender.getLogTag(), "onSurfaceTextureSizeChanged surface:" + surface + " [" + i17 + ", " + i18 + "] listener:" + mMTextureViewRender.f174505e);
        mk4.a aVar = mMTextureViewRender.f174505e;
        if (aVar != null) {
            aVar.b(surface, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        mk4.a aVar = this.f327160d.f174505e;
        if (aVar != null) {
            aVar.d(surface);
        }
    }
}
