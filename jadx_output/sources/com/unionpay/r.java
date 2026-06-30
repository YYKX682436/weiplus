package com.unionpay;

/* loaded from: classes13.dex */
public final class r implements com.unionpay.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.UPPayWapActivity f220724a;

    public r(com.unionpay.UPPayWapActivity uPPayWapActivity) {
        this.f220724a = uPPayWapActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // com.unionpay.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r14, com.unionpay.g r15) {
        /*
            r13 = this;
            java.lang.String r0 = "extra"
            java.lang.String r1 = "1"
            com.unionpay.UPPayWapActivity r2 = r13.f220724a
            r3 = 0
            r2.f220673n = r15     // Catch: java.lang.Exception -> Lcf
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lcf
            r4.<init>(r14)     // Catch: java.lang.Exception -> Lcf
            java.lang.String r14 = "packageName"
            java.lang.String r14 = r4.getString(r14)     // Catch: java.lang.Exception -> Lcf
            java.lang.String r5 = "type"
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Exception -> Lcf
            java.lang.String r6 = "openParams"
            java.lang.String r6 = r4.optString(r6)     // Catch: java.lang.Exception -> Lcf
            java.lang.String r7 = "tn"
            java.lang.String r7 = r4.optString(r7)     // Catch: java.lang.Exception -> Lcf
            java.lang.String r4 = r4.optString(r0)     // Catch: java.lang.Exception -> Lcf
            java.lang.String r8 = "0"
            boolean r8 = r8.equals(r5)     // Catch: java.lang.Exception -> Lcf
            java.lang.String r9 = "Call application error"
            r10 = 1
            java.lang.String r11 = "Parameter error"
            java.lang.String r12 = "2"
            if (r8 == 0) goto L7e
            boolean r5 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Exception -> Lcf
            if (r5 != 0) goto L71
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> Lcf
            if (r5 != 0) goto L71
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Exception -> Lcf
            r5.<init>()     // Catch: java.lang.Exception -> Lcf
            java.lang.String r6 = "com.unionpay.uppay.PayActivity"
            r5.setClassName(r14, r6)     // Catch: java.lang.Exception -> Lcf
            java.lang.String r14 = "paydata"
            r5.putExtra(r14, r7)     // Catch: java.lang.Exception -> Lcf
            int r14 = com.unionpay.UPPayWapActivity.f220665o     // Catch: java.lang.Exception -> Lcf
            java.lang.String r14 = "ex_mode"
            java.lang.String r6 = r2.f220670h     // Catch: java.lang.Exception -> Lcf
            r5.putExtra(r14, r6)     // Catch: java.lang.Exception -> Lcf
            r5.putExtra(r0, r4)     // Catch: java.lang.Exception -> Lcf
            r2.startActivityForResult(r5, r10)     // Catch: java.lang.Exception -> L64
            return
        L64:
            if (r15 == 0) goto L70
            java.lang.String r14 = com.unionpay.UPPayWapActivity.L6(r12, r9, r3)     // Catch: java.lang.Exception -> Lcf
            r0 = r15
            com.unionpay.d r0 = (com.unionpay.d) r0     // Catch: java.lang.Exception -> Lcf
            r0.a(r14)     // Catch: java.lang.Exception -> Lcf
        L70:
            return
        L71:
            if (r15 == 0) goto Lce
            java.lang.String r14 = com.unionpay.UPPayWapActivity.L6(r1, r11, r3)     // Catch: java.lang.Exception -> Lcf
            r0 = r15
            com.unionpay.d r0 = (com.unionpay.d) r0     // Catch: java.lang.Exception -> Lcf
            r0.a(r14)     // Catch: java.lang.Exception -> Lcf
            return
        L7e:
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Exception -> Lcf
            if (r5 == 0) goto Lc2
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> Lcf
            if (r5 != 0) goto Lb5
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Exception -> Lcf
            java.lang.String r7 = "android.intent.action.VIEW"
            r5.<init>(r7)     // Catch: java.lang.Exception -> Lcf
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: java.lang.Exception -> Lcf
            r5.setData(r6)     // Catch: java.lang.Exception -> Lcf
            r5.putExtra(r0, r4)     // Catch: java.lang.Exception -> Lcf
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Exception -> Lcf
            if (r0 != 0) goto La4
            r5.setPackage(r14)     // Catch: java.lang.Exception -> Lcf
        La4:
            r2.startActivityForResult(r5, r10)     // Catch: java.lang.Exception -> La8
            return
        La8:
            if (r15 == 0) goto Lb4
            java.lang.String r14 = com.unionpay.UPPayWapActivity.L6(r12, r9, r3)     // Catch: java.lang.Exception -> Lcf
            r0 = r15
            com.unionpay.d r0 = (com.unionpay.d) r0     // Catch: java.lang.Exception -> Lcf
            r0.a(r14)     // Catch: java.lang.Exception -> Lcf
        Lb4:
            return
        Lb5:
            if (r15 == 0) goto Lce
            java.lang.String r14 = com.unionpay.UPPayWapActivity.L6(r1, r11, r3)     // Catch: java.lang.Exception -> Lcf
            r0 = r15
            com.unionpay.d r0 = (com.unionpay.d) r0     // Catch: java.lang.Exception -> Lcf
            r0.a(r14)     // Catch: java.lang.Exception -> Lcf
            return
        Lc2:
            if (r15 == 0) goto Lce
            java.lang.String r14 = com.unionpay.UPPayWapActivity.L6(r1, r11, r3)     // Catch: java.lang.Exception -> Lcf
            r0 = r15
            com.unionpay.d r0 = (com.unionpay.d) r0     // Catch: java.lang.Exception -> Lcf
            r0.a(r14)     // Catch: java.lang.Exception -> Lcf
        Lce:
            return
        Lcf:
            r14 = move-exception
            if (r15 == 0) goto Ldf
            java.lang.String r14 = r14.getMessage()
            java.lang.String r14 = com.unionpay.UPPayWapActivity.L6(r1, r14, r3)
            com.unionpay.d r15 = (com.unionpay.d) r15
            r15.a(r14)
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.r.a(java.lang.String, com.unionpay.g):void");
    }
}
