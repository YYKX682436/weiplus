package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes.dex */
public final class n4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f121830d;

    /* renamed from: e, reason: collision with root package name */
    public int f121831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f121832f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f121832f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.n4(this.f121832f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.n4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f121831e
            long r2 = r9.f121832f
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L2f
            if (r1 == r7) goto L2b
            if (r1 == r5) goto L23
            if (r1 != r4) goto L1b
            java.lang.Object r0 = r9.f121830d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto Lb4
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r1 = r9.f121830d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L98
        L2b:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L79
        L2f:
            kotlin.ResultKt.throwOnFailure(r10)
            r45.ni2 r10 = new r45.ni2
            r10.<init>()
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r10.set(r5, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r10.set(r4, r1)
            com.tencent.mm.modelbase.l r1 = new com.tencent.mm.modelbase.l
            r1.<init>()
            r8 = 10243(0x2803, float:1.4354E-41)
            r1.f70667d = r8
            java.lang.String r8 = "/cgi-bin/micromsg-bin/findermodrecentwatchlive"
            r1.f70666c = r8
            r1.f70664a = r10
            r45.oi2 r10 = new r45.oi2
            r10.<init>()
            r1.f70665b = r10
            com.tencent.mm.modelbase.o r10 = r1.a()
            java.lang.Class<zy2.x5> r1 = zy2.x5.class
            i95.m r1 = i95.n0.c(r1)
            zy2.x5 r1 = (zy2.x5) r1
            pc2.e r1 = (pc2.e) r1
            com.tencent.mm.modelbase.i r1 = r1.wi()
            r1.p(r10)
            r9.f121831e = r7
            java.lang.Object r10 = xg2.g.d(r1, r6, r9, r7, r6)
            if (r10 != r0) goto L79
            return r0
        L79:
            r1 = r10
            xg2.h r1 = (xg2.h) r1
            boolean r10 = r1 instanceof xg2.i
            if (r10 == 0) goto L98
            oz5.l r10 = r1.f454392a
            if (r10 != 0) goto L88
            oz5.l r10 = r9.getContext()
        L88:
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m4 r7 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m4
            r7.<init>(r1, r6, r2)
            r9.f121830d = r1
            r9.f121831e = r5
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r7, r9)
            if (r10 != r0) goto L98
            return r0
        L98:
            boolean r10 = r1 instanceof xg2.b
            if (r10 == 0) goto Lb4
            oz5.l r10 = r1.f454392a
            if (r10 != 0) goto La4
            oz5.l r10 = r9.getContext()
        La4:
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l4 r5 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l4
            r5.<init>(r1, r6, r2)
            r9.f121830d = r1
            r9.f121831e = r4
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r5, r9)
            if (r10 != r0) goto Lb4
            return r0
        Lb4:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.n4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
