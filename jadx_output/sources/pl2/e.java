package pl2;

/* loaded from: classes3.dex */
public final class e implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl2.s f356621d;

    public e(pl2.s sVar) {
        this.f356621d = sVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        km2.m mVar;
        com.tencent.mm.live.api.LiveConfig liveConfig;
        km2.m mVar2;
        com.tencent.mm.live.api.LiveConfig liveConfig2;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        pl2.s sVar = this.f356621d;
        java.lang.String str = sVar.f356647b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemclick position:");
        sb6.append(i17);
        sb6.append(", sideBarDataList.size:");
        java.util.ArrayList arrayList = sVar.f356656k;
        sb6.append(arrayList.size());
        sb6.append(", curPosition:");
        sb6.append(sVar.f356657l);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (i17 < 0 || i17 > arrayList.size() || sVar.f356657l == i17) {
            return;
        }
        android.content.Context b17 = sVar.b();
        pf5.z zVar = pf5.z.f353948a;
        if (!(b17 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) b17).a(pl2.x.class)).f356687m.f356674d = i17;
        android.content.Context b18 = sVar.b();
        if (!(b18 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        pl2.w wVar = ((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) b18).a(pl2.x.class)).f356687m;
        pl2.a aVar = (pl2.a) kz5.n0.a0(arrayList, i17);
        wVar.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("banner_type", "common_recmd");
        int i18 = wVar.f356671a;
        linkedHashMap.put("active_id", java.lang.String.valueOf(i18));
        linkedHashMap.put("active_index", java.lang.String.valueOf(i17));
        if (aVar != null) {
            km2.m mVar3 = aVar.f356616d;
            linkedHashMap.put("liveId", pm0.v.u(mVar3.f309129d.f68537e));
            linkedHashMap.put("feedId", pm0.v.u(mVar3.f309129d.f68549s));
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f328006y1, linkedHashMap, null, null, null, null, false, 124, null);
        java.lang.String str2 = wVar.f356680j.f356681d;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("report reportSideBarItemClick ");
        sb7.append(i18);
        sb7.append(", ");
        sb7.append(i17);
        sb7.append(", ");
        long j17 = 0;
        sb7.append(pm0.v.u((aVar == null || (mVar2 = aVar.f356616d) == null || (liveConfig2 = mVar2.f309129d) == null) ? 0L : liveConfig2.f68537e));
        sb7.append(", ");
        if (aVar != null && (mVar = aVar.f356616d) != null && (liveConfig = mVar.f309129d) != null) {
            j17 = liveConfig.f68549s;
        }
        sb7.append(pm0.v.u(j17));
        sb7.append(' ');
        com.tencent.mars.xlog.Log.i(str2, sb7.toString());
        int i19 = sVar.f356657l;
        sVar.g(i17);
        pl2.m mVar4 = sVar.f356651f;
        if (mVar4 != null) {
            vd2.l4 l4Var = (vd2.l4) mVar4;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "lxltest onSelectLive fromPos:" + i19 + ", to:" + i17);
            km2.n nVar = l4Var.f435806e;
            if (i17 >= 0 && i17 < nVar.f309153e.size()) {
                boolean z17 = i19 >= 0 && i19 < nVar.f309153e.size();
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = l4Var.f435804c;
                if (!z17 || java.lang.Math.abs(i19 - i17) <= 1) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "lxltest onSelectLive step3 pos:" + i17);
                    finderLiveViewCallback.z(i17, -1);
                    return;
                }
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("lxltest onSelectLive step1 pos:");
                sb8.append(i17 > i19 ? i17 - 1 : i17 + 1);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", sb8.toString());
                finderLiveViewCallback.L = true;
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView finderLiveRecyclerView = finderLiveViewCallback.f111492q;
                int i27 = i17 > i19 ? i17 - 1 : i17 + 1;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i27));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(finderLiveRecyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$3", "onSelectLive", "(II)V", "Undefined", "scrollToPosition", "(I)V");
                finderLiveRecyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(finderLiveRecyclerView, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$3", "onSelectLive", "(II)V", "Undefined", "scrollToPosition", "(I)V");
                finderLiveViewCallback.f111492q.post(new vd2.k4(i17, finderLiveViewCallback));
            }
        }
    }
}
