package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI f201500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI finderFeedHistoryListUI) {
        super(0);
        this.f201500d = finderFeedHistoryListUI;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r8 = this;
            com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI r0 = r8.f201500d
            zb5.d r0 = r0.f200562d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1e
            com.tencent.mm.ui.chatting.presenter.o1 r0 = (com.tencent.mm.ui.chatting.presenter.o1) r0
            java.util.List r3 = r0.f202391g
            if (r3 != 0) goto Lf
            goto L19
        Lf:
            int r0 = r0.f202392h
            int r3 = r3.size()
            if (r0 >= r3) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 != r1) goto L1e
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 == 0) goto Lad
            com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI r0 = r8.f201500d
            zb5.d r0 = r0.f200562d
            if (r0 == 0) goto Lad
            com.tencent.mm.ui.chatting.presenter.o1 r0 = (com.tencent.mm.ui.chatting.presenter.o1) r0
            java.util.List r3 = r0.f202391g
            if (r3 != 0) goto L2f
            goto Lad
        L2f:
            int r4 = r0.f202392h
            int r5 = r3.size()
            if (r4 < r5) goto L38
            goto Lad
        L38:
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f202398q
            boolean r1 = r4.compareAndSet(r2, r1)
            if (r1 != 0) goto L41
            goto Lad
        L41:
            int r1 = r0.f202392h
            int r4 = r1 + 100
            int r5 = r3.size()
            int r4 = java.lang.Math.min(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r6 = r3.subList(r1, r4)
            r5.<init>(r6)
            r0.f202392h = r4
            java.util.List r6 = r0.f202390f
            if (r6 == 0) goto L5f
            r6.addAll(r5)
        L5f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[loadMore] from:"
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = " to:"
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = ", total:"
            r6.append(r1)
            int r1 = r3.size()
            r6.append(r1)
            java.lang.String r1 = ", delivered:"
            r6.append(r1)
            int r1 = r0.f202392h
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r3 = "Finder.FeedHistoryListPresenter"
            com.tencent.mars.xlog.Log.i(r3, r1)
            ku5.u0 r1 = ku5.t0.f312615d
            com.tencent.mm.ui.chatting.presenter.j1 r3 = new com.tencent.mm.ui.chatting.presenter.j1
            r3.<init>(r0, r5)
            ku5.t0 r1 = (ku5.t0) r1
            r1.B(r3)
            ku5.u0 r1 = ku5.t0.f312615d
            com.tencent.mm.ui.chatting.presenter.k1 r3 = new com.tencent.mm.ui.chatting.presenter.k1
            r3.<init>(r0)
            ku5.t0 r1 = (ku5.t0) r1
            r1.getClass()
            r4 = 500(0x1f4, double:2.47E-321)
            r1.z(r3, r4, r2)
        Lad:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.v0.invoke():java.lang.Object");
    }
}
