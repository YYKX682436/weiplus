package dk2;

/* loaded from: classes12.dex */
public final class kg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.kg f233708d = new dk2.kg();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("live_exception_monitor");
        ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        R.putInt("PARAM_THREAD_CNT_IN_PROCESS", com.tencent.mm.plugin.performance.watchdogs.b1.b());
        ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        java.lang.ThreadGroup threadGroup = android.os.Looper.getMainLooper().getThread().getThreadGroup();
        R.putInt("PARAM_THREAD_CNT_IN_JAVA", threadGroup == null ? -1 : threadGroup.enumerate(new java.lang.Thread[threadGroup.activeCount() * 2]));
        ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        java.lang.String s3Var = com.tencent.mm.plugin.performance.watchdogs.b0.B.h(false, 4).toString();
        kotlin.jvm.internal.o.f(s3Var, "toString(...)");
        R.putString("PARAM_MEM_INFO", r26.i0.t(s3Var, ",", ";", false));
        java.lang.Integer a07 = zl2.r4.f473950a.a0();
        if (a07 != null) {
            R.putInt("PARAM_LIVING_BATTERY", a07.intValue());
        }
    }
}
