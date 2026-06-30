package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class c3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f117947d;

    /* renamed from: e, reason: collision with root package name */
    public int f117948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h3 f117949f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(com.tencent.mm.plugin.finder.live.widget.h3 h3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117949f = h3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.c3(this.f117949f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.c3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f117948e
            r2 = 3
            com.tencent.mm.plugin.finder.live.widget.h3 r3 = r9.f117949f
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r0 = r9.f117947d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto Lb9
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r1 = r9.f117947d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L9d
        L2b:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L7e
        L2f:
            kotlin.ResultKt.throwOnFailure(r10)
            r45.dw1 r10 = new r45.dw1
            r10.<init>()
            com.tencent.mm.plugin.finder.live.plugin.l r1 = r3.f118513b
            java.lang.Class<mm2.e1> r7 = mm2.e1.class
            androidx.lifecycle.c1 r1 = r1.P0(r7)
            mm2.e1 r1 = (mm2.e1) r1
            long r7 = r1.f328983m
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r10.set(r4, r1)
            com.tencent.mm.modelbase.l r1 = new com.tencent.mm.modelbase.l
            r1.<init>()
            r7 = 9526(0x2536, float:1.3349E-41)
            r1.f70667d = r7
            java.lang.String r7 = "/cgi-bin/micromsg-bin/finderliveguidefollowadinfo"
            r1.f70666c = r7
            r1.f70664a = r10
            r45.ew1 r10 = new r45.ew1
            r10.<init>()
            r1.f70665b = r10
            com.tencent.mm.modelbase.o r10 = r1.a()
            java.lang.Class<zy2.x5> r1 = zy2.x5.class
            i95.m r1 = i95.n0.c(r1)
            zy2.x5 r1 = (zy2.x5) r1
            pc2.e r1 = (pc2.e) r1
            com.tencent.mm.modelbase.i r1 = r1.wi()
            r1.p(r10)
            r9.f117948e = r5
            java.lang.Object r10 = xg2.g.d(r1, r6, r9, r5, r6)
            if (r10 != r0) goto L7e
            return r0
        L7e:
            r1 = r10
            xg2.h r1 = (xg2.h) r1
            boolean r10 = r1 instanceof xg2.i
            if (r10 == 0) goto L9d
            oz5.l r10 = r1.f454392a
            if (r10 != 0) goto L8d
            oz5.l r10 = r9.getContext()
        L8d:
            com.tencent.mm.plugin.finder.live.widget.b3 r5 = new com.tencent.mm.plugin.finder.live.widget.b3
            r5.<init>(r1, r6, r3)
            r9.f117947d = r1
            r9.f117948e = r4
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r5, r9)
            if (r10 != r0) goto L9d
            return r0
        L9d:
            boolean r10 = r1 instanceof xg2.b
            if (r10 == 0) goto Lb9
            oz5.l r10 = r1.f454392a
            if (r10 != 0) goto La9
            oz5.l r10 = r9.getContext()
        La9:
            com.tencent.mm.plugin.finder.live.widget.a3 r4 = new com.tencent.mm.plugin.finder.live.widget.a3
            r4.<init>(r1, r6, r3)
            r9.f117947d = r1
            r9.f117948e = r2
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r4, r9)
            if (r10 != r0) goto Lb9
            return r0
        Lb9:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.c3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
