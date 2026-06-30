package m95;

/* loaded from: classes13.dex */
public class j extends android.util.LongSparseArray {

    /* renamed from: d, reason: collision with root package name */
    public android.util.LongSparseArray f325103d = null;

    @Override // android.util.LongSparseArray
    public void clear() {
        super.clear();
        n95.d.a("MicroMsg.SVGLongSparseArray", "Found u! clear.", new java.lang.Object[0]);
    }

    @Override // android.util.LongSparseArray
    public void delete(long j17) {
        super.delete(j17);
        n95.d.a("MicroMsg.SVGLongSparseArray", "Found u! delete key %s", java.lang.Long.valueOf(j17));
    }

    @Override // android.util.LongSparseArray
    public java.lang.Object get(long j17, java.lang.Object obj) {
        m95.g a17;
        java.lang.ThreadLocal threadLocal = m95.k.f325117n;
        if (threadLocal.get() == null || !((java.lang.Boolean) threadLocal.get()).booleanValue()) {
            synchronized (this.f325103d) {
                if (this.f325103d.indexOfKey(j17) >= 0) {
                    java.lang.Object obj2 = this.f325103d.get(j17, obj);
                    if ((android.os.Build.VERSION.SDK_INT >= 28 && m95.k.f325118o) && (a17 = m95.k.a(j17, (m95.i) obj2)) != null) {
                        obj2 = !a17.f325094b ? a17.f325093a : null;
                    }
                    if (obj2 != null) {
                        return obj2;
                    }
                }
            }
        }
        return super.get(j17, obj);
    }

    @Override // android.util.LongSparseArray
    public void remove(long j17) {
        super.remove(j17);
        n95.d.a("MicroMsg.SVGLongSparseArray", "Found u! remove key %s", java.lang.Long.valueOf(j17));
    }
}
