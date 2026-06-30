package dz4;

/* loaded from: classes12.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f245395e;

    public s(dz4.j0 j0Var, long j17) {
        this.f245394d = j0Var;
        this.f245395e = j17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r2.length() > 0) goto L24;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            dz4.j0 r0 = r7.f245394d
            r0.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            java.lang.String r3 = "MicroMsg.FlutterWeNoteNativeHelperImpl"
            r4 = 1
            r5 = 0
            if (r1 < r2) goto L43
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Exception -> L56
            java.lang.String r6 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r6)     // Catch: java.lang.Exception -> L56
            boolean r6 = r2 instanceof android.content.ClipboardManager     // Catch: java.lang.Exception -> L56
            if (r6 == 0) goto L1e
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2     // Catch: java.lang.Exception -> L56
            goto L1f
        L1e:
            r2 = 0
        L1f:
            if (r2 == 0) goto L29
            boolean r6 = r2.hasPrimaryClip()     // Catch: java.lang.Exception -> L56
            if (r6 != r4) goto L29
            r6 = r4
            goto L2a
        L29:
            r6 = r5
        L2a:
            if (r6 == 0) goto L3c
            android.content.ClipDescription r2 = r2.getPrimaryClipDescription()     // Catch: java.lang.Exception -> L56
            if (r2 == 0) goto L53
            java.lang.String r6 = "text/*"
            boolean r1 = r2.hasMimeType(r6)     // Catch: java.lang.Exception -> L56
            if (r1 != r4) goto L53
            goto L54
        L3c:
            java.lang.String r2 = "onCheckEnablePasteAsync: no primary clip"
            com.tencent.mars.xlog.Log.i(r3, r2)     // Catch: java.lang.Exception -> L56
            goto L53
        L43:
            java.lang.CharSequence r2 = com.tencent.mm.sdk.platformtools.b0.a()     // Catch: java.lang.Exception -> L56
            java.lang.String r6 = "getText(...)"
            kotlin.jvm.internal.o.f(r2, r6)     // Catch: java.lang.Exception -> L56
            int r1 = r2.length()     // Catch: java.lang.Exception -> L56
            if (r1 <= 0) goto L53
            goto L54
        L53:
            r4 = r5
        L54:
            r5 = r4
            goto L71
        L56:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "onCheckEnablePasteAsync: sdkVer="
            r4.<init>(r6)
            r4.append(r1)
            java.lang.String r1 = ", error "
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            com.tencent.mars.xlog.Log.e(r3, r1)
        L71:
            com.tencent.wechat.aff.wenote.i r0 = r0.f245310b
            if (r0 == 0) goto L7a
            long r1 = r7.f245395e
            r0.E1(r1, r5)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dz4.s.run():void");
    }
}
