package rv0;

/* loaded from: classes5.dex */
public final class m6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f400119d;

    /* renamed from: e, reason: collision with root package name */
    public int f400120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f400122g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(rv0.z6 z6Var, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400121f = z6Var;
        this.f400122g = mJTime;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.m6(this.f400121f, this.f400122g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.m6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x008b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f400120e
            r2 = 0
            r3 = 2
            r4 = 1
            rv0.z6 r5 = r13.f400121f
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.throwOnFailure(r14)
            goto L85
        L14:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1c:
            java.lang.Object r1 = r13.f400119d
            com.tencent.maas.model.time.MJTime r1 = (com.tencent.maas.model.time.MJTime) r1
            kotlin.ResultKt.throwOnFailure(r14)
        L23:
            r8 = r1
            goto L6e
        L25:
            kotlin.ResultKt.throwOnFailure(r14)
            ex0.a0 r14 = r5.v7()
            if (r14 == 0) goto L40
            ex0.r r14 = r14.n()
            if (r14 == 0) goto L40
            com.tencent.maas.model.time.MJTime r14 = r14.k()
            com.tencent.maas.model.time.MJTime r1 = r13.f400122g
            com.tencent.maas.model.time.MJTime r14 = r14.add(r1)
            if (r14 != 0) goto L42
        L40:
            com.tencent.maas.model.time.MJTime r14 = com.tencent.maas.model.time.MJTime.InvalidTime
        L42:
            r1 = r14
            jz5.g r14 = r5.f400358n
            r6 = r14
            jz5.n r6 = (jz5.n) r6
            java.lang.Object r6 = r6.getValue()
            rv0.n1 r6 = (rv0.n1) r6
            kotlin.jvm.internal.o.d(r1)
            r6.z7(r1)
            jz5.n r14 = (jz5.n) r14
            java.lang.Object r14 = r14.getValue()
            rv0.n1 r14 = (rv0.n1) r14
            r14.x7()
            gx0.bf r14 = r5.t7()
            r13.f400119d = r1
            r13.f400120e = r4
            java.lang.Object r14 = r14.e7(r13)
            if (r14 != r0) goto L23
            return r0
        L6e:
            gx0.bf r6 = r5.t7()
            r7 = 0
            kotlin.jvm.internal.o.d(r8)
            r9 = 0
            r11 = 5
            r12 = 0
            r13.f400119d = r2
            r13.f400120e = r3
            r10 = r13
            java.lang.Object r14 = gx0.bf.d7(r6, r7, r8, r9, r10, r11, r12)
            if (r14 != r0) goto L85
            return r0
        L85:
            ex0.a0 r14 = r5.v7()
            if (r14 == 0) goto L99
            cx0.d r0 = cx0.d.f224510f
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            java.lang.String r1 = "of(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r14.J(r0, r2)
        L99:
            gx0.bf r14 = r5.t7()
            r14.getClass()
            com.tencent.maas.model.time.MJTimeRange r0 = com.tencent.maas.model.time.MJTimeRange.PositiveInfiniteTimeRange
            java.lang.String r1 = "PositiveInfiniteTimeRange"
            kotlin.jvm.internal.o.f(r0, r1)
            r14.o7(r0, r4)
            jz5.f0 r14 = jz5.f0.f302826a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.m6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
