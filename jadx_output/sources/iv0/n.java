package iv0;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f295075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iv0.w f295076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(iv0.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295076e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new iv0.n(this.f295076e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((iv0.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f295075d
            r2 = 2
            r3 = 1
            iv0.w r4 = r12.f295076e
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r13)
            goto L47
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L34
        L1e:
            kotlin.ResultKt.throwOnFailure(r13)
            gx0.bf r5 = r4.n7()
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 7
            r11 = 0
            r12.f295075d = r3
            r9 = r12
            java.lang.Object r13 = gx0.bf.d7(r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L34
            return r0
        L34:
            gx0.bf r5 = r4.n7()
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 7
            r11 = 0
            r12.f295075d = r2
            r9 = r12
            java.lang.Object r13 = gx0.bf.d7(r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L47
            return r0
        L47:
            int r13 = r4.A
            int r13 = r13 + (-1)
            r4.A = r13
            if (r13 != 0) goto L5f
            android.view.ViewGroup r13 = iv0.w.l7(r4)
            r0 = 1065353216(0x3f800000, float:1.0)
            r13.setScaleX(r0)
            android.view.ViewGroup r13 = iv0.w.l7(r4)
            r13.setScaleY(r0)
        L5f:
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: iv0.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
