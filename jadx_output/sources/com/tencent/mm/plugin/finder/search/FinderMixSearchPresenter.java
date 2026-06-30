package com.tencent.mm.plugin.finder.search;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderMixSearchPresenter;", "Lcom/tencent/mm/plugin/finder/search/k3;", "com/tencent/mm/plugin/finder/search/w2", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMixSearchPresenter implements com.tencent.mm.plugin.finder.search.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f125565d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f125566e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f125567f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f125568g;

    /* renamed from: h, reason: collision with root package name */
    public int f125569h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f125570i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f125571m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f125572n;

    /* renamed from: o, reason: collision with root package name */
    public int f125573o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f125574p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f125575q;

    /* renamed from: r, reason: collision with root package name */
    public final int f125576r;

    /* renamed from: s, reason: collision with root package name */
    public int f125577s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f125578t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f125579u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.l3 f125580v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$contactChangelistener$1 f125581w;

    /* JADX WARN: Type inference failed for: r1v5, types: [com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$contactChangelistener$1] */
    public FinderMixSearchPresenter(com.tencent.mm.ui.MMActivity context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f125565d = "Finder.FinderMixSearchPresenter";
        this.f125566e = "";
        this.f125571m = new java.util.ArrayList();
        this.f125572n = new java.util.LinkedHashMap();
        this.f125573o = 1;
        this.f125574p = new java.util.HashMap();
        this.f125575q = "";
        this.f125578t = new java.util.HashMap();
        this.f125579u = "";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f125581w = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedContactChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$contactChangelistener$1
            {
                this.__eventId = 797560056;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedContactChangeEvent feedContactChangeEvent) {
                com.tencent.mm.autogen.events.FeedContactChangeEvent event = feedContactChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.V(0L, new com.tencent.mm.plugin.finder.search.x2(event, com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter.this));
                return false;
            }
        };
        this.f125567f = context;
        this.f125576r = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.String r55, int r56, int r57, java.util.List r58, int r59) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter.c(java.lang.String, int, int, java.util.List, int):void");
    }

    public boolean f() {
        java.util.Collection values = ((java.util.LinkedHashMap) this.f125572n).values();
        if ((values instanceof java.util.Collection) && values.isEmpty()) {
            return false;
        }
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            if (((nt2.a) it.next()).f339704c.size() > 0) {
                return true;
            }
        }
        return false;
    }

    public void g(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, android.content.Intent intent, java.util.List feedList) {
        com.tencent.mm.ui.MMActivity mMActivity;
        int i17;
        java.lang.Class cls;
        r45.rp1 rp1Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(feedList, "feedList");
        r45.b31 b31Var = new r45.b31();
        b31Var.set(6, this.f125566e);
        b31Var.set(0, this.f125568g);
        b31Var.set(1, java.lang.Integer.valueOf(this.f125569h));
        b31Var.set(2, 1);
        b31Var.set(4, this.f125570i);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(feedList, 10));
        java.util.Iterator it = feedList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Boolean.valueOf(b31Var.getList(3).add(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it.next()).getFeedObject().getFeedObject())));
        }
        java.util.Iterator it6 = b31Var.getList(3).iterator();
        int i18 = 0;
        while (true) {
            boolean hasNext = it6.hasNext();
            com.tencent.mm.ui.MMActivity context = this.f125567f;
            if (!hasNext) {
                mMActivity = context;
                i17 = 5;
                cls = com.tencent.mm.plugin.finder.viewmodel.component.ny.class;
                break;
            }
            int i19 = i18 + 1;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it6.next();
            if (feed.getFeedObject().getFeedObject().getId() == finderObject.getId()) {
                b31Var.set(5, java.lang.Integer.valueOf(i18));
                int i27 = this.f125573o;
                java.lang.String Ui = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(finderObject.getId());
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
                java.lang.String str = this.f125566e;
                java.lang.String str2 = this.f125568g;
                java.lang.String str3 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125208d;
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                mMActivity = context;
                cls = com.tencent.mm.plugin.finder.viewmodel.component.ny.class;
                com.tencent.mm.plugin.finder.report.o3.Ij(o3Var, str, str2, 3, 3, Ui, i18, 4, 1, str3, 2, i27, nyVar != null ? nyVar.V6() : null, null, 0, 12288, null);
                i17 = 5;
            } else {
                i18 = i19;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(feed.getFeedObject().getFeedObject().getUsername(), xy2.c.e(mMActivity))) {
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            c61.ub ubVar = (c61.ub) c18;
            com.tencent.mm.ui.MMActivity mMActivity2 = this.f125567f;
            long id6 = feed.getFeedObject().getFeedObject().getId();
            java.lang.String objectNonceId = feed.getFeedObject().getFeedObject().getObjectNonceId();
            java.lang.String str4 = objectNonceId == null ? "" : objectNonceId;
            r45.nw1 liveInfo = feed.getFeedObject().getFeedObject().getLiveInfo();
            if (liveInfo == null) {
                liveInfo = new r45.nw1();
            }
            c61.ub.Rf(ubVar, mMActivity2, id6, str4, liveInfo, null, null, null, null, feed.g0(), null, null, 1776, null);
            return;
        }
        com.tencent.mm.ui.MMActivity activity = mMActivity;
        kotlin.jvm.internal.o.g(activity, "activity");
        int i28 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(cls)).f135380n;
        n30.q qVar = (n30.q) i95.n0.c(n30.q.class);
        ml2.q1 q1Var = ml2.q1.f327812e;
        ((m30.m) qVar).getClass();
        a52.a.d("temp_4");
        r45.nw1 liveInfo2 = feed.getFeedObject().getFeedObject().getLiveInfo();
        intent.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", liveInfo2 != null ? liveInfo2.getInteger(42) : 0);
        r45.nw1 liveInfo3 = feed.getFeedObject().getFeedObject().getLiveInfo();
        if (liveInfo3 != null && (rp1Var = (r45.rp1) liveInfo3.getCustom(45)) != null) {
            intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", rp1Var.toByteArray());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(feed.getFeedObject().getFeedObject());
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(i17, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(1, java.lang.Integer.valueOf(i28));
        y74Var.set(i17, feed.getFeedObject().getFeedObject());
        wk0Var.set(6, y74Var);
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(this.f125567f, intent, arrayList2, 0, wk0Var, null);
    }

    public final void h(java.util.List list, int i17, yz5.l lVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a((com.tencent.mm.protocal.protobuf.FinderObject) it.next(), 16));
            if (!p17.getFeedObject().getMediaList().isEmpty()) {
                lVar.invoke(p17);
            }
            if (p17 instanceof so2.h1) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((com.tencent.mm.plugin.finder.report.o3) c17).qk(p17.getItemId(), p17.w(), i17, p17.g0(), (r20 & 16) != 0 ? 0L : 0L, (r20 & 32) != 0 ? null : null);
            }
            arrayList.add(jz5.f0.f302826a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0467  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r51, int r52, bq.o1 r53, r45.tu2 r54) {
        /*
            Method dump skipped, instructions count: 2460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter.i(int, int, bq.o1, r45.tu2):void");
    }

    public void m(com.tencent.mm.plugin.finder.model.BaseFinderFeed finderFeedObj, java.util.List feedList, int i17, android.view.View view) {
        com.tencent.mm.ui.MMActivity mMActivity;
        kotlin.jvm.internal.o.g(finderFeedObj, "finderFeedObj");
        kotlin.jvm.internal.o.g(feedList, "feedList");
        kotlin.jvm.internal.o.g(view, "view");
        r45.b31 b31Var = new r45.b31();
        b31Var.set(6, this.f125566e);
        int i18 = 0;
        b31Var.set(0, this.f125568g);
        b31Var.set(1, java.lang.Integer.valueOf(this.f125569h));
        b31Var.set(2, 1);
        b31Var.set(4, this.f125570i);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(feedList, 10));
        java.util.Iterator it = feedList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Boolean.valueOf(b31Var.getList(3).add(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it.next()).getFeedObject().getFeedObject())));
        }
        java.util.Iterator it6 = b31Var.getList(3).iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            com.tencent.mm.ui.MMActivity context = this.f125567f;
            if (!hasNext) {
                mMActivity = context;
                break;
            }
            int i19 = i18 + 1;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it6.next();
            if (finderFeedObj.getFeedObject().getFeedObject().getId() == finderObject.getId()) {
                b31Var.set(5, java.lang.Integer.valueOf(i18));
                int i27 = this.f125573o;
                java.lang.String Ui = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(finderObject.getId());
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                java.lang.String str = this.f125566e;
                java.lang.String str2 = this.f125568g;
                java.lang.String str3 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125208d;
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                o3Var.Hj(str, str2, 0, 2, Ui, i18, 1, 1, str3, 2, i27, nyVar != null ? nyVar.V6() : null);
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) c17;
                java.lang.String str4 = this.f125566e;
                java.lang.String str5 = this.f125568g;
                java.lang.String str6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125208d;
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                com.tencent.mm.plugin.finder.report.o3.Ij(o3Var2, str4, str5, 0, 2, Ui, i18, 1, 1, str6, 2, i27, nyVar2 != null ? nyVar2.V6() : null, null, i17, 4096, null);
                mMActivity = context;
            } else {
                i18 = i19;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str7 = this.f125568g;
        if (str7 == null) {
            str7 = "";
        }
        intent.putExtra("KEY_SEARCH_WRORD", str7);
        com.tencent.mm.plugin.finder.viewmodel.component.ny.L1.c(mMActivity, intent);
        wa2.x.e(intent, view, 0L, false, false, null, 30, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).wj(mMActivity, b31Var, intent);
    }

    @Override // fs2.a
    public void onDetach() {
        q(true);
        dead();
    }

    public jz5.l p(int i17) {
        jz5.l lVar;
        nt2.a aVar = (nt2.a) ((java.util.LinkedHashMap) this.f125572n).get(java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.MMActivity activity = this.f125567f;
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        java.util.HashMap hashMap = this.f125578t;
        if (i17 == -1 && this.f125577s == 1) {
            java.lang.String str = this.f125568g;
            if (str != null) {
                bq.o1 o1Var = new bq.o1(str, this.f125569h, this.f125566e, this.f125570i, this.f125576r, V6, null, null, null, null, true, 0, com.tencent.shadow.dynamic.host.FailedException.ERROR_CODE_RELOAD_LOADER_EXCEPTION, null);
                if (hashMap.containsKey(o1Var.t())) {
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    return new jz5.l(bool, bool);
                }
                pm0.v.T(o1Var.l(), new com.tencent.mm.plugin.finder.search.b3(this, o1Var)).f(activity);
                hashMap.put(o1Var.t(), o1Var);
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                return new jz5.l(bool2, bool2);
            }
            lVar = new jz5.l(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
        } else {
            if (i17 > 0) {
                if (aVar != null && aVar.f339705d == 1) {
                    java.lang.String str2 = this.f125568g;
                    if (str2 != null) {
                        bq.o1 o1Var2 = new bq.o1(str2, this.f125569h, this.f125566e, aVar.f339706e, aVar.f339707f, V6, null, null, null, null, true, i17, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, null);
                        if (hashMap.containsKey(o1Var2.t())) {
                            return new jz5.l(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
                        }
                        pm0.v.T(o1Var2.l(), new com.tencent.mm.plugin.finder.search.c3(this, o1Var2)).f(activity);
                        hashMap.put(o1Var2.t(), o1Var2);
                        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                        return new jz5.l(bool3, bool3);
                    }
                    lVar = new jz5.l(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
                }
            }
            lVar = new jz5.l(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
        }
        return lVar;
    }

    public final void q(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f125566e)) {
            return;
        }
        java.util.HashMap hashMap = this.f125574p;
        if (!hashMap.isEmpty()) {
            com.tencent.mm.plugin.finder.report.t3.f125364a.a(this.f125566e, this.f125568g, 0, hashMap, 1);
            if (z17) {
                hashMap.clear();
            }
        }
    }

    public void s(java.lang.String query, int i17, boolean z17, com.tencent.mm.protobuf.g gVar, int i18) {
        kotlin.jvm.internal.o.g(query, "query");
        jx3.f.INSTANCE.idkeyStat(1265L, 3L, 1L, false);
        q(true);
        this.f125569h = 0;
        this.f125577s = 0;
        this.f125570i = null;
        this.f125571m.clear();
        ((java.util.LinkedHashMap) this.f125572n).clear();
        this.f125568g = query;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f125566e = uuid;
        java.util.HashMap hashMap = this.f125578t;
        java.util.HashMap hashMap2 = new java.util.HashMap(hashMap);
        hashMap.clear();
        java.util.Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            ((bq.o1) ((java.util.Map.Entry) it.next()).getValue()).j();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(query)) {
            int i19 = z17 ? 10 : i18;
            int i27 = this.f125569h;
            java.lang.String str = this.f125566e;
            com.tencent.mm.protobuf.g gVar2 = this.f125570i;
            com.tencent.mm.ui.MMActivity activity = this.f125567f;
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            bq.o1 o1Var = new bq.o1(query, i27, str, gVar2, i19, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), gVar, null, null, null, false, 0, 3968, null);
            pm0.v.T(o1Var.l(), new com.tencent.mm.plugin.finder.search.d3(this, o1Var)).f(activity);
            hashMap.put(o1Var.t(), o1Var);
            com.tencent.mm.plugin.finder.search.l3 l3Var = this.f125580v;
            if (l3Var != null) {
                com.tencent.mm.plugin.finder.search.t3 t3Var = (com.tencent.mm.plugin.finder.search.t3) l3Var;
                android.view.View view = t3Var.f125867q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                t3Var.f125863m.setVisibility(8);
                android.view.View view2 = t3Var.f125864n;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                on5.c loadMoreFooter = t3Var.f125861h.getLoadMoreFooter();
                android.view.View view3 = loadMoreFooter != null ? loadMoreFooter.getView() : null;
                if (view3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                on5.c loadMoreFooter2 = t3Var.f125862i.getLoadMoreFooter();
                android.view.View view4 = loadMoreFooter2 != null ? loadMoreFooter2.getView() : null;
                if (view4 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                jz5.g gVar3 = t3Var.f125866p;
                android.view.ViewGroup.LayoutParams layoutParams = ((com.google.android.material.appbar.AppBarLayout) ((jz5.n) gVar3).getValue()).getLayoutParams();
                androidx.coordinatorlayout.widget.c cVar = layoutParams instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams : null;
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = cVar != null ? cVar.f11006a : null;
                com.google.android.material.appbar.AppBarLayout.Behavior behavior2 = behavior instanceof com.google.android.material.appbar.AppBarLayout.Behavior ? (com.google.android.material.appbar.AppBarLayout.Behavior) behavior : null;
                if (behavior2 != null && behavior2.y() != 0) {
                    behavior2.B(0);
                    ((com.google.android.material.appbar.AppBarLayout) ((jz5.n) gVar3).getValue()).d(true, false, true);
                }
                androidx.recyclerview.widget.RecyclerView recyclerView = t3Var.f125868r;
                if (recyclerView != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(recyclerView, arrayList5.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView.a1(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
                androidx.recyclerview.widget.RecyclerView recyclerView2 = t3Var.f125869s;
                if (recyclerView2 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(recyclerView2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView2.a1(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(recyclerView2, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
                com.tencent.mm.ui.MMActivity activity2 = t3Var.f125857d;
                kotlin.jvm.internal.o.g(activity2, "activity");
                for (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment : ((mt2.h) zVar.a(activity2).a(mt2.h.class)).Y6()) {
                    com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment finderMixSearchFeedFragment = finderHomeTabFragment instanceof com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment ? (com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment) finderHomeTabFragment : null;
                    if (finderMixSearchFeedFragment != null) {
                        on5.c loadMoreFooter3 = finderMixSearchFeedFragment.z0().getLoadMoreFooter();
                        android.view.View view5 = loadMoreFooter3 != null ? loadMoreFooter3.getView() : null;
                        if (view5 != null) {
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList7.add(8);
                            java.util.Collections.reverse(arrayList7);
                            android.view.View view6 = view5;
                            yj0.a.d(view6, arrayList7.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view5.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                            yj0.a.f(view6, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        androidx.recyclerview.widget.RecyclerView y07 = finderMixSearchFeedFragment.y0();
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList8.add(0);
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(y07, arrayList8.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment", "onStartSearch", "()V", "Undefined", "scrollToPosition", "(I)V");
                        y07.a1(((java.lang.Integer) arrayList8.get(0)).intValue());
                        yj0.a.f(y07, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment", "onStartSearch", "()V", "Undefined", "scrollToPosition", "(I)V");
                    }
                }
            }
        }
        this.f125573o = i17;
    }
}
