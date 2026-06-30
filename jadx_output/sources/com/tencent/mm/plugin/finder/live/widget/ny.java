package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class ny extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget f119218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f119219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f119220f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f119221g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f119222h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f119223i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny(com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget finderLiveVisitorFinderDetailWidget, int i17, r45.xn1 xn1Var, kotlinx.coroutines.y0 y0Var, yz5.l lVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119218d = finderLiveVisitorFinderDetailWidget;
        this.f119219e = i17;
        this.f119220f = xn1Var;
        this.f119221g = y0Var;
        this.f119222h = lVar;
        this.f119223i = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.ny(this.f119218d, this.f119219e, this.f119220f, this.f119221g, this.f119222h, this.f119223i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.ny nyVar = (com.tencent.mm.plugin.finder.live.widget.ny) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nyVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            pz5.a r1 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r21)
            int r1 = com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget.f117698p
            com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget r1 = r0.f119218d
            r1.getClass()
            r1 = 1
            int r2 = r0.f119219e
            if (r2 == r1) goto L37
            r1 = 2
            if (r2 == r1) goto L34
            r1 = 3
            if (r2 == r1) goto L31
            r1 = 5
            if (r2 == r1) goto L2e
            r1 = 7
            if (r2 == r1) goto L2b
            r1 = 10
            if (r2 == r1) goto L37
            r1 = 11
            if (r2 == r1) goto L28
            goto L34
        L28:
            r1 = 19
            goto L39
        L2b:
            r1 = 20
            goto L39
        L2e:
            r1 = 21
            goto L39
        L31:
            r1 = 18
            goto L39
        L34:
            r1 = 16
            goto L39
        L37:
            r1 = 17
        L39:
            r10 = r1
            java.lang.Class<zy2.b6> r1 = zy2.b6.class
            i95.m r1 = i95.n0.c(r1)
            zy2.b6 r1 = (zy2.b6) r1
            r2 = 0
            r45.xn1 r3 = r0.f119220f
            com.tencent.mm.protobuf.f r2 = r3.getCustom(r2)
            com.tencent.mm.protocal.protobuf.FinderContact r2 = (com.tencent.mm.protocal.protobuf.FinderContact) r2
            if (r2 == 0) goto L52
            java.lang.String r2 = r2.getUsername()
            goto L53
        L52:
            r2 = 0
        L53:
            r3 = r2
            r9 = 4
            com.tencent.mm.plugin.finder.live.widget.ky r6 = new com.tencent.mm.plugin.finder.live.widget.ky
            com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget r2 = r0.f119218d
            r45.xn1 r13 = r0.f119220f
            kotlinx.coroutines.y0 r4 = r0.f119221g
            yz5.l r15 = r0.f119222h
            yz5.a r5 = r0.f119223i
            r11 = r6
            r12 = r2
            r14 = r4
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            com.tencent.mm.plugin.finder.live.widget.my r7 = new com.tencent.mm.plugin.finder.live.widget.my
            r7.<init>(r4, r2, r5)
            c61.l7 r1 = (c61.l7) r1
            r1.getClass()
            com.tencent.mm.plugin.finder.assist.k8 r2 = com.tencent.mm.plugin.finder.assist.k8.f102328a
            r4 = 0
            r5 = 0
            r8 = 0
            r11 = 0
            r12 = 288(0x120, float:4.04E-43)
            r13 = 0
            r45.nw6 r16 = com.tencent.mm.plugin.finder.assist.k8.f(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r16 == 0) goto La5
            kotlinx.coroutines.y0 r1 = r0.f119221g
            com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget r15 = r0.f119218d
            yz5.l r2 = r0.f119222h
            yz5.a r3 = r0.f119223i
            kotlinx.coroutines.p0 r4 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r4 = kotlinx.coroutines.internal.b0.f310484a
            r5 = 0
            com.tencent.mm.plugin.finder.live.widget.iy r6 = new com.tencent.mm.plugin.finder.live.widget.iy
            r19 = 0
            r14 = r6
            r17 = r2
            r18 = r3
            r14.<init>(r15, r16, r17, r18, r19)
            r7 = 2
            r8 = 0
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r8
            kotlinx.coroutines.l.d(r1, r2, r3, r4, r5, r6)
        La5:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.ny.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
