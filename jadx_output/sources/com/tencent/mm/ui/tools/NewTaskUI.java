package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public class NewTaskUI extends com.tencent.mm.ui.MMBaseActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static com.tencent.mm.ui.tools.NewTaskUI f210133i;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.applet.SecurityImage f210134e = null;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.i5 f210135f = new com.tencent.mm.ui.tools.i5();

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f210136g = null;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f210137h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LoginDisasterEvent>(this, com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.ui.tools.NewTaskUI.1
        {
            this.__eventId = -1399051904;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.LoginDisasterEvent loginDisasterEvent) {
            am.gj gjVar;
            com.tencent.mm.autogen.events.LoginDisasterEvent loginDisasterEvent2 = loginDisasterEvent;
            if (loginDisasterEvent2 == null || (gjVar = loginDisasterEvent2.f54483g) == null) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTaskUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f6768a, gjVar.f6769b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f6768a);
            intent.putExtra("key_disaster_url", gjVar.f6769b);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.account.ui.DisasterUI.class).addFlags(268435456);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/tools/NewTaskUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/ui/tools/NewTaskUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTaskUI", "onCreate :%d", java.lang.Integer.valueOf(hashCode()));
        setContentView(com.tencent.mm.R.layout.f488168j3);
        c01.d9.e().a(701, this);
        c01.d9.e().a(252, this);
        f210133i = this;
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(0, "", "", "");
        c01.d9.e().g(v0Var);
        this.f210136g = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.ui.tools.w7(this, v0Var));
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.ui.widget.dialog.j0 j0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTaskUI", "onDestroy :%d", java.lang.Integer.valueOf(hashCode()));
        if (equals(f210133i)) {
            f210133i = null;
        }
        android.app.ProgressDialog progressDialog = this.f210136g;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f210136g.dismiss();
        }
        com.tencent.mm.ui.applet.SecurityImage securityImage = this.f210134e;
        if (securityImage != null && (j0Var = securityImage.f197198n) != null) {
            j0Var.dismiss();
            securityImage.f197198n = null;
        }
        c01.d9.e().q(701, this);
        c01.d9.e().q(252, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f210137h.dead();
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.f210137h.alive();
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTaskUI", "onSceneEnd :%d  [%d,%d,%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.ProgressDialog progressDialog = this.f210136g;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f210136g.dismiss();
        }
        if (i17 == 4 && i18 == -3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTaskUI", "summerauth MM_ERR_PASSWORD need kick out acc ready[%b]", java.lang.Boolean.valueOf(gm0.j1.a()));
            if (com.tencent.mm.plugin.account.ui.d.a(f210133i, i17, i18, new android.content.Intent().setClass(f210133i, com.tencent.mm.ui.LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), str)) {
                return;
            }
        }
        if (i17 != 4 || (i18 != -6 && i18 != -311 && i18 != -310)) {
            f210133i = null;
            finish();
            return;
        }
        boolean z17 = m1Var instanceof com.tencent.mm.modelsimple.v0;
        com.tencent.mm.ui.tools.i5 i5Var = this.f210135f;
        if (z17) {
            com.tencent.mm.modelsimple.v0 v0Var = (com.tencent.mm.modelsimple.v0) m1Var;
            i5Var.f210484e = v0Var.N();
            i5Var.f210483d = v0Var.K();
            i5Var.f210481b = v0Var.M();
            i5Var.f210482c = v0Var.L();
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTaskUI", "onSceneEnd dkwt imgSid:" + i5Var.f210481b + " img len" + i5Var.f210483d.length + " " + fp.k.c());
        }
        if (this.f210134e == null) {
            com.tencent.mm.ui.tools.i5 i5Var2 = this.f210135f;
            this.f210134e = bb5.j.a(this, com.tencent.mm.R.string.hxl, i5Var2.f210484e, i5Var2.f210483d, i5Var2.f210481b, i5Var2.f210482c, new com.tencent.mm.ui.tools.y7(this), new com.tencent.mm.ui.tools.z7(this), new com.tencent.mm.ui.tools.a8(this), i5Var2);
        } else {
            java.lang.String str2 = i5Var.f210481b;
            int length = i5Var.f210483d.length;
            fp.k.c();
            this.f210134e.b(i5Var.f210484e, i5Var.f210483d, i5Var.f210481b, i5Var.f210482c);
        }
    }
}
