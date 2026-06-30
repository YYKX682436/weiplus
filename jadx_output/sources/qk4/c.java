package qk4;

/* loaded from: classes10.dex */
public final class c implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout f364438d;

    public c(com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout mMRecyclerVideoLayout) {
        this.f364438d = mMRecyclerVideoLayout;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout mMRecyclerVideoLayout = this.f364438d;
        java.lang.String tag = mMRecyclerVideoLayout.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSurfaceTextureAvailable, surface:");
        android.view.Surface surface = mMRecyclerVideoLayout.getSurface();
        sb6.append(surface != null ? surface.hashCode() : 0);
        sb6.append(", width:");
        sb6.append(i17);
        sb6.append(", height:");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        mMRecyclerVideoLayout.setSurface$plugin_thumbplayer_release(new android.view.Surface(surfaceTexture));
        kk4.v player = mMRecyclerVideoLayout.getPlayer();
        if (player != null) {
            player.J(mMRecyclerVideoLayout.getSurface(), true);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout mMRecyclerVideoLayout = this.f364438d;
        com.tencent.mars.xlog.Log.i(mMRecyclerVideoLayout.getTAG(), "onSurfaceTextureDestroyed, surface:" + surface.hashCode());
        kk4.v player = mMRecyclerVideoLayout.getPlayer();
        if (player == null) {
            return true;
        }
        kk4.b.h(player, null, false, 2, null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout mMRecyclerVideoLayout = this.f364438d;
        com.tencent.mars.xlog.Log.i(mMRecyclerVideoLayout.getTAG(), "onSurfaceTextureSizeChanged, surface:" + surface.hashCode() + ", width:" + i17 + ", height:" + i18 + ", layout size:[" + mMRecyclerVideoLayout.getWidth() + ',' + mMRecyclerVideoLayout.getHeight() + ']');
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView mMThumbPlayerTextureView = this.f364438d.textureView;
        if (mMThumbPlayerTextureView == null) {
            return;
        }
        mMThumbPlayerTextureView.setAlpha(1.0f);
    }
}
