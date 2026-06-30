package com.tencent.mm.ui.transmit;

/* loaded from: classes.dex */
public class SelectNoSupportUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f211015d = "friend";

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f211016e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f211017f;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c1e;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(getString(com.tencent.mm.R.string.ig8));
        this.f211016e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kcs);
        this.f211017f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kcr);
        this.f211016e.setText(getString(com.tencent.mm.R.string.ige));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f211015d)) {
            java.lang.String str = this.f211015d;
            str.getClass();
            if (str.equals("friend")) {
                this.f211017f.setText(getString(com.tencent.mm.R.string.igf));
            } else if (str.equals("sns")) {
                this.f211017f.setText(getString(com.tencent.mm.R.string.igg));
            }
        }
        setBackBtn(new dk5.n4(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectNoSupportUI", "onCreate!");
        this.f211015d = getIntent().getStringExtra("sharePictureTo");
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectNoSupportUI", "initData done!");
        initView();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectNoSupportUI", "initView done!");
    }
}
