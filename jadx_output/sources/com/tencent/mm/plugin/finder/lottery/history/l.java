package com.tencent.mm.plugin.finder.lottery.history;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.lottery.history.n f120844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback f120845e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.lottery.history.n nVar, com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback) {
        super(1);
        this.f120844d = nVar;
        this.f120845e = viewCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if ((r1 != null && r1.size() == 0) != false) goto L20;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r13) {
        /*
            r12 = this;
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse r13 = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) r13
            java.lang.String r0 = "resp"
            kotlin.jvm.internal.o.g(r13, r0)
            com.tencent.mm.plugin.finder.lottery.history.n r0 = r12.f120844d
            com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$ViewCallback r1 = r0.f122553f
            r2 = 0
            if (r1 == 0) goto L13
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.a()
            goto L14
        L13:
            r1 = r2
        L14:
            if (r1 != 0) goto L17
            goto L1e
        L17:
            boolean r3 = r13.getHasMore()
            r1.setEnableLoadMore(r3)
        L1e:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = r0.f()
            int r1 = r1.x()
            r3 = 0
            if (r1 != 0) goto L3c
            java.util.List r1 = r13.getIncrementList()
            r4 = 1
            if (r1 == 0) goto L38
            int r1 = r1.size()
            if (r1 != 0) goto L38
            r1 = r4
            goto L39
        L38:
            r1 = r3
        L39:
            if (r1 == 0) goto L3c
            goto L3d
        L3c:
            r4 = r3
        L3d:
            boolean r1 = r13 instanceof com.tencent.mm.plugin.finder.feed.model.l3
            if (r1 == 0) goto L44
            com.tencent.mm.plugin.finder.feed.model.l3 r13 = (com.tencent.mm.plugin.finder.feed.model.l3) r13
            goto L45
        L44:
            r13 = r2
        L45:
            if (r13 == 0) goto L79
            r45.cz1 r6 = r13.f108142a
            if (r6 == 0) goto L79
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = r0.f()
            int r1 = r1.a0()
            if (r1 != 0) goto L6a
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = r0.f()
            so2.c3 r11 = new so2.c3
            java.lang.String r8 = r13.f108144c
            java.lang.String r9 = r13.f108145d
            int r10 = r13.f108146e
            r5 = r11
            r7 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            r5 = 2
            in5.n0.S(r1, r11, r3, r5, r2)
        L6a:
            boolean r1 = r0.f120848h
            boolean r13 = r13.f108143b
            if (r1 == r13) goto L79
            r0.f120848h = r13
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r13 = r0.f()
            r13.notifyDataSetChanged()
        L79:
            if (r4 == 0) goto L85
            com.tencent.mm.plugin.finder.lottery.history.k r13 = new com.tencent.mm.plugin.finder.lottery.history.k
            com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$ViewCallback r0 = r12.f120845e
            r13.<init>(r0)
            pm0.v.X(r13)
        L85:
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.lottery.history.l.invoke(java.lang.Object):java.lang.Object");
    }
}
