package l85;

/* loaded from: classes8.dex */
public final class r0 {
    public r0(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[Catch: all -> 0x00a2, TryCatch #0 {, blocks: (B:4:0x000f, B:6:0x0016, B:10:0x001f, B:13:0x002a, B:16:0x004b, B:18:0x0051, B:20:0x0064, B:21:0x006c, B:28:0x0032), top: B:3:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.ServiceConnection a(android.content.Intent r7, android.content.ServiceConnection r8) {
        /*
            r6 = this;
            java.lang.String r0 = "hold service conn: "
            java.lang.String r1 = "get service info err: "
            java.lang.String r2 = "intent"
            kotlin.jvm.internal.o.g(r7, r2)
            java.lang.String r2 = "sb"
            kotlin.jvm.internal.o.g(r8, r2)
            monitor-enter(r6)
            android.content.ComponentName r7 = r7.getComponent()     // Catch: java.lang.Throwable -> La2
            r2 = 0
            if (r7 == 0) goto L4a
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> La2
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> La2
            if (r3 == 0) goto L4a
            r4 = 0
            android.content.pm.ServiceInfo r7 = r3.getServiceInfo(r7, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30 java.lang.Throwable -> La2
            java.lang.String r3 = "getServiceInfo(...)"
            kotlin.jvm.internal.o.f(r7, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30 java.lang.Throwable -> La2
            java.lang.String r3 = r7.processName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30 java.lang.Throwable -> La2
            java.lang.String r7 = r7.name     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e java.lang.Throwable -> La2
            r2 = r7
            goto L47
        L2e:
            r7 = move-exception
            goto L32
        L30:
            r7 = move-exception
            r3 = r2
        L32:
            java.lang.String r4 = "MicoMsg.proc.ServiceConnection"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r5.<init>(r1)     // Catch: java.lang.Throwable -> La2
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> La2
            r5.append(r7)     // Catch: java.lang.Throwable -> La2
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> La2
            com.tencent.mars.xlog.Log.w(r4, r7)     // Catch: java.lang.Throwable -> La2
        L47:
            r7 = r2
            r2 = r3
            goto L4b
        L4a:
            r7 = r2
        L4b:
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> La2
            if (r1 != 0) goto La0
            l85.r0 r1 = l85.s0.f317208d     // Catch: java.lang.Throwable -> La2
            jz5.g r1 = l85.s0.f317209e     // Catch: java.lang.Throwable -> La2
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> La2
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> La2
            kotlin.jvm.internal.o.d(r2)     // Catch: java.lang.Throwable -> La2
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> La2
            if (r3 != 0) goto L6c
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch: java.lang.Throwable -> La2
            r3.<init>()     // Catch: java.lang.Throwable -> La2
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> La2
        L6c:
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = "MicoMsg.proc.ServiceConnection"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r4.<init>(r0)     // Catch: java.lang.Throwable -> La2
            r4.append(r7)     // Catch: java.lang.Throwable -> La2
            r0 = 64
            r4.append(r0)     // Catch: java.lang.Throwable -> La2
            int r0 = r8.hashCode()     // Catch: java.lang.Throwable -> La2
            r4.append(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = ", proc="
            r4.append(r0)     // Catch: java.lang.Throwable -> La2
            r4.append(r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> La2
            com.tencent.mars.xlog.Log.i(r1, r0)     // Catch: java.lang.Throwable -> La2
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.Throwable -> La2
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> La2
            r1.<init>(r8)     // Catch: java.lang.Throwable -> La2
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> La2
            r3.add(r0)     // Catch: java.lang.Throwable -> La2
        La0:
            monitor-exit(r6)
            return r8
        La2:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l85.r0.a(android.content.Intent, android.content.ServiceConnection):android.content.ServiceConnection");
    }
}
