package l95;

/* loaded from: classes14.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final l95.a f317413a = new l95.a();

    /* renamed from: b, reason: collision with root package name */
    public static final l95.a f317414b = new l95.a();

    /* renamed from: c, reason: collision with root package name */
    public static final l95.a f317415c = new l95.a();

    /* renamed from: d, reason: collision with root package name */
    public static final l95.a f317416d = new l95.a();

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f317417e = new float[9];

    public static synchronized android.graphics.Paint a(android.os.Looper looper, android.graphics.Paint paint) {
        android.graphics.Paint paint2;
        synchronized (l95.b.class) {
            l95.a aVar = f317413a;
            paint2 = (android.graphics.Paint) aVar.a(looper);
            if (paint2 == null) {
                paint2 = new android.graphics.Paint();
            } else {
                paint2.reset();
            }
            if (paint != null) {
                paint2.set(paint);
            }
            aVar.c(looper, paint2);
        }
        return paint2;
    }

    public static synchronized android.graphics.Path b(android.os.Looper looper, android.graphics.Path path) {
        android.graphics.Path path2;
        synchronized (l95.b.class) {
            l95.a aVar = f317416d;
            path2 = (android.graphics.Path) aVar.a(looper);
            if (path2 == null) {
                path2 = new android.graphics.Path();
            } else {
                path2.reset();
            }
            if (path != null) {
                path2.set(path);
            }
            aVar.c(looper, path2);
        }
        return path2;
    }
}
