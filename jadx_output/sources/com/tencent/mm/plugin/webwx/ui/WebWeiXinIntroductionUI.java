package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes.dex */
public class WebWeiXinIntroductionUI extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d9l;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.pj8)).setOnClickListener(new com.tencent.mm.plugin.webwx.ui.o0(this));
        setBackBtn(new com.tencent.mm.plugin.webwx.ui.p0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
