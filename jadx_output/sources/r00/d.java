package r00;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r00.b f368003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f368004f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r00.h f368005g;

    public d(java.lang.String str, r00.b bVar, android.graphics.Bitmap bitmap, r00.h hVar) {
        this.f368002d = str;
        this.f368003e = bVar;
        this.f368004f = bitmap;
        this.f368005g = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.util.HashMap hashMap = r00.g.f368010a;
        java.util.HashMap hashMap2 = r00.g.f368010a;
        java.lang.String str = this.f368002d;
        java.lang.Object obj = hashMap2.get(str);
        r00.h hVar = this.f368005g;
        if (obj != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            if (!arrayList.isEmpty()) {
                if (hVar != null) {
                    arrayList.add(hVar);
                    return;
                }
                return;
            }
        }
        if (obj == null) {
            obj = new java.util.ArrayList();
        }
        if (hVar != null) {
            ((java.util.ArrayList) obj).add(hVar);
        }
        hashMap2.put(str, obj);
        r00.b bVar = r00.b.f367998e;
        r00.b bVar2 = this.f368003e;
        android.graphics.Bitmap bitmap = this.f368004f;
        if (bVar2 == bVar || bVar2 == r00.b.f367997d) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width > 0 && height > 0 && (i17 = (int) (height * 0.1d)) >= 1) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(java.lang.Integer.valueOf(width));
                arrayList2.add(0);
                arrayList2.add(0);
                arrayList2.add(bitmap);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/feature/ecs/img/getcolor/EcsGetImgColorMgr", "mapBitmap", "(Landroid/graphics/Bitmap;Lcom/tencent/mm/feature/ecs/img/getcolor/EcsGetImgColorMgr$GetColorType;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), ((java.lang.Integer) arrayList2.get(3)).intValue(), ((java.lang.Integer) arrayList2.get(4)).intValue());
                yj0.a.e(obj2, bitmap, "com/tencent/mm/feature/ecs/img/getcolor/EcsGetImgColorMgr", "mapBitmap", "(Landroid/graphics/Bitmap;Lcom/tencent/mm/feature/ecs/img/getcolor/EcsGetImgColorMgr$GetColorType;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(bitmap, "createBitmap(...)");
            }
        }
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, 1, 1, true);
        kotlin.jvm.internal.o.f(createScaledBitmap, "createScaledBitmap(...)");
        int pixel = createScaledBitmap.getPixel(0, 0);
        createScaledBitmap.recycle();
        r00.a aVar = new r00.a(pixel);
        pm0.v.X(new r00.e(str, aVar));
        java.util.ArrayList arrayList3 = (java.util.ArrayList) hashMap2.remove(str);
        if (arrayList3 != null) {
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                pm0.v.X(new r00.f((r00.h) it.next(), aVar));
            }
        }
    }
}
