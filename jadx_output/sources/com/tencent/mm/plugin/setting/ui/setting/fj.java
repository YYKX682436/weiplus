package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes12.dex */
public class fj implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI f161039d;

    public fj(com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI settingsNetStatUI) {
        this.f161039d = settingsNetStatUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((u90.t) ((v90.w) i95.n0.c(v90.w.class))).getClass();
        com.tencent.mm.modelstat.a0 Ai = com.tencent.mm.modelstat.t0.Ai();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int currentTimeMillis = (int) (((java.lang.System.currentTimeMillis() / 86400000) * 86400000) / 86400000);
        com.tencent.mm.sdk.platformtools.p6 p6Var = Ai.f71491f;
        synchronized (p6Var) {
            p6Var.f192922a.d(-1);
            p6Var.f192923b.clear();
            p6Var.f192925d.d();
            p6Var.f192926e.d();
            p6Var.f192931j = true;
        }
        Ai.f71489d.delete("netstat", null, null);
        com.tencent.mm.modelstat.s sVar = new com.tencent.mm.modelstat.s();
        sVar.f71555c = currentTimeMillis;
        sVar.f71554b = -1;
        Ai.u0(sVar);
        com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI settingsNetStatUI = this.f161039d;
        int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI.f160586f;
        settingsNetStatUI.V6();
    }
}
