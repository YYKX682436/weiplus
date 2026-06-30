package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class SettingsAliasResultUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f160311d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f160312e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f160313f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f160314g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f160315h;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489450cl5;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.gyb);
        this.f160312e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cut);
        this.f160313f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.s_);
        this.f160314g = (android.widget.Button) findViewById(com.tencent.mm.R.id.mnu);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.s6(this));
        this.f160313f.setText(this.f160311d);
        if (this.f160315h) {
            this.f160314g.setVisibility(8);
            this.f160312e.setText(getString(com.tencent.mm.R.string.gyh));
        } else {
            this.f160314g.setVisibility(0);
            this.f160312e.setText(getString(com.tencent.mm.R.string.gyg));
        }
        this.f160314g.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.t6(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160311d = (java.lang.String) gm0.j1.u().c().l(42, null);
        this.f160315h = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("has_pwd", true)).booleanValue();
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
