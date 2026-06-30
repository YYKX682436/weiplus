package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes.dex */
public class BioHelperUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public int f189758d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f189759e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f189760f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f189761g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f189762h;

    /* renamed from: i, reason: collision with root package name */
    public int f189763i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.g0 f189764m;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488209kj;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BioHelperUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        this.f189764m.e(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.pluginsdk.ui.g0 f0Var;
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("k_type", 1);
        this.f189758d = intExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.BioHelperUI", "hy: starting to bio helper ui, type: %d", java.lang.Integer.valueOf(intExtra));
        java.lang.String stringExtra = getIntent().getStringExtra("Kusername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.pluginsdk.ui.g0 g0Var = null;
        if (stringExtra == null) {
            stringExtra = null;
        }
        this.f189759e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("Kvertify_key");
        if (stringExtra2 == null) {
            stringExtra2 = null;
        }
        this.f189760f = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("KVoiceHelpUrl");
        if (stringExtra3 == null) {
            stringExtra3 = null;
        }
        this.f189761g = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("KVoiceHelpWording");
        if (stringExtra4 == null) {
            stringExtra4 = null;
        }
        this.f189762h = stringExtra4;
        this.f189763i = getIntent().getIntExtra("KVoiceHelpCode", 0);
        int i17 = this.f189758d;
        if (i17 == 0) {
            f0Var = new com.tencent.mm.pluginsdk.ui.h0(this, null);
        } else {
            if (i17 != 1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BioHelperUI", "hy: invalid type!!!");
                this.f189764m = g0Var;
                if (g0Var != null || com.tencent.mm.sdk.platformtools.t8.K0(this.f189759e) || com.tencent.mm.sdk.platformtools.t8.K0(this.f189760f)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BioHelperUI", "type or username or ticket is null and finish");
                    finish();
                }
                android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483387aj0);
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f189762h)) {
                    textView.setText(this.f189764m.d());
                } else {
                    textView.setText(this.f189762h);
                }
                setMMTitle(this.f189764m.b());
                ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.aiy)).setImageResource(this.f189764m.a());
                setBackBtn(new com.tencent.mm.pluginsdk.ui.c0(this));
                this.f189764m.f(getIntent());
                android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.f483388aj1);
                button.setText(this.f189764m.c());
                button.setOnClickListener(new com.tencent.mm.pluginsdk.ui.d0(this));
                findViewById(com.tencent.mm.R.id.aiz).setOnClickListener(new com.tencent.mm.pluginsdk.ui.e0(this));
                return;
            }
            f0Var = new com.tencent.mm.pluginsdk.ui.f0(this, null);
        }
        g0Var = f0Var;
        this.f189764m = g0Var;
        if (g0Var != null) {
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.BioHelperUI", "type or username or ticket is null and finish");
        finish();
    }
}
