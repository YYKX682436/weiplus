package com.tencent.mm.plugin.wallet_ecard.ui;

@db5.a(19)
/* loaded from: classes8.dex */
public class WalletECardFinishUI extends com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f181025d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f181026e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a4z;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        r45.x15 x15Var;
        this.f181026e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cut);
        byte[] byteArray = getInput().getByteArray("key_open_card_finish_title");
        if (byteArray != null) {
            try {
                if (byteArray.length != 0 && (x15Var = (r45.x15) new r45.x15().parseFrom(byteArray)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(x15Var.f389664e)) {
                    this.f181026e.setText(x15Var.f389664e);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletECardFinishUI", e17, "", new java.lang.Object[0]);
            }
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.g68);
        this.f181025d = button;
        button.setOnClickListener(new com.tencent.mm.plugin.wallet_ecard.ui.k(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        setMMTitle("");
        enableBackMenu(false);
        setBackBtn(new com.tencent.mm.plugin.wallet_ecard.ui.j(this));
        showHomeBtn(false);
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
