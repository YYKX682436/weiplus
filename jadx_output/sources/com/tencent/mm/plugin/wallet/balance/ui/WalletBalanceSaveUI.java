package com.tencent.mm.plugin.wallet.balance.ui;

@db5.a(2)
/* loaded from: classes9.dex */
public class WalletBalanceSaveUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements mp5.v {
    public static final /* synthetic */ int A = 0;

    /* renamed from: d, reason: collision with root package name */
    public double f177831d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f177832e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f177833f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f177834g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f177835h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f177836i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f177837m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f177838n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f177839o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f177840p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f177841q;

    /* renamed from: r, reason: collision with root package name */
    public ss4.m0 f177842r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f177843s;

    /* renamed from: t, reason: collision with root package name */
    public hs4.d f177844t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f177845u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f177846v;

    /* renamed from: w, reason: collision with root package name */
    public int f177847w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.Runnable f177848x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.Runnable f177849y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashMap f177850z;

    public WalletBalanceSaveUI() {
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 270);
        this.f177843s = false;
        this.f177846v = false;
        this.f177847w = 0;
        this.f177848x = new com.tencent.mm.plugin.wallet.balance.ui.b2(this);
        this.f177849y = new com.tencent.mm.plugin.wallet.balance.ui.c2(this);
        this.f177850z = new java.util.HashMap();
    }

    public void U6() {
        if (this.f177833f != null) {
            if (W6()) {
                double d17 = this.f177831d;
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f177833f;
                X6(d17, "CNY", bankcard.field_bindSerial, bankcard.field_bankcardType);
                return;
            } else {
                double d18 = this.f177831d;
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = this.f177833f;
                doSceneProgress(new rr4.d(d18, "CNY", bankcard2.field_bindSerial, bankcard2.field_bankcardType));
                return;
            }
        }
        at4.n a17 = at4.n.a();
        if (a17.b()) {
            db5.e1.s(this, a17.f13902b, getString(com.tencent.mm.R.string.f490573yv));
        } else if (W6()) {
            X6(this.f177831d, "CNY", "", "");
        } else {
            doSceneProgress(new rr4.d(this.f177831d, "CNY", "", ""));
        }
    }

    public final void V6() {
        if (this.f177842r == null) {
            this.f177838n.setVisibility(8);
            return;
        }
        this.f177838n.setVisibility(0);
        this.f177839o.setText(this.f177842r.f412096a);
        this.f177840p.setText(this.f177842r.f412097b);
        this.f177838n.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.v1(this));
    }

    public final boolean W6() {
        com.tencent.mm.wallet_core.b.a().getClass();
        com.tencent.mm.wallet_core.b a17 = com.tencent.mm.wallet_core.b.a();
        a17.getClass();
        boolean d17 = a17.d(e42.d0.clicfg_open_kinda_wallet_balance_save, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "wallet balance save isOpenKinda isKindaEnable: %s，isKindaWalletBalanceSave: %s", java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(d17));
        return d17;
    }

    public final void X6(double d17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("payScene", 11);
        bundle.putString("totalFee", com.tencent.mm.wallet_core.ui.r1.h0("" + d17, "100", 0, java.math.RoundingMode.HALF_UP).toString());
        bundle.putString("feeType", str);
        bundle.putString("bankType", str3);
        bundle.putString("bindSerial", str2);
        bundle.putString("reportSessionId", this.f177845u);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "startWalletBalanceSaveUseCase totalFee：%s reportSessionId %s", com.tencent.mm.wallet_core.ui.r1.h0("" + d17, "100", 0, java.math.RoundingMode.HALF_UP).toString(), this.f177845u);
        this.f177846v = true;
        ((h45.q) i95.n0.c(h45.q.class)).startWalletBalanceSaveUseCase(this, bundle);
    }

    public final void Y6() {
        if (com.tencent.mm.sdk.platformtools.t8.F(this.f177835h.getText(), 0.0d) <= 0.0d || !this.f177835h.n()) {
            this.mWcKeyboard.e(false);
        } else {
            this.mWcKeyboard.e(true);
        }
    }

    public final void Z6() {
        android.widget.LinearLayout linearLayout = this.f177836i;
        if (linearLayout != null) {
            if (this.f177833f != null) {
                android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(com.tencent.mm.R.id.ael);
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f177833f;
                at4.k c17 = dt4.b.c(this, bankcard.field_bankcardType, bankcard.F0());
                java.lang.String str = c17 != null ? c17.f13878a : "";
                imageView.setImageBitmap(null);
                if (this.f177833f.v0()) {
                    imageView.setBackgroundResource(com.tencent.mm.R.drawable.ch9);
                } else {
                    y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                    gt4.c1 c1Var = new gt4.c1(str);
                    ((x60.e) fVar).getClass();
                    android.graphics.Bitmap d17 = x51.w0.d(c1Var);
                    ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.tencent.mm.plugin.wallet.balance.ui.u1(this, imageView));
                    if (d17 != null) {
                        imageView.setImageBitmap(com.tencent.mm.sdk.platformtools.x.S(d17, getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), true, false));
                    }
                }
                android.widget.TextView textView = (android.widget.TextView) this.f177836i.findViewById(com.tencent.mm.R.id.acd);
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = this.f177833f;
                textView.setText(getString(com.tencent.mm.R.string.kfi, bankcard2.field_bankName, bankcard2.field_bankcardTail));
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f177833f.field_avail_save_wording)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "hy: wording's missing. use default");
                    ((android.widget.TextView) this.f177836i.findViewById(com.tencent.mm.R.id.h0a)).setText("");
                } else {
                    ((android.widget.TextView) this.f177836i.findViewById(com.tencent.mm.R.id.h0a)).setText(this.f177833f.field_avail_save_wording);
                    ((android.widget.TextView) this.f177836i.findViewById(com.tencent.mm.R.id.h0a)).setVisibility(0);
                }
            } else {
                ((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.acd)).setText(this.f177834g);
                ((android.widget.TextView) this.f177836i.findViewById(com.tencent.mm.R.id.h0a)).setText("");
                ((android.widget.ImageView) this.f177836i.findViewById(com.tencent.mm.R.id.ael)).setImageBitmap(null);
            }
            ((android.widget.TextView) this.f177836i.findViewById(com.tencent.mm.R.id.f487682pf5)).setText(com.tencent.mm.R.string.kfh);
        }
    }

    public final void fetchData() {
        at4.x1 Ai = vr4.f1.wi().Ai();
        java.util.ArrayList j17 = Ai.j();
        this.f177832e = j17;
        com.tencent.mm.plugin.wallet_core.model.Bankcard k17 = Ai.k(j17, null, false, true);
        this.f177833f = k17;
        if (k17 != null && com.tencent.mm.sdk.platformtools.t8.K0(k17.field_forbidWord)) {
            this.f177833f = null;
            int i17 = 0;
            while (true) {
                if (i17 >= this.f177832e.size()) {
                    break;
                }
                if (this.f177832e.get(i17) != null && com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f177832e.get(i17)).field_forbidWord)) {
                    this.f177833f = (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f177832e.get(i17);
                    break;
                }
                i17++;
            }
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f177833f;
        if (bankcard != null && !com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbidWord)) {
            this.f177833f = null;
        }
        java.util.ArrayList arrayList = this.f177832e;
        if (arrayList == null) {
            return;
        }
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            java.lang.String str = ((com.tencent.mm.plugin.wallet_core.model.Bankcard) arrayList.get(i18)).field_forbidWord;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d5b;
    }

    @Override // mp5.v
    public void h4(float f17) {
        android.view.ViewGroup viewGroup = this.f177837m;
        if (viewGroup != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.bottomMargin = (int) f17;
            this.f177837m.setLayoutParams(layoutParams);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.kfo);
        this.f177837m = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.m9s);
        this.f177835h = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f485972jq4);
        this.f177838n = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iw9);
        this.f177839o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iw_);
        this.f177840p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iw8);
        this.mWcKeyboard = new com.tencent.mm.wallet_core.keyboard.WcPayKeyboard(this);
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.f177841q = wcPayBannerView;
        wcPayBannerView.a();
        qp5.p.g(this.f177835h);
        this.f177835h.getTitleTv().setText(com.tencent.mm.wallet_core.model.c2.b());
        this.mWcKeyboard.d(this, -1);
        setWPKeyboard(this.f177835h.getContentEt(), true, false);
        this.mWcKeyboard.setActionText(getString(com.tencent.mm.R.string.kf8));
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((or4.c) pf5.z.f353948a.a(activity).a(or4.c.class)).setValue("keyboard_title_key", getString(com.tencent.mm.R.string.kf8));
        final com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = new com.tencent.mm.autogen.events.WalletGetBulletinEvent();
        walletGetBulletinEvent.f54955g.f6893a = "19";
        walletGetBulletinEvent.f192364d = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI.this.f177841q.setBannerData(walletGetBulletinEvent.f54956h.f6998e);
            }
        };
        walletGetBulletinEvent.e();
        this.f177835h.b(new com.tencent.mm.plugin.wallet.balance.ui.d2(this));
        this.f177835h.getContentEt().setOnEditorActionListener(new com.tencent.mm.plugin.wallet.balance.ui.h1(this, new com.tencent.mm.plugin.wallet.balance.ui.e2(this)));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.acc);
        this.f177836i = linearLayout;
        if (linearLayout != null) {
            com.tencent.mm.wallet_core.ui.r1.d((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.acd));
            this.f177836i.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.i1(this));
        }
        setTenpayKBStateListener(new com.tencent.mm.plugin.wallet.balance.ui.j1(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isHandleAutoShowNormalStWcKb() {
        this.mWcKeyboard.o();
        return this.mWcKeyboard.o();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(2);
        this.f177845u = java.util.UUID.randomUUID().toString();
        if (!c01.z1.I()) {
            doSceneProgress(new ss4.h0(null, 3), false);
        }
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.BW_BG_95));
        hideActionbarLine();
        fetchData();
        this.f177834g = getString(com.tencent.mm.R.string.kfk);
        initView();
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_BALANCE_LQT_OPERATION_STRING_SYNC, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                this.f177842r = ss4.m0.a(new org.json.JSONObject(str));
                V6();
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletBalanceSaveUI", e17, "", new java.lang.Object[0]);
            }
        }
        Z6();
        com.tencent.mm.wallet_core.model.n1.d(3, 0);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.sdk.platformtools.u3.l(this.f177848x);
        com.tencent.mm.sdk.platformtools.u3.l(this.f177849y);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.widget.dialog.l
    public void onDialogDismiss(android.app.Dialog dialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "onDialogDismiss()");
        com.tencent.mm.sdk.platformtools.u3.i(this.f177848x, 300L);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i17, keyEvent)) {
            return super.onKeyUp(i17, keyEvent);
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.mWcKeyboard.p()) {
            return;
        }
        this.f177847w = 3;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f177843s) {
            doSceneProgress(new ss4.h0(null, 3), false);
        }
        if (this.f177847w == 3 && isHandleAutoShowNormalStWcKb() && !this.f177846v) {
            com.tencent.mm.sdk.platformtools.u3.i(this.f177849y, 300L);
        }
        this.f177847w = 2;
        Y6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        rr4.d dVar;
        boolean z17;
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof rr4.d) {
                rr4.d dVar2 = (rr4.d) m1Var;
                if ("1".equals(dVar2.f399228e)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "need realname verify");
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceSaveUI");
                    bundle.putString("realname_verify_process_jump_plugin", "wallet");
                    dVar = dVar2;
                    z17 = zs4.q.g(this, dVar2.f399229f, 0, dVar2.f399230g, dVar2.f399231h, bundle, isTransparent(), null, null, 0, 2);
                } else {
                    dVar = dVar2;
                    if ("2".equals(dVar.f399228e)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "need upload credit");
                        zs4.q.h(this, dVar.f399229f, dVar.f399232i, dVar.f399230g, dVar.f399231h, isTransparent(), null);
                        z17 = true;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "realnameGuideFlag =  " + dVar.f399228e);
                        z17 = false;
                    }
                }
                if (z17) {
                    return false;
                }
                java.lang.String str2 = dVar.f399227d;
                com.tencent.mm.wallet_core.model.a2.b(11, str2, i18);
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f177833f;
                java.lang.String str3 = bankcard == null ? "" : bankcard.field_bindSerial;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
                    payInfo.f192114m = str2;
                    payInfo.f192116o = "";
                    payInfo.f192117p = null;
                    payInfo.f192109e = 11;
                    payInfo.f192121t = null;
                    payInfo.f192111g = 0;
                    h45.a0.g(this, true, str3, payInfo, null, new android.content.Intent(), 1);
                }
            } else if (m1Var instanceof ss4.h0) {
                ss4.h0 h0Var = (ss4.h0) m1Var;
                if (!this.f177843s) {
                    fetchData();
                    Z6();
                }
                this.f177843s = false;
                this.f177842r = h0Var.E;
                V6();
            }
        } else if (m1Var instanceof rr4.d) {
            com.tencent.mm.wallet_core.model.a2.b(11, "", i18);
            com.tencent.mm.sdk.platformtools.u3.i(this.f177848x, 300L);
        }
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(or4.c.class);
    }
}
