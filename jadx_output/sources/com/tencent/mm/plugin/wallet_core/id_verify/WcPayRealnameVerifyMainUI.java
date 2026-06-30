package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class WcPayRealnameVerifyMainUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f179301d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f179302e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f179303f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f179304g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f179306i;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_core.ui.ca f179305h = new com.tencent.mm.plugin.wallet_core.ui.ca();

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f179307m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI.1
        {
            this.__eventId = 323604482;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
            com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI wcPayRealnameVerifyMainUI = com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI.this;
            wcPayRealnameVerifyMainUI.f179307m.dead();
            int i17 = walletRealNameResultNotifyEvent.f54973g.f6120a;
            if (i17 != -1 && i17 != 0) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyMainUI", "WcPayRealnameVerifyMainUI finish");
            wcPayRealnameVerifyMainUI.finish();
            return false;
        }
    };

    public static void U6(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI wcPayRealnameVerifyMainUI, android.content.Intent intent) {
        wcPayRealnameVerifyMainUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyMainUI", "go to id input ui");
        if (intent != null) {
            wcPayRealnameVerifyMainUI.getInput().putBoolean("key_marketing_switch_closed", intent.getBooleanExtra("key_marketing_switch_closed", false));
        }
        com.tencent.mm.wallet_core.a.d(wcPayRealnameVerifyMainUI, wcPayRealnameVerifyMainUI.getInput());
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d9e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            r13 = this;
            r0 = 2131325505(0x7f097241, float:1.8269748E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r13.f179301d = r0
            r0 = 2131325501(0x7f09723d, float:1.826974E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.f179302e = r0
            r0 = 2131325503(0x7f09723f, float:1.8269744E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.f179303f = r0
            r0 = 2131325502(0x7f09723e, float:1.8269741E38)
            android.view.View r0 = r13.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r13.f179304g = r0
            android.widget.Button r0 = r13.f179301d
            com.tencent.mm.plugin.wallet_core.id_verify.t3 r1 = new com.tencent.mm.plugin.wallet_core.id_verify.t3
            r1.<init>(r13)
            r0.setOnClickListener(r1)
            java.lang.String r0 = " dddd time="
            gm0.j1.i()
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r2 = com.tencent.mm.storage.u3.USERINFO_WALLET_REALNAME_SWITCH_WORDING_STRING_SYNC
            java.lang.String r3 = ""
            java.lang.Object r1 = r1.m(r2, r3)
            r2 = 0
            r4 = 0
            java.lang.String r5 = "MicroMsg.WcPayRealnameVerifyMainUI"
            if (r1 == 0) goto Lab
            java.lang.String r1 = (java.lang.String) r1
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r6 != 0) goto Lab
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L9f
            r6.<init>(r1)     // Catch: org.json.JSONException -> L9f
            long r7 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L9f
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            java.lang.String r1 = "timestamp"
            long r9 = r6.getLong(r1)     // Catch: org.json.JSONException -> L9f
            java.lang.String r1 = "cache_time"
            long r11 = r6.getLong(r1)     // Catch: org.json.JSONException -> L9f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L9f
            r1.<init>(r0)     // Catch: org.json.JSONException -> L9f
            r1.append(r7)     // Catch: org.json.JSONException -> L9f
            java.lang.String r0 = ";timestamp="
            r1.append(r0)     // Catch: org.json.JSONException -> L9f
            r1.append(r9)     // Catch: org.json.JSONException -> L9f
            java.lang.String r0 = ";cachetime="
            r1.append(r0)     // Catch: org.json.JSONException -> L9f
            r1.append(r11)     // Catch: org.json.JSONException -> L9f
            java.lang.String r0 = r1.toString()     // Catch: org.json.JSONException -> L9f
            com.tencent.mars.xlog.Log.i(r5, r0)     // Catch: org.json.JSONException -> L9f
            long r7 = r7 - r9
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 <= 0) goto L9d
            java.lang.String r0 = "wording data from cache is out of date"
            com.tencent.mars.xlog.Log.e(r5, r0)     // Catch: org.json.JSONException -> L9f
            goto Lb0
        L9d:
            r4 = r6
            goto Lb0
        L9f:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r5, r0, r3, r1)
            java.lang.String r0 = "parse wording data form cache error"
            com.tencent.mars.xlog.Log.e(r5, r0)
            goto Lb0
        Lab:
            java.lang.String r0 = "cache is null"
            com.tencent.mars.xlog.Log.i(r5, r0)
        Lb0:
            if (r4 == 0) goto Lf4
            java.lang.String r0 = "cache_header_titles"
            r1 = 2131777577(0x7f105829, float:1.9186659E38)
            java.lang.String r3 = r13.getString(r1)
            java.lang.String r0 = r4.optString(r0, r3)
            java.lang.String r1 = r13.getString(r1)
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.f192989a
            if (r0 != 0) goto Lc8
            r0 = r1
        Lc8:
            android.widget.TextView r1 = r13.f179302e
            r1.setText(r0)
            java.lang.String r0 = "isShowCapitalSecurity"
            boolean r0 = r4.optBoolean(r0, r2)
            if (r0 == 0) goto Led
            android.widget.TextView r0 = r13.f179303f
            r1 = 2131779707(0x7f10607b, float:1.9190979E38)
            r0.setText(r1)
            android.view.ViewGroup r0 = r13.f179304g
            com.tencent.mm.plugin.wallet_core.id_verify.u3 r1 = new com.tencent.mm.plugin.wallet_core.id_verify.u3
            r1.<init>(r13)
            r0.setOnClickListener(r1)
            android.view.ViewGroup r0 = r13.f179304g
            r0.setVisibility(r2)
            goto Lf4
        Led:
            android.view.ViewGroup r0 = r13.f179304g
            r1 = 8
            r0.setVisibility(r1)
        Lf4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI.initView():void");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            com.tencent.mm.plugin.wallet_core.ui.ca caVar = this.f179305h;
            if (i18 == -1) {
                caVar.a(intent);
            } else {
                com.tencent.mm.plugin.wallet_core.ui.aa aaVar = caVar.f180182g;
                if (aaVar != null) {
                    aaVar.cancel();
                }
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478494f));
        hideActionbarLine();
        setMMTitle("");
        this.f179305h.f180181f = new com.tencent.mm.plugin.wallet_core.id_verify.q3(this);
        setBackBtn(new com.tencent.mm.plugin.wallet_core.id_verify.r3(this));
        java.lang.String string = getInput().getString("realname_verify_process_get_wording_cache");
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                r45.lm3 lm3Var = (r45.lm3) new r45.lm3().parseFrom(string.getBytes(s46.a.f403001a));
                this.f179306i = lm3Var.f379619z;
                r45.q34 q34Var = lm3Var.A;
                if (q34Var != null) {
                    com.tencent.mm.wallet_core.model.p0.d(q34Var).g(this, new com.tencent.mm.plugin.wallet_core.id_verify.v3(this));
                }
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WcPayRealnameVerifyMainUI", e17, "", new java.lang.Object[0]);
        }
        initView();
        this.f179307m.alive();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f179305h.b();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f179305h.c();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
