package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class VideoSightCenterView extends com.tencent.mm.pluginsdk.ui.tools.VideoSightView {
    public volatile boolean W;

    /* renamed from: p0, reason: collision with root package name */
    public android.media.MediaMetadataRetriever f191464p0;

    /* renamed from: x0, reason: collision with root package name */
    public int f191465x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f191466y0;

    public VideoSightCenterView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.W = false;
        this.f191465x0 = 0;
        this.f191466y0 = false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoSightView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void b(double d17) {
        getLastProgresstime();
        if (!this.f191466y0 || getLastProgresstime() <= 0.0d) {
            return;
        }
        super.b(d17 / 1000.0d);
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView, com.tencent.mm.plugin.sight.decode.model.a
    public void e(int i17, int i18) {
        super.e(i17, i18);
        if (getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
            layoutParams.addRule(13);
            setLayoutParams(layoutParams);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoSightView, com.tencent.mm.pluginsdk.ui.tools.f4
    public int getCurrentPosition() {
        return this.f191465x0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoSightView, com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView, com.tencent.mm.pluginsdk.ui.tools.f4
    public int getDuration() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoSightCenterView", "getDuration");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.S)) {
            try {
                if (this.f191464p0 == null) {
                    gp.d dVar = new gp.d();
                    this.f191464p0 = dVar;
                    dVar.setDataSource(this.S);
                }
                int intValue = java.lang.Integer.valueOf(this.f191464p0.extractMetadata(9)).intValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoSightCenterView", "getDuration: %s", java.lang.Integer.valueOf(intValue));
                return intValue;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VideoSightCenterView", "getDuration error: %s", e17.getMessage());
            }
        }
        return super.getDuration();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoSightView, com.tencent.mm.pluginsdk.ui.tools.f4
    public double getLastProgresstime() {
        return super.getLastProgresstime();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoSightView, com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean isPlaying() {
        return this.f191466y0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoSightView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void pause() {
        super.pause();
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView, com.tencent.mm.plugin.sight.decode.model.a
    public void setDrawableWidth(int i17) {
        super.setDrawableWidth(i17);
        if (getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
            layoutParams.addRule(13);
            setLayoutParams(layoutParams);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoSightView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void setPlayProgressCallback(boolean z17) {
        if (z17) {
            setOnDecodeDurationListener(new com.tencent.mm.pluginsdk.ui.tools.s7(this));
        } else {
            setOnDecodeDurationListener(null);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoSightView, com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean start() {
        this.f191466y0 = true;
        return super.start();
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void stop() {
        p();
        this.f191465x0 = 0;
        this.f191466y0 = false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoSightView
    public void t() {
        java.lang.String str = wo.v1.f447833m.D;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (str.equals("other")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoSightCenterView", "init::use other player");
        } else {
            q(true);
        }
        setOnCompletionListener(new com.tencent.mm.pluginsdk.ui.tools.r7(this));
    }

    public VideoSightCenterView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = false;
        this.f191465x0 = 0;
        this.f191466y0 = false;
    }
}
