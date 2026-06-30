package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class p4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f135507d;

    /* renamed from: e, reason: collision with root package name */
    public int f135508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.hz0 f135510g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.hz0 f135511h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f135512i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f135513m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.q4 f135514n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(java.lang.String str, r45.hz0 hz0Var, r45.hz0 hz0Var2, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135509f = str;
        this.f135510g = hz0Var;
        this.f135511h = hz0Var2;
        this.f135512i = f0Var;
        this.f135513m = f0Var2;
        this.f135514n = q4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.p4(this.f135509f, this.f135510g, this.f135511h, this.f135512i, this.f135513m, this.f135514n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.p4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f135508e
            r2 = 0
            com.tencent.mm.plugin.finder.viewmodel.component.q4 r3 = r10.f135514n
            r4 = 2
            r5 = 3
            r6 = 1
            if (r1 == 0) goto L30
            if (r1 == r6) goto L26
            if (r1 == r4) goto L1f
            if (r1 != r5) goto L17
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lce
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            java.lang.Object r1 = r10.f135507d
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lb0
        L26:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.getValue()
            goto L92
        L30:
            kotlin.ResultKt.throwOnFailure(r11)
            g92.b r11 = g92.b.f269769e
            m92.a r1 = new m92.a
            com.tencent.mm.plugin.finder.ui.a3 r7 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.H1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "FinderCreateUser_"
            r7.<init>(r8)
            long r8 = java.lang.System.nanoTime()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r1.<init>(r7)
            java.lang.String r7 = com.tencent.mm.plugin.finder.viewmodel.component.q4.f135657h
            java.lang.String r8 = "<set-?>"
            kotlin.jvm.internal.o.g(r7, r8)
            r1.f324968b = r7
            java.lang.String r7 = ""
            r1.f324969c = r7
            java.lang.String r7 = r10.f135509f
            kotlin.jvm.internal.o.g(r7, r8)
            r1.f324970d = r7
            r45.hz0 r7 = r10.f135510g
            r1.f324971e = r7
            r45.hz0 r7 = r10.f135511h
            r1.f324972f = r7
            kotlin.jvm.internal.f0 r7 = r10.f135512i
            int r7 = r7.f310116d
            r1.f324973g = r7
            kotlin.jvm.internal.f0 r7 = r10.f135513m
            int r7 = r7.f310116d
            r1.f324974h = r7
            r1.f324975i = r6
            r7 = 0
            r1.f324976j = r7
            r45.fa0 r8 = new r45.fa0
            r8.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r8.set(r7, r9)
            r1.f324977k = r8
            r10.f135508e = r6
            java.lang.Object r11 = r11.D4(r1, r10)
            if (r11 != r0) goto L92
            return r0
        L92:
            r1 = r11
            boolean r11 = kotlin.Result.m528isSuccessimpl(r1)
            if (r11 == 0) goto Lb0
            r11 = r1
            r45.r01 r11 = (r45.r01) r11
            kotlinx.coroutines.p0 r6 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r6 = kotlinx.coroutines.internal.b0.f310484a
            com.tencent.mm.plugin.finder.viewmodel.component.n4 r7 = new com.tencent.mm.plugin.finder.viewmodel.component.n4
            r7.<init>(r11, r3, r2)
            r10.f135507d = r1
            r10.f135508e = r4
            java.lang.Object r11 = kotlinx.coroutines.l.g(r6, r7, r10)
            if (r11 != r0) goto Lb0
            return r0
        Lb0:
            java.lang.Throwable r11 = kotlin.Result.m524exceptionOrNullimpl(r1)
            if (r11 == 0) goto Lce
            boolean r4 = r11 instanceof rm0.j
            if (r4 == 0) goto Lce
            kotlinx.coroutines.p0 r4 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r4 = kotlinx.coroutines.internal.b0.f310484a
            com.tencent.mm.plugin.finder.viewmodel.component.o4 r6 = new com.tencent.mm.plugin.finder.viewmodel.component.o4
            r6.<init>(r3, r11, r2)
            r10.f135507d = r1
            r10.f135508e = r5
            java.lang.Object r11 = kotlinx.coroutines.l.g(r4, r6, r10)
            if (r11 != r0) goto Lce
            return r0
        Lce:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.p4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
