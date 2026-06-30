package com.tencent.mm.plugin.wallet.pay.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletChangeBankcardUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements com.tencent.mm.plugin.wallet.pay.ui.c {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f178651z = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f178652d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f178653e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f178654f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.n8 f178655g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f178656h;

    /* renamed from: m, reason: collision with root package name */
    public int f178658m;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f178665t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.FavorPayInfo f178666u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pay.ui.d f178667v;

    /* renamed from: i, reason: collision with root package name */
    public int f178657i = 0;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f178659n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.o3 f178660o = null;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Authen f178661p = null;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f178662q = null;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.wallet.PayInfo f178663r = null;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f178664s = null;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.i0 f178668w = null;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f178669x = new com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI.AnonymousClass1(com.tencent.mm.app.a0.f53288d);

    /* renamed from: y, reason: collision with root package name */
    public boolean f178670y = false;

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent> {
        public AnonymousClass1(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 323604482;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
            com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent2 = walletRealNameResultNotifyEvent;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletChangeBankcardUI", "realnameNotifyListener %s", java.lang.Integer.valueOf(walletRealNameResultNotifyEvent2.f54973g.f6120a));
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
            int i17 = walletRealNameResultNotifyEvent2.f54973g.f6120a;
            am.l10 l10Var = walletGetUserInfoEvent.f54958g;
            if (i17 == -1) {
                l10Var.f7215a = 17;
            } else if (i17 == 0) {
                l10Var.f7215a = 18;
            } else {
                l10Var.f7215a = 0;
            }
            walletGetUserInfoEvent.f54959h.f7292a = new com.tencent.mm.plugin.wallet.pay.ui.e(this, walletRealNameResultNotifyEvent2);
            walletGetUserInfoEvent.e();
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.wallet.pay.ui.c
    public void R0(boolean z17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback");
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback, result.isSuccess is false");
            U6(this.f178665t);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback, result.isSuccess is true");
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178663r;
        payInfo.A = str;
        payInfo.B = str2;
        U6(this.f178665t);
    }

    public void U6(java.lang.String str) {
        this.f178661p.f179544f = str;
        boolean z17 = getInput().getBoolean("key_has_click_bind_new_card", false);
        int i17 = getInput().getInt("key_pay_flag");
        if (z17 && i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletChangeBankcardUI", "fix authen flag after bind card fail");
            this.f178661p.f179542d = 3;
        }
        if (this.f178659n != null) {
            getInput().putString("key_mobile", this.f178659n.field_mobile);
            getInput().putParcelable("key_bankcard", this.f178659n);
            com.tencent.mm.plugin.wallet_core.model.Authen authen = this.f178661p;
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f178659n;
            authen.f179546h = bankcard.field_bindSerial;
            authen.f179545g = bankcard.field_bankcardType;
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo = this.f178666u;
            if (favorPayInfo != null) {
                authen.H = favorPayInfo.f179667d;
            } else {
                authen.H = null;
            }
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f178662q;
            vr4.j0 j0Var = orders.N;
            if (j0Var != null) {
                authen.G = j0Var.f439756g;
            }
            if (orders != null && orders.f179679i == 3) {
                if (bankcard.y0()) {
                    this.f178661p.f179542d = 3;
                } else {
                    this.f178661p.f179542d = 6;
                }
                getInput().putBoolean("key_is_oversea", !this.f178659n.y0());
            }
        }
        getInput().putString("key_pwd1", str);
        getInput().putParcelable("key_authen", this.f178661p);
        as4.b a17 = zr4.a.a(this.f178661p, this.f178662q, false);
        if (a17 != null) {
            a17.setProcessName("PayProcess");
            a17.setProcessBundle(getInput());
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178663r;
            int i18 = payInfo.f192109e;
            if (i18 == 6 && payInfo.f192110f == 100) {
                a17.setScene(100);
            } else {
                a17.setScene(i18);
            }
            doSceneProgress(a17);
        }
    }

    public void V6(boolean z17) {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178663r;
        this.f178656h = X6((payInfo == null || payInfo.f192109e == 11) ? false : true);
        com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo = this.f178666u;
        if (favorPayInfo != null) {
            if ((favorPayInfo.f179668e != 0) && z17) {
                java.lang.String str = favorPayInfo.f179669f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < this.f178656h.size(); i17++) {
                    com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f178656h.get(i17);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        if (!bankcard.field_bankcardType.equalsIgnoreCase("CFT")) {
                            arrayList.add(bankcard);
                        }
                    } else if (bankcard.field_bankcardType.equals(str)) {
                        arrayList.add(bankcard);
                    }
                }
                this.f178656h = arrayList;
            }
        }
    }

    public com.tencent.mm.plugin.wallet_core.ui.o3 W6() {
        return new com.tencent.mm.plugin.wallet_core.ui.o3(this, this.f178656h, this.f178658m, this.f178662q);
    }

    public java.util.ArrayList X6(boolean z17) {
        return this.f178657i == 8 ? at4.l1.a(true) : at4.l1.a(false);
    }

    public void Y6(int i17) {
        java.util.ArrayList arrayList = this.f178656h;
        int size = arrayList != null ? arrayList.size() : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletChangeBankcardUI", "on select bankcard: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(size));
        java.util.ArrayList arrayList2 = this.f178656h;
        if (arrayList2 != null && i17 < size) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) arrayList2.get(i17);
            this.f178659n = bankcard;
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178663r;
            com.tencent.mm.wallet_core.model.a2.a(payInfo != null ? payInfo.f192109e : 0, payInfo != null ? payInfo.f192114m : "", 13, bankcard.field_bindSerial);
            this.f178660o.f180554h = bankcard.field_bindSerial;
            this.f178654f.setEnabled(true);
            this.f178660o.notifyDataSetChanged();
            Z6();
            return;
        }
        if (size == i17) {
            at4.n a17 = at4.n.a();
            if (a17.b()) {
                db5.e1.s(this, a17.f13902b, getString(com.tencent.mm.R.string.f490573yv));
                return;
            }
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = this.f178663r;
            com.tencent.mm.wallet_core.model.a2.a(payInfo2 != null ? payInfo2.f192109e : 0, payInfo2 == null ? "" : payInfo2.f192114m, 14, "");
            getInput().putInt("key_err_code", com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PLATFORMVIEWNOTFOUND);
            getInput().putBoolean("key_has_click_bind_new_card", true);
            com.tencent.mm.wallet_core.a.d(this, getInput());
        }
    }

    public void Z6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletChangeBankcardUI", "pay with old bankcard!");
        getInput().getString("key_pwd1");
        this.f178670y = false;
        setContentViewVisibility(4);
        com.tencent.mm.plugin.wallet_core.ui.n8 x17 = com.tencent.mm.plugin.wallet_core.ui.n8.x(this, true, this.f178662q, this.f178666u, this.f178659n, this.f178663r, null, new com.tencent.mm.plugin.wallet.pay.ui.j(this), new com.tencent.mm.plugin.wallet.pay.ui.k(this), new com.tencent.mm.plugin.wallet.pay.ui.l(this));
        this.f178655g = x17;
        this.f178668w = x17;
    }

    public final void a7(int i17) {
        if (-1 == i17) {
            com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
            if (g17 != null) {
                g17.c(this, 1);
            } else {
                finish();
            }
            com.tencent.mm.autogen.events.WalletRealNameResultNotifyMoreEvent walletRealNameResultNotifyMoreEvent = new com.tencent.mm.autogen.events.WalletRealNameResultNotifyMoreEvent();
            walletRealNameResultNotifyMoreEvent.f54974g.f6210a = i17;
            walletRealNameResultNotifyMoreEvent.e();
        }
    }

    public void b7() {
        this.f178653e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hdt);
        com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo = this.f178666u;
        if (favorPayInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(favorPayInfo.f179671h)) {
            this.f178653e.setVisibility(0);
            this.f178653e.setText(this.f178666u.f179671h);
        } else if (getInput().getInt("key_main_bankcard_state", 0) == 0) {
            this.f178653e.setVisibility(8);
        } else {
            this.f178653e.setVisibility(0);
            this.f178653e.setText(this.f178664s);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void cleanUiData(int i17) {
        if (i17 != 0) {
            if (i17 != 1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletChangeBankcardUI", "hy: clean ui data not handled");
                return;
            } else {
                getInput().putString("key_pwd1", "");
                Z6();
                return;
            }
        }
        cancelQRPay();
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
        if (g17 != null) {
            g17.f(this, getInput());
        } else {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d5w;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.kqi);
        this.f178654f = button;
        button.setEnabled(false);
        this.f178654f.setOnClickListener(new com.tencent.mm.plugin.wallet.pay.ui.g(this));
        if (com.tencent.mm.sdk.platformtools.t8.K0(getInput().getString("key_pwd1"))) {
            this.f178654f.setText(com.tencent.mm.R.string.f490507x1);
        } else {
            this.f178654f.setText(com.tencent.mm.R.string.kwt);
        }
        this.f178652d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mps);
        com.tencent.mm.plugin.wallet_core.ui.o3 W6 = W6();
        this.f178660o = W6;
        this.f178652d.setAdapter((android.widget.ListAdapter) W6);
        this.f178652d.setOnItemClickListener(new com.tencent.mm.plugin.wallet.pay.ui.h(this));
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.p_w);
        imageView.setClickable(true);
        imageView.setOnClickListener(new com.tencent.mm.plugin.wallet.pay.ui.i(this));
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.f487678pf1)).getPaint(), 0.8f);
        b7();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isTransparent() {
        boolean z17;
        if (super.isTransparent()) {
            return true;
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178663r;
        if (payInfo != null && (z17 = payInfo.f192112h)) {
            if (z17) {
                return true;
            }
            vr4.f1.wi().Ai().w();
        }
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletChangeBankcardUI", "onActivityResult %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 1) {
            a7(-1);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.wallet_core.ui.o3 o3Var;
        java.util.List list;
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.kzl);
        android.os.Bundle input = getInput();
        input.putInt("key_err_code", 0);
        this.f178658m = input.getInt("key_support_bankcard", 1);
        this.f178661p = (com.tencent.mm.plugin.wallet_core.model.Authen) input.getParcelable("key_authen");
        this.f178662q = (com.tencent.mm.plugin.wallet_core.model.Orders) input.getParcelable("key_orders");
        this.f178663r = (com.tencent.mm.pluginsdk.wallet.PayInfo) input.getParcelable("key_pay_info");
        this.f178666u = (com.tencent.mm.plugin.wallet_core.model.FavorPayInfo) input.getParcelable("key_favor_pay_info");
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178663r;
        int i17 = payInfo == null ? 0 : payInfo.f192109e;
        this.f178657i = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletChangeBankcardUI", "pay_scene %d", java.lang.Integer.valueOf(i17));
        if (getInput().getBoolean("key_is_filter_bank_type")) {
            V6(true);
        } else {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = this.f178663r;
            this.f178656h = X6((payInfo2 == null || payInfo2.f192109e == 11) ? false : true);
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f178662q;
        if (orders != null && (list = orders.M) != null && ((java.util.ArrayList) list).size() > 0) {
            com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.f178662q;
            this.f178664s = getString(com.tencent.mm.R.string.kjs, com.tencent.mm.wallet_core.ui.r1.n(orders2.f179678h, orders2.f179681m), ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f178662q.M).get(0)).f179707h);
        }
        initView();
        com.tencent.mm.wallet_core.model.n1.d(7, 0);
        this.f178669x.alive();
        if (!getInput().getBoolean("key_is_filter_bank_type") || (o3Var = this.f178660o) == null) {
            return;
        }
        o3Var.f180556m = false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.wallet.pay.ui.d dVar = this.f178667v;
        if (dVar != null) {
            dVar.a();
            com.tencent.mm.plugin.wallet.pay.ui.d dVar2 = this.f178667v;
            dVar2.f178754c = null;
            dVar2.f178753b = null;
        }
        this.f178669x.dead();
        this.f178668w = null;
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4 && this.f178666u != null && this.f178656h.size() == 0) {
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo = this.f178666u;
            int i18 = 0;
            if ((favorPayInfo == null || favorPayInfo.f179668e == 0) ? false : true) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletChangeBankcardUI", "favor need bankcard bind but usr cancel");
                java.lang.String string = getInput().getString("key_is_cur_bankcard_bind_serial");
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletChangeBankcardUI", "curBankcardBindSerial null & finish");
                    return super.onKeyUp(i17, keyEvent);
                }
                java.util.ArrayList X6 = X6(true);
                if (this.f178659n == null) {
                    while (true) {
                        if (i18 >= X6.size()) {
                            break;
                        }
                        if (string.equals(((com.tencent.mm.plugin.wallet_core.model.Bankcard) X6.get(i18)).field_bindSerial)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletChangeBankcardUI", "get cur bankcard, bind_serial:".concat(string));
                            this.f178659n = (com.tencent.mm.plugin.wallet_core.model.Bankcard) X6.get(i18);
                            break;
                        }
                        i18++;
                    }
                    if (this.f178659n == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WalletChangeBankcardUI", "mDefaultBankcard still null & finish");
                        return super.onKeyUp(i17, keyEvent);
                    }
                }
                Z6();
                return true;
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.wallet_core.ui.i0 i0Var = this.f178668w;
        if (i0Var != null) {
            i0Var.onActivityPause();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onProgressFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        getInput().putInt("key_err_code", 0);
        super.onResume();
        com.tencent.mm.plugin.wallet_core.ui.i0 i0Var = this.f178668w;
        if (i0Var != null) {
            i0Var.M0();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("pwd", this.f178665t);
            getInput().putBoolean("key_need_verify_sms", false);
            ((pz2.a) gm0.j1.s(pz2.a.class)).Ge(this.f178661p.f179557v.f192125x == 1, true, bundle);
            switch (i18) {
                case 100000:
                case 100001:
                case 100102:
                    this.f178663r.E = i18;
                    Z6();
                    return true;
                case 100100:
                case 100101:
                    com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f178663r;
                    payInfo.E = i18;
                    boolean z17 = i18 == 100100;
                    if (this.f178667v == null) {
                        this.f178667v = new com.tencent.mm.plugin.wallet.pay.ui.d(this, this);
                    }
                    this.f178667v.b(z17, payInfo.C, payInfo.f192114m);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletChangeBankcardUI", "mRegenFingerPrintRsaKey.genRsaKey isGenRsa is " + z17);
                    return true;
            }
        }
        if (m1Var instanceof cs4.f) {
            return true;
        }
        if (m1Var instanceof as4.b) {
            android.os.Bundle input = getInput();
            as4.b bVar = (as4.b) m1Var;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f178665t)) {
                input.putString("key_pwd1", this.f178665t);
            }
            input.putString("kreq_token", bVar.C);
            com.tencent.mm.plugin.wallet_core.model.Authen authen = bVar.B;
            input.putParcelable("key_authen", authen);
            input.putBoolean("key_need_verify_sms", !bVar.f13550z);
            input.putParcelable("key_pay_info", this.f178663r);
            input.putInt("key_pay_flag", 3);
            input.putInt("key_can_verify_tail", bVar.F);
            input.putString("key_verify_tail_wording", bVar.G);
            com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = bVar.f214061s;
            getInput().putBoolean("key_block_bind_new_card", bVar.H == 1);
            if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.D)) {
                input.putString("key_mobile", this.f178659n.field_mobile);
            } else {
                input.putString("key_mobile", bVar.D);
            }
            input.putString("key_QADNA_URL", bVar.E);
            if (realnameGuideHelper != null) {
                input.putParcelable("key_realname_guide_helper", realnameGuideHelper);
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("pwd", this.f178665t);
            mz2.a aVar = (mz2.a) ((pz2.a) gm0.j1.s(pz2.a.class));
            bundle2.putInt("key_open_biometric_type", aVar.a() ? 1 : aVar.b() ? 2 : 0);
            aVar.Ge(authen.f179557v.f192125x == 1, true, bundle2);
            if (bVar.isPaySuccess) {
                input.putParcelable("key_orders", bVar.A);
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = this.f178663r;
                if (payInfo2 != null && payInfo2.f192109e == 8) {
                    com.tencent.mm.autogen.events.WalletOfflineSetCardSerialEvent walletOfflineSetCardSerialEvent = new com.tencent.mm.autogen.events.WalletOfflineSetCardSerialEvent();
                    walletOfflineSetCardSerialEvent.f54963g.f7687a = this.f178661p.f179546h;
                    walletOfflineSetCardSerialEvent.e();
                }
            }
            com.tencent.mm.wallet_core.a.d(this, input);
            return true;
        }
        return false;
    }
}
