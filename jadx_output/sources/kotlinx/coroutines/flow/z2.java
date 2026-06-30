package kotlinx.coroutines.flow;

/* loaded from: classes10.dex */
public final class z2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f310471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f310472e;

    public z2(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.flow.k kVar) {
        this.f310471d = c0Var;
        this.f310472e = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.y2
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.y2 r0 = (kotlinx.coroutines.flow.y2) r0
            int r1 = r0.f310463f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310463f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y2 r0 = new kotlinx.coroutines.flow.y2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f310461d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310463f
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.throwOnFailure(r7)
            if (r6 <= 0) goto L4b
            kotlin.jvm.internal.c0 r6 = r5.f310471d
            boolean r7 = r6.f310112d
            if (r7 != 0) goto L4b
            r6.f310112d = r4
            kotlinx.coroutines.flow.t2 r6 = kotlinx.coroutines.flow.t2.START
            r0.f310463f = r4
            kotlinx.coroutines.flow.k r7 = r5.f310472e
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z2.a(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.k
    public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return a(((java.lang.Number) obj).intValue(), continuation);
    }
}
