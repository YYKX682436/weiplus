package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class ResourcesExceedUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public int f198302d = 0;

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cgr;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        hideTitleView();
        fullScreenNoTitleBar(true);
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        setBackBtn(new com.tencent.mm.ui.chatting.jc(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d3d);
        int i17 = this.f198302d;
        if (i17 == 0) {
            textView.setText(com.tencent.mm.R.string.k78);
        } else if (i17 == 1) {
            textView.setText(com.tencent.mm.R.string.g0_);
        } else if (i17 == 2) {
            textView.setText(com.tencent.mm.R.string.cex);
        }
        findViewById(com.tencent.mm.R.id.root_view).setOnTouchListener(new com.tencent.mm.ui.chatting.kc(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        this.f198302d = getIntent().getIntExtra("clean_view_type", 0);
        setMMTitle("");
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
