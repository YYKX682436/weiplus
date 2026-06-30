package zp;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f474901a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f474902b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final int f474903c;

    /* renamed from: d, reason: collision with root package name */
    public int f474904d;

    /* renamed from: e, reason: collision with root package name */
    public int f474905e;

    /* renamed from: f, reason: collision with root package name */
    public int f474906f;

    public c() {
        android.util.DisplayMetrics displayMetrics = xp.d.b().getResources().getDisplayMetrics();
        this.f474903c = displayMetrics.widthPixels * displayMetrics.heightPixels * 6;
    }

    public android.graphics.Bitmap a(int i17, int i18) {
        this.f474905e++;
        java.util.LinkedList linkedList = this.f474901a;
        java.util.Iterator it = linkedList.iterator();
        zp.b bVar = null;
        while (it.hasNext()) {
            zp.b bVar2 = (zp.b) it.next();
            if (bVar2.f474897b >= i17 && bVar2.f474898c >= i18 && (bVar == null || bVar.f474899d >= bVar2.f474899d)) {
                bVar = bVar2;
            }
        }
        if (bVar != null) {
            linkedList.remove(bVar);
            this.f474904d -= bVar.f474900e;
            android.graphics.Bitmap bitmap = bVar.f474896a;
            bVar.a();
            this.f474902b.addLast(bVar);
            return bitmap;
        }
        try {
            this.f474906f++;
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/danmaku/tool/BitmapCacheManager", "getBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/danmaku/tool/BitmapCacheManager", "getBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            return createBitmap;
        } catch (java.lang.OutOfMemoryError e17) {
            com.tencent.mars.xlog.Log.e("BitmapCacheManager", "create bitmap out of memory" + e17);
            return null;
        }
    }

    public void b(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f474904d += bitmap.getRowBytes() * bitmap.getHeight();
        java.util.LinkedList linkedList = this.f474902b;
        zp.b bVar = (zp.b) linkedList.poll();
        if (bVar == null) {
            bVar = new zp.b(null);
        }
        bVar.f474896a = bitmap;
        bVar.f474897b = bitmap.getWidth();
        bVar.f474898c = bitmap.getHeight();
        bVar.f474899d = bitmap.getHeight() * bitmap.getWidth();
        bVar.f474900e = bitmap.getRowBytes() * bitmap.getHeight();
        java.util.LinkedList linkedList2 = this.f474901a;
        linkedList2.addLast(bVar);
        while (this.f474904d > this.f474903c) {
            java.util.Iterator it = linkedList2.iterator();
            zp.b bVar2 = null;
            while (it.hasNext()) {
                zp.b bVar3 = (zp.b) it.next();
                if (bVar2 == null || bVar2.f474899d > bVar3.f474899d) {
                    bVar2 = bVar3;
                }
            }
            if (bVar2 != null) {
                linkedList2.remove(bVar2);
                this.f474904d -= bVar2.f474900e;
                bVar2.a();
                linkedList.addLast(bVar2);
            }
        }
    }
}
