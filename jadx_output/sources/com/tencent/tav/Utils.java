package com.tencent.tav;

/* loaded from: classes12.dex */
public class Utils {
    private static java.lang.String kPhoneName = "";
    private byte _hellAccFlag_;

    public static android.graphics.Bitmap flipYBitmap(android.graphics.Bitmap bitmap) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(1.0f, -1.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(0);
        aVar.c(0);
        aVar.c(bitmap);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/tav/Utils", "flipYBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/tav/Utils", "flipYBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    public static java.lang.String getPhoneName() {
        java.lang.String str = kPhoneName;
        if (str == null || str.isEmpty()) {
            java.lang.String str2 = android.os.Build.MANUFACTURER.toUpperCase() + " " + android.os.Build.MODEL;
            if (android.text.TextUtils.isEmpty(str2)) {
                return "";
            }
            kPhoneName = str2.replace(" ", "_").replace("+", "").replace("(t)", "");
        }
        return kPhoneName;
    }

    public static boolean isOnlySupportLowVersionGl() {
        java.lang.String str = android.os.Build.HARDWARE;
        return "mt6752".equals(str) || "mt6797".equals(str) || "mt6757".equals(str) || "mt6750".equals(str);
    }
}
