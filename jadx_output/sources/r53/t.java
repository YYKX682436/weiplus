package r53;

/* loaded from: classes8.dex */
public class t implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.x f392693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f392694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f392695c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f392696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r53.y f392698f;

    public t(r53.y yVar, r53.x xVar, int i17, int i18, int i19, java.lang.String str) {
        this.f392698f = yVar;
        this.f392693a = xVar;
        this.f392694b = i17;
        this.f392695c = i18;
        this.f392696d = i19;
        this.f392697e = str;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap createBitmap;
        int i17;
        int i18;
        android.graphics.Bitmap bitmap2 = bitmap;
        if (bitmap2 == null || bitmap.isRecycled()) {
            return;
        }
        r53.y yVar = this.f392698f;
        yVar.getClass();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i19 = this.f392694b;
        int i27 = this.f392695c;
        if (width != i19 || height != i27) {
            float f17 = i27;
            float f18 = height / f17;
            float f19 = i19;
            float f27 = width / f19;
            try {
                if (f18 < f27) {
                    i18 = (int) (f18 * f19);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(height));
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    arrayList.add(0);
                    arrayList.add(java.lang.Integer.valueOf((width - i18) / 2));
                    arrayList.add(bitmap2);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/game/utils/GameImageUtil", "resizeBitmap", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                    createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                    yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/game/utils/GameImageUtil", "resizeBitmap", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                    i17 = height;
                } else {
                    int i28 = (int) (f27 * f17);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(i28));
                    arrayList2.add(java.lang.Integer.valueOf(width));
                    arrayList2.add(java.lang.Integer.valueOf((height - i28) / 2));
                    arrayList2.add(0);
                    arrayList2.add(bitmap2);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/game/utils/GameImageUtil", "resizeBitmap", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                    createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), ((java.lang.Integer) arrayList2.get(3)).intValue(), ((java.lang.Integer) arrayList2.get(4)).intValue());
                    yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/game/utils/GameImageUtil", "resizeBitmap", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                    i17 = i28;
                    i18 = width;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.GameImageUtil", "resizeBitmap, bitmapW = %d, bitmapH = %d, newWidth = %d, newHeight = %d", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
                bitmap2 = createBitmap;
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        int i29 = this.f392696d;
        if (i29 != 0) {
            bitmap2 = com.tencent.mm.sdk.platformtools.x.s0(bitmap2, true, i29);
        }
        ((jt0.i) yVar.f392722d).j(this.f392697e, bitmap2);
        r53.x xVar = this.f392693a;
        if (xVar != null) {
            xVar.a(view, bitmap2);
        }
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
        r53.x xVar = this.f392693a;
        if (xVar != null) {
            xVar.b(str, view);
        }
    }
}
