package com.tencent.mm.plugin.qqmail.ui;

@db5.a(3)
/* loaded from: classes11.dex */
public class PrepareBindXMailUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f154914p = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f154915d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f154916e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f154917f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f154918g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f154919h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.ProgressDialog f154920i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f154921m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f154922n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f154923o;

    public static void T6(com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI prepareBindXMailUI) {
        gm0.j1.d().g(new ks3.c0(2, prepareBindXMailUI.f154921m, "", "", ""));
        prepareBindXMailUI.f154920i = db5.e1.Q(prepareBindXMailUI, "", prepareBindXMailUI.getString(com.tencent.mm.R.string.f490604zq), false, false, null);
    }

    public final void U6(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        gm0.j1.d().g(new ks3.c0(3, str, str2, str3, str4));
        this.f154920i = db5.e1.Q(this, "", getString(com.tencent.mm.R.string.f490604zq), false, false, null);
    }

    public final void V6(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f489439cj3, null);
        db5.e1.q(this, getString(com.tencent.mm.R.string.f490978bg0), inflate, new os3.j3(this, (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.mgd), str, str2, str3));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c_t;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        showMMLogo();
        getSupportActionBar().o();
        getController().W0(this, getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f154915d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a_4);
        this.f154916e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.prd);
        this.f154917f = (android.widget.Button) findViewById(com.tencent.mm.R.id.ais);
        this.f154918g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.b5i);
        this.f154919h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.aij);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f154921m)) {
            this.f154917f.setEnabled(false);
        } else {
            this.f154916e.setText(this.f154921m);
        }
        this.f154917f.setOnClickListener(new os3.g3(this));
        this.f154918g.setOnClickListener(new os3.h3(this));
        this.f154919h.setOnClickListener(new os3.i3(this));
        ng5.a.a(this.f154915d, c01.z1.r());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 293) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (bundleExtra != null) {
                java.lang.String string = bundleExtra.getString("key_qq_mail");
                java.lang.String string2 = bundleExtra.getString("key_bind_ticket");
                boolean z17 = bundleExtra.getBoolean("key_need_second_pwd", false);
                java.lang.String string3 = bundleExtra.getString("key_second_pwd_key");
                com.tencent.mars.xlog.Log.i("MicroMsg.PrepareBindXMailUI", "mail %s, ticket %s, needSecondPwd %s, secPwdKey %s", string, string2, java.lang.Boolean.valueOf(z17), string3);
                if (com.tencent.mm.sdk.platformtools.t8.N0(string, string2)) {
                    return;
                }
                if (!z17) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(this.f154922n) || this.f154922n.equals(string)) {
                        U6(string, string2, "", "");
                        return;
                    } else {
                        db5.e1.u(this, getString(com.tencent.mm.R.string.bfx), "", new os3.l3(this, string, string2), null);
                        return;
                    }
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                    dp.a.makeText(this, getString(com.tencent.mm.R.string.is6), 1).show();
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f154922n) || this.f154922n.equals(string)) {
                    V6(string, string2, string3);
                } else {
                    db5.e1.u(this, getString(com.tencent.mm.R.string.bfx), "", new os3.k3(this, string, string2, string3), null);
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f154921m = getIntent().getStringExtra("Key_WeXin_Mail");
        this.f154923o = getIntent().getStringExtra("Key_QQMail_Login_Url");
        java.lang.String stringExtra = getIntent().getStringExtra("Key_Last_Bind_Mail");
        this.f154922n = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.PrepareBindXMailUI", "wxMail %s, loginQQ %s, lastBindMail %s", this.f154921m, this.f154923o, stringExtra);
        initView();
        gm0.j1.d().a(586, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(586, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PrepareBindXMailUI", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.ProgressDialog progressDialog = this.f154920i;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        ks3.c0 c0Var = (ks3.c0) m1Var;
        int i19 = ((ks3.f) c0Var.f311644d.f70711b.f70700a).f311664e;
        java.lang.String str2 = c0Var.f311646f;
        if (i17 == 0 && i18 == 0 && i19 == 0) {
            dp.a.makeText(this, getString(com.tencent.mm.R.string.is7), 0).show();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Key_Bind_XMail", str2);
            setResult(-1, intent);
            finish();
            return;
        }
        if (i19 != -39006) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = getString(com.tencent.mm.R.string.is6);
            }
            dp.a.makeText(this, str, 1).show();
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = getString(com.tencent.mm.R.string.hou);
            }
            dp.a.makeText(this, str, 0).show();
            V6(str2, c0Var.f311647g, c0Var.f311648h);
        }
    }
}
