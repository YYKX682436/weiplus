package dr0;

/* loaded from: classes12.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f242416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dr0.t0 f242417e;

    public d0(int i17, dr0.t0 t0Var) {
        this.f242416d = i17;
        this.f242417e = t0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            dr0.t0 r3 = r10.f242417e
            int r4 = r10.f242416d
            r5 = 1
            if (r0 < r1) goto L2a
            dr0.h1 r0 = dr0.p1.f242489d
            dr0.p1 r0 = r0.a()
            java.lang.String r1 = bm5.f1.a()
            java.lang.String r6 = "getProcessName(...)"
            kotlin.jvm.internal.o.f(r1, r6)
            android.app.ApplicationExitInfo r0 = r0.b(r1, r4)
            if (r0 == 0) goto L2a
            com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats r1 = r3.i()
            r1.collectExitInfo(r0)
            r0 = r2
            goto L2b
        L2a:
            r0 = r5
        L2b:
            if (r0 == 0) goto L63
            com.tencent.mm.sdk.platformtools.o4 r0 = er0.f0.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "battery-accproclife-lastpid-alivets-"
            r1.<init>(r6)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r6 = 0
            long r0 = r0.getLong(r1, r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r8 = r0.longValue()
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 <= 0) goto L52
            r2 = r5
        L52:
            if (r2 == 0) goto L55
            goto L56
        L55:
            r0 = 0
        L56:
            if (r0 == 0) goto L63
            long r0 = r0.longValue()
            com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats r2 = r3.i()
            r2.collectExitTime(r0)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dr0.d0.run():void");
    }
}
