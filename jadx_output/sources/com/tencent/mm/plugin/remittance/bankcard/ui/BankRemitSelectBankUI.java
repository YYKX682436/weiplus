package com.tencent.mm.plugin.remittance.bankcard.ui;

/* loaded from: classes9.dex */
public class BankRemitSelectBankUI extends com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSortView f156537e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488187jx;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSortView bankRemitSortView = (com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSortView) findViewById(com.tencent.mm.R.id.az7);
        this.f156537e = bankRemitSortView;
        bankRemitSortView.setOnItemClickListener(new qw3.j1(this));
    }

    @Override // com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.aet);
        addSceneEndListener(v31.k.CTRL_INDEX);
        initView();
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectBankUI", "do fetch data");
        ow3.g gVar = new ow3.g();
        gVar.K(this);
        doSceneProgress(gVar);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(v31.k.CTRL_INDEX);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof ow3.g)) {
            return false;
        }
        ow3.g gVar = (ow3.g) m1Var;
        gVar.O(new qw3.k1(this, gVar));
        if (gVar.f214032m) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitSelectBankUI", "response error: %s, %s", java.lang.Integer.valueOf(gVar.f349408s.f382909d), gVar.f349408s.f382910e);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(gVar.f349408s.f382910e)) {
                dp.a.makeText(this, gVar.f349408s.f382910e, 1).show();
            }
        }
        if (!gVar.f214031i) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitSelectBankUI", "net error: %s", gVar);
        return false;
    }
}
