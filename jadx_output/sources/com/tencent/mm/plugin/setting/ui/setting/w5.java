package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class w5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f161686d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f161687e = null;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI f161688f;

    public w5(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        this.f161688f = settingsAboutMicroMsgUI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((com.tencent.mm.plugin.expt.pageflow.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
        gm0.j1.i();
        boolean t17 = gm0.j1.b().t();
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = this.f161688f;
        if (!t17) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI.V6(settingsAboutMicroMsgUI);
            return;
        }
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.t5 t5Var = new com.tencent.mm.plugin.setting.ui.setting.t5(this);
        this.f161686d = t5Var;
        d17.a(281, t5Var);
        de0.i wi6 = ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).wi(2);
        gm0.j1.d().g((com.tencent.mm.modelbase.m1) wi6);
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.setting.ui.setting.u5(this, wi6), false);
        this.f161687e = b4Var;
        b4Var.c(5000L, 5000L);
        com.tencent.mm.plugin.appbrand.service.b6 b6Var = (com.tencent.mm.plugin.appbrand.service.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.b6.class);
        java.lang.String string = settingsAboutMicroMsgUI.getString(com.tencent.mm.R.string.l7z);
        ((com.tencent.mm.modelsimple.t) b6Var).getClass();
        java.lang.String str = "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0((ug3.i.J() == null || ug3.i.J().f427561y == null) ? "" : ug3.i.J().f427561y)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (ug3.i.J() != null && ug3.i.J().f427561y != null) {
                str = ug3.i.J().f427561y;
            }
            sb6.append(str);
            sb6.append("...");
            string = sb6.toString();
        }
        settingsAboutMicroMsgUI.f160268p = db5.e1.Q(settingsAboutMicroMsgUI.getContext(), settingsAboutMicroMsgUI.getString(com.tencent.mm.R.string.f490573yv), string, true, true, new com.tencent.mm.plugin.setting.ui.setting.v5(this, wi6));
    }
}
