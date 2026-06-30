package lc4;

/* loaded from: classes4.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC f317992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC) {
        super(1);
        this.f317992d = improveDataUIC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
    
        if ((r5.A()) != false) goto L13;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r0 = "invoke"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$onCreate$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            rc4.e r2 = rc4.e.f394136a
            java.lang.String r2 = "userRefresh"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r4 = 1
            rc4.e.f394146k = r4
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC r2 = r13.f317992d
            r2.getClass()
            java.lang.String r3 = "refresh"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "refresh action:"
            r5.<init>(r6)
            r5.append(r14)
            java.lang.String r6 = " job Completed="
            r5.append(r6)
            kotlinx.coroutines.r2 r6 = r2.f168773n
            r7 = 0
            if (r6 == 0) goto L4c
            boolean r6 = r6.A()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L4d
        L4c:
            r6 = r7
        L4d:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.Improve.DataUIC"
            com.tencent.mars.xlog.Log.i(r6, r5)
            kotlinx.coroutines.r2 r5 = r2.f168773n
            r12 = 0
            if (r5 == 0) goto L68
            boolean r5 = r5.A()
            if (r5 != r4) goto L65
            goto L66
        L65:
            r4 = r12
        L66:
            if (r4 == 0) goto La0
        L68:
            java.lang.String r4 = "refresh start"
            com.tencent.mars.xlog.Log.i(r6, r4)
            java.lang.String r4 = "executeDeleteFeedResource"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r11)
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.ArrayList r6 = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.f168764u
            r5.<init>(r6)
            r6.clear()
            ku5.u0 r6 = ku5.t0.f312615d
            lc4.j r8 = new lc4.j
            r8.<init>(r5)
            ku5.t0 r6 = (ku5.t0) r6
            r6.a(r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r11)
            kotlinx.coroutines.p0 r4 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r6 = kotlinx.coroutines.internal.b0.f310484a
            r4 = 0
            lc4.y r8 = new lc4.y
            r8.<init>(r2, r14, r7)
            r9 = 2
            r10 = 0
            r5 = r2
            r7 = r4
            kotlinx.coroutines.r2 r14 = pf5.e.launch$default(r5, r6, r7, r8, r9, r10)
            r2.f168773n = r14
        La0:
            java.lang.Class<v30.e> r14 = v30.e.class
            i95.m r14 = i95.n0.c(r14)
            v30.e r14 = (v30.e) r14
            u30.e r14 = (u30.e) r14
            r14.getClass()
            e62.q r14 = e62.q.a()
            e62.m r14 = r14.f249809g
            if (r14 == 0) goto Lcf
            e62.f r14 = r14.f249776c
            if (r14 == 0) goto Lcf
            e62.p r14 = (e62.p) r14
            java.lang.String r2 = "HABBYGE-MALI.SnsMonitor"
            java.lang.String r4 = "SnsMonitor, improveDataUICRefresh"
            com.tencent.mars.xlog.Log.i(r2, r4)
            e62.q r14 = r14.f249804a
            java.lang.String r2 = r14.f249806d
            e62.j r14 = r14.b(r2)
            if (r14 == 0) goto Lcf
            r14.b(r12)
        Lcf:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r11)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            jz5.f0 r14 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: lc4.v.invoke(java.lang.Object):java.lang.Object");
    }
}
