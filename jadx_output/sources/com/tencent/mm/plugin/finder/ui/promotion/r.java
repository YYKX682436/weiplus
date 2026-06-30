package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes14.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f129680d;

    /* renamed from: e, reason: collision with root package name */
    public int f129681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.promotion.t f129682f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.ui.promotion.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129682f = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.promotion.r(this.f129682f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.ui.promotion.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x009a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f129681e
            java.lang.String r2 = "SimpleUIComponent"
            com.tencent.mm.plugin.finder.ui.promotion.t r3 = r8.f129682f
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            java.lang.Object r0 = r8.f129680d
            kotlin.ResultKt.throwOnFailure(r9)
            goto L93
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.getValue()
            goto L35
        L29:
            kotlin.ResultKt.throwOnFailure(r9)
            r8.f129681e = r5
            java.lang.Object r9 = com.tencent.mm.plugin.finder.ui.promotion.t.O6(r3, r8)
            if (r9 != r0) goto L35
            return r0
        L35:
            boolean r1 = kotlin.Result.m528isSuccessimpl(r9)
            if (r1 == 0) goto L94
            r1 = r9
            r45.g61 r1 = (r45.g61) r1
            java.lang.String r6 = r1.getString(r4)
            r3.f129697t = r6
            r6 = 3
            boolean r6 = r1.getBoolean(r6)
            r3.T6(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "request CgiGetFinderPromotionUser success, data: "
            r6.<init>(r7)
            java.util.LinkedList r5 = r1.getList(r5)
            int r5 = r5.size()
            r6.append(r5)
            java.lang.String r5 = ", lastBuffer: "
            r6.append(r5)
            java.lang.String r5 = r3.f129697t
            r6.append(r5)
            java.lang.String r5 = ", continueFlage: "
            r6.append(r5)
            boolean r5 = r3.f129698u
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.mars.xlog.Log.i(r2, r5)
            java.util.List r1 = com.tencent.mm.plugin.finder.ui.promotion.t.Q6(r3, r1)
            kotlinx.coroutines.p0 r5 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r5 = kotlinx.coroutines.internal.b0.f310484a
            com.tencent.mm.plugin.finder.ui.promotion.q r6 = new com.tencent.mm.plugin.finder.ui.promotion.q
            r7 = 0
            r6.<init>(r3, r1, r7)
            r8.f129680d = r9
            r8.f129681e = r4
            java.lang.Object r1 = kotlinx.coroutines.l.g(r5, r6, r8)
            if (r1 != r0) goto L92
            return r0
        L92:
            r0 = r9
        L93:
            r9 = r0
        L94:
            java.lang.Throwable r9 = kotlin.Result.m524exceptionOrNullimpl(r9)
            if (r9 == 0) goto Lca
            r0 = 0
            r3.f129700w = r0
            boolean r0 = r9 instanceof rm0.j
            if (r0 == 0) goto Lca
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "request CgiGetFinderPromotionUser fail, errType="
            r0.<init>(r1)
            rm0.j r9 = (rm0.j) r9
            int r1 = r9.f397424e
            r0.append(r1)
            java.lang.String r1 = " errCode="
            r0.append(r1)
            int r1 = r9.f397425f
            r0.append(r1)
            java.lang.String r1 = " fail:"
            r0.append(r1)
            java.lang.String r9 = r9.f397426g
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.tencent.mars.xlog.Log.e(r2, r9)
        Lca:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.promotion.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
