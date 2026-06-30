package com.tencent.xweb;

/* loaded from: classes13.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f220601a = false;

    /* renamed from: b, reason: collision with root package name */
    public static int f220602b = -1;

    public static java.lang.ClassLoader a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.ClassLoader systemClassLoader = java.lang.ClassLoader.getSystemClassLoader();
        by5.c4.f("XWebClassLoaderWrapper", java.lang.String.format("getClassLoader, dexPath:%s, optimizedDirectory:%s, librarySearchPath:%s", str, str2, str3));
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            by5.c4.g("XWebClassLoaderWrapper", "getClassLoader, dex file not exist");
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            try {
                file.setReadOnly();
            } catch (java.lang.Throwable th6) {
                by5.c4.d("XWebClassLoaderWrapper", "getClassLoader, set dex file read only fail, error:", th6);
                return null;
            }
        }
        return new dalvik.system.DexClassLoader(str, str2, str3, systemClassLoader);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r9 > com.tencent.xweb.u1.f220602b) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.ClassLoader b(int r9) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getXWebClassLoader, apkVersion:"
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "XWebClassLoaderWrapper"
            by5.c4.f(r1, r0)
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 0
            r4 = -1
            if (r9 != r4) goto L21
            java.lang.String r9 = "getXWebClassLoader, version invalid"
            by5.c4.f(r1, r9)
            return r0
        L21:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "isApkLoadMode, current version:"
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            by5.c4.f(r1, r5)
            r5 = 3000(0xbb8, float:4.204E-42)
            r6 = 1
            if (r9 < r5) goto L38
            goto L67
        L38:
            r5 = 0
            if (r9 > 0) goto L3c
            goto L66
        L3c:
            boolean r7 = com.tencent.xweb.u1.f220601a
            if (r7 != 0) goto L61
            com.tencent.xweb.u1.f220601a = r6
            com.tencent.xweb.b r7 = com.tencent.xweb.b.m()
            java.lang.String r8 = "APK_LOAD_MIN_VER"
            int r4 = r7.i(r8, r0, r4)
            com.tencent.xweb.u1.f220602b = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "isApkLoadMode, support apk load min version:"
            r4.<init>(r7)
            int r7 = com.tencent.xweb.u1.f220602b
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            by5.c4.f(r1, r4)
        L61:
            int r4 = com.tencent.xweb.u1.f220602b
            if (r9 <= r4) goto L66
            goto L67
        L66:
            r6 = r5
        L67:
            if (r6 == 0) goto L8b
            java.lang.String r4 = by5.z3.b(r9)
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r5 = r5.exists()
            if (r5 != 0) goto L7e
            java.lang.String r9 = "getXWebClassLoader, apk file not exist"
            by5.c4.g(r1, r9)
            return r0
        L7e:
            java.lang.String r0 = by5.z3.f(r9)
            java.lang.String r9 = by5.z3.i(r9)
            java.lang.ClassLoader r9 = a(r4, r9, r0)
            goto Lc2
        L8b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lec
            r4.<init>()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r5 = by5.z3.f(r9)     // Catch: java.lang.Throwable -> Lec
            r4.append(r5)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r5 = java.io.File.separator     // Catch: java.lang.Throwable -> Lec
            r4.append(r5)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r5 = "classes.dex"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lec
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> Lec
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lec
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> Lec
            if (r5 != 0) goto Lb6
            java.lang.String r9 = "getXWebClassLoader, dex file not exist"
            by5.c4.g(r1, r9)     // Catch: java.lang.Throwable -> Lec
            return r0
        Lb6:
            java.lang.String r5 = by5.z3.f(r9)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r9 = by5.z3.i(r9)     // Catch: java.lang.Throwable -> Lec
            java.lang.ClassLoader r9 = a(r4, r9, r5)     // Catch: java.lang.Throwable -> Lec
        Lc2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "###### getXWebClassLoader, costTime:"
            r0.<init>(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r0.append(r4)
            java.lang.String r2 = ", stack:"
            r0.append(r2)
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "please ignore this exception"
            r2.<init>(r3)
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            by5.c4.g(r1, r0)
            return r9
        Lec:
            r9 = move-exception
            java.lang.String r2 = "getXWebClassLoader, error"
            by5.c4.d(r1, r2, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.u1.b(int):java.lang.ClassLoader");
    }
}
