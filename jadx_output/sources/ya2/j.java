package ya2;

/* loaded from: classes4.dex */
public final class j implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f460496a;

    public j(android.view.View view) {
        this.f460496a = view;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.graphics.Bitmap.Config config = bitmap != null ? bitmap.getConfig() : null;
        if (config == null) {
            com.tencent.mars.xlog.Log.i("FinderLoaderApi", "setBlurBitmap error, result is null!");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Boolean.TRUE);
        arrayList.add(config);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(bitmap, arrayList.toArray(), "com/tencent/mm/plugin/finder/api/FinderLoaderApi$loadImageForSns$1", "onImageLoadComplete", "(Lcom/tencent/mm/loader/model/data/DataItem;Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap copy = bitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
        yj0.a.e(bitmap, copy, "com/tencent/mm/plugin/finder/api/FinderLoaderApi$loadImageForSns$1", "onImageLoadComplete", "(Lcom/tencent/mm/loader/model/data/DataItem;Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
        pm0.v.X(new ya2.i(this.f460496a, copy));
    }
}
