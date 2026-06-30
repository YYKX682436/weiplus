package d8;

/* loaded from: classes7.dex */
public class l {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f226905f = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public com.github.henryye.nativeiv.bitmap.BitmapType f226906a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.github.henryye.nativeiv.bitmap.IBitmap f226907b = new d8.j();

    /* renamed from: c, reason: collision with root package name */
    public e8.d f226908c;

    /* renamed from: d, reason: collision with root package name */
    public final e8.a f226909d;

    /* renamed from: e, reason: collision with root package name */
    public final d8.i f226910e;

    public l(d8.i iVar, e8.a aVar) {
        this.f226910e = iVar;
        this.f226909d = aVar;
    }

    public f8.d a(java.io.InputStream inputStream) {
        java.util.Map map = i8.c.f289507a;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (!inputStream.markSupported()) {
            inputStream = inputStream instanceof java.io.FileInputStream ? new i8.b((java.io.FileInputStream) inputStream) : new java.io.BufferedInputStream(inputStream);
        }
        inputStream.mark(8388608);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(null);
        arrayList.add(inputStream);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/github/henryye/nativeiv/util/FormatUtil", "getImageInfo", "(Ljava/io/InputStream;)Lcom/github/henryye/nativeiv/bitmap/PictureInfo;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0), (android.graphics.Rect) arrayList.get(1), (android.graphics.BitmapFactory.Options) arrayList.get(2)), "com/github/henryye/nativeiv/util/FormatUtil", "getImageInfo", "(Ljava/io/InputStream;)Lcom/github/henryye/nativeiv/bitmap/PictureInfo;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        f8.c cVar = (f8.c) ((java.util.HashMap) i8.c.f289507a).get(options.outMimeType);
        f8.c cVar2 = f8.c.UNKNOWN;
        if (cVar == null) {
            cVar = cVar2;
        }
        try {
            inputStream.reset();
            cVar2 = cVar;
        } catch (java.io.IOException e17) {
            g8.g.c("Ni.FormatUtil", e17, "hy: the given stream is markable, but still reset error. should not forward", new java.lang.Object[0]);
        }
        f8.d dVar = new f8.d();
        dVar.f260072a = cVar2;
        dVar.f260074c = options.outHeight;
        dVar.f260073b = options.outWidth;
        return dVar;
    }

    public void b(f8.b bVar) {
        com.github.henryye.nativeiv.bitmap.IBitmap iBitmap;
        com.github.henryye.nativeiv.bitmap.BitmapType bitmapType = com.github.henryye.nativeiv.bitmap.BitmapType.Legacy;
        synchronized (f226905f) {
            if (this.f226907b.getType() == bitmapType && (iBitmap = this.f226907b) != null) {
                iBitmap.recycle();
            }
            d8.i iVar = this.f226910e;
            int hashCode = hashCode();
            android.util.SparseArray sparseArray = iVar.f226904b;
            java.util.Map map = (java.util.Map) sparseArray.get(hashCode);
            if (map == null) {
                map = new java.util.HashMap(2);
            }
            map.put(bitmapType, bVar);
            sparseArray.append(hashCode, map);
        }
    }
}
