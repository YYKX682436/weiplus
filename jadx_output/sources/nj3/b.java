package nj3;

/* loaded from: classes14.dex */
public final class b implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f337887d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f337888e = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public int f337889f;

    /* renamed from: g, reason: collision with root package name */
    public int f337890g;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0026 A[EDGE_INSN: B:21:0x0026->B:11:0x0026 BREAK  A[LOOP:0: B:2:0x0008->B:20:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nj3.a a(int r11) {
        /*
            r10 = this;
            android.util.SparseArray r0 = r10.f337887d
            java.lang.Object r1 = r0.get(r11)
            java.util.concurrent.ConcurrentLinkedDeque r1 = (java.util.concurrent.ConcurrentLinkedDeque) r1
        L8:
            if (r1 == 0) goto L19
            java.lang.Object r2 = r1.poll()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L19
            java.lang.Object r2 = r2.get()
            byte[] r2 = (byte[]) r2
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r1 == 0) goto L21
            int r3 = r1.size()
            goto L22
        L21:
            r3 = 0
        L22:
            if (r3 <= 0) goto L26
            if (r2 == 0) goto L8
        L26:
            int r1 = r10.f337889f
            int r3 = r1 + 1
            r10.f337889f = r3
            int r1 = r1 % 200
            if (r1 != 0) goto L3a
            java.lang.String r1 = "MicroMsg.MTR.BufferManager"
            java.lang.String r3 = "clear cache"
            com.tencent.mars.xlog.Log.i(r1, r3)
            r0.clear()
        L3a:
            nj3.a r0 = new nj3.a
            if (r2 != 0) goto L40
            byte[] r2 = new byte[r11]
        L40:
            r6 = r2
            r7 = 0
            r8 = 2
            r9 = 0
            r4 = r0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nj3.b.a(int):nj3.a");
    }

    public final void b(byte[] buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        android.util.SparseArray sparseArray = this.f337887d;
        if (sparseArray.indexOfKey(buffer.length) < 0) {
            sparseArray.put(buffer.length, new java.util.concurrent.ConcurrentLinkedDeque());
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) sparseArray.get(buffer.length);
        if (concurrentLinkedDeque != null) {
            concurrentLinkedDeque.add(new java.lang.ref.WeakReference(buffer));
        }
    }

    public final void c(java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        android.util.SparseArray sparseArray = this.f337888e;
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
        this.f337887d.clear();
    }
}
