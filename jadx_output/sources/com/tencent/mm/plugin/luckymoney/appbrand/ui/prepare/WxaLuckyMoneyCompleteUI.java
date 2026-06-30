package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

/* loaded from: classes.dex */
public class WxaLuckyMoneyCompleteUI extends com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI implements ob3.b {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d_o;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.pro)).setOnClickListener(new ob3.d(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(0, null);
        finish();
    }

    @Override // com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
