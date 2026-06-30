package d8;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f226903a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f226904b;

    public i() {
        java.util.HashMap hashMap = new java.util.HashMap(3);
        this.f226903a = hashMap;
        this.f226904b = new android.util.SparseArray();
        hashMap.put(com.github.henryye.nativeiv.bitmap.BitmapType.Native, new d8.f(this));
        hashMap.put(com.github.henryye.nativeiv.bitmap.BitmapType.Legacy, new d8.g(this));
        hashMap.put(com.github.henryye.nativeiv.bitmap.BitmapType.Undefined, new d8.h(this));
    }

    public final com.github.henryye.nativeiv.bitmap.IBitmap a(java.io.InputStream inputStream, android.graphics.Bitmap.Config config, f8.c cVar, java.util.Map map) {
        com.github.henryye.nativeiv.bitmap.BitmapType bitmapType = com.github.henryye.nativeiv.bitmap.BitmapType.Native;
        if (((f8.b) map.get(bitmapType)).a(inputStream, config, cVar)) {
            return ((f8.b) map.get(bitmapType)).b();
        }
        com.github.henryye.nativeiv.bitmap.BitmapType bitmapType2 = com.github.henryye.nativeiv.bitmap.BitmapType.Legacy;
        return ((f8.b) map.get(bitmapType2)).a(inputStream, config, cVar) ? ((f8.b) map.get(bitmapType2)).b() : ((f8.b) map.get(com.github.henryye.nativeiv.bitmap.BitmapType.Undefined)).b();
    }
}
