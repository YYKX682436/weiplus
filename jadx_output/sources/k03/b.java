package k03;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f303108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f303109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.common.MethodChannel f303110f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f303111g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k03.e f303112h;

    public b(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, io.flutter.plugin.common.MethodChannel methodChannel, kotlin.jvm.internal.h0 h0Var3, k03.e eVar) {
        this.f303108d = h0Var;
        this.f303109e = h0Var2;
        this.f303110f = methodChannel;
        this.f303111g = h0Var3;
        this.f303112h = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r15 = this;
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            kotlin.jvm.internal.h0 r3 = r15.f303108d     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.lang.Object r3 = r3.f310123d     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.net.URLConnection r3 = r2.openConnection()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            r3.connect()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            int r3 = r3.getContentLength()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.io.InputStream r2 = r2.openStream()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            r5 = 8192(0x2000, float:1.148E-41)
            r4.<init>(r2, r5)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            kotlin.jvm.internal.h0 r2 = r15.f303109e     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            java.lang.Object r2 = r2.f310123d     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            r5 = 0
            java.io.OutputStream r1 = com.tencent.mm.vfs.w6.K(r2, r5)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            r6 = r5
        L3b:
            int r7 = r4.read(r2)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            r8 = -1
            if (r7 == r8) goto L4a
            r1.write(r2, r5, r7)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            int r6 = r6 + r7
            java.util.Map r9 = k03.e.f303116e     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            int r9 = r6 / r3
        L4a:
            if (r7 != r8) goto L3b
            r1.flush()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            r1.close()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            r4.close()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            k03.a r2 = new k03.a     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            kotlin.jvm.internal.h0 r10 = r15.f303108d     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            kotlin.jvm.internal.h0 r11 = r15.f303109e     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            io.flutter.plugin.common.MethodChannel r12 = r15.f303110f     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            kotlin.jvm.internal.h0 r13 = r15.f303111g     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            k03.e r14 = r15.f303112h     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            r0.post(r2)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8a
            r1.close()
        L6b:
            r4.close()
            goto L89
        L6f:
            r0 = move-exception
            goto L76
        L71:
            r0 = move-exception
            r4 = r1
            goto L8b
        L74:
            r0 = move-exception
            r4 = r1
        L76:
            java.util.Map r2 = k03.e.f303116e     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "PlatformPagView"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8a
            com.tencent.mars.xlog.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L86
            r1.close()
        L86:
            if (r4 == 0) goto L89
            goto L6b
        L89:
            return
        L8a:
            r0 = move-exception
        L8b:
            if (r1 == 0) goto L90
            r1.close()
        L90:
            if (r4 == 0) goto L95
            r4.close()
        L95:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k03.b.run():void");
    }
}
