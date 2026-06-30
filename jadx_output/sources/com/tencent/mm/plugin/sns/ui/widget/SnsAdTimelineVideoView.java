package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsAdTimelineVideoView extends com.tencent.mm.plugin.sns.ui.OfflineVideoView {
    public boolean A;
    public boolean B;
    public boolean C;

    /* renamed from: y, reason: collision with root package name */
    public m3.a f170829y;

    /* renamed from: z, reason: collision with root package name */
    public m3.a f170830z;

    public SnsAdTimelineVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // com.tencent.mm.plugin.sns.ui.OfflineVideoView
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "clearTimer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public android.graphics.drawable.Drawable getThumbDrawable() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        android.widget.ImageView imageView = this.f166412g;
        if (imageView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
            return null;
        }
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        return drawable;
    }

    @Override // com.tencent.mm.plugin.sns.ui.OfflineVideoView
    public void k(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.k(i17, z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "seekTo:" + i17 + ", afterSeekPlay=" + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OfflineVideoView
    public void l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OfflineVideoView
    public void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        boolean g17 = g();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "start, hasPrepared=" + this.B + ", shouldPlayWhenPrepared=" + this.f166418p + ", isPlaying=" + g17);
        if (!this.B && this.f166418p) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
            return;
        }
        if (!g17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "do start");
            super.m();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OfflineVideoView
    public void n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.n();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "startTimer:" + getTimerInterval());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OfflineVideoView
    public void o(boolean z17, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchVideoModel", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.o(z17, f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchVideoModel: thumVis=");
        sb6.append(this.f166412g.getVisibility() == 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchVideoModel", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "onDetachedFromWindow");
        u();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OfflineVideoView, com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.onError(i17, i18);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.t.CTRL_INDEX, 7);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OfflineVideoView, com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        m3.a aVar = this.f170829y;
        if (aVar != null) {
            aVar.accept(null);
            this.f170829y = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "onPrepared, path=%s , shouldPlayWhenPrepared=%s", getVideoPath(), java.lang.Boolean.valueOf(this.f166418p));
        if (this.f166418p) {
            super.onPrepared();
        }
        this.B = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setForbidAutoPlay(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setForbidAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        this.C = z17;
        if (z17) {
            this.f166418p = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setForbidAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setOnPrepared(m3.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        this.f170829y = aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setOnReplay(m3.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnReplay", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        this.f170830z = aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnReplay", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setShouldPlayWhenPrepared(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShouldPlayWhenPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "setShouldPlayWhenPrepared:" + z17 + ", isForbidAutoPlay=" + this.C);
        if (this.C) {
            this.f166418p = false;
        } else {
            this.f166418p = z17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShouldPlayWhenPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setThumbBmp(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThumbBmp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "setThumbBmp=" + bitmap);
        android.widget.ImageView imageView = this.f166412g;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThumbBmp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setThumbDrawable(android.graphics.drawable.Drawable drawable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "setThumbDrawable=" + drawable);
        android.widget.ImageView imageView = this.f166412g;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setThumpViewScaleType(android.widget.ImageView.ScaleType scaleType) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThumpViewScaleType", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        android.widget.ImageView imageView = this.f166412g;
        if (imageView != null) {
            imageView.setScaleType(scaleType);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThumpViewScaleType", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setVideoPath(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        java.lang.String videoPath = getVideoPath();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "setVideoPath, hasPrepared=" + this.A + ", path=" + str + ", oldPath=" + videoPath);
        if (!this.A || (str != null && !str.equals(videoPath))) {
            j(str);
            this.A = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OfflineVideoView
    public void t(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideoUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.t(i17);
        this.f166412g.getVisibility();
        int i18 = i17 / 1000;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "clear");
        i();
        this.A = false;
        this.f166418p = false;
        this.B = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "path after clear=" + getVideoPath());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "restart, hasPrepared=" + this.A);
        if (this.A) {
            super.k(0, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void w(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showVideoThumb", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "showVideoThumb:" + z17);
        o(!z17, z17 ? 0.0f : 1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showVideoThumb", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public SnsAdTimelineVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f166418p = false;
    }
}
