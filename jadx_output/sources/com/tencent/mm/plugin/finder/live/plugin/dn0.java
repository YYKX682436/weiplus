package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class dn0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f112308d;

    /* renamed from: e, reason: collision with root package name */
    public int f112309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f112310f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn0(com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112310f = wn0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.dn0(this.f112310f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.dn0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f112309e
            r2 = 0
            r3 = 3
            com.tencent.mm.plugin.finder.live.plugin.wn0 r4 = r9.f112310f
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2f
            if (r1 == r6) goto L2b
            if (r1 == r5) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r9.f112308d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto Laa
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r1 = r9.f112308d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L8e
        L2b:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L6f
        L2f:
            kotlin.ResultKt.throwOnFailure(r10)
            r45.sr1 r10 = new r45.sr1
            r10.<init>()
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            androidx.lifecycle.c1 r1 = r4.P0(r1)
            mm2.c1 r1 = (mm2.c1) r1
            java.lang.String r1 = r1.f328852o
            r10.set(r6, r1)
            java.lang.Class<mm2.e1> r1 = mm2.e1.class
            androidx.lifecycle.c1 r1 = r4.P0(r1)
            mm2.e1 r1 = (mm2.e1) r1
            long r7 = r1.f328983m
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r10.set(r5, r1)
            r45.tr1 r1 = new r45.tr1
            r1.<init>()
            java.lang.String r7 = "/cgi-bin/micromsg-bin/finderlivegetboardevententry"
            r8 = 12465(0x30b1, float:1.7467E-41)
            az2.j r10 = xg2.g.a(r10, r7, r8, r1)
            kotlinx.coroutines.p0 r1 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r1 = kotlinx.coroutines.internal.b0.f310484a
            r9.f112309e = r6
            java.lang.Object r10 = xg2.g.b(r10, r1, r9)
            if (r10 != r0) goto L6f
            return r0
        L6f:
            r1 = r10
            xg2.h r1 = (xg2.h) r1
            boolean r10 = r1 instanceof xg2.i
            if (r10 == 0) goto L8e
            oz5.l r10 = r1.f454392a
            if (r10 != 0) goto L7e
            oz5.l r10 = r9.getContext()
        L7e:
            com.tencent.mm.plugin.finder.live.plugin.cn0 r6 = new com.tencent.mm.plugin.finder.live.plugin.cn0
            r6.<init>(r1, r2, r4)
            r9.f112308d = r1
            r9.f112309e = r5
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r6, r9)
            if (r10 != r0) goto L8e
            return r0
        L8e:
            boolean r10 = r1 instanceof xg2.b
            if (r10 == 0) goto Laa
            oz5.l r10 = r1.f454392a
            if (r10 != 0) goto L9a
            oz5.l r10 = r9.getContext()
        L9a:
            com.tencent.mm.plugin.finder.live.plugin.bn0 r5 = new com.tencent.mm.plugin.finder.live.plugin.bn0
            r5.<init>(r1, r2, r4)
            r9.f112308d = r1
            r9.f112309e = r3
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r5, r9)
            if (r10 != r0) goto Laa
            return r0
        Laa:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.dn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
