package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class a extends qs4.j {

    /* renamed from: e, reason: collision with root package name */
    public int f179315e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179316f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179317g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f179318h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f179319i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f179320j = false;

    /* renamed from: k, reason: collision with root package name */
    public android.content.Intent f179321k = new android.content.Intent();

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f179322l = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f179323m = false;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.r f179324n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f179325o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f179326p;

    public a() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f179325o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KindaBindCardEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$9
            {
                this.__eventId = 572563856;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent) {
                com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent2 = kindaBindCardEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "KindaBindCardEvent callback");
                if (kindaBindCardEvent2 == null) {
                    return false;
                }
                com.tencent.mm.wallet_core.model.i1.a();
                com.tencent.mm.plugin.wallet_core.id_verify.a aVar = com.tencent.mm.plugin.wallet_core.id_verify.a.this;
                am.di diVar = kindaBindCardEvent2.f54454g;
                if (diVar != null) {
                    if (diVar.f6453a) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "KindaBindCardEvent bindCard Succ");
                        android.app.Activity crossActivity = ((h45.q) i95.n0.c(h45.q.class)).getCrossActivity();
                        if (crossActivity != null) {
                            android.os.Bundle bundle = aVar.f213801c;
                            bundle.putInt("realname_verify_process_ret", -1);
                            bundle.putString("realname_verify_process_finish_title", diVar.f6459g);
                            bundle.putString("realname_verify_process_finish_desc", diVar.f6460h);
                            bundle.putString("realname_verify_process_finish_page", diVar.f6461i);
                            bundle.putInt("realname_verify_process_finish_err_jump", com.tencent.mm.sdk.platformtools.t8.D1(diVar.f6462j, 0));
                            bundle.putInt("realname_verify_process_finish_passport_page_style", diVar.f6464l);
                            bundle.putString("realname_verify_process_finish_confirm_btn_title", diVar.f6465m);
                            bundle.putString("realname_verify_process_finish_confirm_btn_url", diVar.f6466n);
                            bundle.putString("realname_verify_process_finish_cancel_btn_title", diVar.f6467o);
                            bundle.putString("realname_verify_process_finish_bottom_wording", diVar.f6468p);
                            bundle.putString("realname_verify_process_finish_bottom_url", diVar.f6469q);
                            bundle.putString("realname_verify_process_finish_bottom_username", diVar.f6470r);
                            aVar.B(crossActivity, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI.class, aVar.f213801c);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "KindaBindCardEvent bindCard Cancel");
                        android.app.Activity crossActivity2 = ((h45.q) i95.n0.c(h45.q.class)).getCrossActivity();
                        if (crossActivity2 != null) {
                            aVar.f(crossActivity2, aVar.f213801c);
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "activity is null");
                        }
                    }
                }
                aVar.f179325o.dead();
                aVar.f179326p.dead();
                return true;
            }
        };
        this.f179326p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KindaBindCardVerifyPhoneEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$10
            {
                this.__eventId = 648959599;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.KindaBindCardVerifyPhoneEvent kindaBindCardVerifyPhoneEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "KindaBindCardVerifyPhoneEvent callback");
                am.ei eiVar = kindaBindCardVerifyPhoneEvent.f54455g;
                if (eiVar == null) {
                    return false;
                }
                java.lang.String str = eiVar.f6557a;
                com.tencent.mm.plugin.wallet_core.id_verify.a aVar = com.tencent.mm.plugin.wallet_core.id_verify.a.this;
                aVar.f179322l = str;
                android.content.Context context = eiVar.f6558b;
                if (context == null) {
                    context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                }
                aVar.B((android.app.Activity) context, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI.class, aVar.f213801c);
                return false;
            }
        };
    }

    @Override // qs4.j, qs4.b, com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        a("start", activity, bundle);
        this.f179320j = false;
        this.f179321k = new android.content.Intent();
        if (this.f213801c == null) {
            this.f213801c = new android.os.Bundle();
        }
        B(activity, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameProxyUI.class, bundle);
        return this;
    }

    public final void H(final android.app.Activity activity, final android.os.Bundle bundle) {
        final int i17 = bundle.getInt("realname_verify_process_from_scene", 0);
        int i18 = bundle.getInt("realname_payScene", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "realName entrance scene: %s, payScene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        ys4.o oVar = new ys4.o(i17, i18);
        oVar.f213904m = true;
        oVar.f213906o = activity;
        oVar.f213905n = false;
        oVar.l().h(new gm5.a() { // from class: com.tencent.mm.plugin.wallet_core.id_verify.a$$a
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ac A[Catch: Exception -> 0x00e1, TryCatch #0 {Exception -> 0x00e1, blocks: (B:28:0x008e, B:30:0x0094, B:31:0x009a, B:33:0x00a0, B:38:0x00ac, B:39:0x00b2), top: B:27:0x008e }] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b2 A[Catch: Exception -> 0x00e1, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e1, blocks: (B:28:0x008e, B:30:0x0094, B:31:0x009a, B:33:0x00a0, B:38:0x00ac, B:39:0x00b2), top: B:27:0x008e }] */
            @Override // gm5.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call(java.lang.Object r21) {
                /*
                    Method dump skipped, instructions count: 274
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.id_verify.a$$a.call(java.lang.Object):java.lang.Object");
            }
        });
        if (bundle.containsKey("realname_verify_process_from_scene")) {
            bundle.remove("realname_verify_process_from_scene");
        }
    }

    public final boolean I() {
        com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter jsApiRequestWCPayRealnameVerifyParameter = (com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter) this.f213801c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
        if (jsApiRequestWCPayRealnameVerifyParameter != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter: %s", jsApiRequestWCPayRealnameVerifyParameter.toString());
            return jsApiRequestWCPayRealnameVerifyParameter.f177553d.equals("verifySMS");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter is null");
        return false;
    }

    public final boolean J() {
        com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter jsApiRequestWCPayRealnameVerifyParameter = (com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter) this.f213801c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
        if (jsApiRequestWCPayRealnameVerifyParameter != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter: %s", jsApiRequestWCPayRealnameVerifyParameter.toString());
            return jsApiRequestWCPayRealnameVerifyParameter.f177553d.equals("bindCardHomeUI");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter is null");
        return false;
    }

    public final void K(android.content.Context context, android.os.Bundle bundle) {
        if (context instanceof android.app.Activity) {
            if (((h45.q) i95.n0.c(h45.q.class)).isUseCaseAlive("addPayCard")) {
                this.f179325o.alive();
                this.f179326p.alive();
                bundle.putInt("key_bind_scene", 12);
                bundle.putBoolean("key_need_bind_response", true);
                bundle.putString("notifyType", "WCPayRealnameVerifyLogic");
                ((h45.q) i95.n0.c(h45.q.class)).notifyAddPaycardUsecase(bundle, "WCPayRealnameVerifyLogicPlatformCallback", new com.tencent.mm.plugin.wallet_core.id_verify.q(this));
                return;
            }
            android.app.Activity activity = (android.app.Activity) context;
            if (L(activity, bundle)) {
                return;
            }
            if (!((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() || "rename".equals(this.f213801c.getString("key_realname_scene"))) {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle);
            } else {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle);
            }
        }
    }

    public final boolean L(android.content.Context context, android.os.Bundle bundle) {
        if (!com.tencent.mm.wallet_core.b.a().b()) {
            return false;
        }
        this.f179325o.alive();
        this.f179326p.alive();
        if (bundle != null) {
            com.tencent.mm.wallet_core.model.n1.d(6, bundle.getInt("key_bind_scene"));
            com.tencent.mm.wallet_core.model.i1.b(bundle.getInt("key_bind_scene"));
        } else {
            com.tencent.mm.wallet_core.model.n1.d(6, 0);
            com.tencent.mm.wallet_core.model.i1.b(0);
        }
        bundle.putInt("key_bind_scene", 10);
        if ("rename".equals(this.f213801c.getString("key_realname_scene"))) {
            bundle.putInt("reg_flag", 0);
        }
        ((h45.q) i95.n0.c(h45.q.class)).startBindCardUseCase(context, bundle);
        return true;
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        a("back", activity, java.lang.Integer.valueOf(i17));
        com.tencent.mm.wallet_core.model.i1.a();
        if ((activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI) || (activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI)) {
            if (i17 == 0) {
                f(activity, this.f213801c);
                return;
            }
            return;
        }
        if ((activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI) || (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI)) {
            if (this.f179319i != 0) {
                f(activity, this.f213801c);
                return;
            }
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            f(activity, this.f213801c);
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            d(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, null, i17);
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI) {
            d(activity, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI.class, null, i17);
            return;
        }
        if (!(activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI)) {
            if (activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "back from WcPayRealnameVerifyBindcardEntranceUI");
                if (J()) {
                    f(activity, this.f213801c);
                    return;
                } else {
                    d(activity, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI.class, null, i17);
                    return;
                }
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "back from verifyCodeUI");
        if (I()) {
            f(activity, this.f213801c);
        } else if (!(!com.tencent.mm.sdk.platformtools.t8.K0(this.f179322l))) {
            d(activity, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI.class, null, i17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "is kinda bindcard verify phone scene，finish activity");
            m(activity);
        }
    }

    @Override // qs4.j, com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "realname_verify_process";
    }

    @Override // qs4.j, com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        a("end", activity, bundle);
        com.tencent.mm.wallet_core.model.i1.a();
        if (bundle == null) {
            bundle = this.f213801c;
        }
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        android.os.Bundle bundle2 = bundle;
        if (this.f179315e == 1) {
            n();
            if (bundle2.getBoolean("intent_bind_end", false)) {
                this.f179318h = -1;
            } else {
                this.f179318h = 0;
            }
        } else if (bundle2.containsKey("realname_verify_process_ret")) {
            this.f179318h = bundle2.getInt("realname_verify_process_ret", -1);
        } else {
            this.f179318h = 0;
        }
        if (bundle2.containsKey("intent_bind_end")) {
            bundle2.remove("intent_bind_end");
        }
        if (bundle2.containsKey("key_is_bind_reg_process")) {
            bundle2.remove("key_is_bind_reg_process");
        }
        bundle2.putInt("realname_verify_process_ret", this.f179318h);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle2);
        if (this.f179318h == -1) {
            dp.a.makeText(activity, activity.getString(com.tencent.mm.R.string.hs7), 0).show();
        }
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
        int i17 = this.f179318h;
        am.l10 l10Var = walletGetUserInfoEvent.f54958g;
        if (i17 == -1) {
            l10Var.f7215a = 17;
        } else if (i17 == 0) {
            l10Var.f7215a = 18;
        } else {
            l10Var.f7215a = 0;
        }
        com.tencent.mm.plugin.wallet_core.id_verify.h hVar = new com.tencent.mm.plugin.wallet_core.id_verify.h(this, walletGetUserInfoEvent, intent, activity, bundle2);
        walletGetUserInfoEvent.f192364d = hVar;
        hVar.run();
    }

    @Override // qs4.j, qs4.b, com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        boolean z17;
        boolean z18;
        android.os.Bundle bundle2 = bundle;
        a("forward", activity, "actionCode:" + i17, bundle2);
        int i18 = this.f213801c.getInt("real_name_verify_mode", this.f179315e);
        if (this.f179315e != i18) {
            this.f179315e = i18;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameProxyUI) {
            if (bundle2 == null) {
                bundle2 = this.f213801c;
            }
            if (bundle2 != null) {
                this.f179315e = bundle2.getInt("real_name_verify_mode", 0);
            } else {
                this.f179315e = 0;
            }
            this.f179319i = this.f179315e;
            bundle2.putBoolean("key_is_realname_verify_process", true);
            this.f179316f = bundle2.getString("realname_verify_process_jump_plugin", "");
            this.f179317g = bundle2.getString("realname_verify_process_jump_activity", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "mAllowIdVerify is  mAllowIdVerify: %s,mPluginName %s, mActivityName %s ", java.lang.Boolean.valueOf(bundle2.getInt("realname_verify_process_allow_idverify", 0) == 1), this.f179316f, this.f179317g);
            int i19 = this.f179315e;
            if (i19 == 0) {
                com.tencent.mm.wallet_core.model.i1.b(10);
                B(activity, com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI.class, bundle2);
                return;
            }
            if (i19 == 1) {
                bundle2.putBoolean("key_need_bind_response", true);
                if (L(activity, bundle2)) {
                    return;
                }
                com.tencent.mm.wallet_core.model.i1.b(10);
                super.A(activity, bundle2);
                return;
            }
            if (i19 == 2) {
                B(activity, com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI.class, bundle2);
                return;
            }
            if (i19 != 4) {
                return;
            }
            java.lang.String string = this.f213801c.getString("key_realname_scene");
            com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "realname scene: %s", string);
            if (I()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "direct go to verifySMS");
                com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter jsApiRequestWCPayRealnameVerifyParameter = (com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter) this.f213801c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
                this.f213801c.putString("key_real_name_token", jsApiRequestWCPayRealnameVerifyParameter.f177554e);
                this.f213801c.putString("realname_verify_process_req_key", jsApiRequestWCPayRealnameVerifyParameter.f177554e);
                B(activity, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI.class, bundle2);
                return;
            }
            com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter jsApiRequestWCPayRealnameVerifyParameter2 = (com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter) this.f213801c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
            if (jsApiRequestWCPayRealnameVerifyParameter2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter: %s", jsApiRequestWCPayRealnameVerifyParameter2.toString());
                z17 = jsApiRequestWCPayRealnameVerifyParameter2.f177553d.equals("home");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter is null");
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "direct go to realname home");
                H(activity, bundle2);
                return;
            }
            if (J()) {
                com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter jsApiRequestWCPayRealnameVerifyParameter3 = (com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter) this.f213801c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
                bundle2.putString("usertoken", jsApiRequestWCPayRealnameVerifyParameter3.f177554e);
                bundle2.putBoolean("realname_is_minor_bindcard", true);
                bundle2.putBoolean("should_block_usecase_stop_when_add_card_success", true);
                java.lang.String str = jsApiRequestWCPayRealnameVerifyParameter3.f177554e;
                bundle2.putString("key_real_name_token", str);
                bundle2.putString("realname_verify_process_req_key", str);
                B(activity, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI.class, bundle2);
                return;
            }
            com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter jsApiRequestWCPayRealnameVerifyParameter4 = (com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter) this.f213801c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
            if (jsApiRequestWCPayRealnameVerifyParameter4 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter: %s", jsApiRequestWCPayRealnameVerifyParameter4.toString());
                z18 = jsApiRequestWCPayRealnameVerifyParameter4.f177553d.equals("fillCardInfoUI");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter is null");
                z18 = false;
            }
            if (z18) {
                bundle2.putString("usertoken", ((com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter) this.f213801c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter")).f177554e);
                bundle2.putBoolean("realname_is_minor_bindcard", true);
                bundle2.putBoolean("should_block_usecase_stop_when_add_card_success", true);
                K(activity, bundle2);
                return;
            }
            if ("rename".equals(string)) {
                B(activity, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI.class, bundle2);
                return;
            } else if (bundle2.getBoolean("directGotoInputUI")) {
                B(activity, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI.class, bundle2);
                return;
            } else {
                H(activity, bundle2);
                return;
            }
        }
        int i27 = this.f179315e;
        if (i27 == 2) {
            if (activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI) {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, bundle2);
                return;
            }
            if (!(activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI)) {
                if (!(activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) && (activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI)) {
                    B(activity, com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI.class, bundle2);
                    this.f179315e = 2;
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "Abtest need Sm2Encrypt 1");
            if (bundle2 == null) {
                bundle2 = new android.os.Bundle();
            }
            bundle2.putBoolean("isNeedSm2Encrypt", true);
            bundle2.putInt("Sm2EncryptType", 5);
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.class, bundle2);
            return;
        }
        if (i27 == 1) {
            if (activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI) {
                if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
                    B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle2);
                    return;
                } else {
                    B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle2);
                    return;
                }
            }
            if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle2);
                return;
            } else {
                super.o(activity, i17, bundle);
                return;
            }
        }
        if (i27 != 4) {
            if (!(activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI)) {
                super.o(activity, i17, bundle);
                return;
            } else {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle2);
                this.f179315e = 1;
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI) {
            B(activity, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI.class, bundle2);
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI) {
            if (bundle2.getBoolean("realname_verify_process_need_bind_card", false)) {
                bundle2.putBoolean("should_block_usecase_stop_when_add_card_success", true);
                K(activity, bundle2);
                return;
            }
            boolean z19 = this.f213801c.getBoolean("realname_verify_process_show_bindcard_page", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "show bind page: %s", java.lang.Boolean.valueOf(z19));
            if (!z19) {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, bundle2);
                return;
            } else {
                bundle2.putBoolean("should_block_usecase_stop_when_add_card_success", true);
                B(activity, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI.class, bundle2);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI) {
            if (bundle2.getBoolean("realname_verify_process_do_bind", false)) {
                bundle2.putBoolean("should_block_usecase_stop_when_add_card_success", true);
                K(activity, bundle2);
                return;
            } else if (this.f213801c.getBoolean("realname_verify_process_verify_sms_without_bindcard", false)) {
                B(activity, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI.class, bundle2);
                return;
            } else {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, bundle2);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f179322l)) {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, bundle2);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "notify bind card");
            this.f179322l = null;
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putString("notifyType", "RealNameAfterVerifyPhoneSucc");
            ((h45.q) i95.n0.c(h45.q.class)).notifyAddPaycardUsecase(bundle3, "", new com.tencent.mm.plugin.wallet_core.id_verify.c(this));
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "Abtest need Sm2Encrypt 2");
            if (bundle2 == null) {
                bundle2 = new android.os.Bundle();
            }
            bundle2.putBoolean("isNeedSm2Encrypt", true);
            bundle2.putInt("Sm2EncryptType", 5);
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.class, bundle2);
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            B(activity, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI.class, bundle2);
            return;
        }
        if (!(activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI)) {
            super.o(activity, i17, bundle);
            return;
        }
        java.lang.String string2 = this.f213801c.getString("key_resetpwd");
        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "resetpwd: %s", string2);
        if ("resetpwd".equals(string2)) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, bundle2);
        } else {
            super.o(activity, i17, bundle);
        }
    }

    @Override // qs4.j, com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        if (!(mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI)) {
            return mMActivity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI ? new com.tencent.mm.plugin.wallet_core.id_verify.l(this, mMActivity, b0Var) : ((mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI) || (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI)) ? new com.tencent.mm.plugin.wallet_core.id_verify.o(this, mMActivity, b0Var) : mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI ? new com.tencent.mm.plugin.wallet_core.id_verify.p(this, mMActivity, b0Var) : mMActivity instanceof com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI ? new com.tencent.mm.plugin.wallet_core.id_verify.u(this, mMActivity, b0Var) : super.p(mMActivity, b0Var);
        }
        int i17 = this.f179315e;
        return (i17 == 2 || i17 == 4) ? new com.tencent.mm.plugin.wallet_core.id_verify.k(this, mMActivity, b0Var) : super.p(mMActivity, b0Var);
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public int q(com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        return com.tencent.mm.R.string.kne;
    }
}
