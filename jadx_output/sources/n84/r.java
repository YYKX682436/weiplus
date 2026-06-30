package n84;

/* loaded from: classes4.dex */
public class r implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView f335688d;

    public r(com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView) {
        this.f335688d = adAlphaPlayerView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
        n84.w.e("AdAlphaPlayerView", "onSurfaceTextureAvailable " + surfaceTexture);
        int i19 = com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.f163477u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView = this.f335688d;
        android.view.TextureView textureView = adAlphaPlayerView.f163480f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        if (textureView.getSurfaceTexture() != surfaceTexture) {
            n84.w.e("AdAlphaPlayerView", "onSurfaceTextureAvailable change surface " + surfaceTexture);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            android.view.TextureView textureView2 = adAlphaPlayerView.f163480f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            textureView2.setSurfaceTexture(surfaceTexture);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        android.view.TextureView textureView3 = adAlphaPlayerView.f163480f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startRenderPlay", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.w.a("AdAlphaPlayerView", "startPlay: width-" + i17 + " height-" + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupRenderer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        if (adAlphaPlayerView.f163480f == null || i17 == 0 || i18 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("w", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
            com.tencent.mars.xlog.Log.w("AlphaPlayer_AdAlphaPlayerView", java.lang.String.valueOf("setupRenderer failed: surface-" + textureView3 + ", width-" + i17 + ", height-" + i18));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("w", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupRenderer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        } else {
            n84.v vVar = new n84.v(adAlphaPlayerView.getContext(), textureView3.getSurfaceTexture(), i17, i18, adAlphaPlayerView.f163484m);
            adAlphaPlayerView.f163478d = vVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRendererStatusChangeListener", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            vVar.f335670q = adAlphaPlayerView;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRendererStatusChangeListener", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupRenderer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startRenderPlay", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
        n84.w.e("AdAlphaPlayerView", "onSurfaceTextureDestroyed");
        ((ku5.t0) ku5.t0.f312615d).B(new n84.q(this));
        com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView = this.f335688d;
        int i17 = com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.f163477u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.v vVar = adAlphaPlayerView.f163478d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        if (vVar != null) {
            vVar.d();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
        n84.w.a("AdAlphaPlayerView", "onSurfaceTextureSizeChanged width:" + i17 + " height:" + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
    }
}
