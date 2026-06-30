package com.tencent.mm.plugin.wxcredit.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class WalletWXCreditOpenResultUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f188552e = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.CheckBox f188553d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d8v;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.l2o);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pfn);
        this.f188553d = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.a6h);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) getInput().getParcelable("key_bankcard");
        if (bankcard != null) {
            this.f188553d.setText(getString(com.tencent.mm.R.string.l2q, bankcard.field_bankName));
            textView.setText(com.tencent.mm.R.string.l2r);
        }
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.kao)).setOnClickListener(new e05.y(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.u().c().w(196658, java.lang.Boolean.TRUE);
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        fj6.getClass();
        fj6.f14006o = com.tencent.mm.sdk.platformtools.t8.i1();
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        getNetController().d(java.lang.Boolean.valueOf(this.f188553d.isChecked()));
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
