package qp1;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final qp1.a f365680a;

    /* renamed from: b, reason: collision with root package name */
    public static final kk.j f365681b;

    static {
        qp1.a aVar = new qp1.a();
        f365680a = aVar;
        f365681b = new jt0.i(10, aVar.getClass());
    }

    public final void a(java.lang.String str, android.graphics.Bitmap bitmap) {
        if ((str == null || str.length() == 0) || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.getRowBytes();
        bitmap.getWidth();
        bitmap.getHeight();
        bitmap.getAllocationByteCount();
        ((jt0.i) f365681b).put(str, bitmap);
    }
}
