package d7;

/* loaded from: classes13.dex */
public class e implements w6.z0, w6.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f226794d;

    /* renamed from: e, reason: collision with root package name */
    public final x6.d f226795e;

    public e(android.graphics.Bitmap bitmap, x6.d dVar) {
        if (bitmap == null) {
            throw new java.lang.NullPointerException("Bitmap must not be null");
        }
        this.f226794d = bitmap;
        if (dVar == null) {
            throw new java.lang.NullPointerException("BitmapPool must not be null");
        }
        this.f226795e = dVar;
    }

    public static d7.e b(android.graphics.Bitmap bitmap, x6.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new d7.e(bitmap, dVar);
    }

    @Override // w6.z0
    public java.lang.Class a() {
        return android.graphics.Bitmap.class;
    }

    @Override // w6.z0
    public java.lang.Object get() {
        return this.f226794d;
    }

    @Override // w6.z0
    public int getSize() {
        return q7.p.c(this.f226794d);
    }

    @Override // w6.u0
    public void initialize() {
        this.f226794d.prepareToDraw();
    }

    @Override // w6.z0
    public void recycle() {
        this.f226795e.b(this.f226794d);
    }
}
