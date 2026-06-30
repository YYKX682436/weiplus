package z94;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final z94.a f470862a = new z94.a();

    public static java.lang.String a(z94.a aVar, android.graphics.Bitmap bitmap, java.lang.String str, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveCoverBitmap$default", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverCropUtil");
        java.lang.String str2 = (i17 & 2) != 0 ? null : str;
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveCoverBitmap", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverCropUtil");
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        if (str2 == null) {
            str2 = dw3.h.d(dw3.h.f244211a, "sns_cover", null, 2, null);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            zj0.a aVar2 = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            aVar2.c(java.lang.Boolean.FALSE);
            aVar2.c(null);
            aVar2.c(java.lang.Integer.valueOf(height));
            aVar2.c(java.lang.Integer.valueOf(height));
            aVar2.c(0);
            aVar2.c(java.lang.Integer.valueOf((width - height) / 2));
            aVar2.c(bitmap);
            java.lang.Object obj2 = new java.lang.Object();
            yj0.a.d(obj2, aVar2.b(), "com/tencent/mm/plugin/sns/cover/edit/util/SnsCoverCropUtil", "saveCoverBitmap", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/sns/cover/edit/util/SnsCoverCropUtil", "saveCoverBitmap", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            com.tencent.mm.sdk.platformtools.x.D0(createBitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
        } else if (height > width) {
            zj0.a aVar3 = new zj0.a();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            aVar3.c(java.lang.Boolean.FALSE);
            aVar3.c(null);
            aVar3.c(java.lang.Integer.valueOf(width));
            aVar3.c(java.lang.Integer.valueOf(width));
            aVar3.c(java.lang.Integer.valueOf((height - width) / 2));
            aVar3.c(0);
            aVar3.c(bitmap);
            java.lang.Object obj3 = new java.lang.Object();
            yj0.a.d(obj3, aVar3.b(), "com/tencent/mm/plugin/sns/cover/edit/util/SnsCoverCropUtil", "saveCoverBitmap", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar3.a(0), ((java.lang.Integer) aVar3.a(1)).intValue(), ((java.lang.Integer) aVar3.a(2)).intValue(), ((java.lang.Integer) aVar3.a(3)).intValue(), ((java.lang.Integer) aVar3.a(4)).intValue(), (android.graphics.Matrix) aVar3.a(5), ((java.lang.Boolean) aVar3.a(6)).booleanValue());
            yj0.a.e(obj3, createBitmap2, "com/tencent/mm/plugin/sns/cover/edit/util/SnsCoverCropUtil", "saveCoverBitmap", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap2, "createBitmap(...)");
            com.tencent.mm.sdk.platformtools.x.D0(createBitmap2, 100, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
        } else {
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveCoverBitmap", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverCropUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveCoverBitmap$default", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverCropUtil");
        return str2;
    }
}
