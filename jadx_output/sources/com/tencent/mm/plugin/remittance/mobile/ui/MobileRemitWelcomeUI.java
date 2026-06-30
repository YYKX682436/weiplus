package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class MobileRemitWelcomeUI extends com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f156611d = 0;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c2a;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackGroundColorResource(com.tencent.mm.R.color.aaw);
        setBackBtn(null);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.jog)).getDrawable().setColorFilter(getResources().getColor(com.tencent.mm.R.color.f478502m), android.graphics.PorterDuff.Mode.SRC_ATOP);
        findViewById(com.tencent.mm.R.id.joe).setOnClickListener(new com.tencent.mm.plugin.remittance.mobile.ui.v0(this));
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.jol)).getPaint(), 0.8f);
    }

    @Override // com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.remittance.mobile.ui.y0.class);
    }
}
