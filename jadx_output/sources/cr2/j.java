package cr2;

/* loaded from: classes2.dex */
public final class j implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr2.x f221861d;

    public j(cr2.x xVar) {
        this.f221861d = xVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        r45.an1 an1Var;
        java.lang.Object obj;
        int i18;
        android.os.Bundle bundle;
        boolean z17;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.lang.String str;
        r45.ea2 ea2Var;
        r45.an1 an1Var2;
        int i19;
        int i27;
        r45.ta2 ta2Var;
        r45.ua2 ua2Var;
        java.lang.String num;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i28 = i17 - a07;
        cr2.x xVar = this.f221861d;
        java.lang.Object obj2 = xVar.f221911q.get(i28);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        so2.j5 j5Var = (so2.j5) obj2;
        com.tencent.mm.ui.MMActivity activity = xVar.f221895a;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a17 = zVar.a(activity).a(rq2.w.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        boolean z18 = j5Var instanceof wp2.b;
        er2.a aVar = xVar.f221898d;
        if (z18) {
            org.json.JSONObject g17 = cq2.r.f221444a.g(j5Var, aVar, i28);
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = (com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) view.findViewWithTag("nearby-live-preview-view-tag");
            if (nearbyLivePreviewView != null) {
                g17.put("playstatus", nearbyLivePreviewView.getPlayStatus());
                java.lang.String streamId = nearbyLivePreviewView.getStreamId();
                if (streamId == null) {
                    streamId = "";
                }
                g17.put("streamid", streamId);
            }
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            wp2.b bVar = z18 ? (wp2.b) j5Var : null;
            long j17 = i28;
            ml2.x1 x1Var = ml2.x1.f328207n;
            com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment fragment = xVar.f221897c;
            kotlin.jvm.internal.o.g(fragment, "fragment");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            java.lang.String str2 = (nyVar == null || (num = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) ? "" : num;
            java.lang.String jSONObject = g17.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            j0Var.sj(bVar, j17, x1Var, str2, "", "", jSONObject);
        }
        r45.qt2 qt2Var = xVar.f221910p;
        if (qt2Var == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        java.lang.String string = qt2Var.getString(2);
        java.lang.String str3 = string == null ? "" : string;
        java.util.ArrayList data = xVar.f221911q;
        int i29 = aVar.f256016i == 1 ? 6 : 5;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("topic_id", aVar.f256009b);
        bundle2.putString("topic_title", aVar.f256011d);
        bundle2.putString("tag_id", aVar.f256010c);
        if (j5Var instanceof vp2.i0) {
            bundle2.putInt("page_position", 1);
            bundle2.putInt("card_index", i28);
            r45.qa2 qa2Var = (r45.qa2) ((vp2.i0) j5Var).f448383o.getCustom(15);
            if (qa2Var == null || (ta2Var = (r45.ta2) qa2Var.getCustom(1)) == null || (ua2Var = (r45.ua2) ta2Var.getCustom(1)) == null) {
                i19 = 0;
            } else {
                i19 = 0;
                java.util.LinkedList list = ua2Var.getList(0);
                if (list != null) {
                    i27 = list.size();
                    bundle2.putInt("card_profile_num", i27 + 1);
                }
            }
            i27 = i19;
            bundle2.putInt("card_profile_num", i27 + 1);
        }
        if (z18) {
            wp2.b bVar2 = z18 ? (wp2.b) j5Var : null;
            if (bVar2 != null && (ea2Var = bVar2.f448383o) != null && (an1Var2 = (r45.an1) ea2Var.getCustom(11)) != null) {
                java.lang.String string2 = an1Var2.getString(6);
                bundle2.putString("card_tag", string2 == null ? "null" : string2);
            }
        } else {
            so2.h1 h1Var = j5Var instanceof so2.h1 ? (so2.h1) j5Var : null;
            if (h1Var != null && (an1Var = h1Var.f410377d) != null) {
                java.lang.String string3 = an1Var.getString(6);
                bundle2.putString("card_tag", string3 == null ? "null" : string3);
            }
        }
        dk2.of ofVar = ((wq2.e) ((gr2.p0) aVar.f256015h).f274806b).f448522a.f448534f;
        bundle2.putInt("tiling_switch", (ofVar == null || !ofVar.f233866f) ? 0 : 1);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        gr2.o oVar = xVar.f221916v;
        oVar.getClass();
        kotlin.jvm.internal.o.g(data, "data");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        java.lang.String str4 = (nyVar2 == null || (str = nyVar2.f135382p) == null) ? "" : str;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            obj = "Check failed.";
            i18 = i29;
            bundle = bundle2;
            z17 = false;
        } else {
            obj = "Check failed.";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isFastClick] true, currentClickTime:");
            sb6.append(currentTimeMillis);
            sb6.append(", lastClickTime:");
            i18 = i29;
            bundle = bundle2;
            sb6.append(qd2.h.f361767a);
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", sb6.toString());
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            com.tencent.mars.xlog.Log.i("NewEntranceViewItemClick", "onItemClick pos:" + i17 + " feed:" + j5Var + " return for fastClick");
            return;
        }
        com.tencent.mars.xlog.Log.i("NewEntranceViewItemClick", "onItemClick pos:" + i17 + " feed:" + j5Var);
        android.content.Context context2 = oVar.f274798a;
        kotlin.jvm.internal.o.g(context2, "context");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException(obj.toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        boolean z19 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
        if (z19) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            if (zl2.q4.f473933a.C(baseFinderFeed)) {
                yo2.e.f464137a.a(new gr2.n(baseFinderFeed.getFeedObject()));
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = z19 ? baseFinderFeed : null;
                com.tencent.mm.protocal.protobuf.FinderObject feedObject2 = (baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null) ? null : feedObject.getFeedObject();
                if (feedObject2 != null) {
                    com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "handleClick rewrite commentScene:" + V6.getInteger(5) + ", sessionBuffer:" + feedObject2.getSessionBuffer());
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((com.tencent.mm.plugin.finder.report.o3) c17).rk(feedObject2, V6.getInteger(5), null);
                }
                c61.y7 y7Var = c61.y7.f39429b;
                android.content.Context context3 = view.getContext();
                kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                y7Var.c(view, (androidx.appcompat.app.AppCompatActivity) context3, baseFinderFeed, ez2.a.f257859h, new gr2.l(oVar, i28, j5Var, data, view, str4, str3, i18, bundle, null, elapsedRealtime));
                com.tencent.mars.xlog.Log.i("FinderLiveSquareTabLifeCycleReport", "enterLiveRoom");
                ip2.a.f293615d = "page_live_flow";
                com.tencent.mm.plugin.finder.report.l0.f125109a.b(V6, j5Var, 18);
                return;
            }
        }
        if (j5Var instanceof com.tencent.mm.plugin.finder.feed.ys) {
            oVar.f274801d = ((com.tencent.mm.plugin.finder.feed.ys) j5Var).f111196h;
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct();
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            finderBroadcastEidClickStruct.f56522d = java.lang.System.currentTimeMillis();
            finderBroadcastEidClickStruct.u("");
            finderBroadcastEidClickStruct.p(oVar.b(i28, view, "onItemClick"));
            finderBroadcastEidClickStruct.B("");
            finderBroadcastEidClickStruct.y("");
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            finderBroadcastEidClickStruct.w(Ri);
            finderBroadcastEidClickStruct.r(V6.getString(1));
            finderBroadcastEidClickStruct.q(java.lang.String.valueOf(V6.getInteger(5)));
            finderBroadcastEidClickStruct.A(str3);
            finderBroadcastEidClickStruct.x("");
            finderBroadcastEidClickStruct.v("");
            finderBroadcastEidClickStruct.s("all_my_follow");
            finderBroadcastEidClickStruct.t("");
            finderBroadcastEidClickStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
            finderBroadcastEidClickStruct.k();
        }
    }
}
