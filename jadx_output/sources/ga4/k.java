package ga4;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ga4.k f269926d = new ga4.k();

    public k() {
        super(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r4 == false) goto L17;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r5 = this;
            java.lang.String r0 = "invoke"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$startInner$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r0 = "invoke"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$startInner$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            ga4.m r0 = ga4.m.f269928a
            java.lang.String r0 = "access$getThreadCreateLock$p"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.Object r2 = ga4.m.f269934g
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            monitor-enter(r2)
            android.os.HandlerThread r0 = ga4.m.b()     // Catch: java.lang.Throwable -> Ld9
            r1 = 0
            r3 = 0
            if (r0 != 0) goto L38
            android.os.HandlerThread r0 = ga4.m.b()     // Catch: java.lang.Throwable -> Ld9
            if (r0 == 0) goto L35
            boolean r0 = r0.isAlive()     // Catch: java.lang.Throwable -> Ld9
            r4 = 1
            if (r0 != r4) goto L35
            goto L36
        L35:
            r4 = r3
        L36:
            if (r4 == 0) goto L59
        L38:
            android.os.HandlerThread r0 = ga4.m.b()     // Catch: java.lang.Throwable -> Ld9
            if (r0 == 0) goto L41
            r0.quitSafely()     // Catch: java.lang.Throwable -> Ld9
        L41:
            java.lang.String r0 = "access$setSpanThread$p"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)     // Catch: java.lang.Throwable -> Ld9
            ga4.m.f269932e = r1     // Catch: java.lang.Throwable -> Ld9
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r0 = "access$setSpanHandler$p"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)     // Catch: java.lang.Throwable -> Ld9
            ga4.m.f269933f = r1     // Catch: java.lang.Throwable -> Ld9
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)     // Catch: java.lang.Throwable -> Ld9
        L59:
            java.lang.String r0 = "SnsKeywordMatcher_Thread"
            int r4 = pu5.i.f358473b     // Catch: java.lang.Throwable -> Ld9
            android.os.HandlerThread r0 = pu5.f.a(r0, r3)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r3 = "access$setSpanThread$p"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)     // Catch: java.lang.Throwable -> Ld9
            ga4.m.f269932e = r0     // Catch: java.lang.Throwable -> Ld9
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch: java.lang.Throwable -> Ld9
            android.os.HandlerThread r0 = ga4.m.b()     // Catch: java.lang.Throwable -> Ld9
            if (r0 == 0) goto L76
            r0.start()     // Catch: java.lang.Throwable -> Ld9
        L76:
            com.tencent.mm.sdk.platformtools.n3 r0 = new com.tencent.mm.sdk.platformtools.n3     // Catch: java.lang.Throwable -> Ld9
            android.os.HandlerThread r3 = ga4.m.b()     // Catch: java.lang.Throwable -> Ld9
            if (r3 == 0) goto L82
            android.os.Looper r1 = r3.getLooper()     // Catch: java.lang.Throwable -> Ld9
        L82:
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r1 = "access$setSpanHandler$p"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)     // Catch: java.lang.Throwable -> Ld9
            ga4.m.f269933f = r0     // Catch: java.lang.Throwable -> Ld9
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r0 = "MicroMsg.SnsKeywordMatcher"
            java.lang.String r1 = "start"
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> Ld9
            java.lang.Class<zy2.lb> r0 = zy2.lb.class
            i95.m r0 = i95.n0.c(r0)     // Catch: java.lang.Throwable -> Ld9
            zy2.lb r0 = (zy2.lb) r0     // Catch: java.lang.Throwable -> Ld9
            if (r0 == 0) goto Lc2
            ga4.m r0 = ga4.m.f269928a     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r0 = "getOnStorageChange"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Ld9
            l75.q0 r3 = ga4.m.f269936i     // Catch: java.lang.Throwable -> Ld9
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> Ld9
            if (r3 == 0) goto Lc2
            java.lang.Class<c61.l7> r0 = c61.l7.class
            i95.m r0 = i95.n0.c(r0)     // Catch: java.lang.Throwable -> Ld9
            c61.l7 r0 = (c61.l7) r0     // Catch: java.lang.Throwable -> Ld9
            com.tencent.mm.plugin.finder.storage.gj0 r0 = r0.qk()     // Catch: java.lang.Throwable -> Ld9
            r0.add(r3)     // Catch: java.lang.Throwable -> Ld9
        Lc2:
            ga4.m.c()     // Catch: java.lang.Throwable -> Ld9
            monitor-exit(r2)
            java.lang.String r0 = "invoke"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$startInner$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            jz5.f0 r0 = jz5.f0.f302826a
            java.lang.String r1 = "invoke"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$startInner$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r0
        Ld9:
            r0 = move-exception
            monitor-exit(r2)
            java.lang.String r1 = "invoke"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$startInner$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ga4.k.invoke():java.lang.Object");
    }
}
