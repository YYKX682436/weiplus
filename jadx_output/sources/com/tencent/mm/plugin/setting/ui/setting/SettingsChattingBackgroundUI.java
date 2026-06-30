package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class SettingsChattingBackgroundUI extends com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f160365m = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160366g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f160367h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160368i;

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference
    public int V6() {
        return 3;
    }

    public final java.lang.String X6(boolean z17) {
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.j0 Bi = f21.r0.Bi();
        return this.f160367h ? Bi.s0("default", z17) : Bi.s0(this.f160368i, z17);
    }

    public final boolean Y6() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(context, "android.permission.CAMERA", 16, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsChattingBackgroundUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), getContext());
        if (!a17) {
            return false;
        }
        Z6();
        return true;
    }

    public final void Z6() {
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        java.lang.String K = lp0.b.K();
        java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        ((ub0.r) oVar).getClass();
        if (com.tencent.mm.pluginsdk.ui.tools.l7.l(this, K, str, 2)) {
            return;
        }
        dp.a.makeText(this, getString(com.tencent.mm.R.string.igw), 1).show();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494930bw;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.ui.base.preference.Preference h17;
        setMMTitle(com.tencent.mm.R.string.iq7);
        this.f160366g = getPreferenceScreen();
        boolean booleanExtra = getIntent().getBooleanExtra("isApplyToAll", true);
        this.f160367h = booleanExtra;
        if (!booleanExtra && (h17 = ((com.tencent.mm.ui.base.preference.h0) this.f160366g).h("settings_chatting_bg_apply_to_all")) != null) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160366g).v(h17);
        }
        this.f160368i = getIntent().getStringExtra(dm.i4.COL_USERNAME);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.r9(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            if (intent == null) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("CropImageMode", 2);
            intent2.putExtra("CropImage_bg_vertical", X6(true));
            intent2.putExtra("CropImage_bg_horizontal", X6(false));
            ((com.tencent.mm.app.y7) f14.g.b()).q(this, intent, intent2, g83.a.a(), 4, null);
            return;
        }
        if (i17 == 2) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context applicationContext = getApplicationContext();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(applicationContext, intent, a17);
            if (b17 == null) {
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("CropImageMode", 2);
            intent3.putExtra("CropImage_ImgPath", b17);
            intent3.putExtra("CropImage_bg_vertical", X6(true));
            intent3.putExtra("CropImage_bg_horizontal", X6(false));
            ((com.tencent.mm.app.y7) f14.g.b()).p(this, intent3, 4);
            return;
        }
        if (i17 != 3) {
            if (i17 == 4 && i18 == -1) {
                gm0.j1.u().c().w(66820, -1);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10198, -1);
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsChattingBackgroundUI", "set chating bg id:%d", -1);
                if (this.f160367h) {
                    gm0.j1.u().c().w(12311, -1);
                    ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
                    f21.r0.Bi().m0(1);
                } else {
                    ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
                    f21.b wi6 = f21.r0.wi();
                    f21.a m07 = wi6.m0(this.f160368i);
                    if (m07 == null) {
                        f21.a aVar = new f21.a();
                        aVar.f258832a = this.f160368i;
                        aVar.f258833b = -1;
                        wi6.n0(aVar);
                    } else {
                        m07.f258833b = -1;
                        wi6.s0(m07);
                    }
                }
            }
        } else if (i18 != -1) {
            return;
        }
        if (this.f160367h) {
            return;
        }
        setResult(-1);
        finish();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsChattingBackgroundUI", str + " item has been clicked!");
        if (str.equals("settings_chatting_bg_select_bg")) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(this, com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI.class);
            intent.putExtra("isApplyToAll", this.f160367h);
            intent.putExtra(dm.i4.COL_USERNAME, this.f160368i);
            startActivityForResult(intent, 3);
            return true;
        }
        if (str.equals("settings_chatting_bg_select_from_album")) {
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.h(this, 1, null);
            return true;
        }
        if (str.equals("settings_chatting_bg_take_photo")) {
            return Y6();
        }
        if (!str.equals("settings_chatting_bg_apply_to_all")) {
            return false;
        }
        db5.e1.u(getContext(), getString(com.tencent.mm.R.string.iq8), "", new com.tencent.mm.plugin.setting.ui.setting.v9(this), null);
        return true;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsChattingBackgroundUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsChattingBackgroundUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 16) {
            if (iArr[0] == 0) {
                Z6();
                return;
            } else {
                db5.e1.C(this, getString(com.tencent.mm.R.string.hh8), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.setting.ui.setting.s9(this), null);
                return;
            }
        }
        if (i17 != 145) {
            return;
        }
        if (iArr[0] == 0) {
            Y6();
        } else {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhi), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.apj), false, new com.tencent.mm.plugin.setting.ui.setting.t9(this), new com.tencent.mm.plugin.setting.ui.setting.u9(this));
        }
    }
}
