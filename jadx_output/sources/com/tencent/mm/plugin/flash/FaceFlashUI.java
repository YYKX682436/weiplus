package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class FaceFlashUI extends com.tencent.mm.ui.MMActivity implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.flash.FaceFlashPreviewLayout f137051d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.flash.FaceFlashProcessLayout f137052e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f137053f;

    /* renamed from: g, reason: collision with root package name */
    public final int f137054g = 90004;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f137055h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f137056i = "";

    /* renamed from: m, reason: collision with root package name */
    public final long f137057m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137058n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137059o;

    public FaceFlashUI() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f137057m = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f137058n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(a0Var) { // from class: com.tencent.mm.plugin.flash.FaceFlashUI.2
            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                if (voipEvent.f54945g.f8415b != 3) {
                    return false;
                }
                vz2.c.b().B = 1;
                com.tencent.mm.plugin.flash.FaceFlashUI.this.W6(90030, "finish by voip call");
                return false;
            }
        };
        this.f137059o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FaceFlashStateEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.flash.FaceFlashUI.3
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

    public static boolean X6(android.app.Activity activity, android.os.Bundle bundle, int i17) {
        com.tencent.mm.plugin.flash.s sVar = new com.tencent.mm.plugin.flash.s(activity);
        if (iq.b.h(activity, true, sVar) || iq.b.D(activity, sVar) || iq.b.w(activity, sVar) || iq.b.f(activity, sVar) || iq.b.k(activity, sVar)) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.flash.FaceFlashUI.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/flash/FaceFlashUI", "jumpToFaceFlashUI", "(Landroid/app/Activity;Landroid/os/Bundle;I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return true;
    }

    public static android.content.Intent b7(int i17, int i18, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("err_type", i17);
        bundle.putInt("err_code", i18);
        bundle.putString("err_msg", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "face result errorType:%s errorCode:%s errorMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        intent.putExtras(bundle);
        return intent;
    }

    public void T6() {
        if (!android.text.TextUtils.isEmpty(this.f137056i)) {
            try {
                V6(new org.json.JSONObject(this.f137056i));
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManager", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finishByCancel", java.lang.Integer.valueOf(hashCode()));
        android.content.Intent b76 = b7(1, this.f137054g, "cancel");
        b76.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        b76.putExtra("totalTime", android.os.SystemClock.elapsedRealtime() - this.f137057m);
        try {
            if (!android.text.TextUtils.isEmpty(this.f137055h)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f137055h);
                b76.putExtra("serial_id", jSONObject.optString("serial_id"));
                U6(jSONObject);
                return;
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManager", e18, "", new java.lang.Object[0]);
        }
        vz2.c.j("usrCancel");
        vz2.c.a(false);
        vz2.c.b().B = 6;
        vz2.c.f(90004);
        setResult(0, b76);
        finish();
    }

    public void U6(org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finishByFailed", java.lang.Integer.valueOf(hashCode()));
        this.f137051d.f137033u.d();
        vz2.c.a(false);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(wz2.a.a(jSONObject));
        setResult(1, intent);
        finish();
    }

    public void V6(org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finishBySuccess", java.lang.Integer.valueOf(hashCode()));
        if (isFinishing() || isDestroyed()) {
            return;
        }
        vz2.c.a(true);
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle a17 = wz2.a.a(jSONObject);
        a17.putString("click_other_verify_btn", "no");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        a17.putLong("totalTime", android.os.SystemClock.elapsedRealtime() - this.f137057m);
        intent.putExtras(a17);
        setResult(-1, intent);
        finish();
    }

    public void W6(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finishByUnexpectedError", java.lang.Integer.valueOf(hashCode()));
        vz2.c.k("msgVerify", str);
        vz2.c.f(i17);
        vz2.c.a(false);
        setResult(1, b7(4, i17, str));
        finish();
    }

    public void Y6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity reset", java.lang.Integer.valueOf(hashCode()));
        vz2.c.j("reset");
        vz2.c.b().f56192q = java.lang.System.currentTimeMillis();
        Z6(i65.a.d(getContext(), com.tencent.mm.R.color.f478712f3));
        this.f137055h = "";
        this.f137056i = "";
        com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout = this.f137051d;
        faceFlashPreviewLayout.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "reset");
        faceFlashPreviewLayout.B = 0;
        android.os.CountDownTimer countDownTimer = faceFlashPreviewLayout.N;
        countDownTimer.cancel();
        countDownTimer.start();
        faceFlashPreviewLayout.H = false;
        vz2.c.m(12);
        vz2.c.b().f56190o = 1;
        vz2.c.b().f56180e = faceFlashPreviewLayout.D;
        faceFlashPreviewLayout.a();
        if (!faceFlashPreviewLayout.f137034v.isShowing() && ((((java.lang.System.currentTimeMillis() - faceFlashPreviewLayout.f137018J) / 1000) / 60) / 60) / 24 >= 30) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            faceFlashPreviewLayout.f137018J = currentTimeMillis;
            faceFlashPreviewLayout.I.B("show-dialog", currentTimeMillis);
            faceFlashPreviewLayout.f137034v.show();
        }
        this.f137051d.setVisibility(0);
        this.f137051d.c();
        this.f137052e.setVisibility(8);
        vz2.c.d().f56168j++;
    }

    public void Z6(int i17) {
        this.f137053f.setIconColor(i17);
    }

    public void a7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity showFailedLayout", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout = this.f137051d;
        if (faceFlashPreviewLayout.f137034v.isShowing()) {
            faceFlashPreviewLayout.f137034v.dismiss();
        }
        this.f137055h = str;
        int intExtra = getIntent().getIntExtra("identify_type", 0);
        int intExtra2 = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        if (intExtra == 1 && intExtra2 == 5) {
            try {
                U6(new org.json.JSONObject(str));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManager", e17.getMessage());
                finish();
            }
            vz2.c.g(str);
            return;
        }
        Z6(i65.a.d(getContext(), com.tencent.mm.R.color.f478714f5));
        this.f137051d.setVisibility(8);
        this.f137051d.b();
        this.f137052e.setVisibility(0);
        com.tencent.mm.plugin.flash.FaceFlashProcessLayout faceFlashProcessLayout = this.f137052e;
        faceFlashProcessLayout.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "showFailedAnimation");
        faceFlashProcessLayout.findViewById(com.tencent.mm.R.id.lqx).setPadding(0, com.tencent.mm.ui.bl.a(faceFlashProcessLayout.getContext()), 0, 0);
        try {
            faceFlashProcessLayout.f137045h.setImageResource(com.tencent.mm.R.drawable.f481431t6);
            faceFlashProcessLayout.f137045h.startAnimation(faceFlashProcessLayout.f137048n);
            faceFlashProcessLayout.f137044g.setImageDrawable(i65.a.i(faceFlashProcessLayout.getContext(), com.tencent.mm.R.raw.icons_filled_error3));
            faceFlashProcessLayout.f137044g.startAnimation(faceFlashProcessLayout.f137050p);
            if (com.tencent.mm.sdk.platformtools.s9.f192975c || z65.c.a()) {
                faceFlashProcessLayout.f137044g.setOnLongClickListener(new com.tencent.mm.plugin.flash.k(faceFlashProcessLayout));
            } else {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            android.widget.TextView textView = faceFlashProcessLayout.f137042e;
            java.lang.String r17 = i65.a.r(faceFlashProcessLayout.getContext(), com.tencent.mm.R.string.c6l);
            java.lang.String optString = jSONObject.optString("err_msg", jSONObject.optString("errormsg", r17));
            if (android.text.TextUtils.isEmpty(optString)) {
                vz2.c.k("msgVerify", r17);
            } else {
                vz2.c.k("msgVerify", optString);
                r17 = optString;
            }
            textView.setText(r17);
            faceFlashProcessLayout.f137043f.setVisibility(0);
            android.widget.TextView textView2 = faceFlashProcessLayout.f137043f;
            java.lang.String optString2 = jSONObject.optString("err_tip", "");
            if (android.text.TextUtils.isEmpty(optString2)) {
                optString2 = "";
            }
            textView2.setText(optString2);
            java.lang.String optString3 = jSONObject.optString("err_feedback", "");
            faceFlashProcessLayout.f137047m.setVisibility(android.text.TextUtils.isEmpty(optString3) ? 4 : 0);
            faceFlashProcessLayout.f137047m.setOnClickListener(new com.tencent.mm.plugin.flash.l(faceFlashProcessLayout, jSONObject, optString3));
            boolean optBoolean = jSONObject.optBoolean("err_retry", true);
            faceFlashProcessLayout.f137046i.setVisibility(0);
            faceFlashProcessLayout.f137046i.setText(optBoolean ? i65.a.r(faceFlashProcessLayout.getContext(), com.tencent.mm.R.string.c7v) : i65.a.r(faceFlashProcessLayout.getContext(), com.tencent.mm.R.string.c7t));
            faceFlashProcessLayout.f137046i.setOnClickListener(new com.tencent.mm.plugin.flash.m(faceFlashProcessLayout, optBoolean, jSONObject));
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e18, "parse face failed result error.%s", str);
            faceFlashProcessLayout.f137042e.setText(str);
            faceFlashProcessLayout.f137047m.setVisibility(4);
            faceFlashProcessLayout.f137046i.setVisibility(0);
            faceFlashProcessLayout.f137046i.setText(i65.a.r(faceFlashProcessLayout.getContext(), com.tencent.mm.R.string.c7v));
            faceFlashProcessLayout.f137046i.setOnClickListener(new com.tencent.mm.plugin.flash.n(faceFlashProcessLayout));
        }
        vz2.c.g(str);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finish", java.lang.Integer.valueOf(hashCode()));
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.t(this));
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aa6;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onBackPressed", java.lang.Integer.valueOf(hashCode()));
        T6();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/FaceFlashUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.g7w) {
            T6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/flash/FaceFlashUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "screen orientation %d", java.lang.Integer.valueOf(configuration.orientation));
        this.f137051d.onConfigurationChanged(configuration);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onCreate", java.lang.Integer.valueOf(hashCode()));
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            vz2.c.d().f56162d = java.lang.System.currentTimeMillis();
            com.tencent.mm.autogen.mmdata.rpt.FaceDetectInterfaceCalledResultStruct d17 = vz2.c.d();
            d17.f56163e = d17.b("functionName", intent.getStringExtra("key_function_name"), true);
            vz2.c.d().f56164f = intent.getIntExtra("key_business_type", -1);
            com.tencent.mm.autogen.mmdata.rpt.FaceDetectInterfaceCalledResultStruct d18 = vz2.c.d();
            d18.f56165g = d18.b("appId", intent.getStringExtra("appId"), true);
            vz2.c.d().f56168j = 1L;
            vz2.c.d().f56169k = intent.getLongExtra("confirm_page_timestamp", -1L);
            vz2.c.d().f56170l = java.lang.System.currentTimeMillis();
            vz2.c.d().f56173o = intent.getIntExtra("check_alive_type", -1);
        }
        vz2.c.j("enter");
        vz2.c.b().f56192q = java.lang.System.currentTimeMillis();
        getController().W0(this, i65.a.d(getContext(), com.tencent.mm.R.color.aaw));
        this.f137051d = (com.tencent.mm.plugin.flash.FaceFlashPreviewLayout) findViewById(com.tencent.mm.R.id.f485007g80);
        this.f137052e = (com.tencent.mm.plugin.flash.FaceFlashProcessLayout) findViewById(com.tencent.mm.R.id.f485008g81);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.g7w);
        this.f137053f = weImageView;
        weImageView.setOnClickListener(this);
        this.f137058n.alive();
        this.f137059o.alive();
        jx3.f.INSTANCE.idkeyStat(1484L, 1L, 1L, false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onDestroy", java.lang.Integer.valueOf(hashCode()));
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.t(this));
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onPause", java.lang.Integer.valueOf(hashCode()));
        super.onPause();
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().doPause();
        this.f137051d.b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onResume", java.lang.Integer.valueOf(hashCode()));
        super.onResume();
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().doResume();
        this.f137051d.c();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onSwipeBack");
        T6();
        super.onSwipeBack();
    }
}
