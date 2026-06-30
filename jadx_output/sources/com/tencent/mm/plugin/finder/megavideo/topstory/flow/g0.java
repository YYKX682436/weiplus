package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader f120925a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f120926b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f120927c;

    public g0(com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader loader) {
        kotlin.jvm.internal.o.g(loader, "loader");
        this.f120925a = loader;
        this.f120926b = "Finder.MegaVideoFlowLoader_SeeLater";
        this.f120927c = jz5.h.b(com.tencent.mm.plugin.finder.megavideo.topstory.flow.f0.f120924d);
    }

    public final void a(java.util.List list) {
        if (list == null) {
            return;
        }
        if (d().isEmpty()) {
            d().addAll(list);
        } else {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                bo2.c cVar = (bo2.c) it.next();
                java.util.List d17 = d();
                kotlin.jvm.internal.o.f(d17, "<get-seeLaterDetailList>(...)");
                java.util.Iterator it6 = d17.iterator();
                int i17 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i17 = -1;
                        break;
                    } else {
                        if (((bo2.c) it6.next()).getItemId() == cVar.getItemId()) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                if (i17 == -1) {
                    d().add(cVar);
                }
            }
        }
        e(2);
    }

    public final void b(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, ym5.q1 q1Var) {
        int i17;
        kotlin.jvm.internal.o.g(feed, "feed");
        java.util.ArrayList dataList = this.f120925a.getDataList();
        synchronized (dataList) {
            java.util.Iterator it = dataList.iterator();
            int i18 = 0;
            while (true) {
                i17 = -1;
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                } else if (((so2.j5) it.next()) instanceof zn2.c) {
                    break;
                } else {
                    i18++;
                }
            }
            zn2.c cVar = (zn2.c) cu2.u.f222441a.o(feed.getFeedObject(), 11001);
            boolean b17 = vn2.u0.f438387a.b(cVar);
            if (i18 == -1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : dataList) {
                    if (obj instanceof zn2.d) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                if (size <= 0) {
                    java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lqi);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    dataList.add(0, new zn2.d(string));
                    if (q1Var != null) {
                        q1Var.onItemRangeInserted(0, 1);
                    }
                } else {
                    if (size == 1) {
                        java.util.Iterator it6 = dataList.iterator();
                        int i19 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i19 = -1;
                                break;
                            } else if (((so2.j5) it6.next()) instanceof zn2.d) {
                                break;
                            } else {
                                i19++;
                            }
                        }
                        if (i19 == 0) {
                            if (q1Var != null) {
                                q1Var.onItemRangeChanged(0, 1, 101);
                            }
                        }
                    }
                    pm0.v.b0(dataList, com.tencent.mm.plugin.finder.megavideo.topstory.flow.c0.f120907d);
                    java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lqi);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    dataList.add(0, new zn2.d(string2));
                    if (q1Var != null) {
                        q1Var.onItemRangeInserted(0, 1);
                    }
                }
                if (b17) {
                    dataList.add(1, cVar);
                    if (q1Var != null) {
                        q1Var.onItemRangeInserted(1, 1);
                    }
                }
            } else if (b17) {
                this.f120925a.getDataList().set(i18, cVar);
                if (q1Var != null) {
                    q1Var.onItemRangeChanged(i18, 1);
                }
            } else {
                this.f120925a.getDataList().remove(i18);
                if (q1Var != null) {
                    q1Var.onItemRangeRemoved(i18, 1);
                }
            }
            if (q1Var != null) {
                q1Var.onItemRangeChanged(0, 1, 101);
            }
            java.util.List dataListJustForAdapter = this.f120925a.getDataListJustForAdapter();
            synchronized (dataListJustForAdapter) {
                java.util.Iterator it7 = dataListJustForAdapter.iterator();
                int i27 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it7.next();
                    if ((j5Var instanceof zn2.a) && j5Var.getItemId() == feed.getItemId()) {
                        i17 = i27;
                        break;
                    }
                    i27++;
                }
            }
            if (q1Var != null) {
                q1Var.onItemRangeChanged(i17, 1);
            }
        }
    }

    public final java.util.List c() {
        java.util.List d17 = d();
        kotlin.jvm.internal.o.f(d17, "<get-seeLaterDetailList>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(d17, 10));
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            arrayList.add((bo2.c) it.next());
        }
        return arrayList;
    }

    public final java.util.List d() {
        return (java.util.List) ((jz5.n) this.f120927c).getValue();
    }

    public final void e(int i17) {
        boolean isEmpty = d().isEmpty();
        java.lang.String str = this.f120926b;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.i(str, i17 + " printSeeLaterList is empty!");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append(" printSeeLaterList ");
        java.util.List d17 = d();
        kotlin.jvm.internal.o.f(d17, "<get-seeLaterDetailList>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(d17, 10));
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            arrayList.add((bo2.c) it.next());
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(r45.qt2 r24, long r25, kotlin.coroutines.Continuation r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r27
            boolean r2 = r1 instanceof com.tencent.mm.plugin.finder.megavideo.topstory.flow.e0
            if (r2 == 0) goto L17
            r2 = r1
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.e0 r2 = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.e0) r2
            int r3 = r2.f120923g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f120923g = r3
            goto L1c
        L17:
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.e0 r2 = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.e0
            r2.<init>(r0, r1)
        L1c:
            r10 = r2
            java.lang.Object r1 = r10.f120921e
            pz5.a r2 = pz5.a.f359186d
            int r3 = r10.f120923g
            r13 = 1
            if (r3 == 0) goto L38
            if (r3 != r13) goto L30
            java.lang.Object r2 = r10.f120920d
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.g0 r2 = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.g0) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L6d
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.ResultKt.throwOnFailure(r1)
            vn2.k r3 = vn2.l.f438315a
            r15 = 0
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader r1 = r0.f120925a
            com.tencent.mm.protobuf.g r1 = r1.f120896s
            r18 = 24
            r4 = 2
            int r19 = r3.a(r4)
            r20 = 0
            r21 = 32
            r22 = 0
            r14 = r3
            r16 = r24
            r17 = r1
            r45.l03 r5 = vn2.k.d(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r4 = r0.f120926b
            r6 = 0
            r9 = 0
            r11 = 16
            r12 = 0
            r10.f120920d = r0
            r10.f120923g = r13
            r7 = r25
            java.lang.Object r1 = vn2.k.b(r3, r4, r5, r6, r7, r9, r10, r11, r12)
            if (r1 != r2) goto L6c
            return r2
        L6c:
            r2 = r0
        L6d:
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.c r1 = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) r1
            com.tencent.mm.protobuf.g r3 = r1.getLastBuffer()
            if (r3 == 0) goto L7c
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader r4 = r2.f120925a
            java.lang.String r5 = r2.f120926b
            r4.g(r5, r3)
        L7c:
            java.util.List r1 = r1.getIncrementList()
            if (r1 == 0) goto L9e
            java.util.Iterator r1 = r1.iterator()
        L86:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r1.next()
            so2.j5 r3 = (so2.j5) r3
            boolean r4 = r3 instanceof bo2.c
            if (r4 == 0) goto L86
            java.util.List r4 = r2.d()
            r4.add(r3)
            goto L86
        L9e:
            r2.e(r13)
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.megavideo.topstory.flow.g0.f(r45.qt2, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
