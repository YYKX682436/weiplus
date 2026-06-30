package com.tencent.mm.plugin.wallet_core.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class WalletSelectBankcardUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f180088d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MaxListView f180089e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f180090f;

    /* renamed from: g, reason: collision with root package name */
    public int f180091g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f180092h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f180093i = true;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f180094m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f180095n = null;

    public static void U6(com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI walletSelectBankcardUI, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        walletSelectBankcardUI.getInput().putParcelable("key_bankcard", bankcard);
        walletSelectBankcardUI.getNetController().d(new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d8a;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.kfr);
        this.f180091g = getInput().getInt("key_scene", 0);
        this.f180092h = getInput().getString("key_top_tips");
        this.f180093i = getInput().getBoolean("key_is_show_new_bankcard", true);
        this.f180094m = getInput().getString("bottom_tips");
        java.util.ArrayList parcelableArrayList = getInput().getParcelableArrayList("key_showing_bankcards");
        this.f180095n = parcelableArrayList;
        if (parcelableArrayList == null) {
            this.f180095n = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().h();
        }
        this.f180088d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ode);
        this.f180089e = (com.tencent.mm.ui.base.MaxListView) findViewById(com.tencent.mm.R.id.aem);
        this.f180090f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.avy);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f180092h)) {
            this.f180088d.setVisibility(8);
        } else {
            this.f180088d.setVisibility(0);
            this.f180088d.setText(this.f180092h);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f180094m)) {
            this.f180090f.setVisibility(8);
        } else {
            this.f180090f.setVisibility(0);
            this.f180090f.setText(this.f180094m);
        }
        if (this.f180091g == 0) {
            this.f180090f.setVisibility(0);
            com.tencent.mm.plugin.wallet_core.ui.b4 b4Var = new com.tencent.mm.plugin.wallet_core.ui.b4(this);
            b4Var.f180146d = new com.tencent.mm.plugin.wallet_core.ui.o8(this);
            java.lang.String string = getString(com.tencent.mm.R.string.f493612kz0);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(b4Var, string.length() - 14, string.length(), 33);
            this.f180090f.setText(spannableString);
            this.f180090f.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        this.f180089e.setAdapter((android.widget.ListAdapter) new com.tencent.mm.plugin.wallet_core.ui.t8(this, null));
        this.f180089e.setOnItemClickListener(new com.tencent.mm.plugin.wallet_core.ui.r8(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
