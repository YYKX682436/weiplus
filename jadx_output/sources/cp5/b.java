package cp5;

/* loaded from: classes14.dex */
public final class b implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f221113d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_ilink_android_buffer_manager_v2, false);

    /* renamed from: e, reason: collision with root package name */
    public final cp5.d f221114e = new cp5.d();

    /* renamed from: f, reason: collision with root package name */
    public final cp5.c f221115f = new cp5.c("MicroMsg.MTR.BufferManager", false, 0);

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f221116g = new android.util.SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseArray f221117h = new android.util.SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public int f221118i;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[EDGE_INSN: B:37:0x009b->B:28:0x009b BREAK  A[LOOP:0: B:19:0x007d->B:36:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cp5.a a(int r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.f221113d
            if (r0 == 0) goto L68
            cp5.d r7 = r5.f221114e
            boolean r0 = r7.f221133c
            r1 = 1
            if (r0 != 0) goto L14
            r7.f221133c = r1
            java.lang.String r0 = "MicroMsg.MTR.BufferManagerV2"
            java.lang.String r2 = "getDirectBuffer using V2"
            com.tencent.mars.xlog.Log.i(r0, r2)
        L14:
            cp5.c r0 = r7.f221131a
            java.util.concurrent.atomic.AtomicLong r2 = r0.f221124f
            r2.incrementAndGet()
            java.util.concurrent.atomic.AtomicLong r2 = r0.f221128j
            long r3 = (long) r6
            r2.addAndGet(r3)
            int r2 = r6 + 16384
            int r2 = r2 + (-1)
            int r2 = r2 / 16384
            int r2 = r2 * 16384
            java.util.concurrent.ConcurrentHashMap r7 = r7.f221132b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r7.get(r3)
            if (r4 != 0) goto L42
            java.util.concurrent.ConcurrentLinkedDeque r4 = new java.util.concurrent.ConcurrentLinkedDeque
            r4.<init>()
            java.lang.Object r7 = r7.putIfAbsent(r3, r4)
            if (r7 != 0) goto L41
            goto L42
        L41:
            r4 = r7
        L42:
            java.util.concurrent.ConcurrentLinkedDeque r4 = (java.util.concurrent.ConcurrentLinkedDeque) r4
            java.lang.Object r7 = r4.poll()
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            if (r7 == 0) goto L58
            java.util.concurrent.atomic.AtomicLong r0 = r0.f221125g
            r0.incrementAndGet()
            r7.clear()
            r7.limit(r6)
            goto L62
        L58:
            r0.a(r2)
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocateDirect(r2)
            kotlin.jvm.internal.o.d(r7)
        L62:
            cp5.a r6 = new cp5.a
            r6.<init>(r5, r7, r1)
            return r6
        L68:
            cp5.c r0 = r5.f221115f
            java.util.concurrent.atomic.AtomicLong r1 = r0.f221124f
            r1.incrementAndGet()
            java.util.concurrent.atomic.AtomicLong r1 = r0.f221128j
            long r2 = (long) r6
            r1.addAndGet(r2)
            android.util.SparseArray r1 = r5.f221117h
            java.lang.Object r2 = r1.get(r6)
            java.util.concurrent.ConcurrentLinkedDeque r2 = (java.util.concurrent.ConcurrentLinkedDeque) r2
        L7d:
            if (r2 == 0) goto L8e
            java.lang.Object r3 = r2.poll()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L8e
            java.lang.Object r3 = r3.get()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            goto L8f
        L8e:
            r3 = 0
        L8f:
            if (r2 == 0) goto L96
            int r4 = r2.size()
            goto L97
        L96:
            r4 = 0
        L97:
            if (r4 <= 0) goto L9b
            if (r3 == 0) goto L7d
        L9b:
            int r2 = r5.f221118i
            int r4 = r2 + 1
            r5.f221118i = r4
            int r2 = r2 % 200
            if (r2 != 0) goto Laf
            java.lang.String r2 = "MicroMsg.MTR.BufferManager"
            java.lang.String r4 = "clear cache"
            com.tencent.mars.xlog.Log.i(r2, r4)
            r1.clear()
        Laf:
            if (r3 == 0) goto Lbf
            r3.clear()
            java.util.concurrent.atomic.AtomicLong r6 = r0.f221125g
            r6.incrementAndGet()
            cp5.a r6 = new cp5.a
            r6.<init>(r5, r3, r7)
            return r6
        Lbf:
            r0.a(r6)
            cp5.a r0 = new cp5.a
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocateDirect(r6)
            r0.<init>(r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cp5.b.a(int, boolean):cp5.a");
    }

    public final void b(java.nio.ByteBuffer buffer) {
        java.lang.Object putIfAbsent;
        kotlin.jvm.internal.o.g(buffer, "buffer");
        if (!this.f221113d) {
            android.util.SparseArray sparseArray = this.f221117h;
            if (sparseArray.indexOfKey(buffer.capacity()) < 0) {
                sparseArray.put(buffer.capacity(), new java.util.concurrent.ConcurrentLinkedDeque());
            }
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) sparseArray.get(buffer.capacity());
            if (concurrentLinkedDeque != null) {
                concurrentLinkedDeque.add(new java.lang.ref.WeakReference(buffer));
                return;
            }
            return;
        }
        cp5.d dVar = this.f221114e;
        dVar.getClass();
        if (buffer.isDirect()) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = dVar.f221132b;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(buffer.capacity());
            java.lang.Object obj = concurrentHashMap.get(valueOf);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new java.util.concurrent.ConcurrentLinkedDeque()))) != null) {
                obj = putIfAbsent;
            }
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque2 = (java.util.concurrent.ConcurrentLinkedDeque) obj;
            if (concurrentLinkedDeque2.size() < 30) {
                concurrentLinkedDeque2.offer(buffer);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.BufferManager", "close");
        if (this.f221113d) {
            cp5.d dVar = this.f221114e;
            dVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.BufferManagerV2", "close");
            dVar.f221132b.clear();
            cp5.c cVar = dVar.f221131a;
            cVar.h(true);
            com.tencent.mm.plugin.vqm.f fVar = cVar.f221122d;
            if (fVar != null) {
                cVar.i();
                com.tencent.mm.plugin.vqm.a.f177293b.b(fVar);
            }
        } else {
            cp5.c cVar2 = this.f221115f;
            cVar2.h(true);
            com.tencent.mm.plugin.vqm.f fVar2 = cVar2.f221122d;
            if (fVar2 != null) {
                cVar2.i();
                com.tencent.mm.plugin.vqm.a.f177293b.b(fVar2);
            }
        }
        this.f221116g.clear();
    }
}
