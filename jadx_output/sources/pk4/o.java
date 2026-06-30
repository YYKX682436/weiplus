package pk4;

/* loaded from: classes10.dex */
public final class o implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout f356513d;

    public o(com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout mMTPVideoLayout) {
        this.f356513d = mMTPVideoLayout;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout mMTPVideoLayout = this.f356513d;
        com.tencent.mars.xlog.Log.i(mMTPVideoLayout.f174543d, "onSurfaceTextureAvailable, surface:" + surface.hashCode() + ", width:" + i17 + ", height:" + i18 + ", enableEffect:" + mMTPVideoLayout.f174548i);
        mMTPVideoLayout.f174547h = surface;
        mMTPVideoLayout.getClass();
        mMTPVideoLayout.getClass();
        ((gk4.h0) mMTPVideoLayout.getEffector()).f(i17, i18);
        if (mMTPVideoLayout.f174548i) {
            ((gk4.h0) mMTPVideoLayout.getEffector()).c(surface);
            return;
        }
        mMTPVideoLayout.f174549m = surface;
        android.view.Surface surface2 = mMTPVideoLayout.f174550n;
        if (surface2 != null && surface2 != null) {
            surface2.release();
        }
        mMTPVideoLayout.f174550n = new android.view.Surface(mMTPVideoLayout.f174549m);
        kk4.b player = mMTPVideoLayout.getPlayer();
        if (player != null) {
            ((kk4.v) player).J(mMTPVideoLayout.f174550n, true);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        android.view.Surface surface2;
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout mMTPVideoLayout = this.f356513d;
        com.tencent.mars.xlog.Log.i(mMTPVideoLayout.f174543d, "onSurfaceTextureDestroyed, surface:" + surface.hashCode() + ", enableEffect:" + mMTPVideoLayout.f174548i);
        mMTPVideoLayout.f174547h = null;
        if (!mMTPVideoLayout.f174548i && (surface2 = mMTPVideoLayout.f174550n) != null) {
            surface2.release();
        }
        kk4.b player = mMTPVideoLayout.getPlayer();
        if (player == null) {
            return true;
        }
        kk4.b.h(player, null, false, 2, null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout mMTPVideoLayout = this.f356513d;
        com.tencent.mars.xlog.Log.i(mMTPVideoLayout.f174543d, "onSurfaceTextureSizeChanged, surface:" + surface.hashCode() + ", width:" + i17 + ", height:" + i18 + ", layout size:[" + mMTPVideoLayout.getWidth() + ',' + mMTPVideoLayout.getHeight() + ']');
        mMTPVideoLayout.f174547h = surface;
        mMTPVideoLayout.getClass();
        mMTPVideoLayout.getClass();
        ((gk4.h0) mMTPVideoLayout.getEffector()).f(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        int i17 = com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout.f174542p;
        com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout mMTPVideoLayout = this.f356513d;
        com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView textureView = mMTPVideoLayout.getTextureView();
        if (textureView != null) {
            textureView.setAlpha(1.0f);
        }
        mMTPVideoLayout.f174547h = surface;
    }
}
