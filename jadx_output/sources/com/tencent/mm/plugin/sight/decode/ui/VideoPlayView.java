package com.tencent.mm.plugin.sight.decode.ui;

/* loaded from: classes4.dex */
public class VideoPlayView extends android.widget.RelativeLayout implements c01.i, com.tencent.mm.pluginsdk.ui.tools.f4 {
    public static final /* synthetic */ int H = 0;
    public boolean A;
    public boolean B;
    public long C;
    public final android.view.animation.Animation D;
    public final android.view.animation.Animation E;
    public final java.lang.Runnable F;
    public int G;

    /* renamed from: d, reason: collision with root package name */
    public int f162507d;

    /* renamed from: e, reason: collision with root package name */
    public int f162508e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f162509f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f162510g;

    /* renamed from: h, reason: collision with root package name */
    public m34.a0 f162511h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f162512i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f162513m;

    /* renamed from: n, reason: collision with root package name */
    public m34.d f162514n;

    /* renamed from: o, reason: collision with root package name */
    public double f162515o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f162516p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f162517q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f162518r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f162519s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f162520t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f162521u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f162522v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f162523w;

    /* renamed from: x, reason: collision with root package name */
    public int f162524x;

    /* renamed from: y, reason: collision with root package name */
    public int f162525y;

    /* renamed from: z, reason: collision with root package name */
    public int f162526z;

