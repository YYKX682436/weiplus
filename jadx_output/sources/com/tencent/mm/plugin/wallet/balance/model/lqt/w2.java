package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet.balance.model.lqt.i2 f177731a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.wallet_core.ui.WalletBaseUI f177732b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f177733c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f177734d;

    /* renamed from: e, reason: collision with root package name */
    public int f177735e;

    /* renamed from: f, reason: collision with root package name */
    public int f177736f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f177737g;

    /* renamed from: h, reason: collision with root package name */
    public int f177738h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f177739i;

    /* renamed from: j, reason: collision with root package name */
    public int f177740j;

    /* renamed from: k, reason: collision with root package name */
    public int f177741k;

    /* renamed from: l, reason: collision with root package name */
    public km5.b f177742l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f177743m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f177744n;

    /* renamed from: o, reason: collision with root package name */
    public r45.ff5 f177745o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f177746p;

    public w2() {
        this.f177731a = null;
        this.f177732b = null;
        this.f177743m = new java.util.HashMap();
        this.f177744n = false;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "%s pre redeem finish get redeemListId: %s", java.lang.Integer.valueOf(hashCode()), this.f177737g);
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f177732b;
        android.content.Intent intent = new android.content.Intent(walletBaseUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtCheckPwdInputDialogUI.class);
        intent.putExtra("lqt_fetch_pwd_title", walletBaseUI.getString(com.tencent.mm.R.string.kph));
        intent.putExtra("lqt_fetch_pwd_money", (this.f177736f / 100.0d) + "");
        intent.putExtra("lqt_redeem_listid", this.f177737g);
        walletBaseUI.startActivityForResult(intent, 456);
    }

    public final void b(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "doQueryPurchaseResult");
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f177732b;
        walletBaseUI.showLoading(false);
        java.lang.String stringExtra = walletBaseUI.getIntent().getStringExtra("operate_id");
        com.tencent.mm.plugin.wallet.balance.model.lqt.f2 f2Var = this.f177731a.f177656c;
        java.lang.String str2 = this.f177733c;
        java.lang.String str3 = this.f177734d;
        int i18 = this.f177735e;
        int i19 = this.f177738h;
        int i27 = this.f177741k;
        f2Var.getClass();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i27);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i17);
        km5.q qVar = new km5.q();
        qVar.y(str2, str3, valueOf, valueOf2, stringExtra, valueOf3, valueOf4);
        qVar.n(f2Var);
        ((km5.q) qVar.h(new com.tencent.mm.plugin.wallet.balance.model.lqt.u2(this, str))).s(new com.tencent.mm.plugin.wallet.balance.model.lqt.t2(this));
    }

    public final void c(r45.ff5 ff5Var, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        int i17 = ff5Var.f374285i;
        int i18 = 52;
        if (i17 == 2) {
            java.lang.String str = ff5Var.f374282f;
            int i19 = ff5Var.f374284h;
            if (bankcard == null) {
                bankcard = this.f177739i;
            }
            if (!this.f177744n || this.f177742l == null) {
                this.f177742l = km5.u.b();
            }
            this.f177742l.b();
            if (i19 > 0) {
                i18 = i19;
            } else if (this.f177738h == 0) {
                i18 = 45;
            }
            java.lang.String str2 = bankcard != null ? bankcard.field_bindSerial : "";
            java.lang.String str3 = bankcard != null ? bankcard.field_bankcardType : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "doKindaSaveLqt, startInWxAppPayUseCase reqKey:%s bindSerial:%s bankType:%s", str, str2, str3);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("prepayId", str);
            bundle.putString("bindSerial", str2);
            bundle.putString("bankType", str3);
            bundle.putInt("payScene", i18);
            bundle.putInt("payChannel", 0);
            if (this.f177741k == 14) {
                bundle.putInt("enableDuplicate", 1);
            } else {
                bundle.putInt("enableDuplicate", 0);
            }
            ((h45.q) i95.n0.c(h45.q.class)).startInWxAppPayUseCase(this.f177732b, bundle);
            return;
        }
        if (i17 == 3) {
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            create.putInt("payScene", 45);
            if (!android.text.TextUtils.isEmpty(ff5Var.f374282f)) {
                create.putString("prepay_id", ff5Var.f374282f);
            }
            create.putString("bankType", bankcard.field_bankcardType);
            create.putString("bindSerial", bankcard.field_bindSerial);
            if (this.f177741k == 14) {
                create.putBool("enableDuplicate", true);
            }
            if (!this.f177744n || this.f177742l == null) {
                this.f177742l = km5.u.b();
            }
            this.f177742l.b();
            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("jointPay", create, new com.tencent.mm.plugin.wallet.balance.model.lqt.q2(this, ff5Var, bankcard));
            return;
        }
        java.lang.String str4 = ff5Var.f374282f;
        int i27 = ff5Var.f374284h;
        if (bankcard == null) {
            bankcard = this.f177739i;
        }
        if (!this.f177744n || this.f177742l == null) {
            this.f177742l = km5.u.b();
        }
        this.f177742l.b();
        if (i27 > 0) {
            i18 = i27;
        } else if (this.f177738h == 0) {
            i18 = 45;
        }
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f177732b;
        java.lang.String str5 = bankcard != null ? bankcard.field_bindSerial : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            return;
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        payInfo.f192114m = str4;
        payInfo.f192116o = "";
        payInfo.f192117p = null;
        payInfo.f192109e = i18;
        payInfo.f192121t = null;
        payInfo.f192111g = 0;
        h45.a0.g(walletBaseUI, true, str5, payInfo, null, new android.content.Intent(), 123);
    }

    public void d(java.lang.String str) {
        if (this.f177740j == 1) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LQT_DEFAULTCARD_SAVE_STRING_SYNC, str);
        } else {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LQT_DEFAULTCARD_FETCH_STRING_SYNC, str);
        }
        com.tencent.mm.plugin.wallet.balance.model.lqt.l0 l0Var = com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q;
        boolean z17 = false;
        boolean z18 = this.f177740j == 1;
        l0Var.a(z18);
        r45.be4 be4Var = z18 ? l0Var.f177672a : l0Var.f177673b;
        if (be4Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtBindQueryInfoCache", "isReqAgainAfterDeal: %s", java.lang.Boolean.valueOf(be4Var.f370701i));
            z17 = be4Var.f370701i;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "saveOrfetchDone, req again after deal");
            e(this.f177740j, this.f177738h, 1);
        }
    }

    public void e(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "updateBindBankcard, mode: %s, accountType: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        km5.b b17 = km5.u.b();
        this.f177742l = b17;
        b17.b();
        if (i17 == 1) {
            new com.tencent.mm.plugin.wallet.balance.model.lqt.j(i18, i19).l().h(new com.tencent.mm.plugin.wallet.balance.model.lqt.k2(this, i19));
        } else {
            new com.tencent.mm.plugin.wallet.balance.model.lqt.k(i18, i19).l().h(new com.tencent.mm.plugin.wallet.balance.model.lqt.l2(this));
        }
    }

    public w2(com.tencent.mm.plugin.wallet.balance.model.lqt.d2 d2Var, com.tencent.mm.plugin.wallet.balance.model.lqt.i2 i2Var, com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, int i17, int i18) {
        this.f177731a = null;
        this.f177732b = null;
        this.f177743m = new java.util.HashMap();
        this.f177744n = false;
        this.f177731a = i2Var;
        this.f177732b = walletBaseUI;
        this.f177740j = i17;
    }
}
