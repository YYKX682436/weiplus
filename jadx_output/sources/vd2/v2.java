package vd2;

/* loaded from: classes3.dex */
public final class v2 implements vd2.t1 {

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f435941m;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f435942d;

    /* renamed from: e, reason: collision with root package name */
    public vd2.u1 f435943e;

    /* renamed from: f, reason: collision with root package name */
    public vd2.a2 f435944f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f435945g;

    /* renamed from: h, reason: collision with root package name */
    public vd2.r2 f435946h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.FinderLivePresenter$feedChangeListener$1 f435947i;

    static {
        f435941m = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3882t3).getValue()).r()).intValue() == 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.live.FinderLivePresenter$feedChangeListener$1] */
    public v2(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f435942d = context;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f435947i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.FinderLivePresenter$feedChangeListener$1
            {
                this.__eventId = 439877283;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ia iaVar = event.f54252g;
                int i17 = iaVar.f6919b;
                vd2.v2 v2Var = vd2.v2.this;
                if (i17 != 14) {
                    if (i17 != 21 || iaVar.f6921d != 0) {
                        return false;
                    }
                    ik1.h0.b(new vd2.s2(v2Var));
                    return false;
                }
                vd2.u1 u1Var = v2Var.f435943e;
                if (u1Var == null) {
                    return false;
                }
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = (com.tencent.mm.plugin.finder.live.FinderLiveViewCallback) u1Var;
                finderLiveViewCallback.f111492q.post(new vd2.q4(finderLiveViewCallback, event));
                return false;
            }
        };
    }

    public static boolean i(vd2.v2 v2Var, int i17, boolean z17, gk2.e eVar, boolean z18, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            dk2.ef efVar = dk2.ef.f233372a;
            eVar = dk2.ef.I;
        }
        if ((i18 & 8) != 0) {
            z18 = false;
        }
        return v2Var.h(i17, z17, eVar, z18);
    }

    public static final boolean v(vd2.v2 v2Var, gk2.e eVar, int i17, int i18) {
        vd2.a2 a2Var = v2Var.f435944f;
        if (a2Var != null && a2Var.b().f111731i) {
            return false;
        }
        int i19 = vd2.a2.f435638i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("needPreload curPos:");
        sb6.append(i17);
        sb6.append(", listSize:");
        sb6.append(i18);
        sb6.append(", threshold:");
        int i27 = vd2.a2.f435638i;
        sb6.append(i27);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("FinderLiveDataLoader", sb6.toString());
        if ((i18 - i17 <= i27) && v2Var.f()) {
            return i(v2Var, 3, false, eVar, false, 8, null);
        }
        return false;
    }

    public final void c(java.util.List dataList) {
        km2.r rVar;
        vd2.a2 a2Var = this.f435944f;
        if (a2Var != null && a2Var.f435646d == 1) {
            android.content.Context context = this.f435942d;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            pl2.s sVar = ((pl2.x) a17).f356684g;
            if (sVar != null) {
                km2.n nVar = dk2.ef.H;
                com.tencent.mm.protobuf.g gVar = (nVar == null || (rVar = nVar.f309151c) == null) ? null : rVar.f309196a;
                kotlin.jvm.internal.o.g(dataList, "dataList");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appendData origin ");
                java.util.ArrayList arrayList = sVar.f356656k;
                sb6.append(arrayList.size());
                sb6.append(", ");
                sb6.append(dataList.size());
                java.lang.String sb7 = sb6.toString();
                java.lang.String str = sVar.f356647b;
                com.tencent.mars.xlog.Log.i(str, sb7);
                sVar.f356658m = gVar;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((pl2.a) it.next()).f356616d);
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.Iterator it6 = dataList.iterator();
                while (it6.hasNext()) {
                    km2.m mVar = (km2.m) it6.next();
                    java.util.Iterator it7 = arrayList2.iterator();
                    int i17 = 0;
                    while (true) {
                        if (!it7.hasNext()) {
                            i17 = -1;
                            break;
                        } else {
                            if (((km2.m) it7.next()).d(mVar) == 0) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                    java.util.Iterator it8 = linkedList.iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it8.hasNext()) {
                            i18 = -1;
                            break;
                        } else {
                            if (((km2.m) it8.next()).d(mVar) == 0) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                    }
                    if (i17 == -1 && i18 == -1) {
                        linkedList.add(mVar);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it9 = linkedList.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(new pl2.a((km2.m) it9.next()));
                }
                arrayList.addAll(arrayList3);
                androidx.recyclerview.widget.f2 adapter = sVar.c().getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                com.tencent.mars.xlog.Log.i(str, "appendData after " + arrayList.size() + ", liveIds: " + kz5.n0.g0(arrayList, null, null, null, 0, null, pl2.n.f356641d, 31, null));
                com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = sVar.f356653h;
                if (wxRefreshLayout == null) {
                    kotlin.jvm.internal.o.o("sidebarRvLayout");
                    throw null;
                }
                wxRefreshLayout.e(true);
                xx2.l lVar = sVar.f356648c;
                if (lVar == null) {
                    kotlin.jvm.internal.o.o("finderSideBar");
                    throw null;
                }
                android.view.View findViewById = lVar.f457984f.findViewById(com.tencent.mm.R.id.u4q);
                kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = (com.tencent.mm.ui.widget.MMProcessBar) findViewById;
                mMProcessBar.e();
                mMProcessBar.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if ((r0 != null && r0.f309207l == 1) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f() {
        /*
            r5 = this;
            km2.n r0 = dk2.ef.H
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L39
            km2.r r0 = r0.f309151c
            r3 = 2
            if (r0 == 0) goto L11
            int r4 = r0.f309201f
            if (r4 != r3) goto L11
            r4 = r1
            goto L12
        L11:
            r4 = r2
        L12:
            if (r4 != 0) goto L37
            if (r0 == 0) goto L1c
            int r4 = r0.f309201f
            if (r4 != r3) goto L1c
            r3 = r1
            goto L1d
        L1c:
            r3 = r2
        L1d:
            if (r3 != 0) goto L37
            if (r0 == 0) goto L29
            int r3 = r0.f309201f
            r4 = 1001(0x3e9, float:1.403E-42)
            if (r3 != r4) goto L29
            r3 = r1
            goto L2a
        L29:
            r3 = r2
        L2a:
            if (r3 != 0) goto L37
            if (r0 == 0) goto L34
            int r0 = r0.f309207l
            if (r0 != r1) goto L34
            r0 = r1
            goto L35
        L34:
            r0 = r2
        L35:
            if (r0 == 0) goto L39
        L37:
            r0 = r1
            goto L3a
        L39:
            r0 = r2
        L3a:
            if (r0 != 0) goto L4b
            vd2.a2 r0 = r5.f435944f
            if (r0 == 0) goto L46
            int r0 = r0.f435646d
            if (r0 != r1) goto L46
            r0 = r1
            goto L47
        L46:
            r0 = r2
        L47:
            if (r0 == 0) goto L4a
            goto L4b
        L4a:
            r1 = r2
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vd2.v2.f():boolean");
    }

    @Override // km2.u
    public void g(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("FinderLivePresenter", "onItemRemove startIndex=" + i17 + " count=" + i18);
        vd2.u1 u1Var = this.f435943e;
        if (u1Var != null) {
            ((com.tencent.mm.plugin.finder.live.FinderLiveViewCallback) u1Var).g(i17, i18);
        }
    }

    public final boolean h(int i17, boolean z17, gk2.e eVar, boolean z18) {
        int i18;
        boolean z19;
        java.util.ArrayList<km2.t> arrayList;
        km2.n nVar = dk2.ef.H;
        km2.r rVar = nVar != null ? nVar.f309151c : null;
        if (rVar == null || eVar == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadDataImpl loaderParams:");
            km2.n nVar2 = dk2.ef.H;
            sb6.append(nVar2 != null ? nVar2.f309151c : null);
            sb6.append(",curLiveRoomData:");
            sb6.append(dk2.ef.I);
            com.tencent.mars.xlog.Log.i("FinderLivePresenter", sb6.toString());
            return false;
        }
        if (z17 && rVar.f309207l != 1) {
            com.tencent.mars.xlog.Log.i("FinderLivePresenter", "preloadDataImpl loadType:" + i17 + ", pullType:" + rVar.f309207l + ", pullMoreType:" + rVar.f309207l);
            return false;
        }
        rVar.f309197b = ((mm2.e1) eVar.a(mm2.e1.class)).f328983m;
        java.lang.String str = ((mm2.e1) eVar.a(mm2.e1.class)).f328992v;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        rVar.f309202g = str;
        rVar.f309198c = ((mm2.e1) eVar.a(mm2.e1.class)).f328993w;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        km2.n nVar3 = dk2.ef.H;
        if (nVar3 == null || (arrayList = nVar3.f309153e) == null) {
            i18 = 0;
        } else {
            i18 = 0;
            for (km2.t tVar : arrayList) {
                km2.m mVar = tVar.f309222d;
                if (mVar != null ? mVar.f309134i : false) {
                    r45.d72 d72Var = new r45.d72();
                    com.tencent.mm.live.api.LiveConfig b17 = tVar.b();
                    d72Var.set(0, java.lang.Long.valueOf(b17 != null ? b17.f68549s : 0L));
                    linkedList.add(d72Var);
                    km2.m mVar2 = tVar.f309222d;
                    if (mVar2 != null ? mVar2.f309135m : false) {
                        i18++;
                    }
                }
            }
        }
        rVar.f309211p = linkedList;
        int i19 = 0;
        for (java.lang.Object obj : linkedList) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (rVar.f309197b == ((r45.d72) obj).getLong(0)) {
                rVar.f309212q = i19 - i18;
            }
            i19 = i27;
        }
        rVar.f309214s = z18;
        com.tencent.mars.xlog.Log.i("FinderLivePresenter", "loadDataImpl isFirstPagePreload:" + z18);
        vd2.a2 a2Var = this.f435944f;
        if (a2Var == null) {
            return false;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("loadData presenter:");
        vd2.t1 t1Var = a2Var.f435643a;
        sb7.append(t1Var != null ? t1Var.hashCode() : 0);
        sb7.append(", curLoadType:");
        sb7.append(a2Var.f435645c);
        sb7.append(", type:");
        sb7.append(i17);
        sb7.append(", loadType:");
        sb7.append(a2Var.f435645c);
        sb7.append(", loading:");
        sb7.append(a2Var.b().f111731i);
        sb7.append(", isIgnorePreloadForFeedId=");
        sb7.append(vd2.a2.f435639j);
        sb7.append(",thread:");
        sb7.append(java.lang.Thread.currentThread().getName());
        com.tencent.mars.xlog.Log.i("FinderLiveDataLoader", sb7.toString());
        if (a2Var.b().f111731i) {
            if (a2Var.f435645c == 3 && (i17 == 2 || i17 == 4)) {
                a2Var.f435645c = i17;
            }
            z19 = true;
        } else {
            z19 = false;
        }
        if (z19) {
            return false;
        }
        if (vd2.a2.f435639j == rVar.f309197b) {
            vd2.a2.f435639j = -1L;
            return false;
        }
        if (!a2Var.c()) {
            com.tencent.mars.xlog.Log.i("FinderLiveDataLoader", "loadData no more");
            return false;
        }
        com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader b18 = a2Var.b();
        if (i17 == 4 && !b18.getF111732m()) {
            com.tencent.mars.xlog.Log.i("FinderLiveDataLoader", "loadData intercepted: current loader does not support PULL_TYPE_REFRESH");
            return false;
        }
        a2Var.f435645c = i17;
        b18.f111731i = true;
        b18.f111733n = rVar;
        if (a2Var.f435645c == 4) {
            b18.requestRefresh();
        } else {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(b18, false, 1, null);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        if ((r4 != null && r4.f309201f == 1010) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(vd2.u1 r30) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vd2.v2.m(vd2.u1):void");
    }

    @Override // fs2.a
    public void onDetach() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader finderLiveRelatedLoader;
        vd2.u1 u1Var = this.f435943e;
        if (u1Var != null && (refreshLoadMoreLayout = ((com.tencent.mm.plugin.finder.live.FinderLiveViewCallback) u1Var).f111482d) != null) {
            vd2.a2 a2Var = this.f435944f;
            if (a2Var != null) {
                com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader finderLiveRelatedBaseLoader = a2Var.f435648f;
                com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader finderLiveRelatedLoader2 = a2Var.f435649g;
                java.util.Iterator it = (finderLiveRelatedBaseLoader != null ? kz5.c0.i(finderLiveRelatedBaseLoader, finderLiveRelatedLoader2) : kz5.b0.c(finderLiveRelatedLoader2)).iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader) it.next()).unregister(refreshLoadMoreLayout);
                }
            }
            vd2.a2 a2Var2 = this.f435944f;
            if (a2Var2 != null && (finderLiveRelatedLoader = a2Var2.f435650h) != null) {
                finderLiveRelatedLoader.unregister(refreshLoadMoreLayout);
            }
        }
        this.f435943e = null;
        vd2.a2 a2Var3 = this.f435944f;
        if (a2Var3 != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.w0 w0Var = a2Var3.f435644b;
            if (w0Var != null) {
                w0Var.a();
            }
            a2Var3.b().f111731i = false;
            vd2.a2.f435639j = -1L;
            a2Var3.f435643a = null;
        }
        dead();
        km2.n nVar = dk2.ef.H;
        if (nVar == null) {
            return;
        }
        nVar.f309154f = null;
    }

    public void p(boolean z17) {
        java.util.ArrayList arrayList;
        jz5.f0 f0Var;
        com.tencent.mm.protobuf.g gVar;
        km2.r rVar;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mars.xlog.Log.i("FinderLivePresenter", "onSideBarStateChanged " + z17);
        vd2.a2 a2Var = this.f435944f;
        if (a2Var != null) {
            if (a2Var.b().f111731i) {
                a2Var.b().f111731i = false;
                com.tencent.mars.xlog.Log.i("FinderLiveDataLoader", "sideBarStateChanged: " + z17 + ", reset loading");
                vd2.t1 t1Var = a2Var.f435643a;
                if (t1Var != null) {
                    ym5.s3 s3Var = new ym5.s3(1);
                    vd2.u1 u1Var = ((vd2.v2) t1Var).f435943e;
                    if (u1Var != null && (refreshLoadMoreLayout = ((com.tencent.mm.plugin.finder.live.FinderLiveViewCallback) u1Var).f111482d) != null) {
                        refreshLoadMoreLayout.O(s3Var);
                    }
                }
            }
            a2Var.f435646d = z17 ? 1 : 0;
            a2Var.b().f111730h = a2Var.f435646d;
        }
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (!z17) {
            km2.n nVar = dk2.ef.H;
            km2.t c17 = nVar != null ? nVar.c() : null;
            vd2.r2 r2Var = this.f435946h;
            if (c17 == null || r2Var == null) {
                f0Var2 = null;
            } else {
                km2.n nVar2 = dk2.ef.H;
                if (nVar2 == null || (arrayList = nVar2.f309153e) == null) {
                    arrayList = new java.util.ArrayList();
                }
                z(arrayList, r2Var.f435877a, c17, r2Var.f435878b, r2Var.f435879c);
            }
            if (f0Var2 == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hide data?.curLiveData sideBarDataCache is null: ");
                km2.n nVar3 = dk2.ef.H;
                sb6.append(nVar3 != null ? nVar3.c() : null);
                sb6.append(", ");
                sb6.append(this.f435946h);
                com.tencent.mars.xlog.Log.e("FinderLivePresenter", sb6.toString());
            }
            this.f435946h = null;
            return;
        }
        vd2.a2 a2Var2 = this.f435944f;
        com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader finderLiveRelatedLoader = a2Var2 != null ? a2Var2.f435650h : null;
        if (finderLiveRelatedLoader != null) {
            finderLiveRelatedLoader.f111728f = false;
        }
        km2.n nVar4 = dk2.ef.H;
        km2.t c18 = nVar4 != null ? nVar4.c() : null;
        km2.n nVar5 = dk2.ef.H;
        java.util.ArrayList arrayList2 = nVar5 != null ? nVar5.f309153e : null;
        if (c18 == null || arrayList2 == null) {
            f0Var2 = null;
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            com.tencent.mars.xlog.Log.i("FinderLivePresenter", "sidebar old curPos:" + y(arrayList2, c18, arrayList3, arrayList4) + ", preList:" + arrayList3.size() + ", sufList:" + arrayList4.size() + ", fullList:" + arrayList2.size());
            km2.n nVar6 = dk2.ef.H;
            this.f435946h = new vd2.r2(arrayList3, arrayList4, (nVar6 == null || (rVar = nVar6.f309151c) == null) ? null : rVar.f309196a);
            android.content.Context context = this.f435942d;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            pl2.x xVar = (pl2.x) a17;
            pl2.s sVar = xVar.f356684g;
            if (sVar != null) {
                java.util.ArrayList arrayList5 = sVar.f356656k;
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(arrayList5, 10));
                java.util.Iterator it = arrayList5.iterator();
                while (it.hasNext()) {
                    arrayList6.add(((pl2.a) it.next()).f356616d);
                }
                com.tencent.mm.protobuf.g gVar2 = sVar.f356658m;
                if (gVar2 == null) {
                    dk2.h hVar = (dk2.h) kz5.n0.Z(xVar.f356686i);
                    gVar = hVar != null ? hVar.f233543f : null;
                } else {
                    gVar = gVar2;
                }
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(arrayList6, 10));
                java.util.Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    arrayList8.add(new km2.t((km2.m) it6.next()));
                }
                arrayList7.addAll(arrayList8);
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                com.tencent.mars.xlog.Log.i("FinderLivePresenter", "sidebar new curPos:" + y(arrayList7, c18, arrayList9, arrayList10) + ", preList:" + arrayList9.size() + ", sufList:" + arrayList10.size() + ", fullList:" + arrayList7.size());
                z(arrayList2, arrayList9, c18, arrayList10, gVar);
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("FinderLivePresenter", "currentSideBarJumpInfo is empty!");
            }
        }
        if (f0Var2 == null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("show data?.curLiveData liveDataList is null: ");
            km2.n nVar7 = dk2.ef.H;
            sb7.append(nVar7 != null ? nVar7.c() : null);
            sb7.append(", ");
            km2.n nVar8 = dk2.ef.H;
            sb7.append(nVar8 != null ? nVar8.f309153e : null);
            com.tencent.mars.xlog.Log.e("FinderLivePresenter", sb7.toString());
        }
    }

    @Override // km2.u
    public void q(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("FinderLivePresenter", "onItemInserted position=" + i17 + " count=" + i18);
        vd2.u1 u1Var = this.f435943e;
        if (u1Var != null) {
            ((com.tencent.mm.plugin.finder.live.FinderLiveViewCallback) u1Var).q(i17, i18);
        }
    }

    public boolean s(int i17, int i18, gk2.e eVar) {
        com.tencent.mars.xlog.Log.i("FinderLivePresenter", "preloadData newPos:" + i17 + ", dataSize:" + i18);
        if (this.f435945g) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadData, return for hasPreload(");
            dk2.ef efVar = dk2.ef.f233372a;
            sb6.append(dk2.ef.f233374b);
            sb6.append(')');
            com.tencent.mars.xlog.Log.w("FinderLivePresenter", sb6.toString());
            return v(this, eVar, i17, i18);
        }
        this.f435945g = true;
        if (i17 == 0 && i18 <= 1) {
            com.tencent.mars.xlog.Log.i("FinderLivePresenter", "preloadData");
            return h(3, true, eVar, true);
        }
        com.tencent.mars.xlog.Log.w("FinderLivePresenter", "preloadData, return for newPos:" + i17 + ", dataSize:" + i18);
        return v(this, eVar, i17, i18);
    }

    public final int y(java.util.ArrayList arrayList, km2.t tVar, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((km2.t) it.next()).d(tVar) == 0) {
                break;
            }
            i17++;
        }
        if (i17 > 0) {
            arrayList2.addAll(arrayList.subList(0, i17));
        }
        if (i17 < arrayList.size() - 1) {
            arrayList3.addAll(arrayList.subList(i17 + 1, arrayList.size()));
        }
        return i17;
    }

    public final void z(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, km2.t tVar, java.util.ArrayList arrayList3, com.tencent.mm.protobuf.g gVar) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sidebar switchList preList:");
        sb6.append(arrayList2.size());
        sb6.append(", sufList:");
        sb6.append(arrayList3.size());
        sb6.append(", lastBuf:");
        sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.f192156a.length) : null);
        com.tencent.mars.xlog.Log.i("FinderLivePresenter", sb6.toString());
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.addAll(arrayList);
        arrayList.clear();
        pm0.v.b0(arrayList2, new vd2.t2(tVar));
        pm0.v.b0(arrayList3, new vd2.u2(tVar));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("sidebar switchList after filter preList:");
        sb7.append(arrayList2.size());
        sb7.append(", sufList:");
        sb7.append(arrayList3.size());
        sb7.append(", lastBuf:");
        sb7.append(gVar != null ? java.lang.Integer.valueOf(gVar.f192156a.length) : null);
        com.tencent.mars.xlog.Log.i("FinderLivePresenter", sb7.toString());
        arrayList.addAll(arrayList2);
        arrayList.add(tVar);
        arrayList.addAll(arrayList3);
        int size = arrayList2.size();
        java.util.Iterator it = arrayList4.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((km2.t) it.next()).d(tVar) == 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        km2.n nVar = dk2.ef.H;
        if (nVar != null) {
            nVar.h(size);
        }
        km2.n nVar2 = dk2.ef.H;
        km2.r rVar = nVar2 != null ? nVar2.f309151c : null;
        if (rVar != null) {
            rVar.f309196a = gVar;
        }
        vd2.u1 u1Var = this.f435943e;
        if (u1Var == null || (refreshLoadMoreLayout = ((com.tencent.mm.plugin.finder.live.FinderLiveViewCallback) u1Var).f111482d) == null || (recyclerView = refreshLoadMoreLayout.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        if (i17 < 0) {
            adapter.notifyDataSetChanged();
            return;
        }
        int size2 = (arrayList4.size() - i17) - 1;
        int size3 = arrayList2.size();
        int size4 = arrayList3.size();
        if (i17 > 0) {
            adapter.notifyItemRangeRemoved(0, i17);
        }
        if (size2 > 0) {
            adapter.notifyItemRangeRemoved(1, size2);
        }
        if (size3 > 0) {
            adapter.notifyItemRangeInserted(0, size3);
        }
        if (size4 > 0) {
            adapter.notifyItemRangeInserted(size3 + 1, size4);
        }
        com.tencent.mars.xlog.Log.i("FinderLivePresenter", "sidebar notify originCurPos:" + i17 + ", preRemoveCount:" + i17 + ", sufRemoveCount:" + size2 + ", preInsertCount:" + size3 + ", sufInsertCount:" + size4);
    }
}
