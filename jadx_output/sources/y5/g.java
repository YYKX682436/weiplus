package y5;

/* loaded from: classes14.dex */
public final class g implements y5.d {

    /* renamed from: a, reason: collision with root package name */
    public final c6.j f459434a;

    /* renamed from: b, reason: collision with root package name */
    public final int f459435b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f459436c;

    /* renamed from: d, reason: collision with root package name */
    public final int f459437d;

    /* renamed from: e, reason: collision with root package name */
    public final c6.j f459438e;

    /* renamed from: f, reason: collision with root package name */
    public final coil.size.Size f459439f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Bitmap f459440g;

    /* renamed from: h, reason: collision with root package name */
    public final r5.g f459441h;

    public g(c6.j initialRequest, int i17, java.util.List interceptors, int i18, c6.j request, coil.size.Size size, android.graphics.Bitmap bitmap, r5.g eventListener) {
        kotlin.jvm.internal.o.g(initialRequest, "initialRequest");
        kotlin.jvm.internal.o.g(interceptors, "interceptors");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(size, "size");
        kotlin.jvm.internal.o.g(eventListener, "eventListener");
        this.f459434a = initialRequest;
        this.f459435b = i17;
        this.f459436c = interceptors;
        this.f459437d = i18;
        this.f459438e = request;
        this.f459439f = size;
        this.f459440g = bitmap;
        this.f459441h = eventListener;
    }

    public final void a(c6.j jVar, y5.e eVar) {
        android.content.Context context = jVar.f38829a;
        c6.j jVar2 = this.f459434a;
        if (!(context == jVar2.f38829a)) {
            throw new java.lang.IllegalStateException(("Interceptor '" + eVar + "' cannot modify the request's context.").toString());
        }
        if (!(jVar.f38830b != c6.m.f38859a)) {
            throw new java.lang.IllegalStateException(("Interceptor '" + eVar + "' cannot set the request's data to null.").toString());
        }
        if (!(jVar.f38831c == jVar2.f38831c)) {
            throw new java.lang.IllegalStateException(("Interceptor '" + eVar + "' cannot modify the request's target.").toString());
        }
        if (!(jVar.f38841m == jVar2.f38841m)) {
            throw new java.lang.IllegalStateException(("Interceptor '" + eVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (jVar.f38842n == jVar2.f38842n) {
            return;
        }
        throw new java.lang.IllegalStateException(("Interceptor '" + eVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(c6.j r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof y5.f
            if (r0 == 0) goto L13
            r0 = r15
            y5.f r0 = (y5.f) r0
            int r1 = r0.f459433h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f459433h = r1
            goto L18
        L13:
            y5.f r0 = new y5.f
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f459431f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f459433h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r14 = r0.f459430e
            y5.e r14 = (y5.e) r14
            java.lang.Object r0 = r0.f459429d
            y5.g r0 = (y5.g) r0
            kotlin.ResultKt.throwOnFailure(r15)
            goto L77
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L37:
            kotlin.ResultKt.throwOnFailure(r15)
            java.util.List r15 = r13.f459436c
            int r2 = r13.f459437d
            if (r2 <= 0) goto L4b
            int r4 = r2 + (-1)
            java.lang.Object r4 = r15.get(r4)
            y5.e r4 = (y5.e) r4
            r13.a(r14, r4)
        L4b:
            java.lang.Object r15 = r15.get(r2)
            y5.e r15 = (y5.e) r15
            int r8 = r2 + 1
            coil.size.Size r10 = r13.f459439f
            y5.g r2 = new y5.g
            c6.j r5 = r13.f459434a
            int r6 = r13.f459435b
            java.util.List r7 = r13.f459436c
            android.graphics.Bitmap r11 = r13.f459440g
            r5.g r12 = r13.f459441h
            r4 = r2
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.f459429d = r13
            r0.f459430e = r15
            r0.f459433h = r3
            r14 = r15
            y5.c r14 = (y5.c) r14
            java.lang.Object r15 = r14.b(r2, r0)
            if (r15 != r1) goto L76
            return r1
        L76:
            r0 = r13
        L77:
            c6.l r15 = (c6.l) r15
            c6.j r1 = r15.b()
            r0.a(r1, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.g.b(c6.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
