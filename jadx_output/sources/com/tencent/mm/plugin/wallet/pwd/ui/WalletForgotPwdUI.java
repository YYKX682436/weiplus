package com.tencent.mm.plugin.wallet.pwd.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletForgotPwdUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements qp5.i0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f178867t = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f178870f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.m0 f178871g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f178872h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f178873i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f178874m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f178875n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f178876o;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f178879r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f178880s;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f178868d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f178869e = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public boolean f178877p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f178878q = false;

    public WalletForgotPwdUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f178879r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanBankCardResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.7
            {
                this.__eventId = 96068484;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanBankCardResultEvent scanBankCardResultEvent) {
                com.tencent.mm.autogen.events.ScanBankCardResultEvent scanBankCardResultEvent2 = scanBankCardResultEvent;
                if (!(scanBankCardResultEvent2 instanceof com.tencent.mm.autogen.events.ScanBankCardResultEvent)) {
                    com.tencent.mars.xlog.Log.f("MicroMsg.WalletForgotPwdUI", "mismatched ScanBankCardResultEvent event");
                    return false;
                }
                com.tenpay.ndk.Encrypt encrypt = new com.tenpay.ndk.Encrypt();
                java.lang.String randomKey = encrypt.getRandomKey();
                java.lang.String desedeEncode = encrypt.desedeEncode(scanBankCardResultEvent2.f54727g.f7741a, randomKey);
                android.graphics.Bitmap bitmap = scanBankCardResultEvent2.f54727g.f7742b;
                int i17 = com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.f178867t;
                com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI walletForgotPwdUI = com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.this;
                walletForgotPwdUI.getClass();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("key_bankcard_id", desedeEncode);
                bundle.putString("key_bankcard_des", randomKey);
                bundle.putParcelable("key_bankcard_cropimg", bitmap);
                bundle.putBoolean("key_is_reset_with_new_card", true);
                com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(walletForgotPwdUI);
                if (g17 != null) {
                    g17.E(walletForgotPwdUI, com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI.class, bundle, 1);
                }
                return true;
            }
        };
        this.f178880s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletEntryChangeAccountEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.8
            {
                this.__eventId = 92672998;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public /* bridge */ /* synthetic */ boolean callback(com.tencent.mm.autogen.events.WalletEntryChangeAccountEvent walletEntryChangeAccountEvent) {
                return false;
            }
        };
    }

    public final boolean U6() {
        if (this.f178872h.getVisibility() == 0 || (this.f178876o.n() && this.f178875n.n())) {
            this.f178873i.setEnabled(true);
            this.f178873i.setClickable(true);
            return true;
        }
        this.f178873i.setEnabled(false);
        this.f178873i.setClickable(false);
        return false;
    }

    public final void V6() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_is_reset_with_new_card", getInput().getBoolean("key_is_reset_with_new_card", false));
        W6();
        if (this.f178870f == null && !this.f178877p) {
            doSceneProgress(new ss4.z(null, this.f178875n.getText(), null));
            return;
        }
        if (this.f178877p) {
            at4.v1 y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(y07.field_find_passwd_url)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdUI", "hy: not support bind new bankcard. start to url");
                com.tencent.mm.wallet_core.ui.r1.V(this, y07.field_find_passwd_url, false);
                return;
            }
            bundle.putBoolean("key_is_force_bind", true);
            bundle.putBoolean("key_is_reset_with_new_card", true);
            if (getProcess() != null) {
                getProcess().o(this, 0, bundle);
                return;
            }
            return;
        }
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
        bundle.putParcelable("key_bankcard", this.f178870f);
        com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = new com.tencent.mm.plugin.wallet_core.model.ElementQuery();
        java.util.Iterator it = this.f178869e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery2 = (com.tencent.mm.plugin.wallet_core.model.ElementQuery) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdUI", "helios:::" + elementQuery2.f179659s);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(elementQuery2.f179659s) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f178870f.field_bankcardType) && elementQuery2.f179659s.trim().equals(this.f178870f.field_bankcardType.trim())) {
                elementQuery = elementQuery2;
                break;
            }
        }
        bundle.putParcelable("elemt_query", elementQuery);
        if (g17 != null) {
            g17.o(this, 0, bundle);
        }
    }

    public final void W6() {
        getInput().remove("elemt_query");
        getInput().remove("key_bankcard");
        getInput().remove("bank_name");
        getInput().remove("key_card_id");
    }

    public final void X6() {
        java.util.ArrayList h17 = vr4.f1.wi().Ai().h();
        this.f178868d = h17;
        if (h17 == null || h17.size() == 0 || this.f178878q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdUI", "No bound bankcard process %s", java.lang.Boolean.valueOf(this.f178878q));
            this.f178868d = new java.util.ArrayList();
            this.f178874m.setVisibility(0);
            this.f178872h.setVisibility(8);
            setMMTitle(com.tencent.mm.R.string.klf);
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.pcc)).setText(getString(com.tencent.mm.R.string.ktj));
            this.f178876o.setText(com.tencent.mm.wallet_core.ui.r1.f0(vr4.f1.wi().Ai().q()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdUI", "domestic process!");
        if (com.tencent.mm.wallet_core.a.g(this) != null) {
            doSceneForceProgress(new ss4.z(3, null, null, null, null, -1, -1, 0));
        }
        this.f178874m.setVisibility(8);
        this.f178873i.setVisibility(8);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.jqw);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletForgotPwdUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/pwd/ui/WalletForgotPwdUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.wallet.pwd.ui.m0 m0Var = new com.tencent.mm.plugin.wallet.pwd.ui.m0(this, this);
        this.f178871g = m0Var;
        this.f178872h.setAdapter((android.widget.ListAdapter) m0Var);
        com.tencent.mm.plugin.wallet.pwd.ui.m0 m0Var2 = this.f178871g;
        m0Var2.f179034e = this.f178868d;
        m0Var2.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean checkProcLife() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean getCancelable() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d6l;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f178872h = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mpu);
        this.f178874m = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.gcq);
        this.f178876o = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.k3n);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.b9t);
        this.f178875n = walletFormView;
        qp5.p.a(walletFormView);
        if (getInput().getBoolean("key_is_paymanager", false)) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 = this.f178876o;
            if (walletFormView2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
            } else {
                walletFormView2.setOnInfoIvClickListener(new qp5.k(this));
                walletFormView2.setFilterChar("\\x20\\t\\r\\n".toCharArray());
            }
        } else {
            qp5.p.h(this, this.f178876o);
        }
        this.f178876o.setOnInputValidChangeListener(this);
        this.f178875n.setOnInputValidChangeListener(this);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        this.f178873i = button;
        button.setOnClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.e0(this));
        this.f178877p = false;
        this.f178868d = vr4.f1.wi().Ai().h();
        X6();
        findViewById(com.tencent.mm.R.id.jqw).setOnClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.f0(this));
        U6();
        setEditFocusListener(this.f178875n, 0, false, false);
        this.f178875n.setOnInfoIvClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.g0(this));
        this.f178875n.getInfoIv().setClickable(true);
        this.f178875n.getInfoIv().setImageResource(com.tencent.mm.R.raw.wallet_scan_camera);
        this.f178875n.getInfoIv().setVisibility(0);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isTransparent() {
        java.util.ArrayList arrayList = this.f178868d;
        if (arrayList != null && arrayList.size() != 0) {
            return false;
        }
        at4.v1 y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
        return (com.tencent.mm.sdk.platformtools.t8.K0(y07.field_find_passwd_url) && com.tencent.mm.sdk.platformtools.t8.K0(y07.field_forget_passwd_url)) ? false : true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return !(this instanceof com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdBindNewUI);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i17, intent);
        if (i18 == -1 && 1 == i17) {
            this.f178875n.set3DesValStr(intent.getStringExtra("key_bankcard_id"));
            V6();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.kui);
        boolean z17 = getInput().getBoolean("key_is_force_bind", false);
        this.f178878q = z17;
        if (!z17) {
            doSceneProgress(new ss4.e0(null, 6));
            setContentViewVisibility(4);
        }
        initView();
        this.f178879r.alive();
        this.f178880s.alive();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f178879r.dead();
        this.f178880s.dead();
        super.onDestroy();
    }

    @Override // qp5.i0
    public void onInputValidChange(boolean z17) {
        U6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onProgressFinish() {
        setContentViewVisibility(isTransparent() ? 4 : 0);
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        X6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdUI", " errCode: %s errMsg :  scene: ", java.lang.Integer.valueOf(i18), str, m1Var);
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof ss4.z) {
                ss4.z zVar = (ss4.z) m1Var;
                android.os.Bundle bundle = new android.os.Bundle();
                if (com.tencent.mm.sdk.platformtools.t8.K0(zVar.f412149f)) {
                    this.f178869e = zVar.f412147d;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdUI", "scene case 1 mCardId is null");
                    return true;
                }
                com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = zVar.f412148e;
                if (elementQuery == null) {
                    bundle.putString("bank_name", "");
                    bundle.putParcelable("elemt_query", new com.tencent.mm.plugin.wallet_core.model.ElementQuery());
                    bundle.putString("key_card_id", this.f178875n.getText());
                    bundle.putBoolean("key_is_reset_with_new_card", true);
                    com.tencent.mm.wallet_core.a.d(this, bundle);
                } else {
                    if (elementQuery.c()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdUI", "scene case 2 mTargetElement is error");
                        db5.e1.i(this, com.tencent.mm.R.string.kfs, com.tencent.mm.R.string.f490573yv);
                        return true;
                    }
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    java.util.ArrayList arrayList = this.f178868d;
                    objArr[0] = java.lang.Integer.valueOf(arrayList == null ? 0 : arrayList.size());
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdUI", "scene case 3 bankcards size %d", objArr);
                    java.util.ArrayList arrayList2 = this.f178868d;
                    if (arrayList2 == null || arrayList2.size() == 0) {
                        W6();
                        bundle.putString("bank_name", zVar.f412148e.f179648e);
                        bundle.putParcelable("elemt_query", zVar.f412148e);
                        bundle.putString("key_card_id", this.f178875n.getText());
                        bundle.putBoolean("key_is_reset_with_new_card", true);
                        com.tencent.mm.wallet_core.a.d(this, bundle);
                        return true;
                    }
                }
            } else if (m1Var instanceof ss4.e0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                objArr2[0] = java.lang.Boolean.valueOf(this.f178871g == null);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdUI", "scene case queryBound adapter is null ? %s", objArr2);
                if (this.f178871g != null) {
                    java.util.ArrayList h17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj() != null ? ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().h() : null;
                    com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
                    if (g17 != null) {
                        g17.f213801c.getInt("key_support_bankcard", 1);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.util.Iterator it = h17.iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
                            int i19 = bankcard.field_bankcardTag;
                            if (i19 == 1) {
                                arrayList3.add(bankcard);
                            } else if (i19 == 2) {
                                arrayList4.add(bankcard);
                            }
                        }
                        if (arrayList3.size() > 0) {
                            this.f178868d = arrayList3;
                        } else {
                            this.f178868d = arrayList4;
                        }
                    }
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    java.util.ArrayList arrayList5 = this.f178868d;
                    objArr3[0] = java.lang.Integer.valueOf(arrayList5 == null ? 0 : arrayList5.size());
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdUI", "scene case queryBound adapter update bankcardsize:  %d", objArr3);
                    this.f178871g.f179034e = this.f178868d;
                    new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.wallet.pwd.ui.h0(this));
                }
            }
        }
        return false;
    }
}
