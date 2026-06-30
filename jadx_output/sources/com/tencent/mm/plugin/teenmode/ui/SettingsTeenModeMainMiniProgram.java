package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public class SettingsTeenModeMainMiniProgram extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172888d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172889e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172890f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f172891g;

    /* renamed from: h, reason: collision with root package name */
    public int f172892h = 0;

    public static void T6(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram settingsTeenModeMainMiniProgram, int i17) {
        if (settingsTeenModeMainMiniProgram.f172892h == i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTeenModeMainMiniProgram", "no update, no need data report");
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i18 = settingsTeenModeMainMiniProgram.f172892h;
        java.lang.String str = "Block";
        java.lang.String str2 = i18 != 0 ? i18 != 1 ? i18 != 2 ? "" : "Block" : "Allow" : "Limited";
        if (i17 == 0) {
            str = "Limited";
        } else if (i17 == 1) {
            str = "Allow";
        } else if (i17 != 2) {
            str = "";
        }
        g0Var.d(20917, 3, 1, 1, "WeApp", str2, str, "");
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTeenModeMainMiniProgram", "data report ");
    }

    public final void U6() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o0e);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o0i);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o0g);
        textView.setContentDescription(getString(com.tencent.mm.R.string.jsu));
        textView2.setContentDescription(getString(com.tencent.mm.R.string.jrw));
        textView3.setContentDescription(getString(com.tencent.mm.R.string.jrx));
        this.f172888d.setVisibility(8);
        this.f172889e.setVisibility(8);
        this.f172890f.setVisibility(8);
        this.f172891g.setVisibility(4);
        int i17 = this.f172892h;
        if (i17 == 0) {
            this.f172889e.setVisibility(0);
            this.f172891g.setVisibility(0);
            textView2.setContentDescription(getString(com.tencent.mm.R.string.f493334js0) + getString(com.tencent.mm.R.string.jrw));
        } else if (i17 == 1) {
            this.f172888d.setVisibility(0);
            textView.setContentDescription(getString(com.tencent.mm.R.string.f493334js0) + getString(com.tencent.mm.R.string.jsu));
        } else if (i17 == 2) {
            this.f172890f.setVisibility(0);
            textView3.setContentDescription(getString(com.tencent.mm.R.string.f493334js0) + getString(com.tencent.mm.R.string.jrx));
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_MINI_PROGRAM_RANGE_INT_SYNC, java.lang.Integer.valueOf(this.f172892h));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cma;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f172888d = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.o0d);
        this.f172889e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.o0h);
        this.f172890f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.o0f);
        this.f172891g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.dgw);
        this.f172892h = ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
        U6();
        ((android.view.View) this.f172888d.getParent()).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.l5(this));
        ((android.view.View) this.f172889e.getParent()).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.m5(this));
        ((android.view.View) this.f172890f.getParent()).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.n5(this));
        this.f172891g.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.o5(this));
        setBackBtn(new com.tencent.mm.plugin.teenmode.ui.p5(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        r45.yk6 yk6Var = new r45.yk6();
        yk6Var.f391186d = this.f172892h;
        if (((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h != null) {
            r45.cu5 cu5Var = new r45.cu5();
            yk6Var.f391187e = cu5Var;
            cu5Var.d(((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h.getBytes());
        }
        yk6Var.f391188f = ((vh4.t1) i95.n0.c(vh4.t1.class)).f437139i;
        ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(225, yk6Var));
        ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
