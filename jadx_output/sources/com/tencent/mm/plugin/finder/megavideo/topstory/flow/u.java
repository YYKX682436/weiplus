package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes2.dex */
public final class u extends com.tencent.mm.plugin.finder.feed.model.internal.p0 {

    /* renamed from: d, reason: collision with root package name */
    public im5.c f121017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader f121018e;

    public u(com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader) {
        this.f121018e = megaVideoFlowLoader;
    }

    public static final void b(com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar, long j17, r45.l03 l03Var, com.tencent.mm.plugin.finder.megavideo.topstory.flow.c cVar) {
        uVar.getClass();
        boolean z17 = cVar.getErrType() == 0 && cVar.getErrCode() == 0;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.a1 a1Var = uVar.f121018e.f120886f;
        if (a1Var != null) {
            int integer = l03Var.getInteger(5);
            int i17 = (int) currentTimeMillis;
            xn2.p0 p0Var = ((xn2.r) a1Var).f455571a;
            if (i17 == 0) {
                i17 = (int) (java.lang.System.currentTimeMillis() - ((java.lang.Number) ((jz5.n) p0Var.f455546d).getValue()).longValue());
            }
            int i18 = i17;
            ao2.a k17 = p0Var.k();
            k17.getClass();
            qg3.w wVar = k17.f12543l;
            if (wVar != null) {
                urgen.ur_54A4.UR_720C.UR_0403(((qg3.x) wVar).getCppPointer(), "CgiMainFeedList", z17, i18, integer);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void alive() {
        super.alive();
        this.f121018e.f120885e = new mn2.m3(getTAG());
        this.f121017d = new im5.c();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void dead() {
        super.dead();
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader = this.f121018e;
        fp0.b bVar = megaVideoFlowLoader.f120885e;
        if (bVar != null) {
            bVar.reset();
        }
        megaVideoFlowLoader.f120885e = null;
        im5.c cVar = this.f121017d;
        if (cVar != null) {
            cVar.dead();
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.d dVar;
        jz5.f0 f0Var2;
        boolean z18;
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (obj2 instanceof com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) {
                    arrayList.add(obj2);
                }
            }
            java.lang.String tag = getTAG();
            this.f121018e.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                com.tencent.mm.plugin.finder.megavideo.topstory.flow.c cVar = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) next;
                if (cVar.getErrType() == 0 && cVar.getErrCode() == 0) {
                    arrayList2.add(next);
                }
            }
            java.util.List V0 = kz5.n0.V0(arrayList2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                java.lang.Object next2 = it6.next();
                if (((com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) next2).f120905a.getInteger(10) == 24) {
                    arrayList3.add(next2);
                }
            }
            int size = arrayList3.size();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                java.lang.Object next3 = it7.next();
                if (((com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) next3).f120905a.getInteger(10) == 23) {
                    arrayList4.add(next3);
                }
            }
            int size2 = arrayList4.size();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                java.lang.Object next4 = it8.next();
                if (((com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) next4).f120905a.getInteger(10) == 28) {
                    arrayList5.add(next4);
                }
            }
            int size3 = arrayList5.size();
            vn2.u0.f438387a.m(tag, "fetch result seeLaterSize=" + size + ",megaVideoSize=" + size2 + ",reddotVideoSize=" + size3 + ",validRespList=" + V0);
            java.util.ArrayList arrayList6 = (java.util.ArrayList) V0;
            if (!arrayList6.isEmpty()) {
                dVar = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.d(V0);
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.util.Iterator it9 = arrayList6.iterator();
                while (it9.hasNext()) {
                    java.util.List incrementList = ((com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) it9.next()).getIncrementList();
                    if (incrementList != null && (!incrementList.isEmpty())) {
                        so2.j5 j5Var = (so2.j5) kz5.n0.Z(incrementList);
                        if (j5Var instanceof bo2.c) {
                            arrayList7.add(cu2.u.f222441a.o(((bo2.c) j5Var).getFeedObject(), 11001));
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            for (java.lang.Object obj3 : incrementList) {
                                if (obj3 instanceof bo2.c) {
                                    arrayList8.add(obj3);
                                }
                            }
                            dVar.f120916b = arrayList8;
                        } else {
                            arrayList7.addAll(incrementList);
                        }
                    }
                }
                dVar.setIncrementList(arrayList7);
                com.tencent.mm.plugin.finder.megavideo.topstory.flow.c cVar2 = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) kz5.n0.Z(V0);
                dVar.setPullType(cVar2 != null ? cVar2.getPullType() : 0);
                java.util.Iterator it10 = arrayList6.iterator();
                loop7: while (true) {
                    while (it10.hasNext()) {
                        z18 = z18 || ((com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) it10.next()).getHasMore();
                    }
                }
                dVar.setHasMore(z18);
            } else {
                dVar = null;
            }
            jz5.f0 f0Var3 = jz5.f0.f302826a;
            if (dVar != null) {
                callback.onFetchDone(dVar);
                f0Var2 = f0Var3;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                vn2.u0 u0Var = vn2.u0.f438387a;
                java.lang.String tag2 = getTAG();
                java.lang.String msg = "fetch result is null,request=" + obj + '!';
                kotlin.jvm.internal.o.g(tag2, "tag");
                kotlin.jvm.internal.o.g(msg, "msg");
                com.tencent.mars.xlog.Log.e(tag2, "MegaVideoPath\t".concat(msg));
                callback.onFetchDone(new com.tencent.mm.plugin.finder.feed.model.internal.IResponse(0, 0, null, 7, null));
            }
            f0Var = f0Var3;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            vn2.u0 u0Var2 = vn2.u0.f438387a;
            java.lang.String tag3 = getTAG();
            java.lang.String msg2 = "fetch result error,request=" + obj + '!';
            kotlin.jvm.internal.o.g(tag3, "tag");
            kotlin.jvm.internal.o.g(msg2, "msg");
            com.tencent.mars.xlog.Log.e(tag3, "MegaVideoPath\t".concat(msg2));
            callback.onFetchDone(new com.tencent.mm.plugin.finder.feed.model.internal.IResponse(0, 0, null, 7, null));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(getTAG(), "LongVideo-Trace, fetchInit");
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader = this.f121018e;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.n nVar = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.n(megaVideoFlowLoader, this, callback);
        fp0.b bVar = megaVideoFlowLoader.f120885e;
        jz5.f0 f0Var = null;
        if (bVar != null) {
            bVar.b(new mn2.k3(nVar, null, 2, null));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(getTAG(), "fetchInit err,taskExecutor=" + megaVideoFlowLoader.f120885e);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader = this.f121018e;
        if (megaVideoFlowLoader.f120893p) {
            com.tencent.mars.xlog.Log.w(getTAG(), "fetchLoadMore but isLoadingMore now");
            return;
        }
        megaVideoFlowLoader.f120893p = true;
        com.tencent.mars.xlog.Log.w(getTAG(), "fetchLoadMore start prefetchLastFeedCount " + megaVideoFlowLoader.f120892o);
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.q qVar = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.q(megaVideoFlowLoader, this, callback);
        fp0.b bVar = megaVideoFlowLoader.f120885e;
        jz5.f0 f0Var = null;
        if (bVar != null) {
            bVar.b(new mn2.k3(qVar, null, 2, null));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(getTAG(), "fetchLoadMore err,taskExecutor=" + megaVideoFlowLoader.f120885e);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader = this.f121018e;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.t tVar = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.t(megaVideoFlowLoader, this, callback);
        fp0.b bVar = megaVideoFlowLoader.f120885e;
        jz5.f0 f0Var = null;
        if (bVar != null) {
            bVar.b(new mn2.k3(tVar, null, 2, null));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(getTAG(), "fetchRefresh err,taskExecutor=" + megaVideoFlowLoader.f120885e);
        }
    }
}
