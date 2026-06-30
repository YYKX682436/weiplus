package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f120655d;

    /* renamed from: e, reason: collision with root package name */
    public int f120656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.view.x f120657f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView f120658g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qs5.s f120659h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.finder.live.wish.view.x xVar, com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView, qs5.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120657f = xVar;
        this.f120658g = maxHeightWxRecyclerView;
        this.f120659h = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.wish.view.u(this.f120657f, this.f120658g, this.f120659h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.wish.view.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f120656e
            com.tencent.mm.plugin.finder.live.wish.view.x r2 = r12.f120657f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            java.lang.Object r0 = r12.f120655d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto Ld0
        L1a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L22:
            java.lang.Object r1 = r12.f120655d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto Lb3
        L2b:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L8b
        L2f:
            kotlin.ResultKt.throwOnFailure(r13)
            r2.getClass()
            r45.us1 r13 = new r45.us1
            r13.<init>()
            com.tencent.mm.plugin.finder.live.view.k0 r1 = dk2.ef.f233380e
            if (r1 == 0) goto L4c
            java.lang.Class<mm2.c1> r6 = mm2.c1.class
            androidx.lifecycle.c1 r1 = r1.business(r6)
            mm2.c1 r1 = (mm2.c1) r1
            if (r1 == 0) goto L4c
            java.lang.String r1 = r1.f328852o
            if (r1 != 0) goto L4e
        L4c:
            java.lang.String r1 = ""
        L4e:
            r13.set(r5, r1)
            com.tencent.mm.modelbase.l r1 = new com.tencent.mm.modelbase.l
            r1.<init>()
            r6 = 8687(0x21ef, float:1.2173E-41)
            r1.f70667d = r6
            java.lang.String r6 = "/cgi-bin/micromsg-bin/finderlivegetgiftwallinfo"
            r1.f70666c = r6
            r1.f70664a = r13
            r45.vs1 r13 = new r45.vs1
            r13.<init>()
            r1.f70665b = r13
            com.tencent.mm.modelbase.o r13 = r1.a()
            java.lang.Class<zy2.x5> r1 = zy2.x5.class
            i95.m r1 = i95.n0.c(r1)
            zy2.x5 r1 = (zy2.x5) r1
            pc2.e r1 = (pc2.e) r1
            com.tencent.mm.modelbase.i r1 = r1.wi()
            r1.p(r13)
            az2.j r1 = (az2.j) r1
            kotlinx.coroutines.p0 r13 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r13 = kotlinx.coroutines.internal.b0.f310484a
            r12.f120656e = r5
            java.lang.Object r13 = xg2.g.b(r1, r13, r12)
            if (r13 != r0) goto L8b
            return r0
        L8b:
            r1 = r13
            xg2.h r1 = (xg2.h) r1
            com.tencent.mm.plugin.finder.live.wish.view.x r8 = r12.f120657f
            com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView r9 = r12.f120658g
            qs5.s r10 = r12.f120659h
            boolean r13 = r1 instanceof xg2.i
            if (r13 == 0) goto Lb3
            oz5.l r13 = r1.f454392a
            if (r13 != 0) goto La0
            oz5.l r13 = r12.getContext()
        La0:
            com.tencent.mm.plugin.finder.live.wish.view.t r11 = new com.tencent.mm.plugin.finder.live.wish.view.t
            r7 = 0
            r5 = r11
            r6 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            r12.f120655d = r1
            r12.f120656e = r4
            java.lang.Object r13 = kotlinx.coroutines.l.g(r13, r11, r12)
            if (r13 != r0) goto Lb3
            return r0
        Lb3:
            boolean r13 = r1 instanceof xg2.b
            if (r13 == 0) goto Ld0
            oz5.l r13 = r1.f454392a
            if (r13 != 0) goto Lbf
            oz5.l r13 = r12.getContext()
        Lbf:
            com.tencent.mm.plugin.finder.live.wish.view.s r4 = new com.tencent.mm.plugin.finder.live.wish.view.s
            r5 = 0
            r4.<init>(r1, r5, r2)
            r12.f120655d = r1
            r12.f120656e = r3
            java.lang.Object r13 = kotlinx.coroutines.l.g(r13, r4, r12)
            if (r13 != r0) goto Ld0
            return r0
        Ld0:
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.wish.view.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
