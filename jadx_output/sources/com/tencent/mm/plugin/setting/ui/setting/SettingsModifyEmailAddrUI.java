package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class SettingsModifyEmailAddrUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, l75.z0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f160535q = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f160536d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f160537e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f160538f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f160539g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f160540h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f160541i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160542m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160543n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f160544o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f160545p;

    public final void T6() {
        this.f160540h.setVisibility(8);
        this.f160540h.setText(getString(com.tencent.mm.R.string.j0b));
        this.f160541i.setText(getString(com.tencent.mm.R.string.it6));
        this.f160541i.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478585bj));
        this.f160537e.setEnabled(true);
        this.f160537e.setFilters(new android.text.InputFilter[]{new com.tencent.mm.plugin.setting.ui.setting.gi(this)});
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490547y6), new com.tencent.mm.plugin.setting.ui.setting.ii(this));
    }

    public final void U6() {
        if (this.f160543n) {
            this.f160540h.setVisibility(0);
            this.f160540h.setText(getString(com.tencent.mm.R.string.j0b));
            this.f160541i.setText(getString(com.tencent.mm.R.string.it6));
            this.f160541i.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478585bj));
            this.f160537e.setEnabled(false);
            this.f160537e.setFilters(new android.text.InputFilter[]{new com.tencent.mm.plugin.setting.ui.setting.zh(this)});
            this.f160540h.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.bi(this));
            hideVKB(this.f160537e);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f160538f)) {
            T6();
            return;
        }
        this.f160540h.setVisibility(0);
        this.f160540h.setText(getString(com.tencent.mm.R.string.in8));
        this.f160541i.setText(getString(com.tencent.mm.R.string.ija));
        this.f160541i.setTextColor(getResources().getColor(com.tencent.mm.R.color.a2y));
        this.f160537e.setEnabled(false);
        this.f160537e.setFilters(new android.text.InputFilter[]{new com.tencent.mm.plugin.setting.ui.setting.ci(this)});
        this.f160540h.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.ei(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490381te), new com.tencent.mm.plugin.setting.ui.setting.fi(this));
        hideVKB(this.f160537e);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        boolean z17 = false;
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
        if (a1Var != gm0.j1.u().c() || o17 <= 0) {
            com.tencent.mars.xlog.Log.e("MiroMsg.SettingsModifyEmailAddrUI", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
            return;
        }
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(7, null);
        this.f160538f = (java.lang.String) gm0.j1.u().c().l(5, null);
        if (num != null && (num.intValue() & 2) != 0) {
            z17 = true;
        }
        this.f160543n = z17;
        this.f160545p = z17;
        if (this.f160544o) {
            U6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.clr;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.f493052it5);
        this.f160537e = (android.widget.EditText) findViewById(com.tencent.mm.R.id.f486870mq0);
        this.f160540h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.orx);
        this.f160541i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jpr);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(5, null);
        this.f160538f = str;
        this.f160537e.setText(str);
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(7, null);
        this.f160543n = (num == null || (num.intValue() & 2) == 0) ? false : true;
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.ph(this));
        this.f160544o = true;
        U6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            com.tencent.mars.xlog.Log.i("MiroMsg.SettingsModifyEmailAddrUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again oldEmail: " + this.f160538f + " newEmail: " + this.f160539g);
            gm0.j1.d().g(new r61.f1(4));
            this.f160536d = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.irw), true, true, new com.tencent.mm.plugin.setting.ui.setting.yh(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        gm0.j1.d().a(138, this);
        gm0.j1.d().a(254, this);
        gm0.j1.d().a(256, this);
        gm0.j1.d().a(108, this);
        gm0.j1.d().a(255, this);
        gm0.j1.u().c().a(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(138, this);
        gm0.j1.d().q(254, this);
        gm0.j1.d().q(256, this);
        gm0.j1.d().q(108, this);
        gm0.j1.d().q(255, this);
        gm0.j1.u().c().e(this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        hideVKB();
        finish();
        if (this.f160545p) {
            setResult(-1);
            return true;
        }
        setResult(0);
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MiroMsg.SettingsModifyEmailAddrUI", "onSceneEnd: sceneType = " + m1Var.getType() + " errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f160536d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f160536d = null;
        }
        o25.s1 a17 = f14.g.a();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((com.tencent.mm.app.o7) a17).getClass();
        if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 4)) {
            return;
        }
        if (m1Var.getType() == 254) {
            if (i17 == 0 && i18 == 0) {
                r61.f1 f1Var = (r61.f1) m1Var;
                this.f160542m = ((r45.t20) f1Var.f392871e.f70711b.f70700a).f386076e;
                f1Var.H();
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f160542m)) {
                    gm0.j1.d().g(new com.tencent.mm.modelsimple.w0(2));
                    return;
                } else {
                    gm0.j1.d().g(new v61.i0(2, this.f160537e.getText().toString().trim()));
                    return;
                }
            }
            android.app.ProgressDialog progressDialog2 = this.f160536d;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
                this.f160536d = null;
            }
            if (i18 == -3) {
                db5.e1.C(getContext(), getString(com.tencent.mm.R.string.j0f), null, getString(com.tencent.mm.R.string.j0g), getString(com.tencent.mm.R.string.j0e), true, new com.tencent.mm.plugin.setting.ui.setting.ji(this), new com.tencent.mm.plugin.setting.ui.setting.fh(this));
                return;
            }
            if (i18 == -82) {
                db5.e1.m(this, com.tencent.mm.R.string.inx, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.setting.ui.setting.gh(this));
                return;
            }
            if (i18 == -83) {
                db5.e1.m(this, com.tencent.mm.R.string.inu, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.setting.ui.setting.hh(this));
                return;
            } else if (i18 == -84) {
                db5.e1.m(this, com.tencent.mm.R.string.inv, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.setting.ui.setting.ih(this));
                return;
            } else {
                if (i18 == -85) {
                    db5.e1.m(this, com.tencent.mm.R.string.inq, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.setting.ui.setting.jh(this));
                    return;
                }
                return;
            }
        }
        if (m1Var.getType() != 256) {
            if (m1Var.getType() == 138) {
                return;
            }
            if (m1Var.getType() == 108) {
                android.app.ProgressDialog progressDialog3 = this.f160536d;
                if (progressDialog3 != null) {
                    progressDialog3.dismiss();
                    this.f160536d = null;
                }
                if (i17 == 0 && i18 == 0) {
                    db5.e1.m(getContext(), com.tencent.mm.R.string.iqc, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.setting.ui.setting.uh(this));
                    return;
                } else {
                    db5.e1.t(getContext(), getString(com.tencent.mm.R.string.iqb, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.setting.ui.setting.vh(this));
                    return;
                }
            }
            if (m1Var.getType() == 255) {
                if (i18 == 0) {
                    gm0.j1.d().g(new v61.i0(2, this.f160537e.getText().toString().trim()));
                    return;
                }
                android.app.ProgressDialog progressDialog4 = this.f160536d;
                if (progressDialog4 != null) {
                    progressDialog4.dismiss();
                    this.f160536d = null;
                }
                db5.e1.C(getContext(), getString(com.tencent.mm.R.string.j0f), null, getString(com.tencent.mm.R.string.j0g), getString(com.tencent.mm.R.string.j0e), true, new com.tencent.mm.plugin.setting.ui.setting.wh(this), new com.tencent.mm.plugin.setting.ui.setting.xh(this));
                return;
            }
            return;
        }
        ((com.tencent.mm.app.o7) f14.g.a()).Zi();
        com.tencent.mm.protobuf.f fVar = ((v61.i0) m1Var).f433448e.f70710a.f70684a;
        if (((r45.rh) fVar).f384861d != 1) {
            if (((r45.rh) fVar).f384861d == 2) {
                android.app.ProgressDialog progressDialog5 = this.f160536d;
                if (progressDialog5 != null) {
                    progressDialog5.dismiss();
                    this.f160536d = null;
                }
                if (i17 == 0 && i18 == 0) {
                    gm0.j1.u().c().w(7, java.lang.Integer.valueOf(((java.lang.Integer) gm0.j1.u().c().l(7, null)).intValue() | 2));
                    if (com.tencent.mm.sdk.platformtools.t8.K0(this.f160542m)) {
                        db5.e1.m(getContext(), com.tencent.mm.R.string.inr, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.setting.ui.setting.th(this));
                        return;
                    } else {
                        db5.e1.y(getContext(), this.f160542m, "", getString(com.tencent.mm.R.string.f490455vj), new com.tencent.mm.plugin.setting.ui.setting.sh(this));
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i17 == 0 && i18 == 0) {
            db5.e1.m(getContext(), com.tencent.mm.R.string.iqc, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.setting.ui.setting.kh(this));
            return;
        }
        android.app.ProgressDialog progressDialog6 = this.f160536d;
        if (progressDialog6 != null) {
            progressDialog6.dismiss();
            this.f160536d = null;
        }
        if (i18 == -82) {
            db5.e1.m(this, com.tencent.mm.R.string.inx, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.setting.ui.setting.lh(this));
            return;
        }
        if (i18 == -83) {
            db5.e1.m(this, com.tencent.mm.R.string.inu, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.setting.ui.setting.mh(this));
            return;
        }
        if (i18 == -84) {
            db5.e1.m(this, com.tencent.mm.R.string.inv, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.setting.ui.setting.nh(this));
            return;
        }
        if (i18 == -85) {
            db5.e1.m(this, com.tencent.mm.R.string.inq, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.setting.ui.setting.oh(this));
        } else if (i18 == -86) {
            db5.e1.m(this, com.tencent.mm.R.string.iny, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.setting.ui.setting.qh(this));
        } else {
            db5.e1.t(getContext(), getString(com.tencent.mm.R.string.iqb, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.setting.ui.setting.rh(this));
        }
    }
}
