package kotlinx.coroutines.flow;

/* loaded from: classes11.dex */
public final class x1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f310451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f310452e;

    public x1(kotlinx.coroutines.flow.k kVar, yz5.p pVar) {
        this.f310451d = kVar;
        this.f310452e = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.w1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.w1 r0 = (kotlinx.coroutines.flow.w1) r0
            int r1 = r0.f310439e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310439e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.w1 r0 = new kotlinx.coroutines.flow.w1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f310438d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310439e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L60
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f310442h
            kotlinx.coroutines.flow.k r6 = (kotlinx.coroutines.flow.k) r6
            java.lang.Object r2 = r0.f310441g
            kotlin.ResultKt.throwOnFailure(r7)
            goto L52
        L3c:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f310441g = r6
            kotlinx.coroutines.flow.k r7 = r5.f310451d
            r0.f310442h = r7
            r0.f310439e = r4
            yz5.p r2 = r5.f310452e
            java.lang.Object r2 = r2.invoke(r6, r0)
            if (r2 != r1) goto L50
            return r1
        L50:
            r2 = r6
            r6 = r7
        L52:
            r7 = 0
            r0.f310441g = r7
            r0.f310442h = r7
            r0.f310439e = r3
            java.lang.Object r6 = r6.emit(r2, r0)
            if (r6 != r1) goto L60
            return r1
        L60:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
