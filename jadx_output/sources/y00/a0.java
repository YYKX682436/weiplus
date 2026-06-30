package y00;

/* loaded from: classes.dex */
public abstract class a0 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        com.tencent.mars.xlog.Log.w(r8, "parseEcsKfProductCardXml empty, msgSvrId=" + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map a(java.lang.String r5, long r6, java.lang.String r8) {
        /*
            java.lang.String r0 = "parseEcsKfProductCardXml empty, msgSvrId="
            java.lang.String r1 = "tag"
            kotlin.jvm.internal.o.g(r8, r1)
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L14
            int r3 = r5.length()
            if (r3 != 0) goto L12
            goto L14
        L12:
            r3 = r2
            goto L15
        L14:
            r3 = r1
        L15:
            r4 = 0
            if (r3 == 0) goto L19
            return r4
        L19:
            java.lang.String r3 = "msg"
            java.util.Map r5 = com.tencent.mm.sdk.platformtools.aa.d(r5, r3, r4)     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L29
            boolean r3 = r5.isEmpty()     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L28
            goto L29
        L28:
            r1 = r2
        L29:
            if (r1 == 0) goto L3b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L3d
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3d
            com.tencent.mars.xlog.Log.w(r8, r5)     // Catch: java.lang.Throwable -> L3d
            goto L51
        L3b:
            r4 = r5
            goto L51
        L3d:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "parseEcsKfProductCardXml fail, msgSvrId="
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.Object[] r7 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r8, r5, r6, r7)
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.a0.a(java.lang.String, long, java.lang.String):java.util.Map");
    }
}
