package com.tencent.mm.plugin.wallet.bind.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class WalletResetInfoUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements qp5.i0 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f178589r = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f178590d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f178591e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f178592f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f178593g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f178594h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView f178595i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f178596m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Authen f178597n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.ElementQuery f178598o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f178599p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f178600q;

    public final boolean U6() {
        boolean c17 = this.f178592f.c(null);
        if (this.f178595i.getVisibility() == 0) {
            if ((this.f178595i.f180721h == 0) && !this.f178594h.c(null)) {
                c17 = false;
            }
        }
        if (!this.f178593g.c(null)) {
            c17 = false;
        }
        if (this.f178596m == null || this.f178597n == null) {
            c17 = false;
        }
        if (c17) {
            this.f178590d.setEnabled(true);
            this.f178590d.setClickable(true);
        } else {
            this.f178590d.setEnabled(false);
            this.f178590d.setClickable(false);
        }
        return c17;
    }

    public final void V6() {
        int i17 = getInput().getInt("key_err_code", 408);
        if (i17 == 402) {
            setMMTitle(com.tencent.mm.R.string.kya);
            this.f178593g.setVisibility(0);
            this.f178599p.setText(com.tencent.mm.R.string.ky_);
        } else if (i17 != 403) {
            if (getInput().getBoolean("key_balance_change_phone_need_confirm_phone", true)) {
                setMMTitle(com.tencent.mm.R.string.kye);
                this.f178595i.setVisibility(0);
            } else {
                setMMTitle(com.tencent.mm.R.string.kyc);
            }
            if (this.f178600q != null) {
                this.f178599p.setText(java.lang.String.format(getString(com.tencent.mm.R.string.kyd), this.f178600q.field_bankPhone));
            }
            if (this.f178598o == null && this.f178600q != null) {
                this.f178598o = ((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d.a(this.f178600q.field_bankcardType);
            }
            com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = this.f178598o;
            if (elementQuery != null && elementQuery.f179652i) {
                this.f178593g.setVisibility(0);
            }
            com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery2 = this.f178598o;
            if (elementQuery2 != null && elementQuery2.f179653m) {
                this.f178592f.setVisibility(0);
            }
        } else {
            setMMTitle(com.tencent.mm.R.string.kyg);
            this.f178592f.setVisibility(0);
            this.f178599p.setText(com.tencent.mm.R.string.kyf);
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        this.f178590d = button;
        button.setOnClickListener(new com.tencent.mm.plugin.wallet.bind.ui.h0(this));
        U6();
        if (getInput().getInt("key_err_code", 408) == 408 && this.f178598o == null) {
            setContentViewVisibility(4);
        } else {
            setContentViewVisibility(0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d86;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f178599p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pex);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) getInput().getParcelable("key_switch_phone_reset_bank_card");
        if (bankcard == null) {
            bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) getInput().getParcelable("key_bankcard");
        }
        this.f178600q = bankcard;
        this.f178596m = (com.tencent.mm.plugin.wallet_core.model.Orders) getInput().getParcelable("key_orders");
        com.tencent.mm.plugin.wallet_core.model.Authen authen = (com.tencent.mm.plugin.wallet_core.model.Authen) getInput().getParcelable("key_authen");
        this.f178597n = authen;
        if (authen == null) {
            com.tencent.mars.xlog.Log.w("Micromsg.WalletResetInfoUI", "authen is null!");
            return;
        }
        if (android.text.TextUtils.isEmpty(getInput().getString("key_pwd1", ""))) {
            getInput().putString("key_pwd1", this.f178597n.f179544f);
            com.tencent.mars.xlog.Log.e("Micromsg.WalletResetInfoUI", "pwd is empty, reset it to input");
        }
        this.f178598o = (com.tencent.mm.plugin.wallet_core.model.ElementQuery) getInput().getParcelable("elemt_query");
        com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView walletPhoneInputView = (com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView) findViewById(com.tencent.mm.R.id.jn7);
        this.f178595i = walletPhoneInputView;
        this.f178594h = walletPhoneInputView.getPhoneNumberEt();
        boolean z17 = false;
        if (this.f178600q.f179571j3 == 1) {
            this.f178595i.c();
        } else {
            com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView walletPhoneInputView2 = this.f178595i;
            walletPhoneInputView2.f180721h = 0;
            u11.a aVar = (u11.a) ((java.util.HashMap) walletPhoneInputView2.f180722i).get("86");
            walletPhoneInputView2.f180724n = aVar.f423728b;
            java.lang.String str = aVar.f423729c;
            walletPhoneInputView2.f180723m = str;
            walletPhoneInputView2.f180717d.setText(str);
            walletPhoneInputView2.f180719f.setText(walletPhoneInputView2.f180724n);
            walletPhoneInputView2.f180717d.setVisibility(8);
            walletPhoneInputView2.f180719f.setVisibility(8);
            walletPhoneInputView2.f180720g.setVisibility(8);
        }
        android.widget.EditText editText = (android.widget.EditText) this.f178595i.findViewById(com.tencent.mm.R.id.f486388l30);
        setEditFocusListener(this.f178595i.getPhoneNumberEt(), 0, false);
        setEditFocusListener(this.f178595i.getPhoneNumberEt(), editText, 0, false, false, true);
        this.f178591e = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.aec);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.cqm);
        this.f178592f = walletFormView;
        qp5.p.d(this, walletFormView);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.cpz);
        this.f178593g = walletFormView2;
        qp5.p.c(this, walletFormView2);
        this.f178592f.setOnInputValidChangeListener(this);
        this.f178593g.setOnInputValidChangeListener(this);
        this.f178594h.setOnInputValidChangeListener(this);
        com.tencent.mm.wallet_core.ui.MMScrollView mMScrollView = (com.tencent.mm.wallet_core.ui.MMScrollView) findViewById(com.tencent.mm.R.id.f487680pf3);
        mMScrollView.a(mMScrollView, mMScrollView);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = this.f178600q;
        if (bankcard2 != null) {
            this.f178591e.setText(bankcard2.field_desc);
        } else {
            this.f178591e.setVisibility(8);
        }
        V6();
        if (getInput().getInt("key_err_code", 408) == 408 && this.f178598o == null) {
            z17 = true;
        }
        if (z17) {
            doSceneProgress(new ss4.z("", "", null), true);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (this.f178595i.d(i17, i18, intent)) {
            return;
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // qp5.i0
    public void onInputValidChange(boolean z17) {
        U6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            android.os.Bundle input = getInput();
            if ((m1Var instanceof as4.b) || (m1Var instanceof as4.c)) {
                as4.b bVar = (as4.b) m1Var;
                input.putBoolean("key_need_verify_sms", !bVar.f13550z);
                input.putString("kreq_token", bVar.C);
                if (bVar.isPaySuccess) {
                    input.putParcelable("key_orders", bVar.A);
                }
                com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = bVar.f214061s;
                if (realnameGuideHelper != null) {
                    input.putParcelable("key_realname_guide_helper", realnameGuideHelper);
                }
                input.putInt("key_err_code", 0);
                com.tencent.mm.wallet_core.a.d(this, input);
                return true;
            }
            if ((m1Var instanceof ss4.z) && this.f178600q != null) {
                at4.b1 b1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d;
                java.lang.String str2 = this.f178600q.field_bindSerial;
                b1Var.getClass();
                com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = null;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    java.util.List list = b1Var.f13811b;
                    if (list != null && list.size() != 0) {
                        java.util.Iterator it = b1Var.f13811b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.WalletBankElementManager", "hy: not found given element query");
                                break;
                            }
                            com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery2 = (com.tencent.mm.plugin.wallet_core.model.ElementQuery) it.next();
                            if (str2.equals(elementQuery2.f179647d)) {
                                elementQuery = elementQuery2;
                                break;
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WalletBankElementManager", "hy: element list is null. get element failed");
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WalletBankElementManager", "hy: bindSerail given is null");
                }
                this.f178598o = elementQuery;
                V6();
            }
        }
        return false;
    }
}
