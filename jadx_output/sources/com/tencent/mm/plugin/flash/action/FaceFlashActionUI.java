package com.tencent.mm.plugin.flash.action;

@db5.a(512)
/* loaded from: classes14.dex */
public class FaceFlashActionUI extends com.tencent.mm.ui.MMActivity implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout f137102d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout f137103e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f137104f;

    /* renamed from: g, reason: collision with root package name */
    public int f137105g = 90004;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f137106h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f137107i = "";

    /* renamed from: m, reason: collision with root package name */
    public final long f137108m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137109n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137110o;

    public FaceFlashActionUI() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f137108m = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f137109n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(a0Var) { // from class: com.tencent.mm.plugin.flash.action.FaceFlashActionUI.2
            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                if (voipEvent.f54945g.f8415b != 3) {
                    return false;
                }
                vz2.c.c().f56217s = 1;
                com.tencent.mm.plugin.flash.action.FaceFlashActionUI.this.W6(90030, "finish by voip call");
                return false;
            }
        };
        this.f137110o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FaceFlashStateEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.flash.action.FaceFlashActionUI.3
            {
                this.__eventId = -544026548;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FaceFlashStateEvent faceFlashStateEvent) {
                com.tencent.mm.autogen.events.FaceFlashStateEvent faceFlashStateEvent2 = faceFlashStateEvent;
                if (faceFlashStateEvent2 == null) {
                    return false;
                }
                faceFlashStateEvent2.f54233g.f7610a = true;
                return false;
            }
        };
    }

    public static android.content.Intent c7(int i17, int i18, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("err_type", i17);
        bundle.putInt("err_code", i18);
        bundle.putString("err_msg", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "face result errorType:%s errorCode:%s errorMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        intent.putExtras(bundle);
        return intent;
    }

    public void T6() {
        if (!android.text.TextUtils.isEmpty(this.f137107i)) {
            try {
                V6(new org.json.JSONObject(this.f137107i));
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashActionUI", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finishByCancel", java.lang.Integer.valueOf(hashCode()));
        android.content.Intent c76 = c7(1, this.f137105g, "cancel");
        c76.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        c76.putExtra("totalTime", android.os.SystemClock.elapsedRealtime() - this.f137108m);
        try {
            if (!android.text.TextUtils.isEmpty(this.f137106h)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f137106h);
                c76.putExtra("serial_id", jSONObject.optString("serial_id"));
                if (wz2.a.d(jSONObject)) {
                    if (((android.app.Activity) this.f137102d.getContext()).getIntent() != null ? !com.tencent.mm.sdk.platformtools.t8.K0(r0.getStringExtra("otherVerifyTitle")) : false) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23269, 1, 2, 1);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23269, 1, 2, 0);
                    }
                }
                U6(jSONObject);
                return;
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashActionUI", e18, "", new java.lang.Object[0]);
        }
        vz2.c.j("usrCancel");
        vz2.c.c().f56217s = 6;
        vz2.c.h(90004);
        setResult(0, c76);
        finish();
    }

    public void U6(org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finishByFailed", java.lang.Integer.valueOf(hashCode()));
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle a17 = wz2.a.a(jSONObject);
        a17.putString("err_msg", "fail");
        intent.putExtras(a17);
        setResult(1, intent);
        finish();
    }

    public void V6(org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finishBySuccess", java.lang.Integer.valueOf(hashCode()));
        if (isFinishing() || isDestroyed()) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle a17 = wz2.a.a(jSONObject);
        a17.putString("err_msg", "ok");
        a17.putString("click_other_verify_btn", "no");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        a17.putLong("totalTime", android.os.SystemClock.elapsedRealtime() - this.f137108m);
        intent.putExtras(a17);
        setResult(-1, intent);
        finish();
    }

    public void W6(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finishByUnexpectedError", java.lang.Integer.valueOf(hashCode()));
        vz2.c.k("msgVerify", str);
        vz2.c.h(i17);
        setResult(1, c7(4, i17, "fail"));
        finish();
    }

    public void X6(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "onKindaBackResult");
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "resultData == null");
            T6();
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("error_msg");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "errorMsg == null");
            T6();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "errorMsg：%s", stringExtra);
        stringExtra.getClass();
        char c17 = 65535;
        switch (stringExtra.hashCode()) {
            case 3548:
                if (stringExtra.equals("ok")) {
                    c17 = 0;
                    break;
                }
                break;
            case 3135262:
                if (stringExtra.equals("fail")) {
                    c17 = 1;
                    break;
                }
                break;
            case 108405416:
                if (stringExtra.equals("retry")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                try {
                    V6(new org.json.JSONObject(this.f137107i));
                    return;
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionUI", "parse face success result error：%s，successStr：%s", e17.toString(), this.f137107i);
                    T6();
                    return;
                }
            case 1:
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(this.f137106h);
                    if ("yes".equals(intent.getStringExtra("other_verify_title_state"))) {
                        jSONObject.put("click_other_verify_btn", "yes");
                        if (wz2.a.d(jSONObject)) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23269, 1, 1, 1);
                        }
                    } else {
                        java.lang.String optString = jSONObject.optString("otherVerifyTitle");
                        if (wz2.a.d(jSONObject)) {
                            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23269, 1, 3, 1);
                            } else {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23269, 1, 3, 0);
                            }
                        }
                    }
                    U6(jSONObject);
                    return;
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionUI", "parse face failed result error：%s，failStr：%s", e18.toString(), this.f137106h);
                    T6();
                    return;
                }
            case 2:
                Y6();
                return;
            default:
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionUI", "unknown type");
                T6();
                return;
        }
    }

    public void Y6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity reset", java.lang.Integer.valueOf(hashCode()));
        vz2.c.j("reset");
        Z6(i65.a.d(getContext(), com.tencent.mm.R.color.BW_0));
        this.f137106h = "";
        this.f137107i = "";
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f137102d;
        faceFlashActionPreviewLayout.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "reset");
        faceFlashActionPreviewLayout.D = 0;
        android.os.CountDownTimer countDownTimer = faceFlashActionPreviewLayout.f137086y0;
        countDownTimer.cancel();
        countDownTimer.start();
        faceFlashActionPreviewLayout.L = false;
        faceFlashActionPreviewLayout.c();
        vz2.c.c().f56214p = 1;
        vz2.c.c().f56203e = faceFlashActionPreviewLayout.I;
        this.f137102d.setVisibility(0);
        this.f137103e.setVisibility(8);
    }

    public void Z6(int i17) {
        this.f137104f.setIconColor(i17);
    }

    public void a7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity showFailedLayout", java.lang.Integer.valueOf(hashCode()));
        this.f137105g = 90006;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if ((((android.app.Activity) this.f137102d.getContext()).getIntent() != null ? !com.tencent.mm.sdk.platformtools.t8.K0(r1.getStringExtra("otherVerifyTitle")) : false) && com.tencent.mm.sdk.platformtools.t8.K0(jSONObject.optString("otherVerifyTitle"))) {
                jSONObject.put("otherVerifyTitle", this.f137102d.getFaceOtherVerifyTitle());
                str = jSONObject.toString();
            }
        } catch (org.json.JSONException unused) {
        }
        this.f137106h = str;
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.action.w0(this));
    }

    public void b7(java.lang.String str) {
        this.f137103e.setVisibility(8);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "startKindaFaceCheckUseCase result：%s", str);
        str.getClass();
        if (str.equals("ok")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("error_msg", "ok");
            ((h45.q) i95.n0.c(h45.q.class)).startFaceCheckUseCase("faceCheckResultUseCase", intent, new h45.i() { // from class: com.tencent.mm.plugin.flash.action.FaceFlashActionUI$$a
                @Override // h45.i
                public final void onKindaBusinessCallback(android.content.Intent intent2) {
                    com.tencent.mm.plugin.flash.action.FaceFlashActionUI.this.X6(intent2);
                }
            });
        } else if (str.equals("fail")) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("error_msg", "fail");
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f137106h);
                intent2.putExtra("error_tips", wz2.a.b(jSONObject, i65.a.r(getContext(), com.tencent.mm.R.string.c6l)));
                boolean z17 = true;
                if (jSONObject.optInt("err_retry", 1) != 1) {
                    z17 = false;
                }
                intent2.putExtra("can_retry", z17);
                intent2.putExtra("other_verify_title", jSONObject.optString("otherVerifyTitle"));
            } catch (org.json.JSONException e17) {
                T6();
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionUI", "parse failed result error：%s，failStr：%s", e17.toString(), this.f137106h);
            }
            ((h45.q) i95.n0.c(h45.q.class)).startFaceCheckUseCase("faceCheckResultUseCase", intent2, new h45.i() { // from class: com.tencent.mm.plugin.flash.action.FaceFlashActionUI$$a
                @Override // h45.i
                public final void onKindaBusinessCallback(android.content.Intent intent22) {
                    com.tencent.mm.plugin.flash.action.FaceFlashActionUI.this.X6(intent22);
                }
            });
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionUI", "unknown type");
            T6();
        }
        this.f137102d.setVisibility(8);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finish", java.lang.Integer.valueOf(hashCode()));
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.action.u0(this));
        this.f137109n.dead();
        this.f137110o.dead();
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488748aa3;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity onBackPressed", java.lang.Integer.valueOf(hashCode()));
        T6();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/action/FaceFlashActionUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.g7w) {
            T6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/flash/action/FaceFlashActionUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "FaceFlashActivity onCreate, hashCode:%s. start verify sdk version:%s", java.lang.Integer.valueOf(hashCode()), com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().version());
        vz2.c.j("enter");
        super.onCreate(bundle);
        getController().W0(this, i65.a.d(getContext(), com.tencent.mm.R.color.aaw));
        this.f137102d = (com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout) findViewById(com.tencent.mm.R.id.f485007g80);
        this.f137103e = (com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout) findViewById(com.tencent.mm.R.id.f485008g81);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.g7w);
        this.f137104f = weImageView;
        weImageView.setOnClickListener(this);
        new r45.ju3();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        android.view.Window window = getWindow();
        kotlin.jvm.internal.o.g(context, "context");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_faceoverlay, false) && android.os.Build.VERSION.SDK_INT >= 31) {
            try {
                if (b3.l.checkSelfPermission(context, "android.permission.HIDE_OVERLAY_WINDOWS") != 0) {
                    com.tencent.mars.xlog.Log.i("FaceFlashActionUI", "no permission");
                } else if (window != null) {
                    window.setHideOverlayWindows(true);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("FaceFlashActionUI", e17, "", new java.lang.Object[0]);
            }
        }
        this.f137109n.alive();
        this.f137110o.alive();
        jx3.f.INSTANCE.idkeyStat(1484L, 1L, 1L, false);
        if (getWindow() == null || android.os.Build.VERSION.SDK_INT < 28) {
            return;
        }
        getWindow().setNavigationBarDividerColor(0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onDestroy", java.lang.Integer.valueOf(hashCode()));
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.action.u0(this));
        this.f137109n.dead();
        this.f137110o.dead();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity onPause", java.lang.Integer.valueOf(hashCode()));
        super.onPause();
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().doPause();
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f137102d;
        faceFlashActionPreviewLayout.f137077r.g();
        faceFlashActionPreviewLayout.h();
        tz2.l lVar = tz2.l.f423302d;
        faceFlashActionPreviewLayout.f137075p0 = lVar;
        faceFlashActionPreviewLayout.i(lVar);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity onResume", java.lang.Integer.valueOf(hashCode()));
        super.onResume();
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().doResume();
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f137102d;
        if (faceFlashActionPreviewLayout.getVisibility() == 0) {
            com.tencent.mm.plugin.flash.d0 d0Var = faceFlashActionPreviewLayout.f137077r;
            if (d0Var.f137208k || faceFlashActionPreviewLayout.f137065d == null || faceFlashActionPreviewLayout.f137072n.getVisibility() == 0) {
                return;
            }
            d0Var.f(faceFlashActionPreviewLayout.f137065d, new com.tencent.mm.plugin.flash.action.b0(faceFlashActionPreviewLayout));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionUI", "onSwipeBack");
        T6();
        super.onSwipeBack();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(rz2.e.class);
        hashSet.add(com.tencent.mm.plugin.flash.action.j0.class);
    }
}
