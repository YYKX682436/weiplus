package pe;

/* loaded from: classes7.dex */
public abstract class d {
    /* JADX WARN: Can't wrap try/catch for region: R(10:10|11|(1:31)|(7:26|27|17|18|19|(1:21)|23)|16|17|18|19|(0)|23) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        com.tencent.mars.xlog.Log.e("Luggage.ExptMapping", "createForFeatureValue(" + r8 + ") fill mapping get exception:" + r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[Catch: JSONException -> 0x005d, TRY_LEAVE, TryCatch #1 {JSONException -> 0x005d, blocks: (B:19:0x004a, B:21:0x0054), top: B:18:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final pe.e a(java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = ") toJSONArray get exception:"
            java.lang.String r1 = "createForFeatureValue("
            java.lang.String r2 = "Luggage.ExptMapping"
            r3 = 0
            r4 = 1
            if (r8 == 0) goto L13
            int r5 = r8.length()
            if (r5 != 0) goto L11
            goto L13
        L11:
            r5 = r3
            goto L14
        L13:
            r5 = r4
        L14:
            r6 = 0
            if (r5 == 0) goto L18
            return r6
        L18:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: org.json.JSONException -> L76
            r5.<init>(r8)     // Catch: org.json.JSONException -> L76
            if (r9 == 0) goto L25
            int r7 = r9.length()
            if (r7 != 0) goto L26
        L25:
            r3 = r4
        L26:
            if (r3 != 0) goto L44
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: org.json.JSONException -> L2e
            r3.<init>(r9)     // Catch: org.json.JSONException -> L2e
            goto L45
        L2e:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r9)
            r4.append(r0)
            r4.append(r3)
            java.lang.String r9 = r4.toString()
            com.tencent.mars.xlog.Log.e(r2, r9)
        L44:
            r3 = r6
        L45:
            pe.e r9 = new pe.e
            r9.<init>(r6)
            pe.b r0 = new pe.b     // Catch: org.json.JSONException -> L5d
            r0.<init>(r9)     // Catch: org.json.JSONException -> L5d
            cf.f.b(r5, r0)     // Catch: org.json.JSONException -> L5d
            if (r3 == 0) goto L75
            pe.c r0 = new pe.c     // Catch: org.json.JSONException -> L5d
            r0.<init>(r9)     // Catch: org.json.JSONException -> L5d
            cf.f.b(r3, r0)     // Catch: org.json.JSONException -> L5d
            goto L75
        L5d:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r8)
            java.lang.String r8 = ") fill mapping get exception:"
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = r3.toString()
            com.tencent.mars.xlog.Log.e(r2, r8)
        L75:
            return r9
        L76:
            r9 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r8)
            r3.append(r0)
            r3.append(r9)
            java.lang.String r8 = r3.toString()
            com.tencent.mars.xlog.Log.e(r2, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.d.a(java.lang.String, java.lang.String):pe.e");
    }
}
