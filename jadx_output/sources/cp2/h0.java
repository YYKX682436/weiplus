package cp2;

/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f220814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1 f220815e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(cp2.v0 v0Var, com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1 nearbyLivePresenter$createFeedLoader$1) {
        super(1);
        this.f220814d = v0Var;
        this.f220815e = nearbyLivePresenter$createFeedLoader$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (((r0 == null || (r0 = r0.getList(6)) == null || r0.size() != 0) ? false : true) != false) goto L22;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse r14 = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) r14
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.g(r14, r0)
            int r0 = r14.getPullType()
            r1 = 0
            cp2.v0 r2 = r13.f220814d
            r3 = 1
            if (r0 != r3) goto L8f
            r45.dd2 r0 = r2.f220934n
            r4 = 6
            if (r0 == 0) goto L24
            java.util.LinkedList r0 = r0.getList(r4)
            if (r0 == 0) goto L24
            int r0 = r0.size()
            if (r0 != r3) goto L24
            r0 = r3
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 != 0) goto L3c
            r45.dd2 r0 = r2.f220934n
            if (r0 == 0) goto L39
            java.util.LinkedList r0 = r0.getList(r4)
            if (r0 == 0) goto L39
            int r0 = r0.size()
            if (r0 != 0) goto L39
            r0 = r3
            goto L3a
        L39:
            r0 = r1
        L3a:
            if (r0 == 0) goto L8f
        L3c:
            r45.dd2 r0 = r2.f220934n
            if (r0 == 0) goto L4d
            java.util.LinkedList r0 = r0.getList(r4)
            if (r0 == 0) goto L4d
            java.lang.Object r0 = kz5.n0.Z(r0)
            r45.dd2 r0 = (r45.dd2) r0
            goto L4e
        L4d:
            r0 = 0
        L4e:
            pf5.u r4 = pf5.u.f353936a
            java.lang.Class<c61.l7> r5 = c61.l7.class
            pf5.v r4 = r4.e(r5)
            java.lang.Class<ey2.c3> r5 = ey2.c3.class
            androidx.lifecycle.c1 r4 = r4.a(r5)
            java.lang.String r5 = "get(...)"
            kotlin.jvm.internal.o.f(r4, r5)
            ey2.c3 r4 = (ey2.c3) r4
            r45.dd2 r5 = r2.f220934n
            java.lang.String r0 = r4.N6(r5, r0)
            if (r0 == 0) goto L8f
            java.util.List r5 = r14.getIncrementList()
            if (r5 == 0) goto L8f
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r3
            if (r6 == 0) goto L8f
            java.util.HashMap r4 = r4.f257336h
            ey2.a3 r12 = new ey2.a3
            r7 = 0
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 1
            r11 = 0
            r6 = r12
            r6.<init>(r7, r8, r10, r11)
            java.util.ArrayList r6 = r12.f257321a
            r6.addAll(r5)
            r4.put(r0, r12)
        L8f:
            int r0 = r14.getPullType()
            if (r0 == 0) goto L9b
            int r0 = r14.getPullType()
            if (r0 != r3) goto Lc2
        L9b:
            androidx.fragment.app.Fragment r0 = r2.f220933m
            boolean r2 = r0 instanceof com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
            if (r2 == 0) goto Lad
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment"
            kotlin.jvm.internal.o.e(r0, r2)
            com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment r0 = (com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment) r0
            java.lang.String r0 = r0.s0()
            goto Laf
        Lad:
            java.lang.String r0 = ""
        Laf:
            com.tencent.mm.plugin.finder.extension.reddot.ga r2 = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a
            com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1 r4 = r13.f220815e
            r45.qt2 r4 = r4.getContextObj()
            int r14 = r14.getPullType()
            if (r14 != 0) goto Lbe
            r1 = r3
        Lbe:
            r14 = 2
            r2.n(r14, r4, r1, r0)
        Lc2:
            jz5.f0 r14 = jz5.f0.f302826a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: cp2.h0.invoke(java.lang.Object):java.lang.Object");
    }
}
