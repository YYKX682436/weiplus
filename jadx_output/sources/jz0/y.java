package jz0;

/* loaded from: classes5.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f302630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC f302631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f302631e = maasFakeVideoPlayUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jz0.y(this.f302631e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jz0.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r13 == r0) goto L24;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f302630d
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 1
            com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC r4 = r12.f302631e
            if (r1 == 0) goto L19
            if (r1 != r3) goto L11
            kotlin.ResultKt.throwOnFailure(r13)
            goto L63
        L11:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L19:
            kotlin.ResultKt.throwOnFailure(r13)
            az0.a0 r13 = r4.f69819e
            if (r13 == 0) goto L63
            r12.f302630d = r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "awaitStopPlay: active:"
            r1.<init>(r5)
            kotlinx.coroutines.r2 r5 = r13.f15314f
            r6 = 0
            if (r5 == 0) goto L39
            kotlinx.coroutines.a r5 = (kotlinx.coroutines.a) r5
            boolean r5 = r5.a()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L3a
        L39:
            r5 = r6
        L3a:
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = r13.f15311c
            com.tencent.mars.xlog.Log.i(r5, r1)
            kotlinx.coroutines.r2 r13 = r13.f15314f
            if (r13 == 0) goto L5f
            r1 = r13
            kotlinx.coroutines.a r1 = (kotlinx.coroutines.a) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L54
            r6 = r13
        L54:
            if (r6 == 0) goto L5f
            kotlinx.coroutines.c3 r6 = (kotlinx.coroutines.c3) r6
            java.lang.Object r13 = r6.C(r12)
            if (r13 != r0) goto L5f
            goto L60
        L5f:
            r13 = r2
        L60:
            if (r13 != r0) goto L63
            return r0
        L63:
            com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC r5 = r12.f302631e
            com.tencent.maas.model.time.MJTime r6 = r5.f69828q
            java.lang.String r13 = "access$getCurPlayTime$p(...)"
            kotlin.jvm.internal.o.f(r6, r13)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 14
            r11 = 0
            com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.Q6(r5, r6, r7, r8, r9, r10, r11)
            boolean r13 = r4.f69826o
            if (r13 != 0) goto L7e
            boolean r13 = r4.U6()
            goto L7f
        L7e:
            r13 = 0
        L7f:
            java.lang.String r0 = r4.f69818d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "fake video preview gainFocus:"
            r1.<init>(r5)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            r13 = r13 ^ r3
            com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.P6(r4, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jz0.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
