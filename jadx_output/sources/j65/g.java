package j65;

/* loaded from: classes12.dex */
public class g extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j65.f f297954a;

    public g(j65.f fVar) {
        this.f297954a = fVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        boolean z17;
        if (intent.getAction().equalsIgnoreCase("android.intent.action.SCREEN_OFF")) {
            j65.f fVar = this.f297954a;
            fVar.getClass();
            com.tencent.mm.autogen.events.VoipCallEvent voipCallEvent = new com.tencent.mm.autogen.events.VoipCallEvent();
            voipCallEvent.e();
            if (voipCallEvent.f54941g.f8049a) {
                return;
            }
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.Boolean bool2 = j65.f.f297948l;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDensityManager", "isOpenHuaWeiSpecial360 change killSelfAndCallUp now:%s, original:%s", bool, java.lang.Boolean.valueOf(bool2.booleanValue()));
            java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
            java.lang.Boolean bool4 = j65.f.f297947k;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDensityManager", "nowisOpenHuaWeiSpecialAll change killSelfAndCallUp now:%s, original:%s", bool3, java.lang.Boolean.valueOf(bool4.booleanValue()));
            boolean booleanValue = bool2.booleanValue();
            boolean z18 = false;
            if (true != booleanValue || bool4.booleanValue()) {
                j65.f.a(fVar, "densityChange");
                return;
            }
            int i17 = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getInt("screenResolution_density_dpi_new", 0);
            com.tencent.mm.ui.bk.t();
            int i18 = com.tencent.mm.ui.bk.t().densityDpi;
            if (i17 == 0) {
                com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putInt("screenResolution_density_dpi_new", i18);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDensityManager", "dancy densityChangeNew, mDensityDpi:%s,  mCurrentDensityDpi:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i17 == 0 || i17 == i18) {
                z17 = false;
            } else {
                com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putInt("screenResolution_density_dpi_new", i18);
                z17 = true;
            }
            if (z17) {
                try {
                    if (com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_android_density_check_kill_enable", "1", false, true), 1) > 0) {
                        z18 = true;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDensityManager", e17, "isOpenKillSelf", new java.lang.Object[0]);
                }
                if (z18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMDensityManager", "killSelfAndCallUp ");
                    j65.f.a(fVar, "densityChange");
                }
            }
        }
    }
}
