package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class a2 extends com.tencent.mm.plugin.finder.profile.uic.i6 implements in5.x {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f123518i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f123519m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f123520n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f123521o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f123522p;

    /* renamed from: q, reason: collision with root package name */
    public final cs2.i f123523q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123518i = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.z1(this));
        this.f123519m = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.y1(this));
        this.f123520n = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.s1(this));
        this.f123521o = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.o1(this));
        this.f123522p = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.p1(this));
        this.f123523q = new cs2.i(getContext(), getContextObj().getInteger(5));
    }

    public final java.util.ArrayList O6() {
        return (java.util.ArrayList) ((jz5.n) this.f123521o).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b6e;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView getRecyclerView() {
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.f123519m).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.i6, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.class);
        finderProfileAllLayoutUIC.getClass();
        bu2.g0 g0Var = bu2.g0.f24511a;
        java.lang.String username = finderProfileAllLayoutUIC.getUsername();
        if (username == null) {
            username = "";
        }
        bu2.f0 a17 = g0Var.a(username);
        r45.nb1 nb1Var = a17 != null ? a17.f24507d : null;
        if (nb1Var == null) {
            finderProfileAllLayoutUIC.X6(true);
        } else {
            finderProfileAllLayoutUIC.Y6(nb1Var);
        }
        finderProfileAllLayoutUIC.f123420m = kotlinx.coroutines.l.d(finderProfileAllLayoutUIC.getMainScope(), null, null, new com.tencent.mm.plugin.finder.profile.uic.z0(finderProfileAllLayoutUIC, null), 3, null);
        jz5.g gVar = this.f123522p;
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default((com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader) ((jz5.n) gVar).getValue(), new com.tencent.mm.plugin.finder.profile.uic.u1(((vb2.w) ((jz5.n) this.f123518i).getValue()).f434754c), false, 2, null);
        ((com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader) ((jz5.n) gVar).getValue()).onAlive();
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView = getRecyclerView();
        jz5.g gVar2 = this.f123520n;
        recyclerView.setLayoutManager(((com.tencent.mm.plugin.finder.profile.d) ((jz5.n) gVar2).getValue()).d(getContext()));
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView2 = getRecyclerView();
        com.tencent.mm.plugin.finder.profile.d dVar = (com.tencent.mm.plugin.finder.profile.d) ((jz5.n) gVar2).getValue();
        dVar.getClass();
        recyclerView2.N(new com.tencent.mm.plugin.finder.profile.b(dVar));
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView3 = getRecyclerView();
        com.tencent.mm.plugin.finder.profile.d dVar2 = (com.tencent.mm.plugin.finder.profile.d) ((jz5.n) gVar2).getValue();
        dVar2.getClass();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new com.tencent.mm.plugin.finder.profile.FinderProfileAllLayoutConfig$getItemConvertFactory$1(dVar2, null), O6(), false);
        wxRecyclerAdapter.f293105o = this;
        recyclerView3.setAdapter(wxRecyclerAdapter);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.B = new com.tencent.mm.plugin.finder.profile.uic.v1(this);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView4 = getRecyclerView();
        kotlin.jvm.internal.o.f(recyclerView4, "<get-recyclerView>(...)");
        in5.o.b(recyclerView4, new com.tencent.mm.plugin.finder.profile.uic.w1(this), com.tencent.mm.plugin.finder.profile.uic.x1.f124339d);
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment != null) {
            androidx.lifecycle.c1 a18 = zVar.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a18).Z6(-1);
            if (Z6 != null) {
                com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView5 = getRecyclerView();
                kotlin.jvm.internal.o.f(recyclerView5, "<get-recyclerView>(...)");
                Z6.d(recyclerView5);
            }
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView6 = getRecyclerView();
        kotlin.jvm.internal.o.f(recyclerView6, "<get-recyclerView>(...)");
        this.f123523q.b(recyclerView6, getContextObj());
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            or2.j jVar = or2.j.f347656a;
            com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView7 = getRecyclerView();
            kotlin.jvm.internal.o.f(recyclerView7, "<get-recyclerView>(...)");
            jVar.a(recyclerView7, com.tencent.mm.plugin.finder.profile.uic.a2.class.getSimpleName());
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader) ((jz5.n) this.f123522p).getValue()).onDead();
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        kotlinx.coroutines.r2 r2Var = ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.class)).f123420m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f123523q.f();
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        boolean z17;
        boolean z18;
        jz5.f0 f0Var;
        java.lang.String string;
        boolean z19;
        boolean z27;
        java.util.ArrayList arrayList;
        java.lang.Class<com.tencent.mm.plugin.finder.assist.i0> cls;
        in5.s0 s0Var;
        int i18;
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        in5.c cVar = (in5.c) holder.f293125i;
        in5.n0 n0Var = adapter instanceof in5.n0 ? (in5.n0) adapter : null;
        int a07 = n0Var != null ? n0Var.a0() : 0;
        int h17 = cVar.h();
        boolean z28 = h17 == 2 || h17 == 4 || h17 == 9;
        com.tencent.mm.plugin.finder.profile.uic.p0 p0Var = com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.f123413t;
        java.lang.String str2 = "<get-recyclerView>(...)";
        java.lang.String str3 = "getContext(...)";
        if (z28) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar : null;
            if (baseFinderFeed == null) {
                return;
            }
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment D7 = ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) a17).D7(com.tencent.mm.plugin.finder.profile.FinderProfileFeedFragment.class);
            if (D7 == null) {
                return;
            }
            androidx.fragment.app.Fragment fragment = getFragment();
            kotlin.jvm.internal.o.d(fragment);
            com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader = ((com.tencent.mm.plugin.finder.profile.uic.dk) zVar.b(fragment).a(com.tencent.mm.plugin.finder.profile.uic.dk.class)).getFeedLoader();
            if (feedLoader.getDataList().isEmpty()) {
                java.util.AbstractCollection dataList = feedLoader.getDataList();
                java.util.ArrayList O6 = O6();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : O6) {
                    int i19 = a07;
                    so2.j5 j5Var = (so2.j5) obj;
                    in5.s0 s0Var2 = holder;
                    java.lang.String str4 = str2;
                    if (j5Var.h() == 4 || j5Var.h() == 2 || j5Var.h() == 9) {
                        arrayList2.add(obj);
                    }
                    a07 = i19;
                    holder = s0Var2;
                    str2 = str4;
                }
                s0Var = holder;
                i18 = a07;
                str = str2;
                dataList.addAll(arrayList2);
            } else {
                s0Var = holder;
                i18 = a07;
                str = "<get-recyclerView>(...)";
            }
            java.util.ArrayList dataListJustForAdapter = feedLoader.getDataListJustForAdapter();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it = dataListJustForAdapter.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                so2.j5 j5Var2 = (so2.j5) next;
                java.util.Iterator it6 = it;
                if (j5Var2.h() == 4 || j5Var2.h() == 2 || j5Var2.h() == 9) {
                    arrayList3.add(next);
                }
                it = it6;
            }
            int indexOf = arrayList3.indexOf(cVar);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            int i27 = (activity.getIntent().getIntExtra("key_click_avatar_type", 0) == 1 || activity.getIntent().getIntExtra("key_enter_profile_type", 0) == 11) ? 1 : activity.getIntent().getBooleanExtra("key_is_from_slide", false) ? 2 : 3;
            org.json.JSONObject e27 = baseFinderFeed.e2();
            e27.put("tab_seat", p0Var.a(getContext(), baseFinderFeed.getFeedObject().getProfileTabScene()));
            e27.put("enter_profile_method", i27);
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC) pf5.z.f353948a.b(D7).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC.class);
            com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView = getRecyclerView();
            kotlin.jvm.internal.o.f(recyclerView, str);
            finderProfileFeedUIC.onClickFeed(feedLoader, baseFinderFeed, indexOf, s0Var, i18, recyclerView, O6(), e27, 1);
            baseFinderFeed.v1(false);
            androidx.recyclerview.widget.f2 adapter2 = getRecyclerView().getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemChanged(i17);
                return;
            }
            return;
        }
        int hashCode = com.tencent.mm.plugin.finder.playlist.e.class.hashCode();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        java.lang.Class<com.tencent.mm.plugin.finder.assist.i0> cls2 = com.tencent.mm.plugin.finder.assist.i0.class;
        if (h17 == hashCode) {
            java.lang.Object obj2 = holder.f293125i;
            com.tencent.mm.plugin.finder.playlist.e eVar = obj2 instanceof com.tencent.mm.plugin.finder.playlist.e ? (com.tencent.mm.plugin.finder.playlist.e) obj2 : null;
            if (eVar == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            r45.vx0 vx0Var = eVar.f122291d;
            intent.putExtra("key_topic_type", vx0Var.getInteger(21));
            java.lang.String string2 = vx0Var.getString(1);
            java.lang.String str5 = string2 != null ? string2 : "";
            long j17 = vx0Var.getLong(0);
            intent.putExtra("key_topic_title", str5);
            intent.putExtra("KEY_TOPIC_ID", j17);
            intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", true);
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, getContext(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(cls2)).il(getContext(), intent);
            return;
        }
        if (!(h17 == 628 || h17 == 629 || h17 == so2.q2.class.hashCode())) {
            if (h17 == so2.m0.class.getName().hashCode()) {
                so2.m0 m0Var = (so2.m0) holder.f293125i;
                android.app.Activity activity2 = getContext();
                bw5.ra data = m0Var.f410478d;
                kotlin.jvm.internal.o.g(data, "data");
                kotlin.jvm.internal.o.g(activity2, "activity");
                if (activity2 instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) {
                    java.lang.String ProductID = data.f32456d;
                    kotlin.jvm.internal.o.f(ProductID, "ProductID");
                    qk.c0 c0Var = new qk.c0(ProductID);
                    c0Var.f364198g = 106;
                    c0Var.f364155a = 56;
                    com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
                    if (p6Var == null) {
                        com.tencent.mars.xlog.Log.e("FinderProfileAllUIC", "emoticon liteapp service not found");
                        return;
                    } else {
                        ((com.tencent.mm.feature.emoji.f4) p6Var).wi(activity2, c0Var);
                        return;
                    }
                }
                if (activity2 instanceof com.tencent.mm.plugin.finder.feed.ui.FinderEmojiSelectUI) {
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                    finderJumpInfo.setJumpinfo_type(3);
                    finderJumpInfo.setBusiness_type(6);
                    finderJumpInfo.setWording(data.f32458f);
                    finderJumpInfo.setRecommend_reason("表情专辑");
                    finderJumpInfo.setSource(1);
                    com.tencent.mm.protocal.protobuf.NativeInfo nativeInfo = new com.tencent.mm.protocal.protobuf.NativeInfo();
                    nativeInfo.setNative_type(6);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("productId", data.f32456d);
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, data.f32458f);
                    nativeInfo.setNecessary_params(jSONObject.toString());
                    finderJumpInfo.setNative_info(nativeInfo);
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("JUMP_INFO", finderJumpInfo.toByteArray());
                    com.tencent.mm.plugin.finder.feed.ui.FinderEmojiSelectUI finderEmojiSelectUI = (com.tencent.mm.plugin.finder.feed.ui.FinderEmojiSelectUI) activity2;
                    finderEmojiSelectUI.setResult(-1, intent2);
                    finderEmojiSelectUI.finish();
                    return;
                }
                return;
            }
            if (h17 != ms2.c.class.hashCode()) {
                if (h17 == nr2.m.class.hashCode()) {
                    nr2.m mVar = (nr2.m) holder.f293125i;
                    android.app.Activity context2 = getContext();
                    kotlin.jvm.internal.o.d(mVar);
                    boolean isSelfFlag = isSelfFlag();
                    java.lang.String o17 = mVar.o();
                    kotlin.jvm.internal.o.g(context2, "context");
                    if (kotlin.jvm.internal.o.b(xy2.c.e(context2), mVar.o())) {
                        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(cls2)).Sk(context2, mVar, isSelfFlag, o17);
                        return;
                    } else if (mVar.g()) {
                        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(cls2)).cj(context2, mVar, isSelfFlag, o17);
                        return;
                    } else {
                        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(cls2)).Sk(context2, mVar, isSelfFlag, o17);
                        return;
                    }
                }
                if (h17 == zb2.a.class.hashCode()) {
                    zb2.a aVar = (zb2.a) holder.f293125i;
                    android.app.Activity context3 = getContext();
                    kotlin.jvm.internal.o.d(aVar);
                    kotlin.jvm.internal.o.g(context3, "context");
                    pf5.z zVar2 = pf5.z.f353948a;
                    if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    int integer = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).c(zy2.ra.class))).V6().getInteger(5);
                    com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(cls2);
                    r45.qj2 qj2Var = aVar.f471255d;
                    i0Var.ak(context3, null, qj2Var.getLong(0), 0L, null, qj2Var.getString(1), 0L, null, integer, qj2Var.getString(9));
                    return;
                }
                return;
            }
            ms2.c cVar2 = (ms2.c) holder.f293125i;
            java.util.ArrayList O62 = O6();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj3 : O62) {
                if (obj3 instanceof ms2.c) {
                    arrayList4.add(obj3);
                }
            }
            int indexOf2 = arrayList4.indexOf(cVar);
            android.app.Activity context4 = getContext();
            kotlin.jvm.internal.o.d(cVar2);
            kotlin.jvm.internal.o.g(context4, "context");
            o40.e eVar2 = (o40.e) i95.n0.c(o40.e.class);
            eVar2.getClass();
            bw5.jc jcVar = new bw5.jc();
            r45.dg4 dg4Var = cVar2.f330970e;
            jcVar.f28920d = dg4Var != null ? ms2.a.a(dg4Var) : null;
            boolean[] zArr = jcVar.f28923g;
            zArr[1] = true;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
            java.util.Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                arrayList5.add(ms2.d.a(((ms2.c) it7.next()).f330969d));
            }
            linkedList.addAll(arrayList5);
            jcVar.f28921e = linkedList;
            zArr[2] = true;
            jcVar.f28922f = indexOf2;
            zArr[3] = true;
            ((wy2.g) eVar2).Di(context4, jcVar.toByteArray(), null, false);
            return;
        }
        so2.q2 q2Var = cVar instanceof so2.q2 ? (so2.q2) cVar : null;
        if (q2Var == null) {
            return;
        }
        java.util.ArrayList O63 = O6();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.Iterator it8 = O63.iterator();
        while (it8.hasNext()) {
            java.lang.String str6 = str3;
            java.lang.Object next2 = it8.next();
            java.util.Iterator it9 = it8;
            if (((so2.j5) next2) instanceof so2.q2) {
                arrayList6.add(next2);
            }
            it8 = it9;
            str3 = str6;
        }
        java.lang.String str7 = str3;
        int indexOf3 = arrayList6.indexOf(cVar);
        org.json.JSONObject e28 = q2Var.e2();
        e28.put("tab_seat", p0Var.a(getContext(), q2Var.getFeedObject().getProfileTabScene()));
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        e28.put("enter_profile_method", (activity3.getIntent().getIntExtra("key_click_avatar_type", 0) == 1 || activity3.getIntent().getIntExtra("key_enter_profile_type", 0) == 11) ? 1 : activity3.getIntent().getBooleanExtra("key_is_from_slide", false) ? 2 : 3);
        android.app.Activity context5 = getContext();
        kotlin.jvm.internal.o.g(context5, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context5 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context5).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            long itemId = q2Var.getItemId();
            java.lang.String w17 = q2Var.w();
            com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView2 = getRecyclerView();
            java.lang.String jSONObject2 = e28.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            com.tencent.mm.plugin.finder.report.o3.wj(o3Var, V6, itemId, w17, recyclerView2, 0, jSONObject2, indexOf3 + 1, null, 144, null);
        }
        android.app.Activity context6 = getContext();
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView3 = getRecyclerView();
        kotlin.jvm.internal.o.f(recyclerView3, "<get-recyclerView>(...)");
        java.util.ArrayList dataList2 = O6();
        kotlin.jvm.internal.o.g(context6, "context");
        kotlin.jvm.internal.o.g(dataList2, "dataList");
        if (!q2Var.s2()) {
            android.content.Intent intent3 = new android.content.Intent();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.util.Iterator it10 = dataList2.iterator();
            int i28 = 0;
            while (it10.hasNext()) {
                java.lang.Object next3 = it10.next();
                int i29 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var3 = (so2.j5) next3;
                java.util.Iterator it11 = it10;
                if (j5Var3 instanceof so2.q2) {
                    so2.q2 q2Var2 = (so2.q2) j5Var3;
                    cls = cls2;
                    q2Var2.getFeedObject().setCommentScene(0);
                    int o27 = q2Var2.o2();
                    int i37 = q2Var2.f410548m;
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = q2Var2.f410547i;
                    arrayList = dataList2;
                    if (o27 == 4) {
                        arrayList7.add(new so2.q2(finderObject, i37));
                    }
                    arrayList8.add(new so2.q2(finderObject, i37));
                } else {
                    arrayList = dataList2;
                    cls = cls2;
                }
                it10 = it11;
                cls2 = cls;
                dataList2 = arrayList;
                i28 = i29;
            }
            java.util.ArrayList arrayList9 = dataList2;
            java.lang.Class<com.tencent.mm.plugin.finder.assist.i0> cls3 = cls2;
            int indexOf4 = arrayList7.indexOf(q2Var);
            new com.tencent.mm.plugin.finder.feed.model.y9().b(new com.tencent.mm.plugin.finder.feed.model.r9(arrayList8, null, indexOf4 == -1 ? 0 : indexOf4, null, null, 16, null), intent3);
            pf5.u uVar = pf5.u.f353936a;
            intent3.putExtra("finder_username", ((com.tencent.mm.plugin.finder.profile.uic.p2) uVar.b(context6).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername());
            intent3.putExtra("KEY_FINDER_SELF_FLAG", ((com.tencent.mm.plugin.finder.profile.uic.p2) uVar.b(context6).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelfFlag());
            intent3.putExtra("KEY_FROM_PROFILE", true);
            if (android.text.TextUtils.isEmpty(((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(context6).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135386r)) {
                ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
                intent3.putExtra("key_click_tab_context_id", rq2.x.f398919f);
            }
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context6, intent3, 0L, null, 0, 0, false, 0, null, 508, null);
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z19 = true;
            } else {
                java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                z19 = false;
            }
            if (z19 || z65.c.a()) {
                z27 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
                z27 = false;
            }
            if (z27) {
                db5.t7.m(context6, "Debug,error id" + q2Var.m2());
            }
            intent3.putExtra("KEY_FINDER_FEEDID", q2Var.m2());
            intent3.putExtra("KEY_FINDER_FEED_DUP_FLAG", q2Var.w());
            java.lang.String stringExtra = intent3.getStringExtra("key_extra_info");
            if (stringExtra == null) {
                stringExtra = "";
            }
            if (!(stringExtra.length() > 0)) {
                stringExtra = "{}";
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(stringExtra);
            jSONObject3.put("enter_page_type", "profile_live_replay");
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            intent3.putExtra("key_extra_info", r26.i0.t(jSONObject4, ",", ";", false));
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            wa2.x.e(intent3, itemView, 0L, false, false, wa2.u.f444181d.Ri(recyclerView3, q2Var.m2(), arrayList9, com.tencent.mm.plugin.finder.profile.uic.t1.f124221d), 14, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(cls3)).jk(context6, intent3);
            return;
        }
        if (q2Var.t2()) {
            android.view.View itemView2 = holder.itemView;
            kotlin.jvm.internal.o.f(itemView2, "itemView");
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("KEY_PARAMS_KEY_VALUE", so2.p2.b(so2.q2.f410546p, kz5.b0.c(q2Var), null, 0, 0, 10, null).toByteArray());
            intent4.putExtra("KEY_PARAMS_SOURCE_TYPE", 2);
            android.app.Activity context7 = getContext();
            kotlin.jvm.internal.o.g(context7, "context");
            pf5.z zVar3 = pf5.z.f353948a;
            if (!(context7 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            intent4.putExtra("finder_username", ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar3.a((androidx.appcompat.app.AppCompatActivity) context7).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername());
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            vd2.t3.f435921a.b(intent4, com.google.android.gms.common.Scopes.PROFILE, 0);
            long m27 = q2Var.m2();
            android.widget.ImageView imageView = (android.widget.ImageView) itemView2.findViewById(com.tencent.mm.R.id.lyh);
            boolean Ni = ((c61.d8) ((zy2.c8) i95.n0.c(zy2.c8.class))).Ni();
            if (imageView == null || !Ni) {
                i95.m c18 = i95.n0.c(c61.zb.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                android.content.Context context8 = itemView2.getContext();
                kotlin.jvm.internal.o.f(context8, str7);
                c61.zb.U7((c61.zb) c18, context8, intent4, false, 4, null);
            } else {
                pg2.j0 j0Var = (pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class));
                if (j0Var.wh()) {
                    com.tencent.mm.plugin.finder.storage.FinderItem feedObject = q2Var.getFeedObject();
                    android.content.Context context9 = itemView2.getContext();
                    kotlin.jvm.internal.o.e(context9, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context9;
                    android.graphics.Rect rect = new android.graphics.Rect();
                    jz5.l[] lVarArr = new jz5.l[4];
                    lVarArr[0] = new jz5.l("key_enter_type", 1);
                    r45.nw1 liveInfo = feedObject.getLiveInfo();
                    lVarArr[1] = new jz5.l("liveUrl", liveInfo != null ? liveInfo.getString(3) : null);
                    lVarArr[2] = new jz5.l("liveSdkChannelParams", j0Var.Bi(feedObject.getLiveInfo()));
                    r45.nw1 liveInfo2 = feedObject.getLiveInfo();
                    java.lang.String str9 = (liveInfo2 == null || (string = liveInfo2.getString(3)) == null) ? "" : string;
                    java.lang.String nickName = feedObject.getNickName();
                    r45.nw1 liveInfo3 = feedObject.getLiveInfo();
                    lVarArr[3] = new jz5.l("playerInfoData", j0Var.Di(str9, nickName, liveInfo3 != null ? liveInfo3.getLong(0) : 0L, m27, feedObject.getLiveInfo()));
                    j0Var.Ni(appCompatActivity, m27, imageView, rect, kz5.c1.i(lVarArr), new com.tencent.mm.plugin.finder.profile.uic.q1(intent4, m27, itemView2));
                } else {
                    i95.m c19 = i95.n0.c(zy2.c8.class);
                    kotlin.jvm.internal.o.f(c19, "getService(...)");
                    zy2.c8 c8Var = (zy2.c8) c19;
                    ez2.a aVar2 = ez2.a.f257858g;
                    android.view.ViewParent parent = imageView.getParent();
                    kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                    ez2.c s17 = zy2.c8.s1(c8Var, aVar2, m27, viewGroup, imageView, "", !((com.tencent.mm.feature.finder.live.v4) w0Var).hk(r12.getLiveInfo()), q2Var.f410549n.getLiveInfo(), null, 128, null);
                    zy2.c8 c8Var2 = (zy2.c8) i95.n0.c(zy2.c8.class);
                    android.content.Context context10 = itemView2.getContext();
                    kotlin.jvm.internal.o.f(context10, str7);
                    ez2.b Ri = ((c61.d8) c8Var2).Ri(context10, s17);
                    if (Ri != null) {
                        ((ig2.f) Ri).g(new com.tencent.mm.plugin.finder.profile.uic.r1(intent4, m27, itemView2));
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        i95.m c27 = i95.n0.c(c61.zb.class);
                        kotlin.jvm.internal.o.f(c27, "getService(...)");
                        android.content.Context context11 = itemView2.getContext();
                        kotlin.jvm.internal.o.f(context11, str7);
                        c61.zb.U7((c61.zb) c27, context11, intent4, false, 4, null);
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("FinderProfileAllUIC", "click pos:" + indexOf3 + " feed is null:false,replay status:" + java.lang.Integer.valueOf(q2Var.p2()) + '!');
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar2 = kb2.b.f306225a;
                z18 = false;
            }
            if (z18) {
                db5.t7.m(context6, "Debug,error replay_status:" + java.lang.Integer.valueOf(q2Var.p2()));
            }
        }
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        jSONObject5.put("object_id", pm0.v.u(q2Var.m2()));
        jSONObject5.put("page_type", com.google.android.gms.common.Scopes.PROFILE);
        if (q2Var.q2()) {
            jSONObject5.put("object_type", 1);
        } else {
            jSONObject5.put("object_type", 2);
        }
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr = ml2.o3.f327773d;
        java.lang.String jSONObject6 = jSONObject5.toString();
        kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
        ((ml2.j0) zbVar).Wj("watch_live_record", jSONObject6);
    }
}
