package vh3;

/* loaded from: classes14.dex */
public final class e implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender f437046d;

    public e(com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender mMTextureViewRender) {
        this.f437046d = mMTextureViewRender;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender mMTextureViewRender = this.f437046d;
        com.tencent.mars.xlog.Log.i(mMTextureViewRender.getLogTag(), "onSurfaceTextureAvailable surface:" + surface + " [" + i17 + ", " + i18 + "] listener:" + mMTextureViewRender.f148798e);
        mMTextureViewRender.getClass();
        vh3.a aVar = mMTextureViewRender.f148798e;
        if (aVar != null) {
            ((uh3.a) aVar).s(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        boolean z17;
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender mMTextureViewRender = this.f437046d;
        vh3.a aVar = mMTextureViewRender.f148798e;
        if (aVar != null) {
            ((uh3.a) aVar).u(surface);
            z17 = false;
        } else {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i(mMTextureViewRender.getLogTag(), "onSurfaceTextureDestroyed surface:" + surface + " result:" + z17 + " listener:" + mMTextureViewRender.f148798e);
        return z17;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender mMTextureViewRender = this.f437046d;
        com.tencent.mars.xlog.Log.i(mMTextureViewRender.getLogTag(), "onSurfaceTextureSizeChanged surface:" + surface + " [" + i17 + ", " + i18 + "] listener:" + mMTextureViewRender.f148798e);
        vh3.a aVar = mMTextureViewRender.f148798e;
        if (aVar != null) {
            ((uh3.a) aVar).t(surface, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        vh3.a aVar = this.f437046d.f148798e;
    }
}
