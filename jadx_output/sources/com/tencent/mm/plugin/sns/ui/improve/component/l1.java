package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f168935e;

    public l1(android.view.View view, com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC) {
        this.f168934d = view;
        this.f168935e = improveMainUIC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r3.equalsIgnoreCase(r6) != false) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            java.lang.String r0 = "run"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onResume$$inlined$doOnPreDraw$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC r2 = r10.f168935e
            android.app.Activity r3 = r2.getContext()
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.f192989a
            r4 = 0
            java.lang.String r5 = "MicroMsg.Util"
            if (r3 != 0) goto L1b
            java.lang.String r3 = "Context is null"
            com.tencent.mars.xlog.Log.e(r5, r3)
            goto L56
        L1b:
            java.lang.Class r6 = r3.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "."
            int r7 = r6.lastIndexOf(r7)
            r8 = 1
            int r7 = r7 + r8
            java.lang.String r6 = r6.substring(r7)
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.t8.n0(r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "top activity2="
            r7.<init>(r9)
            r7.append(r3)
            java.lang.String r9 = ", context="
            r7.append(r9)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r5, r7)
            if (r3 == 0) goto L56
            boolean r3 = r3.equalsIgnoreCase(r6)
            if (r3 == 0) goto L56
            goto L57
        L56:
            r8 = r4
        L57:
            if (r8 == 0) goto L68
            java.lang.String r3 = "MicroMsg.Improve.MainUIC"
            java.lang.String r5 = "onResume doOnPreDraw onScrollStateChanged"
            com.tencent.mars.xlog.Log.i(r3, r5)
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView r3 = r2.getRecycleView()
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.R6(r2, r3, r4)
        L68:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.component.l1.run():void");
    }
}
