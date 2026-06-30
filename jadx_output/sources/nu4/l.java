package nu4;

/* loaded from: classes7.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f340256e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, nu4.b0 b0Var) {
        super(3);
        this.f340255d = str;
        this.f340256e = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0093  */
    @Override // yz5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            r11 = this;
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            com.tencent.mm.plugin.appbrand.appcache.u3 r14 = (com.tencent.mm.plugin.appbrand.appcache.u3) r14
            java.lang.String r0 = "resPkg"
            kotlin.jvm.internal.o.g(r14, r0)
            r0 = 0
            if (r13 <= r12) goto L94
            ku4.i r12 = ku4.i.f312514a
            nu4.b0 r12 = r11.f340256e
            com.tencent.mm.plugin.appbrand.appcache.u3 r12 = r12.B0()
            java.lang.String r13 = "MicroMsg.WebCanvasPackageDownManager"
            java.lang.String r1 = "isWxaPkgSupport appId="
            java.lang.String r2 = r11.f340255d
            java.lang.String r3 = "appId"
            kotlin.jvm.internal.o.g(r2, r3)
            java.lang.String r3 = "wxaPkg"
            kotlin.jvm.internal.o.g(r12, r3)
            r3 = 1
            cl0.g r4 = new cl0.g     // Catch: java.lang.Exception -> L7a
            java.lang.String r5 = "/meta.json"
            java.lang.String r14 = com.tencent.mm.plugin.appbrand.appcache.v3.a(r14, r5)     // Catch: java.lang.Exception -> L7a
            r4.<init>(r14)     // Catch: java.lang.Exception -> L7a
            java.lang.String r14 = "minAndroidBasePkgVersion"
            int r14 = r4.optInt(r14)     // Catch: java.lang.Exception -> L7a
            int r12 = com.tencent.mm.plugin.webview.webcompt.a.b(r12)     // Catch: java.lang.Exception -> L7a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7a
            r4.<init>(r1)     // Catch: java.lang.Exception -> L7a
            r4.append(r2)     // Catch: java.lang.Exception -> L7a
            java.lang.String r1 = " minBasePkgVersion="
            r4.append(r1)     // Catch: java.lang.Exception -> L7a
            r4.append(r14)     // Catch: java.lang.Exception -> L7a
            java.lang.String r1 = ", wxaPkgVersionn="
            r4.append(r1)     // Catch: java.lang.Exception -> L7a
            r4.append(r12)     // Catch: java.lang.Exception -> L7a
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L7a
            com.tencent.mars.xlog.Log.i(r13, r1)     // Catch: java.lang.Exception -> L7a
            if (r14 > r12) goto L69
            r12 = r3
            goto L91
        L69:
            java.lang.String r12 = "isWxaPkgSupport minBasePkgVersion check fail"
            com.tencent.mars.xlog.Log.w(r13, r12)     // Catch: java.lang.Exception -> L7a
            r7 = 59
            jx3.f r4 = jx3.f.INSTANCE     // Catch: java.lang.Exception -> L7a
            r5 = 1454(0x5ae, double:7.184E-321)
            r9 = 1
            r4.w(r5, r7, r9)     // Catch: java.lang.Exception -> L7a
            goto L90
        L7a:
            r12 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "isWxaPkgSupport ex "
            r14.<init>(r1)
            java.lang.String r12 = r12.getMessage()
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            com.tencent.mars.xlog.Log.e(r13, r12)
        L90:
            r12 = r0
        L91:
            if (r12 == 0) goto L94
            r0 = r3
        L94:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: nu4.l.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
