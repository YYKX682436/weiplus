package com.tencent.mm.plugin.wallet.bind.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class WalletBindUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f178572t = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f178575f;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f178583q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f178584r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f178585s;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.wallet.PayInfo f178573d = new com.tencent.mm.pluginsdk.wallet.PayInfo();

    /* renamed from: e, reason: collision with root package name */
    public boolean f178574e = false;

    /* renamed from: g, reason: collision with root package name */
    public int f178576g = -1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f178577h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f178578i = false;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f178579m = null;

    /* renamed from: n, reason: collision with root package name */
    public ss4.d f178580n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f178581o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f178582p = false;

    public WalletBindUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f178583q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletEntryChangeAccountEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.3
            {
                this.__eventId = 92672998;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletEntryChangeAccountEvent walletEntryChangeAccountEvent) {
                com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.this.finish();
                return false;
            }
        };
        this.f178584r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KindaBindCardEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.8
            {
                this.__eventId = 572563856;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent) {
                com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent2 = kindaBindCardEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindUI", "KindaBindCardEvent callback");
                com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI walletBindUI = com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.this;
                walletBindUI.f178584r.dead();
                if (kindaBindCardEvent2 == null) {
                    return false;
                }
                com.tencent.mm.wallet_core.model.i1.a();
                am.di diVar = kindaBindCardEvent2.f54454g;
                if (diVar != null && !diVar.f6463k.booleanValue()) {
                    walletBindUI.X6(diVar.f6453a, diVar.f6454b);
                }
                return true;
            }
        };
        this.f178585s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.9
            {
                this.__eventId = 323604482;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindUI", "WalletRealNameResultNotifyEvent callback");
                com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI walletBindUI = com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.this;
                walletBindUI.f178585s.dead();
                if (walletRealNameResultNotifyEvent.f54973g.f6120a == -1) {
                    walletBindUI.setResult(-1);
                    walletBindUI.Y6(-1);
                    walletBindUI.finish();
                }
                walletBindUI.f178582p = true;
                return true;
            }
        };
    }

    public final void U6() {
        if (vr4.f1.wi().Ai().s()) {
            doSceneForceProgress(new ss4.e0(null, 12));
            return;
        }
        java.lang.String str = getIntent().getStringExtra("packageExt") + "";
        java.lang.String[] split = str.split("&");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && split.length >= 2) {
            boolean z17 = false;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            for (java.lang.String str4 : split) {
                if (str4.startsWith("bankType=")) {
                    str3 = str4.replace("bankType=", "");
                } else if (str4.startsWith("bankName=")) {
                    str2 = str4.replace("bankName=", "");
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                at4.x1 Ai = vr4.f1.wi().Ai();
                Ai.getClass();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    java.util.ArrayList arrayList = Ai.f13995d;
                    if (arrayList != null) {
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
                            if (str3.equals(bankcard.field_bankcardType) && bankcard.F0()) {
                                break;
                            }
                        }
                    }
                    java.util.ArrayList arrayList2 = Ai.f13996e;
                    if (arrayList2 != null) {
                        java.util.Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it6.next();
                            if (str3.equals(bankcard2.field_bankcardType) && bankcard2.field_bankcardState == 0) {
                                break;
                            }
                        }
                    }
                    z17 = true;
                }
                if (z17) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3 = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
                    bankcard3.field_bankName = str2;
                    bankcard3.field_bankcardType = str3;
                    bundle.putParcelable("key_bankcard", bankcard3);
                    bundle.putString("key_bank_type", bankcard3.field_bankcardType);
                    com.tencent.mm.wallet_core.a.k(this, "wxcredit", "WXCreditOpenProcess", bundle, null);
                    return;
                }
            }
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6() {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.V6():void");
    }

    public final void W6(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doBindCardForOtherScene ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(com.tencent.mm.sdk.platformtools.z3.b(true));
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindUI", sb6.toString());
        android.os.Bundle input = getInput();
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178573d;
        input.putParcelable("key_pay_info", payInfo);
        input.putBoolean("key_need_bind_response", true);
        input.putString("key_custom_bind_tips", getIntent().getStringExtra("key_custom_bind_tips"));
        boolean booleanExtra = getIntent().getBooleanExtra("from_kinda", false);
        if (booleanExtra) {
            input.putBoolean("is_from_new_cashier", true);
            input.putString("start_activity_class", getClass().getName());
        }
        if (vr4.f1.wi().Ai().s()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindUI", "user status invalid");
            if (i17 == 4) {
                doSceneForceProgress(new ss4.e0(null, 20));
            } else {
                doSceneForceProgress(new ss4.e0(null, 12));
            }
        } else {
            boolean w17 = vr4.f1.wi().Ai().w();
            com.tencent.mm.sdk.event.IListener iListener = this.f178584r;
            if (w17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindUI", "user status reg");
                this.f178574e = true;
                int i18 = this.f178576g;
                payInfo.f192108d = i18;
                input.putInt("key_bind_scene", i18);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f178577h)) {
                    input.putString("kreq_token", this.f178577h);
                }
                if (!this.f178578i || com.tencent.mm.sdk.platformtools.t8.K0(this.f178579m)) {
                    input.putBoolean("key_bind_card_can_pass_pwd", false);
                } else {
                    input.putBoolean("key_bind_card_can_pass_pwd", true);
                    input.putString("key_bind_card_user_token", this.f178579m);
                }
                java.lang.String str = h45.y.f278968a;
                if (str != null) {
                    input.putString("jsapi_reqkey", str);
                }
                if (com.tencent.mm.wallet_core.b.a().b()) {
                    iListener.alive();
                    b7(input);
                    return;
                } else {
                    getIntent().putExtra("process_id", qs4.j.class.hashCode());
                    com.tencent.mm.wallet_core.a.j(this, qs4.j.class, input, null);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindUI", "user status unreg");
                this.f178574e = true;
                int i19 = this.f178576g;
                if (i19 >= 0) {
                    payInfo.f192108d = i19;
                } else {
                    payInfo.f192108d = 1;
                }
                input.putInt("key_bind_scene", payInfo.f192108d);
                if (!this.f178578i || com.tencent.mm.sdk.platformtools.t8.K0(this.f178579m)) {
                    input.putBoolean("key_bind_card_can_pass_pwd", false);
                } else {
                    input.putBoolean("key_bind_card_can_pass_pwd", true);
                    input.putString("key_bind_card_user_token", this.f178579m);
                }
                if (com.tencent.mm.wallet_core.b.a().b()) {
                    iListener.alive();
                    b7(input);
                    return;
                } else {
                    getIntent().putExtra("process_id", qs4.j.class.hashCode());
                    com.tencent.mm.wallet_core.a.j(this, qs4.j.class, input, null);
                }
            }
        }
        if (booleanExtra) {
            com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
            if (g17 instanceof qs4.j) {
                ((qs4.j) g17).f366420d = new com.tencent.mm.plugin.wallet.bind.ui.a0(this);
            }
        }
    }

    public void X6(boolean z17, boolean z18) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindUI", "kindaBindCardCallback bindCard Succ");
            if (this.f178576g == 4) {
                doSceneForceProgress(new ss4.e0(null, 20));
            } else {
                doSceneForceProgress(new ss4.e0(null, 12));
            }
            if (z18 && this.f178574e) {
                setResult(-1);
                Y6(-1);
                finish();
                return;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindUI", "kindaBindCardCallback bindCard Cancel");
            if (z18 && this.f178574e) {
                setResult(0);
                Y6(0);
                finish();
                return;
            }
        }
        if (Z6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindUI", "kindaBindCardCallback delay finish");
            setResult(0);
            finish();
        }
    }

    public final void Y6(int i17) {
        if (getIntent().getBooleanExtra("from_kinda", false)) {
            com.tencent.mm.autogen.events.WalletEndResultEvent walletEndResultEvent = new com.tencent.mm.autogen.events.WalletEndResultEvent();
            walletEndResultEvent.f54953g.f6728a = i17;
            walletEndResultEvent.e();
        }
    }

    public final boolean Z6() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_bindui_delay_finish, false) && this.f178582p;
    }

    public void a7(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = getString(com.tencent.mm.R.string.l0g);
        }
        db5.e1.G(this, str, null, false, new com.tencent.mm.plugin.wallet.bind.ui.e0(this));
    }

    public final void b7(android.os.Bundle bundle) {
        this.f178585s.alive();
        if (bundle != null) {
            com.tencent.mm.wallet_core.model.n1.d(6, bundle.getInt("key_bind_scene"));
            com.tencent.mm.wallet_core.model.i1.b(bundle.getInt("key_bind_scene"));
        } else {
            com.tencent.mm.wallet_core.model.n1.d(6, 0);
            com.tencent.mm.wallet_core.model.i1.b(0);
        }
        ((h45.q) i95.n0.c(h45.q.class)).startBindCardUseCase(this, bundle);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean checkProcLife() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(580);
        this.f178575f = getIntent().getStringExtra("key_import_key");
        this.f178576g = getIntent().getIntExtra("key_req_bind_scene", -1);
        getWindow().setStatusBarColor(0);
        int intExtra = getIntent() != null ? getIntent().getIntExtra("key_req_bind_scene", 13) : -1;
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
        am.l10 l10Var = walletGetUserInfoEvent.f54958g;
        if (intExtra == 4) {
            l10Var.f7215a = 20;
        } else {
            l10Var.f7215a = 13;
        }
        walletGetUserInfoEvent.f192364d = new com.tencent.mm.plugin.wallet.bind.ui.z(this);
        walletGetUserInfoEvent.e();
        this.f178583q.alive();
        com.tencent.mm.wallet_core.model.n1.d(6, 0);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        removeSceneEndListener(580);
        this.f178583q.dead();
        this.f178584r.dead();
        this.f178585s.dead();
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletBindUI", "onNewIntent intent null");
            setResult(0);
            Y6(0);
            finish();
            return;
        }
        super.onNewIntent(intent);
        if (Z6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindUI", "should delay finish after bindcard, skip setnewIntent");
            return;
        }
        setIntent(intent);
        if (intent.getBooleanExtra("intent_bind_end", false)) {
            intent.getBooleanExtra("intent_bind_end", false);
            setResult(-1, getIntent());
            Y6(-1);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindUI", "pay cancel");
            setResult(0);
            Y6(0);
        }
        finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f178574e = bundle.getBoolean("key_is_jump", false);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        if (this.f178574e && !Z6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindUI", "finish on resume");
            finish();
        }
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("key_is_jump", this.f178574e);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = m1Var instanceof tr4.c;
        if (z17) {
            this.f178574e = true;
        }
        if (i17 != 0 || i18 != 0) {
            a7(str);
            return true;
        }
        if (m1Var instanceof ss4.e0) {
            if (this.f178576g == 6) {
                U6();
            } else {
                V6();
            }
            return true;
        }
        if (!z17) {
            if (m1Var instanceof ss4.d) {
                ss4.d dVar = this.f178580n;
                if (dVar != null && dVar.equals(m1Var)) {
                    ss4.d dVar2 = (ss4.d) m1Var;
                    h45.y.f278968a = dVar2.H();
                    com.tencent.mm.protobuf.f fVar = dVar2.f412029e.f70711b.f70700a;
                    this.f178577h = ((r45.y10) fVar).f390702f;
                    r45.y10 y10Var = (r45.y10) fVar;
                    this.f178578i = y10Var.f390705i;
                    this.f178579m = y10Var.f390706m;
                    W6(4);
                    return true;
                }
                com.tencent.mm.wallet_core.model.i1.a();
            }
            return false;
        }
        tr4.c cVar = (tr4.c) m1Var;
        android.os.Bundle input = getInput();
        input.putBoolean("key_is_import_bind", true);
        java.util.ArrayList arrayList = cVar.f421435d;
        if (arrayList == null || arrayList.size() <= 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = getString(com.tencent.mm.R.string.kgo);
            }
            db5.e1.G(this, str, null, false, new com.tencent.mm.plugin.wallet.bind.ui.d0(this));
        } else {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) cVar.f421435d.get(0);
            if (bankcard.Z2) {
                db5.e1.o(this, com.tencent.mm.R.string.kii, 0, false, new com.tencent.mm.plugin.wallet.bind.ui.c0(this));
            } else {
                input.putBoolean("key_need_bind_response", true);
                input.putString("kreq_token", cVar.f421436e);
                input.putString("key_bank_username", cVar.f421437f);
                input.putString("key_recommand_desc", cVar.f421438g);
                input.putParcelable("key_import_bankcard", bankcard);
                this.f178574e = true;
                input.putInt("key_bind_scene", 2);
                com.tencent.mm.wallet_core.a.j(this, qs4.j.class, input, new com.tencent.mm.plugin.wallet.bind.ui.b0(this));
            }
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.wallet.bind.ui.g0.class);
    }
}
