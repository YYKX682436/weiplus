package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class m1 extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.p1 f150472d;

    public m1(com.tencent.mm.plugin.multitask.p1 p1Var) {
        this.f150472d = p1Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.multitask.p1 p1Var = this.f150472d;
        com.tencent.mars.xlog.Log.i(p1Var.f150479d, "onAppBackground");
        com.tencent.mm.plugin.multitask.m0.d(p1Var.Ni(), null, null, 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) r1).f150605u == true) goto L18;
     */
    @Override // com.tencent.mm.app.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAppForeground(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.g(r5, r0)
            com.tencent.mm.plugin.multitask.p1 r5 = r4.f150472d
            java.lang.String r0 = r5.f150479d
            java.lang.String r1 = "onAppForeground"
            com.tencent.mars.xlog.Log.i(r0, r1)
            java.lang.ref.WeakReference r0 = com.tencent.mm.app.w.k()
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto L2d
        L1d:
            com.tencent.mm.app.w r0 = com.tencent.mm.app.w.INSTANCE
            java.lang.ref.WeakReference r0 = r0.j()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            goto L2d
        L2c:
            r0 = r1
        L2d:
            if (r0 == 0) goto L3d
            java.lang.Class<ia0.n> r1 = ia0.n.class
            i95.m r1 = i95.n0.c(r1)
            ia0.n r1 = (ia0.n) r1
            ia0.o r1 = (ia0.o) r1
            zk3.c r1 = r1.Ai(r0)
        L3d:
            r0 = 0
            if (r1 == 0) goto L49
            r2 = r1
            com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC r2 = (com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) r2
            boolean r2 = r2.f150605u
            r3 = 1
            if (r2 != r3) goto L49
            goto L4a
        L49:
            r3 = r0
        L4a:
            if (r3 == 0) goto L5b
            com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC r1 = (com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) r1
            boolean r1 = r1.O6()
            if (r1 == 0) goto L5b
            com.tencent.mm.plugin.multitask.m0 r5 = r5.Ni()
            r5.g(r0, r0)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitask.m1.onAppForeground(java.lang.String):void");
    }
}
