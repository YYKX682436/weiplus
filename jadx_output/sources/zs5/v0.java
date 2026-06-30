package zs5;

/* loaded from: classes12.dex */
public abstract class v0 extends zs5.d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f475495a = {"small_eye.png", "small_black_eye.png", "small_module.png", "small_black_module.png", "small_logo.png", "small_black_logo.png"};

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f475496b = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.q7.c("qrcode")).o(), "qrResDif");

    public static android.graphics.Bitmap a(java.lang.String str, int i17, boolean z17) {
        boolean z18;
        java.lang.String[] strArr;
        boolean z19;
        int i18;
        int i19;
        android.graphics.Bitmap bitmap;
        if (!java.util.Arrays.asList(2, 1).contains(java.lang.Integer.valueOf(i17))) {
            return null;
        }
        com.tencent.mm.vfs.r6 r6Var = f475496b;
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArr2 = f475495a;
        for (int i27 = 0; i27 < 6; i27++) {
            arrayList.add(new com.tencent.mm.vfs.r6(r6Var, strArr2[i27]).o());
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z18 = true;
                break;
            }
            if (!com.tencent.mm.vfs.w6.j((java.lang.String) it.next())) {
                z18 = false;
                break;
            }
        }
        if (z18) {
            strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        } else {
            try {
                for (java.lang.String str2 : com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().list("personalQrCodeRes")) {
                    java.lang.String str3 = "assets:///personalQrCodeRes/" + str2;
                    java.lang.String str4 = r6Var.o() + "/" + str2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxQBar", "copy from:%s to:%s copyLen:%s", str3, str4, java.lang.String.valueOf(com.tencent.mm.vfs.w6.d(str3, str4, false)));
                }
                java.util.Iterator it6 = arrayList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        z19 = true;
                        break;
                    }
                    if (!com.tencent.mm.vfs.w6.j((java.lang.String) it6.next())) {
                        z19 = false;
                        break;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxQBar", e17, "createResPath get IOException", new java.lang.Object[0]);
            }
            if (z19) {
                strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxQBar", "createResPath: copy but still not exist");
                strArr = null;
            }
        }
        if (strArr == null) {
            return null;
        }
        int[] iArr = new int[2];
        android.graphics.Bitmap b17 = b(strArr[0]);
        android.graphics.Bitmap b18 = b(strArr[1]);
        android.graphics.Bitmap b19 = b(strArr[2]);
        android.graphics.Bitmap b27 = b(strArr[3]);
        android.graphics.Bitmap b28 = b(strArr[4]);
        android.graphics.Bitmap b29 = b(strArr[5]);
        if (com.tencent.mm.sdk.platformtools.t8.L0(java.util.Arrays.asList(b17, b18, b19, b27, b28, b29))) {
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Boolean.valueOf(b17 == null);
            objArr[1] = java.lang.Boolean.valueOf(b18 == null);
            objArr[2] = java.lang.Boolean.valueOf(b19 == null);
            objArr[3] = java.lang.Boolean.valueOf(b27 == null);
            objArr[4] = java.lang.Boolean.valueOf(b28 == null);
            objArr[5] = java.lang.Boolean.valueOf(b29 == null);
            com.tencent.mars.xlog.Log.e("MicroMsg.WxQBar", "encodeCustom() has null res! eye:%s b_eye:%s module:%s b_module:%s logo:%s b_logo:%s ", objArr);
            return null;
        }
        boolean z27 = et5.h.f256676a;
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(4194304);
        java.lang.System.currentTimeMillis();
        if (allocateDirect == null || !allocateDirect.hasArray()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxQBarUtil", "EncodeCustom data null");
        } else if (et5.h.f256676a) {
            java.nio.ByteBuffer d17 = et5.h.d(b17);
            java.nio.ByteBuffer d18 = et5.h.d(b18);
            java.nio.ByteBuffer d19 = et5.h.d(b19);
            java.nio.ByteBuffer d27 = et5.h.d(b27);
            java.nio.ByteBuffer d28 = et5.h.d(b28);
            java.nio.ByteBuffer d29 = et5.h.d(b29);
            if (d17 == null || d18 == null || d19 == null || d27 == null || d28 == null || d29 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxQBarUtil", "EncodeCustom failed buffer null");
            } else {
                com.tencent.wechat.aff.iam_scan.f fVar = new com.tencent.wechat.aff.iam_scan.f();
                et5.h.b(fVar, b17);
                et5.h.b(fVar, b18);
                et5.h.b(fVar, b19);
                et5.h.b(fVar, b27);
                et5.h.b(fVar, b28);
                et5.h.b(fVar, b29);
                com.tencent.wechat.aff.iam_scan.u b37 = com.tencent.wechat.aff.iam_scan.c.f216974b.b(str, 12, 1, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, 5, i17, z17, d17, d18, d19, d27, d28, d29, fVar, allocateDirect);
                if (b37 != null) {
                    iArr[0] = b37.f217137e;
                    iArr[1] = b37.f217138f;
                    java.lang.System.currentTimeMillis();
                    i18 = b37.f217136d;
                    byte[] f17 = et5.h.f(allocateDirect);
                    c(b17);
                    c(b18);
                    c(b19);
                    c(b27);
                    c(b28);
                    c(b29);
                    if (i18 == 0 || (i19 = iArr[0]) == 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WxQBar", "result:%d sizeOut:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(iArr[0]));
                        return null;
                    }
                    int i28 = i19 * iArr[1] * 4;
                    byte[] bArr = new byte[i28];
                    java.lang.System.arraycopy(f17, 0, bArr, 0, i28);
                    int i29 = iArr[0];
                    int i37 = iArr[1];
                    boolean z28 = com.tencent.mm.sdk.platformtools.x.f193064a;
                    int i38 = i28 / 4;
                    int[] iArr2 = new int[i38];
                    int i39 = 0;
                    int i47 = 0;
                    while (i39 < i38) {
                        int i48 = i47 + 1;
                        int i49 = i48 + 1;
                        int i57 = i49 + 1;
                        iArr2[i39] = ((bArr[i47] & 255) << 16) | ((bArr[i57] & 255) << 24) | ((bArr[i48] & 255) << 8) | (bArr[i49] & 255);
                        i39++;
                        i47 = i57 + 1;
                    }
                    try {
                        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(config);
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(java.lang.Integer.valueOf(i37));
                        arrayList2.add(java.lang.Integer.valueOf(i29));
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/sdk/platformtools/BitmapUtil", "bitmapFromRgba", "(II[B)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                        yj0.a.e(obj, createBitmap, "com/tencent/mm/sdk/platformtools/BitmapUtil", "bitmapFromRgba", "(II[B)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        createBitmap.setPixels(iArr2, 0, i29, 0, 0, i29, i37);
                        bitmap = createBitmap;
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BitmapUtil", e18, "bitmapFromRgba throw Exception", new java.lang.Object[0]);
                        bitmap = null;
                    }
                    if (bitmap == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WxQBar", "encodeCustom: decode Bitmap error, return null");
                    }
                    return bitmap;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.WxQBarUtil", "EncodeCustom failed, result null");
            }
        }
        i18 = -1;
        byte[] f172 = et5.h.f(allocateDirect);
        c(b17);
        c(b18);
        c(b19);
        c(b27);
        c(b28);
        c(b29);
        if (i18 == 0) {
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxQBar", "result:%d sizeOut:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(iArr[0]));
        return null;
    }

    public static android.graphics.Bitmap b(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new java.io.FileInputStream(str);
            try {
                try {
                    android.graphics.Bitmap O = com.tencent.mm.sdk.platformtools.x.O(fileInputStream);
                    com.tencent.mm.vfs.e8.d(fileInputStream);
                    return O;
                } catch (java.io.IOException e17) {
                    e = e17;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxQBar", e, "pathToBitmap error! path:" + str, new java.lang.Object[0]);
                    com.tencent.mm.vfs.e8.d(fileInputStream);
                    return null;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileInputStream2 = fileInputStream;
                com.tencent.mm.vfs.e8.d(fileInputStream2);
                throw th;
            }
        } catch (java.io.IOException e18) {
            e = e18;
            fileInputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.tencent.mm.vfs.e8.d(fileInputStream2);
            throw th;
        }
    }

    public static void c(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            try {
                bitmap.recycle();
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
