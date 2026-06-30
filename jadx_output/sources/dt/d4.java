package dt;

/* loaded from: classes11.dex */
public class d4 extends com.tencent.mm.sdk.event.n {
    public d4() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        ?? r76;
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        am.bi biVar = ((com.tencent.mm.autogen.events.KickOfflineEvent) iEvent).f54452g;
        java.lang.String str = biVar.f6255a;
        java.lang.String str2 = biVar.f6256b;
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "summertoken KickOffline callback wording[%s], url[%s]", str, str2);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(322L, 21L, 1L, true);
        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = 4021;
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = java.lang.Boolean.valueOf(launcherUI == null || launcherUI.isFinishing());
        objArr[1] = java.lang.String.format("%s|%s|%b", objArr2);
        g0Var.d(11098, objArr);
        if (launcherUI == null || launcherUI.isFinishing()) {
            g0Var.idkeyStat(322L, 22L, 1L, true);
            java.lang.Object[] objArr3 = new java.lang.Object[2];
            objArr3[0] = 4022;
            java.lang.Object[] objArr4 = new java.lang.Object[3];
            objArr4[0] = str;
            r76 = 1;
            objArr4[1] = str2;
            objArr4[2] = java.lang.Boolean.valueOf(launcherUI == null);
            objArr3[1] = java.lang.String.format("%s|%s|%b", objArr4);
            g0Var.d(11098, objArr3);
            com.tencent.mars.xlog.Log.w("MicroMsg.WorkerProfile", "summertoken KickOffline error LauncherUI is null launcherisFirst[%b], launcheruiOnTop[%b] return", java.lang.Boolean.valueOf(com.tencent.mm.app.w7.f53897g), java.lang.Boolean.valueOf(com.tencent.mm.app.w7.f53898h));
        } else {
            r76 = 1;
        }
        android.content.Intent addFlags = new android.content.Intent().setClass(launcherUI, com.tencent.mm.ui.LauncherUI.class).putExtra("Intro_Switch", (boolean) r76).putExtra("animation_pop_in", (boolean) r76).addFlags(67108864);
        com.tencent.mm.autogen.events.LogoutEvent logoutEvent = new com.tencent.mm.autogen.events.LogoutEvent();
        am.hj hjVar = logoutEvent.f54484g;
        hjVar.getClass();
        hjVar.f6836a = r76;
        logoutEvent.e();
        db5.e1.M(launcherUI, str, launcherUI.getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.ui.dc(str2, launcherUI, addFlags), new com.tencent.mm.ui.ec(str2, launcherUI, addFlags));
        return false;
    }
}
