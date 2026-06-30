package pg3;

/* loaded from: classes2.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pg3.q f354213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg3.s f354214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.vs2 f354215f;

    public o(pg3.q qVar, qg3.s sVar, r45.vs2 vs2Var) {
        this.f354213d = qVar;
        this.f354214e = sVar;
        this.f354215f = vs2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            pg3.q r0 = r7.f354213d
            r0.getClass()
            r45.vs2 r1 = r7.f354215f
            java.lang.String r2 = "MicroMsg.LongVideoFeedsPrefetchService"
            r3 = 0
            if (r1 != 0) goto Ld
            goto L23
        Ld:
            bw5.ev r4 = new bw5.ev     // Catch: java.lang.Exception -> L1a
            r4.<init>()     // Catch: java.lang.Exception -> L1a
            byte[] r5 = r1.toByteArray()     // Catch: java.lang.Exception -> L1a
            r4.parseFrom(r5)     // Catch: java.lang.Exception -> L1a
            goto L24
        L1a:
            r4 = move-exception
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "LongVideo-Trace, doCheckPrefetch ex:"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r4, r6, r5)
        L23:
            r4 = r3
        L24:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "LongVideo-Trace, real call prefetch redDotCtrlInfo:[business_type:"
            r5.<init>(r6)
            if (r1 == 0) goto L34
            int r6 = r1.f388505z
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L35
        L34:
            r6 = r3
        L35:
            r5.append(r6)
            java.lang.String r6 = ", uuid:"
            r5.append(r6)
            if (r1 == 0) goto L42
            java.lang.String r6 = r1.f388503x
            goto L43
        L42:
            r6 = r3
        L43:
            r5.append(r6)
            r6 = 93
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r2, r5)
            pg3.j r2 = new pg3.j
            r2.<init>(r1, r0)
            qg3.s r0 = r7.f354214e
            qg3.u r0 = (qg3.u) r0
            r0.getClass()
            if (r4 == 0) goto L64
            byte[] r3 = r4.toByteArray()
        L64:
            qg3.q r1 = new qg3.q
            r1.<init>()
            r1.f362845d = r2
            long r4 = r0.getCppPointer()
            urgen.ur_54A4.UR_76CA.UR_98BD(r4, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pg3.o.run():void");
    }
}
