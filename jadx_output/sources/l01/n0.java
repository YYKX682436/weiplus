package l01;

/* loaded from: classes4.dex */
public class n0 implements l01.r {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap bitmap2;
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return bitmap;
        }
        f3.i iVar = new f3.i(com.tencent.mm.sdk.platformtools.x2.f193075e, bitmap);
        iVar.b(true);
        if (iVar instanceof android.graphics.drawable.BitmapDrawable) {
            bitmap2 = ((android.graphics.drawable.BitmapDrawable) iVar).getBitmap();
        } else {
            int intrinsicWidth = iVar.getIntrinsicWidth();
            int intrinsicHeight = iVar.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                try {
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(intrinsicHeight));
                    arrayList.add(java.lang.Integer.valueOf(intrinsicWidth));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/modelappbrand/image/RoundedBitmapTransformation", "drawableToBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    bitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                    yj0.a.e(obj, bitmap2, "com/tencent/mm/modelappbrand/image/RoundedBitmapTransformation", "drawableToBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap2);
                    iVar.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    iVar.draw(canvas);
                } catch (java.lang.OutOfMemoryError unused) {
                }
            }
            bitmap2 = null;
        }
        if (bitmap2 != bitmap) {
            bitmap.recycle();
        }
        return bitmap2;
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "RoundedBitmap";
    }
}
