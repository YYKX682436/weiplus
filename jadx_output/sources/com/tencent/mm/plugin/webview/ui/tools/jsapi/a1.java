package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class a1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f184902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f184903b;

    public a1(nw4.y2 y2Var, nw4.k kVar) {
        this.f184902a = y2Var;
        this.f184903b = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r2 == null) goto L17;
     */
    @Override // nf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.JsApiRequestKidsPayRechargePayment"
            java.lang.String r2 = "on Activity result: %s"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            int r0 = com.tencent.mm.plugin.webview.ui.tools.jsapi.b1.f184942e
            r1 = 0
            if (r6 == r0) goto L15
            return r1
        L15:
            r6 = 1
            r0 = 0
            if (r8 == 0) goto L2e
            java.lang.String r2 = "ret"
            java.lang.String r2 = r8.getStringExtra(r2)
            if (r2 == 0) goto L2e
            r3 = -1
            if (r7 != r3) goto L27
            r7 = r6
            goto L28
        L27:
            r7 = r1
        L28:
            if (r7 == 0) goto L2b
            goto L2c
        L2b:
            r2 = r0
        L2c:
            if (r2 != 0) goto L30
        L2e:
            java.lang.String r2 = "fail"
        L30:
            nw4.y2 r7 = r5.f184902a
            java.lang.String r3 = r7.f341019i
            java.lang.String r4 = "function"
            kotlin.jvm.internal.o.f(r3, r4)
            boolean r3 = r26.i0.y(r2, r3, r1)
            if (r3 != 0) goto L50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r7.f341019i
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L50:
            nw4.k r3 = r5.f184903b
            nw4.g r4 = r3.f340863d
            java.lang.String r7 = r7.f341013c
            r4.e(r7, r2, r0)
            android.content.Context r7 = r3.f340860a
            boolean r2 = r7 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI
            if (r2 == 0) goto L62
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r7 = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) r7
            goto L63
        L62:
            r7 = r0
        L63:
            if (r7 == 0) goto L78
            if (r8 == 0) goto L70
            java.lang.String r2 = "closeWindow"
            int r8 = r8.getIntExtra(r2, r1)
            if (r8 != r6) goto L70
            r1 = r6
        L70:
            if (r1 == 0) goto L73
            r0 = r7
        L73:
            if (r0 == 0) goto L78
            r0.finish()
        L78:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.jsapi.a1.a(int, int, android.content.Intent):boolean");
    }
}
