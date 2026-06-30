package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class WalletPasswordSettingUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int G = 0;
    public final java.util.List A;
    public boolean B;
    public boolean C;
    public final com.tencent.mm.sdk.event.IListener D;
    public final com.tencent.mm.sdk.event.IListener E;
    public final com.tencent.mm.wallet_core.g F;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f178918d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f178919e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.RightBelowPreference f178920f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f178921g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.IconPreference f178923i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f178924m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f178925n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f178926o;

    /* renamed from: p, reason: collision with root package name */
    public at4.m1 f178927p;

    /* renamed from: q, reason: collision with root package name */
    public at4.m1 f178928q;

    /* renamed from: r, reason: collision with root package name */
    public at4.m1 f178929r;

    /* renamed from: s, reason: collision with root package name */
    public gs4.f f178930s;

    /* renamed from: t, reason: collision with root package name */
    public gs4.j f178931t;

    /* renamed from: u, reason: collision with root package name */
    public int f178932u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f178933v;

    /* renamed from: y, reason: collision with root package name */
    public android.app.Dialog f178936y;

    /* renamed from: z, reason: collision with root package name */
    public int f178937z;

    /* renamed from: h, reason: collision with root package name */
    public android.app.Dialog f178922h = null;

    /* renamed from: w, reason: collision with root package name */
    public boolean f178934w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f178935x = 0;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI$3, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass3 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnSoterInitializedEvent> {
        public AnonymousClass3(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -1482822212;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.OnSoterInitializedEvent onSoterInitializedEvent) {
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.wallet.pwd.ui.z1(this), 500L);
            return false;
        }
    }

    public WalletPasswordSettingUI() {
        new com.tencent.mm.sdk.platformtools.n3(new com.tencent.mm.plugin.wallet.pwd.ui.u1(this));
        this.f178937z = 2;
        this.A = new java.util.ArrayList();
        this.B = false;
        this.C = false;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.D = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletEntryChangeAccountEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.2
            {
                this.__eventId = 92672998;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletEntryChangeAccountEvent walletEntryChangeAccountEvent) {
                int i17 = com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.G;
                com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI = com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.this;
                walletPasswordSettingUI.Y6(true);
                walletPasswordSettingUI.i7();
                return false;
            }
        };
        this.E = new com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.AnonymousClass3(a0Var);
        this.F = new com.tencent.mm.plugin.wallet.pwd.ui.c2(this);
    }

    public static void V6(com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI, int i17) {
        walletPasswordSettingUI.getClass();
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (i17 == 0) {
            mz2.a aVar2 = (mz2.a) aVar;
            if (walletPasswordSettingUI.f178919e.N() != aVar2.a()) {
                walletPasswordSettingUI.c7(aVar2.a());
                return;
            }
            return;
        }
        if (i17 == 1) {
            mz2.a aVar3 = (mz2.a) aVar;
            if (walletPasswordSettingUI.f178919e.N() != aVar3.b()) {
                walletPasswordSettingUI.c7(aVar3.b());
            }
        }
    }

    public final void W6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "clickMobileRemitSwitch");
        gs4.i iVar = new gs4.i(i17, this.f178937z);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(iVar);
        android.app.Dialog dialog = this.f178922h;
        if (dialog == null) {
            this.f178922h = db5.e1.O(this, null, 0, com.tencent.mm.R.style.f494256i6, getString(com.tencent.mm.R.string.ggc), true, false, new com.tencent.mm.plugin.wallet.pwd.ui.w1(this));
        } else {
            dialog.show();
        }
    }

    public void X6() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_is_paymanager", true);
        bundle.putInt("key_forgot_scene", 2);
        com.tencent.mm.wallet_core.b.a().getClass();
        ((h45.q) i95.n0.c(h45.q.class)).startResetPwdUseCase(this, bundle);
    }

    public final void Y6(boolean z17) {
        gs4.p pVar = new gs4.p();
        gm0.j1.i();
        gm0.j1.n().f273288b.g(pVar);
        this.f178934w = true;
        if (z17) {
            this.f178936y = com.tencent.mm.wallet_core.ui.b2.h(this, false, new com.tencent.mm.plugin.wallet.pwd.ui.o1(this));
        }
    }

    public void Z6() {
        ((h45.q) i95.n0.c(h45.q.class)).startModifyPwdUseCase(this, new android.os.Bundle());
    }

    public int a7() {
        return com.tencent.mm.R.xml.f494974d3;
    }

    public final void b7(at4.m1 m1Var) {
        int i17 = m1Var.field_jump_type;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "jump type h5, url: %s", m1Var.field_pref_url);
            if (com.tencent.mm.sdk.platformtools.t8.K0(m1Var.field_pref_url)) {
                return;
            }
            com.tencent.mm.wallet_core.ui.r1.X(this, m1Var.field_pref_url, false);
            return;
        }
        if (i17 == 2) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(m1Var.field_tinyapp_username)) {
                return;
            }
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            java.lang.String str = m1Var.field_tinyapp_username;
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = str;
            java.lang.String str2 = m1Var.field_tinyapp_path;
            if (str2 == null) {
                str2 = "";
            }
            nxVar.f7467b = str2;
            nxVar.f7469d = 1066;
            nxVar.f7468c = 0;
            startAppBrandUIFromOuterEvent.e();
            return;
        }
        if (i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "jump type payment management");
            j45.l.h(this, "wallet", ".pwd.ui.WalletPasswordSettingUI");
            return;
        }
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "jump type payment security");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("wallet_lock_jsapi_scene", 1);
            if (com.tencent.mm.wallet_core.b.a().e()) {
                ((h45.q) i95.n0.c(h45.q.class)).startPaySecurityUseCase(1, null);
            } else {
                j45.l.j(this, "wallet", ".pwd.ui.WalletSecuritySettingUI", intent, null);
            }
            new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
            return;
        }
        if (i17 == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "jump type wallet switch");
            j45.l.m(this, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 65281);
        } else {
            if (i17 != 8) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "jump type honey pay");
            if (!u73.h.g()) {
                j45.l.h(this, "honey_pay", ".ui.HoneyPayMainUI");
            } else {
                ((h45.q) i95.n0.c(h45.q.class)).startUseCase("HoneyPayPayerUseCase", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.mm.plugin.wallet.pwd.ui.e2(this));
            }
        }
    }

    public final void c7(boolean z17) {
        getDefaultSharedPreferences().edit().putBoolean("wallet_fingerprint_switch", z17).commit();
        this.f178919e.O(z17);
        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).notifyDataSetChanged();
    }

    public final void d7(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "summaryWording is null");
            return;
        }
        if (!str.contains("wc_custom_link")) {
            this.f178921g.H(str);
            return;
        }
        android.text.SpannableString qj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).qj(this, str, 10, false, 1, null);
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f178921g;
        checkBoxPreference.B = true;
        checkBoxPreference.H(qj6);
    }

    public final void e7(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f178923i.L(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) || !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_open_auto_pay", false);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_open_auto_pay", true);
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletPasswordSettingUI", "deduct_url is null or tinyappPath is null");
        }
    }

    public final void f7() {
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().y() || ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().x()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_biometric_pay", true);
            return;
        }
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (is4.a.c() && is4.a.b()) {
            this.f178920f.J(com.tencent.mm.R.string.kuc);
            this.f178920f.G(com.tencent.mm.R.string.kub);
            mz2.a aVar2 = (mz2.a) aVar;
            if (aVar2.b()) {
                this.f178920f.M = getString(com.tencent.mm.R.string.kgv);
            } else if (aVar2.a()) {
                this.f178920f.M = getString(com.tencent.mm.R.string.kgw);
            } else {
                this.f178920f.M = getString(com.tencent.mm.R.string.f493301jo0);
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_biometric_pay", false);
            return;
        }
        if (is4.a.c()) {
            this.f178920f.J(com.tencent.mm.R.string.kua);
            this.f178920f.G(com.tencent.mm.R.string.ku_);
            if (((mz2.a) aVar).a()) {
                this.f178920f.M = getString(com.tencent.mm.R.string.jnq);
            } else {
                this.f178920f.M = getString(com.tencent.mm.R.string.f493301jo0);
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_biometric_pay", false);
            return;
        }
        if (!is4.a.b()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_biometric_pay", true);
            return;
        }
        this.f178920f.J(com.tencent.mm.R.string.ku9);
        this.f178920f.G(com.tencent.mm.R.string.ku8);
        if (((mz2.a) aVar).b()) {
            this.f178920f.M = getString(com.tencent.mm.R.string.jnq);
        } else {
            this.f178920f.M = getString(com.tencent.mm.R.string.f493301jo0);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_biometric_pay", false);
    }

    public final void g7(boolean z17) {
        gs4.f fVar = this.f178930s;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "updateHbRefundPref() mHbRefundConfig == null");
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_lucky_money_refund_way", true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "updateHbRefundPref() disabled:%s retcode:%s entrance_name:%s", java.lang.Boolean.valueOf(fVar.f275091k), java.lang.Integer.valueOf(this.f178930s.f275081a), this.f178930s.f275082b);
            gs4.f fVar2 = this.f178930s;
            if (!fVar2.f275091k) {
                int i17 = fVar2.f275081a;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (i17 == 0) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(fVar2.f275082b)) {
                        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_lucky_money_refund_way", true);
                        return;
                    }
                    com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178918d).h("wallet_lucky_money_refund_way");
                    iconPreference.L(this.f178930s.f275082b);
                    gm0.j1.i();
                    long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue() & 3;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "updateHbRefundPref() extStatus:%s", java.lang.Long.toBinaryString(longValue));
                    if (com.tencent.mm.sdk.platformtools.t8.B0(longValue, 2L)) {
                        iconPreference.H(this.f178930s.f275086f);
                    } else {
                        iconPreference.H(this.f178930s.f275084d);
                    }
                    if (z17 && this.f178930s.f275083c) {
                        gm0.j1.i();
                        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_HB_REFUND_RED_DOT_BOOLEAN_SYNC;
                        if (((java.lang.Boolean) c17.m(u3Var, java.lang.Boolean.FALSE)).booleanValue()) {
                            iconPreference.c0(8);
                        } else {
                            iconPreference.c0(0);
                            gm0.j1.i();
                            gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                        }
                    }
                    ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_lucky_money_refund_way", false);
                }
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_lucky_money_refund_way", true);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    public final void h7(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "updateMobileRemitSwitchPref() fromCgi:%s", java.lang.Boolean.valueOf(z17));
        gs4.j jVar = this.f178931t;
        if (jVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "updateMobileRemitSwitchPref() mMobileRemitSwitchConfig == null");
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("mobile_remit_switch", true);
        } else {
            if (jVar.f275103a != 0 || !jVar.f275105c) {
                ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("mobile_remit_switch", true);
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.f275107e)) {
                ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("mobile_remit_switch", false);
                return;
            }
            this.f178921g.L(this.f178931t.f275107e);
            d7(this.f178931t.f275108f);
            if (z17) {
                this.f178921g.O(this.f178931t.f275106d);
            } else {
                gm0.j1.i();
                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MOBILE_REMITTANCE_BIND_MOBILE_TRANSFER_INT_SYNC, 0)).intValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "updateMobileRemitSwitchPref() mobileRemitSw:%s", java.lang.Integer.valueOf(intValue));
                this.f178921g.O(intValue == 1);
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("mobile_remit_switch", false);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).notifyDataSetChanged();
    }

    public void i7() {
        boolean z17;
        boolean z18;
        int i17;
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().y() || ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().x()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_modify_password", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_forget_password", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_realname_verify", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).h("wallet_realname_verify").G(com.tencent.mm.R.string.kuj);
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_universal_pay_order", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_switch_currency", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_switch_category", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_biometric_pay", true);
        } else if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_modify_password", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_forget_password", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_realname_verify", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).h("wallet_realname_verify").G(com.tencent.mm.R.string.kup);
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_universal_pay_order", true);
            f7();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletPasswordSettingUI", "unknow reg state");
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_universal_pay_order", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_digitalcert", true);
        at4.m1 z07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().z0("wallet_switch_currency");
        this.f178928q = z07;
        if (z07 == null || z07.field_is_show != 1) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_switch_currency", true);
            z17 = true;
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_switch_currency", false);
            com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f178918d).h("wallet_switch_currency");
            h17.L(this.f178928q.field_pref_title);
            h17.H(this.f178928q.field_pref_desc);
            z17 = false;
        }
        at4.m1 z08 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().z0("wallet_im_mch");
        this.f178929r = z08;
        if (z08 == null || z08.field_is_show != 1) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_im_mch", true);
            z18 = true;
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_im_mch", false);
            com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) this.f178918d).h("wallet_im_mch");
            h18.L(this.f178929r.field_pref_title);
            h18.H(this.f178929r.field_pref_desc);
            z18 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "hideSwitch: %s, hideImMch: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z17 && z18) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_switch_category", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_switch_category", false);
        }
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().l(147457, 0L)).longValue();
        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).h("wallet_delay_transfer_date").G((16 & longValue) != 0 ? com.tencent.mm.R.string.kkv : (longValue & 32) != 0 ? com.tencent.mm.R.string.kkt : com.tencent.mm.R.string.f493522kl0);
        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_function_settings", false);
        g7(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "updateExtraSectionData()");
        java.util.List list = this.A;
        if (list != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (arrayList.size() > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.ui.base.preference.h0) this.f178918d).v((com.tencent.mm.ui.base.preference.Preference) it.next());
                }
                arrayList.clear();
            }
        }
        int n17 = ((com.tencent.mm.ui.base.preference.h0) this.f178918d).n("wallet_lucky_money_refund_way");
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PAY_MANAGE_EXTRA_SECTION_DATA_STRING_SYNC, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    gs4.o a17 = gs4.o.a(jSONArray.getJSONObject(i18));
                    if (a17.f275125b != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", " Parse header ");
                        r45.rl6 rl6Var = a17.f275125b;
                        com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(getContext(), null);
                        preferenceTitleCategory.C = true;
                        preferenceTitleCategory.L(com.tencent.mm.plugin.wallet_core.utils.z1.e(getContext(), rl6Var, null));
                        i17 = n17 + 1;
                        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).d(preferenceTitleCategory, i17);
                        ((java.util.ArrayList) list).add(preferenceTitleCategory);
                    } else {
                        com.tencent.mm.ui.base.preference.PreferenceSmallCategory preferenceSmallCategory = new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(getContext(), null);
                        i17 = n17 + 1;
                        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).d(preferenceSmallCategory, i17);
                        ((java.util.ArrayList) list).add(preferenceSmallCategory);
                    }
                    java.util.Iterator it6 = a17.f275124a.iterator();
                    while (it6.hasNext()) {
                        at4.m1 m1Var = (at4.m1) it6.next();
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", " mWalletPrefInfo.field_pref_key :%s ", m1Var.field_pref_key);
                        com.tencent.mm.plugin.wallet.pwd.ui.t1 t1Var = new com.tencent.mm.plugin.wallet.pwd.ui.t1(this, getContext());
                        t1Var.G = com.tencent.mm.R.layout.byv;
                        t1Var.L(m1Var.field_pref_title);
                        t1Var.H(m1Var.field_pref_desc);
                        t1Var.f197772f = new com.tencent.mm.plugin.wallet.pwd.ui.v1(this, m1Var);
                        i17++;
                        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).d(t1Var, i17);
                        ((java.util.ArrayList) list).add(t1Var);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", " add mWalletPrefInfo.field_pref_key :%s ", m1Var.field_pref_key);
                    }
                    if (a17.f275126c != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", " Parse footer ");
                        r45.rl6 rl6Var2 = a17.f275126c;
                        com.tencent.mm.ui.base.preference.PreferenceFooterCategory preferenceFooterCategory = new com.tencent.mm.ui.base.preference.PreferenceFooterCategory(getContext());
                        preferenceFooterCategory.C = true;
                        preferenceFooterCategory.L(com.tencent.mm.plugin.wallet_core.utils.z1.e(getContext(), rl6Var2, null));
                        n17 = i17 + 1;
                        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).d(preferenceFooterCategory, n17);
                        ((java.util.ArrayList) list).add(preferenceFooterCategory);
                    } else {
                        n17 = i17 + 1;
                        com.tencent.mm.ui.base.preference.PreferenceSmallCategory preferenceSmallCategory2 = new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(getContext(), null);
                        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).d(preferenceSmallCategory2, n17);
                        ((java.util.ArrayList) list).add(preferenceSmallCategory2);
                    }
                }
                ((com.tencent.mm.ui.base.preference.h0) this.f178918d).notifyDataSetChanged();
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletPasswordSettingUI", " parse EXTRA_Data failed :%s", e17.getMessage());
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(c01.z1.I() ? getString(com.tencent.mm.R.string.kuv) : getString(com.tencent.mm.R.string.kuu));
        java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f178918d = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).g(a7());
        this.f178923i = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178918d).h("wallet_open_auto_pay");
        this.f178924m = ((com.tencent.mm.ui.base.preference.h0) this.f178918d).h("wallet_delay_transfer_date");
        gm0.j1.i();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_PAY_DEDUCT_IS_NEW_BOOLEAN_SYNC;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (!((java.lang.Boolean) c17.m(u3Var, bool)).booleanValue()) {
            com.tencent.mm.ui.base.preference.IconPreference iconPreference = this.f178923i;
            iconPreference.d0(getString(com.tencent.mm.R.string.f490501wv), com.tencent.mm.R.drawable.asx, iconPreference.f197754x1);
            this.f178923i.b0(0);
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, bool);
        }
        this.f178919e = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178918d).h("wallet_fingerprint_switch");
        this.f178920f = (com.tencent.mm.ui.base.preference.RightBelowPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178918d).h("wallet_biometric_pay");
        this.f178921g = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178918d).h("mobile_remit_switch");
        i7();
        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("nfc_idpay", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_open_auto_pay", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_universal_pay_order", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_lucky_money_refund_way", true);
        j7();
        setBackBtn(new com.tencent.mm.plugin.wallet.pwd.ui.a2(this));
        if (is4.a.b()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15817, 0);
        }
    }

    public final void j7() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_USERINFO_UNREGTITLE_TYPE_STRING_SYNC, "");
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_USERINFO_UNREGURL_TYPE_STRING_SYNC, "");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "updateUnRegPref unreg_title %s unreg_url %s", str, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || !((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_password_setting_un_reg", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_password_setting_un_reg", false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 65281 && i18 == -1) {
            if (c01.z1.z()) {
                finish();
            } else {
                setResult(-1, intent);
                finish();
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getActionbarColor());
        gm0.j1.i();
        gm0.j1.n().f273288b.a(385, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1477, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1813, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1724, this);
        this.D.alive();
        this.E.alive();
        this.f178933v = getIntent().getBooleanExtra("key_is_from_system", false);
        this.f178932u = getIntent().getIntExtra("key_enter_scene", 0);
        getIntent().getBooleanExtra("key_default_show_currency", false);
        if (this.f178933v) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "hy: enter password setting from system setting");
            ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().k(this, null);
        }
        initView();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_HB_REFUND_CONFIG_REFACTOR_STRING_SYNC, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "updateHbRefundConfig() jsonString == null");
        } else {
            this.f178930s = gs4.f.a(str);
        }
        g7(false);
        gs4.h hVar = new gs4.h();
        gm0.j1.i();
        gm0.j1.n().f273288b.g(hVar);
        boolean nj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).nj();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "mobileRemitSwitch:%s", java.lang.Boolean.valueOf(nj6));
        if (nj6) {
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MOBILE_REMITTANCE_SWITCH_CONFIG_STRING_SYNC, "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "updateMobileRemitConfig() jsonString == null");
            } else {
                gs4.j jVar = new gs4.j();
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                    jVar.f275103a = jSONObject.optInt("ret_code");
                    jVar.f275104b = jSONObject.optString("ret_msg");
                    jVar.f275105c = jSONObject.optBoolean("is_show");
                    jVar.f275106d = jSONObject.optBoolean("is_open");
                    jVar.f275107e = jSONObject.optString("entrance_name");
                    jVar.f275108f = jSONObject.optString("wording");
                    jVar.f275109g = jSONObject.optBoolean("is_new_user");
                    jVar.f275110h = jSONObject.optString("compliance_item_wording");
                    jVar.f275111i = jSONObject.optString("compliance_item_title");
                    jVar.f275112j = jSONObject.optString("compliance_item_link");
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.mobileRemit.NetSceneMobileRemitGetSwitch", "createFromJSONObject() Exception:%s", e17.getMessage());
                }
                this.f178931t = jVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "updateMobileRemitConfig() mMobileRemitSwitchConfig:%s", this.f178930s);
            }
            h7(false);
            gm0.j1.i();
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MOBILE_REMITTANCE_SWITCH_GRANT_FLAG_INT_SYNC, 2)).intValue();
            this.f178937z = intValue;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "get mobileRemitGrantFlag: %s", java.lang.Integer.valueOf(intValue));
            if (this.f178937z == 0) {
                this.f178937z = 2;
            }
            gs4.k kVar = new gs4.k(this.f178937z);
            gm0.j1.i();
            gm0.j1.n().f273288b.g(kVar);
        } else {
            h7(false);
        }
        int i17 = gs4.p.f275127m;
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_PREF_INFO_CACHE_TIME_LONG_SYNC, 0L)).longValue();
        gm0.j1.i();
        int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_PREF_INFO_EXPIRES_INT_SYNC, 0)).intValue();
        long j17 = intValue2 + longValue;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayPayManager", "check isExpire %s %s %s", java.lang.Long.valueOf(longValue), java.lang.Integer.valueOf(intValue2), java.lang.Long.valueOf(j17));
        if (longValue <= 0 || java.lang.Long.valueOf(new java.util.Date().getTime() / 1000).longValue() > j17) {
            Y6(false);
        } else {
            gm0.j1.i();
            this.f178925n = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REALNAME_URL_STRING_SYNC, "");
            at4.m1 z07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().z0("wallet_open_auto_pay");
            this.f178927p = z07;
            if (z07 != null && z07.field_is_show == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "deduct info from cache is not null");
                at4.m1 m1Var = this.f178927p;
                e7(m1Var.field_pref_title, m1Var.field_pref_url, m1Var.field_tinyapp_path);
            } else if (z07 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "deduct info from cache is null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "mOpenAutoPayPrefInfo.field_is_show = " + this.f178927p.field_is_show + " and mOpenAutoPayPrefInfo.field_pref_url is null?" + com.tencent.mm.sdk.platformtools.t8.K0(this.f178927p.field_pref_url));
            }
        }
        gm0.j1.i();
        this.f178935x = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_SHOW_SWITCH_FLAG_INT, 0)).intValue();
        gm0.j1.i();
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_SWITCH_WORDING_STRING, "");
        this.f178926o = str3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            z17 = true;
            ss4.k0.H(true, null, null);
        } else {
            z17 = true;
            this.f178924m.L(this.f178926o);
            ss4.k0.H(true, null, null);
        }
        if (this.f178935x == 0) {
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_delay_transfer_date", z17);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.D.dead();
        this.E.dead();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(385, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1477, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1813, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1724, this);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if ("wallet_modify_password".equals(preference.f197780q)) {
            Z6();
            com.tencent.mm.wallet_core.ui.r1.q0(24, 1);
            return true;
        }
        if ("wallet_forget_password".equals(preference.f197780q)) {
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_DEDUCT_FORGET_URL_STRING, "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "jump to forget_url %s", str);
                com.tencent.mm.wallet_core.ui.r1.X(getContext(), str, false);
                com.tencent.mm.autogen.mmdata.rpt.WCPayResetPwdClickReportStruct wCPayResetPwdClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayResetPwdClickReportStruct();
                wCPayResetPwdClickReportStruct.f62114d = 2L;
                wCPayResetPwdClickReportStruct.f62115e = 2L;
                wCPayResetPwdClickReportStruct.k();
                return true;
            }
            at4.v1 v1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13997f;
            java.lang.String str2 = v1Var != null ? v1Var.field_forget_passwd_url : "";
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "jump to forget url: %s", str2);
                com.tencent.mm.wallet_core.ui.r1.X(this, str2, false);
                return true;
            }
            X6();
            com.tencent.mm.autogen.mmdata.rpt.WCPayResetPwdClickReportStruct wCPayResetPwdClickReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.WCPayResetPwdClickReportStruct();
            wCPayResetPwdClickReportStruct2.f62114d = 2L;
            wCPayResetPwdClickReportStruct2.f62115e = 1L;
            wCPayResetPwdClickReportStruct2.k();
            com.tencent.mm.wallet_core.ui.r1.q0(25, 1);
            return true;
        }
        if ("wallet_realname_verify".equals(preference.f197780q)) {
            if (!((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "go to RealNameVerifyProcess");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("real_name_verify_mode", 0);
                bundle.putString("realname_verify_process_jump_plugin", "wallet");
                bundle.putString("realname_verify_process_jump_activity", ".pwd.ui.WalletPasswordSettingUI");
                bundle.putInt("realname_verify_process_from_scene", 34);
                com.tencent.mm.wallet_core.a.j(this, com.tencent.mm.plugin.wallet_core.id_verify.a.class, bundle, this.F);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f178925n)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletPasswordSettingUI", "mRealnameUrl is null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "jump to mRealnameUrl");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", this.f178925n);
                intent.putExtra("showShare", false);
                intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
                com.tencent.mm.wallet_core.ui.r1.T(getContext(), intent);
            }
            return true;
        }
        if ("wallet_lucky_money_refund_way".equals(preference.f197780q)) {
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            create.putInt("refund_open_from", 1);
            create.putString("refund_json", this.f178930s.b());
            create.putString("refund_lingqian_title", this.f178930s.f275084d);
            create.putString("refund_lingqian_desc", this.f178930s.f275085e);
            create.putString("refund_origin_title", this.f178930s.f275086f);
            create.putString("refund_origin_desc", this.f178930s.f275087g);
            create.putString("top_tip", this.f178930s.f275088h);
            create.putString("refund_time_title", this.f178930s.f275089i);
            com.tencent.mm.autogen.mmdata.rpt.WCPayHongBaoRefundClickReportStruct wCPayHongBaoRefundClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayHongBaoRefundClickReportStruct();
            gm0.j1.i();
            r3 = com.tencent.mm.sdk.platformtools.t8.B0(((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue() & 3, 2L) ? 2 : 1;
            create.putBool("is_return_to_lq", r3 == 1);
            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("hongbaoRefundWay", create, new com.tencent.mm.plugin.wallet.pwd.ui.d2(this, rVar));
            wCPayHongBaoRefundClickReportStruct.f62103f = 1L;
            wCPayHongBaoRefundClickReportStruct.f62101d = r3;
            wCPayHongBaoRefundClickReportStruct.k();
            return true;
        }
        if ("wallet_biometric_pay".equals(preference.f197780q)) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletPasswordSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/wallet/pwd/ui/WalletPasswordSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if ("wallet_open_auto_pay".equals(preference.f197780q)) {
            b7(this.f178927p);
            this.f178923i.b0(8);
            return true;
        }
        if ("wallet_digitalcert".equals(preference.f197780q)) {
            if (!this.f178934w) {
                gs4.p pVar = new gs4.p();
                gm0.j1.i();
                gm0.j1.n().f273288b.g(pVar);
            }
            j45.l.j(this, "wallet", ".pwd.ui.WalletDigitalCertUI", new android.content.Intent(), null);
            return true;
        }
        if ("wallet_delay_transfer_date".equals(preference.f197780q)) {
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI.class);
            intent3.putExtra("key_scene", 2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent3);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletPasswordSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/wallet/pwd/ui/WalletPasswordSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if ("wallet_password_setting_un_reg".equals(preference.f197780q)) {
            gm0.j1.i();
            java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_USERINFO_UNREGURL_TYPE_STRING_SYNC, "");
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("rawUrl", str3);
            intent4.putExtra("showShare", false);
            intent4.putExtra(com.tencent.mm.ui.w2.f211205r, true);
            com.tencent.mm.wallet_core.ui.r1.T(getContext(), intent4);
        }
        if ("wallet_switch_currency".equals(preference.f197780q)) {
            b7(this.f178928q);
            return true;
        }
        if ("wallet_im_mch".equals(preference.f197780q)) {
            b7(this.f178929r);
            return true;
        }
        if ("wallet_universal_pay_order".equals(preference.f197780q)) {
            android.content.Intent intent5 = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI.class);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent5);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletPasswordSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/wallet/pwd/ui/WalletPasswordSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if ("wallet_function_settings".equals(preference.f197780q)) {
            j45.l.h(getContext(), "mall", ".ui.MallFunctionSettingsUI");
            return true;
        }
        if (!"mobile_remit_switch".equals(preference.f197780q)) {
            return false;
        }
        if (((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "mMobileRemitSwitchConfig.is_new_user ：%s", java.lang.Boolean.valueOf(this.f178931t.f275109g));
            gs4.j jVar = this.f178931t;
            if (jVar.f275109g) {
                this.C = false;
                if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.f275111i) || com.tencent.mm.sdk.platformtools.t8.K0(this.f178931t.f275110h)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "showProtocalBottomDialog do not have wording");
                    this.f178921g.O(!r0.N());
                    ((com.tencent.mm.ui.base.preference.h0) this.f178918d).notifyDataSetChanged();
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24835, 2, 1);
                    androidx.appcompat.app.AppCompatActivity context = getContext();
                    gs4.j jVar2 = this.f178931t;
                    com.tencent.mm.wallet_core.ui.r1.z0(context, jVar2.f275111i, jVar2.f275110h, jVar2.f275112j, new com.tencent.mm.plugin.wallet.pwd.ui.x1(this, 1)).l(new com.tencent.mm.plugin.wallet.pwd.ui.y1(this));
                }
            } else {
                W6(1);
            }
            r3 = 1;
        } else {
            W6(2);
        }
        com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct();
        wCPayTransferToPhoneActionReportStruct.f62121d = r3;
        int i17 = this.f178932u;
        if (i17 == 0) {
            wCPayTransferToPhoneActionReportStruct.f62123f = 2L;
        } else if (i17 == 1) {
            wCPayTransferToPhoneActionReportStruct.f62123f = 1L;
        }
        wCPayTransferToPhoneActionReportStruct.k();
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().b()) {
            finish();
        } else {
            i7();
            if (this.B) {
                this.B = false;
                Y6(false);
            }
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new ss4.e0(null, 1));
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.getType());
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof ss4.k0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "net error, use hardcode wording");
                return;
            }
            boolean z17 = m1Var instanceof gs4.h;
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "wallet_lucky_money_refund_way use cache");
                return;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "mobile_remit_switch use cache");
                return;
            }
            if (m1Var instanceof gs4.i) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "NetSceneMobileRemitChangeSwitch no success");
                android.app.Dialog dialog = this.f178922h;
                if (dialog != null && dialog.isShowing()) {
                    this.f178922h.dismiss();
                }
                db5.t7.makeText(getContext(), com.tencent.mm.sdk.platformtools.t8.K0(str) ? getString(com.tencent.mm.R.string.gwx) : str, 0).show();
                this.f178921g.O(!r0.N());
                ((com.tencent.mm.ui.base.preference.h0) this.f178918d).notifyDataSetChanged();
                return;
            }
            return;
        }
        if (m1Var instanceof ss4.e0) {
            i7();
            j7();
            return;
        }
        if (m1Var instanceof gs4.p) {
            i7();
            gs4.p pVar = (gs4.p) m1Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "isShowDeduct=" + pVar.f275128d);
            this.f178925n = pVar.f275132h;
            at4.m1 z07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().z0("wallet_open_auto_pay");
            this.f178927p = z07;
            if (z07 == null || z07.field_is_show != 1) {
                ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_open_auto_pay", true);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "deduct info from cgi is not null");
                at4.m1 m1Var2 = this.f178927p;
                e7(m1Var2.field_pref_title, m1Var2.field_pref_url, m1Var2.field_tinyapp_path);
            }
            j7();
            android.app.Dialog dialog2 = this.f178936y;
            if (dialog2 != null) {
                dialog2.dismiss();
                return;
            }
            return;
        }
        if (m1Var instanceof ss4.k0) {
            ss4.k0 k0Var = (ss4.k0) m1Var;
            java.lang.String str2 = k0Var.f412076e;
            this.f178926o = str2;
            int i19 = k0Var.f412082n;
            this.f178935x = i19;
            if (i19 == 0) {
                ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_delay_transfer_date", true);
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "use hardcode wording");
            } else {
                this.f178924m.L(this.f178926o);
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).m("wallet_delay_transfer_date", false);
            return;
        }
        if (m1Var instanceof gs4.h) {
            this.f178930s = ((gs4.h) m1Var).H();
            g7(true);
            this.f178930s.b();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_HB_REFUND_CONFIG_REFACTOR_STRING_SYNC, this.f178930s.b());
            return;
        }
        if (m1Var instanceof gs4.k) {
            gs4.k kVar = (gs4.k) m1Var;
            if (kVar.f275116g == null) {
                gs4.j jVar = new gs4.j();
                kVar.f275116g = jVar;
                r45.lp6 lp6Var = kVar.f275115f;
                jVar.f275103a = lp6Var.f379704d;
                jVar.f275104b = lp6Var.f379705e;
                jVar.f275105c = lp6Var.f379706f;
                jVar.f275106d = lp6Var.f379707g;
                jVar.f275107e = lp6Var.f379708h;
                jVar.f275108f = lp6Var.f379709i;
                jVar.f275109g = lp6Var.f379710m;
                r45.d70 d70Var = lp6Var.f379711n;
                if (d70Var != null) {
                    jVar.f275110h = d70Var.f372191d;
                    jVar.f275111i = d70Var.f372192e;
                    jVar.f275112j = d70Var.f372193f;
                }
            }
            this.f178931t = kVar.f275116g;
            h7(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "mMobileRemitSwitchConfig.getJSONObjectString().toString() :%s", this.f178931t.a());
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MOBILE_REMITTANCE_SWITCH_CONFIG_STRING_SYNC, this.f178931t.a());
            return;
        }
        if (m1Var instanceof gs4.i) {
            android.app.Dialog dialog3 = this.f178922h;
            if (dialog3 != null && dialog3.isShowing()) {
                this.f178922h.dismiss();
            }
            r45.bp6 bp6Var = ((gs4.i) m1Var).f275102f;
            if (bp6Var == null) {
                bp6Var = new r45.bp6();
            }
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = java.lang.Integer.valueOf(bp6Var.f370951d);
            objArr[1] = bp6Var.f370952e;
            objArr[2] = java.lang.Boolean.valueOf(bp6Var.f370953f == null);
            objArr[3] = java.lang.Integer.valueOf(bp6Var.f370955h);
            objArr[4] = bp6Var.f370956i;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "NetSceneMobileRemitChangeSwitch ret_code:%s ret_msg:%s real_name_info:%s resp.grant_flag：%s resp.wording:%s", objArr);
            int i27 = bp6Var.f370955h;
            java.lang.String str3 = bp6Var.f370956i;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "summaryWording is null");
            } else {
                this.f178937z = i27;
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MOBILE_REMITTANCE_SWITCH_GRANT_FLAG_INT_SYNC, java.lang.Integer.valueOf(i27));
                this.f178931t.f275108f = str3;
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MOBILE_REMITTANCE_SWITCH_CONFIG_STRING_SYNC, this.f178931t.a());
                d7(str3);
                ((com.tencent.mm.ui.base.preference.h0) this.f178918d).notifyDataSetChanged();
            }
            int i28 = bp6Var.f370951d;
            if (i28 == 0) {
                if (bp6Var.f370954g != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "NetSceneMobileRemitChangeSwitch show jump_win");
                    com.tencent.mm.wallet_core.model.f0.d(getContext(), bp6Var.f370954g, null, new com.tencent.mm.plugin.wallet.pwd.ui.p1(this));
                    this.f178921g.O(!r0.N());
                    ((com.tencent.mm.ui.base.preference.h0) this.f178918d).notifyDataSetChanged();
                    return;
                }
                if (this.f178921g.N()) {
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MOBILE_REMITTANCE_BIND_MOBILE_TRANSFER_INT_SYNC, 1);
                    return;
                } else {
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MOBILE_REMITTANCE_BIND_MOBILE_TRANSFER_INT_SYNC, 0);
                    return;
                }
            }
            if (i28 == 416) {
                if (bp6Var.f370953f != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("realname_verify_process_jump_activity", ".pwd.ui.WalletPasswordSettingUI");
                    bundle.putString("realname_verify_process_jump_plugin", "wallet");
                    zs4.q.d(this, bp6Var.f370951d, bp6Var.f370953f, bundle, true, new com.tencent.mm.plugin.wallet.pwd.ui.q1(this), null, 1012, 2);
                } else {
                    db5.e1.E(this, com.tencent.mm.sdk.platformtools.t8.K0(bp6Var.f370952e) ? getString(com.tencent.mm.R.string.kkk) : bp6Var.f370952e, "", getResources().getString(com.tencent.mm.R.string.gww), false, null).show();
                }
            } else if (bp6Var.f370954g != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "NetSceneMobileRemitChangeSwitch show jump_win");
                com.tencent.mm.wallet_core.model.f0.d(getContext(), bp6Var.f370954g, null, new com.tencent.mm.plugin.wallet.pwd.ui.r1(this));
            } else if (i28 != 0) {
                db5.e1.E(this, com.tencent.mm.sdk.platformtools.t8.K0(bp6Var.f370952e) ? getString(com.tencent.mm.R.string.kkk) : bp6Var.f370952e, "", getResources().getString(com.tencent.mm.R.string.gww), false, null).show();
            }
            this.f178921g.O(!r0.N());
            ((com.tencent.mm.ui.base.preference.h0) this.f178918d).notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(or4.i.class);
    }
}
