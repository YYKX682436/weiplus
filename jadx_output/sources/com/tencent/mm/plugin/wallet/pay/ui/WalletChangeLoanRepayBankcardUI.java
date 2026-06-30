package com.tencent.mm.plugin.wallet.pay.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletChangeLoanRepayBankcardUI extends com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI {
    public java.lang.String A;

    @Override // com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI
    public com.tencent.mm.plugin.wallet_core.ui.o3 W6() {
        java.util.ArrayList arrayList = ((pg0.a3) i95.n0.c(pg0.a3.class)).bj().f13973a;
        this.f178656h = arrayList;
        if (arrayList != null) {
            java.util.Collections.sort(arrayList, new com.tencent.mm.plugin.wallet.pay.ui.f(this));
        }
        com.tencent.mm.plugin.wallet_core.ui.o3 o3Var = new com.tencent.mm.plugin.wallet_core.ui.o3(this, this.f178656h, this.f178658m, this.f178662q);
        o3Var.f180554h = this.A;
        return o3Var;
    }

    @Override // com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI
    public void Y6(int i17) {
        java.util.ArrayList arrayList = this.f178656h;
        int size = arrayList != null ? arrayList.size() : 0;
        java.util.ArrayList arrayList2 = this.f178656h;
        if (arrayList2 != null && i17 < size) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) arrayList2.get(i17);
            this.f178659n = bankcard;
            this.f178660o.f180554h = bankcard.field_bindSerial;
            this.f178654f.setEnabled(true);
            this.f178660o.notifyDataSetChanged();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("bindSerial", bankcard.field_bindSerial);
            intent.putExtra("ret", 0);
            setResult(-1, intent);
        } else if (size == i17) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("ret", com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PLATFORMVIEWNOTFOUND);
            setResult(-1, intent2);
        }
        finish();
    }

    @Override // com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI, com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.A = getIntent().getStringExtra("bindSerial");
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.wallet.pay.ui.m(this));
    }
}
