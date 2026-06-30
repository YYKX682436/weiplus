package rv0;

/* loaded from: classes5.dex */
public final class z3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400355e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(rv0.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400355e = n1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.z3(this.f400355e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.z3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f400354d
            r2 = 0
            rv0.n1 r3 = r11.f400355e
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 != r4) goto L10
            kotlin.ResultKt.throwOnFailure(r12)
            goto L43
        L10:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L18:
            kotlin.ResultKt.throwOnFailure(r12)
            du0.v0 r12 = r3.R6()
            pp0.l0 r12 = r12.O6()
            yy0.m7 r12 = (yy0.m7) r12
            kotlinx.coroutines.y0 r5 = r12.Di()
            r6 = 0
            r7 = 0
            yy0.c3 r8 = new yy0.c3
            r1 = 0
            r8.<init>(r12, r1)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.l.d(r5, r6, r7, r8, r9, r10)
            gx0.bf r12 = r3.p7()
            r11.f400354d = r4
            java.lang.Object r12 = gx0.bf.t7(r12, r2, r11, r4, r1)
            if (r12 != r0) goto L43
            return r0
        L43:
            com.tencent.mm.ui.widget.dialog.k0 r12 = new com.tencent.mm.ui.widget.dialog.k0
            android.app.Activity r0 = r3.getContext()
            r12.<init>(r0, r4, r2)
            ex0.a0 r0 = r3.s7()
            java.lang.String r1 = "fromSeconds(...)"
            if (r0 == 0) goto L65
            r5 = 4613937818241073152(0x4008000000000000, double:3.0)
            com.tencent.maas.model.time.MJTime r5 = com.tencent.maas.model.time.MJTime.fromSeconds(r5)
            kotlin.jvm.internal.o.f(r5, r1)
            boolean r0 = r0.e(r5)
            if (r0 != r4) goto L65
            r0 = r4
            goto L66
        L65:
            r0 = r2
        L66:
            ex0.a0 r5 = r3.s7()
            if (r5 == 0) goto L7c
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.tencent.maas.model.time.MJTime r6 = com.tencent.maas.model.time.MJTime.fromSeconds(r6)
            kotlin.jvm.internal.o.f(r6, r1)
            boolean r1 = r5.e(r6)
            if (r1 != r4) goto L7c
            r2 = r4
        L7c:
            rv0.x3 r1 = new rv0.x3
            r1.<init>(r2, r0)
            r12.f211872n = r1
            rv0.y3 r0 = new rv0.y3
            r0.<init>(r3)
            r12.f211881s = r0
            r12.v()
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
