package yq1;

/* loaded from: classes7.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464459f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464460g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(0);
        this.f464457d = str;
        this.f464458e = str2;
        this.f464459f = str3;
        this.f464460g = str4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if ((r6 == null || r26.n0.N(r6)) != false) goto L38;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r9 = this;
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3 r0 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94371a
            java.lang.String r1 = "event"
            java.lang.String r2 = r9.f464459f
            kotlin.jvm.internal.o.g(r2, r1)
            nu4.b0 r0 = r0.f()
            java.lang.String r1 = r9.f464457d
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1c
            boolean r5 = r26.n0.N(r1)
            if (r5 == 0) goto L1a
            goto L1c
        L1a:
            r5 = r4
            goto L1d
        L1c:
            r5 = r3
        L1d:
            java.lang.String r6 = r9.f464458e
            if (r5 == 0) goto L30
            if (r6 == 0) goto L2c
            boolean r5 = r26.n0.N(r6)
            if (r5 == 0) goto L2a
            goto L2c
        L2a:
            r5 = r4
            goto L2d
        L2c:
            r5 = r3
        L2d:
            if (r5 == 0) goto L30
            goto L9b
        L30:
            java.util.concurrent.ConcurrentLinkedDeque r5 = r0.D
            java.util.Iterator r5 = r5.iterator()
        L36:
            boolean r7 = r5.hasNext()
            java.lang.String r8 = r9.f464460g
            if (r7 == 0) goto L4b
            java.lang.Object r7 = r5.next()
            nu4.c0 r7 = (nu4.c0) r7
            boolean r7 = r7.b(r1, r6, r2, r8)
            if (r7 == 0) goto L36
            goto L9b
        L4b:
            if (r1 == 0) goto L55
            boolean r5 = r26.n0.N(r1)
            if (r5 == 0) goto L54
            goto L55
        L54:
            r3 = r4
        L55:
            if (r3 != 0) goto L9b
            nu4.q r3 = new nu4.q
            r3.<init>(r8, r0, r2)
            java.lang.String r2 = "appId"
            kotlin.jvm.internal.o.g(r1, r2)
            java.lang.String r2 = "_prefetcher_"
            java.lang.String r2 = r2.concat(r1)
            java.util.HashMap r5 = r0.H
            boolean r5 = r5.containsKey(r2)
            if (r5 == 0) goto L73
            r3.invoke(r2)
            goto L9b
        L73:
            com.tencent.mm.plugin.appbrand.appcache.u3 r5 = r0.F0(r1, r4)     // Catch: java.lang.Exception -> L80
            nu4.p r6 = new nu4.p     // Catch: java.lang.Exception -> L80
            r6.<init>(r3, r2)     // Catch: java.lang.Exception -> L80
            r0.H0(r5, r1, r6)     // Catch: java.lang.Exception -> L80
            goto L9b
        L80:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "createPrefetcherJsContext "
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r1 = " exception"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r0 = r0.C
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r2, r1, r3)
        L9b:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yq1.q.invoke():java.lang.Object");
    }
}
