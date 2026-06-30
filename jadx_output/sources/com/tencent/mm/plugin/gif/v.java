package com.tencent.mm.plugin.gif;

/* loaded from: classes7.dex */
public abstract class v {
    public static android.graphics.Bitmap a(byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            return null;
        }
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        long nativeInitWxAMDecoder = com.tencent.mm.plugin.gif.MMWXGFJNI.nativeInitWxAMDecoder();
        if (nativeInitWxAMDecoder == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMWXGFUtil", "Cpan init wxam decoder failed.");
        }
        int nativeDecodeBufferHeader = com.tencent.mm.plugin.gif.MMWXGFJNI.nativeDecodeBufferHeader(nativeInitWxAMDecoder, bArr, bArr.length);
        if (nativeDecodeBufferHeader != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMWXGFUtil", "Cpan WXGF decode buffer header failed. result:%d", java.lang.Integer.valueOf(nativeDecodeBufferHeader));
        }
        int nativeGetOption = com.tencent.mm.plugin.gif.MMWXGFJNI.nativeGetOption(nativeInitWxAMDecoder, bArr, bArr.length, iArr);
        if (nativeGetOption != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMWXGFUtil", "Cpan WXGF get option failed. result:%d", java.lang.Integer.valueOf(nativeGetOption));
        }
        int i17 = iArr[1];
        int i18 = iArr[2];
        if (i17 <= 0 || i18 <= 0) {
            return null;
        }
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/gif/MMWXGFUtil", "getWXGFFirstBitmap", "([B)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/gif/MMWXGFUtil", "getWXGFFirstBitmap", "([B)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        com.tencent.mm.plugin.gif.MMWXGFJNI.nativeDecodeBufferFrame(nativeInitWxAMDecoder, null, 0, createBitmap, iArr2);
        com.tencent.mm.plugin.gif.MMWXGFJNI.nativeUninit(nativeInitWxAMDecoder);
        return createBitmap;
    }
}
