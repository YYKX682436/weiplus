package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class i1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.o f121722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 f121723e;

    public i1(vp2.o oVar, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 p1Var) {
        this.f121722d = oVar;
        this.f121723e = p1Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        sp2.k kVar;
        java.lang.String str2;
        java.lang.String str3;
        pf5.z zVar;
        java.lang.Class cls;
        java.lang.String str4;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 p1Var;
        java.lang.String str5;
        so2.j5 j5Var;
        int i18;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        boolean z17;
        java.lang.Object obj;
        boolean z18;
        java.lang.String str11;
        java.lang.String num;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject3;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        java.lang.String string;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i19 = i17 - a07;
        vp2.o oVar = this.f121722d;
        java.lang.Object obj2 = oVar.f438948e.get(i19);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        so2.j5 j5Var2 = (so2.j5) obj2;
        boolean z19 = j5Var2 instanceof vp2.l;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 p1Var2 = this.f121723e;
        if (z19) {
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1.n(p1Var2, holder, (vp2.l) j5Var2);
            return;
        }
        if (j5Var2 instanceof vp2.m) {
            vp2.m mVar = (vp2.m) j5Var2;
            p1Var2.getClass();
            cl0.g gVar = new cl0.g();
            gVar.s("finder_username", mVar.getFeedObject().getUserName());
            r45.nw1 liveInfo2 = mVar.getFeedObject().getLiveInfo();
            gVar.s("liveid", liveInfo2 != null ? pm0.v.u(liveInfo2.getLong(0)) : "");
            gVar.s("style", 1);
            gVar.s("ref_objectid", pm0.v.u(mVar.getFeedObject().getId()));
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            p1Var2.r("live_end_page_play_back_button", gVar2, false);
            boolean z27 = mVar.getFeedObject().getMediaType() == 9;
            com.tencent.mars.xlog.Log.i("Finder.HeadLivingListConvert", "onLiveReplayClick: pos=" + holder.getAdapterPosition() + ", isReplay=" + z27 + ", nickname=" + mVar.getFeedObject().getNickName());
            if (!z27) {
                android.content.Intent intent = new android.content.Intent();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("enter_page_type", "live_replay_avatar");
                jSONObject.put("is_lrfeed", "1");
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                intent.putExtra("key_extra_info", r26.i0.t(jSONObject2, ",", ";", false));
                i95.m c17 = i95.n0.c(com.tencent.mm.feature.finder.live.v4.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                s40.w0.ba((s40.w0) c17, p1Var2.f121870e, mVar.getFeedObject().getFeedObject(), false, intent, 4, null);
                return;
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("object_id", pm0.v.u(mVar.getFeedObject().getId()));
            jSONObject3.put("page_type", "live_square");
            if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).gk(mVar.getFeedObject().getLiveInfo())) {
                jSONObject3.put("object_type", 1);
            } else {
                jSONObject3.put("object_type", 2);
            }
            jSONObject3.put("style", 1);
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.o3[] o3VarArr = ml2.o3.f327773d;
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            ((ml2.j0) zbVar).Wj("watch_live_record", jSONObject4);
            if (!((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(mVar.getFeedObject().getUserName(), mVar.getFeedObject().getLiveInfo())) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLiveReplayClick: enter old replay error, replayStatus=");
                r45.nw1 liveInfo3 = mVar.getFeedObject().getLiveInfo();
                sb6.append(liveInfo3 != null ? liveInfo3.getInteger(31) : 0);
                com.tencent.mars.xlog.Log.e("Finder.HeadLivingListConvert", sb6.toString());
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            so2.p2 p2Var = so2.q2.f410546p;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(new so2.q2(mVar.getFeedObject().getFeedObject(), 0, 2, null));
            intent2.putExtra("KEY_PARAMS_KEY_VALUE", so2.p2.b(p2Var, linkedList, null, 0, 0, 14, null).toByteArray());
            intent2.putExtra("KEY_PAGE_TYPE", "live_square");
            i95.m c18 = i95.n0.c(c61.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            c61.zb.U7((c61.zb) c18, p1Var2.f121870e, intent2, false, 4, null);
            return;
        }
        r45.qt2 qt2Var = p1Var2.f121876n;
        java.lang.String str12 = (qt2Var == null || (string = qt2Var.getString(2)) == null) ? "" : string;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("main_page_position", "1");
        bundle.putInt("card_index", i19);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rq2.w wVar = (rq2.w) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(rq2.w.class);
        if (wVar != null && wVar.f398910o != 0) {
            java.lang.String str13 = wVar.f398911p;
            if (!(str13 == null || str13.length() == 0)) {
                bundle.putLong("pull_liveid", wVar.f398910o);
                bundle.putString("pull_commentsence", wVar.f398911p);
            }
        }
        sp2.k kVar2 = p1Var2.f121872g;
        kVar2.c(bundle, j5Var2);
        tp2.f fVar = p1Var2.f121875m;
        if (fVar != null) {
            str9 = "main_page_position";
            kVar = kVar2;
            str2 = ",";
            str3 = ";";
            zVar = zVar2;
            cls = rq2.w.class;
            str4 = "card_index";
            p1Var = p1Var2;
            str = "get(...)";
            str5 = "pull_liveid";
            j5Var = j5Var2;
            str8 = "liveid";
            i18 = i19;
            str6 = "pull_commentsence";
            str7 = "toString(...)";
            tp2.f.d(fVar, j5Var2, i17, i19, view, oVar.f438948e, str12, 0, bundle, oVar, null, 0L, com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX, null);
        } else {
            str = "get(...)";
            kVar = kVar2;
            str2 = ",";
            str3 = ";";
            zVar = zVar2;
            cls = rq2.w.class;
            str4 = "card_index";
            p1Var = p1Var2;
            str5 = "pull_liveid";
            j5Var = j5Var2;
            i18 = i19;
            str6 = "pull_commentsence";
            str7 = "toString(...)";
            str8 = "liveid";
            str9 = "main_page_position";
        }
        android.content.Context context2 = view.getContext();
        android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity != null) {
            boolean z28 = activity instanceof androidx.appcompat.app.AppCompatActivity;
            if (!z28) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) activity;
            pf5.z zVar3 = zVar;
            androidx.lifecycle.c1 a17 = zVar3.a(appCompatActivity).a(cls);
            kotlin.jvm.internal.o.f(a17, str);
            rq2.w wVar2 = (rq2.w) a17;
            cl0.g gVar3 = new cl0.g();
            gVar3.s("page_index", java.lang.Integer.valueOf(wVar2.f398902d));
            gVar3.s(str4, java.lang.String.valueOf(i18));
            so2.j5 j5Var3 = j5Var;
            boolean z29 = j5Var3 instanceof vp2.n;
            vp2.n nVar = z29 ? (vp2.n) j5Var3 : null;
            if (nVar == null || (feedObject2 = nVar.getFeedObject()) == null || (feedObject3 = feedObject2.getFeedObject()) == null || (contact = feedObject3.getContact()) == null || (str10 = contact.getUsername()) == null) {
                str10 = "";
            }
            gVar3.s(dm.i4.COL_USERNAME, str10);
            vp2.n nVar2 = z29 ? (vp2.n) j5Var3 : null;
            if (nVar2 == null || (feedObject = nVar2.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null) {
                z17 = false;
                obj = "";
            } else {
                z17 = false;
                obj = java.lang.Long.valueOf(liveInfo.getLong(0));
            }
            gVar3.s(str8, obj);
            r45.qt2 qt2Var2 = p1Var.f121876n;
            if (qt2Var2 != null) {
                z18 = true;
                str11 = qt2Var2.getString(1);
            } else {
                z18 = true;
                str11 = null;
            }
            java.lang.String gVar4 = gVar3.toString();
            kotlin.jvm.internal.o.f(gVar4, str7);
            wVar2.Q6(str11, "main_page_focus_card", r26.i0.t(gVar4, str2, str3, z17));
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var3 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var3 : null;
            if (baseFinderFeed != null) {
                cl0.g gVar5 = new cl0.g();
                gVar5.s(str9, java.lang.Integer.valueOf(z18 ? 1 : 0));
                int i27 = i18;
                kVar.l(baseFinderFeed, i27, gVar5);
                if (wVar2.f398910o != 0) {
                    java.lang.String str14 = wVar2.f398911p;
                    if (str14 != null && str14.length() != 0) {
                        z18 = z17;
                    }
                    if (!z18) {
                        gVar5.s(str5, java.lang.Long.valueOf(wVar2.f398910o));
                        gVar5.s(str6, wVar2.f398911p);
                    }
                }
                ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                long j17 = i27;
                ml2.x1 x1Var = ml2.x1.f328207n;
                if (!z28) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar3.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                java.lang.String str15 = (nyVar == null || (num = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) ? "" : num;
                java.lang.String gVar6 = gVar5.toString();
                kotlin.jvm.internal.o.f(gVar6, str7);
                j0Var.sj(baseFinderFeed, j17, x1Var, str15, "", "", gVar6);
            }
        }
    }
}
