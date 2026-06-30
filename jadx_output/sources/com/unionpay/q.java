package com.unionpay;

/* loaded from: classes13.dex */
public final class q implements com.unionpay.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.UPPayWapActivity f220723a;

    public q(com.unionpay.UPPayWapActivity uPPayWapActivity) {
        this.f220723a = uPPayWapActivity;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:24|(3:38|39|(6:41|27|28|29|30|(3:35|(2:13|14)(1:16)|15)))|26|27|28|29|30|(4:33|35|(0)(0)|15)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
    
        r5 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087 A[SYNTHETIC] */
    @Override // com.unionpay.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r13, com.unionpay.g r14) {
        /*
            r12 = this;
            java.lang.String r0 = "1"
            r1 = 0
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lab
            r2.<init>(r13)     // Catch: java.lang.Exception -> Lab
            int r13 = r2.length()     // Catch: java.lang.Exception -> Lab
            if (r13 <= 0) goto L9c
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lab
            r13.<init>()     // Catch: java.lang.Exception -> Lab
            r3 = 0
            r4 = r3
        L15:
            int r5 = r2.length()     // Catch: java.lang.Exception -> Lab
            java.lang.String r6 = "0"
            if (r4 >= r5) goto L8d
            org.json.JSONObject r5 = r2.getJSONObject(r4)     // Catch: java.lang.Exception -> Lab
            java.lang.String r7 = "packageName"
            java.lang.String r7 = r5.getString(r7)     // Catch: java.lang.Exception -> Lab
            java.lang.String r8 = "packageSign"
            java.lang.String r8 = r5.getString(r8)     // Catch: java.lang.Exception -> Lab
            java.lang.String r9 = "supportVersion"
            java.lang.String r5 = r5.getString(r9)     // Catch: java.lang.Exception -> Lab
            com.unionpay.UPPayWapActivity r9 = r12.f220723a     // Catch: java.lang.Exception -> Lab
            java.util.HashMap r10 = qy5.b.f367792a     // Catch: java.lang.Exception -> Lab
            if (r9 == 0) goto L83
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L83
            if (r10 != 0) goto L83
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L83
            if (r10 != 0) goto L83
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L83
            if (r10 != 0) goto L83
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L83
            if (r10 != 0) goto L5e
            android.content.pm.PackageManager r10 = r9.getPackageManager()     // Catch: java.lang.Exception -> L5e
            android.content.pm.PackageInfo r10 = r10.getPackageInfo(r7, r3)     // Catch: java.lang.Exception -> L5e
            if (r10 == 0) goto L5e
            int r10 = r10.versionCode     // Catch: java.lang.Exception -> L5e
            goto L5f
        L5e:
            r10 = r3
        L5f:
            r11 = 10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5, r11)     // Catch: java.lang.Exception -> L6a
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L6a
            goto L6d
        L6a:
            r5 = 2147483647(0x7fffffff, float:NaN)
        L6d:
            boolean r11 = qy5.b.d(r9, r7)     // Catch: java.lang.Exception -> L83
            if (r11 == 0) goto L83
            if (r10 < r5) goto L83
            java.lang.String r5 = "SHA256"
            java.lang.String r5 = qy5.b.f(r9, r7, r5)     // Catch: java.lang.Exception -> L83
            boolean r5 = r8.equalsIgnoreCase(r5)     // Catch: java.lang.Exception -> L83
            if (r5 == 0) goto L83
            r5 = 1
            goto L84
        L83:
            r5 = r3
        L84:
            if (r5 == 0) goto L87
            r6 = r0
        L87:
            r13.put(r7, r6)     // Catch: java.lang.Exception -> Lab
            int r4 = r4 + 1
            goto L15
        L8d:
            if (r14 == 0) goto L9b
            java.lang.String r2 = "success"
            java.lang.String r13 = com.unionpay.UPPayWapActivity.M6(r6, r2, r13)     // Catch: java.lang.Exception -> Lab
            r2 = r14
            com.unionpay.d r2 = (com.unionpay.d) r2     // Catch: java.lang.Exception -> Lab
            r2.a(r13)     // Catch: java.lang.Exception -> Lab
        L9b:
            return
        L9c:
            if (r14 == 0) goto Laa
            java.lang.String r13 = "Parameter error"
            java.lang.String r13 = com.unionpay.UPPayWapActivity.L6(r0, r13, r1)     // Catch: java.lang.Exception -> Lab
            r2 = r14
            com.unionpay.d r2 = (com.unionpay.d) r2     // Catch: java.lang.Exception -> Lab
            r2.a(r13)     // Catch: java.lang.Exception -> Lab
        Laa:
            return
        Lab:
            r13 = move-exception
            if (r14 == 0) goto Lbb
            java.lang.String r13 = r13.getMessage()
            java.lang.String r13 = com.unionpay.UPPayWapActivity.L6(r0, r13, r1)
            com.unionpay.d r14 = (com.unionpay.d) r14
            r14.a(r13)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.q.a(java.lang.String, com.unionpay.g):void");
    }
}
