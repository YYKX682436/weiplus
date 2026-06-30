package yk;

@j95.b
/* loaded from: classes12.dex */
public final class h extends i95.w implements pt0.p {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f462747d = "MicroMsg.DBDataCleanService";

    public h() {
        jz5.h.b(new yk.e(this));
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        boolean z17;
        kotlin.jvm.internal.o.g(context, "context");
        pt0.f0.f358209b1.getClass();
        if (((java.lang.Boolean) ((jz5.n) pt0.e0.f358194b).getValue()).booleanValue()) {
            try {
                b5.w.c(context);
                z17 = true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(this.f462747d, "checkWorkManagerInit error", e17);
                z17 = false;
            }
            if (!z17) {
                return;
            }
            yk.o oVar = com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53698m;
            com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53700o = kz5.c0.i(yk.u.class, yk.b.class, yk.b0.class, yk.f0.class, yk.d0.class, yk.d.class);
            if (((java.lang.Number) ((jz5.n) com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53699n).getValue()).intValue() != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DBDataCleanWorkManger", "[WorkManager]startAutoDBDataClean closed.");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.DBDataCleanWorkManger", "use workManager.");
                long c17 = j62.e.g().c(new com.tencent.mm.repairer.config.msgrefactor.RepairerConfigDataCleanInterval()) * 60 * 1000;
                if (com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53701p == c17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DBDataCleanWorkManger", "startAutoDBDataClean, timeThreshold not changed");
                } else {
                    com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53701p = c17;
                    long c18 = j62.e.g().c(new com.tencent.mm.repairer.config.msgrefactor.RepairerConfigDataCleanDelayTime()) * 60 * 1000;
                    if (c18 <= 0) {
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
                        calendar.set(11, 1);
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        if (calendar.getTimeInMillis() <= java.lang.System.currentTimeMillis()) {
                            calendar.add(6, 1);
                        }
                        c18 = (calendar.getTimeInMillis() - java.lang.System.currentTimeMillis()) + 300000;
                    }
                    long j17 = com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53701p;
                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                    a5.t0 a17 = ((a5.l0) new a5.l0(com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.class, j17, timeUnit).e(c18, timeUnit)).a();
                    kotlin.jvm.internal.o.f(a17, "build(...)");
                    new b5.h(b5.w.c(context), "auto_db_data_clean", a5.n.REPLACE, java.util.Collections.singletonList((a5.m0) a17)).a();
                    com.tencent.mars.xlog.Log.i("MicroMsg.DBDataCleanWorkManger", "enqueue work, initialDelay: " + c18);
                }
            }
        }
        ((ku5.t0) ku5.t0.f312615d).h(new yk.w(context), "MicroMsg.MsgRefactorReportService");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if ((1 <= r0 && r0 <= 7) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wi(android.content.Context r4, boolean r5) {
        /*
            r3 = this;
            pt0.e0 r0 = pt0.f0.f358209b1
            r0.getClass()
            jz5.g r0 = pt0.e0.f358194b
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2b
            yk.o r0 = com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53698m
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 11
            int r0 = r0.get(r1)
            r1 = 1
            if (r1 > r0) goto L28
            r2 = 7
            if (r0 > r2) goto L28
            goto L29
        L28:
            r1 = 0
        L29:
            if (r1 != 0) goto L2d
        L2b:
            if (r5 == 0) goto L39
        L2d:
            ku5.u0 r5 = ku5.t0.f312615d
            yk.f r0 = new yk.f
            r0.<init>(r4)
            ku5.t0 r5 = (ku5.t0) r5
            r5.g(r0)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.h.wi(android.content.Context, boolean):void");
    }
}
