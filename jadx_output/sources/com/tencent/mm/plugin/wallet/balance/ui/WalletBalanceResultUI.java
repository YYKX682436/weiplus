package com.tencent.mm.plugin.wallet.balance.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class WalletBalanceResultUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f177826h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f177827d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f177828e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f177829f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f177830g;

    public static void U6(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI walletBalanceResultUI) {
        if (!walletBalanceResultUI.getInput().containsKey("key_realname_guide_helper")) {
            walletBalanceResultUI.V6();
            return;
        }
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) walletBalanceResultUI.getInput().getParcelable("key_realname_guide_helper");
        if (realnameGuideHelper != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceResultUI");
            bundle.putString("realname_verify_process_jump_plugin", "wallet");
            realnameGuideHelper.a(walletBalanceResultUI, bundle, new com.tencent.mm.plugin.wallet.balance.ui.f1(walletBalanceResultUI), null);
            walletBalanceResultUI.getInput().remove("key_realname_guide_helper");
        }
    }

    public final void V6() {
        int i17 = getInput().getInt("key_pay_flag", 0);
        java.lang.String string = getInput().getString("key_pwd1");
        java.lang.String string2 = getInput().getString("key_verify_code");
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_bindcard_after_save_balance, 1);
        if (payInfo == null || Ni != 1) {
            next();
        } else if (this.f177830g == null) {
            doSceneProgress(new rr4.c(i17, string, string2, payInfo.f192114m, payInfo.f192109e, "0"));
        } else {
            doSceneProgress(new rr4.c(i17, string, string2, payInfo.f192114m, payInfo.f192109e, "1"), false);
            next();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d5a;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f177827d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pg8);
        this.f177828e = (android.widget.Button) findViewById(com.tencent.mm.R.id.pg7);
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f177829f;
        if (orders == null) {
            finish();
            return;
        }
        this.f177827d.setText(com.tencent.mm.wallet_core.ui.r1.n(orders.f179678h, orders.f179681m));
        this.f177828e.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.d1(this));
        setBackBtn(new com.tencent.mm.plugin.wallet.balance.ui.e1(this));
        this.f177830g = (com.tencent.mm.plugin.wallet_core.model.Bankcard) getInput().getParcelable("key_bankcard");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void next() {
        if (getNetController().d(this.f177829f)) {
            return;
        }
        super.next();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f177829f = (com.tencent.mm.plugin.wallet_core.model.Orders) getInput().getParcelable("key_orders");
        initView();
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        showHomeBtn(false);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof rr4.c)) {
            return false;
        }
        if (!((rr4.c) m1Var).f399226d) {
            return true;
        }
        if (i17 == 0 && i18 == 0) {
            at4.x1 Ai = vr4.f1.wi().Ai();
            Ai.getClass();
            Ai.f14006o = com.tencent.mm.sdk.platformtools.t8.i1();
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
            walletGetUserInfoEvent.f54958g.f7215a = 15;
            walletGetUserInfoEvent.f192364d = new com.tencent.mm.plugin.wallet.balance.ui.g1(this);
            walletGetUserInfoEvent.e();
        }
        next();
        return true;
    }
}
