package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class WalletVerifyIdCardUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f180126d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView f180127e;

    /* renamed from: f, reason: collision with root package name */
    public at4.t f180128f = new at4.t();

    /* renamed from: g, reason: collision with root package name */
    public boolean f180129g = false;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.wallet_core.model.s0 f180130h = new com.tencent.mm.plugin.wallet_core.ui.z9(this);

    public static void U6(com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI walletVerifyIdCardUI) {
        if (walletVerifyIdCardUI.getNetController() != null) {
            walletVerifyIdCardUI.f180127e.getText();
            at4.z0 z0Var = new at4.z0();
            z0Var.f14023b = walletVerifyIdCardUI.getInput().getString("key_pwd1");
            z0Var.f14035n = (com.tencent.mm.pluginsdk.wallet.PayInfo) walletVerifyIdCardUI.getInput().getParcelable("key_pay_info");
            z0Var.f14032k = 1;
            z0Var.f14034m = walletVerifyIdCardUI.getInput().getString("key_cre_type");
            z0Var.f14033l = walletVerifyIdCardUI.f180127e.getText();
            java.lang.String string = walletVerifyIdCardUI.getInput().getString("kreq_token");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (string == null) {
                string = "";
            }
            z0Var.f14025d = string;
            int i17 = walletVerifyIdCardUI.getInput().getInt("key_pay_flag", 0);
            if (i17 == 1) {
                z0Var.f14022a = "1";
            } else if (i17 != 2) {
                if (i17 == 3) {
                    if (walletVerifyIdCardUI.getInput().getBoolean("key_is_oversea", false)) {
                        z0Var.f14022a = "6";
                    } else {
                        z0Var.f14022a = "3";
                    }
                }
            } else if (walletVerifyIdCardUI.getInput().getBoolean("key_is_oversea", false)) {
                z0Var.f14022a = "5";
            } else {
                z0Var.f14022a = "2";
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) walletVerifyIdCardUI.getInput().getParcelable("key_bankcard");
            if (bankcard != null) {
                z0Var.f14026e = bankcard.field_bankcardType;
                z0Var.f14027f = bankcard.field_bindSerial;
                java.lang.String str = bankcard.field_arrive_type;
                z0Var.f14029h = str != null ? str : "";
            } else {
                java.lang.String string2 = walletVerifyIdCardUI.getInput().getString("key_bank_type");
                z0Var.f14026e = string2;
                if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                    z0Var.f14026e = walletVerifyIdCardUI.getInput().getString("key_bind_card_type", "");
                }
            }
            walletVerifyIdCardUI.getNetController().d(z0Var);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d8n;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f180126d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487765pr4);
        this.f180127e = (com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) findViewById(com.tencent.mm.R.id.f487764pr3);
        java.lang.String string = getInput().getString("key_true_name");
        java.lang.String string2 = getInput().getString("key_cre_name");
        java.lang.String string3 = getInput().getString("key_cre_type");
        this.f180126d.setText(getString(com.tencent.mm.R.string.kmi, string, string2));
        this.f180127e.setEditTextMaxLength(4);
        this.f180127e.setEditTextSize(34.0f);
        this.f180127e.setOnInputValidListener(new com.tencent.mm.plugin.wallet_core.ui.x9(this));
        if ("1".equals(string3)) {
            setEditFocusListener(this.f180127e, 1, false);
        } else {
            setEditFocusListener(this.f180127e, 1, true);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById;
        super.onCreate(bundle);
        this.f180128f = new at4.t(getInput());
        initView();
        getSupportActionBar().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.tencent.mm.R.color.aaw)));
        android.view.View j17 = getSupportActionBar().j();
        if (j17 != null && (findViewById = j17.findViewById(com.tencent.mm.R.id.d0v)) != null) {
            findViewById.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        }
        if (fp.h.c(21)) {
            if (fp.h.c(23)) {
                getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
            } else {
                getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.BW_90));
            }
        }
        setMMTitle("");
        setBackBtn(new com.tencent.mm.plugin.wallet_core.ui.v9(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onPreSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletVerifyIdCardUI", "onPreSceneEnd %s %s", java.lang.Integer.valueOf(i18), m1Var);
        if ((m1Var instanceof com.tencent.mm.wallet_core.model.t0) && i18 == 0) {
            this.f180129g = true;
            db5.t7.makeText(this, com.tencent.mm.R.string.f493584ku2, 0).show();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletVerifyIdCardUI", "tag it isCertInstalled ok");
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof com.tencent.mm.wallet_core.model.t0)) {
            return false;
        }
        if (i18 == 0 || !((com.tencent.mm.wallet_core.model.t0) m1Var).f213990f) {
            this.f180127e.a();
            return true;
        }
        db5.e1.G(getContext(), str, null, false, new com.tencent.mm.plugin.wallet_core.ui.y9(this));
        return true;
    }
}
