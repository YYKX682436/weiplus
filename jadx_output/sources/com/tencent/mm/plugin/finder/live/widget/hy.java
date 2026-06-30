package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class hy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f118603d;

    /* renamed from: e, reason: collision with root package name */
    public int f118604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f118605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f118606g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget f118607h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(r45.xn1 xn1Var, long j17, com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget finderLiveVisitorActiveDetailWidget, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118605f = xn1Var;
        this.f118606g = j17;
        this.f118607h = finderLiveVisitorActiveDetailWidget;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.hy(this.f118605f, this.f118606g, this.f118607h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.hy) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f118604e
            r2 = 0
            com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget r3 = r10.f118607h
            r4 = 1
            r45.xn1 r5 = r10.f118605f
            r6 = 3
            r7 = 2
            if (r1 == 0) goto L31
            if (r1 == r4) goto L2d
            if (r1 == r7) goto L25
            if (r1 != r6) goto L1d
            java.lang.Object r0 = r10.f118603d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lb8
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            java.lang.Object r1 = r10.f118603d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r11)
            goto L9c
        L2d:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L7d
        L31:
            kotlin.ResultKt.throwOnFailure(r11)
            r45.s41 r11 = new r45.s41
            r11.<init>()
            r11.set(r7, r5)
            long r8 = r10.f118606g
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r11.set(r6, r1)
            com.tencent.mm.modelbase.l r1 = new com.tencent.mm.modelbase.l
            r1.<init>()
            r8 = 9052(0x235c, float:1.2685E-41)
            r1.f70667d = r8
            java.lang.String r8 = "/cgi-bin/micromsg-bin/findergetaudienceliveinfo"
            r1.f70666c = r8
            r1.f70664a = r11
            r45.t41 r11 = new r45.t41
            r11.<init>()
            r1.f70665b = r11
            com.tencent.mm.modelbase.o r11 = r1.a()
            java.lang.Class<zy2.x5> r1 = zy2.x5.class
            i95.m r1 = i95.n0.c(r1)
            zy2.x5 r1 = (zy2.x5) r1
            pc2.e r1 = (pc2.e) r1
            com.tencent.mm.modelbase.i r1 = r1.wi()
            r1.p(r11)
            kotlinx.coroutines.p0 r11 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r11 = kotlinx.coroutines.internal.b0.f310484a
            r10.f118604e = r4
            java.lang.Object r11 = xg2.g.b(r1, r11, r10)
            if (r11 != r0) goto L7d
            return r0
        L7d:
            r1 = r11
            xg2.h r1 = (xg2.h) r1
            boolean r11 = r1 instanceof xg2.i
            if (r11 == 0) goto L9c
            oz5.l r11 = r1.f454392a
            if (r11 != 0) goto L8c
            oz5.l r11 = r10.getContext()
        L8c:
            com.tencent.mm.plugin.finder.live.widget.gy r4 = new com.tencent.mm.plugin.finder.live.widget.gy
            r4.<init>(r1, r2, r3, r5)
            r10.f118603d = r1
            r10.f118604e = r7
            java.lang.Object r11 = kotlinx.coroutines.l.g(r11, r4, r10)
            if (r11 != r0) goto L9c
            return r0
        L9c:
            boolean r11 = r1 instanceof xg2.b
            if (r11 == 0) goto Lb8
            oz5.l r11 = r1.f454392a
            if (r11 != 0) goto La8
            oz5.l r11 = r10.getContext()
        La8:
            com.tencent.mm.plugin.finder.live.widget.fy r4 = new com.tencent.mm.plugin.finder.live.widget.fy
            r4.<init>(r1, r2, r3, r5)
            r10.f118603d = r1
            r10.f118604e = r6
            java.lang.Object r11 = kotlinx.coroutines.l.g(r11, r4, r10)
            if (r11 != r0) goto Lb8
            return r0
        Lb8:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.hy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
