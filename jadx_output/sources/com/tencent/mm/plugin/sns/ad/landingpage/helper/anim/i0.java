package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class i0 {
    public static final kk.j W = new kk.l(8);
    public static final a84.y X = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.v();
    public int A;
    public com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 C;
    public com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3 H;
    public com.tencent.mm.ui.widget.dialog.f4 K;
    public android.animation.AnimatorSet L;
    public android.animation.ObjectAnimator M;
    public c54.j T;

    /* renamed from: a */
    public final com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f163101a;

    /* renamed from: b */
    public com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView f163102b;

    /* renamed from: c */
    public com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView f163103c;

    /* renamed from: f */
    public android.view.View f163106f;

    /* renamed from: g */
    public com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 f163107g;

    /* renamed from: i */
    public com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView f163109i;

    /* renamed from: l */
    public com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView f163112l;

    /* renamed from: n */
    public android.graphics.Bitmap f163114n;

    /* renamed from: p */
    public android.view.View f163116p;

    /* renamed from: q */
    public android.view.View f163117q;

    /* renamed from: r */
    public android.view.View f163118r;

    /* renamed from: s */
    public android.view.View f163119s;

    /* renamed from: v */
    public s34.x f163122v;

    /* renamed from: w */
    public boolean f163123w;

    /* renamed from: x */
    public boolean f163124x;

    /* renamed from: y */
    public boolean f163125y;

    /* renamed from: z */
    public o44.d f163126z;

    /* renamed from: d */
    public boolean f163104d = false;

    /* renamed from: e */
    public boolean f163105e = false;

    /* renamed from: h */
    public volatile com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h0 f163108h = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h0();

    /* renamed from: j */
    public boolean f163110j = false;

    /* renamed from: k */
    public boolean f163111k = false;

    /* renamed from: m */
    public boolean f163113m = false;

    /* renamed from: o */
    public boolean f163115o = false;

    /* renamed from: t */
    public android.widget.ImageView f163120t = null;

    /* renamed from: u */
    public boolean f163121u = false;
    public boolean B = false;
    public boolean D = false;
    public int E = -1;
    public boolean F = false;
    public boolean G = false;
    public boolean I = false;

    /* renamed from: J */
    public r45.d53 f163100J = null;
    public com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView N = null;
    public com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView O = null;
    public boolean P = false;
    public volatile long Q = 0;
    public final com.tencent.mm.sdk.event.IListener R = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdEggCardEncoreEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$18
        {
            this.__eventId = -2051158360;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.SnsAdEggCardEncoreEvent snsAdEggCardEncoreEvent) {
            org.json.JSONObject V;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$18");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$18");
            com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "callback SnsAdEggCardEncoreEvent");
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.this;
            i0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportShakeActionResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "reportShakeActionResult, result=1");
            try {
                ab4.n0 A7 = i0Var.f163101a.A7();
                java.lang.String j17 = A7.j();
                java.lang.String o17 = A7.o();
                int l17 = A7.l();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String str = "";
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
                jSONObject2.put("result", 1);
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var = i0Var.f163107g;
                if (b0Var != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentShowCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    ab4.d0 d0Var = b0Var.f162759x;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentShowCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    if (d0Var != null) {
                        java.lang.String str2 = d0Var.A;
                        if (str2 != null) {
                            str = str2;
                        }
                        jSONObject2.put("twistCardId", str);
                    }
                    com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var2 = i0Var.f163107g;
                    b0Var2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHBCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent = b0Var2.C;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHBCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    if (adLandingHBCardComponent != null && (V = adLandingHBCardComponent.V()) != null) {
                        jSONObject2.put("hbCard", V);
                    }
                }
                jSONObject.put("extInfo", jSONObject2);
                ca4.m0.a("canvas_shakead_encore_shake_result", jSONObject.toString());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "reportShakeActionResult, exp=" + e17.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportShakeActionResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            i0Var.J();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$18");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$18");
            return false;
        }
    };
    public final android.os.Handler S = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.s(this, android.os.Looper.getMainLooper());
    public boolean U = false;
    public final c54.h V = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.u(this);

    public i0(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f163101a = snsAdNativeLandingPagesUI;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI a(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = i0Var.f163101a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return snsAdNativeLandingPagesUI;
    }

    public static /* synthetic */ android.view.View b(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        android.view.View view = i0Var.f163118r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return view;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 c(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var = i0Var.f163107g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return b0Var;
    }

    public static /* synthetic */ android.os.Handler d(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        android.os.Handler handler = i0Var.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return handler;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h0 e(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h0 h0Var = i0Var.f163108h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return h0Var;
    }

    public static /* synthetic */ android.view.View f(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        android.view.View view = i0Var.f163106f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return view;
    }

    public static /* synthetic */ android.view.View g(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1302", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        i0Var.f163106f = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1302", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return view;
    }

    public static /* synthetic */ android.view.View h(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        android.view.View view = i0Var.f163117q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return view;
    }

    public static /* synthetic */ boolean i(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        boolean z17 = i0Var.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return z17;
    }

    public static void j(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        i0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyContentShow", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (!i0Var.F && (snsAdNativeLandingPagesUI = i0Var.f163101a) != null) {
            com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "notifyContentShow");
            java.lang.String i17 = snsAdNativeLandingPagesUI.A7().i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.SnsAdEggCanvasEventHelper");
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().publishEggCanvasEvent(1, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.SnsAdEggCanvasEventHelper");
            i0Var.F = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyContentShow", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    public static void k(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        i0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyPickCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = i0Var.f163101a;
        if (snsAdNativeLandingPagesUI != null) {
            com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "notifyPickCard");
            java.lang.String i17 = snsAdNativeLandingPagesUI.A7().i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.SnsAdEggCanvasEventHelper");
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().publishEggCanvasEvent(2, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.SnsAdEggCanvasEventHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyPickCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    public static /* synthetic */ boolean l(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        boolean z17 = i0Var.P;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return z17;
    }

    public static /* synthetic */ android.view.View m(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        android.view.View view = i0Var.f163119s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return view;
    }

    public static void n(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var, android.animation.Animator.AnimatorListener animatorListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        i0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shakeCardViewForTip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        android.view.View view = i0Var.f163106f;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shakeCardViewForTip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        } else {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "rotation", 0.0f, -1.0f);
            ofFloat.setDuration(250L);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(i0Var.f163106f, "rotation", -1.0f, 1.0f);
            ofFloat2.setDuration(250L);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(i0Var.f163106f, "rotation", 1.0f, -1.0f);
            ofFloat3.setDuration(250L);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(i0Var.f163106f, "rotation", -1.0f, 1.0f);
            ofFloat4.setDuration(250L);
            android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(i0Var.f163106f, "rotation", 1.0f, -1.0f);
            ofFloat5.setDuration(250L);
            android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(i0Var.f163106f, "rotation", -1.0f, 0.0f);
            ofFloat6.setDuration(250L);
            ofFloat6.addListener(animatorListener);
            i0Var.M = ofFloat6;
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            i0Var.L = animatorSet;
            animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
            animatorSet.start();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shakeCardViewForTip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    public static /* synthetic */ int o(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        int i17 = i0Var.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return i17;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 p(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 q3Var = i0Var.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return q3Var;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3 q(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3 u3Var = i0Var.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return u3Var;
    }

    public static /* synthetic */ boolean r(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        boolean z17 = i0Var.f163125y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return z17;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView s(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView shakeCardAnimView = i0Var.f163109i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return shakeCardAnimView;
    }

    public static com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 u(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findHalfEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (a2Var instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2) {
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var = (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2) a2Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findHalfEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return f2Var;
        }
        if (a2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) {
            java.util.Iterator it = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) a2Var).O().iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 u17 = u((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next());
                if (u17 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findHalfEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    return u17;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findHalfEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return null;
    }

    public final void A(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initRandomPickCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (this.C == null) {
            java.util.Iterator it = contentFragment.r0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findRandomPickCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 a17 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3.f162921x.a(a2Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findRandomPickCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
                if (a17 != null) {
                    this.C = a17;
                    R();
                    break;
                }
            }
        }
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 q3Var = this.C;
        if (q3Var != null) {
            int i17 = this.E;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickIndex", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
            q3Var.f162926w = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickIndex", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 q3Var2 = this.C;
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h hVar = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h(this);
            q3Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
            com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView = q3Var2.f162923t;
            if (adLandingPageRandomPickCardView != null) {
                adLandingPageRandomPickCardView.setOnItemClickListener(hVar);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initRandomPickCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    public void B(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initRandomPickCardTitleComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (this.H == null && contentFragment != null) {
            java.util.Iterator it = contentFragment.r0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findRandomPickCardTitleComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3 a17 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3.f162957w.a(a2Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findRandomPickCardTitleComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
                if (a17 != null) {
                    this.H = a17;
                    break;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initRandomPickCardTitleComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    public final boolean C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAllRandomCardPicked", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 q3Var = this.C;
        if (q3Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAllRandomCardPicked", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        q3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAllPicked", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView = q3Var.f162923t;
        boolean i17 = adLandingPageRandomPickCardView != null ? adLandingPageRandomPickCardView.i() : false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAllPicked", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAllRandomCardPicked", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return i17;
    }

    public final boolean D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExptShowPickToast", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        int u07 = ca4.m0.u0(e42.d0.clicfg_ad_enable_random_pick_toast, 1);
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "isExptShowPickToast, value=" + u07);
        boolean z17 = u07 > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExptShowPickToast", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return z17;
    }

    public boolean E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFromPreviewMode", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        boolean z17 = this.A == 26;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFromPreviewMode", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return z17;
    }

    public boolean F() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFromShareMsg", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        boolean z17 = this.A == 5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFromShareMsg", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return z17;
    }

    public boolean G(java.lang.String str) {
        java.lang.String k17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "loadSpriteImage:" + str);
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        try {
            k17 = za4.t0.k(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "loadLongSpriteImage, exp=" + th6.toString());
        }
        if (!com.tencent.mm.vfs.w6.j(k17)) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "loadLongSpriteImage, !fileExists");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDownloadSpriteImg", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            za4.t0.b("adId", str, true, 0, 0, new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.p(this, str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDownloadSpriteImg", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 19);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(k17, null);
        if (J2 == null) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "loadLongSpriteImage, bitmap==null");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 19);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        this.f163114n = J2;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 18);
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "loadLongSpriteImage succ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return true;
    }

    public void H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBeforeExitActivityAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "onBeforeExitActivityAnim");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 q3Var = this.C;
        if (q3Var != null && q3Var.q() != null) {
            android.view.View q17 = this.C.q();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(q17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "onBeforeExitActivityAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            q17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(q17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "onBeforeExitActivityAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var = this.f163107g;
        if (b0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideRandomPickCardTipView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView adLandingPagePickCardTipView = b0Var.f162760y;
            if (adLandingPagePickCardTipView != null) {
                adLandingPagePickCardTipView.c();
                b0Var.f162760y.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideRandomPickCardTipView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        }
        L(false, false);
        S(this.G);
        x();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBeforeExitActivityAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    public boolean I(android.animation.Animator.AnimatorListener animatorListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onExitAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if ((this.f163115o || this.I) && !this.f163125y) {
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f163101a;
            snsAdNativeLandingPagesUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            android.widget.FrameLayout frameLayout = snsAdNativeLandingPagesUI.L1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (frameLayout != null) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(frameLayout, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(400L);
                ofFloat.start();
                ofFloat.addListener(animatorListener);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onExitAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onExitAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return false;
    }

    public void J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("repeatReqEggCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (this.f163107g != null) {
            com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "reReqEggCard");
            this.f163107g.i0(false);
            this.S.removeCallbacksAndMessages(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endShakeCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            android.animation.ObjectAnimator objectAnimator = this.M;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
            }
            android.animation.AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.end();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endShakeCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            this.f163108h = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h0();
            K();
            this.f163107g.d0();
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var = this.f163107g;
            b0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideRandomPickCardTipView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView adLandingPagePickCardTipView = b0Var.f162760y;
            if (adLandingPagePickCardTipView != null) {
                adLandingPagePickCardTipView.c();
                b0Var.f162760y.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideRandomPickCardTipView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            L(false, true);
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3 u3Var = this.H;
            if (u3Var != null) {
                u3Var.S(false, true);
            }
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 q3Var = this.C;
            if (q3Var != null) {
                q3Var.V(false, true);
            }
            this.f163107g.l0(false, true, -1);
            x();
            android.view.View S = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0.S(this.f163107g.Z());
            if (S != null) {
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var2 = this.f163107g;
                b0Var2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideCurrentComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = b0Var2.f162758w;
                if (a2Var != null) {
                    a2Var.M();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideCurrentComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                this.f163107g.c0();
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(S, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.addListener(new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.o(this));
                ofFloat.start();
            } else {
                com.tencent.mars.xlog.Log.w("AdLandingPageEggCardHelper", "reReqEggCard, findAnimCardView==null");
            }
        } else {
            com.tencent.mars.xlog.Log.w("AdLandingPageEggCardHelper", "reReqEggCard, mEggCardComponent==null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("repeatReqEggCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reqEggCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        try {
            this.P = true;
            int l17 = this.f163101a.A7().l();
            java.lang.String o17 = this.f163101a.A7().o();
            java.lang.String str = o17 == null ? "" : o17;
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f163101a;
            snsAdNativeLandingPagesUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRawSnsId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            java.lang.String str2 = snsAdNativeLandingPagesUI.Q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRawSnsId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            java.lang.String str3 = str2 == null ? "" : str2;
            java.lang.String e17 = this.f163101a.A7().e();
            java.lang.String str4 = e17 == null ? "" : e17;
            java.lang.String i17 = this.f163101a.A7().i();
            java.lang.String str5 = i17 == null ? "" : i17;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, 1);
            java.lang.String str6 = str5;
            java.lang.String str7 = str3;
            java.lang.String str8 = str4;
            this.Q = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getTwistAdCard(str, str7, l17, str8, str6, "", new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.n(this, str5, java.lang.System.currentTimeMillis(), l17));
            com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "start reqEggCardId, source=" + l17 + ", reqId=" + this.Q + ", rawSnsId=" + str7 + ", canvasId=" + str8 + ", pageId=" + str6 + ", uxInfo=" + str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "reqEggCardId, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reqEggCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    public void L(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFloatJumpCompVisible", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "setFloatJumpCompVisible, visible=" + z17 + ", withAnim=" + z18);
        try {
            snsAdNativeLandingPagesUI = this.f163101a;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "setFloatJumpCompVisible exp=" + th6.toString());
        }
        if (snsAdNativeLandingPagesUI == null) {
            com.tencent.mars.xlog.Log.w("AdLandingPageEggCardHelper", "setFloatJumpCompVisible, mLandingPagesUI==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFloatJumpCompVisible", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFloatJumpComHelper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper floatJumpCompHelper = snsAdNativeLandingPagesUI.f166730n3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFloatJumpComHelper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (floatJumpCompHelper != null) {
            floatJumpCompHelper.e((int) za4.z0.n(34.0d, 375));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = floatJumpCompHelper.f163152e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
            if (a2Var != null) {
                if (a2Var instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t0) {
                    if (z17) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnableShow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                        ((com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t0) a2Var).F = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnableShow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnableShow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                        ((com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t0) a2Var).F = false;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnableShow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                    }
                }
                android.view.View q17 = a2Var.q();
                if (q17 == null) {
                    com.tencent.mars.xlog.Log.w("AdLandingPageEggCardHelper", "setFloatJumpCompVisible, view==null");
                } else if (z17) {
                    if (q17.getVisibility() == 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFloatJumpCompVisible", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        return;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(q17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "setFloatJumpCompVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    q17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(q17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "setFloatJumpCompVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (z18) {
                        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(q17, "alpha", 0.0f, 1.0f);
                        ofFloat.setDuration(400L);
                        ofFloat.start();
                    }
                } else {
                    if (q17.getVisibility() != 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFloatJumpCompVisible", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        return;
                    }
                    if (z18) {
                        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(q17, "alpha", 1.0f, 0.0f);
                        ofFloat2.addListener(new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.t(this, q17));
                        ofFloat2.setDuration(400L);
                        ofFloat2.start();
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(q17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "setFloatJumpCompVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        q17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(q17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "setFloatJumpCompVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.w("AdLandingPageEggCardHelper", "setFloatJumpCompVisible, comp==null");
            }
        } else {
            com.tencent.mars.xlog.Log.w("AdLandingPageEggCardHelper", "setFloatJumpCompVisible, FloatJumpCompHelper==null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFloatJumpCompVisible", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showUnSupportRandomPickInPreviewMode", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        try {
            com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "showUnSupportRandomPickInPreviewMode");
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f163101a;
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(snsAdNativeLandingPagesUI);
            e4Var.f211776c = snsAdNativeLandingPagesUI.getString(com.tencent.mm.R.string.m59);
            e4Var.c();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "showUnSupportRandomPickInPreviewMode, exp=" + e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showUnSupportRandomPickInPreviewMode", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:38|39|40|(12:44|45|(1:47)(1:62)|48|49|50|(1:52)|53|(1:55)|56|57|58)|63|45|(0)(0)|48|49|50|(0)|53|(0)|56|57|58) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x026b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x026c, code lost:
    
        ca4.q.c("FlyingFlipAnimView", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c7 A[Catch: all -> 0x01d1, TryCatch #0 {all -> 0x01d1, blocks: (B:40:0x0169, B:44:0x0199, B:45:0x01be, B:47:0x01c7, B:62:0x01cb, B:63:0x01a6), top: B:39:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ec A[Catch: all -> 0x026b, TryCatch #1 {all -> 0x026b, blocks: (B:50:0x01e3, B:52:0x01ec, B:53:0x01ef, B:55:0x01f3, B:56:0x01f6), top: B:49:0x01e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f3 A[Catch: all -> 0x026b, TryCatch #1 {all -> 0x026b, blocks: (B:50:0x01e3, B:52:0x01ec, B:53:0x01ef, B:55:0x01f3, B:56:0x01f6), top: B:49:0x01e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb A[Catch: all -> 0x01d1, TRY_LEAVE, TryCatch #0 {all -> 0x01d1, blocks: (B:40:0x0169, B:44:0x0199, B:45:0x01be, B:47:0x01c7, B:62:0x01cb, B:63:0x01a6), top: B:39:0x0169 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.N(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment, boolean):boolean");
    }

    public final boolean O(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryPlayHugeDiskAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h0 h0Var = this.f163108h;
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "tryPlayHugeDiskAnimation, cardId=" + h0Var.f163097a + ", isFromRepeatPick=" + z17 + ", isPreviewMode=" + E());
        if (this.N == null) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayHugeDiskAnimation, HugeDiskCardView==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayHugeDiskAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        z(contentFragment);
        A(contentFragment);
        if (this.f163107g == null) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "mEggCardComponent==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayHugeDiskAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        if (!android.text.TextUtils.isEmpty(h0Var.f163097a) || z17 || E()) {
            com.tencent.mars.xlog.Log.w("AdLandingPageEggCardHelper", "tryPlayHugeDiskAnimation, skip reqEggCardId, cardInfo=" + h0Var);
        } else {
            com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "tryPlayHugeDiskAnimation, reqEggCardId");
            K();
        }
        if (this.f163101a.getF65848t()) {
            this.f163101a.getSwipeBackLayout().setEnableGesture(false);
            this.f163101a.getSwipeBackLayout().d(true);
        }
        if (this.f163125y) {
            android.view.View q17 = this.f163107g.q();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(q17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "tryPlayHugeDiskAnimation", "(Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            q17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(q17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "tryPlayHugeDiskAnimation", "(Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.N.setVisibility(0);
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 q3Var = this.C;
        if (q3Var != null) {
            q3Var.V(false, false);
        }
        this.N.setOnCardAnimListener(new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.g(this, z17));
        android.util.Pair b07 = this.f163107g.b0();
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView twistRoateCardsView = this.N;
        int intValue = ((java.lang.Integer) b07.first).intValue();
        int intValue2 = ((java.lang.Integer) b07.second).intValue();
        s34.r rVar = this.f163122v.hugeDiskAnimInfo;
        twistRoateCardsView.b(intValue, intValue2, true, rVar.cardImageUrl, rVar.f402744a);
        this.N.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayHugeDiskAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return true;
    }

    public final boolean P(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryPlayShakeAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "tryPlayShakeAdAnimation, isFromEncoreShake=" + z17);
        if (i0Var.f163109i == null) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayShakeAdAnimation, ShakeAdCardView==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayShakeAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        z(contentFragment);
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var = i0Var.f163107g;
        if (b0Var == null) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayShakeAdAnimation, mEggCardComponent==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayShakeAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        b0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDropCardAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        s34.p pVar = b0Var.f162754s.dropCardAnimInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDropCardAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (pVar == null && i0Var.f163122v.dropCardAnimInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayShakeAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        s34.x xVar = i0Var.f163122v;
        if (xVar.dropCardAnimInfo == null) {
            xVar.dropCardAnimInfo = pVar;
        }
        if (android.text.TextUtils.isEmpty(i0Var.f163108h.f163097a) && !z17) {
            K();
        }
        if (i0Var.f163101a.getF65848t()) {
            i0Var.f163101a.getSwipeBackLayout().setEnableGesture(false);
            i0Var.f163101a.getSwipeBackLayout().d(true);
        }
        if (z17) {
            str = "tryPlayShakeAdAnimation";
            str2 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper";
            i0Var.f163109i.setVisibility(0);
            com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView shakeCardAnimView = i0Var.f163109i;
            shakeCardAnimView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "resetAnim");
            if (shakeCardAnimView.f163826i) {
                com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView gLCardAnimView = shakeCardAnimView.f163825h;
                gLCardAnimView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                int i18 = 0;
                while (true) {
                    java.util.ArrayList arrayList = gLCardAnimView.f163817w;
                    if (i18 >= arrayList.size()) {
                        break;
                    }
                    t84.c cVar = (t84.c) arrayList.get(i18);
                    cVar.j(1.0f);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                    cVar.B = -0.0f;
                    cVar.c();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRotationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                    cVar.C = 0.0f;
                    cVar.c();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRotationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                    cVar.f416442v = 0.0f;
                    cVar.c();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                    cVar.f416443w = 0.0f;
                    cVar.c();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScaleX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                    cVar.f416446z = 1.0f;
                    cVar.c();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScaleX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScaleY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                    cVar.A = 1.0f;
                    cVar.c();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScaleY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                    i18++;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            } else {
                com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView cardAnimView = shakeCardAnimView.f163824g;
                cardAnimView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                int i19 = 0;
                while (true) {
                    java.util.ArrayList arrayList2 = cardAnimView.f163807m;
                    if (i19 >= arrayList2.size()) {
                        break;
                    }
                    android.view.View view = (android.view.View) arrayList2.get(i19);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList3.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "resetAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "resetAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setRotation(0.0f);
                    view.setRotationY(0.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    i19++;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            i0Var.f163109i.e();
        } else {
            i0Var.f163109i.setVisibility(0);
            com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView shakeCardAnimView2 = i0Var.f163109i;
            s34.p pVar2 = i0Var.f163122v.dropCardAnimInfo;
            shakeCardAnimView2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            if (pVar2 == null) {
                com.tencent.mars.xlog.Log.e("ShakeCardAnimView", "initData, ShakeCardInfo==null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
                str = "tryPlayShakeAdAnimation";
                str2 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper";
            } else {
                com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "initData");
                shakeCardAnimView2.f163823f = pVar2;
                str = "tryPlayShakeAdAnimation";
                if (shakeCardAnimView2.f163826i) {
                    com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView gLCardAnimView2 = shakeCardAnimView2.f163825h;
                    gLCardAnimView2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                    java.util.ArrayList arrayList4 = pVar2.f402730a;
                    if (arrayList4 != null) {
                        str2 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper";
                        if (arrayList4.size() == 5) {
                            java.util.ArrayList arrayList5 = pVar2.f402730a;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reOrderCardItemData", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            try {
                                arrayList6.add((s34.o) arrayList5.get(3));
                                arrayList6.add((s34.o) arrayList5.get(1));
                                arrayList6.add((s34.o) arrayList5.get(0));
                                arrayList6.add((s34.o) arrayList5.get(2));
                                arrayList6.add((s34.o) arrayList5.get(4));
                            } catch (java.lang.Exception unused) {
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reOrderCardItemData", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCardImg", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                            int a17 = i65.a.a(gLCardAnimView2.f163811q, 4.0f);
                            int i27 = 0;
                            while (i27 < 5) {
                                t84.c cVar2 = (t84.c) gLCardAnimView2.f163817w.get(i27);
                                java.util.ArrayList arrayList7 = arrayList6;
                                s34.o oVar = (s34.o) arrayList6.get(i27);
                                if (!android.text.TextUtils.isEmpty(oVar.f402721b)) {
                                    try {
                                        cVar2.f(t84.i.a(gLCardAnimView2.f163812r, gLCardAnimView2.f163813s, android.graphics.Color.parseColor(oVar.f402721b), a17));
                                    } catch (java.lang.Throwable th6) {
                                        com.tencent.mars.xlog.Log.e("GLCardAnimView", "loadCardImg err=" + th6.toString() + ", value=" + oVar.f402721b);
                                    }
                                }
                                if (!android.text.TextUtils.isEmpty(oVar.f402720a)) {
                                    java.lang.String str3 = oVar.f402720a;
                                    float f17 = a17;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                                    if (android.text.TextUtils.isEmpty(str3)) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                                    } else {
                                        cVar2.hashCode();
                                        i17 = a17;
                                        za4.t0.c(str3, false, 1, 0, new a84.w(cVar2, str3, f17));
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                                        i27++;
                                        arrayList6 = arrayList7;
                                        a17 = i17;
                                    }
                                }
                                i17 = a17;
                                i27++;
                                arrayList6 = arrayList7;
                                a17 = i17;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCardImg", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                        }
                    } else {
                        str2 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper";
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initData, cardItem.size=");
                    java.util.ArrayList arrayList8 = pVar2.f402730a;
                    sb6.append(arrayList8 == null ? 0 : arrayList8.size());
                    com.tencent.mars.xlog.Log.e("GLCardAnimView", sb6.toString());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                } else {
                    str2 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper";
                    com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView cardAnimView2 = shakeCardAnimView2.f163824g;
                    cardAnimView2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                    java.util.ArrayList arrayList9 = pVar2.f402730a;
                    if (arrayList9 == null || arrayList9.size() != 5) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("initData, cardItem.size=");
                        java.util.ArrayList arrayList10 = pVar2.f402730a;
                        sb7.append(arrayList10 == null ? 0 : arrayList10.size());
                        com.tencent.mars.xlog.Log.e("ShakeCardAnimView", sb7.toString());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                    } else {
                        java.util.ArrayList arrayList11 = pVar2.f402730a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reOrderCardItemData", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                        java.util.ArrayList arrayList12 = new java.util.ArrayList();
                        try {
                            arrayList12.add((s34.o) arrayList11.get(3));
                            arrayList12.add((s34.o) arrayList11.get(1));
                            arrayList12.add((s34.o) arrayList11.get(0));
                            arrayList12.add((s34.o) arrayList11.get(2));
                            arrayList12.add((s34.o) arrayList11.get(4));
                        } catch (java.lang.Exception unused2) {
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reOrderCardItemData", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCardImg", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                        for (int i28 = 0; i28 < 5; i28++) {
                            android.widget.ImageView imageView = (android.widget.ImageView) cardAnimView2.f163807m.get(i28);
                            s34.o oVar2 = (s34.o) arrayList12.get(i28);
                            if (!android.text.TextUtils.isEmpty(oVar2.f402721b)) {
                                try {
                                    imageView.setImageDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor(oVar2.f402721b)));
                                } catch (java.lang.Exception e17) {
                                    com.tencent.mars.xlog.Log.e("ShakeCardAnimView", "loadCardImg err=" + e17.toString() + ", value=" + oVar2.f402721b);
                                }
                            }
                            if (!android.text.TextUtils.isEmpty(oVar2.f402720a)) {
                                a84.z.h(oVar2.f402720a, imageView);
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCardImg", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                    }
                }
                s34.p pVar3 = shakeCardAnimView2.f163823f;
                shakeCardAnimView2.c(pVar3.transitionAnimationUrl, pVar3.f402731b);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            }
            i0Var = this;
            i0Var.f163109i.f();
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.d0 d0Var = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.d0(i0Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(d0Var, 1300L, false);
        }
        i0Var.f163109i.setOnCardAnimListener(new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.e0(i0Var, z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
        return true;
    }

    public final boolean Q(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryPlayTwistAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        int i17 = 0;
        if (this.f163102b == null) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayTwistAdAnimation, TwistAdCardView==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayTwistAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        z(contentFragment);
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var = this.f163107g;
        if (b0Var == null) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "mEggCardComponent==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayTwistAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTwistCardAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        s34.w wVar = b0Var.f162754s.twistCardAnimInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTwistCardAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (android.text.TextUtils.isEmpty(this.f163122v.twistCardAnimInfo.cardImageUrl) && wVar != null) {
            s34.w wVar2 = this.f163122v.twistCardAnimInfo;
            wVar2.cardImageUrl = wVar.cardImageUrl;
            wVar2.f402801b = wVar.f402801b;
        }
        java.lang.String str = this.f163108h.f163097a;
        if (!android.text.TextUtils.isEmpty(str) || z17) {
            com.tencent.mars.xlog.Log.w("AdLandingPageEggCardHelper", "skip reqTwistCardId, twistCardId=" + str);
        } else {
            K();
        }
        if (this.f163101a.getF65848t()) {
            this.f163101a.getSwipeBackLayout().setEnableGesture(false);
            this.f163101a.getSwipeBackLayout().d(true);
        }
        if (this.f163125y) {
            android.view.View q17 = this.f163107g.q();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(q17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "tryPlayTwistAdAnimation", "(Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            q17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(q17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "tryPlayTwistAdAnimation", "(Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f163102b.setVisibility(0);
        this.f163102b.setOnCardAnimListener(new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.f0(this, z17));
        android.util.Pair b07 = this.f163107g.b0();
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView twistRoateCardsView = this.f163102b;
        int intValue = ((java.lang.Integer) b07.first).intValue();
        int intValue2 = ((java.lang.Integer) b07.second).intValue();
        s34.w wVar3 = this.f163122v.twistCardAnimInfo;
        boolean z18 = wVar3.f402800a;
        java.lang.String str2 = wVar3.cardImageUrl;
        java.lang.String str3 = wVar3.f402801b;
        twistRoateCardsView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        if (!android.text.TextUtils.isEmpty(str3)) {
            try {
                i17 = android.graphics.Color.parseColor(str3);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("TwistRoateCardsView", "parseColor exp=" + e17.toString());
            }
        }
        twistRoateCardsView.b(intValue, intValue2, z18, str2, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        this.f163102b.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayTwistAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x06e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean R() {
        /*
            Method dump skipped, instructions count: 1779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.R():boolean");
    }

    public final void S(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateStatusBarIcon", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (this.f163115o || this.I) {
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f163101a;
            snsAdNativeLandingPagesUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCanvasFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            boolean z18 = snsAdNativeLandingPagesUI.U2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCanvasFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (z18) {
                com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "updateStatusBarIcon, isDark=" + z17);
                snsAdNativeLandingPagesUI.getController().O0(z17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateStatusBarIcon", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    public boolean t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkStartShakeSimpleAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        boolean z17 = true;
        if (this.f163111k) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSimpleShakeAdAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            y();
            com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView shakeCardAnimView = this.f163109i;
            if (shakeCardAnimView == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSimpleShakeAdAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                z17 = false;
            } else {
                shakeCardAnimView.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.j(this));
                this.f163109i.setVisibility(0);
                com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView shakeCardAnimView2 = this.f163109i;
                s34.t tVar = this.f163122v.pagThemeAnimInfo;
                shakeCardAnimView2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
                if (tVar == null) {
                    com.tencent.mars.xlog.Log.e("ShakeCardAnimView", "initData, pagThemeAnimInfo==null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
                } else {
                    com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "initData, simple anim");
                    s34.s sVar = tVar.pagInfo;
                    shakeCardAnimView2.c(sVar.pagUrl, sVar.f402756a);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
                }
                this.f163109i.f();
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.m mVar = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.m(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(mVar, 1000L, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSimpleShakeAdAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStartShakeSimpleAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return z17;
        }
        if (!this.f163113m) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStartShakeSimpleAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryPlayLongPressAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (this.f163112l == null || this.f163114n == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayLongPressAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "tryPlayLongPressAnim");
            this.f163112l.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.w(this));
            s34.u uVar = this.f163122v.randomSpriteAnimInfo;
            this.f163112l.setVisibility(0);
            this.f163112l.j(this.f163114n, uVar.f402782a, uVar.f402784c, uVar.f402783b);
            com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView snsAdSphereAnimView = this.f163112l;
            snsAdSphereAnimView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
            com.tencent.mars.xlog.Log.i("SnsAdSphereAnimView", "start");
            snsAdSphereAnimView.invalidate();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
            ku5.u0 u0Var2 = ku5.t0.f312615d;
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.z zVar = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.z(this);
            long j17 = uVar.f402784c + 50;
            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
            t0Var2.getClass();
            t0Var2.z(zVar, j17, false);
            ku5.u0 u0Var3 = ku5.t0.f312615d;
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.b0 b0Var = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.b0(this);
            long j18 = uVar.f402784c + org.chromium.net.NetError.ERR_INVALID_URL;
            ku5.t0 t0Var3 = (ku5.t0) u0Var3;
            t0Var3.getClass();
            t0Var3.z(b0Var, j18, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayLongPressAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStartShakeSimpleAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return z17;
    }

    public int v() {
        s34.u uVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLongPressAnimDuration", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        s34.x xVar = this.f163122v;
        if (xVar == null || (uVar = xVar.randomSpriteAnimInfo) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLongPressAnimDuration", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return 0;
        }
        int i17 = uVar.f402784c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLongPressAnimDuration", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return i17;
    }

    public final android.util.Pair w() {
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3 u3Var;
        int i17;
        android.util.Pair pair;
        android.util.Pair pair2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPickedStatusAndTitle", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (this.f163107g == null || this.C == null || (u3Var = this.H) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPickedStatusAndTitle", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickSource", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
        int i18 = u3Var.f162961v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickSource", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
        boolean C = C();
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 q3Var = this.C;
        q3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUnPickedCardNum", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView = q3Var.f162923t;
        int unPickedCardNum = adLandingPageRandomPickCardView != null ? adLandingPageRandomPickCardView.getUnPickedCardNum() : 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUnPickedCardNum", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var = this.f163107g;
        b0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastUnPickedNum", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView adLandingPagePickCardTipView = b0Var.f162760y;
        if (adLandingPagePickCardTipView != null) {
            i17 = adLandingPagePickCardTipView.getCurrentUnPickedNum();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastUnPickedNum", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastUnPickedNum", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            i17 = 0;
        }
        if (i18 == 1) {
            pair = new android.util.Pair(2, this.C.R());
        } else if (C) {
            if (this.E != -1) {
                pair = new android.util.Pair(3, "");
            } else if (i17 > 0) {
                pair = new android.util.Pair(3, "");
            } else {
                pair2 = new android.util.Pair(1, this.C.R());
                pair = pair2;
            }
        } else if (i17 == unPickedCardNum) {
            pair2 = new android.util.Pair(1, this.C.R());
            pair = pair2;
        } else {
            pair = new android.util.Pair(0, this.C.R());
        }
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "getPickedStatusAndTitle, isAllRandomCardPicked is " + C + ", clickSource is " + i18 + ", result action type is " + pair.first + ", and title is " + ((java.lang.String) pair.second) + "unPickedNum is " + unPickedCardNum + ", and lastUnPickedNum is " + i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPickedStatusAndTitle", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return pair;
    }

    public final void x() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideContinuePickToast", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        try {
            com.tencent.mm.ui.widget.dialog.f4 f4Var = this.K;
            if (f4Var != null && f4Var.isShowing()) {
                com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "hideContinuePickToast");
                this.K.dismiss();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "hideContinuePickToast, exp=" + e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideContinuePickToast", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    public final void y() {
        android.view.ViewStub viewStub;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("inflateShakeCardView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        try {
            if (this.f163109i == null && (viewStub = (android.view.ViewStub) this.f163101a.findViewById(com.tencent.mm.R.id.mql)) != null) {
                this.f163109i = (com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView) viewStub.inflate();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "inflateShakeCardView, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateShakeCardView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    public final void z(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (this.f163107g == null) {
            java.util.Iterator it = contentFragment.r0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 T = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0.T((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next());
                if (T != null) {
                    this.f163107g = T;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdLandingPageEggCardHelper", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    T.D = this;
                    com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView adLandingPagePickCardTipView = T.f162760y;
                    if (adLandingPagePickCardTipView != null) {
                        adLandingPagePickCardTipView.setAdLandingPageEggCardHelper(this);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdLandingPageEggCardHelper", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var = this.f163107g;
                    com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.c0 c0Var = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.c0(this);
                    b0Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRandomPickTipClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    b0Var.F = c0Var;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRandomPickTipClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }
}
