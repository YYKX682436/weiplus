package ga4;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ga4.l f269927d = new ga4.l();

    public l() {
        super(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r2 != null) goto L6;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r4 = this;
            java.lang.String r0 = "invoke"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$stop$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r0 = "invoke"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$stop$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            android.os.HandlerThread r0 = ga4.m.b()
            if (r0 != 0) goto L24
            java.lang.String r0 = "access$getSpanHandler$p"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.sdk.platformtools.n3 r2 = ga4.m.f269933f
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            if (r2 == 0) goto Lc0
        L24:
            java.lang.String r0 = "access$getThreadCreateLock$p"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.Object r2 = ga4.m.f269934g
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            monitor-enter(r2)
            java.lang.Class<zy2.lb> r0 = zy2.lb.class
            i95.m r0 = i95.n0.c(r0)     // Catch: java.lang.Throwable -> Ld3
            zy2.lb r0 = (zy2.lb) r0     // Catch: java.lang.Throwable -> Ld3
            if (r0 == 0) goto L5a
            ga4.m r0 = ga4.m.f269928a     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = "getOnStorageChange"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Ld3
            l75.q0 r3 = ga4.m.f269936i     // Catch: java.lang.Throwable -> Ld3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Ld3
            if (r3 == 0) goto L5a
            java.lang.Class<c61.l7> r0 = c61.l7.class
            i95.m r0 = i95.n0.c(r0)     // Catch: java.lang.Throwable -> Ld3
            c61.l7 r0 = (c61.l7) r0     // Catch: java.lang.Throwable -> Ld3
            com.tencent.mm.plugin.finder.storage.gj0 r0 = r0.qk()     // Catch: java.lang.Throwable -> Ld3
            r0.remove(r3)     // Catch: java.lang.Throwable -> Ld3
        L5a:
            java.lang.String r0 = "access$getSpanHandler$p"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Ld3
            com.tencent.mm.sdk.platformtools.n3 r3 = ga4.m.f269933f     // Catch: java.lang.Throwable -> Ld3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Ld3
            r0 = 0
            if (r3 == 0) goto L6c
            r3.removeCallbacksAndMessages(r0)     // Catch: java.lang.Throwable -> Ld3
        L6c:
            android.os.HandlerThread r1 = ga4.m.b()     // Catch: java.lang.Throwable -> Ld3
            if (r1 == 0) goto L75
            r1.quitSafely()     // Catch: java.lang.Throwable -> Ld3
        L75:
            java.lang.String r1 = "access$setSpanThread$p"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)     // Catch: java.lang.Throwable -> Ld3
            ga4.m.f269932e = r0     // Catch: java.lang.Throwable -> Ld3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r1 = "access$setSpanHandler$p"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)     // Catch: java.lang.Throwable -> Ld3
            ga4.m.f269933f = r0     // Catch: java.lang.Throwable -> Ld3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = "access$getMatchCache$p"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Ld3
            com.tencent.mm.sdk.platformtools.r2 r3 = ga4.m.f269929b     // Catch: java.lang.Throwable -> Ld3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Ld3
            r0 = -1
            r3.d(r0)     // Catch: java.lang.Throwable -> Ld3
            java.util.HashMap r0 = ga4.m.a()     // Catch: java.lang.Throwable -> Ld3
            r0.clear()     // Catch: java.lang.Throwable -> Ld3
            r26.t r0 = new r26.t     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r1 = ""
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r1 = "access$setKeywordRegexs$p"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)     // Catch: java.lang.Throwable -> Ld3
            ga4.m.f269935h = r0     // Catch: java.lang.Throwable -> Ld3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = "MicroMsg.SnsKeywordMatcher"
            java.lang.String r1 = "stop"
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> Ld3
            monitor-exit(r2)
        Lc0:
            java.lang.String r0 = "invoke"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$stop$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            jz5.f0 r0 = jz5.f0.f302826a
            java.lang.String r1 = "invoke"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$stop$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r0
        Ld3:
            r0 = move-exception
            monitor-exit(r2)
            java.lang.String r1 = "invoke"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$stop$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ga4.l.invoke():java.lang.Object");
    }
}
