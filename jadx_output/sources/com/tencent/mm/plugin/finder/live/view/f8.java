package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class f8 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f116297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ju1 f116298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f116299c;

    public f8(org.json.JSONObject jSONObject, r45.ju1 ju1Var, com.tencent.mm.ipcinvoker.r rVar) {
        this.f116297a = jSONObject;
        this.f116298b = ju1Var;
        this.f116299c = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (com.tencent.mm.sdk.platformtools.x.D0(r9, 80, android.graphics.Bitmap.CompressFormat.JPEG, r3, false) != false) goto L19;
     */
    @Override // ep0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(ip0.a r7, cp0.n r8, java.lang.Object r9) {
        /*
            r6 = this;
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            java.lang.String r7 = ""
            java.lang.String r8 = "FinderLiveProductRecordPlayWidget"
            org.json.JSONObject r0 = r6.f116297a
            com.tencent.mm.ipcinvoker.r r1 = r6.f116299c
            r2 = 0
            if (r9 == 0) goto L26
            java.lang.Class<c61.yb> r3 = c61.yb.class
            i95.m r3 = i95.n0.c(r3)
            c61.yb r3 = (c61.yb) r3
            c61.p2 r3 = (c61.p2) r3
            java.lang.String r3 = r3.fj()
            r4 = 80
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG
            boolean r9 = com.tencent.mm.sdk.platformtools.x.D0(r9, r4, r5, r3, r2)
            if (r9 == 0) goto L26
            goto L27
        L26:
            r3 = 0
        L27:
            boolean r9 = com.tencent.mm.sdk.platformtools.t8.K0(r3)     // Catch: java.lang.Exception -> L65
            if (r9 != 0) goto L57
            java.lang.String r9 = "image_path"
            r0.put(r9, r3)     // Catch: java.lang.Exception -> L65
            r45.ju1 r9 = r6.f116298b     // Catch: java.lang.Exception -> L65
            r3 = 3
            com.tencent.mm.protobuf.f r9 = r9.getCustom(r3)     // Catch: java.lang.Exception -> L65
            r45.y23 r9 = (r45.y23) r9     // Catch: java.lang.Exception -> L65
            if (r9 == 0) goto L4a
            java.lang.String r3 = "product_info"
            byte[] r9 = r9.toByteArray()     // Catch: java.lang.Exception -> L65
            java.lang.String r9 = ot5.e.a(r9)     // Catch: java.lang.Exception -> L65
            r0.put(r3, r9)     // Catch: java.lang.Exception -> L65
        L4a:
            com.tencent.mm.ipcinvoker.type.IPCString r9 = new com.tencent.mm.ipcinvoker.type.IPCString     // Catch: java.lang.Exception -> L65
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L65
            r9.<init>(r0)     // Catch: java.lang.Exception -> L65
            r1.a(r9)     // Catch: java.lang.Exception -> L65
            goto L75
        L57:
            java.lang.String r9 = "save bitmap failed"
            com.tencent.mars.xlog.Log.e(r8, r9)     // Catch: java.lang.Exception -> L65
            com.tencent.mm.ipcinvoker.type.IPCString r9 = new com.tencent.mm.ipcinvoker.type.IPCString     // Catch: java.lang.Exception -> L65
            r9.<init>(r7)     // Catch: java.lang.Exception -> L65
            r1.a(r9)     // Catch: java.lang.Exception -> L65
            goto L75
        L65:
            r9 = move-exception
            java.lang.String r0 = "construct result json failed"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r8, r9, r0, r2)
            com.tencent.mm.ipcinvoker.type.IPCString r8 = new com.tencent.mm.ipcinvoker.type.IPCString
            r8.<init>(r7)
            r1.a(r8)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.f8.a(ip0.a, cp0.n, java.lang.Object):void");
    }
}
