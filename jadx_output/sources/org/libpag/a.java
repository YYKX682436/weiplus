package org.libpag;

/* loaded from: classes13.dex */
abstract class a {
    private byte _hellAccFlag_;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair a(int r10, int r11, boolean r12) {
        /*
            r0 = 0
            if (r10 == 0) goto L99
            if (r11 != 0) goto L7
            goto L99
        L7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L13
            if (r12 != 0) goto L2c
            r12 = 29
            if (r1 < r12) goto L2c
        L13:
            android.hardware.HardwareBuffer r12 = a(r10, r11)
            if (r12 == 0) goto L24
            android.graphics.ColorSpace$Named r1 = android.graphics.ColorSpace.Named.SRGB     // Catch: java.lang.Exception -> L24
            android.graphics.ColorSpace r1 = android.graphics.ColorSpace.get(r1)     // Catch: java.lang.Exception -> L24
            android.graphics.Bitmap r1 = android.graphics.Bitmap.wrapHardwareBuffer(r12, r1)     // Catch: java.lang.Exception -> L24
            goto L25
        L24:
            r1 = r0
        L25:
            if (r1 == 0) goto L2c
            android.util.Pair r10 = android.util.Pair.create(r1, r12)
            return r10
        L2c:
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r12)
            java.lang.ThreadLocal r12 = zj0.c.f473285a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r1.add(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1.add(r10)
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            java.util.Collections.reverse(r1)
            java.lang.Object[] r3 = r1.toArray()
            java.lang.String r4 = "org/libpag/a"
            java.lang.String r5 = "a"
            java.lang.String r6 = "(IIZ)Landroid/util/Pair;"
            java.lang.String r7 = "android/graphics/Bitmap_EXEC_"
            java.lang.String r8 = "createBitmap"
            java.lang.String r9 = "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"
            r2 = r10
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            r11 = 0
            java.lang.Object r11 = r1.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r12 = 1
            java.lang.Object r12 = r1.get(r12)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r2 = 2
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Bitmap$Config r1 = (android.graphics.Bitmap.Config) r1
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r11, r12, r1)
            java.lang.String r4 = "org/libpag/a"
            java.lang.String r5 = "a"
            java.lang.String r6 = "(IIZ)Landroid/util/Pair;"
            java.lang.String r7 = "android/graphics/Bitmap_EXEC_"
            java.lang.String r8 = "createBitmap"
            java.lang.String r9 = "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"
            r2 = r10
            r3 = r11
            yj0.a.e(r2, r3, r4, r5, r6, r7, r8, r9)
            android.util.Pair r10 = android.util.Pair.create(r11, r0)
            return r10
        L99:
            android.util.Pair r10 = android.util.Pair.create(r0, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libpag.a.a(int, int, boolean):android.util.Pair");
    }

    private static android.hardware.HardwareBuffer a(int i17, int i18) {
        if (i17 <= 0 || i18 <= 0 || android.os.Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            return android.hardware.HardwareBuffer.create(i17, i18, 1, 1, 819L);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
