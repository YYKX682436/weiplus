package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f153108a;

    public final java.lang.String a() {
        return com.tencent.mm.plugin.performance.watchdogs.t0.a() + '_' + c() + '_' + this.f153108a;
    }

    public final java.lang.String b(int i17) {
        return com.tencent.mm.plugin.performance.watchdogs.t0.a() + '_' + c() + '_' + i17;
    }

    public abstract java.lang.String c();

    public abstract int d();

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.performance.watchdogs.o0.e():void");
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NativeOOMMonitor", c() + " reset");
        for (int i17 = 19; -1 < i17; i17--) {
            java.lang.String b17 = b(i17);
            com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.performance.watchdogs.s0.f153127b;
            o4Var.W(b17);
            c();
            o4Var.q(b17, -1L);
        }
        com.tencent.mm.plugin.performance.watchdogs.s0.f153127b.f192898d.sync();
        this.f153108a = 0;
    }

    public final void g(long j17) {
        if (this.f153108a < 20) {
            com.tencent.mm.plugin.performance.watchdogs.s0.f153127b.B(a(), j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.NativeOOMMonitor", c() + " store [" + a() + ", " + j17 + ']');
            this.f153108a = this.f153108a + 1;
        }
        com.tencent.mm.plugin.performance.watchdogs.s0.f153127b.f192898d.sync();
    }
}
