package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f175791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.b1 f175792e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.vlog.model.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f175792e = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.vlog.model.y0(this.f175792e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.vlog.model.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r4.f175791d
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.ResultKt.throwOnFailure(r5)
            goto L4e
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            kotlin.ResultKt.throwOnFailure(r5)
            r4.f175791d = r2
            com.tencent.mm.plugin.vlog.model.b1 r5 = r4.f175792e
            boolean r1 = r5 instanceof com.tencent.mm.plugin.vlog.model.q1
            if (r1 == 0) goto L34
            com.tencent.mm.plugin.vlog.model.i1 r1 = new com.tencent.mm.plugin.vlog.model.i1
            r2 = r5
            com.tencent.mm.plugin.vlog.model.q1 r2 = (com.tencent.mm.plugin.vlog.model.q1) r2
            java.lang.String r2 = r2.f175714e
            int r5 = r5.f175570c
            r3 = 2
            r1.<init>(r2, r3, r5)
            rm5.j r5 = r1.f175627l
            r5.a()
        L32:
            r5 = r1
            goto L4b
        L34:
            boolean r1 = r5 instanceof com.tencent.mm.plugin.vlog.model.o0
            if (r1 == 0) goto L4a
            com.tencent.mm.plugin.vlog.model.i1 r1 = new com.tencent.mm.plugin.vlog.model.i1
            r3 = r5
            com.tencent.mm.plugin.vlog.model.o0 r3 = (com.tencent.mm.plugin.vlog.model.o0) r3
            java.lang.String r3 = r3.f175700e
            int r5 = r5.f175570c
            r1.<init>(r3, r2, r5)
            rm5.j r5 = r1.f175627l
            r5.a()
            goto L32
        L4a:
            r5 = 0
        L4b:
            if (r5 != r0) goto L4e
            return r0
        L4e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.model.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
