package o1;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public yz5.a f342021a = new o1.b(this);

    /* renamed from: b, reason: collision with root package name */
    public kotlinx.coroutines.y0 f342022b;

    /* renamed from: c, reason: collision with root package name */
    public o1.a f342023c;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, kotlin.coroutines.Continuation r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof o1.c
            if (r0 == 0) goto L13
            r0 = r12
            o1.c r0 = (o1.c) r0
            int r1 = r0.f342017f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f342017f = r1
            goto L18
        L13:
            o1.c r0 = new o1.c
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.f342015d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f342017f
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            kotlin.ResultKt.throwOnFailure(r12)
            goto L42
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            kotlin.ResultKt.throwOnFailure(r12)
            o1.a r1 = r7.f342023c
            if (r1 == 0) goto L47
            r6.f342017f = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.a(r2, r4, r6)
            if (r12 != r0) goto L42
            return r0
        L42:
            p2.w r12 = (p2.w) r12
            long r8 = r12.f351406a
            goto L4b
        L47:
            int r8 = p2.w.f351405c
            long r8 = p2.w.f351404b
        L4b:
            p2.w r10 = new p2.w
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.e.a(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long b(long j17, long j18, int i17) {
        o1.a aVar = this.f342023c;
        if (aVar != null) {
            return aVar.b(j17, j18, i17);
        }
        int i18 = d1.e.f225626e;
        return d1.e.f225623b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o1.d
            if (r0 == 0) goto L13
            r0 = r7
            o1.d r0 = (o1.d) r0
            int r1 = r0.f342020f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f342020f = r1
            goto L18
        L13:
            o1.d r0 = new o1.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f342018d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f342020f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r7)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.throwOnFailure(r7)
            o1.a r7 = r4.f342023c
            if (r7 == 0) goto L44
            r0.f342020f = r3
            java.lang.Object r7 = r7.c(r5, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            p2.w r7 = (p2.w) r7
            long r5 = r7.f351406a
            goto L48
        L44:
            int r5 = p2.w.f351405c
            long r5 = p2.w.f351404b
        L48:
            p2.w r7 = new p2.w
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.e.c(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final kotlinx.coroutines.y0 d() {
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f342021a.invoke();
        if (y0Var != null) {
            return y0Var;
        }
        throw new java.lang.IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
