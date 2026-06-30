package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes9.dex */
public final class w3 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.x3 f143818d;

    public w3(com.tencent.mm.plugin.lite.jsapi.comms.x3 x3Var) {
        this.f143818d = x3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[Catch: Exception -> 0x0029, TRY_LEAVE, TryCatch #0 {Exception -> 0x0029, blocks: (B:18:0x0016, B:14:0x0023), top: B:17:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            bw5.j8 r6 = (bw5.j8) r6
            bw5.i8 r7 = (bw5.i8) r7
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r6 = "info"
            kotlin.jvm.internal.o.g(r7, r6)
            java.lang.String r6 = r7.b()
            r7 = 0
            if (r6 == 0) goto L1f
            int r0 = r6.length()     // Catch: java.lang.Exception -> L29
            if (r0 != 0) goto L1d
            goto L1f
        L1d:
            r0 = r7
            goto L20
        L1f:
            r0 = 1
        L20:
            if (r0 == 0) goto L23
            goto L29
        L23:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L29
            r0.<init>(r6)     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            com.tencent.mm.plugin.lite.jsapi.comms.x3 r1 = r5.f143818d
            java.lang.String r2 = "MicroMsg.LiteAppJsApiOpenEcsGiftReceivePage"
            if (r0 == 0) goto L54
            java.lang.String r3 = "errCode"
            r4 = -1
            r0.optInt(r3, r4)
            java.lang.String r3 = "errMsg"
            java.lang.String r4 = ""
            r0.optString(r3, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "OpenEcsGiftReceivePageTask, endWithValue: "
            r0.<init>(r3)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r6)
            com.tencent.mm.plugin.lite.api.o r6 = r1.f143443f
            r6.d(r7)
            goto L5e
        L54:
            java.lang.String r6 = "json decode error"
            com.tencent.mars.xlog.Log.i(r2, r6)
            com.tencent.mm.plugin.lite.api.o r7 = r1.f143443f
            r7.a(r6)
        L5e:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.jsapi.comms.w3.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
