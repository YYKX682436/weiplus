package com.tencent.mm.plugin.sns.ad.widget.twistad;

/* loaded from: classes4.dex */
public class TwistCoverView extends android.widget.FrameLayout implements androidx.lifecycle.x {
    public static final /* synthetic */ int C = 0;
    public final q44.a A;
    public e94.v B;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView f163916d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f163917e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f163918f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f163919g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f163920h;

    /* renamed from: i, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.sns.storage.r f163921i;

    /* renamed from: m, reason: collision with root package name */
    public q44.g f163922m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.AnimatorSet f163923n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f163924o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f163925p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f163926q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f163927r;

    /* renamed from: s, reason: collision with root package name */
    public int f163928s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f163929t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f163930u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f163931v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f163932w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f163933x;

    /* renamed from: y, reason: collision with root package name */
    public final android.os.Handler f163934y;

    /* renamed from: z, reason: collision with root package name */
    public float f163935z;

    public TwistCoverView(android.content.Context context) {
        super(context);
        this.f163924o = false;
        this.f163925p = false;
        this.f163926q = false;
        this.f163927r = false;
        this.f163929t = true;
        this.f163930u = false;
        this.f163931v = false;
        this.f163932w = false;
        this.f163933x = false;
        this.f163934y = new e94.r(this);
        this.f163935z = 0.0f;
        this.A = new e94.t(this);
        c(context);
    }

