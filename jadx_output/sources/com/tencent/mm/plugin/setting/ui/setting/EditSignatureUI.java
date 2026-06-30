package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class EditSignatureUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f160139d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f160140e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488723a56;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.iy7);
        this.f160139d = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.cgi);
        this.f160140e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487744po1);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(12291, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f160139d;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = this.f160139d.getTextSize();
        ((ke0.e) xVar).getClass();
        mMEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str, textSize));
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f160139d;
        mMEditText2.setSelection(mMEditText2.getText().length());
        this.f160140e.setText("" + (com.tencent.mm.ui.tools.v4.b(60, this.f160139d.getEditableText().toString()) / 2));
        ck5.f b17 = ck5.f.b(this.f160139d);
        b17.f42561f = 0;
        b17.f42560e = 60;
        b17.d(null);
        this.f160139d.addTextChangedListener(new com.tencent.mm.plugin.setting.ui.setting.j1(this, str));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.k1(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490547y6), new com.tencent.mm.plugin.setting.ui.setting.l1(this), null, com.tencent.mm.ui.fb.GREEN);
        enableOptionMenu(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            finish();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(v14.g.class);
    }
}
