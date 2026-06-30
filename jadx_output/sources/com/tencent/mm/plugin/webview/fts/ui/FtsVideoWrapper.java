package com.tencent.mm.plugin.webview.fts.ui;

/* loaded from: classes4.dex */
public class FtsVideoWrapper extends android.widget.RelativeLayout implements com.tencent.mm.pluginsdk.ui.f1, com.tencent.mm.pluginsdk.ui.a1, com.tencent.mm.pluginsdk.ui.c1, com.tencent.mm.pluginsdk.ui.b1, c01.i {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f182055d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.f1 f182056e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.b1 f182057f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.z0 f182058g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.e1 f182059h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f182060i;

    /* renamed from: m, reason: collision with root package name */
    public float f182061m;

    /* renamed from: n, reason: collision with root package name */
    public int f182062n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f182063o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f182064p;

    /* renamed from: q, reason: collision with root package name */
    public final c01.k f182065q;

    public FtsVideoWrapper(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVideoWrapper", "%d onVideoEnded", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f182057f;
        if (b1Var != null) {
            b1Var.E(str, str2);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVideoWrapper", "%d onGetVideoSize[%d %d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f182057f;
        if (b1Var != null) {
            b1Var.I(str, str2, i17, i18);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandVideoWrapper", "%d onError[%s %d, %d]", java.lang.Integer.valueOf(hashCode()), str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f182057f;
        if (b1Var != null) {
            b1Var.N(str, str2, str3, i17, i18);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f182057f;
        if (b1Var != null) {
            b1Var.N5(str, str2, bool);
        }
    }

    @Override // c01.i
    public void P0() {
    }

    @Override // c01.i
    public void U5() {
    }

    @Override // c01.i
    public void V3() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean a(double d17, boolean z17) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            return ((com.tencent.mm.pluginsdk.ui.CommonVideoView) f1Var).a(d17, z17);
        }
        return false;
    }

    public boolean b(double d17) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            return ((com.tencent.mm.pluginsdk.ui.AbstractVideoView) f1Var).S(d17);
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean c(float f17) {
        if (f17 <= 0.0f) {
            return false;
        }
        this.f182061m = f17;
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            return f1Var.c(f17);
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void d() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            f1Var.d();
        }
        this.f182065q.a();
        setKeepScreenOn(false);
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void e() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            f1Var.e();
        }
        this.f182065q.a();
        setKeepScreenOn(false);
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void g() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            ((com.tencent.mm.pluginsdk.ui.CommonVideoView) f1Var).g();
        }
    }

    @Override // c01.i
    public void g3() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getCacheTimeSec() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            return f1Var.getCacheTimeSec();
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getCurrPosMs() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            return f1Var.getCurrPosMs();
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getCurrPosSec() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            return f1Var.getCurrPosSec();
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getPlayerType() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            return f1Var.getPlayerType();
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getVideoDurationSec() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        return f1Var != null ? f1Var.getVideoDurationSec() : this.f182062n;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0095  */
    @Override // com.tencent.mm.pluginsdk.ui.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(boolean r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.f182062n = r5
            r2.f182063o = r3
            com.tencent.mm.pointers.PString r3 = new com.tencent.mm.pointers.PString
            r3.<init>()
            r3.value = r4
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.f192989a
            r2.f182064p = r4
            com.tencent.mm.pluginsdk.ui.f1 r3 = r2.f182056e
            android.content.Context r4 = r2.f182055d
            java.lang.String r5 = "%d use common video view !"
            java.lang.String r0 = "MicroMsg.AppBrandVideoWrapper"
            if (r3 != 0) goto L36
            int r3 = r2.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.tencent.mars.xlog.Log.i(r0, r5, r3)
            com.tencent.mm.pluginsdk.ui.CommonVideoView r3 = new com.tencent.mm.pluginsdk.ui.CommonVideoView
            r3.<init>(r4)
            r3.setReporter(r2)
            r3.setIMMVideoViewCallback(r2)
            r2.f182056e = r3
            goto L69
        L36:
            boolean r1 = r3 instanceof com.tencent.mm.modelvideo.MMVideoView
            if (r1 == 0) goto L6b
            com.tencent.mm.pluginsdk.ui.AbstractVideoView r3 = (com.tencent.mm.pluginsdk.ui.AbstractVideoView) r3
            r3.stop()
            com.tencent.mm.pluginsdk.ui.f1 r3 = r2.f182056e
            com.tencent.mm.pluginsdk.ui.AbstractVideoView r3 = (com.tencent.mm.pluginsdk.ui.AbstractVideoView) r3
            r3.i()
            com.tencent.mm.pluginsdk.ui.f1 r3 = r2.f182056e
            android.view.View r3 = (android.view.View) r3
            r2.removeView(r3)
            int r3 = r2.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.tencent.mars.xlog.Log.i(r0, r5, r3)
            com.tencent.mm.pluginsdk.ui.CommonVideoView r3 = new com.tencent.mm.pluginsdk.ui.CommonVideoView
            r3.<init>(r4)
            r3.setReporter(r2)
            r3.setIMMVideoViewCallback(r2)
            r2.f182056e = r3
        L69:
            r3 = 1
            goto L84
        L6b:
            int r3 = r2.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d use last common video view !"
            com.tencent.mars.xlog.Log.i(r0, r4, r3)
            com.tencent.mm.pluginsdk.ui.f1 r3 = r2.f182056e
            com.tencent.mm.pluginsdk.ui.AbstractVideoView r3 = (com.tencent.mm.pluginsdk.ui.AbstractVideoView) r3
            r3.stop()
            r3 = 0
        L84:
            com.tencent.mm.pluginsdk.ui.e1 r4 = r2.f182059h
            r2.setScaleType(r4)
            float r4 = r2.f182061m
            r2.c(r4)
            boolean r4 = r2.f182060i
            r2.setMute(r4)
            if (r3 == 0) goto Lad
            com.tencent.mm.pluginsdk.ui.z0 r3 = r2.f182058g
            r2.setVideoFooterView(r3)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r4 = 13
            r3.addRule(r4)
            com.tencent.mm.pluginsdk.ui.f1 r4 = r2.f182056e
            android.view.View r4 = (android.view.View) r4
            r2.addView(r4, r3)
        Lad:
            com.tencent.mm.pluginsdk.ui.f1 r3 = r2.f182056e
            boolean r4 = r2.f182063o
            java.lang.String r5 = r2.f182064p
            int r0 = r2.f182062n
            com.tencent.mm.pluginsdk.ui.CommonVideoView r3 = (com.tencent.mm.pluginsdk.ui.CommonVideoView) r3
            r3.h(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper.h(boolean, java.lang.String, int):void");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        hashCode();
        setKeepScreenOn(false);
        this.f182065q.a();
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f182057f;
        if (b1Var != null) {
            b1Var.i(str, str2);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.c1
    public void idkeyStat(long j17, long j18, long j19, boolean z17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(j17, j18, j19, z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean isPlaying() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            return f1Var.isPlaying();
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean j() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            return f1Var.j();
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.c1
    public void kvStat(int i17, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        hashCode();
        setKeepScreenOn(true);
        this.f182065q.c(this);
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f182057f;
        if (b1Var != null) {
            b1Var.l(str, str2);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f182057f;
        if (b1Var != null) {
            b1Var.m2(str, str2, true);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVideoWrapper", "%d onPrepared", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f182057f;
        if (b1Var != null) {
            b1Var.o(str, str2);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean pause() {
        if (this.f182056e == null) {
            return false;
        }
        setKeepScreenOn(false);
        this.f182065q.a();
        return this.f182056e.pause();
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean play() {
        if (this.f182056e == null) {
            return false;
        }
        setKeepScreenOn(true);
        this.f182065q.c(this);
        return this.f182056e.play();
    }

    @Override // com.tencent.mm.pluginsdk.ui.a1
    public void r(java.lang.String str, boolean z17) {
        boolean z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish path [%s] isPlayNow [%b]", java.lang.Integer.valueOf(hashCode()), str, java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var instanceof com.tencent.mm.modelvideo.MMVideoView) {
            ((com.tencent.mm.pluginsdk.ui.AbstractVideoView) f1Var).stop();
            ((com.tencent.mm.pluginsdk.ui.AbstractVideoView) this.f182056e).i();
            removeView((android.view.View) this.f182056e);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish use common video view !", java.lang.Integer.valueOf(hashCode()));
            com.tencent.mm.pluginsdk.ui.CommonVideoView commonVideoView = new com.tencent.mm.pluginsdk.ui.CommonVideoView(this.f182055d);
            commonVideoView.setReporter(this);
            commonVideoView.setIMMVideoViewCallback(this);
            this.f182056e = commonVideoView;
            z18 = true;
        } else {
            z18 = false;
        }
        setScaleType(this.f182059h);
        c(this.f182061m);
        setMute(this.f182060i);
        if (z18) {
            setVideoFooterView(this.f182058g);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            addView((android.view.View) this.f182056e, layoutParams);
            ((com.tencent.mm.pluginsdk.ui.CommonVideoView) this.f182056e).h(this.f182063o, this.f182064p, this.f182062n);
            ((com.tencent.mm.pluginsdk.ui.CommonVideoView) this.f182056e).start();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setCover(android.graphics.Bitmap bitmap) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            f1Var.setCover(bitmap);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setFullDirection(int i17) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            f1Var.setFullDirection(i17);
        }
    }

    public void setIMMVideoViewCallback(com.tencent.mm.pluginsdk.ui.b1 b1Var) {
        this.f182057f = b1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setIsShowBasicControls(boolean z17) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            f1Var.setIsShowBasicControls(z17);
        }
    }

    @Override // android.view.View
    public void setKeepScreenOn(boolean z17) {
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        super.setKeepScreenOn(z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setLoop(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setLoopCompletionCallback(com.tencent.mm.pluginsdk.ui.d1 d1Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setMute(boolean z17) {
        this.f182060i = z17;
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            f1Var.setMute(z17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var) {
        this.f182059h = e1Var;
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            f1Var.setScaleType(e1Var);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setVideoFooterView(com.tencent.mm.pluginsdk.ui.z0 z0Var) {
        this.f182058g = z0Var;
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            f1Var.setVideoFooterView(z0Var);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void start() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            ((com.tencent.mm.pluginsdk.ui.CommonVideoView) f1Var).start();
            setKeepScreenOn(true);
            this.f182065q.c(this);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void stop() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f182056e;
        if (f1Var != null) {
            f1Var.stop();
            this.f182065q.a();
            setKeepScreenOn(false);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }

    public FtsVideoWrapper(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f182059h = com.tencent.mm.pluginsdk.ui.e1.CONTAIN;
        this.f182060i = false;
        this.f182061m = -1.0f;
        this.f182055d = context;
        this.f182065q = new c01.k();
    }
}
