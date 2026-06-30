package f40;

/* loaded from: classes12.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f259420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f40.i f259421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h40.f f259422f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(f40.i iVar, h40.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f259421e = iVar;
        this.f259422f = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f40.f(this.f259421e, this.f259422f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f40.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (r15 == r0) goto L15;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r14.f259420d
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            kotlin.ResultKt.throwOnFailure(r15)
            goto L57
        Lf:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L17:
            kotlin.ResultKt.throwOnFailure(r15)
            h40.f r15 = r14.f259422f
            java.lang.String r1 = r15.f278740a
            long r4 = r15.f278741b
            h40.b r9 = r15.f278745f
            i40.a r10 = r15.f278742c
            boolean r11 = r15.f278746g
            boolean r12 = r15.f278747h
            r14.f259420d = r3
            f40.i r6 = r14.f259421e
            r6.getClass()
            pt0.e0 r15 = pt0.f0.f358209b1
            com.tencent.mm.storage.f9 r7 = r15.l(r1, r4)
            if (r7 != 0) goto L38
            goto L53
        L38:
            java.lang.Class<e40.w> r15 = e40.w.class
            i95.m r15 = i95.n0.c(r15)
            java.lang.String r1 = "getService(...)"
            kotlin.jvm.internal.o.f(r15, r1)
            e40.w r15 = (e40.w) r15
            r1 = 2
            r3 = 0
            java.lang.String r8 = e40.w.s6(r15, r7, r3, r1, r3)
            r13 = r14
            java.lang.Object r15 = r6.T6(r7, r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto L53
            goto L54
        L53:
            r15 = r2
        L54:
            if (r15 != r0) goto L57
            return r0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f40.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
