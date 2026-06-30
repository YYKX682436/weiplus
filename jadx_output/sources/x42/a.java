package x42;

/* loaded from: classes7.dex */
public abstract class a implements x42.b {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r10.isReleased() != false) goto L24;
     */
    @Override // com.eclipsesource.mmv8.JavaCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(com.eclipsesource.mmv8.V8Object r9, com.eclipsesource.mmv8.V8Array r10) {
        /*
            r8 = this;
            java.lang.String r0 = "EdgeComputingJsApiBase"
            java.lang.String r1 = "[EdgeComputingJsApiBase] invoke type : "
            java.lang.String r2 = "[EdgeComputingJsApiBase] invoke throw Exception e : "
            r3 = 0
            if (r10 != 0) goto La
            return r3
        La:
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            java.lang.Object r3 = r8.b(r10)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            long r6 = r6 - r4
            int r4 = r8.getType()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            t42.a.c(r6, r4)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            int r1 = r8.getType()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r4.append(r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            if (r9 == 0) goto L3c
            boolean r0 = r9.isReleased()
            if (r0 != 0) goto L3c
            r9.release()
        L3c:
            boolean r9 = r10.isReleased()
            if (r9 != 0) goto L6e
        L42:
            r10.release()
            goto L6e
        L46:
            r0 = move-exception
            goto L6f
        L48:
            r1 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L46
            r4.append(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L46
            com.tencent.mars.xlog.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L46
            if (r9 == 0) goto L67
            boolean r0 = r9.isReleased()
            if (r0 != 0) goto L67
            r9.release()
        L67:
            boolean r9 = r10.isReleased()
            if (r9 != 0) goto L6e
            goto L42
        L6e:
            return r3
        L6f:
            if (r9 == 0) goto L7a
            boolean r1 = r9.isReleased()
            if (r1 != 0) goto L7a
            r9.release()
        L7a:
            boolean r9 = r10.isReleased()
            if (r9 != 0) goto L83
            r10.release()
        L83:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x42.a.invoke(com.eclipsesource.mmv8.V8Object, com.eclipsesource.mmv8.V8Array):java.lang.Object");
    }
}
