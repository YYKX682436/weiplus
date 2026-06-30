package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class TeenModeVerifyPwdUI extends com.tencent.mm.ui.MMWizardActivity implements com.tencent.mm.modelbase.u0, al5.e0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f172911p = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f172912e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f172913f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f172914g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.EditText f172915h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ScrollView f172916i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.InputPanelLinearLayout f172917m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f172918n;

    /* renamed from: o, reason: collision with root package name */
    public int f172919o;

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VerifyPwdUI", "keyboard show %s, keyboardHeight %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f172914g.getLayoutParams();
        if (!z17) {
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479657bu);
            layoutParams.topMargin = 0;
            this.f172914g.setLayoutParams(layoutParams);
            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = this.f172917m;
            inputPanelLinearLayout.setPadding(inputPanelLinearLayout.getPaddingLeft(), this.f172917m.getPaddingTop(), this.f172917m.getPaddingRight(), 0);
            this.f172916i.scrollBy(0, 0);
            return;
        }
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn);
        layoutParams.topMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479718db);
        this.f172914g.setLayoutParams(layoutParams);
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout2 = this.f172917m;
        inputPanelLinearLayout2.setPadding(inputPanelLinearLayout2.getPaddingLeft(), this.f172917m.getPaddingTop(), this.f172917m.getPaddingRight(), i17);
        int height = this.f172916i.getHeight();
        this.f172917m.requestLayout();
        this.f172917m.post(new com.tencent.mm.plugin.teenmode.ui.m7(this, height));
    }

    public final void Z6(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f172913f.setVisibility(8);
        } else {
            this.f172913f.setVisibility(0);
            this.f172913f.setText(str);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d38;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f172916i = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.mcm);
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) findViewById(com.tencent.mm.R.id.hdf);
        this.f172917m = inputPanelLinearLayout;
        inputPanelLinearLayout.e(this);
        this.f172913f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dhj);
        this.f172912e = findViewById(com.tencent.mm.R.id.gcs);
        this.f172915h = (android.widget.EditText) findViewById(com.tencent.mm.R.id.f486484ld5);
        com.tencent.mm.ui.fk.b((android.widget.TextView) findViewById(com.tencent.mm.R.id.oxc));
        this.f172915h.requestFocus();
        this.f172915h.addTextChangedListener(new com.tencent.mm.plugin.teenmode.ui.i7(this));
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        this.f172914g = button;
        button.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.j7(this));
        this.f172912e.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.k7(this));
        setBackBtn(new com.tencent.mm.plugin.teenmode.ui.l7(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(384, this);
        ((uh4.c0) i95.n0.c(uh4.c0.class)).T(7);
        this.f172919o = getIntent().getIntExtra("key_scenen", 3);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(384, this);
        hideVKB();
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z17) {
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VerifyPwdUI", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f172918n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i17 == 0 && i18 == 0) {
            ((vh4.t1) i95.n0.c(vh4.t1.class)).T(2);
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.teenmode.ui.n7(this), 1000L);
            return;
        }
        ((vh4.t1) i95.n0.c(vh4.t1.class)).T(6);
        if (i17 != 4) {
            Z6(getString(com.tencent.mm.R.string.f490391to));
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            Z6(getString(com.tencent.mm.R.string.f490391to));
            return;
        }
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            Z6(b17.f420399b);
        } else {
            Z6(str);
        }
    }
}
