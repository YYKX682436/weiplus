package hq0;

/* loaded from: classes7.dex */
public final class k extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f283027a;

    public k(hq0.b0 b0Var) {
        this.f283027a = b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if ((!r0.N.isEmpty()) != false) goto L13;
     */
    @Override // com.tencent.matrix.lifecycle.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEnterForeground() {
        /*
            r6 = this;
            hq0.b0 r0 = r6.f283027a
            java.lang.String r0 = r0.f282971y
            java.lang.String r1 = "run pending exceptionListener"
            com.tencent.mars.xlog.Log.i(r0, r1)
            hq0.b0 r0 = r6.f283027a
            yz5.a r1 = r0.L
            if (r1 == 0) goto L3e
            java.lang.Class<je3.i> r2 = je3.i.class
            i95.m r2 = i95.n0.c(r2)
            je3.i r2 = (je3.i) r2
            if (r2 == 0) goto L24
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key r3 = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicStarterDeferredRecreate
            iq0.g r4 = r0.f282970x
            java.lang.String r4 = r4.f293634a
            kz5.q0 r5 = kz5.q0.f314001d
            je3.j.a(r2, r3, r4, r5)
        L24:
            boolean r2 = r0.P
            if (r2 != 0) goto L33
            java.util.List r2 = r0.N
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L33
            goto L34
        L33:
            r3 = 0
        L34:
            mq0.z r2 = mq0.z.f330640n
            r0.Z1(r2, r3)
            hq0.n r1 = (hq0.n) r1
            r1.invoke()
        L3e:
            com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner r0 = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE
            r0.removeLifecycleCallback(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hq0.k.onEnterForeground():void");
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
    }
}
