package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public class SettingsForgetPwdUI extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.clh;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.ac(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.kao)).setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.bc(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
