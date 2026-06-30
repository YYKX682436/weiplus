package com.tencent.mm.plugin.wallet.balance.ui.lqt;

@db5.a(1)
/* loaded from: classes9.dex */
public class WalletLqtSimpleCheckPwdUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f178083d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f178084e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView f178085f;

    /* renamed from: g, reason: collision with root package name */
    public ss4.x f178086g;

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void cleanUiData(int i17) {
        super.cleanUiData(i17);
        com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = this.f178085f;
        if (editHintPasswdView != null) {
            editHintPasswdView.a();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d5z;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f178083d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pes);
        this.f178084e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pen);
        this.f178085f = (com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) findViewById(com.tencent.mm.R.id.hdh);
        com.tencent.mm.wallet_core.ui.r1.d(this.f178083d);
        hideKeyboardPushDownBtn();
        qp5.p.b(this.f178085f);
        this.f178085f.setOnInputValidListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.c8(this));
        this.f178084e.setText(com.tencent.mm.R.string.f493558kq0);
        setEditFocusListener(this.f178085f, 0, false);
        showTenpayKB();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1);
        setBackBtn(new com.tencent.mm.plugin.wallet.balance.ui.lqt.b8(this));
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof ss4.x)) {
            return false;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = this.f178085f;
            if (editHintPasswdView == null) {
                return false;
            }
            editHintPasswdView.a();
            return false;
        }
        java.lang.String text = this.f178085f.getText();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("lqt_enc_pwd", text);
        setResult(-1, intent);
        finish();
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.wallet_core.utils.w.class);
    }
}
