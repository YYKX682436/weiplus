package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f139597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sd.b f139598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.c1 f139599g;

    public b1(com.tencent.mm.plugin.game.luggage.jsapi.c1 c1Var, java.lang.String str, java.util.Map map, sd.b bVar) {
        this.f139599g = c1Var;
        this.f139596d = str;
        this.f139597e = map;
        this.f139598f = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r13 = this;
            com.tencent.mm.plugin.game.luggage.jsapi.c1 r0 = r13.f139599g
            java.lang.String r1 = r13.f139596d
            java.util.Map r2 = r13.f139597e
            r0.getClass()
            com.tencent.mm.plugin.wepkg.model.WepkgVersion r0 = com.tencent.mm.plugin.wepkg.model.o0.e(r1)
            java.lang.String r1 = "data"
            r3 = 0
            java.lang.String r4 = "MicroMsg.JsApiGetWepkgFileInfo"
            if (r0 == 0) goto Lb0
            java.lang.String r5 = r0.f188377g
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r5)
            if (r5 == 0) goto L1e
            goto Lb0
        L1e:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "version"
            java.lang.String r7 = r0.f188376f     // Catch: org.json.JSONException -> La1
            r5.put(r6, r7)     // Catch: org.json.JSONException -> La1
            com.tencent.mm.vfs.r6 r6 = new com.tencent.mm.vfs.r6     // Catch: org.json.JSONException -> La1
            java.lang.String r0 = r0.f188377g     // Catch: org.json.JSONException -> La1
            r6.<init>(r0)     // Catch: org.json.JSONException -> La1
            boolean r0 = r6.m()     // Catch: org.json.JSONException -> La1
            if (r0 != 0) goto L3a
            goto Lb6
        L3a:
            com.tencent.mm.plugin.wepkg.model.o r0 = new com.tencent.mm.plugin.wepkg.model.o     // Catch: org.json.JSONException -> La1
            r0.<init>(r6)     // Catch: org.json.JSONException -> La1
            r45.l87 r6 = r0.f188450e     // Catch: org.json.JSONException -> La1
            if (r6 != 0) goto L44
            goto Lb6
        L44:
            java.util.LinkedList r7 = r6.f379238d     // Catch: org.json.JSONException -> La1
            if (r7 == 0) goto Lb7
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: org.json.JSONException -> La1
            r7.<init>()     // Catch: org.json.JSONException -> La1
            java.util.LinkedList r6 = r6.f379238d     // Catch: org.json.JSONException -> La1
            java.util.Iterator r6 = r6.iterator()     // Catch: org.json.JSONException -> La1
        L53:
            boolean r8 = r6.hasNext()     // Catch: org.json.JSONException -> La1
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r6.next()     // Catch: org.json.JSONException -> La1
            r45.ps0 r8 = (r45.ps0) r8     // Catch: org.json.JSONException -> La1
            java.util.Set r9 = r2.keySet()     // Catch: org.json.JSONException -> La1
            java.lang.String r10 = r8.f383367d     // Catch: org.json.JSONException -> La1
            boolean r9 = r9.contains(r10)     // Catch: org.json.JSONException -> La1
            if (r9 == 0) goto L53
            java.lang.String r9 = r8.f383367d     // Catch: org.json.JSONException -> La1
            java.lang.Object r9 = r2.get(r9)     // Catch: org.json.JSONException -> La1
            java.lang.String r9 = (java.lang.String) r9     // Catch: org.json.JSONException -> La1
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: org.json.JSONException -> La1
            r10.<init>()     // Catch: org.json.JSONException -> La1
            java.lang.String r11 = "rid"
            java.lang.String r12 = r8.f383367d     // Catch: org.json.JSONException -> La1
            r10.put(r11, r12)     // Catch: org.json.JSONException -> La1
            java.lang.String r11 = "size"
            int r12 = r8.f383369f     // Catch: org.json.JSONException -> La1
            r10.put(r11, r12)     // Catch: org.json.JSONException -> La1
            java.lang.String r11 = "mimeType"
            java.lang.String r12 = r8.f383370g     // Catch: org.json.JSONException -> La1
            r10.put(r11, r12)     // Catch: org.json.JSONException -> La1
            java.lang.String r8 = r8.f383367d     // Catch: org.json.JSONException -> La1
            java.lang.String r8 = r0.d(r8, r9)     // Catch: org.json.JSONException -> La1
            r10.put(r1, r8)     // Catch: org.json.JSONException -> La1
            r7.put(r10)     // Catch: org.json.JSONException -> La1
            goto L53
        L9b:
            java.lang.String r0 = "fileList"
            r5.put(r0, r7)     // Catch: org.json.JSONException -> La1
            goto Lb7
        La1:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "errMsg:%s"
            com.tencent.mars.xlog.Log.e(r4, r2, r0)
            goto Lb7
        Lb0:
            java.lang.String r0 = "wepkgVersion not exists or pkgPath is empty"
            com.tencent.mars.xlog.Log.i(r4, r0)
        Lb6:
            r5 = r3
        Lb7:
            if (r5 != 0) goto Lc1
            sd.b r0 = r13.f139598f
            java.lang.String r1 = "fail"
            r0.c(r1, r3)
            return
        Lc1:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r0.put(r1, r5)     // Catch: org.json.JSONException -> Lc9
        Lc9:
            sd.b r1 = r13.f139598f
            r1.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.luggage.jsapi.b1.run():void");
    }
}
