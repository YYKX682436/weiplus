package cp2;

/* loaded from: classes2.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f220798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f220799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f220800f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1 f220801g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(kotlin.jvm.internal.c0 c0Var, cp2.v0 v0Var, int i17, com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1 nearbyLivePresenter$createFeedLoader$1) {
        super(0);
        this.f220798d = c0Var;
        this.f220799e = v0Var;
        this.f220800f = i17;
        this.f220801g = nearbyLivePresenter$createFeedLoader$1;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList<so2.j5> linkedList;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        androidx.recyclerview.widget.f2 adapter;
        r45.dd2 dd2Var;
        cp2.v0 v0Var = this.f220799e;
        boolean Q6 = v0Var.f220937q.Q6(v0Var.v());
        java.util.LinkedList linkedList2 = new java.util.LinkedList(((ey2.c3) pf5.u.f353936a.e(c61.l7.class).a(ey2.c3.class)).O6(v0Var.v()).f257569b);
        java.util.Iterator it = linkedList2.iterator();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (((so2.j5) it.next()) instanceof com.tencent.mm.plugin.finder.feed.ys) {
                break;
            }
            i18++;
        }
        java.util.Iterator it6 = linkedList2.iterator();
        int i19 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i19 = -1;
                break;
            }
            so2.j5 j5Var = (so2.j5) it6.next();
            if ((j5Var instanceof so2.h4) && ((so2.h4) j5Var).f410401e > i18) {
                break;
            }
            i19++;
        }
        java.util.LinkedList<so2.j5> linkedList3 = (i18 == -1 || i18 >= linkedList2.size()) ? new java.util.LinkedList() : new java.util.LinkedList(linkedList2.subList(0, i18));
        if (i18 == -1 || i19 >= linkedList2.size() || !(linkedList2.get(i18) instanceof com.tencent.mm.plugin.finder.feed.ys)) {
            linkedList = new java.util.LinkedList();
        } else {
            java.lang.Object obj = linkedList2.get(i18);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderStreamCardFeed");
            linkedList = new java.util.LinkedList(((com.tencent.mm.plugin.finder.feed.ys) obj).f111194f);
        }
        for (so2.j5 j5Var2 : linkedList3) {
            if (j5Var2 instanceof so2.h1) {
                so2.h1 h1Var = (so2.h1) j5Var2;
                r45.nw1 liveInfo = h1Var.getFeedObject().getLiveInfo();
                if (!(liveInfo != null && liveInfo.getInteger(2) == 1)) {
                    com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "canTimelineRefresh isHardRefresh for beforeFollowDataList feed:".concat(pm0.v.u(h1Var.getFeedObject().getFeedObject().getId())));
                    Q6 = true;
                }
            }
        }
        for (so2.j5 j5Var3 : linkedList) {
            if (j5Var3 instanceof so2.h1) {
                so2.h1 h1Var2 = (so2.h1) j5Var3;
                r45.nw1 liveInfo2 = h1Var2.getFeedObject().getLiveInfo();
                if (!(liveInfo2 != null && liveInfo2.getInteger(2) == 1)) {
                    com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "canTimelineRefresh isHardRefresh for followDataList feed:".concat(pm0.v.u(h1Var2.getFeedObject().getFeedObject().getId())));
                    Q6 = true;
                }
            }
        }
        kotlin.jvm.internal.c0 c0Var = this.f220798d;
        c0Var.f310112d = Q6;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initData] canTimelineRefresh=");
        sb6.append(c0Var.f310112d);
        sb6.append(" targetPageForceRefreshFlag:");
        sb6.append(v0Var.f220932i);
        sb6.append(", incrementCount=");
        int i27 = this.f220800f;
        sb6.append(i27);
        sb6.append(" memoryCacheFlag:");
        sb6.append(v0Var.v());
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", sb6.toString());
        if (c0Var.f310112d || v0Var.f220932i) {
            v0Var.f220931h = 0;
            v0Var.c(0L, false);
        } else {
            v0Var.f220931h = 1;
            int v17 = v0Var.v();
            ey2.c3 c3Var = v0Var.f220937q;
            ey2.x2 O6 = c3Var.O6(v17);
            int i28 = O6.f257570c;
            int i29 = O6.f257571d;
            com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1 nearbyLivePresenter$createFeedLoader$1 = this.f220801g;
            com.tencent.mars.xlog.Log.i(nearbyLivePresenter$createFeedLoader$1.getF123427d(), "[initData] canTimelineRefresh " + c0Var.f310112d + " fromPreload:" + O6.f257575h + " lastPos=" + i28 + " fromTopPixel=" + i29);
            zo2.e eVar = v0Var.f220939s;
            if (eVar != null) {
                eVar.f474850b = i28;
                eVar.f474851c = i29;
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView g17 = ((cp2.q1) v0Var.z()).g();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = g17 != null ? g17.getLayoutManager() : null;
            if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i29));
                arrayList.add(java.lang.Integer.valueOf(i28));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$3$1$call$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$3$1$call$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                g17.post(new cp2.d0(layoutManager, i28, i29, v0Var));
            }
            v0Var.m(O6.f257577j);
            int i37 = c3Var.O6(v0Var.v()).f257576i;
            androidx.fragment.app.Fragment fragment = v0Var.f220933m;
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = fragment instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) fragment : null;
            java.util.LinkedList list3 = (nearbyLiveSquareTabFragment == null || (dd2Var = nearbyLiveSquareTabFragment.f121519s) == null) ? null : dd2Var.getList(6);
            if (list3 == null) {
                list3 = new java.util.LinkedList();
            }
            if (i37 != 0 && list3.size() > 0) {
                r45.dd2 dd2Var2 = new r45.dd2();
                int i38 = 0;
                r45.dd2 dd2Var3 = dd2Var2;
                int i39 = -1;
                for (java.lang.Object obj2 : list3) {
                    int i47 = i38 + 1;
                    if (i38 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.dd2 dd2Var4 = (r45.dd2) obj2;
                    if (dd2Var4.getInteger(0) == i37) {
                        i39 = i38;
                        dd2Var3 = dd2Var4;
                    }
                    i38 = i47;
                }
                int i48 = i39 + 1;
                com.tencent.mars.xlog.Log.i(nearbyLivePresenter$createFeedLoader$1.getF123427d(), "init subTab position subTabId:" + i37 + " subIndex:" + i39 + " realIndex:" + i48);
                androidx.recyclerview.widget.RecyclerView o17 = ((cp2.q1) v0Var.z()).o();
                if (i48 > 0) {
                    if (o17 != null && (adapter = o17.getAdapter()) != null) {
                        i17 = adapter.getItemCount();
                    }
                    if (i48 < i17) {
                        r45.dd2 dd2Var5 = v0Var.f220934n;
                        if (dd2Var5 != null && (list2 = dd2Var5.getList(6)) != null) {
                            list2.clear();
                        }
                        r45.dd2 dd2Var6 = v0Var.f220934n;
                        if (dd2Var6 != null && (list = dd2Var6.getList(6)) != null) {
                            list.add(dd2Var3);
                        }
                        androidx.fragment.app.Fragment fragment2 = v0Var.f220933m;
                        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment2 = fragment2 instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) fragment2 : null;
                        if (nearbyLiveSquareTabFragment2 != null) {
                            nearbyLiveSquareTabFragment2.f121520t = dd2Var3;
                        }
                        if (o17 != null) {
                            o17.post(new cp2.e0(v0Var, i48, o17));
                        }
                    }
                }
            }
            if (i27 <= 0) {
                v0Var.g(null);
            }
            if (O6.f257575h) {
                v0Var.p("fromPreload");
                tq2.d.f421230a.b("onHitPreloadEnd");
            } else {
                tq2.d.f421230a.b("onHitCache");
            }
        }
        qq2.b bVar = v0Var.f220938r;
        if (bVar != null) {
            bVar.f365936g = true;
        }
        return jz5.f0.f302826a;
    }
}
