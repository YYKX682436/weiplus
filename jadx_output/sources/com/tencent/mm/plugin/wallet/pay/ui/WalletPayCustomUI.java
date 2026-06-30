package com.tencent.mm.plugin.wallet.pay.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class WalletPayCustomUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public r45.an6 f178690d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f178691e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f178692f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f178693g = false;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(8);
        this.f178692f = getIntent().getStringExtra("INTENT_PAYFEE");
        this.f178691e = getIntent().getStringExtra("INTENT_TITLE");
        this.f178693g = getIntent().getIntExtra("INTENT_CAN_TOUCH", 0) == 1;
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("INTENT_TOKENMESS");
        r45.an6 an6Var = new r45.an6();
        this.f178690d = an6Var;
        try {
            an6Var.parseFrom(byteArrayExtra);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletPayCustomUI", e17, "", new java.lang.Object[0]);
        }
        r45.an6 an6Var2 = this.f178690d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayCustomUI", "mTokeMess packageex:%s busi_id:%s sign:%s can_use_touch %s mPayFee %s mTitle %s", an6Var2.f370156d, an6Var2.f370160h, an6Var2.f370157e, java.lang.Boolean.valueOf(this.f178693g), this.f178692f, this.f178691e);
        java.lang.String str = this.f178691e;
        java.lang.String str2 = this.f178692f;
        boolean z17 = this.f178693g;
        com.tencent.mm.plugin.wallet.pay.ui.u uVar = new com.tencent.mm.plugin.wallet.pay.ui.u(this);
        com.tencent.mm.plugin.wallet.pay.ui.v vVar = new com.tencent.mm.plugin.wallet.pay.ui.v(this);
        com.tencent.mm.plugin.wallet.pay.ui.w wVar = new com.tencent.mm.plugin.wallet.pay.ui.w(this);
        int i17 = com.tencent.mm.plugin.wallet_core.ui.v7.P;
        if (isFinishing()) {
            return;
        }
        com.tencent.mm.plugin.wallet_core.ui.v7 v7Var = new com.tencent.mm.plugin.wallet_core.ui.v7(this, com.tencent.mm.R.style.f494795wh);
        android.widget.Button button = v7Var.f180674e;
        if (button != null) {
            v7Var.f180690x = null;
            button.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.r7(v7Var));
        }
        android.widget.ImageView imageView = v7Var.f180675f;
        if (imageView != null) {
            v7Var.f180691y = vVar;
            imageView.setVisibility(0);
            v7Var.f180675f.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.s7(v7Var, vVar));
        }
        v7Var.setOnCancelListener(vVar);
        v7Var.setCancelable(true);
        v7Var.f180678i.setText(str);
        if (android.text.TextUtils.isEmpty(str2)) {
            v7Var.f180680n.setVisibility(8);
        } else {
            v7Var.f180680n.setVisibility(0);
            v7Var.f180680n.setText(str2);
        }
        android.view.View view = v7Var.f180686t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "showBankcardDes", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "showBankcardDes", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        v7Var.f180689w = wVar;
        if (android.text.TextUtils.isEmpty("")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdCustomDialog", "ChargeFee is null");
            v7Var.f180687u.setVisibility(8);
        } else {
            v7Var.f180687u.setVisibility(0);
            v7Var.f180687u.setText("");
        }
        v7Var.f180684r = uVar;
        v7Var.F = z17;
        if (!c01.z1.I()) {
            v7Var.o();
        }
        v7Var.show();
        db5.e1.a(this, v7Var);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayCustomUI", "errorType %s errCode %s, errmsg %s, scene %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var);
        if (!(m1Var instanceof ss4.c0)) {
            return false;
        }
        if (i17 == 0 && i18 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("INTENT_RESULT_TOKEN", ((ss4.c0) m1Var).f412027d);
            intent.putExtras(getIntent());
            setResult(-1, intent);
        }
        finish();
        return false;
    }
}
