package com.unionpay;

/* loaded from: classes13.dex */
public final class n implements com.unionpay.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.UPPayWapActivity f220720a;

    public n(com.unionpay.UPPayWapActivity uPPayWapActivity) {
        this.f220720a = uPPayWapActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: Exception -> 0x0048, TRY_LEAVE, TryCatch #2 {Exception -> 0x0048, blocks: (B:3:0x0005, B:10:0x0030, B:12:0x0039, B:20:0x0022), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // com.unionpay.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r6, com.unionpay.g r7) {
        /*
            r5 = this;
            java.lang.String r0 = "1"
            java.lang.String r1 = ""
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L48
            r3.<init>(r6)     // Catch: java.lang.Exception -> L48
            java.lang.String r6 = "resultCode"
            java.lang.Object r6 = r3.get(r6)     // Catch: java.lang.Exception -> L1e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L1e
            java.lang.String r4 = "resultData"
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Exception -> L1c
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L1c
            r1 = r3
            goto L30
        L1c:
            r3 = move-exception
            goto L20
        L1e:
            r3 = move-exception
            r6 = r1
        L20:
            if (r7 == 0) goto L30
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Exception -> L48
            java.lang.String r3 = com.unionpay.UPPayWapActivity.L6(r0, r3, r2)     // Catch: java.lang.Exception -> L48
            r4 = r7
            com.unionpay.d r4 = (com.unionpay.d) r4     // Catch: java.lang.Exception -> L48
            r4.a(r3)     // Catch: java.lang.Exception -> L48
        L30:
            com.unionpay.UPPayWapActivity r3 = r5.f220720a     // Catch: java.lang.Exception -> L48
            int r4 = com.unionpay.UPPayWapActivity.f220665o     // Catch: java.lang.Exception -> L48
            r3.K6(r6, r1)     // Catch: java.lang.Exception -> L48
            if (r7 == 0) goto L47
            java.lang.String r6 = "0"
            java.lang.String r1 = "success"
            java.lang.String r6 = com.unionpay.UPPayWapActivity.L6(r6, r1, r2)     // Catch: java.lang.Exception -> L48
            r1 = r7
            com.unionpay.d r1 = (com.unionpay.d) r1     // Catch: java.lang.Exception -> L48
            r1.a(r6)     // Catch: java.lang.Exception -> L48
        L47:
            return
        L48:
            r6 = move-exception
            if (r7 == 0) goto L58
            java.lang.String r6 = r6.getMessage()
            java.lang.String r6 = com.unionpay.UPPayWapActivity.L6(r0, r6, r2)
            com.unionpay.d r7 = (com.unionpay.d) r7
            r7.a(r6)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.n.a(java.lang.String, com.unionpay.g):void");
    }
}
