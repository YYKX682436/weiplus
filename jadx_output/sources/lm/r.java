package lm;

@j95.b
/* loaded from: classes12.dex */
public final class r extends jm0.o implements w65.n {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f319329m = jz5.h.b(new lm.e(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f319330n = jz5.h.b(lm.q.f319328d);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f319331o = jz5.h.b(lm.p.f319327d);

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(hm.u.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007e A[PHI: r10
  0x007e: PHI (r10v10 java.lang.Object) = (r10v9 java.lang.Object), (r10v1 java.lang.Object) binds: [B:17:0x007b, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Zi(w65.m r6, long r7, java.lang.ref.WeakReference r9, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof lm.i
            if (r0 == 0) goto L13
            r0 = r10
            lm.i r0 = (lm.i) r0
            int r1 = r0.f319311h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319311h = r1
            goto L18
        L13:
            lm.i r0 = new lm.i
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f319309f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f319311h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L7e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            long r7 = r0.f319307d
            java.lang.Object r6 = r0.f319308e
            r9 = r6
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L6b
        L3d:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "startTaskSync "
            r10.<init>(r2)
            java.lang.String r2 = r6.id()
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            java.lang.String r2 = "MicroMsg.WeTaskFeatureService"
            com.tencent.mars.xlog.Log.i(r2, r10)
            r0.f319308e = r9
            r0.f319307d = r7
            r0.f319311h = r4
            hm.n r10 = hm.u.f282177h
            hm.u r10 = r10.a()
            java.lang.Object r10 = r10.U6(r6, r0)
            if (r10 != r1) goto L6b
            return r1
        L6b:
            w65.m r10 = (w65.m) r10
            lm.n r6 = new lm.n
            r2 = 0
            r6.<init>(r10, r9, r2)
            r0.f319308e = r2
            r0.f319311h = r3
            java.lang.Object r10 = kotlinx.coroutines.a4.c(r7, r6, r0)
            if (r10 != r1) goto L7e
            return r1
        L7e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: lm.r.Zi(w65.m, long, java.lang.ref.WeakReference, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
