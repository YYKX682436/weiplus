package g4;

/* loaded from: classes5.dex */
public final class s3 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f268553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.t3 f268554e;

    public s3(kotlinx.coroutines.flow.k kVar, g4.t3 t3Var) {
        this.f268553d = kVar;
        this.f268554e = t3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof g4.r3
            if (r0 == 0) goto L13
            r0 = r7
            g4.r3 r0 = (g4.r3) r0
            int r1 = r0.f268537e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268537e = r1
            goto L18
        L13:
            g4.r3 r0 = new g4.r3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f268536d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f268537e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f268538f
            kotlinx.coroutines.flow.k r6 = (kotlinx.coroutines.flow.k) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L51
        L3a:
            kotlin.ResultKt.throwOnFailure(r7)
            g4.l1 r6 = (g4.l1) r6
            g4.t3 r7 = r5.f268554e
            yz5.p r7 = r7.f268570e
            kotlinx.coroutines.flow.k r2 = r5.f268553d
            r0.f268538f = r2
            r0.f268537e = r4
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r6 = r2
        L51:
            r2 = 0
            r0.f268538f = r2
            r0.f268537e = r3
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L5d
            return r1
        L5d:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.s3.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
