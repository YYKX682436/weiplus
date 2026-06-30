package com.tencent.mm.plugin.subapp.ui.pluginapp;

/* loaded from: classes8.dex */
public class ContactSearchUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f172424f = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f172425d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f172426e = null;

    public final void T6() {
        java.lang.String trim = this.f172425d.getText().toString().trim();
        if (trim == null || trim.length() <= 0) {
            db5.e1.i(getContext(), com.tencent.mm.R.string.f493439k65, com.tencent.mm.R.string.f490573yv);
            return;
        }
        tg3.r1 r1Var = new tg3.r1(trim, 1);
        c01.d9.e().g(r1Var);
        this.f172426e = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f489924fn), true, true, new gg4.w(this, r1Var));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a2q;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.bkg);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.tencent.mm.R.id.cfn);
        this.f172425d = editText;
        editText.addTextChangedListener(new gg4.s(this));
        this.f172425d.setImeOptions(3);
        this.f172425d.setOnEditorActionListener(new gg4.t(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490431uw), new gg4.u(this));
        setBackBtn(new gg4.v(this));
        if (getIntent().getBooleanExtra("from_webview", false)) {
            this.f172425d.setText(getIntent().getStringExtra("userName"));
            T6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        c01.d9.e().q(106, this);
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        c01.d9.e().a(106, this);
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSearchUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f172426e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f172426e = null;
        }
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((com.tencent.mm.app.o7) wi6).getClass();
        if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 7)) {
            return;
        }
        if (i17 == 4 && i18 == -4) {
            db5.e1.i(getContext(), com.tencent.mm.R.string.f489921fi, com.tencent.mm.R.string.f490573yv);
            return;
        }
        if (i17 != 0 || i18 != 0) {
            java.lang.String G = com.tencent.mm.sdk.platformtools.t8.G(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(G)) {
                G = getString(com.tencent.mm.R.string.fdr, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            }
            dp.a.makeText(this, G, 0).show();
            return;
        }
        r45.iw5 H = ((tg3.r1) m1Var).H();
        if (H.D > 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(this, com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI.class);
            try {
                intent.putExtra("result", H.toByteArray());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContactSearchUI", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        java.lang.String g17 = x51.j1.g(H.f377356d);
        android.content.Intent intent2 = new android.content.Intent();
        o25.r1 r1Var = (o25.r1) i95.n0.c(o25.r1.class);
        java.lang.String trim = this.f172425d.getText().toString().trim();
        int i27 = 2;
        if (com.tencent.mm.sdk.platformtools.t8.a1(trim)) {
            i19 = 1;
        } else if (com.tencent.mm.sdk.platformtools.t8.Y0(trim)) {
            i19 = 2;
        } else {
            com.tencent.mm.sdk.platformtools.t8.X0(trim);
            i19 = 3;
        }
        ((com.tencent.mm.app.o7) r1Var).getClass();
        qk.p.a(intent2, H, i19);
        if ((g17 != null ? g17 : "").length() > 0) {
            if ((H.f377366q & 8) > 0) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(g17);
                sb6.append(",");
                java.lang.String trim2 = this.f172425d.getText().toString().trim();
                if (com.tencent.mm.sdk.platformtools.t8.a1(trim2)) {
                    i27 = 1;
                } else if (!com.tencent.mm.sdk.platformtools.t8.Y0(trim2)) {
                    com.tencent.mm.sdk.platformtools.t8.X0(trim2);
                    i27 = 3;
                }
                sb6.append(i27);
                g0Var.kvStat(10298, sb6.toString());
            }
            j45.l.j(this, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
        }
    }
}
