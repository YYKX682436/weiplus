package com.tencent.mm.plugin.sns.ad.widget.advideo;

/* loaded from: classes4.dex */
public class AdLandingVideoPlayerToolBar extends android.widget.RelativeLayout implements com.tencent.mm.pluginsdk.ui.z0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f163468d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar f163469e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f163470f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f163471g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f163472h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f163473i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f163474m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e1 f163475n;

    public AdLandingVideoPlayerToolBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchScreenStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        this.f163472h = z17;
        android.widget.ImageView imageView = this.f163470f;
        if (imageView == null) {
            com.tencent.mars.xlog.Log.e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar swichScreenStatus, switchScreenIv is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchScreenStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        } else {
            if (z17) {
                imageView.setImageResource(com.tencent.mm.R.raw.icon_video_short_screen);
            } else {
                imageView.setImageResource(com.tencent.mm.R.raw.icon_video_full_screen);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchScreenStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        }
    }

    public void b(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchVoiceStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        android.widget.ImageView imageView = this.f163471g;
        if (imageView == null) {
            com.tencent.mars.xlog.Log.e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar swichVoiceStatus, voiceIv is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchVoiceStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        } else {
            if (z17) {
                imageView.setImageResource(com.tencent.mm.R.raw.icon_volume_on);
            } else {
                imageView.setImageResource(com.tencent.mm.R.raw.icon_volume_off);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchVoiceStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.z0
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar adLandingVideoPlayerSeekBar = this.f163469e;
        if (adLandingVideoPlayerSeekBar == null) {
            com.tencent.mars.xlog.Log.e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar updateTime, seekBar is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            return;
        }
        adLandingVideoPlayerSeekBar.a(i17);
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e1 e1Var = this.f163475n;
        if (e1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$8");
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f1Var = ((com.tencent.mm.plugin.sns.ad.landingpage.component.comp.c1) e1Var).f162776a;
            if (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1.Y(f1Var).S != null && f1Var.isPlaying()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                boolean z17 = f1Var.L;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                if (!z17 && (adLandingVideoPlayerToolBar = f1Var.D) != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
                    boolean z18 = adLandingVideoPlayerToolBar.f163472h;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
                    if (!z18) {
                        int i18 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1.Y(f1Var).S.f2888b;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                        f1Var.i0(i18, i17 * 1000);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$8");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    @Override // com.tencent.mm.pluginsdk.ui.z0
    public void e(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideoStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar adLandingVideoPlayerSeekBar = this.f163469e;
        if (adLandingVideoPlayerSeekBar == null) {
            com.tencent.mars.xlog.Log.e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar updateVideoStatus, seekBar is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        } else {
            adLandingVideoPlayerSeekBar.setIsPlay(z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        }
    }

    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        return com.tencent.mm.R.layout.f487973cy;
    }

    public com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar getSeekBar() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSeekBar", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar adLandingVideoPlayerSeekBar = this.f163469e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSeekBar", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        return adLandingVideoPlayerSeekBar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.z0
    public int getVideoTotalTime() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar adLandingVideoPlayerSeekBar = this.f163469e;
        if (adLandingVideoPlayerSeekBar == null) {
            com.tencent.mars.xlog.Log.e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar getVideoTotalTime, seekBar is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            return 0;
        }
        int videoTotalTime = adLandingVideoPlayerSeekBar.getVideoTotalTime();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        return videoTotalTime;
    }

    @Override // android.view.View
    public int getVisibility() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVisibility", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        int visibility = this.f163469e.getVisibility();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVisibility", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        return visibility;
    }

    public void setForceHideFullScreenIcon(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setForceHideFullScreenIcon", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        this.f163474m = z17;
        android.widget.ImageView imageView = this.f163470f;
        if (imageView != null && z17) {
            imageView.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setForceHideFullScreenIcon", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    public void setForceHideVoiceIcon(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setForceHideVoiceIcon", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        this.f163473i = z17;
        android.widget.ImageView imageView = this.f163471g;
        if (imageView != null && z17) {
            imageView.setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizeToolBarLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            android.widget.ImageView imageView2 = this.f163470f;
            if (imageView2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeToolBarLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            } else {
                android.view.ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(11);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeToolBarLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setForceHideVoiceIcon", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    public void setOnFullScreenClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnFullScreenClickListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        android.widget.ImageView imageView = this.f163470f;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnFullScreenClickListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    public void setOnVoiceButtonClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnVoiceButtonClickListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        android.widget.ImageView imageView = this.f163471g;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnVoiceButtonClickListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    public void setUpdateTimeListener(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e1 e1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUpdateTimeListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        this.f163475n = e1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUpdateTimeListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    @Override // com.tencent.mm.pluginsdk.ui.z0
    public void setVideoTotalTime(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar adLandingVideoPlayerSeekBar = this.f163469e;
        if (adLandingVideoPlayerSeekBar == null) {
            com.tencent.mars.xlog.Log.e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar setVideoTotalTime, seekBar is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        } else {
            adLandingVideoPlayerSeekBar.setVideoTotalTime(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar adLandingVideoPlayerSeekBar = this.f163469e;
        if (adLandingVideoPlayerSeekBar != null && this.f163470f != null && this.f163471g != null) {
            adLandingVideoPlayerSeekBar.setVisibility(i17);
            if (!this.f163474m) {
                this.f163470f.setVisibility(i17);
            }
            if (!this.f163473i) {
                this.f163471g.setVisibility(i17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    public AdLandingVideoPlayerToolBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f163468d = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        android.view.View inflate = android.view.View.inflate(getContext(), getLayoutId(), this);
        this.f163468d = inflate;
        this.f163469e = (com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar) inflate.findViewById(com.tencent.mm.R.id.f482641jz);
        this.f163470f = (android.widget.ImageView) this.f163468d.findViewById(com.tencent.mm.R.id.f487002n55);
        this.f163471g = (android.widget.ImageView) this.f163468d.findViewById(com.tencent.mm.R.id.f487003n56);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }
}
