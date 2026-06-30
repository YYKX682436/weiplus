package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class MMNativeJpeg {
    public static final int FAKE_PARTIAL_PROGRESSIVE_QUALITY = 25;
    public static final java.lang.String TAG = "MMJPEG.JAVA";
    private byte _hellAccFlag_;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r3 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
    
        if (r3 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean Convert2Baseline(java.lang.String r7, int r8) {
        /*
            boolean r0 = isProgressive(r7)
            r1 = 1
            java.lang.String r2 = "MMJPEG.JAVA"
            if (r0 != 0) goto L13
            java.lang.String r8 = "c2b: not progressive file.%s"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.tencent.mars.xlog.Log.e(r2, r8, r7)
            return r1
        L13:
            r0 = 0
            r3 = 0
            android.graphics.Bitmap r4 = com.tencent.mm.graphics.e.c(r7)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            if (r4 != 0) goto L24
            java.lang.String r4 = "c2b:use mmjpeg to decode."
            com.tencent.mars.xlog.Log.i(r2, r4)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            android.graphics.Bitmap r4 = decodeAsBitmap(r7)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
        L24:
            if (r4 == 0) goto L5a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            r5.<init>()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            r5.append(r7)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            java.lang.String r6 = ".base"
            r5.append(r6)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            java.io.OutputStream r3 = com.tencent.mm.vfs.w6.K(r5, r0)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            boolean r8 = r4.compress(r6, r8, r3)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            if (r8 == 0) goto L5a
            java.lang.String r8 = "c2b: convert baseline %s ok."
            java.lang.Object[] r4 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            com.tencent.mars.xlog.Log.i(r2, r8, r4)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            boolean r7 = com.tencent.mm.sdk.platformtools.k1.a(r5, r7, r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L60
            if (r3 == 0) goto L55
            r3.close()     // Catch: java.lang.Exception -> L55
        L55:
            return r7
        L56:
            r7 = move-exception
            goto L79
        L58:
            r7 = move-exception
            goto L68
        L5a:
            if (r3 == 0) goto L78
        L5c:
            r3.close()     // Catch: java.lang.Exception -> L78
            goto L78
        L60:
            java.lang.String r7 = "c2b: oom"
            com.tencent.mars.xlog.Log.e(r2, r7)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L78
            goto L5c
        L68:
            java.lang.String r8 = "c2b:exception:%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L56
            java.lang.String r7 = exception2String(r7)     // Catch: java.lang.Throwable -> L56
            r1[r0] = r7     // Catch: java.lang.Throwable -> L56
            com.tencent.mars.xlog.Log.e(r2, r8, r1)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L78
            goto L5c
        L78:
            return r0
        L79:
            if (r3 == 0) goto L7e
            r3.close()     // Catch: java.lang.Exception -> L7e
        L7e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.platformtools.MMNativeJpeg.Convert2Baseline(java.lang.String, int):boolean");
    }

    public static void Destroy() {
    }

    public static boolean IsJpegFile(java.lang.String str) {
        try {
            if (com.tencent.mm.sdk.platformtools.mmjpeg.queryParams(toRealPath(str)) != null) {
                return true;
            }
            com.tencent.mars.xlog.Log.e(TAG, "IsJpegFile : can't query jpeg parames.");
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "IsJpegFile exception:%s", exception2String(e17));
            return false;
        }
    }

    private static boolean checkAndroidVersion() {
        return true;
    }

    public static boolean convertToProgressive(java.lang.String str, int i17) {
        if (!checkAndroidVersion()) {
            return false;
        }
        java.lang.String realPath = toRealPath(str);
        try {
            java.lang.String str2 = realPath + ".prog.dat";
            com.tencent.mars.xlog.Log.i(TAG, "convert %s to %s use progressive.quality:%d", realPath, str2, java.lang.Integer.valueOf(i17));
            int convertToProgressive = com.tencent.mm.sdk.platformtools.mmjpeg.convertToProgressive(realPath, str2);
            if (convertToProgressive != 0) {
                com.tencent.mars.xlog.Log.e(TAG, "convert failed. error:%d", java.lang.Integer.valueOf(convertToProgressive));
                return false;
            }
            boolean x17 = com.tencent.mm.vfs.w6.x(str2, realPath, true);
            com.tencent.mars.xlog.Log.i(TAG, "convert ret:%b", java.lang.Boolean.valueOf(x17));
            return x17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "convertToProgressive exception:%s", exception2String(e17));
            return false;
        }
    }

    public static android.graphics.Bitmap decodeAsBitmap(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "decodeAsBitmap:%s", str);
        java.lang.String realPath = toRealPath(str);
        try {
            com.tencent.mm.sdk.platformtools.JpegParams queryParams = com.tencent.mm.sdk.platformtools.mmjpeg.queryParams(realPath);
            if (queryParams == null) {
                com.tencent.mars.xlog.Log.e(TAG, "can't query jpeg parames.");
                return null;
            }
            int i17 = queryParams.Width;
            int i18 = queryParams.Height;
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/sdk/platformtools/MMNativeJpeg", "decodeAsBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/sdk/platformtools/MMNativeJpeg", "decodeAsBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            if (com.tencent.mm.sdk.platformtools.mmjpeg.decodeToBitmap(realPath, createBitmap)) {
                com.tencent.mars.xlog.Log.i(TAG, "decode bitmap successed.");
                return createBitmap;
            }
            com.tencent.mars.xlog.Log.e(TAG, "can't decode to bmp.");
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "decodeAsBitmap exception:%s", exception2String(e17));
            return null;
        } catch (java.lang.OutOfMemoryError unused) {
            com.tencent.mars.xlog.Log.e(TAG, "decodeAsBitmap OOM:%s", realPath);
            return null;
        }
    }

    private static java.lang.String exception2String(java.lang.Throwable th6) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th6.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean isProgressive(java.lang.String str) {
        if (!checkAndroidVersion() || !com.tencent.mm.vfs.w6.j(str)) {
            return false;
        }
        java.lang.String realPath = toRealPath(str);
        try {
            int isProgressiveFile = com.tencent.mm.sdk.platformtools.mmjpeg.isProgressiveFile(realPath);
            if (1 == isProgressiveFile || isProgressiveFile == 0) {
                com.tencent.mars.xlog.Log.i(TAG, "file:%s progressive:%d", realPath, java.lang.Integer.valueOf(isProgressiveFile));
                return isProgressiveFile == 1;
            }
            com.tencent.mars.xlog.Log.e(TAG, "check failed. error:%d", java.lang.Integer.valueOf(isProgressiveFile));
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "isProgressive exception:%s", exception2String(e17));
            return false;
        }
    }

    public static int queryQuality(java.lang.String str) {
        if (!checkAndroidVersion() || !com.tencent.mm.vfs.w6.j(str)) {
            return 0;
        }
        java.lang.String realPath = toRealPath(str);
        try {
            int queryQuality = com.tencent.mm.sdk.platformtools.mmjpeg.queryQuality(realPath);
            com.tencent.mars.xlog.Log.i(TAG, "after query quality:%d", java.lang.Integer.valueOf(queryQuality));
            if (queryQuality < 10000 && queryQuality >= 24) {
                return queryQuality;
            }
            if (1 == com.tencent.mm.sdk.platformtools.mmjpeg.isProgressiveFile(realPath)) {
                return 25;
            }
            com.tencent.mars.xlog.Log.w(TAG, "invalid jpeg file or too small quality.");
            return 0;
        } catch (java.lang.IncompatibleClassChangeError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Crash", e17, "May cause dvmFindCatchBlock crash!", new java.lang.Object[0]);
            throw ((java.lang.IncompatibleClassChangeError) new java.lang.IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(e17));
        } catch (java.lang.Error e18) {
            com.tencent.mars.xlog.Log.e(TAG, "queryQuality error. java.lang.UnsatisfiedLinkError: queryQuality, %s", e18.toString());
            return 0;
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e(TAG, "queryQuality failed. exception:%s", exception2String(e19));
            return 0;
        }
    }

    private static java.lang.String toRealPath(java.lang.String str) {
        try {
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, false);
            if (i17 == null) {
                return str;
            }
            com.tencent.mars.xlog.Log.i(TAG, "From %s to real path %s", str, i17);
            return i17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "to real path", new java.lang.Object[0]);
            return str;
        }
    }
}
