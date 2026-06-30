package iq2;

/* loaded from: classes2.dex */
public final class h extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f293747a;

    public h(iq2.d0 d0Var) {
        this.f293747a = d0Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        java.util.Iterator it;
        java.lang.String str;
        org.json.JSONObject d17;
        java.lang.String num;
        java.lang.String num2;
        r45.s92 s92Var;
        r45.oa2 oa2Var;
        r45.h32 h32Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        iq2.d0 d0Var = this.f293747a;
        com.tencent.mars.xlog.Log.i(d0Var.f293721e, "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.Iterator it6 = recordsSet.iterator();
        while (it6.hasNext()) {
            in5.j jVar = (in5.j) it6.next();
            com.tencent.mm.ui.MMActivity activity = d0Var.f293717a;
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            rq2.w wVar = (rq2.w) zVar.a(activity).a(rq2.w.class);
            if (wVar != null) {
                in5.c cVar = jVar.f293070a;
                boolean z17 = cVar instanceof vp2.c;
                r45.qt2 qt2Var = d0Var.f293730n;
                if (z17) {
                    vp2.c cVar2 = z17 ? (vp2.c) cVar : null;
                    if (cVar2 != null) {
                        r45.le1 le1Var = cVar2.f438910d;
                        if (le1Var.B == 2) {
                            java.lang.String string = qt2Var.getString(1);
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.putOpt("topic_id", le1Var.f379355o);
                            jSONObject.putOpt("card_index", java.lang.Integer.valueOf(jVar.f293074e));
                            java.lang.String jSONObject2 = jSONObject.toString();
                            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                            wVar.P6("", string, "main_page_chatroom_card", r26.i0.t(jSONObject2, ",", ";", false));
                        } else {
                            java.lang.String string2 = qt2Var != null ? qt2Var.getString(1) : null;
                            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                            jSONObject3.putOpt("topic_id", le1Var.f379355o);
                            wVar.P6("", string2, "main_page_topic_card", jSONObject3.toString());
                        }
                    }
                } else {
                    boolean z18 = cVar instanceof wp2.b;
                    if (z18) {
                        boolean z19 = cVar instanceof vp2.e0;
                        it = it6;
                        int i17 = z19 ? 2 : 1;
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        jSONObject4.putOpt("page_index", java.lang.Integer.valueOf(wVar.f398904f));
                        jSONObject4.putOpt("card_type", java.lang.Integer.valueOf(i17));
                        jSONObject4.putOpt("card_index", java.lang.Integer.valueOf(jVar.f293074e - wVar.f398904f));
                        wp2.b bVar = z18 ? (wp2.b) cVar : null;
                        jSONObject4.putOpt("liveid", (bVar == null || (feedObject = bVar.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null) ? "" : java.lang.Long.valueOf(liveInfo.getLong(0)));
                        vp2.e0 e0Var = z19 ? (vp2.e0) cVar : null;
                        if (e0Var == null || (oa2Var = e0Var.f438917d) == null || (h32Var = (r45.h32) oa2Var.getCustom(0)) == null || (str = h32Var.getString(4)) == null) {
                            str = "";
                        }
                        jSONObject4.putOpt("Noticeid", str);
                        java.lang.String c17 = d0Var.f293740x.c(jVar.f293074e, jVar.f293075f, "onExpose");
                        java.lang.String string3 = qt2Var.getString(1);
                        java.lang.String jSONObject5 = jSONObject4.toString();
                        kotlin.jvm.internal.o.f(jSONObject5, "toString(...)");
                        wVar.P6(c17, string3, "main_page_recmd_card", r26.i0.t(jSONObject5, ",", ";", false));
                        cq2.r rVar = cq2.r.f221444a;
                        com.tencent.mm.ui.MMActivity mMActivity = d0Var.f293717a;
                        int i18 = jVar.f293074e;
                        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar;
                        r45.dk2 dk2Var = d0Var.f293736t;
                        d17 = rVar.d(mMActivity, i18, baseFinderFeed, (dk2Var == null || (s92Var = (r45.s92) dk2Var.getCustom(12)) == null) ? 0 : s92Var.getInteger(0), (r21 & 16) != 0 ? 0 : d0Var.f293719c.f301096b, (r21 & 32) != 0 ? 0 : d0Var.f(), (r21 & 64) != 0, (r21 & 128) != 0);
                        boolean z27 = cVar instanceof vp2.e0;
                        if (z27) {
                            vp2.e0 e0Var2 = z27 ? (vp2.e0) cVar : null;
                            if (e0Var2 != null) {
                                ml2.d dVar = d0Var.f293737u;
                                int i19 = jVar.f293074e;
                                ml2.x1 x1Var = ml2.x1.f328202f;
                                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                java.lang.String str2 = (nyVar == null || (num2 = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) ? "" : num2;
                                java.lang.String jSONObject6 = d17.toString();
                                kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
                                dVar.h(e0Var2, i19, x1Var, str2, "", jSONObject6);
                            }
                        } else {
                            wp2.b bVar2 = cVar instanceof wp2.b ? (wp2.b) cVar : null;
                            if (bVar2 != null) {
                                ml2.d dVar2 = d0Var.f293737u;
                                int i27 = jVar.f293074e;
                                ml2.x1 x1Var2 = ml2.x1.f328202f;
                                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                java.lang.String str3 = (nyVar2 == null || (num = java.lang.Integer.valueOf(nyVar2.f135380n).toString()) == null) ? "" : num;
                                java.lang.String jSONObject7 = d17.toString();
                                kotlin.jvm.internal.o.f(jSONObject7, "toString(...)");
                                dVar2.h(bVar2, i27, x1Var2, str3, "", jSONObject7);
                            }
                        }
                    } else {
                        it = it6;
                        com.tencent.mars.xlog.Log.w(d0Var.f293721e, "handleExposeReport unknown feed:" + cVar);
                    }
                    it6 = it;
                }
            }
            it = it6;
            it6 = it;
        }
        sp2.j.f411054a.c(d0Var.f293717a, recordsSet, null);
    }

    @Override // in5.p
    public void d(in5.j item) {
        org.json.JSONObject d17;
        r45.s92 s92Var;
        kotlin.jvm.internal.o.g(item, "item");
        cq2.r rVar = cq2.r.f221444a;
        iq2.d0 d0Var = this.f293747a;
        com.tencent.mm.ui.MMActivity mMActivity = d0Var.f293717a;
        int i17 = item.f293074e;
        in5.c cVar = item.f293070a;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.RVFeed");
        so2.j5 j5Var = (so2.j5) cVar;
        r45.dk2 dk2Var = d0Var.f293736t;
        int i18 = 0;
        if (dk2Var != null && (s92Var = (r45.s92) dk2Var.getCustom(12)) != null) {
            i18 = s92Var.getInteger(0);
        }
        d17 = rVar.d(mMActivity, i17, j5Var, i18, (r21 & 16) != 0 ? 0 : d0Var.f293719c.f301096b, (r21 & 32) != 0 ? 0 : d0Var.f(), (r21 & 64) != 0, (r21 & 128) != 0);
        so2.h1 h1Var = cVar instanceof so2.h1 ? (so2.h1) cVar : null;
        if (h1Var != null) {
            h1Var.f410378e = d17;
        }
        sp2.j.e(sp2.j.f411054a, d0Var.f293717a, item, d17, null, 8, null);
        vp2.c cVar2 = cVar instanceof vp2.c ? (vp2.c) cVar : null;
        if (cVar2 != null) {
            xq2.e.f456049a.a(cVar2);
        }
    }
}
