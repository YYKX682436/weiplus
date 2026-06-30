package com.tencent.mm.plugin.report.service;

/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.report.service.b1 f158148a = new com.tencent.mm.plugin.report.service.b1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f158149b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f158150c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f158151d;

    /* renamed from: e, reason: collision with root package name */
    public static long f158152e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f158153f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f158154g;

    static {
        com.tencent.mars.xlog.Log.i("MicroMsg.UserDataOperationReporter", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        long currentTimeMillis = java.lang.System.currentTimeMillis() % 3600000;
        com.tencent.mars.xlog.Log.i("MicroMsg.UserDataOperationReporter", "upload delay " + currentTimeMillis + "ms");
        ((ku5.t0) ku5.t0.f312615d).l(com.tencent.mm.plugin.report.service.s0.f158307d, currentTimeMillis, "MicroMsg.UserDataOperationReporter");
        f158149b = jz5.h.b(com.tencent.mm.plugin.report.service.y0.f158328d);
        f158150c = jz5.h.b(com.tencent.mm.plugin.report.service.v0.f158318d);
        f158151d = jz5.h.b(com.tencent.mm.plugin.report.service.u0.f158311d);
        f158153f = kz5.c0.i("3_11", "12_11", "5_11", "22_11", "3_10", "12_10", "5_10", "22_10", "2_8", "1_8");
        f158154g = kz5.b0.c("10_12");
    }

    public static final boolean a(com.tencent.mm.plugin.report.service.b1 b1Var, int i17, int i18) {
        b1Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('_');
        sb6.append(i18);
        return f158154g.contains(sb6.toString());
    }

    public static final void b(com.tencent.mm.plugin.report.service.b1 b1Var, r45.ch chVar) {
        b1Var.getClass();
        long e17 = c01.id.e() / 86400;
        if (f158152e == e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UserDataOperationReporter", "no time to upload.");
            return;
        }
        f158152e = e17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload. size ");
        java.util.LinkedList linkedList = chVar.f371548d;
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.UserDataOperationReporter", sb6.toString());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedList<r45.xv6> linkedList2 = chVar.f371548d;
        if (linkedList2 != null) {
            for (r45.xv6 xv6Var : linkedList2) {
                long j17 = xv6Var.f390535f / 86400;
                if (linkedHashMap.get(java.lang.Long.valueOf(j17)) == null) {
                    linkedHashMap.put(java.lang.Long.valueOf(j17), new java.util.LinkedList());
                }
                java.util.LinkedList linkedList3 = (java.util.LinkedList) linkedHashMap.get(java.lang.Long.valueOf(j17));
                if (linkedList3 != null) {
                    linkedList3.add(xv6Var);
                }
            }
        }
        chVar.f371548d = new java.util.LinkedList();
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            long longValue = ((java.lang.Number) entry.getKey()).longValue();
            long j18 = f158152e;
            if (longValue == j18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UserDataOperationReporter", "today size: " + ((java.util.LinkedList) entry.getValue()).size());
                chVar.f371548d.addAll((java.util.Collection) entry.getValue());
                f158148a.g();
            } else if (j18 - ((java.lang.Number) entry.getKey()).longValue() <= 7) {
                new lx3.g((java.util.LinkedList) entry.getValue()).l().h(new com.tencent.mm.plugin.report.service.a1(entry, chVar));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r0 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(int r8, int r9) {
        /*
            boolean r0 = gm0.j1.a()
            if (r0 == 0) goto La4
            gm0.m r0 = gm0.j1.b()
            gm0.j r0 = r0.d()
            gm0.j r1 = gm0.j.WeChat
            if (r0 == r1) goto La4
            r0 = 10
            r1 = 0
            if (r9 != r0) goto L29
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Exception -> L24
            int r0 = b3.l.checkSelfPermission(r2, r0)     // Catch: java.lang.Exception -> L24
            if (r0 == 0) goto L22
            goto L24
        L22:
            r0 = 1
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 != 0) goto L29
            goto La4
        L29:
            com.tencent.mm.plugin.report.service.b1 r0 = com.tencent.mm.plugin.report.service.b1.f158148a
            java.util.List r2 = r0.d()
            int r2 = r2.size()
            r3 = 0
            if (r2 <= 0) goto L8c
            java.util.List r2 = r0.d()
            monitor-enter(r2)
            java.util.List r0 = r0.d()     // Catch: java.lang.Throwable -> L89
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L89
        L43:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L89
            if (r4 == 0) goto L77
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L89
            jz5.l r4 = (jz5.l) r4     // Catch: java.lang.Throwable -> L89
            java.lang.Object r5 = r4.f302833d     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L89
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L89
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L89
            java.lang.Object r4 = r4.f302834e     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L89
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L89
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L89
            ku5.u0 r6 = ku5.t0.f312615d     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L89
            com.tencent.mm.plugin.report.service.t0 r7 = new com.tencent.mm.plugin.report.service.t0     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L89
            r7.<init>(r5, r4)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L89
            java.lang.String r4 = "MicroMsg.UserDataOperationReporter"
            ku5.t0 r6 = (ku5.t0) r6     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L89
            r6.h(r7, r4)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L89
            goto L43
        L6e:
            r4 = move-exception
            java.lang.String r5 = "MicroMsg.UserDataOperationReporter"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L89
            com.tencent.mars.xlog.Log.printErrStackTrace(r5, r4, r3, r6)     // Catch: java.lang.Throwable -> L89
            goto L43
        L77:
            com.tencent.mm.plugin.report.service.b1 r0 = com.tencent.mm.plugin.report.service.b1.f158148a     // Catch: java.lang.Throwable -> L89
            java.util.List r0 = r0.d()     // Catch: java.lang.Throwable -> L89
            r0.clear()     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "MicroMsg.UserDataOperationReporter"
            java.lang.String r4 = "acc ready."
            com.tencent.mars.xlog.Log.i(r0, r4)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r2)
            goto L8c
        L89:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L8c:
            ku5.u0 r0 = ku5.t0.f312615d     // Catch: java.lang.Exception -> L9b
            com.tencent.mm.plugin.report.service.t0 r2 = new com.tencent.mm.plugin.report.service.t0     // Catch: java.lang.Exception -> L9b
            r2.<init>(r8, r9)     // Catch: java.lang.Exception -> L9b
            java.lang.String r8 = "MicroMsg.UserDataOperationReporter"
            ku5.t0 r0 = (ku5.t0) r0     // Catch: java.lang.Exception -> L9b
            r0.h(r2, r8)     // Catch: java.lang.Exception -> L9b
            goto La3
        L9b:
            r8 = move-exception
            java.lang.String r9 = "MicroMsg.UserDataOperationReporter"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.tencent.mars.xlog.Log.printErrStackTrace(r9, r8, r3, r0)
        La3:
            return
        La4:
            java.lang.String r0 = "MicroMsg.UserDataOperationReporter"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "acc not ready("
            r1.<init>(r2)
            boolean r2 = gm0.j1.a()
            r1.append(r2)
            java.lang.String r2 = "), or wechat or no permission."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.w(r0, r1)
            com.tencent.mm.plugin.report.service.b1 r0 = com.tencent.mm.plugin.report.service.b1.f158148a
            java.util.List r0 = r0.d()
            jz5.l r1 = new jz5.l
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1.<init>(r8, r9)
            r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.report.service.b1.f(int, int):void");
    }

    public final void c() {
        java.util.LinkedList user_data_list = e().f371548d;
        kotlin.jvm.internal.o.f(user_data_list, "user_data_list");
        new lx3.g(user_data_list).l().h(com.tencent.mm.plugin.report.service.w0.f158319a);
    }

    public final java.util.List d() {
        return (java.util.List) ((jz5.n) f158151d).getValue();
    }

    public final r45.ch e() {
        return (r45.ch) ((jz5.n) f158150c).getValue();
    }

    public final void g() {
        ((ku5.t0) ku5.t0.f312615d).h(com.tencent.mm.plugin.report.service.x0.f158327d, "MicroMsg.UserDataOperationReporter");
    }
}
