package pn0;

/* loaded from: classes14.dex */
public class h extends pn0.a {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f356955l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.TextureView f356956m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.SurfaceTexture f356957n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f356958o;

    /* renamed from: p, reason: collision with root package name */
    public nn0.m f356959p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f356960q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f356961r;

    public h(nn0.o oVar) {
        super(oVar);
        this.f356955l = "TextureView_Render_" + hashCode();
        this.f356956m = null;
        this.f356957n = null;
        this.f356958o = false;
        this.f356959p = null;
        this.f356960q = new java.util.HashMap();
        this.f356961r = false;
        this.f356958o = true;
    }

    @Override // pn0.a, pn0.b
    public void B(boolean z17) {
        this.f356961r = z17;
    }

    @Override // pn0.a, pn0.b
    public boolean a(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        return tXCloudVideoView != null && tXCloudVideoView.getVideoView() == this.f356956m;
    }

    @Override // pn0.a, pn0.b
    public void b(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        android.view.TextureView videoView;
        nn0.o oVar = this.f356946j;
        com.tencent.rtmp.ui.TXCloudVideoView o17 = oVar.o1();
        if (o17 != null && o17 != tXCloudVideoView && (videoView = o17.getVideoView()) != null) {
            o17.removeView(videoView);
        }
        android.graphics.SurfaceTexture Da = oVar.Da();
        this.f356947k = tXCloudVideoView;
        if (tXCloudVideoView != null) {
            android.view.TextureView videoView2 = tXCloudVideoView.getVideoView();
            this.f356956m = videoView2;
            if (videoView2 == null) {
                android.view.TextureView textureView = new android.view.TextureView(this.f356947k.getContext());
                this.f356956m = textureView;
                this.f356947k.addVideoView(textureView);
                this.f356956m.setOpaque(false);
                this.f356956m.setTransform(new android.graphics.Matrix());
                this.f356956m.setScaleX(1.0f);
                this.f356956m.setScaleY(1.0f);
                this.f356956m.setRotation(0.0f);
            }
        }
        java.lang.String str = "onViewRenderSet mSaveSurfaceTexture = " + Da + " mTextureView = " + this.f356956m;
        java.lang.String str2 = this.f356955l;
        com.tencent.mars.xlog.Log.i(str2, str);
        android.view.TextureView textureView2 = this.f356956m;
        if (textureView2 != null && Da == null) {
            textureView2.setSurfaceTextureListener(null);
        }
        if (this.f356956m.getWidth() != 0 && this.f356956m.getHeight() != 0) {
            this.f356957n = this.f356956m.getSurfaceTexture();
            this.f356937a = this.f356956m.getWidth();
            this.f356938b = this.f356956m.getHeight();
            com.tencent.mars.xlog.Log.i(str2, "onViewRenderSet mSurfaceTexture = " + this.f356957n + " mViewWidth = " + this.f356937a + " mViewHeight = " + this.f356938b);
        }
        android.view.TextureView textureView3 = this.f356956m;
        if (textureView3 != null && this.f356941e != 1) {
            this.f356937a = textureView3.getWidth();
            this.f356938b = this.f356956m.getHeight();
            nn0.m mVar = new nn0.m(this.f356956m);
            this.f356959p = mVar;
            mVar.f(this.f356939c, this.f356940d);
            this.f356959p.g(this.f356937a, this.f356938b);
            this.f356959p.b(this.f356942f);
            this.f356959p.d(this.f356943g % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1);
        }
        this.f356956m.setSurfaceTextureListener(new pn0.f(this));
        if (Da != null) {
            if (this.f356957n != null) {
                Da.release();
                oVar.v3(null);
                com.tencent.mars.xlog.Log.i(str2, "not valid cacheSurfaceTexture use, use self " + this.f356956m.getSurfaceTexture() + ", cacheSurfaceTexture " + Da);
                return;
            }
            com.tencent.mars.xlog.Log.i(str2, "setSurfaceTexture from cacheSurfaceTexture " + this.f356956m + ", mSaveSurfaceTexture " + Da);
            try {
                this.f356956m.setSurfaceTexture(Da);
                this.f356957n = Da;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i(str2, "setSurfaceTexture error " + e17);
                this.f356957n = this.f356956m.getSurfaceTexture();
            }
        }
    }

    @Override // pn0.a, pn0.b
    public void c(int i17, int i18) {
        nn0.m mVar;
        boolean z17 = (this.f356939c == i17 && this.f356940d == i18) ? false : true;
        super.c(i17, i18);
        if (!z17 || (mVar = this.f356959p) == null || this.f356941e == 1) {
            return;
        }
        mVar.f(this.f356939c, this.f356940d);
    }

    @Override // pn0.b
    public android.view.Surface getSurface() {
        android.graphics.SurfaceTexture surfaceTexture = this.f356957n;
        if (surfaceTexture == null) {
            return null;
        }
        java.util.HashMap hashMap = this.f356960q;
        if (hashMap.get(surfaceTexture) == null) {
            hashMap.put(this.f356957n, new android.view.Surface(this.f356957n));
        }
        return (android.view.Surface) hashMap.get(this.f356957n);
    }

    @Override // pn0.a, pn0.b
    public void release() {
        com.tencent.mars.xlog.Log.i(this.f356955l, "release");
        if (fn0.g.f264195a.l()) {
            com.tencent.mm.sdk.platformtools.u3.h(new pn0.g(this));
        }
    }

    @Override // pn0.b
    public void reset() {
    }

    @Override // pn0.a, pn0.b
    public void setRenderMode(int i17) {
        this.f356942f = i17;
        com.tencent.mars.xlog.Log.i(this.f356955l, "setRenderMode: renderMode=" + i17);
        nn0.m mVar = this.f356959p;
        if (mVar == null || this.f356941e == 1) {
            return;
        }
        mVar.b(i17);
    }

    @Override // pn0.a, pn0.b
    public void setRenderRotation(int i17) {
        this.f356943g = i17;
        nn0.m mVar = this.f356959p;
        if (mVar == null || this.f356941e == 1) {
            return;
        }
        mVar.d(i17 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1);
    }

    @Override // pn0.b
    public void startPlay() {
        this.f356958o = true;
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = this.f356947k;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.clearLog();
            this.f356947k.setVisibility(0);
        }
        android.view.TextureView textureView = this.f356956m;
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    @Override // pn0.b
    public void stopPlay(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f356955l, "stopPlay saveTextureWhenStop: " + this.f356961r + " clearLastFrame = " + z17);
        if (!this.f356961r || z17) {
            this.f356958o = false;
        } else {
            this.f356958o = true;
        }
        this.f356961r = false;
        this.f356946j.v3(null);
        if (z17) {
            com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = this.f356947k;
            if (tXCloudVideoView != null) {
                tXCloudVideoView.setVisibility(8);
            }
            android.view.TextureView textureView = this.f356956m;
            if (textureView != null) {
                textureView.setVisibility(8);
            }
        }
    }

    @Override // pn0.a, pn0.b
    public void u(int i17, int i18) {
        super.u(i17, i18);
        nn0.m mVar = this.f356959p;
        if (mVar == null || this.f356941e == 1) {
            return;
        }
        mVar.g(this.f356937a, this.f356938b);
    }
}
