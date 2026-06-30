package rk1;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk1.e f396412d;

    public g(rk1.e eVar) {
        this.f396412d = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            rk1.e r0 = r1.f396412d
            ft.d4 r0 = r0.f396409f
            rk1.i r0 = (rk1.i) r0
            rk1.m r2 = r0.f396418a
            r2.getClass()
            java.lang.String r3 = r0.f396419b
            java.lang.String r0 = "appId"
            kotlin.jvm.internal.o.g(r3, r0)
            java.util.concurrent.ConcurrentHashMap r4 = rk1.m.f396433h
            java.lang.Object r0 = r4.get(r3)
            r5 = r0
            rk1.d r5 = (rk1.d) r5
            r6 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "MicroMsg.Appbrand.WasmCacheService"
            if (r5 == 0) goto Ld2
            java.lang.String r0 = "start for appId: %s"
            java.lang.Object[] r8 = new java.lang.Object[]{r3}
            com.tencent.mars.xlog.Log.i(r7, r0, r8)
            rk1.c r8 = rk1.m.f396430e
            com.tencent.mm.appbrand.commonjni.TWasmCacheManagerJni r0 = rk1.c.a(r8)
            long r9 = r5.f396401b
            java.lang.String r11 = r0.start(r9)
            if (r11 == 0) goto L76
            r0 = 1
            char[] r12 = new char[r0]
            r9 = 44
            r12[r6] = r9
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            java.util.List r9 = r26.n0.e0(r11, r12, r13, r14, r15, r16)
            java.lang.Object r10 = r9.get(r6)     // Catch: java.lang.Exception -> L65
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L65
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Exception -> L65
            java.lang.Object r0 = r9.get(r0)     // Catch: java.lang.Exception -> L63
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L63
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L63
            goto L6f
        L63:
            r0 = move-exception
            goto L67
        L65:
            r0 = move-exception
            r10 = r6
        L67:
            java.lang.String r9 = "access compile result"
            java.lang.Object[] r11 = new java.lang.Object[r6]
            com.tencent.mars.xlog.Log.printErrStackTrace(r7, r0, r9, r11)
            r0 = r6
        L6f:
            r6 = r10
            r17 = r6
            r6 = r0
            r0 = r17
            goto L77
        L76:
            r0 = r6
        L77:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWasmCachePrecompileStruct r5 = r5.f396403d
            if (r5 == 0) goto L84
            long r9 = (long) r6
            r5.f62822g = r9
            long r9 = (long) r0
            r5.f62823h = r9
            r5.k()
        L84:
            java.lang.Object r5 = r4.get(r3)
            rk1.d r5 = (rk1.d) r5
            if (r5 == 0) goto Lc4
            long r9 = r5.f396401b
            java.lang.Long r11 = java.lang.Long.valueOf(r9)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r3}
            java.lang.String r12 = "finish task: %d, appId: %s"
            com.tencent.mars.xlog.Log.i(r7, r12, r11)
            com.tencent.mm.appbrand.commonjni.TWasmCacheManagerJni r8 = rk1.c.a(r8)
            r8.destroyTask(r9)
            com.tencent.mm.plugin.appbrand.jsruntime.g r5 = r5.f396400a
            r5.destroy()
            r4.remove(r3)
            java.util.concurrent.ConcurrentHashMap r4 = rk1.m.f396434i
            r4.remove(r3)
            q26.n r3 = kz5.e1.u(r4)
            java.lang.Object r3 = q26.h0.l(r3)
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto Lc4
            java.lang.Object r3 = r3.getValue()
            rk1.e r3 = (rk1.e) r3
            r2.wi(r3)
        Lc4:
            jz5.l r2 = new jz5.l
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r2.<init>(r0, r3)
            goto Ld7
        Ld2:
            jz5.l r2 = new jz5.l
            r2.<init>(r0, r0)
        Ld7:
            java.lang.Object r0 = r2.f302833d
            java.lang.Object r2 = r2.f302834e
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "compile cost time: %d, bytes length: %d"
            com.tencent.mars.xlog.Log.i(r7, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rk1.g.run():void");
    }
}
