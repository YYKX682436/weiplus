package p1;

/* loaded from: classes11.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f350849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f350850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1.o0 f350851f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(long j17, p1.o0 o0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f350850e = j17;
        this.f350851f = o0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new p1.m0(this.f350850e, this.f350851f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((p1.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f350849d
            r2 = 1
            long r4 = r10.f350850e
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L20
            if (r1 == r7) goto L1c
            if (r1 != r6) goto L14
            kotlin.ResultKt.throwOnFailure(r11)
            goto L37
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L2e
        L20:
            kotlin.ResultKt.throwOnFailure(r11)
            long r8 = r4 - r2
            r10.f350849d = r7
            java.lang.Object r11 = kotlinx.coroutines.k1.b(r8, r10)
            if (r11 != r0) goto L2e
            return r0
        L2e:
            r10.f350849d = r6
            java.lang.Object r11 = kotlinx.coroutines.k1.b(r2, r10)
            if (r11 != r0) goto L37
            return r0
        L37:
            p1.o0 r11 = r10.f350851f
            kotlinx.coroutines.q r11 = r11.f350861f
            if (r11 == 0) goto L4f
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            p1.o r0 = new p1.o
            r0.<init>(r4)
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m521constructorimpl(r0)
            r11.resumeWith(r0)
        L4f:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
