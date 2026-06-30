package com.tencent.mm.plugin.offline.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class WalletOfflineEntranceUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: f, reason: collision with root package name */
    public int f152572f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f152570d = true;

    /* renamed from: e, reason: collision with root package name */
    public int f152571e = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f152573g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f152574h = false;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f152575i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OfflinePayResultNewEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI.2
        {
            this.__eventId = 484738412;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.OfflinePayResultNewEvent offlinePayResultNewEvent) {
            com.tencent.mm.autogen.events.OfflinePayResultNewEvent offlinePayResultNewEvent2 = offlinePayResultNewEvent;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "rcv funk event: %s", offlinePayResultNewEvent2.f54557g.f6361a);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_callback", offlinePayResultNewEvent2.f54557g.f6361a);
            com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI walletOfflineEntranceUI = com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI.this;
            walletOfflineEntranceUI.setResult(-1, intent);
            walletOfflineEntranceUI.finish();
            return false;
        }
    };

    public final void U6() {
        int i17;
        ss4.d dVar;
        at4.g0.e(1);
        com.tencent.mm.wallet_core.ui.r1.q0(30, 1);
        if (getIntent() != null) {
            int intExtra = getIntent().getIntExtra("key_from_scene", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "parserCardData(), scene is " + intExtra);
            if (intExtra == 3) {
                yo3.m.f464160g = intExtra;
                int intExtra2 = getIntent().getIntExtra("key_expire_time", 0);
                long longExtra = getIntent().getLongExtra("key_begin_time", 0L);
                boolean booleanExtra = getIntent().getBooleanExtra("key_is_mark", false);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "expire_time:" + intExtra2 + " beginTime:" + longExtra + " isMark:" + booleanExtra);
                yo3.m.f464161h = intExtra2;
                yo3.m.f464162i = longExtra;
                yo3.m.f464163j = booleanExtra;
                yo3.m.f464164k = getIntent().getStringExtra("key_card_id");
                yo3.m.f464165l = getIntent().getStringExtra("key_user_card_id");
                yo3.m.f464166m = getIntent().getStringExtra("key_card_code");
            } else if (intExtra == 1 || intExtra == 2 || intExtra == 4) {
                yo3.m.f464160g = intExtra;
                yo3.m.f464161h = 0;
                yo3.m.f464162i = 0L;
                yo3.m.f464163j = false;
                yo3.m.f464164k = "";
                yo3.m.f464165l = "";
                yo3.m.f464166m = "";
            }
        }
        this.f152572f = getIntent().getIntExtra("key_from_scene", 0);
        if (getIntent().getBooleanExtra("is_offline_create", false) || !((i17 = this.f152572f) == 6 || i17 == 7)) {
            V6();
            this.f152570d = false;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "from h5 or wxapp check sign: %s", java.lang.Integer.valueOf(i17));
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent.getStringExtra("appId");
        java.lang.String stringExtra2 = intent.getStringExtra("timeStamp");
        java.lang.String stringExtra3 = intent.getStringExtra("nonceStr");
        java.lang.String stringExtra4 = intent.getStringExtra("packageExt");
        java.lang.String stringExtra5 = intent.getStringExtra("signtype");
        java.lang.String stringExtra6 = intent.getStringExtra("paySignature");
        int intExtra3 = intent.getIntExtra("pay_channel", 0);
        if (this.f152572f == 6) {
            dVar = new ss4.d(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, intent.getStringExtra("url"), 16, com.tencent.mm.plugin.appbrand.jsapi.w9.NAME, intExtra3);
        } else {
            java.lang.String stringExtra7 = intent.getStringExtra("wxapp_username");
            java.lang.String stringExtra8 = intent.getStringExtra("wxapp_path");
            java.lang.String stringExtra9 = intent.getStringExtra("jsapiFuncName");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra9)) {
                stringExtra9 = com.tencent.mm.plugin.appbrand.jsapi.w9.NAME;
            }
            dVar = new ss4.d(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, 16, stringExtra7, stringExtra8, stringExtra9, intExtra3);
        }
        addSceneEndListener(580);
        doSceneProgress(dVar, true);
        this.f152570d = false;
    }

    public final void V6() {
        android.content.Intent intent = getIntent();
        this.f152574h = intent != null && intent.getBooleanExtra("from_pinned_shortcut", false);
        if (intent != null && intent.hasExtra("key_from_scene")) {
            int intExtra = intent.getIntExtra("key_from_scene", 0);
            int i17 = 2;
            if (intExtra == 1) {
                this.f152571e = 1;
            } else {
                if (intExtra == 2) {
                    this.f152571e = 2;
                } else if (intExtra == 3) {
                    this.f152571e = 3;
                    i17 = 3;
                } else {
                    i17 = 6;
                    if (intExtra == 4) {
                        this.f152571e = this.f152574h ? 13 : 4;
                    } else {
                        if (intExtra == 5) {
                            this.f152571e = 8;
                        } else {
                            r9 = 7;
                            if (intExtra == 6) {
                                this.f152571e = 10;
                            } else if (intExtra == 7) {
                                this.f152571e = 11;
                                i17 = 8;
                            } else if (intExtra == 8) {
                                this.f152571e = 12;
                                i17 = 9;
                            } else {
                                this.f152571e = 0;
                                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "unknown scene: %d", java.lang.Integer.valueOf(intExtra));
                            }
                        }
                        i17 = r9;
                    }
                }
                i17 = 1;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14021, 1, java.lang.Integer.valueOf(i17));
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().s() || ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13999h == null);
        if (java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_ignore_bindquerynew_before_offlinepay, false)).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "ignore bindquery new before offline is true");
            valueOf = java.lang.Boolean.FALSE;
        }
        java.util.HashMap hashMap = null;
        if (valueOf.booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isDataInvalid()");
            doSceneProgress(new ss4.e0(null, 8), true);
            this.f152570d = false;
            return;
        }
        if (!this.mKindaEnable || !yo3.m.i()) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_entry_scene", this.f152571e);
            intent2.putExtra("key_from_scene", this.f152572f);
            java.lang.String stringExtra = getIntent().getStringExtra("key_business_attach");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                intent2.putExtra("key_business_attach", stringExtra);
            }
            intent2.putExtra("is_offline_create", getIntent().getBooleanExtra("is_offline_create", false));
            intent2.putExtra("key_appid", getIntent().getStringExtra("key_appid"));
            j45.l.n(getContext(), "offline", ".ui.WalletOfflineCoinPurseUI", intent2, 1);
            return;
        }
        if (yo3.m.f464160g == 3) {
            hashMap = new java.util.HashMap();
            java.lang.String str = yo3.m.f464164k;
            if (str == null) {
                str = "";
            }
            hashMap.put("card_id", str);
            java.lang.String str2 = yo3.m.f464165l;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("user_card_id", str2);
            java.lang.String str3 = yo3.m.f464166m;
            hashMap.put("card_code", str3 != null ? str3 : "");
        }
        ((h45.q) i95.n0.c(h45.q.class)).startOfflinePrePay(getContext(), this.f152571e, getIntent().getIntExtra("pay_channel", 0), this.f152572f, hashMap, this.f152574h, getIntent().getStringExtra("queryString"), new com.tencent.mm.plugin.offline.ui.i4(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "do not finish");
        } else {
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (26 != android.os.Build.VERSION.SDK_INT) {
            setRequestedOrientation(1);
        }
        android.view.Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        com.tencent.mm.wallet_core.model.g.c().f(getApplicationContext());
        this.f152575i.alive();
        U6();
        r45.t54 t54Var = (r45.t54) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ni(this, 1, 3, r45.t54.class);
        if (t54Var != null && "launch_type_offline_wallet".equals(t54Var.f386157d)) {
            com.tencent.mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct wC3DTouchHomeShortCutStruct = new com.tencent.mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct();
            wC3DTouchHomeShortCutStruct.f62064d = 1L;
            wC3DTouchHomeShortCutStruct.f62065e = 1L;
            wC3DTouchHomeShortCutStruct.k();
            wC3DTouchHomeShortCutStruct.o();
        }
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.WalletOfflineEntranceUI)).Rj(this, iy1.a.Money);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f152575i.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return true;
        }
        finish();
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "onNewIntent");
        if (intent == null || !intent.hasExtra("is_offline_create")) {
            this.f152570d = false;
            this.f152573g = true;
            setIntent(intent);
            U6();
            return;
        }
        this.f152570d = true;
        this.f152573g = true;
        setIntent(intent);
        U6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onResume()");
        if (!this.f152570d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isShouldFinishOnResume is false , not finish activity");
            this.f152570d = true;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isShouldFinishOnResume is true , finish activity");
        if (!yo3.m.k()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isOfflineCreate() false");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_entry_scene", this.f152571e);
        intent.putExtra("key_from_scene", 0);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof ss4.d)) {
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd SUCC");
                V6();
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "net error: %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            V6();
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd FAIL");
            finish();
            return false;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "net error: %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            int i19 = this.f152572f;
            if (i19 == 6 || i19 == 7) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_callback", "fail");
                setResult(0, intent);
            }
            finish();
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd SUCC");
        h45.y.f278968a = ((ss4.d) m1Var).H();
        int i27 = this.f152572f;
        if (i27 == 6 || i27 == 7) {
            android.content.Intent intent2 = new android.content.Intent();
            if (this.f152573g) {
                intent2.putExtra("key_callback", "return");
            } else {
                intent2.putExtra("key_callback", "ok");
            }
            setResult(-1, intent2);
        }
        V6();
        return true;
    }
}
