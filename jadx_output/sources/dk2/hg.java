package dk2;

/* loaded from: classes5.dex */
public final class hg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.hg f233595d = new dk2.hg();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("live_exception_monitor");
        long j17 = R.getLong("PARAM_LIVE_ID", 0L);
        boolean z17 = R.getBoolean("PARAM_IS_FOREGROUND", false);
        boolean z18 = R.getBoolean("PARAM_IS_FLOAT", false);
        int i17 = R.getInt("PARAM_THREAD_CNT_IN_PROCESS", 0);
        int i18 = R.getInt("PARAM_THREAD_CNT_IN_JAVA", 0);
        boolean z19 = R.getBoolean("PARAM_IS_SCREEN_OFF", false);
        int i19 = R.getInt("PARAM_LIVING_BATTERY", 0);
        java.lang.Integer a07 = zl2.r4.f473950a.a0();
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().getAbsolutePath() + "/crashFlag.live";
        boolean j18 = com.tencent.mm.vfs.w6.j(str);
        boolean h17 = com.tencent.mm.vfs.w6.h(str);
        java.lang.String string = R.getString("PARAM_MEM_INFO", "");
        com.tencent.mars.xlog.Log.i("Finder.LiveExceptionMonitor", "checkAndReportExceptionQuit [lastLiveId:" + j17 + ", isForeground:" + z17 + ", isFloat:" + z18 + ", screenOff:" + z19 + ", battery:" + i19 + ", curBattery:" + a07 + ", threadCntInProcess:" + i17 + ", threadCntInJava:" + i18 + ", meminfo:" + string + " hasStack:" + j18 + " deleteSuc:" + h17);
        pm0.z.b(xy2.b.f458155b, "liveKillByUserOrSys", j17 == 0, null, null, false, false, new dk2.gg(j17, z18, z17, i17, i18, z19, i19, a07, string, j18, h17), 60, null);
        dk2.qg.a(dk2.qg.f233990a);
    }
}
