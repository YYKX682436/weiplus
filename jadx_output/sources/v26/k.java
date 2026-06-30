package v26;

/* loaded from: classes5.dex */
public final class k implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f433016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.sync.m f433017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u26.r0 f433018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v26.q0 f433019g;

    public k(kotlinx.coroutines.r2 r2Var, kotlinx.coroutines.sync.m mVar, u26.r0 r0Var, v26.q0 q0Var) {
        this.f433016d = r2Var;
        this.f433017e = mVar;
        this.f433018f = r0Var;
        this.f433019g = q0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(kotlinx.coroutines.flow.j r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof v26.j
            if (r0 == 0) goto L13
            r0 = r9
            v26.j r0 = (v26.j) r0
            int r1 = r0.f433014h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433014h = r1
            goto L18
        L13:
            v26.j r0 = new v26.j
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f433012f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f433014h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.f433011e
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
            java.lang.Object r0 = r0.f433010d
            v26.k r0 = (v26.k) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5c
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.r2 r9 = r7.f433016d
            if (r9 == 0) goto L4a
            boolean r2 = r9.a()
            if (r2 == 0) goto L45
            goto L4a
        L45:
            java.util.concurrent.CancellationException r8 = r9.x()
            throw r8
        L4a:
            r0.f433010d = r7
            r0.f433011e = r8
            r0.f433014h = r3
            kotlinx.coroutines.sync.m r9 = r7.f433017e
            kotlinx.coroutines.sync.o r9 = (kotlinx.coroutines.sync.o) r9
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L5b
            return r1
        L5b:
            r0 = r7
        L5c:
            u26.r0 r1 = r0.f433018f
            r2 = 0
            r3 = 0
            v26.i r4 = new v26.i
            r9 = 0
            v26.q0 r5 = r0.f433019g
            kotlinx.coroutines.sync.m r0 = r0.f433017e
            r4.<init>(r8, r5, r0, r9)
            r5 = 3
            r6 = 0
            kotlinx.coroutines.l.d(r1, r2, r3, r4, r5, r6)
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v26.k.emit(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
