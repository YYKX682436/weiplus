package g54;

/* loaded from: classes15.dex */
public final class p implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public long f268943d = -1;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f268944e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.SurfaceTexture f268945f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f268946g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView f268947h;

    public p(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView) {
        this.f268947h = adThumbPlayerVideoView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        android.graphics.SurfaceTexture surfaceTexture2;
        android.graphics.SurfaceTexture surfaceTexture3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView = this.f268947h;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "onSurfaceTextureAvailable： " + surfaceTexture + '(' + i17 + " x " + i18 + ')');
        if (this.f268944e != null) {
            com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "surface is already valid");
            if (android.os.Build.VERSION.SDK_INT >= 26 && (surfaceTexture3 = this.f268945f) != null) {
                surfaceTexture3.isReleased();
            }
            if (adThumbPlayerVideoView.getNeedReuseSurface() && (surfaceTexture2 = this.f268945f) != null) {
                adThumbPlayerVideoView.setSurfaceTexture(surfaceTexture2);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
            return;
        }
        if (adThumbPlayerVideoView.getNeedReuseSurface()) {
            this.f268945f = surfaceTexture;
        } else {
            android.view.Surface surface = this.f268944e;
            if (surface != null) {
                surface.release();
            }
        }
        this.f268944e = new android.view.Surface(surfaceTexture);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayer$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        kk4.c cVar = adThumbPlayerVideoView.f163019i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayer$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        if (cVar != null) {
            ((kk4.f0) cVar).setSurface(this.f268944e, 1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setFirstFrameNotified$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        adThumbPlayerVideoView.f163026s = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setFirstFrameNotified$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setVideoCenter", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        adThumbPlayerVideoView.s();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setVideoCenter", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSeekTarget$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        java.lang.Double d17 = adThumbPlayerVideoView.f163022o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSeekTarget$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        if (d17 != null) {
            adThumbPlayerVideoView.a(d17.doubleValue(), com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.m(adThumbPlayerVideoView));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView = this.f268947h;
        com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "onSurfaceTextureDestroyed");
        if (!adThumbPlayerVideoView.getNeedReuseSurface()) {
            android.view.Surface surface = this.f268944e;
            if (surface != null) {
                surface.release();
            }
            this.f268944e = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setFirstFrameNotified$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
            adThumbPlayerVideoView.f163026s = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setFirstFrameNotified$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        }
        if (adThumbPlayerVideoView.getNeedReuseSurface() && this.f268946g) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(this.f268947h), "onSurfaceTextureSizeChanged: " + i17 + " x " + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
        kotlin.jvm.internal.o.g(surface, "surface");
        this.f268943d = surface.getTimestamp();
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView = this.f268947h;
        g54.e k17 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.k(adThumbPlayerVideoView);
        k17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNextFrameUpdated", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$Callbacks");
        yz5.a aVar = k17.f268929c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNextFrameUpdated", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$Callbacks");
        if (aVar != null) {
            aVar.invoke();
            g54.e k18 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.k(adThumbPlayerVideoView);
            k18.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNextFrameUpdated", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$Callbacks");
            k18.f268929c = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNextFrameUpdated", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$Callbacks");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
    }
}
