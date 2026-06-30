package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes7.dex */
public final class va0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ya0 f136232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f136233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(com.tencent.mm.plugin.finder.viewmodel.component.ya0 ya0Var, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f136232d = ya0Var;
        this.f136233e = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:8:0x0058, B:10:0x0064, B:15:0x0070, B:17:0x007d, B:19:0x0089, B:21:0x008f, B:23:0x0097, B:24:0x009a), top: B:7:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:8:0x0058, B:10:0x0064, B:15:0x0070, B:17:0x007d, B:19:0x0089, B:21:0x008f, B:23:0x0097, B:24:0x009a), top: B:7:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #0 {all -> 0x009d, blocks: (B:8:0x0058, B:10:0x0064, B:15:0x0070, B:17:0x007d, B:19:0x0089, B:21:0x008f, B:23:0x0097, B:24:0x009a), top: B:7:0x0058 }] */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            com.tencent.mm.network.j2 r7 = (com.tencent.mm.network.j2) r7
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.o.g(r7, r0)
            r0 = 0
            r7.f72045k = r0
            java.lang.String r1 = "POST"
            r7.f72043i = r1
            r1 = 1
            r7.f72047m = r1
            r7.f72054t = r1
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json"
            r7.h(r2, r3)
            kotlin.jvm.internal.h0 r2 = r6.f136233e
            java.lang.Object r3 = r2.f310123d
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.lang.String r3 = r3.toString()
            int r3 = r3.length()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Content-Length"
            r7.h(r4, r3)
            java.lang.Object r2 = r2.f310123d
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            java.nio.charset.Charset r3 = r26.c.f368865a
            byte[] r2 = r2.getBytes(r3)
            java.lang.String r3 = "getBytes(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            r7.f72044j = r2
            int r2 = r7.f()
            r3 = 200(0xc8, float:2.8E-43)
            java.lang.String r4 = "FinderWifiHintUIC"
            com.tencent.mm.plugin.finder.viewmodel.component.ya0 r5 = r6.f136232d
            if (r2 != r3) goto Lb4
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.lang.Throwable -> L9d
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = s46.d.d(r7, r2)     // Catch: java.lang.Throwable -> L9d
            if (r7 == 0) goto L6d
            int r2 = r7.length()     // Catch: java.lang.Throwable -> L9d
            if (r2 != 0) goto L6b
            goto L6d
        L6b:
            r2 = r0
            goto L6e
        L6d:
            r2 = r1
        L6e:
            if (r2 != 0) goto Lc7
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9d
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = "businessParameter"
            java.lang.Object r7 = r2.get(r7)     // Catch: java.lang.Throwable -> L9d
            if (r7 == 0) goto L94
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "needFreeFlow"
            java.lang.Object r7 = r7.get(r2)     // Catch: java.lang.Throwable -> L9d
            boolean r2 = r7 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L8c
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L9d
            goto L8d
        L8c:
            r7 = 0
        L8d:
            if (r7 == 0) goto L94
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L9d
            goto L95
        L94:
            r7 = r0
        L95:
            if (r7 == 0) goto L9a
            r5.f136548h = r1     // Catch: java.lang.Throwable -> L9d
            goto Lc7
        L9a:
            r5.f136548h = r0     // Catch: java.lang.Throwable -> L9d
            goto Lc7
        L9d:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "json error e="
            r0.<init>(r1)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.tencent.mars.xlog.Log.e(r4, r7)
            goto Lc7
        Lb4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "http request err "
            r7.<init>(r1)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r4, r7)
            r5.f136548h = r0
        Lc7:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.va0.invoke(java.lang.Object):java.lang.Object");
    }
}