    public static void g(ab4.n0 n0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportGetTwistIdResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (n0Var == null) {
            com.tencent.mars.xlog.Log.e("TwistCoverView_report", "reportGetTwistIdResult, landingPageData==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportGetTwistIdResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        java.lang.String j17 = n0Var.j();
        java.lang.String o17 = n0Var.o();
        int l17 = n0Var.l();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (j17 == null) {
                j17 = "";
            }
            jSONObject.put("snsid", j17);
            if (o17 == null) {
                o17 = "";
            }
            jSONObject.put("uxinfo", o17);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, l17);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("result", i17);
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("timeline_twistad_canvas_get_twist_cardId_result", jSONObject3);
            com.tencent.mars.xlog.Log.i("TwistCoverView_report", "reportGetTwistIdResult, content=" + jSONObject3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("TwistCoverView_report", "reportGetTwistIdResult exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportGetTwistIdResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.f163926q = false;
        this.f163921i = null;
        this.f163920h = null;
        this.f163935z = 0.0f;
        this.f163928s = -1;
        setSensorEnabled(false);
        b();
        this.f163934y.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hide", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (!this.f163925p) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        this.f163925p = false;
        com.tencent.mars.xlog.Log.i("TwistCoverView", "hide");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (this.f163923n != null) {
            this.f163934y.removeMessages(4);
            this.f163923n.removeAllListeners();
            this.f163923n.end();
            this.f163923n.setTarget(null);
            this.f163923n = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(250L);
        ofFloat.addListener(new e94.s(this));
        ofFloat.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cqi, (android.view.ViewGroup) this, true);
        this.f163916d = (com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView) findViewById(com.tencent.mm.R.id.f487479or4);
        this.f163917e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486298ku4);
        this.f163918f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.odh);
        this.f163919g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cuv);
        ca4.m0.y0(this.f163918f, com.tencent.mm.R.dimen.f480604aa3);
        ca4.m0.y0(this.f163919g, com.tencent.mm.R.dimen.f480603aa2);
        setBackgroundColor(android.graphics.Color.parseColor("#CC000000"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (context instanceof androidx.lifecycle.y) {
            ((androidx.lifecycle.y) context).mo133getLifecycle().a(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public final boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        q44.g gVar = this.f163922m;
        boolean z17 = false;
        if (gVar == null) {
            com.tencent.mars.xlog.Log.i("TwistCoverView", "isSensorEnabled, sensorMgr==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return false;
        }
        gVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
        q44.b bVar = gVar.f360119a;
        if (bVar != null) {
            z17 = bVar.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        return z17;
    }

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTwistActionSucc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        e94.v vVar = this.B;
        if (vVar != null && !this.f163924o) {
            fd4.s sVar = (fd4.s) vVar;
            sVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTwist", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness$1");
            fd4.t tVar = sVar.f261335a;
            tVar.f261289f.T.f425132b = true;
            if (tVar.f261292i == null) {
                com.tencent.mars.xlog.Log.e("TwistAdBusiness", "onTwist, mSnsInfo==null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTwist", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness$1");
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("ad_no_click_anim", true);
                com.tencent.mm.plugin.sns.storage.r rVar = tVar.f261292i.getAdXml().adTwistInfo;
                if (rVar != null) {
                    bundle.putBoolean("isSimpleTwistAnim", rVar.f166115o);
                    bundle.putBoolean("isTwistClockwise", rVar.f166112i);
                    if (rVar.f166115o) {
                        ca4.z0.I0(new long[]{0, 80});
                    }
                }
                tVar.r(bundle);
                tVar.l();
                tVar.k(29);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTwist", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness$1");
            }
            this.f163924o = true;
        }
        this.f163932w = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTwistActionSucc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.f163934y.removeMessages(4);
        android.animation.AnimatorSet animatorSet = this.f163923n;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f163923n.pause();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public void h(int i17, boolean z17, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f163920h;
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.e("TwistCoverView_report", "reportTwistActionResult, snsInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
        java.lang.String uxinfo = snsInfo.getUxinfo();
        int i18 = this.f163928s;
        if (android.text.TextUtils.isEmpty(t07)) {
            com.tencent.mars.xlog.Log.e("TwistCoverView_report", "reportTwistActionResult, snsId==null, source=" + i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        if (android.text.TextUtils.isEmpty(t07)) {
            com.tencent.mars.xlog.Log.e("TwistCoverView_report", "reportTwistActionResult, snsId==null, source=" + i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", t07);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (uxinfo == null) {
                uxinfo = "";
            }
            jSONObject.put("uxinfo", uxinfo);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i18);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("result", i17);
            jSONObject2.put("triggerByAcceleration", z17 ? 1 : 0);
            jSONObject2.put("failedMaxDegree", java.lang.Math.round(f17));
            if (!this.f163933x) {
                jSONObject2.put("sensorDisable", 1);
            }
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("timeline_twistad_twist_result", jSONObject3);
            com.tencent.mars.xlog.Log.i("TwistCoverView_report", "reportTwistActionResult, content=" + jSONObject3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("TwistCoverView_report", "reportTwistActionResult exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetTwistAngle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetTwistAngle, sensorMgr==null?");
        sb6.append(this.f163922m == null);
        com.tencent.mars.xlog.Log.i("TwistCoverView", sb6.toString());
        q44.g gVar = this.f163922m;
        if (gVar != null) {
            gVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
            q44.b bVar = gVar.f360119a;
            if (bVar != null) {
                bVar.reset();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
        }
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView twistDegreeView = this.f163916d;
        twistDegreeView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetWithAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        com.tencent.mm.sdk.platformtools.u3.h(new e94.x(twistDegreeView));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetWithAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        this.f163924o = false;
        this.f163935z = 0.0f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetTwistAngle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public final void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.f163934y.removeMessages(4);
        android.animation.AnimatorSet animatorSet = this.f163923n;
        if (animatorSet != null) {
            animatorSet.isPaused();
        }
        android.animation.AnimatorSet animatorSet2 = this.f163923n;
        if (animatorSet2 != null && !this.f163927r) {
            if (animatorSet2.isPaused()) {
                this.f163923n.resume();
            } else {
                k();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public final void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.f163934y.removeMessages(4);
        android.animation.AnimatorSet animatorSet = this.f163923n;
        if (animatorSet != null && !animatorSet.isRunning()) {
            this.f163923n.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("TwistCoverView", "onDetachedFromWindow");
        if (this.f163931v && !this.f163932w) {
            h(2, false, this.f163935z);
        }
        a();
        this.f163929t = true;
        this.f163930u = false;
        this.f163932w = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        super.onStartTemporaryDetach();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onUIPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (this.f163921i == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        com.tencent.mars.xlog.Log.i("TwistCoverView", "onUIPause");
        this.f163927r = true;
        setSensorEnabled(false);
        if (this.f163925p) {
            f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public void onUIResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (this.f163921i == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        com.tencent.mars.xlog.Log.i("TwistCoverView", "onUIResume, isTwistActionCalled=" + this.f163924o);
        this.f163927r = false;
        if (this.f163924o && getVisibility() == 0) {
            j();
        }
        i();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public void setSensorEnabled(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (this.f163921i == null && z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        if ((this.f163926q || this.f163927r) && z17) {
            com.tencent.mars.xlog.Log.e("TwistCoverView", "setSensorEnabled to true when isUIPaused=" + this.f163927r + ", isPlayerPaused=" + this.f163926q);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSensorEnabled, enabled=");
        sb6.append(z17);
        sb6.append(", sensorMgr==null?");
        sb6.append(this.f163922m == null);
        com.tencent.mars.xlog.Log.i("TwistCoverView", sb6.toString());
        q44.g gVar = this.f163922m;
        if (gVar != null) {
            gVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
            q44.b bVar = gVar.f360119a;
            if (bVar != null) {
                bVar.setEnabled(z17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public void setTwistActionListener(e94.v vVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTwistActionListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.B = vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTwistActionListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public TwistCoverView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163924o = false;
        this.f163925p = false;
        this.f163926q = false;
        this.f163927r = false;
        this.f163929t = true;
        this.f163930u = false;
        this.f163931v = false;
        this.f163932w = false;
        this.f163933x = false;
        this.f163934y = new e94.r(this);
        this.f163935z = 0.0f;
        this.A = new e94.t(this);
        c(context);
    }
}
