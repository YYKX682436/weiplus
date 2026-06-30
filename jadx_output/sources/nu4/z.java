package nu4;

/* loaded from: classes7.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final nu4.z f340293d = new nu4.z();

    public z() {
        super(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00cf  */
    @Override // yz5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            r18 = this;
            r0 = r19
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = r20
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r21
            com.tencent.mm.plugin.appbrand.appcache.u3 r2 = (com.tencent.mm.plugin.appbrand.appcache.u3) r2
            java.lang.String r3 = "resPkg"
            kotlin.jvm.internal.o.g(r2, r3)
            r3 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            if (r1 <= r0) goto Ld0
            ku4.i r0 = ku4.i.f312514a
            java.lang.String r0 = "wx97b7aebac2183fd2"
            java.lang.String r1 = "MicroMsg.WebCanvasPackageDownManager"
            r10 = 1
            cl0.g r4 = new cl0.g     // Catch: java.lang.Exception -> Lb6
            java.lang.String r5 = "/meta.json"
            java.lang.String r5 = com.tencent.mm.plugin.appbrand.appcache.v3.a(r2, r5)     // Catch: java.lang.Exception -> Lb6
            r4.<init>(r5)     // Catch: java.lang.Exception -> Lb6
            java.lang.String r5 = "minAndroidClientVersion"
            int r4 = r4.optInt(r5)     // Catch: java.lang.Exception -> Lb6
            int r2 = com.tencent.mm.plugin.webview.webcompt.a.b(r2)     // Catch: java.lang.Exception -> Lb6
            java.lang.String r5 = "isWxaPkgValid appId=wx97b7aebac2183fd2, minClientVersion=0x%x, localClientVersion=0x%x"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lb6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> Lb6
            r6[r3] = r7     // Catch: java.lang.Exception -> Lb6
            int r7 = o45.wf.f343029g     // Catch: java.lang.Exception -> Lb6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> Lb6
            r6[r10] = r7     // Catch: java.lang.Exception -> Lb6
            com.tencent.mars.xlog.Log.i(r1, r5, r6)     // Catch: java.lang.Exception -> Lb6
            int r5 = o45.wf.f343029g     // Catch: java.lang.Exception -> Lb6
            r11 = 20780(0x512c, float:2.9119E-41)
            if (r4 > r5) goto L70
            com.tencent.mm.plugin.report.service.g0 r12 = com.tencent.mm.plugin.report.service.g0.INSTANCE     // Catch: java.lang.Exception -> Lb6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lb6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> Lb6
            r4 = r0
            r5 = r8
            r7 = r8
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5, r6, r7, r8, r9}     // Catch: java.lang.Exception -> Lb6
            r12.d(r11, r0)     // Catch: java.lang.Exception -> Lb6
            r0 = r10
            goto Lcd
        L70:
            com.tencent.mm.plugin.report.service.g0 r12 = com.tencent.mm.plugin.report.service.g0.INSTANCE     // Catch: java.lang.Exception -> Lb6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lb6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> Lb6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> Lb6
            r4 = r0
            r5 = r8
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r5, r6, r7, r8, r9}     // Catch: java.lang.Exception -> Lb6
            r12.d(r11, r2)     // Catch: java.lang.Exception -> Lb6
            java.lang.String r2 = "isWxaPkgValid minClientVersion check fail"
            com.tencent.mars.xlog.Log.w(r1, r2)     // Catch: java.lang.Exception -> Lb6
            java.lang.String r2 = "wxfedb0854e2b1820d"
            boolean r2 = kotlin.jvm.internal.o.b(r0, r2)     // Catch: java.lang.Exception -> Lb6
            if (r2 == 0) goto La1
            r14 = 43
            jx3.f r11 = jx3.f.INSTANCE     // Catch: java.lang.Exception -> Lb6
            r12 = 1454(0x5ae, double:7.184E-321)
            r16 = 1
            r11.w(r12, r14, r16)     // Catch: java.lang.Exception -> Lb6
            goto Lcc
        La1:
            java.lang.String r2 = "wx97b7aebac2183fd2"
            boolean r0 = kotlin.jvm.internal.o.b(r0, r2)     // Catch: java.lang.Exception -> Lb6
            if (r0 == 0) goto Lcc
            r14 = 50
            jx3.f r11 = jx3.f.INSTANCE     // Catch: java.lang.Exception -> Lb6
            r12 = 1454(0x5ae, double:7.184E-321)
            r16 = 1
            r11.w(r12, r14, r16)     // Catch: java.lang.Exception -> Lb6
            goto Lcc
        Lb6:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "isWxaPkgValid ex "
            r2.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.mars.xlog.Log.e(r1, r0)
        Lcc:
            r0 = r3
        Lcd:
            if (r0 == 0) goto Ld0
            r3 = r10
        Ld0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nu4.z.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
