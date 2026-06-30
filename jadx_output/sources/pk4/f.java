package pk4;

/* loaded from: classes10.dex */
public final class f implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout f356478d;

    public f(com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout) {
        this.f356478d = mMMvVideoLayout;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout = this.f356478d;
        com.tencent.mars.xlog.Log.i(mMMvVideoLayout.f174512d, "onSurfaceTextureAvailable, surface:" + surface.hashCode() + ", width:" + i17 + ", height:" + i18 + ", enableEffect:" + mMMvVideoLayout.f174523r);
        mMMvVideoLayout.f174522q = surface;
        mMMvVideoLayout.getEffector().f(i17, i18);
        if (mMMvVideoLayout.f174523r) {
            mMMvVideoLayout.getEffector().c(surface);
            return;
        }
        mMMvVideoLayout.f174524s = surface;
        android.view.Surface surface2 = mMMvVideoLayout.f174525t;
        if (surface2 != null && surface2 != null) {
            surface2.release();
        }
        mMMvVideoLayout.f174525t = new android.view.Surface(mMMvVideoLayout.f174524s);
        kk4.v currentPlayer = mMMvVideoLayout.getCurrentPlayer();
        if (currentPlayer != null) {
            currentPlayer.J(mMMvVideoLayout.f174525t, true);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        android.view.Surface surface2;
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout = this.f356478d;
        com.tencent.mars.xlog.Log.i(mMMvVideoLayout.f174512d, "onSurfaceTextureDestroyed, surface:" + surface.hashCode() + ' ' + mMMvVideoLayout.c());
        mMMvVideoLayout.f174522q = null;
        if (!mMMvVideoLayout.f174523r && (surface2 = mMMvVideoLayout.f174525t) != null) {
            surface2.release();
        }
        kk4.v currentPlayer = mMMvVideoLayout.getCurrentPlayer();
        if (currentPlayer == null) {
            return true;
        }
        kk4.b.h(currentPlayer, null, false, 2, null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout = this.f356478d;
        com.tencent.mars.xlog.Log.i(mMMvVideoLayout.f174512d, "onSurfaceTextureSizeChanged " + surface + ", size:[" + i17 + ',' + i18 + ']');
        mMMvVideoLayout.f174522q = surface;
        mMMvVideoLayout.getEffector().f(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout = this.f356478d;
        com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView mMThumbPlayerTextureView = mMMvVideoLayout.textureView;
        if (mMThumbPlayerTextureView != null) {
            mMThumbPlayerTextureView.setAlpha(1.0f);
        }
        mMMvVideoLayout.f174522q = surface;
    }
}
