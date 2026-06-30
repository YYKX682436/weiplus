package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public class MMTextInputUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f210076m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f210077d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f210078e;

    /* renamed from: f, reason: collision with root package name */
    public int f210079f;

    /* renamed from: g, reason: collision with root package name */
    public int f210080g;

    /* renamed from: h, reason: collision with root package name */
    public int f210081h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f210082i;

    public final void T6() {
        if (getIntent().getBooleanExtra("key_show_confirm", false)) {
            db5.e1.u(getContext(), getString(com.tencent.mm.R.string.hqi), "", new com.tencent.mm.ui.tools.x6(this), null);
            return;
        }
        hideVKB();
        setResult(0);
        finish();
    }

    public void U6(java.lang.CharSequence charSequence) {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bl9;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f210077d = (android.widget.EditText) findViewById(com.tencent.mm.R.id.o4a);
        this.f210078e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nhh);
        android.widget.EditText editText = this.f210077d;
        java.lang.String stringExtra = getIntent().getStringExtra("key_hint");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        editText.setHint(stringExtra);
        android.widget.EditText editText2 = this.f210077d;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_value");
        editText2.append(stringExtra2 != null ? stringExtra2 : "");
        int intExtra = getIntent().getIntExtra("key_max_count", -1) << 1;
        this.f210079f = intExtra;
        this.f210081h = 0;
        this.f210080g = java.lang.Math.max(intExtra + org.chromium.net.NetError.ERR_SOCKS_CONNECTION_FAILED, (intExtra * 9) / 10);
        this.f210082i = getIntent().getBooleanExtra("key_nullable", false);
        setBackBtn(new com.tencent.mm.ui.tools.y6(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.ui.tools.z6(this), null, com.tencent.mm.ui.fb.GREEN);
        enableOptionMenu(this.f210082i);
        if (!this.f210082i || this.f210079f > 0) {
            this.f210077d.addTextChangedListener(new com.tencent.mm.ui.tools.a7(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17) {
            return super.onKeyDown(i17, keyEvent);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMTextInputUI", "on back key down");
        T6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
