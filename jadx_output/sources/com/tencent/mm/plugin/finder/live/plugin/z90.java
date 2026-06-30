package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class z90 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f115311d;

    /* renamed from: e, reason: collision with root package name */
    public int f115312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f115313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f115314g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z90(com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, cm2.m0 m0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f115313f = ea0Var;
        this.f115314g = m0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.z90(this.f115313f, this.f115314g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.z90) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f115312e
            cm2.m0 r3 = r0.f115314g
            r4 = 2
            com.tencent.mm.plugin.finder.live.plugin.ea0 r5 = r0.f115313f
            r6 = 3
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L35
            if (r2 == r8) goto L2f
            if (r2 == r4) goto L27
            if (r2 != r6) goto L1f
            java.lang.Object r1 = r0.f115311d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r17)
            goto Lae
        L1f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L27:
            java.lang.Object r2 = r0.f115311d
            xg2.h r2 = (xg2.h) r2
            kotlin.ResultKt.throwOnFailure(r17)
            goto L92
        L2f:
            kotlin.ResultKt.throwOnFailure(r17)
            r2 = r17
            goto L74
        L35:
            kotlin.ResultKt.throwOnFailure(r17)
            r45.ld2 r13 = new r45.ld2
            r13.<init>()
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            androidx.lifecycle.c1 r2 = r5.P0(r2)
            mm2.c1 r2 = (mm2.c1) r2
            java.lang.String r2 = r2.f328852o
            r13.set(r6, r2)
            java.lang.String r10 = "/cgi-bin/mmbiz-bin/finderlivegetproductpromotereplaywidget"
            r11 = 18719(0x491f, float:2.6231E-41)
            r45.iu1 r12 = new r45.iu1
            r12.<init>()
            long r14 = r3.f43369w
            r2 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r14)
            r12.set(r2, r9)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r12.set(r8, r2)
            r14 = 0
            ke2.o0 r2 = new ke2.o0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            r0.f115312e = r8
            java.lang.Object r2 = xg2.g.d(r2, r7, r0, r8, r7)
            if (r2 != r1) goto L74
            return r1
        L74:
            xg2.h r2 = (xg2.h) r2
            boolean r8 = r2 instanceof xg2.i
            if (r8 == 0) goto L92
            oz5.l r8 = r2.f454392a
            if (r8 != 0) goto L82
            oz5.l r8 = r16.getContext()
        L82:
            com.tencent.mm.plugin.finder.live.plugin.y90 r9 = new com.tencent.mm.plugin.finder.live.plugin.y90
            r9.<init>(r2, r7, r5, r3)
            r0.f115311d = r2
            r0.f115312e = r4
            java.lang.Object r3 = kotlinx.coroutines.l.g(r8, r9, r0)
            if (r3 != r1) goto L92
            return r1
        L92:
            boolean r3 = r2 instanceof xg2.b
            if (r3 == 0) goto Lae
            oz5.l r3 = r2.f454392a
            if (r3 != 0) goto L9e
            oz5.l r3 = r16.getContext()
        L9e:
            com.tencent.mm.plugin.finder.live.plugin.x90 r4 = new com.tencent.mm.plugin.finder.live.plugin.x90
            r4.<init>(r2, r7, r5)
            r0.f115311d = r2
            r0.f115312e = r6
            java.lang.Object r2 = kotlinx.coroutines.l.g(r3, r4, r0)
            if (r2 != r1) goto Lae
            return r1
        Lae:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.z90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
