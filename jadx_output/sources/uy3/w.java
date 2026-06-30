package uy3;

/* loaded from: classes8.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final uy3.w f431999d = new uy3.w();

    public w() {
        super(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r2.f211376y != false) goto L14;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r8 = this;
            uy3.z r0 = uy3.z.f432002a
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.BoxWebViewPreloadManager"
            java.lang.String r2 = "preloadBoxWebViewInner cacheWebView: %s, isDestroyed: %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L82
            com.tencent.mm.plugin.box.webview.BoxWebView r4 = uy3.z.f432003b     // Catch: java.lang.Throwable -> L82
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L82
            com.tencent.mm.plugin.box.webview.BoxWebView r4 = uy3.z.f432003b     // Catch: java.lang.Throwable -> L82
            r6 = 0
            if (r4 == 0) goto L1b
            boolean r4 = r4.f211376y     // Catch: java.lang.Throwable -> L82
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L82
            goto L1c
        L1b:
            r4 = r6
        L1c:
            r7 = 1
            r3[r7] = r4     // Catch: java.lang.Throwable -> L82
            com.tencent.mars.xlog.Log.i(r1, r2, r3)     // Catch: java.lang.Throwable -> L82
            java.lang.Object r1 = uy3.z.f432004c     // Catch: java.lang.Throwable -> L82
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L82
            com.tencent.mm.plugin.box.webview.BoxWebView r2 = uy3.z.f432003b     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L32
            com.tencent.mm.plugin.box.webview.BoxWebView r2 = uy3.z.f432003b     // Catch: java.lang.Throwable -> L7f
            kotlin.jvm.internal.o.d(r2)     // Catch: java.lang.Throwable -> L7f
            boolean r2 = r2.f211376y     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L40
        L32:
            com.tencent.mm.plugin.box.webview.BoxWebView r2 = new com.tencent.mm.plugin.box.webview.BoxWebView     // Catch: java.lang.Throwable -> L7f
            android.content.MutableContextWrapper r3 = new android.content.MutableContextWrapper     // Catch: java.lang.Throwable -> L7f
            android.content.Context r4 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> L7f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7f
            uy3.z.f432003b = r2     // Catch: java.lang.Throwable -> L7f
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r0)
            com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner r0 = com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE
            boolean r0 = r0.isBackground()
            if (r0 != 0) goto L5a
            com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner r0 = com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE
            boolean r0 = r0.isBackground()
            if (r0 != 0) goto L5a
            com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner r0 = com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE
            boolean r0 = r0.isBackground()
            if (r0 == 0) goto L5b
        L5a:
            r5 = r7
        L5b:
            boolean r0 = com.tencent.mm.pluginsdk.model.g4.b()
            if (r0 == 0) goto L7c
            boolean r0 = com.tencent.xweb.t1.f()
            if (r0 != 0) goto L7c
            if (r5 != 0) goto L7c
            java.lang.String r0 = "MicroMsg.BoxWebViewPreloadManager"
            java.lang.String r1 = "WebView preInitChildProcess"
            com.tencent.mars.xlog.Log.i(r0, r1)
            r0 = 80020(0x13894, float:1.12132E-40)
            tx5.j.d(r0, r6)
            r0 = 80019(0x13893, float:1.1213E-40)
            tx5.j.d(r0, r6)
        L7c:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        L7f:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L82
            throw r2     // Catch: java.lang.Throwable -> L82
        L82:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uy3.w.invoke():java.lang.Object");
    }
}
