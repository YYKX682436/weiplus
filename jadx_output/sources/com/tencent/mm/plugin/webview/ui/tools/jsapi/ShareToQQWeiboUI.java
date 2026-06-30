package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class ShareToQQWeiboUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f184896d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f184897e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f184898f;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488721a54;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.f493127j44);
        this.f184897e = (android.widget.EditText) findViewById(com.tencent.mm.R.id.cgi);
        this.f184898f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487744po1);
        java.lang.String stringExtra = getIntent().getStringExtra("content");
        java.lang.String stringExtra2 = getIntent().getStringExtra("shortUrl");
        android.widget.EditText editText = this.f184897e;
        editText.addTextChangedListener(new al5.p1(editText, this.f184898f, 280));
        if (stringExtra.contains(stringExtra2)) {
            this.f184897e.setText(stringExtra.trim());
        } else {
            this.f184897e.setText(stringExtra + " " + stringExtra2);
        }
        setBackBtn(new com.tencent.mm.plugin.webview.ui.tools.jsapi.g9(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490558yg), new com.tencent.mm.plugin.webview.ui.tools.jsapi.i9(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(26, this);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(26, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToQQWeiboUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.getType() != 26) {
            return;
        }
        android.app.ProgressDialog progressDialog = this.f184896d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f184896d = null;
        }
        if (i17 != 0 || i18 != 0) {
            setResult(1, new android.content.Intent().putExtra("err_code", i18));
            dp.a.makeText(this, getString(com.tencent.mm.R.string.j3u, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        } else {
            hideVKB();
            setResult(-1);
            finish();
        }
    }
}
