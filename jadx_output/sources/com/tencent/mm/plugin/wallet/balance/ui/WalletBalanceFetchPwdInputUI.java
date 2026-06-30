package com.tencent.mm.plugin.wallet.balance.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletBalanceFetchPwdInputUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f177763d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f177764e = "";

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog f177765f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f177766g;

    /* JADX WARN: Removed duplicated region for block: B:10:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI.U6():void");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void cleanUiData(int i17) {
        if (i17 == 0) {
            finish();
        } else if (i17 == 1) {
            U6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(4);
        this.f177763d = getInput().getString("key_pwd_cash_title");
        this.f177764e = getInput().getString("key_pwd_cash_money");
        this.f177766g = getInput().getString("key_report_session_id");
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f177764e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        java.lang.String str2 = this.f177763d;
        objArr[1] = str2 != null ? str2 : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchPwdInputUI", "hy: money : %s, title : %s", objArr);
        if (!((com.tencent.mm.sdk.platformtools.t8.K0(this.f177763d) || com.tencent.mm.sdk.platformtools.t8.K0(this.f177764e)) ? false : true)) {
            db5.e1.m(getContext(), com.tencent.mm.R.string.ks_, 0, new com.tencent.mm.plugin.wallet.balance.ui.a(this));
        } else {
            w04.l.INSTANCE.ae();
            U6();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, np5.f
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        super.onSceneEnd(i17, i18, str, m1Var, z17);
        if (m1Var instanceof as4.b) {
            setAuthState(false);
        }
    }
}
