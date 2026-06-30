package yk;

/* loaded from: classes13.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final yk.x f462761a = new yk.x();

    public static final void a(yk.x xVar, android.content.Context context) {
        java.lang.String str;
        long j17;
        java.util.Calendar calendar;
        long b17;
        a5.l lVar;
        xVar.getClass();
        b5.w c17 = b5.w.c(context);
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.msgrefactor.RepairerConfigMsgRefactorReportEnable()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportService", "initScheduleReport() enable: " + z17);
        if (!z17) {
            ((m5.c) c17.f17898d).a(new k5.c(c17, "MsgRefactorReportWorker", true));
            return;
        }
        int c18 = j62.e.g().c(new com.tencent.mm.repairer.config.msgrefactor.RepairerConfigMsgRefactorReportCheckPeriod());
        a5.l lVar2 = new a5.l();
        lVar2.b("DATA_KEY_CHECK_PERIOD", java.lang.Integer.valueOf(c18));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long b18 = xVar.b(c18 * 24 * 60 * 60 * 1000);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTimeInMillis(currentTimeMillis);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        long timeInMillis = calendar2.getTimeInMillis() + b18;
        java.lang.String j18 = gm0.j1.b().j();
        kotlin.jvm.internal.o.f(j18, "getUinString(...)");
        long parseLong = java.lang.Long.parseLong(j18);
        if (timeInMillis > currentTimeMillis) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportService", "getTargetTimeInPeriod uin:" + parseLong + " preciseTargetTime:" + timeInMillis + " targetMsInPeriod:" + b18);
            lVar2.b("DATA_KEY_TARGET_TIME", java.lang.Long.valueOf(timeInMillis));
            lVar = lVar2;
        } else {
            java.util.Calendar calendar3 = java.util.Calendar.getInstance();
            yk.x xVar2 = f462761a;
            if (c18 != 2) {
                j17 = b18;
                if (c18 != 3) {
                    calendar3.setTimeInMillis(currentTimeMillis);
                    calendar3.add(6, 1);
                    xVar2.c(calendar3);
                    str = " targetMsInPeriod:";
                    b17 = xVar2.b(86400000L);
                    calendar = calendar3;
                } else {
                    java.util.Calendar calendar4 = java.util.Calendar.getInstance();
                    calendar4.setTimeInMillis(currentTimeMillis);
                    calendar4.add(2, 1);
                    int i17 = calendar4.get(1);
                    int i18 = calendar4.get(2);
                    java.util.Calendar calendar5 = java.util.Calendar.getInstance();
                    calendar5.clear();
                    calendar5.set(1, i17);
                    calendar5.set(2, i18);
                    str = " targetMsInPeriod:";
                    calendar5.set(5, 1);
                    long b19 = xVar2.b(calendar5.getActualMaximum(5) * 86400000);
                    calendar = calendar3;
                    calendar.set(1, i17);
                    calendar.set(2, i18);
                    calendar.set(5, 1);
                    xVar2.c(calendar);
                    b17 = b19;
                }
            } else {
                str = " targetMsInPeriod:";
                j17 = b18;
                calendar = calendar3;
                calendar.setTimeInMillis(currentTimeMillis);
                calendar.add(3, 1);
                calendar.set(7, 2);
                xVar2.c(calendar);
                b17 = xVar2.b(604800000L);
            }
            long timeInMillis2 = calendar.getTimeInMillis() + b17;
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportService", "getNextPeriodTargetTime nextPeriodTargetMs:" + b17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportService", "getTargetTimeInPeriod uin:" + parseLong + " preciseTargetTime:" + timeInMillis + str + j17 + " nextPeriodTime:" + timeInMillis2);
            lVar = lVar2;
            lVar.b("DATA_KEY_TARGET_TIME", java.lang.Long.valueOf(timeInMillis2));
            timeInMillis = timeInMillis2;
        }
        long j19 = timeInMillis - currentTimeMillis;
        long max = java.lang.Math.max(j19, 20000L);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportService", "calculateDelayForReport() delayTime: " + j19 + ", finalDelayTime: " + max);
        a5.c0 c0Var = (a5.c0) new a5.c0(com.tencent.mm.app.plugin.worker.MsgRefactorReportWorker.class).e(max, java.util.concurrent.TimeUnit.MILLISECONDS);
        c0Var.f1430c.f297768e = lVar.a();
        a5.t0 a17 = ((a5.c0) c0Var.d(a5.a.EXPONENTIAL, 10L, java.util.concurrent.TimeUnit.SECONDS)).a();
        kotlin.jvm.internal.o.f(a17, "build(...)");
        new b5.h(c17, "MsgRefactorReportWorker", a5.n.REPLACE, java.util.Collections.singletonList((a5.d0) a17)).a();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportService", "initScheduleReport() end, delayTime: " + max);
    }

    public final long b(long j17) {
        kotlin.jvm.internal.o.f(gm0.j1.b().j(), "getUinString(...)");
        return (((float) (java.lang.Long.parseLong(r0) % 1000000000)) / 1.0E9f) * ((float) j17);
    }

    public final void c(java.util.Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }
}
