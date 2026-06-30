package com.tencent.ytcommon.auth;

/* loaded from: classes13.dex */
public class Auth {
    public static int a() {
        return nativeGetVersion();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (new java.io.File(r11).exists() == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.content.Context r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L9
        L7:
            r8 = r2
            goto L14
        L9:
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = r10.checkSelfPermission(r0)
            if (r0 == 0) goto L12
            goto L7
        L12:
            r0 = 1
            r8 = r0
        L14:
            r0 = -10
            if (r13 != 0) goto L27
            android.content.res.AssetManager r1 = r10.getAssets()     // Catch: java.lang.Exception -> L35
            java.io.InputStream r1 = r1.open(r11, r2)     // Catch: java.lang.Exception -> L35
            if (r1 != 0) goto L23
            return r0
        L23:
            r1.close()     // Catch: java.lang.Exception -> L35
            goto L36
        L27:
            r1 = 2
            if (r13 != r1) goto L36
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L35
            r1.<init>(r11)     // Catch: java.lang.Exception -> L35
            boolean r1 = r1.exists()     // Catch: java.lang.Exception -> L35
            if (r1 != 0) goto L36
        L35:
            return r0
        L36:
            android.content.res.AssetManager r6 = r10.getAssets()
            r3 = r10
            r4 = r13
            r5 = r11
            r7 = r11
            r9 = r12
            int r10 = nativeInitN(r3, r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.ytcommon.auth.Auth.b(android.content.Context, java.lang.String, java.lang.String, int):int");
    }

    public static native java.lang.String getFailedReason(int i17);

    private static native boolean nativeCheck();

    private static native long nativeGetEndTime();

    private static native int nativeGetLicense(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, java.lang.String str4);

    private static native int nativeGetVersion();

    private static native int nativeInitN(android.content.Context context, int i17, java.lang.String str, android.content.res.AssetManager assetManager, java.lang.String str2, boolean z17, java.lang.String str3);

    private static native void nativePrintSDKList();

    private static native int nativeSetSerial(java.lang.String str);
}
