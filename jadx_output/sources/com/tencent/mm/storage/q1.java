package com.tencent.mm.storage;

/* loaded from: classes7.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.r1 f195232d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.storage.r1 r1Var) {
        super(0);
        this.f195232d = r1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        if (r7 != null) goto L14;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r10 = this;
            long r0 = com.tencent.mm.sdk.platformtools.t8.i1()
            r2 = 2592000(0x278d00, float:3.632166E-39)
            long r2 = (long) r2
            long r0 = r0 - r2
            com.tencent.mm.storage.r1 r2 = r10.f195232d
            r2.getClass()
            p75.n0 r3 = dm.k1.f237950o
            r3.getClass()
            p75.d r4 = dm.k1.f237952q
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            p75.m0 r4 = r4.x(r5)
            boolean r5 = r3 instanceof p75.z
            if (r5 != 0) goto L98
            java.lang.String r3 = r3.b()
            p75.h r4 = (p75.h) r4
            java.lang.String r5 = r4.b()
            java.lang.String[] r4 = r4.e()
            java.lang.String r6 = "table"
            kotlin.jvm.internal.o.g(r3, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "deleteLastModifiedEarlierThan, sql: "
            r6.<init>(r7)
            if (r5 == 0) goto L53
            boolean r7 = r26.n0.N(r5)
            r7 = r7 ^ 1
            if (r7 == 0) goto L48
            r7 = r5
            goto L49
        L48:
            r7 = 0
        L49:
            if (r7 == 0) goto L53
            java.lang.String r7 = " WHERE "
            java.lang.String r7 = r7.concat(r5)
            if (r7 != 0) goto L55
        L53:
            java.lang.String r7 = ""
        L55:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "DELETE FROM "
            r8.<init>(r9)
            r8.append(r3)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.append(r7)
            java.lang.String r7 = ", timeMs: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "MicroMsg.BizScreenshotInfoStorage"
            com.tencent.mars.xlog.Log.i(r1, r0)
            l75.k0 r0 = r2.f195263d
            if (r0 == 0) goto L83
            int r0 = r0.delete(r3, r5, r4)
            goto L84
        L83:
            r0 = -1
        L84:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "deleteAllExpired, deleteCount: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.mars.xlog.Log.i(r1, r0)
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        L98:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Not support multi table delete"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.q1.invoke():java.lang.Object");
    }
}
