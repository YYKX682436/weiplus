package com.tencent.mm.plugin.teenmode.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainEmoticon;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-teenmode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class SettingsTeenModeMainEmoticon extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f172880d = "MicroMsg.SettingsTeenModeMainEmoticon";

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172881e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172882f;

    /* renamed from: g, reason: collision with root package name */
    public int f172883g;

    public static final void T6(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainEmoticon settingsTeenModeMainEmoticon, int i17) {
        int i18 = settingsTeenModeMainEmoticon.f172883g;
        java.lang.String str = settingsTeenModeMainEmoticon.f172880d;
        if (i18 == i17) {
            com.tencent.mars.xlog.Log.i(str, "no update, no need data report");
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i19 = settingsTeenModeMainEmoticon.f172883g;
        java.lang.String str2 = "Block";
        java.lang.String str3 = i19 != 0 ? i19 != 1 ? i19 != 2 ? "" : "Block" : "Allow" : "Limited";
        if (i17 == 0) {
            str2 = "Limited";
        } else if (i17 == 1) {
            str2 = "Allow";
        } else if (i17 != 2) {
            str2 = "";
        }
        g0Var.d(20917, 3, 1, 1, "Emoticon", str3, str2, "");
        com.tencent.mars.xlog.Log.i(str, "data report ");
    }

    public final void U6() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o0g);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qgr);
        textView.setContentDescription(getString(com.tencent.mm.R.string.jsy));
        textView2.setContentDescription(getString(com.tencent.mm.R.string.ls9));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f172881e;
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f172882f;
        if (weImageView2 != null) {
            weImageView2.setVisibility(8);
        }
        int i17 = this.f172883g;
        if (i17 == 0) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f172882f;
            if (weImageView3 != null) {
                weImageView3.setVisibility(0);
            }
            textView2.setContentDescription(getString(com.tencent.mm.R.string.f493334js0) + getString(com.tencent.mm.R.string.ls9));
        } else if (i17 == 2) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f172881e;
            if (weImageView4 != null) {
                weImageView4.setVisibility(0);
            }
            textView.setContentDescription(getString(com.tencent.mm.R.string.f493334js0) + getString(com.tencent.mm.R.string.jsy));
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_EMOTICON_RANGE_INT_SYNC, java.lang.Integer.valueOf(this.f172883g));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.did;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qgq);
        this.f172882f = findViewById instanceof com.tencent.mm.ui.widget.imageview.WeImageView ? (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById : null;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.o0f);
        this.f172881e = findViewById2 instanceof com.tencent.mm.ui.widget.imageview.WeImageView ? (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2 : null;
        this.f172883g = ((uh4.c0) i95.n0.c(uh4.c0.class)).ag();
        U6();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f172882f;
        java.lang.Object parent = weImageView != null ? weImageView.getParent() : null;
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.b5(this));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f172881e;
        java.lang.Object parent2 = weImageView2 != null ? weImageView2.getParent() : null;
        android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
        if (view2 != null) {
            view2.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.c5(this));
        }
        setBackBtn(new com.tencent.mm.plugin.teenmode.ui.d5(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        r45.yk6 yk6Var = new r45.yk6();
        yk6Var.f391186d = this.f172883g;
        yk6Var.f391188f = ((vh4.t1) i95.n0.c(vh4.t1.class)).f437139i;
        ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(232, yk6Var));
        ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
    }
}
