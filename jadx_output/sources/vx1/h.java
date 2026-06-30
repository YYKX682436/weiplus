package vx1;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx1.e f441227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vx1.f f441228e;

    public h(vx1.i iVar, vx1.e eVar, vx1.f fVar) {
        this.f441227d = eVar;
        this.f441228e = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        vx1.e eVar = this.f441227d;
        ((zx1.a) eVar).getClass();
        boolean z18 = com.tencent.mm.sdk.platformtools.o4.R("weakglobal_fix").getBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_START_BOOLEAN", false);
        boolean z19 = com.tencent.mm.sdk.platformtools.o4.R("weakglobal_fix").getBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_END_BOOLEAN", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeakGlobalRefFix", "start " + z18);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeakGlobalRefFix", "end " + z19);
        if (z18 == z19) {
            if (z19) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1113L, 2L, 1L, false);
            }
            z17 = false;
        } else {
            if (com.tencent.mm.sdk.platformtools.o4.R("weakglobal_fix").getInt("SYSTEM_CRASH_PROTECT_WEAKGLOBALREF_HOOK_RESULT", 0) == -5) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1113L, 0L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1113L, 1L, 1L, false);
            }
            z17 = true;
        }
        vx1.f fVar = this.f441228e;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SystemCrashFixPatch", fVar.getClass().getCanonicalName() + " has failed before");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SystemCrashFixPatch", fVar.getClass().getCanonicalName() + " : start");
        ((zx1.a) eVar).getClass();
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("weakglobal_fix");
        R.putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_END_BOOLEAN", false);
        R.putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_START_BOOLEAN", true);
        R.putInt("SYSTEM_CRASH_PROTECT_WEAKGLOBALREF_HOOK_RESULT", 0);
        ((zx1.a) eVar).b();
        ((zx1.a) eVar).getClass();
        com.tencent.mm.sdk.platformtools.o4.R("weakglobal_fix").putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_END_BOOLEAN", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SystemCrashFixPatch", fVar.getClass().getCanonicalName() + " : true");
    }
}
