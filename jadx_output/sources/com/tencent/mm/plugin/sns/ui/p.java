package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public abstract class p {
    public static byte[] a(byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("coverPngtoJpeg", "com.tencent.mm.plugin.sns.ui.AppBrandPng2JpegHelper");
        int length = bArr.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(length));
        arrayList.add(0);
        arrayList.add(bArr);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/AppBrandPng2JpegHelper", "coverPngtoJpeg", "([B)[B", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
        yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/sns/ui/AppBrandPng2JpegHelper", "coverPngtoJpeg", "([B)[B", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Boolean.TRUE);
        arrayList2.add(config);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(decodeByteArray, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/AppBrandPng2JpegHelper", "coverPngtoJpeg", "([B)[B", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap copy = decodeByteArray.copy((android.graphics.Bitmap.Config) arrayList2.get(0), ((java.lang.Boolean) arrayList2.get(1)).booleanValue());
        yj0.a.e(decodeByteArray, copy, "com/tencent/mm/plugin/sns/ui/AppBrandPng2JpegHelper", "coverPngtoJpeg", "([B)[B", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(copy);
        canvas.drawColor(-1);
        canvas.drawBitmap(decodeByteArray, 0.0f, 0.0f, (android.graphics.Paint) null);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        copy.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("coverPngtoJpeg", "com.tencent.mm.plugin.sns.ui.AppBrandPng2JpegHelper");
        return byteArray;
    }
}
