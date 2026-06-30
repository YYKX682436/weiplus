package oz3;

/* loaded from: classes12.dex */
public final class h implements oz3.a {

    /* renamed from: a, reason: collision with root package name */
    public static final oz3.h f350270a = new oz3.h();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f350271b = jz5.h.b(oz3.g.f350269d);

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    @Override // oz3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(oz3.e r7) {
        /*
            r6 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.o.g(r7, r0)
            jz5.g r0 = oz3.h.f350271b
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L18
            return r1
        L18:
            oz3.f r0 = r7.f350264h
            int r2 = r0.f350268d
            oz3.f r3 = oz3.f.f350265e
            r3 = 2
            r2 = r2 & r3
            if (r2 != 0) goto L3b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "handleCodeOCR ocrReportType "
            r7.<init>(r2)
            r7.append(r0)
            java.lang.String r0 = " not support pay"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "MicroMsg.ScanPayCodeOcrReportReporter"
            com.tencent.mars.xlog.Log.w(r0, r7)
            return r1
        L3b:
            com.tencent.qbar.ScanIdentifyReportInfo r0 = r7.f350263g
            if (r0 != 0) goto L40
            return r1
        L40:
            r0 = 1
            java.lang.String r2 = r7.f350259c
            if (r2 == 0) goto L4e
            int r4 = r2.length()
            if (r4 != 0) goto L4c
            goto L4e
        L4c:
            r4 = r1
            goto L4f
        L4e:
            r4 = r0
        L4f:
            if (r4 == 0) goto L52
            return r1
        L52:
            java.lang.CharSequence r2 = r26.n0.w0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = e04.p.K
            java.lang.String r5 = "MERCHANT_PAY_PREFIX"
            kotlin.jvm.internal.o.f(r4, r5)
            r5 = 0
            boolean r3 = r26.i0.A(r2, r4, r1, r3, r5)
            if (r3 != 0) goto Lba
            java.lang.String r3 = "https://payapp.wechatpay.cn/sjt/qr/"
            boolean r3 = r26.i0.y(r2, r3, r1)
            if (r3 != 0) goto Lba
            java.lang.String r3 = "wxhb://f2f"
            boolean r3 = r26.i0.y(r2, r3, r1)
            if (r3 != 0) goto Lba
            java.lang.String r3 = "wxp://f2f"
            boolean r3 = r26.i0.y(r2, r3, r1)
            if (r3 != 0) goto Lba
            java.lang.String r3 = "weixin://wxpay/bizpayurl"
            boolean r3 = r26.i0.y(r2, r3, r1)
            if (r3 != 0) goto Lba
            r3 = 22
            int r4 = r7.f350260d
            if (r4 != r3) goto La2
            java.lang.String r3 = "m"
            boolean r3 = r26.i0.y(r2, r3, r1)
            if (r3 != 0) goto Lba
            java.lang.String r3 = "n"
            boolean r3 = r26.i0.y(r2, r3, r1)
            if (r3 != 0) goto Lba
        La2:
            java.lang.String r3 = e04.p.f246042J
            java.lang.String r4 = "F2F_PAY_MATERIAL_PREFIX"
            kotlin.jvm.internal.o.f(r3, r4)
            boolean r3 = r26.i0.y(r2, r3, r1)
            if (r3 != 0) goto Lba
            java.lang.String r3 = "https://payapp.wechatpay.cn/qr/"
            boolean r2 = r26.i0.y(r2, r3, r1)
            if (r2 == 0) goto Lb8
            goto Lba
        Lb8:
            r2 = r1
            goto Lbb
        Lba:
            r2 = r0
        Lbb:
            if (r2 != 0) goto Lbe
            return r1
        Lbe:
            int r7 = r7.f350261e
            if (r7 == 0) goto Lca
            if (r7 == r0) goto Lca
            r2 = 4
            if (r7 != r2) goto Lc8
            goto Lca
        Lc8:
            r7 = r1
            goto Lcb
        Lca:
            r7 = r0
        Lcb:
            if (r7 != 0) goto Lce
            return r1
        Lce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oz3.h.a(oz3.e):boolean");
    }

    @Override // oz3.a
    public void b(oz3.e request, fk0.a aVar) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanPayCodeOcrReportReporter", "reportOcrForPayCode");
        if (aVar == null) {
            return;
        }
        java.lang.String str = request.f350259c;
        java.lang.String obj = r26.n0.w0(str == null ? "" : str).toString();
        java.lang.String MERCHANT_PAY_PREFIX = e04.p.K;
        kotlin.jvm.internal.o.f(MERCHANT_PAY_PREFIX, "MERCHANT_PAY_PREFIX");
        int i17 = 2;
        if (r26.i0.A(obj, MERCHANT_PAY_PREFIX, false, 2, null) || r26.i0.y(obj, "https://payapp.wechatpay.cn/sjt/qr/", false)) {
            i17 = 1;
        } else if (!r26.i0.y(obj, "wxhb://f2f", false)) {
            if (r26.i0.y(obj, "wxp://f2f", false)) {
                i17 = 5;
            } else if (r26.i0.y(obj, "weixin://wxpay/bizpayurl", false)) {
                i17 = 4;
            } else if (r26.i0.y(obj, "m", false) || r26.i0.y(obj, "n", false)) {
                i17 = 3;
            } else {
                java.lang.String F2F_PAY_MATERIAL_PREFIX = e04.p.f246042J;
                kotlin.jvm.internal.o.f(F2F_PAY_MATERIAL_PREFIX, "F2F_PAY_MATERIAL_PREFIX");
                i17 = (r26.i0.y(obj, F2F_PAY_MATERIAL_PREFIX, false) || r26.i0.y(obj, "https://payapp.wechatpay.cn/qr/", false)) ? 6 : -1;
            }
        }
        int i18 = i17;
        if (i18 < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScanPayCodeOcrReportReporter", "reportOcrForPayCode pay code type not support");
            return;
        }
        ph0.i iVar = (ph0.i) i95.n0.c(ph0.i.class);
        if (str == null) {
            str = "";
        }
        int i19 = aVar.f263260b;
        float f17 = aVar.f263263e;
        java.lang.String valueOf = java.lang.String.valueOf(f17);
        int i27 = aVar.f263262d;
        java.lang.String valueOf2 = java.lang.String.valueOf(f17);
        java.lang.String str2 = aVar.f263259a;
        ((nh0.i) iVar).getClass();
        com.tencent.mars.xlog.Log.i("WcPayReportFeatureService", "onScanPaymentCodeOcrReport, qrCodeType: %d, url: %s, color: %d, colorScore: %s, cls: %d, clsScore: %s", java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i19), valueOf, java.lang.Integer.valueOf(i27), valueOf2);
        gm0.j1.d().g(new oh0.a(i18, str, i19, valueOf, i27, valueOf2, str2));
    }

    @Override // oz3.a
    public java.lang.String name() {
        return "ScanPayCodeOcrReportReporter";
    }
}
