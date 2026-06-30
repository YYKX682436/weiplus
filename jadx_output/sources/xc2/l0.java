package xc2;

/* loaded from: classes10.dex */
public final class l0 {
    public l0(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fb, code lost:
    
        r5 = new org.json.JSONObject(r1);
        r8 = r5.optBoolean("useNativeRender");
        r5 = r5.optString("searchID");
        r7.f453131c = r2;
        r7.f453129a = r4;
        r7.f453130b = r1;
        r7.f453132d = r8;
        r7.f453133e = r15;
        r7.f453134f = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x021a, code lost:
    
        if (r0 != null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021e, code lost:
    
        r7.f453135g = r3;
        kotlin.jvm.internal.o.d(r5);
        r7.f453136h = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x021d, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b4 A[Catch: all -> 0x0235, TryCatch #0 {all -> 0x0235, blocks: (B:25:0x00b6, B:27:0x00c4, B:31:0x00cf, B:34:0x00e4, B:36:0x00ea, B:38:0x00f1, B:40:0x0112, B:43:0x0129, B:45:0x013f, B:47:0x0159, B:49:0x0173, B:53:0x0190, B:57:0x019c, B:58:0x01ac, B:60:0x01b4, B:63:0x01bf, B:67:0x01ca, B:69:0x01d2, B:71:0x01dc, B:73:0x01e6, B:76:0x01f1, B:79:0x01fb, B:82:0x021e, B:96:0x01a2, B:110:0x00d8), top: B:24:0x00b6, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ca A[Catch: all -> 0x0235, TryCatch #0 {all -> 0x0235, blocks: (B:25:0x00b6, B:27:0x00c4, B:31:0x00cf, B:34:0x00e4, B:36:0x00ea, B:38:0x00f1, B:40:0x0112, B:43:0x0129, B:45:0x013f, B:47:0x0159, B:49:0x0173, B:53:0x0190, B:57:0x019c, B:58:0x01ac, B:60:0x01b4, B:63:0x01bf, B:67:0x01ca, B:69:0x01d2, B:71:0x01dc, B:73:0x01e6, B:76:0x01f1, B:79:0x01fb, B:82:0x021e, B:96:0x01a2, B:110:0x00d8), top: B:24:0x00b6, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xc2.f3 a(com.tencent.mm.sdk.platformtools.o4 r21, int r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.l0.a(com.tencent.mm.sdk.platformtools.o4, int, java.lang.String, java.lang.String, java.lang.String):xc2.f3");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0016 A[Catch: Exception -> 0x0011, TRY_LEAVE, TryCatch #0 {Exception -> 0x0011, blocks: (B:18:0x0009, B:5:0x0016), top: B:17:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "ParentType"
            r3 = -1000000(0xfffffffffff0bdc0, float:NaN)
            if (r7 == 0) goto L13
            boolean r4 = r7.has(r2)     // Catch: java.lang.Exception -> L11
            if (r4 != r0) goto L13
            r4 = r0
            goto L14
        L11:
            r7 = move-exception
            goto L1c
        L13:
            r4 = r1
        L14:
            if (r4 == 0) goto L27
            int r7 = r7.getInt(r2)     // Catch: java.lang.Exception -> L11
            r3 = r7
            goto L27
        L1c:
            java.lang.String r2 = ""
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r4 = "safeGetInt"
            com.tencent.mm.sdk.platformtools.Log.a(r4, r2, r7)
        L27:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "isParentTypeMatch, parentType="
            r7.<init>(r2)
            r7.append(r6)
            java.lang.String r2 = ", parentTypeFromJson="
            r7.append(r2)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "FinderHalfScreenWebSearchPreRequestHelper"
            com.tencent.mars.xlog.Log.i(r2, r7)
            if (r6 != r3) goto L45
            goto L46
        L45:
            r0 = r1
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.l0.b(int, org.json.JSONObject):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #1 {Exception -> 0x0031, blocks: (B:26:0x0029, B:10:0x0036), top: B:25:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0018 A[Catch: Exception -> 0x0013, TRY_LEAVE, TryCatch #0 {Exception -> 0x0013, blocks: (B:35:0x000b, B:5:0x0018), top: B:34:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.String r9, org.json.JSONObject r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "safeGetString"
            r2 = 1
            r3 = 0
            java.lang.String r4 = "Keyword"
            r5 = 0
            if (r10 == 0) goto L15
            boolean r6 = r10.has(r4)     // Catch: java.lang.Exception -> L13
            if (r6 != r2) goto L15
            r6 = r2
            goto L16
        L13:
            r4 = move-exception
            goto L1d
        L15:
            r6 = r3
        L16:
            if (r6 == 0) goto L24
            java.lang.String r4 = r10.getString(r4)     // Catch: java.lang.Exception -> L13
            goto L25
        L1d:
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            com.tencent.mm.sdk.platformtools.Log.a(r1, r0, r4)
        L24:
            r4 = r5
        L25:
            java.lang.String r6 = "originKeyword"
            if (r10 == 0) goto L33
            boolean r7 = r10.has(r6)     // Catch: java.lang.Exception -> L31
            if (r7 != r2) goto L33
            r7 = r2
            goto L34
        L31:
            r10 = move-exception
            goto L3c
        L33:
            r7 = r3
        L34:
            if (r7 == 0) goto L43
            java.lang.String r10 = r10.getString(r6)     // Catch: java.lang.Exception -> L31
            r5 = r10
            goto L43
        L3c:
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            com.tencent.mm.sdk.platformtools.Log.a(r1, r0, r10)
        L43:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "isQueryMatch, query="
            r10.<init>(r0)
            r10.append(r9)
            java.lang.String r0 = ", keyword="
            r10.append(r0)
            r10.append(r4)
            java.lang.String r0 = ", originKeyword="
            r10.append(r0)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "FinderHalfScreenWebSearchPreRequestHelper"
            com.tencent.mars.xlog.Log.i(r0, r10)
            boolean r10 = kotlin.jvm.internal.o.b(r9, r4)
            if (r10 != 0) goto L74
            boolean r9 = kotlin.jvm.internal.o.b(r9, r5)
            if (r9 == 0) goto L73
            goto L74
        L73:
            r2 = r3
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.l0.c(java.lang.String, org.json.JSONObject):boolean");
    }

    public final boolean d(java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("preReq");
        org.json.JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("preheatSearchContext") : null;
        java.lang.String optString = optJSONObject2 != null ? optJSONObject2.optString("preheat_token") : null;
        com.tencent.mars.xlog.Log.i("FinderHalfScreenWebSearchPreRequestHelper", "isTokenMatch, token=" + str + ", tokenFromPreheat=" + optString);
        return kotlin.jvm.internal.o.b(str, optString);
    }
}
