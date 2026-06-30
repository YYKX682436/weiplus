package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class SettingsCreateAliasUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f160371d;

    /* renamed from: f, reason: collision with root package name */
    public k14.y f160373f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f160374g;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f160376i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f160377m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f160378n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f160379o;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f160372e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f160375h = false;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f160380p = null;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cla;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.bln);
        this.f160376i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a_4);
        this.f160377m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kbq);
        this.f160378n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ovg);
        this.f160379o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jpv);
        this.f160371d = (android.widget.EditText) findViewById(com.tencent.mm.R.id.ls6);
        java.lang.String r17 = c01.z1.r();
        if (!com.tencent.mm.storage.z3.y3(r17)) {
            this.f160371d.setText(c01.z1.r());
            this.f160378n.setText(getString(com.tencent.mm.R.string.f490003i5, r17));
        }
        android.widget.EditText editText = this.f160371d;
        editText.setSelection(editText.getText().length());
        this.f160371d.setFocusable(true);
        this.f160371d.setFocusableInTouchMode(true);
        this.f160371d.addTextChangedListener(new com.tencent.mm.plugin.setting.ui.setting.x9(this));
        android.widget.TextView textView = this.f160377m;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String l17 = c01.z1.l();
        float textSize = this.f160377m.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, l17, textSize));
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f160376i, r17, null);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.y9(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490547y6), new com.tencent.mm.plugin.setting.ui.setting.aa(this), null, com.tencent.mm.ui.fb.GREEN);
        enableOptionMenu(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160375h = getIntent().getBooleanExtra("KFromSetAliasTips", false);
        initView();
        gm0.j1.d().a(177, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (this.f160373f != null) {
            gm0.j1.d().d(this.f160373f);
        }
        gm0.j1.d().q(177, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (this.f160375h) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10358, java.lang.String.valueOf(1));
            }
            hideVKB();
            gm0.j1.u().c().w(42, this.f160374g);
            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
            com.tencent.mm.plugin.setting.ui.setting.da daVar = new com.tencent.mm.plugin.setting.ui.setting.da(this);
            this.f160380p = daVar;
            d17.a(255, daVar);
            gm0.j1.d().g(new com.tencent.mm.modelsimple.w0(1));
            return;
        }
        android.app.ProgressDialog progressDialog = this.f160372e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f160372e = null;
        }
        o25.s1 a17 = f14.g.a();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((com.tencent.mm.app.o7) a17).getClass();
        if (!com.tencent.mm.ui.pc.a(context, i17, i18, str, 4) && i17 == 4) {
            if (i18 == -7 || i18 == -10) {
                db5.e1.i(getContext(), com.tencent.mm.R.string.f492793hv5, com.tencent.mm.R.string.gyf);
            }
        }
    }
}
