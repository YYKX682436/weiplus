package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public class SettingsTeenModeMainBizAcct extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172875d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172876e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172877f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f172878g;

    /* renamed from: h, reason: collision with root package name */
    public int f172879h = 0;

    public static void T6(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct settingsTeenModeMainBizAcct, int i17) {
        if (settingsTeenModeMainBizAcct.f172879h == i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTeenModeMainBizAcct", "no update, no need data report");
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i18 = settingsTeenModeMainBizAcct.f172879h;
        java.lang.String str = "Block";
        java.lang.String str2 = i18 != 0 ? i18 != 1 ? i18 != 2 ? "" : "Block" : "Allow" : "Limited";
        if (i17 == 0) {
            str = "Limited";
        } else if (i17 == 1) {
            str = "Allow";
        } else if (i17 != 2) {
            str = "";
        }
        g0Var.d(20917, 3, 1, 1, "OfficialAccounts", str2, str, "");
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTeenModeMainBizAcct", "data report ");
    }

    public final void U6() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o0e);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o0i);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o0g);
        textView.setContentDescription(getString(com.tencent.mm.R.string.jsu));
        textView2.setContentDescription(getString(com.tencent.mm.R.string.f493335js1));
        textView3.setContentDescription(getString(com.tencent.mm.R.string.jsy));
        this.f172875d.setVisibility(8);
        this.f172876e.setVisibility(8);
        this.f172877f.setVisibility(8);
        this.f172878g.setVisibility(4);
        int i17 = this.f172879h;
        if (i17 == 0) {
            this.f172876e.setVisibility(0);
            this.f172878g.setVisibility(0);
            textView2.setContentDescription(getString(com.tencent.mm.R.string.f493334js0) + getString(com.tencent.mm.R.string.f493335js1));
        } else if (i17 == 1) {
            this.f172875d.setVisibility(0);
            textView.setContentDescription(getString(com.tencent.mm.R.string.f493334js0) + getString(com.tencent.mm.R.string.jsu));
        } else if (i17 == 2) {
            this.f172877f.setVisibility(0);
            textView3.setContentDescription(getString(com.tencent.mm.R.string.f493334js0) + getString(com.tencent.mm.R.string.jsy));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTeenModeMainBizAcct", "doSaveConfig: %s", java.lang.Integer.valueOf(this.f172879h));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_BIZ_ACCT_RANGE_INT_SYNC, java.lang.Integer.valueOf(this.f172879h));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cm9;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f172875d = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.o0d);
        this.f172876e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.o0h);
        this.f172877f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.o0f);
        this.f172878g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.dgw);
        this.f172879h = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
        U6();
        ((android.view.View) this.f172875d.getParent()).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.w4(this));
        ((android.view.View) this.f172876e.getParent()).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.x4(this));
        ((android.view.View) this.f172877f.getParent()).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.y4(this));
        this.f172878g.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.z4(this));
        setBackBtn(new com.tencent.mm.plugin.teenmode.ui.a5(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        r45.zk6 zk6Var = new r45.zk6();
        zk6Var.f392186d = this.f172879h;
        if (((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h != null) {
            r45.cu5 cu5Var = new r45.cu5();
            zk6Var.f392187e = cu5Var;
            cu5Var.d(((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h.getBytes());
        }
        zk6Var.f392188f = ((vh4.t1) i95.n0.c(vh4.t1.class)).f437139i;
        ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(224, zk6Var));
        ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
