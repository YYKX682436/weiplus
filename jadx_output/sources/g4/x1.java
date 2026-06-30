package g4;

/* loaded from: classes5.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final g4.e0 f268606a;

    /* renamed from: b, reason: collision with root package name */
    public final g4.e0 f268607b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j f268608c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f268609d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f268610e;

    /* renamed from: f, reason: collision with root package name */
    public final g4.h3 f268611f;

    public x1(yz5.l pagingSourceFactory, java.lang.Object obj, g4.h3 config, g4.e4 e4Var) {
        kotlin.jvm.internal.o.g(pagingSourceFactory, "pagingSourceFactory");
        kotlin.jvm.internal.o.g(config, "config");
        this.f268609d = pagingSourceFactory;
        this.f268610e = obj;
        this.f268611f = config;
        this.f268606a = new g4.e0(null, 1, null);
        this.f268607b = new g4.e0(null, 1, null);
        this.f268608c = g4.l4.a(new g4.t1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(g4.b4 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof g4.u1
            if (r0 == 0) goto L13
            r0 = r7
            g4.u1 r0 = (g4.u1) r0
            int r1 = r0.f268580e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268580e = r1
            goto L18
        L13:
            g4.u1 r0 = new g4.u1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f268579d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f268580e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f268583h
            g4.b4 r6 = (g4.b4) r6
            java.lang.Object r0 = r0.f268582g
            g4.x1 r0 = (g4.x1) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f268582g = r5
            r0.f268583h = r6
            r0.f268580e = r3
            yz5.l r7 = r5.f268609d
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            g4.b4 r7 = (g4.b4) r7
            r1 = 0
            if (r7 == r6) goto L51
            r2 = r3
            goto L52
        L51:
            r2 = r1
        L52:
            if (r2 == 0) goto L8e
            g4.v1 r2 = new g4.v1
            r2.<init>(r0)
            r7.getClass()
            java.util.concurrent.CopyOnWriteArrayList r4 = r7.f268213a
            r4.add(r2)
            if (r6 == 0) goto L6d
            g4.w1 r2 = new g4.w1
            r2.<init>(r0)
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.f268213a
            r0.remove(r2)
        L6d:
            if (r6 == 0) goto L8d
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f268214b
            boolean r0 = r0.compareAndSet(r1, r3)
            if (r0 == 0) goto L8d
            java.util.concurrent.CopyOnWriteArrayList r6 = r6.f268213a
            java.util.Iterator r6 = r6.iterator()
        L7d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r6.next()
            yz5.a r0 = (yz5.a) r0
            r0.invoke()
            goto L7d
        L8d:
            return r7
        L8e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.x1.a(g4.b4, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
