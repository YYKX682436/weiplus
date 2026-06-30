package uh3;

/* loaded from: classes15.dex */
public final class a implements android.view.TextureView.SurfaceTextureListener, vh3.a, rh3.k, rh3.d, rh3.n, rh3.i, rh3.m, rh3.e, rh3.g, rh3.h, rh3.j, rh3.f, rh3.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout f427955d;

    public a(com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout mMVideoFrameLayout) {
        this.f427955d = mMVideoFrameLayout;
    }

    @Override // rh3.f
    public void a(wh3.b mediaSource, int i17, dn.h hVar) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        this.f427955d.f(i17, hVar);
    }

    @Override // rh3.k
    public void b(rh3.o mp6, rh3.s mediaInfo) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        this.f427955d.k(mp6, mediaInfo);
    }

    @Override // rh3.e
    public void c(rh3.o player) {
        kotlin.jvm.internal.o.g(player, "player");
        this.f427955d.e();
    }

    @Override // rh3.l
    public void d(rh3.o mp6) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout mMVideoFrameLayout = this.f427955d;
        java.lang.String fTPPTag = mMVideoFrameLayout.getFTPPTag();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FTPP.onInfo#handleOnSeekComplete ");
        wh3.b bVar = mMVideoFrameLayout.mediaSource;
        sb6.append(bVar != null ? bVar.f445965a : null);
        com.tencent.mars.xlog.Log.i(fTPPTag, sb6.toString());
    }

    @Override // rh3.f
    public void e(wh3.b mediaSource, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
    }

    @Override // rh3.f
    public void f(wh3.b mediaSource, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        this.f427955d.g(i17, i18, z17);
    }

    @Override // rh3.f
    public void g(wh3.b mediaSource, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        this.f427955d.getClass();
    }

    @Override // rh3.m
    public void h(rh3.o mp6, int i17, int i18) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout mMVideoFrameLayout = this.f427955d;
        com.tencent.mars.xlog.Log.i(mMVideoFrameLayout.getFTPPTag(), "FTPP.onStateChange() preState:" + i17 + " curState:" + i18);
        com.tencent.mars.xlog.Log.i(mMVideoFrameLayout.getFTPPTag(), "FTPP.handleOnStateChange");
    }

    @Override // rh3.h
    public void i(rh3.o mp6) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout mMVideoFrameLayout = this.f427955d;
        com.tencent.mars.xlog.Log.i(mMVideoFrameLayout.getFTPPTag(), "FTPP.onInfo#firstVideoFrameRendered");
        mMVideoFrameLayout.j("onFirstFrameRendered", mMVideoFrameLayout.f148784q);
    }

    @Override // rh3.i
    public void j(rh3.o mp6, int i17, long j17, long j18, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout mMVideoFrameLayout = this.f427955d;
        com.tencent.mars.xlog.Log.i(mMVideoFrameLayout.getFTPPTag(), "FTPP.onInfo() what:" + i17 + " arg1:" + j17 + " arg2:" + j18 + " extraObject:" + obj);
        if (i17 != 105) {
            if (i17 == 108) {
                com.tencent.mars.xlog.Log.i(mMVideoFrameLayout.getFTPPTag(), "FTPP.onInfo#firstVideoFrameRenderedAfterSurfaceChange");
                vh3.b bVar = mMVideoFrameLayout.renderView;
                com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender mMSurfaceViewRender = bVar instanceof com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender ? (com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender) bVar : null;
                if (mMSurfaceViewRender != null) {
                    mMSurfaceViewRender.post(new uh3.b(mMVideoFrameLayout));
                }
            } else if (i17 == 150) {
                mMVideoFrameLayout.m();
            } else if (i17 == 204) {
                int i18 = (int) j17;
                mMVideoFrameLayout.getClass();
                java.lang.String fTPPTag = mMVideoFrameLayout.getFTPPTag();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FTPP.onInfo#videoDecodeType:");
                sb6.append(i18);
                sb6.append(' ');
                wh3.b bVar2 = mMVideoFrameLayout.mediaSource;
                sb6.append(bVar2 != null ? bVar2.f445965a : null);
                com.tencent.mars.xlog.Log.i(fTPPTag, sb6.toString());
            } else if (i17 == 502) {
                mMVideoFrameLayout.getClass();
            } else if (i17 == 1006 && (obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo)) {
                com.tencent.mars.xlog.Log.i(mMVideoFrameLayout.getFTPPTag(), "FTPP.onInfo#downloadProgressUpdate: " + ((com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo) obj).playableDurationMS);
            }
        } else {
            com.tencent.mars.xlog.Log.i(mMVideoFrameLayout.getFTPPTag(), "FTPP.onInfo#firstAudioFrameRendered");
        }
        mMVideoFrameLayout.getClass();
    }

    @Override // rh3.f
    public void k(wh3.b mediaSource) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        this.f427955d.getClass();
    }

    @Override // rh3.f
    public void l(wh3.b mediaSource, dn.o oVar, dn.h hVar) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        this.f427955d.h(oVar, hVar);
    }

    @Override // rh3.n
    public void m(rh3.o player, int i17, int i18) {
        kotlin.jvm.internal.o.g(player, "player");
        com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout mMVideoFrameLayout = this.f427955d;
        com.tencent.mars.xlog.Log.i(mMVideoFrameLayout.getFTPPTag(), "FTPP.OnVideoSizeChanged() width:" + i17 + " height:" + i18);
        vh3.b renderView = mMVideoFrameLayout.getRenderView();
        if (renderView != null) {
            renderView.a(i17, i18);
        }
        mMVideoFrameLayout.n(i17, i18);
    }

    @Override // rh3.j
    public void n(rh3.o mp6, long j17, long j18) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        this.f427955d.l(mp6, j17, j18);
    }

    @Override // rh3.f
    public void o(wh3.b mediaSource, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        this.f427955d.getClass();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i(this.f427955d.getFTPPTag(), "FTPP.onSurfaceTextureAvailable  surfaceTexture:" + surfaceTexture.hashCode() + ' ' + i17 + ' ' + i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i(this.f427955d.getFTPPTag(), "FTPP.onSurfaceTextureDestroyed() surfaceTexture:" + surfaceTexture.hashCode());
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i(this.f427955d.getFTPPTag(), "FTPP.onSurfaceTextureSizeChanged  surfaceTexture:" + surfaceTexture.hashCode() + ' ' + i17 + ' ' + i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        this.f427955d.getClass();
    }

    @Override // rh3.d
    public void p(rh3.o mp6) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout mMVideoFrameLayout = this.f427955d;
        com.tencent.mars.xlog.Log.i(mMVideoFrameLayout.getFTPPTag(), "FTPP.onInfo#onBufferingEnd() pos:" + mMVideoFrameLayout.getCurrentPlayMs());
        mMVideoFrameLayout.c();
    }

    @Override // rh3.d
    public void q(rh3.o mp6) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout mMVideoFrameLayout = this.f427955d;
        com.tencent.mars.xlog.Log.i(mMVideoFrameLayout.getFTPPTag(), "FTPP.onInfo#onBufferingStart() pos:" + mMVideoFrameLayout.getCurrentPlayMs());
        wh3.b mediaSource = mMVideoFrameLayout.getMediaSource();
        mMVideoFrameLayout.d(mediaSource != null ? mediaSource.f445965a : null);
    }

    @Override // rh3.g
    public void r(rh3.o mp6, int i17, int i18) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        this.f427955d.i(mp6, i17, i18);
    }

    public void s(java.lang.Object surface) {
        android.graphics.SurfaceTexture surfaceTexture;
        kotlin.jvm.internal.o.g(surface, "surface");
        boolean z17 = surface instanceof android.graphics.SurfaceTexture;
        com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout mMVideoFrameLayout = this.f427955d;
        if (!z17) {
            if (!(surface instanceof android.view.SurfaceHolder)) {
                com.tencent.mars.xlog.Log.w(mMVideoFrameLayout.getFTPPTag(), "FTPP.onSurfaceAvailable() width:" + mMVideoFrameLayout.getWidth() + " height:" + mMVideoFrameLayout.getHeight() + " surface:" + surface);
                return;
            }
            android.view.SurfaceHolder surfaceHolder = (android.view.SurfaceHolder) surface;
            int i17 = com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout.f148773s;
            com.tencent.mars.xlog.Log.i(mMVideoFrameLayout.getFTPPTag(), "FTPP.handleOnSurfaceHolderAvailable() width:" + mMVideoFrameLayout.getWidth() + " height:" + mMVideoFrameLayout.getHeight() + " surfaceHolder:" + surfaceHolder.hashCode());
            ((rh3.q) mMVideoFrameLayout.getOnePlayContext()).f395679b = surfaceHolder.getSurface();
            mMVideoFrameLayout.getPlayer().setSurface(surfaceHolder.getSurface());
            mMVideoFrameLayout.s();
            return;
        }
        android.graphics.SurfaceTexture surfaceTexture2 = (android.graphics.SurfaceTexture) surface;
        if (!(mMVideoFrameLayout.renderView instanceof com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender)) {
            com.tencent.mars.xlog.Log.i(mMVideoFrameLayout.getFTPPTag(), "handleOnSurfaceAvailable return for renderView:" + mMVideoFrameLayout.renderView);
            return;
        }
        java.lang.String fTPPTag = mMVideoFrameLayout.getFTPPTag();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FTPP.handleOnSurfaceAvailable() width:");
        sb6.append(mMVideoFrameLayout.getWidth());
        sb6.append(" height:");
        sb6.append(mMVideoFrameLayout.getHeight());
        sb6.append(" surfaceTexture:");
        sb6.append(surfaceTexture2.hashCode());
        sb6.append(" curSurfaceTexture:");
        android.graphics.SurfaceTexture surfaceTexture3 = mMVideoFrameLayout.f148783p;
        sb6.append(surfaceTexture3 != null ? java.lang.Integer.valueOf(surfaceTexture3.hashCode()) : null);
        com.tencent.mars.xlog.Log.i(fTPPTag, sb6.toString());
        mMVideoFrameLayout.getOnePlayContext().getClass();
        if (((rh3.q) mMVideoFrameLayout.getOnePlayContext()).f395679b == null || (surfaceTexture = mMVideoFrameLayout.f148783p) == null) {
            mMVideoFrameLayout.f148783p = surfaceTexture2;
            ((rh3.q) mMVideoFrameLayout.getOnePlayContext()).f395679b = new android.view.Surface(surfaceTexture2);
            mMVideoFrameLayout.getPlayer().setSurface(((rh3.q) mMVideoFrameLayout.getOnePlayContext()).f395679b);
            mMVideoFrameLayout.s();
            return;
        }
        java.lang.Boolean valueOf = android.os.Build.VERSION.SDK_INT < 26 ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(surfaceTexture.isReleased());
        java.lang.String fTPPTag2 = mMVideoFrameLayout.getFTPPTag();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("FTPP.handleOnSurfaceAvailable() return for surface:");
        android.view.Surface surface2 = ((rh3.q) mMVideoFrameLayout.getOnePlayContext()).f395679b;
        sb7.append(surface2 != null ? java.lang.Integer.valueOf(surface2.hashCode()) : null);
        sb7.append(" valid:");
        android.view.Surface surface3 = ((rh3.q) mMVideoFrameLayout.getOnePlayContext()).f395679b;
        sb7.append(surface3 != null ? java.lang.Boolean.valueOf(surface3.isValid()) : null);
        sb7.append(" released:");
        sb7.append(valueOf);
        com.tencent.mars.xlog.Log.i(fTPPTag2, sb7.toString());
        vh3.b bVar = mMVideoFrameLayout.renderView;
        kotlin.jvm.internal.o.e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender");
        android.graphics.SurfaceTexture surfaceTexture4 = mMVideoFrameLayout.f148783p;
        kotlin.jvm.internal.o.d(surfaceTexture4);
        ((com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender) bVar).setSurfaceTexture(surfaceTexture4);
    }

    public void t(java.lang.Object surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i(this.f427955d.getFTPPTag(), "FTPP.onSurfaceChange  surface:" + surface.hashCode() + ' ' + i17 + ' ' + i18);
    }

    public boolean u(java.lang.Object surface) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout mMVideoFrameLayout = this.f427955d;
        com.tencent.mars.xlog.Log.i(mMVideoFrameLayout.getFTPPTag(), "FTPP.onSurfaceDestroy  surface:" + surface.hashCode());
        if (surface instanceof android.graphics.SurfaceTexture) {
            return false;
        }
        if (!(surface instanceof android.view.SurfaceHolder)) {
            com.tencent.mars.xlog.Log.w(mMVideoFrameLayout.getFTPPTag(), "FTPP.onSurfaceDestroy() surface:" + surface);
            return false;
        }
        jz5.f0 f0Var2 = null;
        mMVideoFrameLayout.getPlayer().setSurface(null);
        a01.d dVar = mMVideoFrameLayout.f148780m;
        java.lang.Object renderView = mMVideoFrameLayout.getRenderView();
        dVar.getClass();
        if ((renderView instanceof com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender ? (com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender) renderView : null) == null) {
            com.tencent.mars.xlog.Log.i(dVar.b(), "captureFrame return for renderView:" + renderView + '.');
            return false;
        }
        android.view.View findViewWithTag = dVar.f369a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW");
        jz5.f0 f0Var3 = jz5.f0.f302826a;
        if (findViewWithTag != null) {
            com.tencent.mars.xlog.Log.w(dVar.b(), "showCoverBitmap return for duplicated.");
            f0Var = f0Var3;
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            return false;
        }
        android.graphics.Bitmap bitmap = dVar.f373e;
        if (bitmap != null) {
            dVar.c((android.view.View) renderView, bitmap, " captureFrame success.");
            f0Var2 = f0Var3;
        }
        if (f0Var2 != null) {
            return false;
        }
        dVar.c((android.view.View) renderView, dVar.f372d, "captureFrame fail.");
        return false;
    }
}
