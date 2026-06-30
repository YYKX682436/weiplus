package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class h1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.h1 f186216d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.h1();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f186217e = jz5.h.b(com.tencent.mm.plugin.webview.ui.tools.newjsapi.g1.f186100d);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (((java.util.List) ((jz5.n) com.tencent.mm.plugin.webview.ui.tools.newjsapi.h1.f186217e).getValue()).contains(r7) != false) goto L11;
     */
    @Override // nw4.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(nw4.k r12, nw4.y2 r13) {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.JsApiGetAdIdInfo"
            java.lang.String r1 = "getAdIdInfo but not valid host "
            java.lang.String r2 = "env"
            kotlin.jvm.internal.o.g(r12, r2)
            nw4.g r2 = r12.f340863d
            java.lang.String r3 = "msg"
            kotlin.jvm.internal.o.g(r13, r3)
            android.os.Bundle r3 = r13.f341015e
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L22
            java.lang.String r6 = "name"
            java.lang.String r3 = r3.getString(r6)
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r3 == 0) goto Laa
        L22:
            r3 = 0
            java.util.Map r6 = r13.f340790a     // Catch: java.lang.Exception -> Lb3
            java.lang.String r7 = "url"
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.o.e(r6, r7)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lb3
            android.net.Uri r7 = android.net.Uri.parse(r6)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r7 = r7.getHost()     // Catch: java.lang.Exception -> Lb3
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.K0(r7)     // Catch: java.lang.Exception -> Lb3
            if (r8 != 0) goto L53
            jz5.g r6 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.h1.f186217e     // Catch: java.lang.Exception -> Lb3
            jz5.n r6 = (jz5.n) r6     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Exception -> Lb3
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> Lb3
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Exception -> Lb3
            if (r6 == 0) goto L7f
        L51:
            r6 = r5
            goto L80
        L53:
            com.tencent.mm.vfs.r6 r8 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> Lb3
            java.lang.String r9 = lp0.b.h()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r10 = "websearch/template"
            r8.<init>(r9, r10)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r8 = r8.o()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r9 = "getAbsolutePath(...)"
            kotlin.jvm.internal.o.f(r8, r9)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r9 = "file://"
            java.lang.String r8 = r9.concat(r8)     // Catch: java.lang.Exception -> Lb3
            boolean r6 = r26.i0.y(r6, r8, r3)     // Catch: java.lang.Exception -> Lb3
            if (r6 != r5) goto L76
            r6 = r5
            goto L77
        L76:
            r6 = r3
        L77:
            if (r6 == 0) goto L7f
            java.lang.String r6 = "getAdIdInfo, isWebSearchUrl=true"
            com.tencent.mars.xlog.Log.i(r0, r6)     // Catch: java.lang.Exception -> Lb3
            goto L51
        L7f:
            r6 = r3
        L80:
            if (r6 != 0) goto Laa
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb3
            r12.<init>(r1)     // Catch: java.lang.Exception -> Lb3
            r12.append(r7)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Exception -> Lb3
            com.tencent.mars.xlog.Log.w(r0, r12)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r12 = r13.f341013c     // Catch: java.lang.Exception -> Lb3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb3
            r1.<init>()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r5 = r13.f341019i     // Catch: java.lang.Exception -> Lb3
            r1.append(r5)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r5 = ":fail invalid host"
            r1.append(r5)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lb3
            r2.e(r12, r1, r4)     // Catch: java.lang.Exception -> Lb3
            return r3
        Laa:
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.f1 r0 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.f1
            r0.<init>(r12, r13)
            pm0.v.K(r4, r0)
            return r5
        Lb3:
            r12 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "getAdIdInfo ex "
            r1.<init>(r5)
            java.lang.String r12 = r12.getMessage()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            com.tencent.mars.xlog.Log.w(r0, r12)
            java.lang.String r12 = r13.f341013c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = r13.f341019i
            r0.append(r13)
            java.lang.String r13 = ":fail"
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r2.e(r12, r13, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.h1.a(nw4.k, nw4.y2):boolean");
    }

    @Override // nw4.q2
    public int b() {
        return 375;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getAdIdInfo";
    }
}
