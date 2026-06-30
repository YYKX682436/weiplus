package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class td implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC f124233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f124234e;

    public td(com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter) {
        this.f124233d = finderProfileReplayLiveUIC;
        this.f124234e = wxRecyclerAdapter;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        boolean z17;
        boolean z18;
        jz5.f0 f0Var;
        java.lang.String string;
        java.lang.String str2;
        boolean z19;
        boolean z27;
        androidx.fragment.app.FragmentActivity activity;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293125i;
        so2.q2 feed = obj instanceof so2.q2 ? (so2.q2) obj : null;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC = this.f124233d;
        android.app.Activity context = finderProfileReplayLiveUIC.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f124234e;
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            long m27 = feed != null ? feed.m2() : 0L;
            java.lang.String w17 = feed != null ? feed.w() : null;
            androidx.recyclerview.widget.RecyclerView b07 = wxRecyclerAdapter.b0();
            java.lang.String jSONObject = new org.json.JSONObject().put("page_type", "profile_live_replay").toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mm.plugin.finder.report.o3.wj(o3Var, V6, m27, w17, b07, 0, jSONObject, 0L, null, 208, null);
        }
        androidx.recyclerview.widget.RecyclerView b08 = wxRecyclerAdapter.b0();
        java.util.ArrayList dataList = finderProfileReplayLiveUIC.O6().getDataListJustForAdapter();
        kotlin.jvm.internal.o.g(dataList, "dataList");
        if ((feed == null || feed.s2()) ? false : true) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader O6 = finderProfileReplayLiveUIC.O6();
            O6.getClass();
            kotlin.jvm.internal.o.g(feed, "feed");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.RandomAccess dataList2 = O6.getDataList();
            if (!(dataList2 instanceof com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer)) {
                dataList2 = null;
            }
            if (dataList2 != null) {
                java.util.Iterator it6 = O6.getDataList().iterator();
                int i18 = 0;
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    so2.j5 j5Var = (so2.j5) next;
                    if (j5Var instanceof so2.q2) {
                        so2.q2 q2Var = (so2.q2) j5Var;
                        it = it6;
                        arrayList = dataList;
                        q2Var.getFeedObject().setCommentScene(0);
                        if (q2Var.o2() == 4) {
                            arrayList2.add(j5Var);
                        }
                        arrayList3.add(j5Var);
                    } else {
                        arrayList = dataList;
                        it = it6;
                    }
                    it6 = it;
                    i18 = i19;
                    dataList = arrayList;
                }
            }
            java.util.ArrayList arrayList4 = dataList;
            int indexOf = arrayList2.indexOf(feed);
            O6.getStore().b(new com.tencent.mm.plugin.finder.feed.model.r9(arrayList3, O6.getLastBuffer(), indexOf == -1 ? 0 : indexOf, null, null, 16, null), intent);
            intent.putExtra("finder_username", finderProfileReplayLiveUIC.getUsername());
            intent.putExtra("KEY_FINDER_SELF_FLAG", finderProfileReplayLiveUIC.isSelfFlag());
            androidx.fragment.app.Fragment fragment = finderProfileReplayLiveUIC.getFragment();
            if (fragment == null || (activity = fragment.getActivity()) == null) {
                str2 = null;
            } else {
                pf5.z zVar = pf5.z.f353948a;
                if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                str2 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135386r;
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
                intent.putExtra("key_click_tab_context_id", rq2.x.f398919f);
            }
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, finderProfileReplayLiveUIC.getActivity(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z19 = true;
            } else {
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                z19 = false;
            }
            if (z19 || z65.c.a()) {
                z27 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
                z27 = false;
            }
            if (z27) {
                db5.t7.m(finderProfileReplayLiveUIC.getContext(), "Debug,error id" + feed.m2());
            }
            intent.putExtra("KEY_FINDER_FEEDID", feed.m2());
            intent.putExtra("KEY_FINDER_FEED_DUP_FLAG", feed.w());
            java.lang.String stringExtra = intent.getStringExtra("key_extra_info");
            java.lang.String str4 = stringExtra != null ? stringExtra : "";
            if (!(str4.length() > 0)) {
                str4 = "{}";
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str4);
            jSONObject2.put("enter_page_type", "profile_live_replay");
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            intent.putExtra("key_extra_info", r26.i0.t(jSONObject3, ",", ";", false));
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            intent.putExtra("KEY_REQUEST_BACK_DATA", wa2.x.e(intent, itemView, 0L, false, false, wa2.u.f444181d.Ri(b08, feed.m2(), arrayList4, new com.tencent.mm.plugin.finder.profile.uic.rd(finderProfileReplayLiveUIC)), 14, null));
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).jk(finderProfileReplayLiveUIC.getActivity(), intent);
            return;
        }
        java.lang.String str5 = finderProfileReplayLiveUIC.f123448i;
        if (feed == null || !feed.t2()) {
            str = "toString(...)";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click pos:");
            sb6.append(i17);
            sb6.append(" feed is null:");
            sb6.append(feed == null);
            sb6.append(",replay status:");
            sb6.append(feed != null ? java.lang.Integer.valueOf(feed.p2()) : null);
            sb6.append('!');
            com.tencent.mars.xlog.Log.e(str5, sb6.toString());
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar2 = kb2.b.f306225a;
                z18 = false;
            }
            if (z18) {
                android.app.Activity context2 = finderProfileReplayLiveUIC.getContext();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Debug,error replay_status:");
                sb7.append(feed != null ? java.lang.Integer.valueOf(feed.p2()) : null);
                db5.t7.m(context2, sb7.toString());
            }
        } else {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it7 = dataList.iterator();
            while (it7.hasNext()) {
                java.lang.Object next2 = it7.next();
                if (next2 instanceof so2.q2) {
                    arrayList5.add(next2);
                }
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList5.iterator();
            while (it8.hasNext()) {
                java.lang.Object next3 = it8.next();
                if (((so2.q2) next3).t2()) {
                    arrayList6.add(next3);
                }
            }
            android.view.View itemView2 = holder.itemView;
            kotlin.jvm.internal.o.f(itemView2, "itemView");
            int indexOf2 = arrayList6.indexOf(feed);
            cm2.a aVar = cm2.a.f43328a;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = feed.f410549n;
            if (indexOf2 != i17) {
                com.tencent.mars.xlog.Log.i(str5, "replay_step1:jumpToReplayLive feed:" + aVar.x(finderObject, i17) + ", pos from:" + i17 + " to " + indexOf2);
            } else {
                com.tencent.mars.xlog.Log.i(str5, "replay_step1:jumpToReplayLive feed:" + aVar.x(finderObject, i17));
            }
            if (indexOf2 == -1) {
                com.tencent.mars.xlog.Log.e(str5, "replay_step1-1:change newPos to 0!");
                indexOf2 = 0;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KEY_PARAMS_KEY_VALUE", so2.q2.f410546p.a(arrayList6, finderProfileReplayLiveUIC.O6().getLastBuffer(), finderProfileReplayLiveUIC.f123455s, indexOf2).toByteArray());
            intent2.putExtra("KEY_PARAMS_SOURCE_TYPE", 2);
            java.lang.String username = finderProfileReplayLiveUIC.getUsername();
            if (username == null) {
                username = "";
            }
            intent2.putExtra("finder_username", username);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            vd2.t3.f435921a.b(intent2, com.google.android.gms.common.Scopes.PROFILE, 0);
            long m28 = feed.m2();
            android.widget.ImageView imageView = (android.widget.ImageView) itemView2.findViewById(com.tencent.mm.R.id.lyh);
            boolean Ni = ((c61.d8) ((zy2.c8) i95.n0.c(zy2.c8.class))).Ni();
            if (imageView == null || !Ni) {
                str = "toString(...)";
                i95.m c18 = i95.n0.c(c61.zb.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                c61.zb.U7((c61.zb) c18, finderProfileReplayLiveUIC.getActivity(), intent2, false, 4, null);
            } else {
                pg2.j0 j0Var = (pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class));
                if (j0Var.wh()) {
                    com.tencent.mm.plugin.finder.storage.FinderItem feedObject = feed.getFeedObject();
                    android.content.Context context3 = itemView2.getContext();
                    kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context3;
                    android.graphics.Rect rect = new android.graphics.Rect();
                    jz5.l[] lVarArr = new jz5.l[4];
                    str = "toString(...)";
                    lVarArr[0] = new jz5.l("key_enter_type", 1);
                    r45.nw1 liveInfo = feedObject.getLiveInfo();
                    lVarArr[1] = new jz5.l("liveUrl", liveInfo != null ? liveInfo.getString(3) : null);
                    lVarArr[2] = new jz5.l("liveSdkChannelParams", j0Var.Bi(feedObject.getLiveInfo()));
                    r45.nw1 liveInfo2 = feedObject.getLiveInfo();
                    java.lang.String str7 = (liveInfo2 == null || (string = liveInfo2.getString(3)) == null) ? "" : string;
                    java.lang.String nickName = feedObject.getNickName();
                    r45.nw1 liveInfo3 = feedObject.getLiveInfo();
                    lVarArr[3] = new jz5.l("playerInfoData", j0Var.Di(str7, nickName, liveInfo3 != null ? liveInfo3.getLong(0) : 0L, m28, feedObject.getLiveInfo()));
                    j0Var.Ni(appCompatActivity, m28, imageView, rect, kz5.c1.i(lVarArr), new com.tencent.mm.plugin.finder.profile.uic.od(intent2, m28, finderProfileReplayLiveUIC));
                } else {
                    str = "toString(...)";
                    i95.m c19 = i95.n0.c(zy2.c8.class);
                    kotlin.jvm.internal.o.f(c19, "getService(...)");
                    zy2.c8 c8Var = (zy2.c8) c19;
                    ez2.a aVar2 = ez2.a.f257858g;
                    android.view.ViewParent parent = imageView.getParent();
                    kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ez2.c s17 = zy2.c8.s1(c8Var, aVar2, m28, (android.view.ViewGroup) parent, imageView, "", !((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(finderObject.getLiveInfo()), finderObject.getLiveInfo(), null, 128, null);
                    zy2.c8 c8Var2 = (zy2.c8) i95.n0.c(zy2.c8.class);
                    android.content.Context context4 = itemView2.getContext();
                    kotlin.jvm.internal.o.f(context4, "getContext(...)");
                    ez2.b Ri = ((c61.d8) c8Var2).Ri(context4, s17);
                    if (Ri != null) {
                        ((ig2.f) Ri).g(new com.tencent.mm.plugin.finder.profile.uic.pd(intent2, m28, finderProfileReplayLiveUIC));
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        i95.m c27 = i95.n0.c(c61.zb.class);
                        kotlin.jvm.internal.o.f(c27, "getService(...)");
                        c61.zb.U7((c61.zb) c27, finderProfileReplayLiveUIC.getActivity(), intent2, false, 4, null);
                    }
                }
            }
        }
        if (feed != null) {
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("object_id", pm0.v.u(feed.m2()));
            jSONObject4.put("page_type", com.google.android.gms.common.Scopes.PROFILE);
            if (feed.q2()) {
                jSONObject4.put("object_type", 1);
            } else {
                jSONObject4.put("object_type", 2);
            }
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.o3[] o3VarArr = ml2.o3.f327773d;
            java.lang.String jSONObject5 = jSONObject4.toString();
            kotlin.jvm.internal.o.f(jSONObject5, str);
            ((ml2.j0) zbVar).Wj("watch_live_record", jSONObject5);
        }
    }
}