    public VideoPlayView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f162507d = com.tencent.mapsdk.internal.km.f50100e;
        this.f162508e = 240;
        this.f162509f = true;
        this.f162513m = null;
        this.f162515o = 0.0d;
        this.f162518r = "";
        this.f162519s = new com.tencent.mm.sdk.platformtools.n3();
        this.f162522v = true;
        this.f162524x = 0;
        this.f162525y = 0;
        this.f162526z = 0;
        this.A = false;
        this.B = false;
        this.C = 0L;
        this.D = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        this.E = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        this.F = new m34.v(this);
        this.G = 0;
        e();
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

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void a(double d17, boolean z17) {
        b(d17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void b(double d17) {
        this.f162513m.b(d17);
        this.f162514n.a((int) d17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean c(android.content.Context context, boolean z17) {
        return this.f162513m.c(context, z17);
    }

    public void d() {
        java.lang.Object obj = this.f162514n;
        if (obj != null) {
            android.view.View view = (android.view.View) obj;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f162520t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f162521u.setVisibility(8);
        android.view.View view3 = this.f162516p;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void e() {
        this.D.setDuration(200L);
        this.E.setDuration(200L);
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.d3l, this);
        this.f162520t = findViewById(com.tencent.mm.R.id.kwk);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.jgc);
        this.f162521u = imageView;
        imageView.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        this.f162510g = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.lc6);
        this.f162512i = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.oy7);
        com.tencent.mm.pluginsdk.ui.tools.f4 a17 = com.tencent.mm.pluginsdk.ui.tools.n8.a(getContext());
        this.f162513m = a17;
        a17.setLoop(false);
        this.f162512i.addView((android.view.View) this.f162513m, 0, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mva);
        this.f162517q = textView;
        this.f162516p = textView;
        this.f162513m.setVideoCallback(new m34.s(this));
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f162513m;
        if (f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoSightView) {
            ((com.tencent.mm.pluginsdk.ui.tools.VideoSightView) f4Var).setEnableConfigChanged(false);
        }
        setOnTouchListener(new m34.t(this));
        d();
        ((android.view.View) this.f162513m).post(new m34.u(this));
    }

    public final void f(int i17) {
        this.f162515o = i17 >= 0 ? i17 : this.f162513m.getLastProgresstime();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayView", "pause play " + this.f162515o + " lastTime: " + i17 + " last " + this.f162513m.getLastProgresstime());
        this.f162513m.pause();
        this.f162519s.post(new m34.y(this));
        m34.a0 a0Var = this.f162511h;
        if (a0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
            int i18 = com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI videoAdPlayerUI = ((com.tencent.mm.plugin.sns.ui.iy) a0Var).f169458a;
            c01.k kVar = videoAdPlayerUI.f167656d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            kVar.a();
            j64.b bVar = com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T6(videoAdPlayerUI).f289121i;
            int i19 = bVar.f297911c;
            long j17 = com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T6(videoAdPlayerUI).f289121i.f297915g;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            bVar.f297911c = i19 + ((int) (android.os.SystemClock.elapsedRealtime() - j17));
            com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.U6(videoAdPlayerUI, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
        }
    }

    public final void g() {
        android.view.View view = (android.view.View) this.f162514n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "showBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "showBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f162520t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "showBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "showBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f162522v) {
            this.f162521u.setVisibility(0);
        }
        if ((this.G == 2 || com.tencent.mm.sdk.platformtools.t8.K0(this.f162518r)) ? false : true) {
            android.view.View view3 = this.f162516p;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "tryShowMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "tryShowMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f162519s;
        java.lang.Runnable runnable = this.F;
        n3Var.removeCallbacks(runnable);
        n3Var.postDelayed(runnable, 3000L);
    }

    @Override // c01.i
    public void g3() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public int getCurrentPosition() {
        return this.f162513m.getCurrentPosition();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public int getDuration() {
        int i17 = this.f162524x;
        return i17 == 0 ? this.f162513m.getDuration() : i17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public double getLastProgresstime() {
        return java.lang.Math.max(this.f162515o, this.f162513m.getLastProgresstime());
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public long getLastSurfaceUpdateTime() {
        return 0L;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    /* renamed from: getVideoPath */
    public java.lang.String getF174598m() {
        return this.f162523w;
    }

    public final void h(boolean z17) {
        this.f162513m.b(this.f162515o);
        this.f162513m.start();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayView", "startplay get duration " + this.f162524x + " lastPlayProgressTime: " + this.f162515o);
        m34.a0 a0Var = this.f162511h;
        if (a0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartPlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
            com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI videoAdPlayerUI = ((com.tencent.mm.plugin.sns.ui.iy) a0Var).f169458a;
            if (z17) {
                com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T6(videoAdPlayerUI).f289121i.f297914f = videoAdPlayerUI.getResources().getConfiguration().orientation == 2 ? 2 : 1;
                j64.b bVar = com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T6(videoAdPlayerUI).f289121i;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                bVar.f297915g = android.os.SystemClock.elapsedRealtime();
                com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T6(videoAdPlayerUI).f289121i.f297913e = 2;
                com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T6(videoAdPlayerUI).f289121i.f297911c = 0;
            }
            int i17 = com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            boolean z19 = videoAdPlayerUI.P;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            if (!z19) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView = videoAdPlayerUI.f167657e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                if (((int) videoPlayView.getLastProgresstime()) == 0) {
                    com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T6(videoAdPlayerUI).f289121i.f297909a++;
                }
            }
            j64.b bVar2 = com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T6(videoAdPlayerUI).f289121i;
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            bVar2.f297915g = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            c01.k kVar = videoAdPlayerUI.f167656d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView2 = videoAdPlayerUI.f167657e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            kVar.c(videoPlayView2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            int i18 = videoAdPlayerUI.L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            if (i18 != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1,1,0,");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                java.lang.String str = videoAdPlayerUI.M;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb6.append(str);
                sb6.append(",");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                java.lang.String str2 = videoAdPlayerUI.N;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb6.append(str2);
                sb6.append(",");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.i1());
                sb6.append(",");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                java.lang.String str3 = videoAdPlayerUI.K;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb6.append(str3);
                sb6.append(",");
                sb6.append(com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.V6(videoAdPlayerUI));
                com.tencent.mm.modelstat.r rVar = new com.tencent.mm.modelstat.r(13227, sb6.toString(), (int) com.tencent.mm.sdk.platformtools.t8.i1());
                gm0.j1.i();
                gm0.j1.n().f273288b.g(rVar);
            }
            com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.U6(videoAdPlayerUI, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartPlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
        }
    }

    public final void i(int i17) {
        this.B = true;
        if (this.f162526z == 0 || this.f162525y == 0) {
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            int i18 = displayMetrics.heightPixels;
            this.f162526z = i18;
            int i19 = displayMetrics.widthPixels;
            this.f162525y = i19;
            if (i18 < i19) {
                this.f162526z = i19;
                this.f162525y = i18;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayView", "getScreen screen_height:" + this.f162526z + " screen_width:" + this.f162525y);
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f162512i.getLayoutParams();
        java.lang.Object obj = this.f162514n;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = obj == null ? null : (android.widget.RelativeLayout.LayoutParams) ((android.view.View) obj).getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if (i17 == 1) {
            int i27 = this.f162525y;
            layoutParams3.width = i27;
            layoutParams3.height = (int) (((i27 * 1.0d) * this.f162508e) / this.f162507d);
            if (this.f162514n != null) {
                layoutParams2.bottomMargin = com.tencent.mm.sdk.platformtools.j.d(getContext(), 0.0f);
            }
        } else {
            int i28 = this.f162525y;
            layoutParams3.height = i28;
            layoutParams3.width = (int) (((i28 * 1.0d) * this.f162507d) / this.f162508e);
            if (this.f162514n != null) {
                layoutParams2.bottomMargin = com.tencent.mm.sdk.platformtools.j.d(getContext(), 0.0f);
            }
        }
        m34.d dVar = this.f162514n;
        if (dVar != null) {
            dVar.g();
            ((android.view.View) this.f162514n).setLayoutParams(layoutParams2);
            if (this.f162514n instanceof com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar) {
                this.f162519s.postDelayed(new m34.z(this), 500L);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayView", "orientation " + i17 + " " + layoutParams3.width + " " + layoutParams3.height);
        ((android.view.View) this.f162513m).setLayoutParams(layoutParams3);
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f162513m;
        if (f4Var instanceof com.tencent.mm.plugin.sight.decode.model.a) {
            ((com.tencent.mm.plugin.sight.decode.model.a) f4Var).e(layoutParams3.width, layoutParams3.height);
        }
        layoutParams.height = layoutParams3.height;
        layoutParams.width = layoutParams3.width;
        this.f162512i.setLayoutParams(layoutParams);
        ((android.view.View) this.f162513m).requestLayout();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean isPlaying() {
        return this.f162513m.isPlaying();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void onDetach() {
        this.f162513m.onDetach();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void pause() {
        f(-1);
    }

    public void setForceScaleFullScreen(boolean z17) {
    }

    public void setIsDownloading(boolean z17) {
        this.A = z17;
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f162513m;
        if (f4Var == null || !(f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoSightView)) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.VideoSightView videoSightView = (com.tencent.mm.pluginsdk.ui.tools.VideoSightView) f4Var;
        if (videoSightView.getController() != null) {
            videoSightView.getController().f162465u = !z17;
        }
    }

    public void setLeftButtonOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f162520t.setOnClickListener(onClickListener);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setLoop(boolean z17) {
        this.f162513m.setLoop(z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setMute(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnInfoCallback(com.tencent.mm.pluginsdk.ui.tools.b4 b4Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnSeekCompleteCallback(com.tencent.mm.pluginsdk.ui.tools.c4 c4Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnSurfaceCallback(com.tencent.mm.pluginsdk.ui.tools.d4 d4Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOneTimeVideoTextureUpdateCallback(com.tencent.mm.pluginsdk.ui.tools.e4 e4Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setPlayProgressCallback(boolean z17) {
        this.f162513m.setPlayProgressCallback(z17);
    }

    public void setRightButtonOnCliclListener(android.view.View.OnClickListener onClickListener) {
        this.f162521u.setOnClickListener(onClickListener);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setThumb(android.graphics.Bitmap bitmap) {
        this.f162513m.setThumb(bitmap);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setVideoCallback(com.tencent.mm.pluginsdk.ui.tools.a4 a4Var) {
        this.f162513m.setVideoCallback(a4Var);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setVideoPath(java.lang.String str) {
        this.f162523w = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayView", "videoPath  %s", str);
        this.f162513m.setVideoPath(this.f162523w);
    }

    public void setVideoPlayViewEvent(m34.a0 a0Var) {
        this.f162511h = a0Var;
    }

    public void setVideoTotalTime(int i17) {
        if (this.f162514n.getVideoTotalTime() != i17) {
            this.f162514n.setVideoTotalTime(i17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean start() {
        h(true);
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void stop() {
        this.f162513m.stop();
    }

    public VideoPlayView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f162507d = com.tencent.mapsdk.internal.km.f50100e;
        this.f162508e = 240;
        this.f162509f = true;
        this.f162513m = null;
        this.f162515o = 0.0d;
        this.f162518r = "";
        this.f162519s = new com.tencent.mm.sdk.platformtools.n3();
        this.f162522v = true;
        this.f162524x = 0;
        this.f162525y = 0;
        this.f162526z = 0;
        this.A = false;
        this.B = false;
        this.C = 0L;
        this.D = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        this.E = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        this.F = new m34.v(this);
        this.G = 0;
        e();
    }
}
