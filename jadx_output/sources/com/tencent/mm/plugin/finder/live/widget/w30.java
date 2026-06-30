package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class w30 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f120127d;

    /* renamed from: e, reason: collision with root package name */
    public int f120128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.c40 f120129f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f120130g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(com.tencent.mm.plugin.finder.live.widget.c40 c40Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120129f = c40Var;
        this.f120130g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.w30(this.f120129f, this.f120130g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.w30) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f120128e
            boolean r3 = r0.f120130g
            jz5.f0 r4 = jz5.f0.f302826a
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            com.tencent.mm.plugin.finder.live.widget.c40 r9 = r0.f120129f
            if (r2 == 0) goto L37
            if (r2 == r8) goto L31
            if (r2 == r6) goto L29
            if (r2 != r5) goto L21
            java.lang.Object r1 = r0.f120127d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r20)
            goto Lac
        L21:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L29:
            java.lang.Object r2 = r0.f120127d
            xg2.h r2 = (xg2.h) r2
            kotlin.ResultKt.throwOnFailure(r20)
            goto L90
        L31:
            kotlin.ResultKt.throwOnFailure(r20)
            r2 = r20
            goto L72
        L37:
            kotlin.ResultKt.throwOnFailure(r20)
            dk2.qf r2 = r9.f117956i
            java.lang.Long r10 = r2.f233972f
            java.lang.String r14 = r2.f233971e
            if (r10 == 0) goto Lad
            if (r14 == 0) goto L4d
            int r2 = r14.length()
            if (r2 != 0) goto L4b
            goto L4d
        L4b:
            r2 = 0
            goto L4e
        L4d:
            r2 = r8
        L4e:
            if (r2 == 0) goto L51
            goto Lad
        L51:
            ek2.d1 r2 = new ek2.d1
            long r12 = r10.longValue()
            gm0.m r10 = gm0.j1.b()
            int r10 = r10.h()
            long r10 = (long) r10
            long r17 = r9.z()
            r15 = r10
            r11 = r2
            r11.<init>(r12, r14, r15, r17)
            r0.f120128e = r8
            java.lang.Object r2 = xg2.g.d(r2, r7, r0, r8, r7)
            if (r2 != r1) goto L72
            return r1
        L72:
            xg2.h r2 = (xg2.h) r2
            boolean r8 = r2 instanceof xg2.i
            if (r8 == 0) goto L90
            oz5.l r8 = r2.f454392a
            if (r8 != 0) goto L80
            oz5.l r8 = r19.getContext()
        L80:
            com.tencent.mm.plugin.finder.live.widget.v30 r10 = new com.tencent.mm.plugin.finder.live.widget.v30
            r10.<init>(r2, r7, r9, r3)
            r0.f120127d = r2
            r0.f120128e = r6
            java.lang.Object r6 = kotlinx.coroutines.l.g(r8, r10, r0)
            if (r6 != r1) goto L90
            return r1
        L90:
            boolean r6 = r2 instanceof xg2.b
            if (r6 == 0) goto Lac
            oz5.l r6 = r2.f454392a
            if (r6 != 0) goto L9c
            oz5.l r6 = r19.getContext()
        L9c:
            com.tencent.mm.plugin.finder.live.widget.u30 r8 = new com.tencent.mm.plugin.finder.live.widget.u30
            r8.<init>(r2, r7, r9, r3)
            r0.f120127d = r2
            r0.f120128e = r5
            java.lang.Object r2 = kotlinx.coroutines.l.g(r6, r8, r0)
            if (r2 != r1) goto Lac
            return r1
        Lac:
            return r4
        Lad:
            java.lang.String r1 = r9.A()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "requestMicReplayStatusPoll failed,objectId:"
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r3 = ",micId:"
            r2.append(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.e(r1, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.w30.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
