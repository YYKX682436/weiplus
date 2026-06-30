package rv0;

/* loaded from: classes5.dex */
public final class n6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(rv0.z6 z6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400150e = z6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.n6(this.f400150e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.n6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f400149d
            r2 = 3
            r3 = 2
            r4 = 1
            rv0.z6 r5 = r13.f400150e
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.ResultKt.throwOnFailure(r14)
            goto L53
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L48
        L21:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L35
        L25:
            kotlin.ResultKt.throwOnFailure(r14)
            gx0.bf r14 = r5.t7()
            r13.f400149d = r4
            java.lang.Object r14 = r14.e7(r13)
            if (r14 != r0) goto L35
            return r0
        L35:
            gx0.bf r6 = r5.t7()
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 7
            r12 = 0
            r13.f400149d = r3
            r10 = r13
            java.lang.Object r14 = gx0.bf.d7(r6, r7, r8, r9, r10, r11, r12)
            if (r14 != r0) goto L48
            return r0
        L48:
            rv0.c7 r14 = rv0.c7.f399961e
            r13.f400149d = r2
            java.lang.Object r14 = rv0.z6.m7(r5, r14, r13)
            if (r14 != r0) goto L53
            return r0
        L53:
            gx0.bf r14 = r5.t7()
            r0 = 0
            com.tencent.maas.model.time.MJTime r0 = r5.r7(r0)
            r14.b7(r0, r4)
            jz5.f0 r14 = jz5.f0.f302826a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.n6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
