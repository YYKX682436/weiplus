package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class SettingDeleteAccountUI extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ckk;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.d3(this));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f484041ct4)).setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.e3(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.ij9);
        initView();
    }
}
