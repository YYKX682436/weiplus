package hj3;

/* loaded from: classes14.dex */
public final class m implements ej3.c {

    /* renamed from: a, reason: collision with root package name */
    public final oz5.l f281643a;

    /* renamed from: b, reason: collision with root package name */
    public final jj3.j f281644b;

    /* renamed from: c, reason: collision with root package name */
    public final nj3.j f281645c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f281646d;

    /* renamed from: e, reason: collision with root package name */
    public final oj3.a f281647e;

    /* renamed from: f, reason: collision with root package name */
    public final mj3.d f281648f;

    /* renamed from: g, reason: collision with root package name */
    public final kj3.d f281649g;

    /* renamed from: h, reason: collision with root package name */
    public final lj3.a f281650h;

    public m(oz5.l glCoroutineContext, jj3.j renderTargetHolder, nj3.j textureManager) {
        kotlin.jvm.internal.o.g(glCoroutineContext, "glCoroutineContext");
        kotlin.jvm.internal.o.g(renderTargetHolder, "renderTargetHolder");
        kotlin.jvm.internal.o.g(textureManager, "textureManager");
        this.f281643a = glCoroutineContext;
        this.f281644b = renderTargetHolder;
        this.f281645c = textureManager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f281646d = arrayList;
        oj3.a aVar = new oj3.a();
        arrayList.add(aVar);
        this.f281647e = aVar;
        mj3.d dVar = new mj3.d();
        arrayList.add(dVar);
        this.f281648f = dVar;
        kj3.d dVar2 = new kj3.d();
        arrayList.add(dVar2);
        this.f281649g = dVar2;
        lj3.a aVar2 = new lj3.a();
        arrayList.add(aVar2);
        this.f281650h = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ej3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof hj3.j
            if (r0 == 0) goto L13
            r0 = r7
            hj3.j r0 = (hj3.j) r0
            int r1 = r0.f281635g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f281635g = r1
            goto L18
        L13:
            hj3.j r0 = new hj3.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f281633e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f281635g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r2 = r0.f281632d
            java.util.Iterator r2 = (java.util.Iterator) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L59
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f281632d
            hj3.m r2 = (hj3.m) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L52
        L40:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.String r7 = "MicroMsg.MTR.GLDispatchMTRTask"
            java.lang.String r2 = "init: "
            com.tencent.mars.xlog.Log.i(r7, r2)
            r0.f281632d = r6
            r0.f281635g = r5
            if (r3 != r1) goto L51
            return r1
        L51:
            r2 = r6
        L52:
            java.util.List r7 = r2.f281646d
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L59:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L70
            java.lang.Object r7 = r2.next()
            ej3.c r7 = (ej3.c) r7
            r0.f281632d = r2
            r0.f281635g = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L59
            return r1
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hj3.m.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ej3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof hj3.k
            if (r0 == 0) goto L13
            r0 = r7
            hj3.k r0 = (hj3.k) r0
            int r1 = r0.f281639g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f281639g = r1
            goto L18
        L13:
            hj3.k r0 = new hj3.k
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f281637e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f281639g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r2 = r0.f281636d
            java.util.Iterator r2 = (java.util.Iterator) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L59
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f281636d
            hj3.m r2 = (hj3.m) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L52
        L40:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.String r7 = "MicroMsg.MTR.GLDispatchMTRTask"
            java.lang.String r2 = "release: "
            com.tencent.mars.xlog.Log.i(r7, r2)
            r0.f281636d = r6
            r0.f281639g = r5
            if (r3 != r1) goto L51
            return r1
        L51:
            r2 = r6
        L52:
            java.util.List r7 = r2.f281646d
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L59:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L70
            java.lang.Object r7 = r2.next()
            ej3.c r7 = (ej3.c) r7
            r0.f281636d = r2
            r0.f281639g = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L59
            return r1
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hj3.m.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
    
        if (r4 == null) goto L48;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ej3.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(hj3.r r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hj3.m.c(hj3.r, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object e(java.lang.String key, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        jj3.c cVar;
        jj3.j jVar = this.f281644b;
        synchronized (jVar) {
            kotlin.jvm.internal.o.g(key, "key");
            cVar = (jj3.c) jVar.f300020e.get(key);
        }
        if (cVar == null) {
            return null;
        }
        ij3.l lVar = ij3.m.f291712e;
        return kotlinx.coroutines.l.g(this.f281643a.plus(new ij3.m(new ij3.i(cVar))), new hj3.l(pVar, cVar, null), continuation);
    }
}
