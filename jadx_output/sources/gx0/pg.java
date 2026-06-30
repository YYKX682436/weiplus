package gx0;

/* loaded from: classes5.dex */
public final class pg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f276858e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(gx0.bh bhVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276858e = bhVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.pg(this.f276858e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.pg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (((java.lang.Boolean) r11).booleanValue() == true) goto L17;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f276857d
            gx0.bh r2 = r10.f276858e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 != r4) goto L10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L30
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            kotlin.ResultKt.throwOnFailure(r11)
            kz5.q r11 = r2.L
            java.lang.Object r11 = r11.j()
            jx0.h0 r11 = (jx0.h0) r11
            if (r11 == 0) goto L39
            com.tencent.maas.model.time.MJTime r1 = r2.H
            r10.f276857d = r4
            java.lang.Object r11 = r11.c(r3, r1, r10)
            if (r11 != r0) goto L30
            return r0
        L30:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != r4) goto L39
            goto L3a
        L39:
            r4 = r3
        L3a:
            if (r4 != 0) goto L5b
            gx0.w8 r11 = r2.a7()
            com.tencent.maas.model.time.MJTime r0 = com.tencent.maas.model.time.MJTime.InvalidTime
            java.lang.String r1 = "InvalidTime"
            kotlin.jvm.internal.o.f(r0, r1)
            r11.getClass()
            kotlinx.coroutines.y0 r4 = r11.getMainScope()
            r5 = 0
            r6 = 0
            gx0.j5 r7 = new gx0.j5
            r1 = 0
            r7.<init>(r3, r11, r0, r1)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.l.d(r4, r5, r6, r7, r8, r9)
        L5b:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.pg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
