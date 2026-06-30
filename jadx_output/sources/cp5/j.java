package cp5;

/* loaded from: classes14.dex */
public final class j implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f221159d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f221160e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f221161f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f221162g;

    public j(kotlinx.coroutines.p0 coroutineDispatcher) {
        kotlin.jvm.internal.o.g(coroutineDispatcher, "coroutineDispatcher");
        this.f221159d = coroutineDispatcher;
        this.f221160e = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f221161f = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f221162g = new android.util.SparseArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof cp5.i
            if (r0 == 0) goto L13
            r0 = r12
            cp5.i r0 = (cp5.i) r0
            int r1 = r0.f221158h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221158h = r1
            goto L18
        L13:
            cp5.i r0 = new cp5.i
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f221156f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f221158h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r11 = r0.f221155e
            java.lang.Object r0 = r0.f221154d
            cp5.j r0 = (cp5.j) r0
            kotlin.ResultKt.throwOnFailure(r12)
            goto L59
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.ResultKt.throwOnFailure(r12)
            android.util.SparseArray r12 = r10.f221162g
            java.lang.Object r12 = r12.get(r11)
            cp5.e r12 = (cp5.e) r12
            if (r12 != 0) goto L80
            r0.f221154d = r10
            r0.f221155e = r11
            r0.f221158h = r3
            cp5.h r12 = new cp5.h
            r2 = 0
            r4 = 3
            r12.<init>(r4, r10, r2)
            kotlinx.coroutines.p0 r2 = r10.f221159d
            java.lang.Object r12 = kotlinx.coroutines.l.g(r2, r12, r0)
            if (r12 != r1) goto L58
            return r1
        L58:
            r0 = r10
        L59:
            java.util.List r12 = (java.util.List) r12
            cp5.e r1 = new cp5.e
            r2 = 0
            java.lang.Object r2 = r12.get(r2)
            r7 = r2
            cp5.f r7 = (cp5.f) r7
            java.lang.Object r2 = r12.get(r3)
            r8 = r2
            cp5.f r8 = (cp5.f) r8
            r2 = 2
            java.lang.Object r12 = r12.get(r2)
            r9 = r12
            cp5.f r9 = (cp5.f) r9
            r4 = r1
            r5 = r0
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            android.util.SparseArray r12 = r0.f221162g
            r12.put(r11, r1)
            r12 = r1
        L80:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: cp5.j.a(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.IGLTextureManager", "close");
        android.util.SparseArray sparseArray = this.f221162g;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            sparseArray.keyAt(i17);
            cp5.e eVar = (cp5.e) sparseArray.valueAt(i17);
            eVar.f221137d = false;
            cp5.f fVar = eVar.f221134a;
            fVar.f221140b = false;
            fVar.f221141c.f221160e.add(fVar.f221139a);
            cp5.f fVar2 = eVar.f221135b;
            fVar2.f221140b = false;
            fVar2.f221141c.f221160e.add(fVar2.f221139a);
            cp5.f fVar3 = eVar.f221136c;
            fVar3.f221140b = false;
            fVar3.f221141c.f221160e.add(fVar3.f221139a);
        }
        java.util.Iterator it = this.f221161f.iterator();
        while (it.hasNext()) {
            ((dp5.a) ((dp5.f) it.next())).close();
        }
        this.f221162g.clear();
        this.f221160e.clear();
        this.f221161f.clear();
    }
}
