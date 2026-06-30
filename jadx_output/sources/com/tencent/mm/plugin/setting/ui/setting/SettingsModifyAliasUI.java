package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class SettingsModifyAliasUI extends com.tencent.mm.ui.MMWizardActivity implements com.tencent.mm.modelbase.u0, al5.e0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f160519u = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.InputPanelLinearLayout f160520e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMClearEditText f160521f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f160522g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f160523h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f160524i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f160525m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ScrollView f160526n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f160527o;

    /* renamed from: p, reason: collision with root package name */
    public v61.j0 f160528p;

    /* renamed from: q, reason: collision with root package name */
    public k14.y f160529q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f160530r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f160531s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f160532t = false;

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsModifyAliasUI", "keyboard show %s, keyboardHeight %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (!z17) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f160522g.getLayoutParams();
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479657bu);
            layoutParams.topMargin = 0;
            this.f160522g.setLayoutParams(layoutParams);
            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = this.f160520e;
            inputPanelLinearLayout.setPadding(inputPanelLinearLayout.getPaddingLeft(), this.f160520e.getPaddingTop(), this.f160520e.getPaddingRight(), 0);
            this.f160526n.scrollBy(0, 0);
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f160522g.getLayoutParams();
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        layoutParams2.topMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        this.f160522g.setLayoutParams(layoutParams2);
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout2 = this.f160520e;
        inputPanelLinearLayout2.setPadding(inputPanelLinearLayout2.getPaddingLeft(), this.f160520e.getPaddingTop(), this.f160520e.getPaddingRight(), i17);
        int height = this.f160526n.getHeight();
        this.f160520e.requestLayout();
        this.f160520e.post(new com.tencent.mm.plugin.setting.ui.setting.ah(this, height));
    }

    public final void Z6(java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(this);
        z2Var.i(com.tencent.mm.R.layout.cl_);
        ((android.widget.TextView) z2Var.f212058g.findViewById(com.tencent.mm.R.id.moo)).setText(str);
        android.widget.Button button = (android.widget.Button) z2Var.f212058g.findViewById(com.tencent.mm.R.id.kao);
        button.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.bh(this, str));
        com.tencent.mm.view.CheckBoxLicenseView checkBoxLicenseView = (com.tencent.mm.view.CheckBoxLicenseView) z2Var.f212058g.findViewById(com.tencent.mm.R.id.jpf);
        checkBoxLicenseView.setTermText(getString(com.tencent.mm.R.string.gy6));
        checkBoxLicenseView.setCheckStateChangeListener(new com.tencent.mm.plugin.setting.ui.setting.ch(this, button));
        checkBoxLicenseView.setLicenseClickListener(new com.tencent.mm.plugin.setting.ui.setting.dh(this));
        android.widget.ImageView imageView = (android.widget.ImageView) z2Var.f212058g.findViewById(com.tencent.mm.R.id.jpg);
        if (com.tencent.mm.ui.bk.C()) {
            imageView.setImageResource(com.tencent.mm.R.drawable.f480730b8);
        }
        imageView.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.eh(this, z2Var));
        z2Var.C();
    }

    public final void a7(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f160524i.setVisibility(8);
        } else {
            this.f160524i.setVisibility(0);
            this.f160524i.setText(str);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.clp;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f160520e = (com.tencent.mm.ui.widget.InputPanelLinearLayout) findViewById(com.tencent.mm.R.id.hdf);
        this.f160522g = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        this.f160521f = (com.tencent.mm.ui.base.MMClearEditText) findViewById(com.tencent.mm.R.id.f482934s8);
        this.f160523h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.v3t);
        this.f160524i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dhj);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.v3q);
        this.f160525m = textView;
        if (this.f160532t) {
            textView.setVisibility(0);
            this.f160523h.setText(com.tencent.mm.R.string.phv);
        } else {
            textView.setVisibility(8);
            this.f160523h.setText(com.tencent.mm.R.string.f493053iu0);
        }
        this.f160526n = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.mcm);
        this.f160522g.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.wg(this));
        this.f160521f.requestFocus();
        this.f160521f.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(20)});
        this.f160521f.addTextChangedListener(new com.tencent.mm.plugin.setting.ui.setting.xg(this));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.yg(this));
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160532t = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("AliasModifyOpt", 0) == 1;
        this.f160530r = getIntent().getIntegerArrayListExtra("key_ticket_type");
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("key_ticket");
        this.f160531s = stringArrayListExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsModifyAliasUI", "ticketTypes %s, tickets %s", this.f160530r, stringArrayListExtra);
        initView();
        gm0.j1.d().a(3516, this);
        gm0.j1.d().a(177, this);
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) == 0) {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(3516, this);
        gm0.j1.d().q(177, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, final com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsModifyAliasUI", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f160527o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (m1Var.getType() == 3516) {
            com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct modifyAliasLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct();
            modifyAliasLogStruct.f59239e = 4L;
            modifyAliasLogStruct.p(com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.f160316r);
            if (m1Var != this.f160528p) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SettingsModifyAliasUI", "check alias, not my scene, ignore!");
                return;
            }
            if (i17 == 0 && i18 == 0) {
                Z6(((v61.j0) m1Var).f433451f);
            } else {
                modifyAliasLogStruct.f59240f = 6L;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    a7(getString(com.tencent.mm.R.string.f490391to));
                } else {
                    tm.a b17 = tm.a.b(str);
                    if (this.f160532t) {
                        if (b17 != null) {
                            if (b17.f420400c != 3) {
                                a7(b17.f420399b);
                            } else {
                                b17.c(getContext(), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI$$a
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                                        int i27 = com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI.f160519u;
                                        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI settingsModifyAliasUI = com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI.this;
                                        settingsModifyAliasUI.getClass();
                                        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsModifyAliasUI", "onOk");
                                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2133L, 1L, 1L, false);
                                        settingsModifyAliasUI.Z6(((v61.j0) m1Var).f433451f);
                                    }
                                }, new com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI$$b());
                            }
                        } else if (i18 == -14) {
                            this.f160525m.setTextColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.Red_100));
                        } else {
                            a7(str);
                        }
                    } else if (b17 != null) {
                        a7(b17.f420399b);
                    } else {
                        a7(str);
                    }
                }
            }
            modifyAliasLogStruct.k();
            return;
        }
        if (m1Var.getType() == 177) {
            if (m1Var != this.f160529q) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SettingsModifyAliasUI", "general set, not my scene, ignore!");
                return;
            }
            if (i17 != 0 || i18 != 0) {
                if (i18 == -7 || i18 == -10) {
                    db5.e1.i(getContext(), com.tencent.mm.R.string.f492793hv5, com.tencent.mm.R.string.gyf);
                    return;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    db5.e1.i(getContext(), com.tencent.mm.R.string.f490391to, com.tencent.mm.R.string.gyf);
                    return;
                }
                tm.a b18 = tm.a.b(str);
                if (b18 != null) {
                    b18.d(this, null);
                    return;
                } else {
                    db5.e1.s(this, str, getString(com.tencent.mm.R.string.gyf));
                    return;
                }
            }
            db5.e1.T(this, getString(com.tencent.mm.R.string.f490480w9));
            java.lang.String str2 = this.f160529q.f303418f;
            java.lang.String str3 = (java.lang.String) gm0.j1.u().c().l(42, null);
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_LAST_LOGIN_USERNAME_STRING;
            java.lang.String str4 = (java.lang.String) c17.m(u3Var2, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsModifyAliasUI", "newAlias %s, oldAlias %s, lastLogin %s", str2, str3, str4);
            gm0.j1.u().c().w(42, str2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || str3.equals(str4)) {
                gm0.j1.u().c().x(u3Var2, str2);
                c01.uc.f37514c.h(c01.z1.r(), "login_user_name", str2);
                c01.b9.f37069c.d("login_user_name", str2);
            }
            c01.b9.f37069c.d("last_login_alias", str2);
            c01.uc.f37514c.h(c01.z1.r(), "last_login_alias", str2);
            W6(-1);
            setResult(-1);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout;
        super.onWindowFocusChanged(z17);
        if (!z17 || (inputPanelLinearLayout = this.f160520e) == null) {
            return;
        }
        inputPanelLinearLayout.e(this);
    }
}
