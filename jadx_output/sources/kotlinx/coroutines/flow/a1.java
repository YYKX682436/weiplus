package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class a1 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlinx.coroutines.flow.k r4, java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.v0
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.v0 r0 = (kotlinx.coroutines.flow.v0) r0
            int r1 = r0.f310427f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310427f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.v0 r0 = new kotlinx.coroutines.flow.v0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f310426e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310427f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r4 = r0.f310425d
            kotlinx.coroutines.flow.k r4 = (kotlinx.coroutines.flow.k) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L41
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f310425d = r4
            r0.f310427f = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            v26.a r5 = new v26.a
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a1.a(kotlinx.coroutines.flow.k, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
