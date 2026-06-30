package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes14.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f129674d;

    /* renamed from: e, reason: collision with root package name */
    public int f129675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.promotion.t f129676f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.finder.ui.promotion.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129676f = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.promotion.o(this.f129676f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.ui.promotion.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f129675e
            r2 = 0
            java.lang.String r3 = "SimpleUIComponent"
            com.tencent.mm.plugin.finder.ui.promotion.t r4 = r10.f129676f
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L31
            if (r1 == r7) goto L27
            if (r1 == r6) goto L21
            if (r1 != r5) goto L19
            kotlin.ResultKt.throwOnFailure(r11)
            goto Le0
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            java.lang.Object r1 = r10.f129674d
            kotlin.ResultKt.throwOnFailure(r11)
            goto L99
        L27:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.getValue()
            goto L3d
        L31:
            kotlin.ResultKt.throwOnFailure(r11)
            r10.f129675e = r7
            java.lang.Object r11 = com.tencent.mm.plugin.finder.ui.promotion.t.O6(r4, r10)
            if (r11 != r0) goto L3d
            return r0
        L3d:
            r1 = r11
            boolean r11 = kotlin.Result.m528isSuccessimpl(r1)
            if (r11 == 0) goto L99
            r11 = r1
            r45.g61 r11 = (r45.g61) r11
            java.lang.String r8 = r11.getString(r6)
            r4.f129697t = r8
            boolean r8 = r11.getBoolean(r5)
            r4.T6(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "request CgiGetFinderPromotionUser success, data: "
            r8.<init>(r9)
            java.util.LinkedList r7 = r11.getList(r7)
            int r7 = r7.size()
            r8.append(r7)
            java.lang.String r7 = ", lastBuffer: "
            r8.append(r7)
            java.lang.String r7 = r4.f129697t
            r8.append(r7)
            java.lang.String r7 = ", continueFlage: "
            r8.append(r7)
            boolean r7 = r4.f129698u
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.mars.xlog.Log.i(r3, r7)
            java.util.List r7 = com.tencent.mm.plugin.finder.ui.promotion.t.Q6(r4, r11)
            kotlinx.coroutines.p0 r8 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r8 = kotlinx.coroutines.internal.b0.f310484a
            com.tencent.mm.plugin.finder.ui.promotion.l r9 = new com.tencent.mm.plugin.finder.ui.promotion.l
            r9.<init>(r4, r11, r7, r2)
            r10.f129674d = r1
            r10.f129675e = r6
            java.lang.Object r11 = kotlinx.coroutines.l.g(r8, r9, r10)
            if (r11 != r0) goto L99
            return r0
        L99:
            java.lang.Throwable r11 = kotlin.Result.m524exceptionOrNullimpl(r1)
            if (r11 == 0) goto Le0
            boolean r6 = r11 instanceof rm0.j
            if (r6 == 0) goto Lcc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "request CgiGetFinderPromotionUser fail, errType="
            r6.<init>(r7)
            rm0.j r11 = (rm0.j) r11
            int r7 = r11.f397424e
            r6.append(r7)
            java.lang.String r7 = " errCode="
            r6.append(r7)
            int r7 = r11.f397425f
            r6.append(r7)
            java.lang.String r7 = " fail:"
            r6.append(r7)
            java.lang.String r11 = r11.f397426g
            r6.append(r11)
            java.lang.String r11 = r6.toString()
            com.tencent.mars.xlog.Log.e(r3, r11)
        Lcc:
            kotlinx.coroutines.p0 r11 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r11 = kotlinx.coroutines.internal.b0.f310484a
            com.tencent.mm.plugin.finder.ui.promotion.n r3 = new com.tencent.mm.plugin.finder.ui.promotion.n
            r3.<init>(r4, r2)
            r10.f129674d = r1
            r10.f129675e = r5
            java.lang.Object r11 = kotlinx.coroutines.l.g(r11, r3, r10)
            if (r11 != r0) goto Le0
            return r0
        Le0:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.promotion.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
