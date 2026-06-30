package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class SettingsAliasUI extends com.tencent.mm.ui.MMWizardActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f160316r;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f160317e;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f160319g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f160320h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f160321i;

    /* renamed from: m, reason: collision with root package name */
    public int f160322m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160323n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160324o;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f160318f = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f160325p = false;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct f160326q = new com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct();

    public final void Z6(boolean z17) {
        gm0.j1.d().g(new v61.k0());
        if (z17) {
            this.f160319g = db5.e1.Q(this, "", getString(com.tencent.mm.R.string.f490468vx), false, false, null);
        }
    }

    public final void a7() {
        int i17 = this.f160322m;
        if (i17 == 1) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.VerifyPwdUI.class);
            intent.putExtra("key_scenen", 2);
            startActivityForResult(intent, 10001);
        } else if (i17 != 2) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f160324o)) {
                return;
            }
            c71.b.c(this, this.f160324o, 0, true);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f160324o)) {
                return;
            }
            c71.b.c(this, this.f160324o, 10002, true);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489448cl3;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f160317e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mop);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.v3r);
        if (this.f160325p) {
            textView.setText(com.tencent.mm.R.string.phl);
        } else {
            textView.setText(com.tencent.mm.R.string.ipb);
        }
        java.lang.String c17 = c01.z1.c();
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            c17 = c01.z1.r();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAliasUI", "curAlias %s", c17);
        this.f160317e.setText(getString(com.tencent.mm.R.string.f490420uh) + c17);
        this.f160317e.setOnLongClickListener(new com.tencent.mm.plugin.setting.ui.setting.x6(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.mpw)).setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.y6(this));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.z6(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Boolean.valueOf(i18 == -1);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAliasUI", "requestCode %d, resultCode OK %s, data == null %s", objArr);
        if (intent == null) {
            return;
        }
        if (i17 == 10001) {
            if (i18 == -1) {
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI.class);
                java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                arrayList.add(1);
                arrayList.add(2);
                java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
                arrayList2.add(this.f160323n);
                arrayList2.add(intent.getStringExtra("key_ticket"));
                intent2.putIntegerArrayListExtra("key_ticket_type", arrayList);
                intent2.putStringArrayListExtra("key_ticket", arrayList2);
                com.tencent.mm.ui.MMWizardActivity.X6(this, intent2);
                return;
            }
            return;
        }
        if (i17 == 10002 && i18 == -1) {
            android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
            java.lang.String string = bundleExtra == null ? "" : bundleExtra.getString("result_json");
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAliasUI", "face recog, result: %s", string);
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                return;
            }
            try {
                java.lang.String string2 = new cl0.g(string).getString("ticket");
                android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI.class);
                java.util.ArrayList<java.lang.Integer> arrayList3 = new java.util.ArrayList<>();
                arrayList3.add(1);
                arrayList3.add(3);
                java.util.ArrayList<java.lang.String> arrayList4 = new java.util.ArrayList<>();
                arrayList4.add(this.f160323n);
                arrayList4.add(string2);
                intent3.putIntegerArrayListExtra("key_ticket_type", arrayList3);
                intent3.putStringArrayListExtra("key_ticket", arrayList4);
                com.tencent.mm.ui.MMWizardActivity.X6(this, intent3);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SettingsAliasUI", "jump face recog error, %s", e17.getMessage());
            }
        }
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        f14.j.f258687e = null;
        this.f160325p = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("AliasModifyOpt", 0) == 1;
        java.lang.String str = "set_alias_" + java.lang.System.currentTimeMillis();
        f160316r = str;
        this.f160326q.p(str);
        initView();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAliasUI", "root class %s", getIntent().getStringExtra("WizardRootClass"));
        gm0.j1.d().a(926, this);
        Z6(false);
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) == 0) {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(926, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAliasUI", "errType %d, errCode %d, errMsg %s, doubleCheck %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Boolean.valueOf(this.f160321i));
        android.app.ProgressDialog progressDialog = this.f160319g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            dp.a.makeText(this, getString(com.tencent.mm.R.string.f490391to), 0).show();
            return;
        }
        v61.k0 k0Var = (v61.k0) m1Var;
        java.util.LinkedList linkedList = ((r45.d00) k0Var.f433453d.f70711b.f70700a).f371975d;
        this.f160318f = linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAliasUI", "conditions %d", java.lang.Integer.valueOf(linkedList.size()));
        r45.d00 d00Var = (r45.d00) k0Var.f433453d.f70711b.f70700a;
        this.f160322m = d00Var.f371977f;
        this.f160324o = d00Var.f371978g;
        this.f160323n = d00Var.f371976e;
        java.util.List list = this.f160318f;
        if (list == null || list.isEmpty()) {
            dp.a.makeText(this, getString(com.tencent.mm.R.string.f490390tn), 0).show();
            return;
        }
        this.f160320h = true;
        java.util.List list2 = this.f160318f;
        f14.j.f258687e = list2;
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            this.f160320h = this.f160320h && ((r45.e00) it.next()).f372889g;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAliasUI", "onSceneEnd, allPass %s", java.lang.Boolean.valueOf(this.f160320h));
        if (this.f160321i) {
            if (this.f160320h) {
                a7();
            } else {
                com.tencent.mm.ui.MMWizardActivity.X6(this, new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasCheckUI.class));
            }
        }
    }
}
