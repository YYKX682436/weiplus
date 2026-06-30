package com.tencent.mm.plugin.wallet.balance.ui.lqt;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletLqtCheckPwdInputDialogUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f177947d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f177948e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f177949f;

    public final void U6() {
        this.f177948e = com.tencent.mm.wallet_core.ui.r1.m(com.tencent.mm.sdk.platformtools.t8.F(this.f177948e, 0.0d));
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("sp_name", this.f177947d);
        create.putString(ya.b.PRICE, this.f177948e);
        ((h45.q) i95.n0.c(h45.q.class)).startUseCase("verifyPwdPay", create, new com.tencent.mm.plugin.wallet.balance.ui.lqt.h0(this));
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
        this.f177947d = getIntent().getStringExtra("lqt_fetch_pwd_title");
        this.f177948e = getIntent().getStringExtra("lqt_fetch_pwd_money");
        java.lang.String stringExtra = getIntent().getStringExtra("lqt_redeem_listid");
        this.f177949f = stringExtra;
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str = this.f177948e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        java.lang.String str2 = this.f177947d;
        objArr[1] = str2 != null ? str2 : "";
        objArr[2] = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtCheckPwdInputDialogUI", "hy: money : %s, title : %s, redeemListId: %s", objArr);
        if (!((com.tencent.mm.sdk.platformtools.t8.K0(this.f177947d) || com.tencent.mm.sdk.platformtools.t8.K0(this.f177948e)) ? false : true)) {
            db5.e1.m(getContext(), com.tencent.mm.R.string.ks_, 0, new com.tencent.mm.plugin.wallet.balance.ui.lqt.g0(this));
            return;
        }
        getWindow().setBackgroundDrawableResource(com.tencent.mm.R.color.a9e);
        w04.l.INSTANCE.ae();
        U6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
