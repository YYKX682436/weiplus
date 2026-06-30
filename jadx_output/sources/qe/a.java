package qe;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f361913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f361914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qe.f f361915f;

    public a(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, qe.f fVar) {
        this.f361913d = tVar;
        this.f361914e = d0Var;
        this.f361915f = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r21 = this;
            r0 = r21
            com.tencent.mm.plugin.appbrand.jsruntime.t r1 = r0.f361913d
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.l0> r2 = com.tencent.mm.plugin.appbrand.jsruntime.l0.class
            com.tencent.mm.plugin.appbrand.jsruntime.u r1 = r1.h0(r2)
            java.lang.String r2 = "getAddon(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            com.tencent.mm.plugin.appbrand.jsruntime.l0 r1 = (com.tencent.mm.plugin.appbrand.jsruntime.l0) r1
            com.tencent.mm.plugin.appbrand.jsapi.d0 r2 = r0.f361914e
            java.lang.Class<uh1.a> r3 = uh1.a.class
            com.tencent.mm.plugin.appbrand.jsapi.g0 r2 = r2.b(r3)
            uh1.a r2 = (uh1.a) r2
            qe.f r3 = r0.f361915f
            r3.f361943b = r2
            qe.f r3 = r0.f361915f
            com.tencent.mm.plugin.appbrand.jsapi.d0 r4 = r0.f361914e
            boolean r5 = r4 instanceof com.tencent.mm.plugin.appbrand.jsapi.l
            if (r5 == 0) goto L28
            goto L29
        L28:
            r4 = 0
        L29:
            r3.f361942a = r4
            boolean r3 = r2.H
            r4 = 1
            java.lang.String r5 = "selfSignedCertificates"
            if (r3 != 0) goto L42
            java.util.ArrayList r3 = r2.f427757x
            kotlin.jvm.internal.o.f(r3, r5)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r4
            if (r3 == 0) goto L3f
            goto L42
        L3f:
            r3 = 0
            r8 = r3
            goto L43
        L42:
            r8 = r4
        L43:
            boolean r3 = r2.H
            if (r3 == 0) goto L4c
            rc.e r3 = rc.e.f393910a
            r3.b()
        L4c:
            java.util.ArrayList r3 = r2.f427757x
            kotlin.jvm.internal.o.f(r3, r5)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r4
            if (r3 == 0) goto L73
            java.util.ArrayList r3 = r2.f427757x
            java.util.Iterator r3 = r3.iterator()
        L5e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L73
            java.lang.Object r5 = r3.next()
            byte[] r5 = (byte[]) r5
            rc.e r6 = rc.e.f393910a
            kotlin.jvm.internal.o.d(r5)
            r6.a(r5)
            goto L5e
        L73:
            int r3 = r2.f427758y
            long r5 = (long) r3
            r9 = 1024(0x400, double:5.06E-321)
            long r5 = r5 * r9
            long r17 = r5 * r9
            int r3 = r2.f427759z
            long r5 = (long) r3
            long r5 = r5 * r9
            long r19 = r5 * r9
            qe.f r3 = r0.f361915f
            qe.f.a(r3)
            java.lang.String r3 = r2.B
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            boolean r6 = r2.f427740d
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            int r7 = r2.f427758y
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r9 = r2.f427759z
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r5, r6, r7, r9}
            java.lang.String r5 = "MicroMsg.CronetHttpNativeInstallHelper"
            java.lang.String r6 = "createHttpBinding: ua=%s verifyUserCA=%b skipDomainCheck=%b maxDownloadMB=%d userVisibleMaxDownloadMB=%d"
            com.tencent.mars.xlog.Log.i(r5, r6, r3)
            qe.f r3 = r0.f361915f
            jz5.g r3 = r3.f361944c
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            r6 = r3
            qe.c r6 = (qe.c) r6
            java.lang.String r7 = r2.B
            java.lang.String r3 = "userAgentString"
            kotlin.jvm.internal.o.f(r7, r3)
            long r9 = r1.z()
            boolean r3 = r2.f427740d
            r11 = r3 ^ 1
            java.lang.String r12 = r2.D
            java.lang.String r2 = "referer"
            kotlin.jvm.internal.o.f(r12, r2)
            long r13 = r1.L()
            long r15 = r1.G()
            r6.create(r7, r8, r9, r11, r12, r13, r15, r17, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.a.run():void");
    }
}
