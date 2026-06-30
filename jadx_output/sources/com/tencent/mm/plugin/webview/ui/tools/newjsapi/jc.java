package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class jc extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.jc f186290d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.jc();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[Catch: Exception -> 0x007a, TRY_LEAVE, TryCatch #2 {Exception -> 0x007a, blocks: (B:16:0x005d, B:18:0x0069, B:23:0x0075), top: B:15:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    @Override // nw4.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(nw4.k r9, nw4.y2 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "env"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "MicroMsg.JsApiSetPageTitle"
            android.os.Bundle r1 = new android.os.Bundle
            r2 = 2
            r1.<init>(r2)
            java.util.Map r2 = r10.f340790a
            java.lang.String r3 = "title"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "set_page_title_text"
            r1.putString(r3, r2)
            java.lang.String r2 = ""
            java.util.Map r3 = r10.f340790a     // Catch: java.lang.Exception -> L4f
            java.lang.String r4 = "wxcolor"
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Exception -> L4f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L4f
            java.lang.String r3 = com.tencent.mm.pluginsdk.ui.tools.e9.e(r3)     // Catch: java.lang.Exception -> L4f
            if (r3 != 0) goto L37
            r3 = r2
        L37:
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r3)     // Catch: java.lang.Exception -> L4d
            if (r4 == 0) goto L5a
            java.util.Map r4 = r10.f340790a     // Catch: java.lang.Exception -> L4d
            java.lang.String r5 = "color"
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> L4d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L4d
            if (r4 != 0) goto L4a
            goto L4b
        L4a:
            r2 = r4
        L4b:
            r3 = r2
            goto L5a
        L4d:
            r2 = move-exception
            goto L53
        L4f:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
        L53:
            java.lang.String r2 = r2.getMessage()
            com.tencent.mars.xlog.Log.e(r0, r2)
        L5a:
            r2 = 1
            r4 = 1065353216(0x3f800000, float:1.0)
            java.util.Map r5 = r10.f340790a     // Catch: java.lang.Exception -> L7a
            java.lang.String r6 = "alpha"
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Exception -> L7a
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L7a
            if (r5 == 0) goto L72
            boolean r6 = r26.n0.N(r5)     // Catch: java.lang.Exception -> L7a
            if (r6 == 0) goto L70
            goto L72
        L70:
            r6 = 0
            goto L73
        L72:
            r6 = r2
        L73:
            if (r6 != 0) goto L82
            float r4 = com.tencent.mm.sdk.platformtools.t8.L(r5, r4)     // Catch: java.lang.Exception -> L7a
            goto L82
        L7a:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            com.tencent.mars.xlog.Log.e(r0, r5)
        L82:
            java.lang.String r0 = "set_page_title_color"
            r1.putString(r0, r3)
            java.lang.String r0 = "set_page_title_alpha"
            r1.putFloat(r0, r4)
            com.tencent.mm.plugin.webview.stub.z0 r0 = r9.b()
            if (r0 == 0) goto L99
            r3 = 43
            r0.i(r3, r1)
        L99:
            java.lang.String r10 = r10.f341013c
            r0 = 0
            nw4.g r9 = r9.f340863d
            java.lang.String r1 = "setPageTitle:ok"
            r9.e(r10, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.jc.a(nw4.k, nw4.y2):boolean");
    }

    @Override // nw4.q2
    public int b() {
        return 113;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "setPageTitle";
    }
}
