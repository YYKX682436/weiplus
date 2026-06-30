package rx3;

/* loaded from: classes10.dex */
public final class z extends rx3.s {

    /* renamed from: e, reason: collision with root package name */
    public long f401084e;

    /* renamed from: f, reason: collision with root package name */
    public long f401085f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f401086g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f401087h = -1;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.f1 f401088i;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0071 A[PHI: r10
  0x0071: PHI (r10v11 java.lang.Object) = (r10v8 java.lang.Object), (r10v1 java.lang.Object) binds: [B:20:0x006e, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // rx3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int r7, boolean r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof rx3.v
            if (r0 == 0) goto L13
            r0 = r10
            rx3.v r0 = (rx3.v) r0
            int r1 = r0.f401071h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401071h = r1
            goto L18
        L13:
            rx3.v r0 = new rx3.v
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f401069f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f401071h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r10)
            goto L71
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            boolean r7 = r0.f401068e
            java.lang.Object r8 = r0.f401067d
            rx3.z r8 = (rx3.z) r8
            kotlin.ResultKt.throwOnFailure(r10)
            r9 = r7
            goto L5e
        L3e:
            kotlin.ResultKt.throwOnFailure(r10)
            if (r9 == 0) goto L46
            kotlinx.coroutines.f1 r10 = r6.f401088i
            goto L47
        L46:
            r10 = r5
        L47:
            if (r10 != 0) goto L61
            kotlinx.coroutines.p0 r10 = kotlinx.coroutines.q1.f310570c
            rx3.y r2 = new rx3.y
            r2.<init>(r8, r6, r7, r5)
            r0.f401067d = r6
            r0.f401068e = r9
            r0.f401071h = r4
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r2, r0)
            if (r10 != r1) goto L5d
            return r1
        L5d:
            r8 = r6
        L5e:
            kotlinx.coroutines.f1 r10 = (kotlinx.coroutines.f1) r10
            goto L62
        L61:
            r8 = r6
        L62:
            if (r9 == 0) goto L66
            r8.f401088i = r10
        L66:
            r0.f401067d = r5
            r0.f401071h = r3
            java.lang.Object r10 = r10.k(r0)
            if (r10 != r1) goto L71
            return r1
        L71:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rx3.z.a(int, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
