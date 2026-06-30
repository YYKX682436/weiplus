package com.tencent.mm.plugin.normsg;

/* loaded from: classes8.dex */
public final class NormsgInfoProvider extends android.content.ContentProvider {
    static {
        android.net.Uri.parse("content://" + (com.tencent.mm.sdk.platformtools.x2.f193072b + ".plugin.normsg.NMInfo"));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle call(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            r4 = this;
            java.lang.String r7 = "invoke: %s, with arg: %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r5, r6}
            java.lang.String r0 = "MicroMsg.NormsgIP"
            com.tencent.mars.xlog.Log.i(r0, r7, r6)
            java.lang.String r6 = "m0"
            boolean r6 = r6.equals(r5)
            r7 = 0
            if (r6 == 0) goto L71
            fo3.s r5 = fo3.s.INSTANCE
            java.lang.String r6 = ".!\"f=/%' (3n,-!51;.)"
            java.lang.String r6 = r5.V6(r6)
            java.lang.String r1 = "isReqFrom "
            java.lang.String r2 = r4.getCallingPackage()     // Catch: java.lang.Exception -> L43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L43
            r3.<init>(r1)     // Catch: java.lang.Exception -> L43
            r3.append(r2)     // Catch: java.lang.Exception -> L43
            java.lang.String r1 = "; expectPkg "
            r3.append(r1)     // Catch: java.lang.Exception -> L43
            r3.append(r6)     // Catch: java.lang.Exception -> L43
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L43
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L43
            if (r2 == 0) goto L59
            boolean r6 = r2.equals(r6)     // Catch: java.lang.Exception -> L43
            if (r6 == 0) goto L59
            r6 = 1
            goto L5a
        L43:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "isReqFrom error:"
            r1.<init>(r2)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.tencent.mars.xlog.Log.e(r0, r6)
        L59:
            r6 = 0
        L5a:
            if (r6 != 0) goto L5d
            goto L70
        L5d:
            java.lang.String r5 = r5.Ih()     // Catch: java.lang.Throwable -> L70
            if (r5 != 0) goto L65
            java.lang.String r5 = ""
        L65:
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Throwable -> L70
            r6.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = "STR_RESULT"
            r6.putString(r0, r5)     // Catch: java.lang.Throwable -> L70
            r7 = r6
        L70:
            return r7
        L71:
            java.lang.String r6 = "unknown method: %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.tencent.mars.xlog.Log.w(r0, r6, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.normsg.NormsgInfoProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
