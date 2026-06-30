package qw1;

/* loaded from: classes14.dex */
public final class j implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f367108d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f367109e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f367110f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.ArrayMap f367111g;

    /* renamed from: h, reason: collision with root package name */
    public qw1.c f367112h;

    /* renamed from: i, reason: collision with root package name */
    public qw1.f f367113i;

    public j(kotlinx.coroutines.p0 coroutineDispatcher) {
        kotlin.jvm.internal.o.g(coroutineDispatcher, "coroutineDispatcher");
        this.f367108d = coroutineDispatcher;
        this.f367109e = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f367110f = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f367111g = new android.util.ArrayMap();
    }

    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        lw1.l lVar = lw1.m.f321560e;
        return kotlinx.coroutines.l.g(this.f367108d.plus(lw1.m.f321561f), new qw1.g(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, boolean r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof qw1.h
            if (r0 == 0) goto L13
            r0 = r8
            qw1.h r0 = (qw1.h) r0
            int r1 = r0.f367098i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f367098i = r1
            goto L18
        L13:
            qw1.h r0 = new qw1.h
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f367096g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f367098i
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f367095f
            qw1.j r6 = (qw1.j) r6
            java.lang.Object r7 = r0.f367094e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.f367093d
            qw1.j r0 = (qw1.j) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L66
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.ResultKt.throwOnFailure(r8)
            qw1.f r8 = r5.f367113i
            r2 = 0
            if (r8 == 0) goto L52
            java.lang.String r4 = r8.f367089a
            boolean r4 = kotlin.jvm.internal.o.b(r4, r6)
            if (r4 == 0) goto L4c
            goto L4d
        L4c:
            r8 = r2
        L4d:
            if (r8 != 0) goto L50
            goto L52
        L50:
            r2 = r8
            goto L6f
        L52:
            if (r7 == 0) goto L6f
            r0.f367093d = r5
            r0.f367094e = r6
            r0.f367095f = r5
            r0.f367098i = r3
            java.lang.Object r8 = r5.a(r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            r0 = r5
            r7 = r6
            r6 = r0
        L66:
            qw1.d r8 = (qw1.d) r8
            qw1.f r2 = new qw1.f
            r2.<init>(r6, r7, r8)
            r0.f367113i = r2
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qw1.j.b(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qw1.j.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLTextureManager", "close");
        qw1.f fVar = this.f367113i;
        if (fVar != null) {
            fVar.f367090b.a();
        }
        for (java.util.Map.Entry entry : this.f367111g.entrySet()) {
            kotlin.jvm.internal.o.d(entry);
            qw1.e eVar = (qw1.e) entry.getValue();
            eVar.f367086d = false;
            eVar.f367083a.a();
            eVar.f367084b.a();
            eVar.f367085c.a();
        }
        java.util.Iterator it = this.f367110f.iterator();
        while (it.hasNext()) {
            ((is0.c) it.next()).close();
        }
        this.f367111g.clear();
        this.f367109e.clear();
        this.f367110f.clear();
    }
}
