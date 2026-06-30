package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class in0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112993d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f112994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f112995f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in0(com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112995f = wn0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.in0 in0Var = new com.tencent.mm.plugin.finder.live.plugin.in0(this.f112995f, continuation);
        in0Var.f112994e = obj;
        return in0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.in0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f112993d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            com.tencent.mm.plugin.finder.live.plugin.wn0 r7 = r0.f112995f
            if (r2 == 0) goto L33
            if (r2 == r5) goto L2d
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r1 = r0.f112994e
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r22)
            goto Lb1
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.Object r2 = r0.f112994e
            xg2.h r2 = (xg2.h) r2
            kotlin.ResultKt.throwOnFailure(r22)
            goto L95
        L2d:
            kotlin.ResultKt.throwOnFailure(r22)
            r2 = r22
            goto L77
        L33:
            kotlin.ResultKt.throwOnFailure(r22)
            java.lang.Object r2 = r0.f112994e
            r8 = r2
            kotlinx.coroutines.y0 r8 = (kotlinx.coroutines.y0) r8
            zl2.r4 r2 = zl2.r4.f473950a
            boolean r2 = r2.w1()
            if (r2 != 0) goto L4f
            r9 = 0
            r10 = 0
            com.tencent.mm.plugin.finder.live.plugin.fn0 r11 = new com.tencent.mm.plugin.finder.live.plugin.fn0
            r11.<init>(r7, r6)
            r12 = 3
            r13 = 0
            kotlinx.coroutines.l.b(r8, r9, r10, r11, r12, r13)
        L4f:
            az2.j r2 = r7.v1()
            android.view.ViewGroup r8 = r7.f365323d
            android.content.Context r15 = r8.getContext()
            java.lang.String r8 = "getContext(...)"
            kotlin.jvm.internal.o.f(r15, r8)
            r16 = 0
            r17 = 0
            r19 = 6
            r20 = 0
            r14 = r2
            az2.j.u(r14, r15, r16, r17, r19, r20)
            kotlinx.coroutines.p0 r8 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r8 = kotlinx.coroutines.internal.b0.f310484a
            r0.f112993d = r5
            java.lang.Object r2 = xg2.g.b(r2, r8, r0)
            if (r2 != r1) goto L77
            return r1
        L77:
            xg2.h r2 = (xg2.h) r2
            boolean r5 = r2 instanceof xg2.i
            if (r5 == 0) goto L95
            oz5.l r5 = r2.f454392a
            if (r5 != 0) goto L85
            oz5.l r5 = r21.getContext()
        L85:
            com.tencent.mm.plugin.finder.live.plugin.hn0 r8 = new com.tencent.mm.plugin.finder.live.plugin.hn0
            r8.<init>(r2, r6, r7)
            r0.f112994e = r2
            r0.f112993d = r4
            java.lang.Object r4 = kotlinx.coroutines.l.g(r5, r8, r0)
            if (r4 != r1) goto L95
            return r1
        L95:
            boolean r4 = r2 instanceof xg2.b
            if (r4 == 0) goto Lb1
            oz5.l r4 = r2.f454392a
            if (r4 != 0) goto La1
            oz5.l r4 = r21.getContext()
        La1:
            com.tencent.mm.plugin.finder.live.plugin.gn0 r5 = new com.tencent.mm.plugin.finder.live.plugin.gn0
            r5.<init>(r2, r6, r7)
            r0.f112994e = r2
            r0.f112993d = r3
            java.lang.Object r2 = kotlinx.coroutines.l.g(r4, r5, r0)
            if (r2 != r1) goto Lb1
            return r1
        Lb1:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.in0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
