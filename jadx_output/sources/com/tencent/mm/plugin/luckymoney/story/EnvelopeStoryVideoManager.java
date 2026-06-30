package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class EnvelopeStoryVideoManager implements androidx.lifecycle.x {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.Set f145801o = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f145802d;

    /* renamed from: e, reason: collision with root package name */
    public int f145803e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f145804f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f145805g = false;

    /* renamed from: h, reason: collision with root package name */
    public final fp.e f145806h = new fp.e(com.tencent.mm.sdk.platformtools.x2.f193071a);

    /* renamed from: i, reason: collision with root package name */
    public boolean f145807i = false;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f145808m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.story.a1 f145809n;

    public static java.lang.String a(java.lang.String str) {
        return com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView.U1 + "MMVideo_" + str.hashCode() + ".mp4";
    }

    public static com.tencent.mm.sdk.platformtools.o4 b() {
        return com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.f193072b + "_luckymoney_story_video");
    }

    public static boolean c(int i17, java.lang.String str) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_lucky_money_envelope_load_local_video_res_config, true);
        boolean z17 = i17 > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.vfs.w6.j(str) && fj6;
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "[hasLuckyMoneyEnvelopeLocalVideoRes] openConfig ：%s , subTypeID: %s, hasLocalRes: %s", java.lang.Boolean.valueOf(fj6), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public static void g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, dn.k kVar, dn.n nVar) {
        boolean z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "trigger download video: %s, %s, %s", str, str2, str3);
        if (z17) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_close_redenv_story_video_preload_config, 1) == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "can not preload video");
                z18 = false;
            } else {
                z18 = true;
            }
            if (!z18) {
                return;
            }
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_EnvelopeStoryVideoManager";
        oVar.field_mediaId = str;
        oVar.field_fileId = str;
        oVar.M1 = str3;
        int i17 = z17 ? 2 : 1;
        oVar.H1 = i17;
        oVar.field_preloadRatio = 20;
        oVar.f241796p0 = new com.tencent.mm.plugin.luckymoney.story.u0(str3, elapsedRealtime);
        if (kVar != null) {
            oVar.f241787f = kVar;
        } else {
            oVar.f241787f = new com.tencent.mm.plugin.luckymoney.story.k0(str2);
        }
        oVar.Z = 3;
        oVar.field_fullpath = str2;
        oVar.field_filemd5 = str4;
        oVar.G = true;
        oVar.f241815c2 = nVar;
        oVar.field_fileType = 4;
        oVar.field_requestVideoFormat = 1;
        oVar.Y = i17;
        java.util.Set set = f145801o;
        if (z17) {
            if (((java.util.HashSet) set).contains(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EnvelopeStoryVideoManager", "contains preload task: %s", str);
                return;
            } else {
                ((java.util.HashSet) set).add(str);
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(oVar);
                return;
            }
        }
        if (((java.util.HashSet) set).contains(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "need cancel preload task");
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().f(oVar);
    }

    public void d(int i17) {
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = (com.tencent.mm.plugin.luckymoney.story.b1) ((java.util.HashMap) this.f145808m).get(java.lang.Integer.valueOf(i17));
        if (b1Var != null) {
            j(b1Var);
            i(b1Var);
        }
    }

    public final void e(com.tencent.mm.plugin.luckymoney.story.b1 b1Var) {
        if (!b1Var.f145824d) {
            boolean j17 = com.tencent.mm.vfs.w6.j(a(b1Var.f145823c));
            boolean z17 = false;
            boolean z18 = b().getInt(b1Var.f145821a, 0) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "can play local: %s, %s", java.lang.Boolean.valueOf(j17), java.lang.Boolean.valueOf(z18));
            if (j17 && z18) {
                b1Var.f145829i = 1;
                z17 = true;
            } else {
                if (j17) {
                    b1Var.f145829i = 3;
                } else {
                    b1Var.f145829i = 2;
                }
                b().putInt(b1Var.f145821a, 0);
            }
            if (z17) {
                b1Var.f145833m.setLocal(true);
            }
        }
        b1Var.f145835o.bringToFront();
        b1Var.f145833m.start();
        b1Var.f145830j = 0L;
        b1Var.f145831k = 0L;
        b1Var.f145832l.set(1);
        if (!this.f145807i) {
            this.f145806h.b();
            this.f145807i = true;
        }
        b1Var.f145825e = true;
        com.tencent.mm.plugin.luckymoney.story.g1.f145863d++;
        ((java.util.HashSet) com.tencent.mm.plugin.luckymoney.story.g1.f145862c).add(b1Var.f145823c);
    }

    public void f() {
        java.util.Map map = this.f145808m;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.util.HashMap) map).size());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "release video view: %s, %s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        if (this.f145807i) {
            this.f145806h.a();
            this.f145807i = false;
        }
        for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
            com.tencent.mm.plugin.luckymoney.story.b1 b1Var = (com.tencent.mm.plugin.luckymoney.story.b1) entry.getValue();
            if (b1Var.f145827g > 0) {
                b1Var.f145828h = (int) (b1Var.f145828h + ((android.os.SystemClock.elapsedRealtime() / 1000) - b1Var.f145827g));
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19228, b1Var.f145823c, java.lang.Integer.valueOf(b1Var.f145833m.getVideoDurationSec()), 1, java.lang.Integer.valueOf(b1Var.f145829i), java.lang.Integer.valueOf(b1Var.f145833m.getRealPlayDurationSec()), java.lang.Integer.valueOf(b1Var.f145828h), 0, 0);
            if (((com.tencent.mm.plugin.luckymoney.story.b1) entry.getValue()).f145833m.getParent() != null) {
                ((android.view.ViewGroup) ((com.tencent.mm.plugin.luckymoney.story.b1) entry.getValue()).f145833m.getParent()).removeView(((com.tencent.mm.plugin.luckymoney.story.b1) entry.getValue()).f145833m);
                b1Var.f145833m.stop();
            }
        }
        ((java.util.HashMap) map).clear();
        this.f145803e = -1;
    }

    public void h(android.content.Context context, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView, android.widget.ProgressBar progressBar, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, boolean z17, boolean z18, boolean z19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "update position: %s, %s, %s, %s", java.lang.Integer.valueOf(this.f145803e), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z19), str);
        java.util.Map map = this.f145808m;
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = (com.tencent.mm.plugin.luckymoney.story.b1) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i19));
        if (b1Var != null) {
            b1Var.f145826f = z19;
            j(b1Var);
            i(b1Var);
        }
        int i27 = this.f145803e;
        if (i19 == i27) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EnvelopeStoryVideoManager", "skip same position");
            return;
        }
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var2 = (com.tencent.mm.plugin.luckymoney.story.b1) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i27));
        if (b1Var2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "pause previous video");
            if (b1Var2.f145825e) {
                b1Var2.f145831k = b1Var2.f145833m.getCurrPosSec();
                b1Var2.f145833m.e();
            }
        }
        this.f145803e = i19;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "preapre video view: %s", java.lang.Boolean.valueOf(z18));
            java.util.HashMap hashMap = (java.util.HashMap) map;
            com.tencent.mm.plugin.luckymoney.story.b1 b1Var3 = (com.tencent.mm.plugin.luckymoney.story.b1) hashMap.get(java.lang.Integer.valueOf(i19));
            if (b1Var3 != null && b1Var3.f145833m != null) {
                b1Var3.f145826f = z19;
                j(b1Var3);
                i(b1Var3);
                com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.luckymoney.story.n0(this, b1Var3), 200L);
                return;
            }
            com.tencent.mm.plugin.luckymoney.story.b1 b1Var4 = new com.tencent.mm.plugin.luckymoney.story.b1();
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView envelopeStoryVideoView = new com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView(context);
            b1Var4.f145833m = envelopeStoryVideoView;
            envelopeStoryVideoView.setContentDescription(context.getString(com.tencent.mm.R.string.gjy));
            b1Var4.f145823c = str;
            b1Var4.f145822b = java.util.UUID.randomUUID().toString();
            b1Var4.f145835o = imageView;
            b1Var4.f145839s = progressBar;
            b1Var4.f145824d = z18;
            b1Var4.f145826f = z19;
            b1Var4.f145834n = (android.view.ViewGroup) frameLayout.findViewById(com.tencent.mm.R.id.j7j);
            b1Var4.f145836p = (android.widget.ImageView) frameLayout.findViewById(com.tencent.mm.R.id.j7k);
            b1Var4.f145837q = (android.widget.ImageView) frameLayout.findViewById(com.tencent.mm.R.id.j0d);
            b1Var4.f145838r = (android.view.ViewGroup) frameLayout.findViewById(com.tencent.mm.R.id.j0b);
            b1Var4.f145840t = frameLayout;
            b1Var4.f145833m.setIsShowBasicControls(false);
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView envelopeStoryVideoView2 = b1Var4.f145833m;
            envelopeStoryVideoView2.S1 = new com.tencent.mm.plugin.luckymoney.story.o0(this, b1Var4);
            envelopeStoryVideoView2.setIMMVideoViewCallback(new com.tencent.mm.plugin.luckymoney.story.q0(this, b1Var4, i19));
            b1Var4.f145836p.setOnClickListener(new com.tencent.mm.plugin.luckymoney.story.r0(this, b1Var4));
            b1Var4.f145834n.setOnClickListener(new com.tencent.mm.plugin.luckymoney.story.s0(this, b1Var4));
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i18);
            layoutParams.gravity = 17;
            frameLayout.addView(b1Var4.f145833m, 0, layoutParams);
            hashMap.put(java.lang.Integer.valueOf(i19), b1Var4);
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.story.m0(this, b1Var4));
            b1Var4.f145833m.setSessionId(b1Var4.f145822b);
            b1Var4.f145833m.setIOnlineVideoProxy(new com.tencent.mm.plugin.luckymoney.story.z0(b1Var4, this));
            b1Var4.f145833m.setLocalPreDownloadVideo(b1Var4.f145824d);
            b1Var4.f145833m.h(false, b1Var4.f145823c, 0);
            b1Var4.f145821a = b1Var4.f145833m.getMediaId();
            j(b1Var4);
            i(b1Var4);
            e(b1Var4);
        }
    }

    public final void i(com.tencent.mm.plugin.luckymoney.story.b1 b1Var) {
        boolean z17 = b1Var.f145833m.P1;
        if (z17) {
            b1Var.f145837q.setImageResource(com.tencent.mm.R.raw.lucky_money_mute_icon);
        } else {
            b1Var.f145837q.setImageResource(com.tencent.mm.R.raw.lucky_money_unmute_icon);
        }
        b1Var.f145840t.setTag(com.tencent.mm.R.id.ozk, java.lang.Boolean.valueOf(z17));
    }

    public final void j(com.tencent.mm.plugin.luckymoney.story.b1 b1Var) {
        if (b1Var.f145826f || !this.f145805g) {
            b1Var.f145837q.setVisibility(4);
            b1Var.f145833m.setMute(true);
        } else {
            b1Var.f145837q.setVisibility(0);
            b1Var.f145833m.setMute(this.f145804f);
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onUIDestroy() {
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onUIPause() {
        if (this.f145807i) {
            this.f145806h.a();
            this.f145807i = false;
        }
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = (com.tencent.mm.plugin.luckymoney.story.b1) ((java.util.HashMap) this.f145808m).get(java.lang.Integer.valueOf(this.f145803e));
        if (b1Var != null) {
            b1Var.f145833m.e();
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public void onUIResume() {
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = (com.tencent.mm.plugin.luckymoney.story.b1) ((java.util.HashMap) this.f145808m).get(java.lang.Integer.valueOf(this.f145803e));
        if (b1Var != null) {
            b1Var.f145833m.g();
            if (b1Var.f145833m.isPlaying()) {
                this.f145806h.b();
                this.f145807i = true;
            }
        }
    }
}
