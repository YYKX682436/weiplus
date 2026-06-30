package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract;", "", "<init>", "()V", "PurchaseListPresenter", "PurchaseListViewCallback", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLivePurchaseListContract {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract f122732a = new com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract();

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract$PurchaseListPresenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract$PurchaseListViewCallback;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class PurchaseListPresenter implements fs2.a {

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f122733d;

        /* renamed from: e, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback f122734e;

        /* renamed from: f, reason: collision with root package name */
        public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f122735f;

        /* renamed from: g, reason: collision with root package name */
        public int f122736g;

        public PurchaseListPresenter(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader loader) {
            kotlin.jvm.internal.o.g(loader, "loader");
            this.f122733d = loader;
            this.f122736g = 1;
        }

        public static final void c(com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter purchaseListPresenter) {
            if (purchaseListPresenter.f().x() == 0 && purchaseListPresenter.f122733d.getDataListJustForAdapter().size() == 0) {
                com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback g17 = purchaseListPresenter.g();
                g17.a(false);
                g17.f122754g.setVisibility(0);
            }
        }

        public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter f() {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f122735f;
            if (wxRecyclerAdapter != null) {
                return wxRecyclerAdapter;
            }
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }

        public final com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback g() {
            com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback = this.f122734e;
            if (purchaseListViewCallback != null) {
                return purchaseListViewCallback;
            }
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }

        public void h(final com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback callback) {
            kotlin.jvm.internal.o.g(callback, "callback");
            this.f122734e = callback;
            in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return type == so2.g2.class.hashCode() ? new com.tencent.mm.plugin.finder.convert.gm() : type == so2.q2.class.hashCode() ? new com.tencent.mm.plugin.finder.convert.im() : new com.tencent.mm.plugin.finder.convert.im();
                }
            };
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f122733d;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, baseFeedLoader.getDataListJustForAdapter(), false);
            wxRecyclerAdapter.f293105o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$2$1
                @Override // in5.x
                public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter purchaseListPresenter;
                    java.lang.String str;
                    in5.s0 holder = (in5.s0) k3Var;
                    kotlin.jvm.internal.o.g(adapter, "adapter");
                    kotlin.jvm.internal.o.g(view, "view");
                    kotlin.jvm.internal.o.g(holder, "holder");
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter purchaseListPresenter2 = com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter.this;
                    com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter = purchaseListPresenter2.f122733d.getDataListJustForAdapter();
                    if (i17 >= 0 && i17 < dataListJustForAdapter.size()) {
                        so2.j5 j5Var = (so2.j5) dataListJustForAdapter.get(i17);
                        boolean z17 = j5Var instanceof so2.g2;
                        android.content.Context context = holder.f293121e;
                        if (z17) {
                            java.lang.Object obj = dataListJustForAdapter.get(i17);
                            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderLiveEcSourceData");
                            so2.g2 g2Var = (so2.g2) obj;
                            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) g2Var.f410359d.getCustom(3);
                            if (finderJumpInfo != null) {
                                if (finderJumpInfo.getJumpinfo_type() == 0) {
                                    finderJumpInfo.setJumpinfo_type(1);
                                }
                                xc2.y2 y2Var = xc2.y2.f453343a;
                                kotlin.jvm.internal.o.f(context, "getContext(...)");
                                xc2.y2.i(y2Var, context, new xc2.p0(finderJumpInfo), 0, null, 12, null);
                            }
                            cl0.g gVar = new cl0.g();
                            gVar.h("tabtype", "直播回放");
                            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                            kotlin.jvm.internal.o.f(context, "getContext(...)");
                            java.lang.String gVar2 = gVar.toString();
                            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                            com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c17, context, 16L, 1L, false, 0, 0, r26.i0.t(gVar2, ",", ";", false), 56, null);
                            com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.a(com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.f122732a, context, "course", true, i17 + 1, java.lang.Long.valueOf(g2Var.f410359d.getLong(11)), null, 32, null);
                            return;
                        }
                        if (j5Var instanceof so2.q2) {
                            java.lang.Object obj2 = dataListJustForAdapter.get(i17);
                            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderLiveReplayFeed");
                            so2.q2 q2Var = (so2.q2) obj2;
                            boolean t27 = q2Var.t2();
                            com.tencent.mm.protocal.protobuf.FinderObject finderObject = q2Var.f410549n;
                            if (!t27) {
                                r45.nw1 liveInfo = finderObject.getLiveInfo();
                                java.lang.String string = liveInfo != null ? liveInfo.getString(49) : null;
                                if (string == null || string.length() == 0) {
                                    db5.t7.g(context, context.getResources().getString(com.tencent.mm.R.string.e_f));
                                    return;
                                } else {
                                    db5.t7.g(context, string);
                                    return;
                                }
                            }
                            cl0.g gVar3 = new cl0.g();
                            ya2.b2 contact = q2Var.getContact();
                            if (contact != null) {
                                purchaseListPresenter = purchaseListPresenter2;
                                str = contact.D0();
                            } else {
                                purchaseListPresenter = purchaseListPresenter2;
                                str = null;
                            }
                            gVar3.h("finderusername", str);
                            gVar3.h("tabtype", "直播回放");
                            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                            kotlin.jvm.internal.o.f(c18, "getService(...)");
                            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c18;
                            kotlin.jvm.internal.o.f(context, "getContext(...)");
                            java.lang.String gVar4 = gVar3.toString();
                            kotlin.jvm.internal.o.f(gVar4, "toString(...)");
                            com.tencent.mm.plugin.finder.report.o3.Mj(o3Var, context, 16L, 1L, false, 0, 0, r26.i0.t(gVar4, ",", ";", false), 56, null);
                            com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract finderLivePurchaseListContract = com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.f122732a;
                            int i18 = i17 + 1;
                            r45.nw1 liveInfo2 = finderObject.getLiveInfo();
                            com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.a(finderLivePurchaseListContract, context, "live", true, i18, null, liveInfo2 != null ? java.lang.Long.valueOf(liveInfo2.getLong(0)) : null, 16, null);
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("object_id", pm0.v.u(finderObject.getId()));
                            jSONObject.put("page_type", "pay");
                            jSONObject.put("object_type", q2Var.q2() ? 1 : 2);
                            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
                            ml2.o3[] o3VarArr = ml2.o3.f327773d;
                            java.lang.String jSONObject2 = jSONObject.toString();
                            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                            ((ml2.j0) zbVar).Wj("watch_live_record", jSONObject2);
                            java.util.List I = kz5.j0.I(dataListJustForAdapter, so2.q2.class);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.util.Iterator it = ((java.util.ArrayList) I).iterator();
                            while (it.hasNext()) {
                                java.lang.Object next = it.next();
                                so2.q2 q2Var2 = (so2.q2) next;
                                if (q2Var2.t2() && q2Var2.m2() == q2Var.m2()) {
                                    arrayList.add(next);
                                }
                            }
                            int indexOf = arrayList.indexOf(q2Var);
                            if (indexOf < 0) {
                                indexOf = 0;
                            }
                            android.content.Intent intent = new android.content.Intent();
                            com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter purchaseListPresenter3 = purchaseListPresenter;
                            intent.putExtra("KEY_PARAMS_KEY_VALUE", so2.q2.f410546p.a(arrayList, purchaseListPresenter3.f122733d.getLastBuffer(), purchaseListPresenter3.f122736g, indexOf).toByteArray());
                            intent.putExtra("KEY_PARAMS_SOURCE_TYPE", 1);
                            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                            vd2.t3.f435921a.b(intent, "pay", 0);
                            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).hj(purchaseListPresenter3.g().f122748a, intent, true);
                        }
                    }
                }
            };
            wxRecyclerAdapter.f293104n = new in5.y() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$2$2
                /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
                @Override // in5.y
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public boolean c(androidx.recyclerview.widget.f2 r5, final android.view.View r6, final int r7, androidx.recyclerview.widget.k3 r8) {
                    /*
                        r4 = this;
                        in5.s0 r8 = (in5.s0) r8
                        java.lang.String r0 = "adapter"
                        kotlin.jvm.internal.o.g(r5, r0)
                        java.lang.String r5 = "view"
                        kotlin.jvm.internal.o.g(r6, r5)
                        java.lang.String r5 = "holder"
                        kotlin.jvm.internal.o.g(r8, r5)
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter r5 = com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter.this
                        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader r8 = r5.f122733d
                        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r8 = r8.getDataListJustForAdapter()
                        java.lang.Object r8 = kz5.n0.a0(r8, r7)
                        so2.j5 r8 = (so2.j5) r8
                        r0 = 0
                        if (r8 == 0) goto L81
                        boolean r1 = r8 instanceof so2.q2
                        r2 = 0
                        if (r1 == 0) goto L2b
                        r1 = r8
                        so2.q2 r1 = (so2.q2) r1
                        goto L2c
                    L2b:
                        r1 = r2
                    L2c:
                        r3 = 1
                        if (r1 == 0) goto L3a
                        int r1 = r1.f410550o
                        if (r1 != r3) goto L35
                        r1 = r3
                        goto L36
                    L35:
                        r1 = r0
                    L36:
                        if (r1 != r3) goto L3a
                        r1 = r3
                        goto L3b
                    L3a:
                        r1 = r0
                    L3b:
                        if (r1 != 0) goto L54
                        boolean r1 = r8 instanceof so2.g2
                        if (r1 == 0) goto L44
                        r2 = r8
                        so2.g2 r2 = (so2.g2) r2
                    L44:
                        if (r2 == 0) goto L51
                        int r8 = r2.f410360e
                        if (r8 != r3) goto L4c
                        r8 = r3
                        goto L4d
                    L4c:
                        r8 = r0
                    L4d:
                        if (r8 != r3) goto L51
                        r8 = r3
                        goto L52
                    L51:
                        r8 = r0
                    L52:
                        if (r8 == 0) goto L81
                    L54:
                        rl5.r r8 = new rl5.r
                        android.content.Context r1 = r6.getContext()
                        r8.<init>(r1, r6)
                        r8.C = r3
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$showLongClickMenu$1 r1 = new com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$showLongClickMenu$1
                        r1.<init>()
                        r8.f397355y = r1
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$showLongClickMenu$2 r1 = new com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$showLongClickMenu$2
                        r1.<init>()
                        r8.f397354x = r1
                        r5 = 2
                        int[] r7 = new int[r5]
                        r6.getLocationInWindow(r7)
                        r0 = r7[r0]
                        r7 = r7[r3]
                        int r6 = r6.getWidth()
                        int r0 = r0 + r6
                        int r0 = r0 / r5
                        r8.n(r0, r7)
                        r0 = r3
                    L81:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$2$2.c(androidx.recyclerview.widget.f2, android.view.View, int, androidx.recyclerview.widget.k3):boolean");
                }
            };
            this.f122735f = wxRecyclerAdapter;
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = callback.f122752e;
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(wxRecyclerView.getRootView().getContext()));
            wxRecyclerView.setAdapter(callback.f122749b.f());
            wxRecyclerView.N(new androidx.recyclerview.widget.p2() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$1$1
                @Override // androidx.recyclerview.widget.p2
                public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
                    kotlin.jvm.internal.o.g(outRect, "outRect");
                    kotlin.jvm.internal.o.g(view, "view");
                    kotlin.jvm.internal.o.g(parent, "parent");
                    kotlin.jvm.internal.o.g(state, "state");
                    outRect.left = 0;
                    outRect.right = 0;
                    outRect.top = 0;
                    outRect.bottom = com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this.f122748a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
                }
            });
            ym5.a1.h(wxRecyclerView, new ym5.n0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$1$2
                @Override // ym5.n0
                public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
                    kotlin.jvm.internal.o.g(view, "view");
                }
            });
            ym5.a1.g(wxRecyclerView, new ym5.m0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$1$3

                /* renamed from: a, reason: collision with root package name */
                public final java.util.HashSet f122757a = new java.util.HashSet();

                /* renamed from: b, reason: collision with root package name */
                public final java.util.HashSet f122758b = new java.util.HashSet();

                @Override // ym5.m0
                public boolean d() {
                    return true;
                }

                @Override // ym5.m0
                public void e(android.view.View parent, java.util.List exposedHolders) {
                    android.content.Context context;
                    java.lang.String str;
                    java.lang.String str2;
                    java.lang.String str3;
                    java.lang.Object obj;
                    java.lang.String str4;
                    java.lang.String str5;
                    java.lang.String str6;
                    kotlin.jvm.internal.o.g(parent, "parent");
                    kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
                    int i17 = 0;
                    for (java.lang.Object obj2 : exposedHolders) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) obj2;
                        in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
                        if (s0Var != null) {
                            java.lang.Object obj3 = s0Var.f293125i;
                            so2.q2 q2Var = obj3 instanceof so2.q2 ? (so2.q2) obj3 : null;
                            android.content.Context context2 = s0Var.f293121e;
                            if (q2Var != null) {
                                java.util.HashSet hashSet = this.f122757a;
                                if (!hashSet.contains(java.lang.Long.valueOf(q2Var.m2()))) {
                                    hashSet.add(java.lang.Long.valueOf(q2Var.m2()));
                                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                                    jSONObject.put("object_id", pm0.v.u(q2Var.m2()));
                                    jSONObject.put("page_type", "pay");
                                    if (q2Var.q2()) {
                                        jSONObject.put("object_type", 1);
                                    } else {
                                        jSONObject.put("object_type", 2);
                                    }
                                    zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
                                    ml2.o3[] o3VarArr = ml2.o3.f327773d;
                                    java.lang.String jSONObject2 = jSONObject.toString();
                                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                                    ((ml2.j0) zbVar).Wj("watch_live_expose", jSONObject2);
                                    cl0.g gVar = new cl0.g();
                                    ya2.b2 contact = q2Var.getContact();
                                    gVar.h("finderusername", contact != null ? contact.D0() : null);
                                    gVar.h("tabtype", "付费直播");
                                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                    java.lang.String gVar2 = gVar.toString();
                                    kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                                    com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c17, context2, 16L, 2L, false, 0, 0, r26.i0.t(gVar2, ",", ";", false), 56, null);
                                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract finderLivePurchaseListContract = com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.f122732a;
                                    r45.nw1 liveInfo = q2Var.f410549n.getLiveInfo();
                                    context = context2;
                                    str = "getContext(...)";
                                    str2 = "toString(...)";
                                    str3 = "tabtype";
                                    obj = "付费直播";
                                    str4 = "getService(...)";
                                    java.lang.Long valueOf = liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null;
                                    str5 = ",";
                                    str6 = ";";
                                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.a(finderLivePurchaseListContract, context2, "live", false, i18, null, valueOf, 16, null);
                                }
                            } else {
                                context = context2;
                                str = "getContext(...)";
                                str2 = "toString(...)";
                                str3 = "tabtype";
                                obj = "付费直播";
                                str4 = "getService(...)";
                                str5 = ",";
                                str6 = ";";
                            }
                            java.lang.Object obj4 = s0Var.f293125i;
                            so2.g2 g2Var = obj4 instanceof so2.g2 ? (so2.g2) obj4 : null;
                            if (g2Var != null) {
                                java.util.HashSet hashSet2 = this.f122758b;
                                r45.s11 s11Var = g2Var.f410359d;
                                if (!hashSet2.contains(java.lang.Long.valueOf(s11Var.getLong(11)))) {
                                    hashSet2.add(java.lang.Long.valueOf(s11Var.getLong(11)));
                                    cl0.g gVar3 = new cl0.g();
                                    gVar3.h(str3, obj);
                                    i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                                    kotlin.jvm.internal.o.f(c18, str4);
                                    android.content.Context context3 = context;
                                    kotlin.jvm.internal.o.f(context3, str);
                                    java.lang.String gVar4 = gVar3.toString();
                                    kotlin.jvm.internal.o.f(gVar4, str2);
                                    com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c18, context3, 16L, 2L, false, 0, 0, r26.i0.t(gVar4, str5, str6, false), 56, null);
                                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.a(com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.f122732a, context3, "course", false, i18, java.lang.Long.valueOf(s11Var.getLong(11)), null, 32, null);
                                    i17 = i18;
                                }
                            }
                        }
                        i17 = i18;
                    }
                }
            });
            callback.f122751d.setActionCallback(new ym5.q3() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$2
                @Override // ym5.q3
                public void b(int i17) {
                    com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this.f122749b.f122733d, false, 1, null);
                }

                @Override // ym5.q3
                public void c(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this.a(false);
                }

                @Override // ym5.q3
                public void d(int i17, rn5.a aVar, boolean z17) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this;
                    purchaseListViewCallback.f122749b.f122733d.requestRefresh();
                    ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                    purchaseListViewCallback.f122752e.setItemAnimator(new uw2.n0());
                }

                @Override // ym5.q3
                public void e(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                    final com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this;
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = purchaseListViewCallback.f122751d;
                    kotlin.jvm.internal.o.f(refreshLoadMoreLayout, "<get-rfLayout>(...)");
                    com.tencent.mm.view.RefreshLoadMoreLayout.u(refreshLoadMoreLayout, null, 1, null);
                    purchaseListViewCallback.f122752e.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$2$onRefreshEnd$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this.f122752e.setItemAnimator(new androidx.recyclerview.widget.z());
                        }
                    }, 1000L);
                    purchaseListViewCallback.a(false);
                }
            });
            callback.a(true);
            callback.f122750c.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$3
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this.f122749b.f122733d.requestRefresh();
                }
            }, 300L);
            kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader");
            ((com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader) baseFeedLoader).f111693e = new com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$3(this);
            com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(baseFeedLoader, g().f122755h, false, 2, null);
        }

        @Override // fs2.a
        public void onDetach() {
            this.f122733d.unregister(g().f122755h);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract$PurchaseListViewCallback;", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class PurchaseListViewCallback {

        /* renamed from: a, reason: collision with root package name */
        public final com.tencent.mm.ui.MMActivity f122748a;

        /* renamed from: b, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter f122749b;

        /* renamed from: c, reason: collision with root package name */
        public final android.view.View f122750c;

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.view.RefreshLoadMoreLayout f122751d;

        /* renamed from: e, reason: collision with root package name */
        public final com.tencent.mm.view.recyclerview.WxRecyclerView f122752e;

        /* renamed from: f, reason: collision with root package name */
        public final android.widget.ProgressBar f122753f;

        /* renamed from: g, reason: collision with root package name */
        public final android.widget.TextView f122754g;

        /* renamed from: h, reason: collision with root package name */
        public final ym5.q1 f122755h;

        public PurchaseListViewCallback(com.tencent.mm.ui.MMActivity activity, com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListPresenter presenter, android.view.View rootView) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(presenter, "presenter");
            kotlin.jvm.internal.o.g(rootView, "rootView");
            this.f122748a = activity;
            this.f122749b = presenter;
            this.f122750c = rootView;
            this.f122751d = (com.tencent.mm.view.RefreshLoadMoreLayout) rootView.findViewById(com.tencent.mm.R.id.fjn);
            this.f122752e = (com.tencent.mm.view.recyclerview.WxRecyclerView) rootView.findViewById(com.tencent.mm.R.id.fjm);
            this.f122753f = (android.widget.ProgressBar) rootView.findViewById(com.tencent.mm.R.id.f486480ld1);
            this.f122754g = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.dft);
            this.f122755h = new ym5.q1() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$proxyRLayout$1
                @Override // ym5.m1
                public void onChanged() {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this.f122751d.onChanged();
                }

                @Override // ym5.m1
                public void onItemRangeChanged(int i17, int i18) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this;
                    purchaseListViewCallback.f122751d.onItemRangeChanged(i17 + purchaseListViewCallback.f122749b.f().a0(), i18);
                }

                @Override // ym5.m1
                public void onItemRangeInserted(int i17, int i18) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this;
                    purchaseListViewCallback.f122751d.onItemRangeInserted(i17 + purchaseListViewCallback.f122749b.f().a0(), i18);
                }

                @Override // ym5.m1
                public void onItemRangeMoved(int i17, int i18, int i19) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this;
                    purchaseListViewCallback.f122751d.onItemRangeMoved(i17 + purchaseListViewCallback.f122749b.f().a0(), i18 + purchaseListViewCallback.f122749b.f().a0(), i19);
                }

                @Override // ym5.m1
                public void onItemRangeRemoved(int i17, int i18) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this;
                    purchaseListViewCallback.f122751d.onItemRangeRemoved(i17 + purchaseListViewCallback.f122749b.f().a0(), i18);
                }

                @Override // ym5.p1
                public void onPreFinishLoadMore(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this.f122751d;
                    refreshLoadMoreLayout.getClass();
                    refreshLoadMoreLayout.O(reason);
                }

                @Override // ym5.p1
                public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this.f122751d.onPreFinishLoadMoreSmooth(reason);
                }

                @Override // ym5.p1
                public void onPreFinishRefresh(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this.f122751d;
                    refreshLoadMoreLayout.getClass();
                    refreshLoadMoreLayout.Q(reason);
                }

                @Override // ym5.m1
                public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract.PurchaseListViewCallback.this;
                    purchaseListViewCallback.f122751d.onItemRangeChanged(i17 + purchaseListViewCallback.f122749b.f().a0(), i18, obj);
                }
            };
        }

        public final void a(boolean z17) {
            this.f122753f.setVisibility(z17 ? 0 : 8);
        }
    }

    private FinderLivePurchaseListContract() {
    }

    public static void a(com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract finderLivePurchaseListContract, android.content.Context context, java.lang.String itemType, boolean z17, int i17, java.lang.Long l17, java.lang.Long l18, int i18, java.lang.Object obj) {
        if ((i18 & 16) != 0) {
            l17 = -1L;
        }
        if ((i18 & 32) != 0) {
            l18 = -1L;
        }
        finderLivePurchaseListContract.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemType, "itemType");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("card_type", itemType);
        if (kotlin.jvm.internal.o.b(itemType, "course")) {
            jSONObject.put("product_id", l17);
        } else if (kotlin.jvm.internal.o.b(itemType, "live")) {
            jSONObject.put("live_id", l18);
        }
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ, i17);
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        b6Var.c(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), "paid_content_card", z17, jSONObject);
    }
}
