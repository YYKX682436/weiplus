package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes9.dex */
public class WalletECardElementInputUI extends com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f181023d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.ElementQuery f181024e;

    public final void U6() {
        if (this.f181024e == null) {
            this.f181024e = new com.tencent.mm.plugin.wallet_core.model.ElementQuery();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f181024e.f179648e)) {
            this.f181023d.setText("");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f181024e.f179660t)) {
            this.f181023d.setText(this.f181024e.f179648e + " " + this.f181024e.f179660t);
            return;
        }
        if (2 == this.f181024e.f179658r) {
            this.f181023d.setText(this.f181024e.f179648e + " " + getString(com.tencent.mm.R.string.kki));
            return;
        }
        this.f181023d.setText(this.f181024e.f179648e + " " + getString(com.tencent.mm.R.string.kl8));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a4y;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.pbk);
        this.f181023d = walletFormView;
        walletFormView.setOnClickListener(new com.tencent.mm.plugin.wallet_ecard.ui.h(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.kao)).setOnClickListener(new com.tencent.mm.plugin.wallet_ecard.ui.i(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardElementInputUI", "onAcvityResult requestCode:" + i17);
        if (i18 != -1) {
            return;
        }
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
        } else {
            this.f181024e = (com.tencent.mm.plugin.wallet_core.model.ElementQuery) intent.getParcelableExtra("elemt_query");
            U6();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.bt9);
        initView();
        U6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
