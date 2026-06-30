package qw1;

/* loaded from: classes14.dex */
public final class b implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f367074d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f367075e = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public int f367076f;

    public final void a(byte[] buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        android.util.SparseArray sparseArray = this.f367074d;
        if (sparseArray.indexOfKey(buffer.length) < 0) {
            sparseArray.put(buffer.length, new java.util.concurrent.ConcurrentLinkedDeque());
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) sparseArray.get(buffer.length);
        if (concurrentLinkedDeque != null) {
            concurrentLinkedDeque.add(new java.lang.ref.WeakReference(buffer));
        }
    }

    public final void b(java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        android.util.SparseArray sparseArray = this.f367075e;
        if (sparseArray.indexOfKey(buffer.capacity()) < 0) {
            sparseArray.put(buffer.capacity(), new java.util.concurrent.ConcurrentLinkedDeque());
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) sparseArray.get(buffer.capacity());
        if (concurrentLinkedDeque != null) {
            concurrentLinkedDeque.add(new java.lang.ref.WeakReference(buffer));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.BufferManager", "close");
        this.f367074d.clear();
    }
}
