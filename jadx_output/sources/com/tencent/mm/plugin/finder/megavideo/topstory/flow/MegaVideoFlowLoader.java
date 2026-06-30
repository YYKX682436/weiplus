package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/megavideo/topstory/flow/MegaVideoFlowLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lso2/j5;", "com/tencent/mm/plugin/finder/megavideo/topstory/flow/u", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MegaVideoFlowLoader extends com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<so2.j5> {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f120884d;

    /* renamed from: e, reason: collision with root package name */
    public fp0.b f120885e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.megavideo.topstory.flow.a1 f120886f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.megavideo.topstory.flow.g f120887g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f120888h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.megavideo.topstory.flow.h f120889i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.megavideo.topstory.flow.d f120890m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f120891n;

    /* renamed from: o, reason: collision with root package name */
    public int f120892o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f120893p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f120894q;

    /* renamed from: r, reason: collision with root package name */
    public int f120895r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f120896s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f120897t;

    public MegaVideoFlowLoader(r45.qt2 qt2Var) {
        super(qt2Var);
        this.f120884d = jz5.h.b(com.tencent.mm.plugin.finder.megavideo.topstory.flow.z.f121036d);
        this.f120891n = jz5.h.b(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.a0(this));
        this.f120892o = 3;
    }

    public static final void b(com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader, boolean z17) {
        megaVideoFlowLoader.getClass();
        if (!megaVideoFlowLoader.d("onPreloadEnd", (vn2.a1) ((jz5.n) ((ey2.g1) pf5.u.f353936a.e(c61.l7.class).a(ey2.g1.class)).f257376e).getValue())) {
            vn2.u0.f438387a.m(megaVideoFlowLoader.getB(), "requestInit preload result is null!");
            super.requestInit(z17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.E(31240, 10021, 2);
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.g gVar = megaVideoFlowLoader.f120887g;
            if (gVar != null) {
                ((xn2.w0) gVar).a(0);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.E(31240, 10020, 1);
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.a1 a1Var = megaVideoFlowLoader.f120886f;
        if (a1Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            xn2.p0 p0Var = ((xn2.r) a1Var).f455571a;
            int longValue = (int) (currentTimeMillis - ((java.lang.Number) ((jz5.n) p0Var.f455546d).getValue()).longValue());
            ao2.a k17 = p0Var.k();
            k17.getClass();
            qg3.w wVar = k17.f12543l;
            if (wVar != null) {
                urgen.ur_54A4.UR_720C.UR_0403(((qg3.x) wVar).getCppPointer(), "CgiMainFeedList", true, longValue, 9);
            }
        }
    }

    public final com.tencent.mm.plugin.finder.megavideo.topstory.flow.g0 c() {
        return (com.tencent.mm.plugin.finder.megavideo.topstory.flow.g0) ((jz5.n) this.f120891n).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.megavideo.topstory.flow.u(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.megavideo.topstory.flow.x(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.String r28, vn2.a1 r29) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader.d(java.lang.String, vn2.a1):boolean");
    }

    public final void e(java.lang.String str, java.util.List list, com.tencent.mm.protobuf.g gVar, java.util.List list2, com.tencent.mm.protobuf.g gVar2) {
        int size = getDataList().size();
        g(str, gVar);
        c().a(list);
        if (list != null) {
            synchronized (list) {
                ((ey2.g1) pf5.u.f353936a.e(c61.l7.class).a(ey2.g1.class)).getClass();
            }
        }
        h(str, gVar2);
        synchronized (getDataList()) {
            java.util.List d17 = c().d();
            kotlin.jvm.internal.o.f(d17, "<get-seeLaterDetailList>(...)");
            bo2.c cVar = (bo2.c) kz5.n0.Z(d17);
            if (cVar != null) {
                java.util.AbstractCollection dataList = getDataList();
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lqi);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                dataList.add(new zn2.d(string));
                zn2.c cVar2 = (zn2.c) cu2.u.f222441a.o(cVar.getFeedObject(), 11001);
                if (vn2.u0.f438387a.b(cVar2)) {
                    getDataList().add(cVar2);
                }
            }
            java.util.AbstractCollection dataList2 = getDataList();
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lwb);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            dataList2.add(new zn2.b(string2, new android.view.ViewGroup.MarginLayoutParams(0, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn))));
            getDataList().addAll(list2);
        }
        int size2 = getDataList().size();
        vn2.u0.f438387a.m(getB(), str + " setCacheData, oriDataSize=" + size + ",afterDataSize=" + size2 + '!');
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.tencent.mm.plugin.finder.storage.h90.b(com.tencent.mm.plugin.finder.storage.FinderItem.Companion, ((zn2.a) it.next()).getFeedObject().getFeedObject(), 0, 2, null));
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            bu2.j.f24534a.n((com.tencent.mm.plugin.finder.storage.FinderItem) it6.next(), new bu2.h(7017, c01.id.c()));
        }
    }

    public final void f(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        com.tencent.mars.xlog.Log.i(getB(), "reddotInfoInRequestInit " + jbVar);
        this.f120894q = jbVar;
    }

    public final void g(java.lang.String source, com.tencent.mm.protobuf.g gVar) {
        kotlin.jvm.internal.o.g(source, "source");
        java.lang.String b17 = getB();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(ya.b.SOURCE);
        sb6.append(source);
        sb6.append(" setSeeLaterSessionBuffer ");
        sb6.append(gVar != null ? gVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(b17, sb6.toString());
        if (gVar != null) {
            this.f120896s = gVar;
        }
    }

    public final void h(java.lang.String str, com.tencent.mm.protobuf.g gVar) {
        java.lang.String b17 = getB();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(ya.b.SOURCE);
        sb6.append(str);
        sb6.append(" setTopStoryFlowLastBuffer ");
        sb6.append(gVar != null ? gVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(b17, sb6.toString());
        if (gVar != null) {
            this.f120897t = gVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if ((!r0.isEmpty()) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.util.List r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader.i(java.util.List, java.util.List):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public void onDead() {
        super.onDead();
        this.f120887g = null;
        this.f120889i = null;
        f(null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(response);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/MegaVideoFlowLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        kotlin.jvm.internal.o.g(response, "response");
        vn2.u0 u0Var = vn2.u0.f438387a;
        java.lang.String b17 = getB();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFetchDone lastResp=");
        sb6.append(this.f120890m);
        sb6.append(" \n curResp=");
        boolean z17 = response instanceof com.tencent.mm.plugin.finder.megavideo.topstory.flow.d;
        com.tencent.mm.protobuf.g gVar = null;
        sb6.append(z17 ? (com.tencent.mm.plugin.finder.megavideo.topstory.flow.d) response : null);
        u0Var.m(b17, sb6.toString());
        super.onFetchDone(response);
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.d dVar = z17 ? (com.tencent.mm.plugin.finder.megavideo.topstory.flow.d) response : null;
        if (dVar != null) {
            this.f120890m = dVar;
            java.util.List list = dVar.f120915a;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) obj).f120905a.getInteger(10) == 23) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                com.tencent.mm.plugin.finder.megavideo.topstory.flow.c cVar = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) obj;
                if (cVar != null) {
                    gVar = cVar.getLastBuffer();
                }
            }
            h("onFetchDone", gVar);
            c().a(dVar.f120916b);
            java.util.List list2 = dVar.f120916b;
            if (list2 != null) {
                synchronized (list2) {
                    ((ey2.g1) pf5.u.f353936a.e(c61.l7.class).a(ey2.g1.class)).getClass();
                }
            }
            for (com.tencent.mm.plugin.finder.megavideo.topstory.flow.c cVar2 : dVar.f120915a) {
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list3 = cVar2.f120906b.getList(1);
                if (list3 != null) {
                    java.util.ArrayList<com.tencent.mm.plugin.finder.storage.FinderItem> arrayList2 = new java.util.ArrayList(kz5.d0.q(list3, 10));
                    for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list3) {
                        com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                        kotlin.jvm.internal.o.d(finderObject);
                        arrayList2.add(h90Var.a(finderObject, 0));
                    }
                    for (com.tencent.mm.plugin.finder.storage.FinderItem finderItem : arrayList2) {
                        bu2.j jVar = bu2.j.f24534a;
                        r45.kv0 kv0Var = (r45.kv0) cVar2.f120905a.getCustom(1);
                        jVar.n(finderItem, new bu2.h(7017, kv0Var != null ? kv0Var.getLong(5) : 0L));
                    }
                }
            }
        }
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.g gVar2 = this.f120887g;
        if (gVar2 != null) {
            pm0.v.X(new xn2.u0(((xn2.w0) gVar2).f455585a));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/MegaVideoFlowLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchRefreshDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        yz5.a aVar = this.f120888h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void requestInit(boolean r14) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader.requestInit(boolean):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public boolean requestLoadMore(boolean z17) {
        vn2.u0.f438387a.m(getB(), "requestLoadMore");
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.g gVar = this.f120887g;
        if (gVar != null) {
            ((xn2.w0) gVar).a(2);
        }
        return super.requestLoadMore(z17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void requestPreload(com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        vn2.u0.f438387a.m(getB(), "requestPreload");
        super.requestPreload(n0Var);
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.g gVar = this.f120887g;
        if (gVar != null) {
            ((xn2.w0) gVar).a(9);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void requestRefresh() {
        vn2.u0.f438387a.m(getB(), "requestRefresh");
        super.requestRefresh();
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.g gVar = this.f120887g;
        if (gVar != null) {
            ((xn2.w0) gVar).a(1);
        }
    }
}
