package kotlinx.coroutines.flow;

/* loaded from: classes10.dex */
public final class n implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Iterable f310330d;

    public n(java.lang.Iterable iterable) {
        this.f310330d = iterable;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlinx.coroutines.flow.k r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.m
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.m r0 = (kotlinx.coroutines.flow.m) r0
            int r1 = r0.f310318e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310318e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m r0 = new kotlinx.coroutines.flow.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f310317d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310318e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f310321h
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.f310320g
            kotlinx.coroutines.flow.k r2 = (kotlinx.coroutines.flow.k) r2
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r2
            goto L44
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Iterable r7 = r5.f310330d
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r7 = r6
            r6 = r4
        L44:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r6.next()
            r0.f310320g = r7
            r0.f310321h = r6
            r0.f310318e = r3
            java.lang.Object r2 = r7.emit(r2, r0)
            if (r2 != r1) goto L44
            return r1
        L5b:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.n.a(kotlinx.coroutines.flow.k, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
