package x6;

/* loaded from: classes3.dex */
public class e implements x6.d {
    @Override // x6.d
    public void a(int i17) {
    }

    @Override // x6.d
    public void b(android.graphics.Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // x6.d
    public android.graphics.Bitmap c(int i17, int i18, android.graphics.Bitmap.Config config) {
        return d(i17, i18, config);
    }

    @Override // x6.d
    public android.graphics.Bitmap d(int i17, int i18, android.graphics.Bitmap.Config config) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/bumptech/glide/load/engine/bitmap_recycle/BitmapPoolAdapter", "get", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/bumptech/glide/load/engine/bitmap_recycle/BitmapPoolAdapter", "get", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    @Override // x6.d
    public void e() {
    }
}
