package pl2;

/* loaded from: classes3.dex */
public final class l extends xx2.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f356631a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f356632b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f356633c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f356634d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f356635e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f356636f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f356637g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f356638h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f356639i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pl2.s f356640j;

    public l(pl2.s sVar) {
        this.f356640j = sVar;
    }

    @Override // xx2.d
    public void a(boolean z17) {
        java.lang.String str;
        java.util.ArrayList arrayList;
        pl2.s sVar;
        boolean z18;
        vd2.s1 s1Var;
        pl2.s sVar2 = this.f356640j;
        android.content.Context b17 = sVar2.b();
        pf5.z zVar = pf5.z.f353948a;
        if (!(b17 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) b17).a(pl2.x.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        pl2.x xVar = (pl2.x) a17;
        java.util.ArrayList sideBarDataList = sVar2.f356656k;
        java.lang.String str2 = sVar2.f356647b;
        if (!z17 || this.f356638h) {
            str = str2;
            arrayList = sideBarDataList;
            if (z17 || !this.f356638h) {
                sVar = sVar2;
            } else {
                pl2.w wVar = xVar.f356687m;
                wVar.getClass();
                long c17 = c01.id.c() - wVar.f356672b;
                pl2.x xVar2 = wVar.f356680j;
                android.app.Activity context = xVar2.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String chnlExtra = wVar.a(wVar.a(wVar.a(wVar.a(((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).f135388t, "event_type", "2"), "model_operat_type", java.lang.String.valueOf(wVar.f356678h)), "model_stay_time", java.lang.String.valueOf(c17)), "active_id", java.lang.String.valueOf(wVar.f356671a));
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                r0Var.getClass();
                kotlin.jvm.internal.o.g(chnlExtra, "chnlExtra");
                ml2.b4 b4Var = ml2.b4.X;
                ml2.q1 q1Var = ml2.q1.f327812e;
                ml2.r0.hj(r0Var, b4Var, "", 0L, null, "temp_33", chnlExtra, null, null, 204, null);
                com.tencent.mars.xlog.Log.i(xVar2.f356681d, xVar2.f356687m.hashCode() + "report reportExitSideBar " + wVar.f356678h + ", " + c17 + ", " + chnlExtra);
                wVar.f356678h = 2;
                wVar.f356679i.clear();
                sVar = sVar2;
                sVar.f356659n = false;
            }
            z18 = z17;
        } else {
            pl2.w wVar2 = xVar.f356687m;
            com.tencent.mm.view.recyclerview.WxRecyclerView c18 = sVar2.c();
            pl2.j jVar = new pl2.j(sVar2);
            wVar2.getClass();
            kotlin.jvm.internal.o.g(sideBarDataList, "sideBarDataList");
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = c18.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = c18.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            str = str2;
            arrayList = sideBarDataList;
            pm0.v.L("SideBarReport", true, new pl2.v(w17, ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).y(), wVar2, sideBarDataList, jVar));
            pl2.w wVar3 = xVar.f356687m;
            wVar3.getClass();
            wVar3.f356672b = c01.id.c();
            pl2.x xVar3 = wVar3.f356680j;
            android.app.Activity context2 = xVar3.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.String chnlExtra2 = wVar3.a(wVar3.a(wVar3.a(((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.ra.class))).f135388t, "event_type", "1"), "model_operat_type", java.lang.String.valueOf(wVar3.f356677g)), "active_id", java.lang.String.valueOf(wVar3.f356671a));
            ml2.r0 r0Var2 = (ml2.r0) i95.n0.c(ml2.r0.class);
            r0Var2.getClass();
            kotlin.jvm.internal.o.g(chnlExtra2, "chnlExtra");
            ml2.b4 b4Var2 = ml2.b4.X;
            ml2.q1 q1Var2 = ml2.q1.f327812e;
            ml2.r0.hj(r0Var2, b4Var2, "", 0L, null, "temp_33", chnlExtra2, null, null, 204, null);
            com.tencent.mars.xlog.Log.i(xVar3.f356681d, xVar3.f356687m.hashCode() + "report reportEnterSideBar " + wVar3.f356677g + ", " + chnlExtra2);
            wVar3.f356677g = 2;
            wVar3.f356679i.clear();
            com.tencent.mars.xlog.Log.i(str, "Interactive related mode entered. Suppressing further guides.");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_RELATED_LIVE_SWIPE_INVOKED_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            z18 = z17;
            sVar = sVar2;
        }
        xVar.P6(z18);
        if (z18) {
            android.widget.ImageView imageView = this.f356634d;
            if (imageView != null) {
                imageView.setVisibility(this.f356631a ? 0 : 8);
            }
            if (!sVar.f356652g) {
                android.widget.TextView textView = this.f356633c;
                if (textView != null && textView.getVisibility() == 0) {
                    sVar.f356652g = true;
                    i95.m c19 = i95.n0.c(zy2.zb.class);
                    kotlin.jvm.internal.o.f(c19, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c19;
                    ml2.c1 c1Var = ml2.c1.f327325e;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", 1);
                    ml2.y3 y3Var = ml2.y3.f328270e;
                    jSONObject.put("entrance_type", 15);
                    com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) sVar.b();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.tencent.mm.plugin.finder.assist.a9.a(com.tencent.mm.plugin.finder.assist.d9.f102093f, mMFragmentActivity, mMFragmentActivity.getResources().getString(com.tencent.mm.R.string.f9y), 500L, null, 8, null);
                    jSONObject.put("entrance_id", currentTimeMillis);
                    zy2.zb.j5(zbVar, 36L, jSONObject.toString(), null, 4, null);
                    com.tencent.mars.xlog.Log.i(str, "Report KTV room entrance exposure when sidebar opened");
                }
            }
        } else {
            this.f356631a = false;
            android.widget.ImageView imageView2 = this.f356634d;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        int childCount = sVar.c().getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = sVar.c().getChildAt(i17);
            kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
            androidx.recyclerview.widget.k3 w07 = sVar.c().w0(childAt);
            kotlin.jvm.internal.o.f(w07, "getChildViewHolder(...)");
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = (com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) childAt.findViewById(com.tencent.mm.R.id.toa);
            if (!z18) {
                com.tencent.mars.xlog.Log.i(str, "Stopping sidebar item play. " + w07.getAdapterPosition());
                nearbyLivePreviewView.stop();
                nearbyLivePreviewView.release();
            } else if (!nearbyLivePreviewView.isPlaying()) {
                com.tencent.mars.xlog.Log.i(str, "Starting sidebar item play. " + w07.getAdapterPosition());
                nearbyLivePreviewView.t();
            }
        }
        pl2.m mVar = sVar.f356651f;
        if (mVar != null) {
            vd2.l4 l4Var = (vd2.l4) mVar;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "sidebar onDragFinished show:" + z18);
            pl2.s sVar3 = l4Var.f435805d;
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = l4Var.f435804c;
            if (z18) {
                finderLiveViewCallback.f111482d.setCanRefresh(false);
                vd2.j4 j4Var = new vd2.j4(finderLiveViewCallback, z18);
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView finderLiveRecyclerView = finderLiveViewCallback.f111492q;
                finderLiveRecyclerView.post(j4Var);
                sVar3.h(0);
                androidx.recyclerview.widget.f2 adapter = finderLiveRecyclerView.getAdapter();
                s1Var = adapter instanceof vd2.s1 ? (vd2.s1) adapter : null;
                if (s1Var != null) {
                    s1Var.z(finderLiveViewCallback.f111495t.f436054e, true);
                }
            } else {
                finderLiveViewCallback.f111482d.setCanRefresh(true);
                vd2.z4 z4Var = finderLiveViewCallback.f111495t;
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = z4Var.f436054e;
                if (finderLiveVisitorPluginLayout != null) {
                    finderLiveVisitorPluginLayout.showFromSideBar();
                }
                com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView finderLiveRecyclerView2 = finderLiveViewCallback.f111492q;
                androidx.recyclerview.widget.f2 adapter2 = finderLiveRecyclerView2.getAdapter();
                vd2.s1 s1Var2 = adapter2 instanceof vd2.s1 ? (vd2.s1) adapter2 : null;
                if (s1Var2 != null) {
                    s1Var2.J(false, "onDragFinished");
                }
                finderLiveRecyclerView2.post(new vd2.i4(finderLiveViewCallback, z18));
                sVar3.h(8);
                androidx.recyclerview.widget.f2 adapter3 = finderLiveRecyclerView2.getAdapter();
                s1Var = adapter3 instanceof vd2.s1 ? (vd2.s1) adapter3 : null;
                if (s1Var != null) {
                    s1Var.z(z4Var.f436054e, false);
                }
            }
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
            if (liveRoomControllerStore != null) {
                if2.z.f291153a.i(liveRoomControllerStore, new mf2.z(liveRoomControllerStore, z18));
            }
        }
        if (!z18 || arrayList.size() >= 2) {
            return;
        }
        sVar.c().post(new pl2.k(sVar));
    }

    @Override // xx2.d
    public void b(boolean z17) {
        pl2.s sVar = this.f356640j;
        android.content.Context b17 = sVar.b();
        pf5.z zVar = pf5.z.f353948a;
        if (!(b17 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.f356638h = ((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) b17).a(pl2.x.class)).f356683f;
        android.content.Context b18 = sVar.b();
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(b18 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((pl2.x) zVar2.a((androidx.appcompat.app.AppCompatActivity) b18).a(pl2.x.class)).P6(true);
        pl2.m mVar = sVar.f356651f;
        if (mVar != null) {
            vd2.l4 l4Var = (vd2.l4) mVar;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "sidebar onDragStarted toShow:" + z17);
            if (z17) {
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = l4Var.f435804c;
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = finderLiveViewCallback.f111495t.f436054e;
                if (finderLiveVisitorPluginLayout != null) {
                    finderLiveVisitorPluginLayout.clearForSideBar();
                }
                androidx.recyclerview.widget.f2 adapter = finderLiveViewCallback.f111492q.getAdapter();
                vd2.s1 s1Var = adapter instanceof vd2.s1 ? (vd2.s1) adapter : null;
                if (s1Var != null) {
                    s1Var.J(true, "onDragStarted");
                }
            }
            l4Var.f435805d.h(8);
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
            if (liveRoomControllerStore != null) {
                if2.z.f291153a.i(liveRoomControllerStore, new mf2.a0(liveRoomControllerStore, z17));
            }
        }
    }
}
