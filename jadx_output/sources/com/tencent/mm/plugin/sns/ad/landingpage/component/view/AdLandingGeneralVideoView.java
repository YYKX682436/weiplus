package com.tencent.mm.plugin.sns.ad.landingpage.component.view;

/* loaded from: classes4.dex */
public class AdLandingGeneralVideoView extends com.tencent.mm.modelvideo.MMVideoView {
    public int O1;
    public java.lang.String P1;
    public boolean Q1;
    public g54.d R1;

    public AdLandingGeneralVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private java.lang.String getRootPath() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.P1)) {
            str = lp0.b.D() + "video/";
        } else {
            str = this.P1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return str;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public com.tencent.mm.pluginsdk.ui.tools.f4 C(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (this.f189754w == 1) {
            this.f189753v = true;
            this.f189757z = 1;
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView = new com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView(context);
            adThumbPlayerVideoView.setNeedReuseSurface(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
            return adThumbPlayerVideoView;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUseThumbVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_general_comp_use_thumb_video_view, 0);
            com.tencent.mars.xlog.Log.i(this.f189739e, "isUseThumbVideoView is " + Ni);
            r5 = Ni == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUseThumbVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(this.f189739e, "isUseThumbVideoView, exp is " + th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUseThumbVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        }
        if (!r5) {
            com.tencent.mm.pluginsdk.ui.tools.f4 C = super.C(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
            return C;
        }
        this.f189753v = true;
        this.f189757z = 1;
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = new com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return thumbPlayerVideoView;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public void I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        super.I();
        this.f189739e = "MicroMsg.AdLandingGeneralVideoView";
        this.f189738d = "VideoView.AdLandingGeneralVideoView";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNeedOperateSurfaceTexture", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) {
            ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) f4Var).setNeedOperateSurfaceTexture(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNeedOperateSurfaceTexture", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public java.lang.String N() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("logTips", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        java.lang.String str = this.f71650y0 + " ";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("logTips", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public void W(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        super.W(i17);
        g54.d dVar = this.R1;
        if (dVar != null) {
            dVar.a(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public boolean Z(int i17, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcDownloadRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (this.O1 != 1) {
            boolean Z = super.Z(i17, pInt, pInt2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcDownloadRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
            return Z;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcDownloadFirstRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        pInt.value = java.lang.Math.max(i17, this.E1);
        int i18 = this.f71651y1;
        if (i18 == 1) {
            pInt.value = i17;
        }
        if (i18 == 2) {
            int i19 = i17 - 8;
            pInt.value = i19;
            if (i19 < 0) {
                pInt.value = 0;
            }
        }
        if (i18 == 3 || i18 == 4) {
            pInt.value = this.E1;
        }
        pInt2.value = this.A1 + 1;
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", N(), java.lang.Integer.valueOf(pInt.value), java.lang.Integer.valueOf(pInt2.value), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f71651y1), java.lang.Integer.valueOf(this.E1), java.lang.Integer.valueOf(this.F1), this.f71650y0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcDownloadFirstRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcDownloadRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return true;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public boolean a0(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        boolean z17 = true;
        if (this.O1 != 1) {
            boolean a07 = super.a0(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
            return a07;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkDownloadFirstCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (this.A1 - this.E1 > 1 && this.f71649x1 != 3) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDownloadFirstCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003b -> B:20:0x004f). Please report as a decompilation issue!!! */
    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        try {
            super.d();
            com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
            boolean z17 = f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = f4Var;
            if (z17) {
                videoPlayerTextureView = (com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) f4Var;
                videoPlayerTextureView.getClass();
                try {
                    if (videoPlayerTextureView.G) {
                        android.graphics.SurfaceTexture surfaceTexture = videoPlayerTextureView.F;
                        videoPlayerTextureView = videoPlayerTextureView;
                        if (surfaceTexture != null) {
                            if (android.os.Build.VERSION.SDK_INT >= 26) {
                                videoPlayerTextureView = videoPlayerTextureView;
                                if (!surfaceTexture.isReleased()) {
                                    videoPlayerTextureView.F.release();
                                    videoPlayerTextureView.F = null;
                                    videoPlayerTextureView = videoPlayerTextureView;
                                }
                            } else {
                                surfaceTexture.release();
                                videoPlayerTextureView.F = null;
                                videoPlayerTextureView = videoPlayerTextureView;
                            }
                        }
                    } else {
                        videoPlayerTextureView = videoPlayerTextureView;
                    }
                } catch (java.lang.Throwable th6) {
                    java.lang.String str = videoPlayerTextureView.f191448h;
                    com.tencent.mars.xlog.Log.e(str, th6.toString());
                    videoPlayerTextureView = str;
                }
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e(this.f189739e, th7.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public void d0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createVideoFilePath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.T)) {
            this.f71650y0 = l44.c0.h("AdLandingGeneralVideo_" + this.T.hashCode(), this.Q1);
            java.lang.String str = getRootPath() + "AdLandingGeneralVideo_" + this.T.hashCode() + ".mp4";
            this.f71645l1 = str;
            com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str));
            com.tencent.mars.xlog.Log.i(this.f189739e, "%s set video path [%s %s]", N(), this.f71650y0, this.f71645l1);
            com.tencent.mars.xlog.Log.i(this.f189738d, "setVideoPath, cdnMediaId = " + this.f71650y0 + ", url = " + this.T);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createVideoFilePath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public android.view.View getInnerVideoView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (this.f189753v) {
            java.lang.Object obj = this.f189748q;
            if ((obj instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) || (obj instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView)) {
                android.view.View view = (android.view.View) obj;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
                return view;
            }
        }
        android.view.View innerVideoView = super.getInnerVideoView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return innerVideoView;
    }

    public android.widget.ImageView getThumbView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        android.widget.ImageView imageView = this.f189742h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return imageView;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void h(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s set video path isLive [%b] url [%s] durationSec [%d]", N(), java.lang.Boolean.valueOf(z17), str, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExptGeneralVideoAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExptGeneralVideoAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        this.Q1 = true;
        this.S = z17;
        java.lang.String j17 = l44.c0.j(str, true);
        this.T = j17;
        this.U = i17;
        this.R.f190802i = j17;
        d0();
        if (this.f189753v && (this.f189748q instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView)) {
            this.f189743i.setAlpha(0.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public boolean j0(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        com.tencent.mars.xlog.Log.i(this.f189738d, "seekTo, time = " + i17 + ", afterSeekPlay = " + z17);
        boolean j07 = super.j0(i17, z17);
        if (this.f71649x1 == 3 && this.O1 == 1) {
            this.B1 = -1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return j07;
    }

    public void setAdMMVideoViewCallback(g54.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdMMVideoViewCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (dVar != null) {
            this.R1 = dVar;
            setIMMVideoViewCallback(dVar);
            setLoopCompletionCallback(this.R1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdMMVideoViewCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public void setRootPath(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRootPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        this.P1 = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRootPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScaleType", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (this.f189753v) {
            com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
            if (f4Var instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
                ((com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) f4Var).setScaleType(e1Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScaleType", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
                return;
            } else if (f4Var instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView) {
                ((com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView) f4Var).setScaleType(e1Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScaleType", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
                return;
            }
        }
        super.setScaleType(e1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScaleType", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    public void setVideoPlayerMode(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoPlayerMode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        this.O1 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoPlayerMode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.tools.c4
    public void z(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        super.z(z17);
        if (this.f189753v && (this.f189748q instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView)) {
            this.f189743i.setAlpha(1.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    public AdLandingGeneralVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public AdLandingGeneralVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.O1 = 0;
        this.Q1 = false;
    }
}
