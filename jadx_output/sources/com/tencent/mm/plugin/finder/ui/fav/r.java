package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class r extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.x f129202a;

    public r(com.tencent.mm.plugin.finder.ui.fav.x xVar) {
        this.f129202a = xVar;
    }

    @Override // in5.p
    public boolean b() {
        return false;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        int h17;
        java.lang.String str;
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment fragment = this.f129202a.f129218b;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onExposeTimeRecorded: size = ");
            sb6.append(recordsSet.size());
            sb6.append(", commentScene=");
            int i17 = 5;
            sb6.append(V6.getInteger(5));
            com.tencent.mars.xlog.Log.i("FinderProfileAllUIC", sb6.toString());
            java.util.Iterator it = recordsSet.iterator();
            while (it.hasNext()) {
                in5.j jVar = (in5.j) it.next();
                in5.c cVar = jVar.f293070a;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar : null;
                if (baseFinderFeed != null && ((h17 = baseFinderFeed.h()) == 2 || h17 == 4)) {
                    long j17 = jVar.f293071b;
                    long j18 = jVar.f293072c;
                    android.view.View view = jVar.f293075f;
                    if (view != null) {
                        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.teh);
                        java.lang.Long l17 = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
                        long longValue = l17 != null ? l17.longValue() : 0L;
                        java.lang.Object tag2 = view.getTag(com.tencent.mm.R.id.tei);
                        java.lang.String str2 = tag2 instanceof java.lang.String ? (java.lang.String) tag2 : null;
                        java.lang.String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        long max = longValue == 0 ? j18 - j17 : java.lang.Math.max(longValue - j17, 0L);
                        if (str2.length() > 0) {
                            str3 = str2;
                        } else {
                            r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(baseFinderFeed.getFeedObject().getMediaList());
                            if (mb4Var != null) {
                                java.lang.String string = mb4Var.getString(16);
                                if (string == null || string.length() == 0) {
                                    java.lang.String string2 = mb4Var.getString(1);
                                    if (string2 == null || string2.length() == 0) {
                                        str = "";
                                    } else {
                                        str = mb4Var.getString(1) + mb4Var.getString(19);
                                    }
                                } else {
                                    str = mb4Var.getString(16) + mb4Var.getString(20);
                                }
                                if (str != null) {
                                    str3 = str;
                                }
                            }
                        }
                        bu2.r rVar = bu2.r.f24559a;
                        boolean z17 = !rVar.b(hc2.o0.s(baseFinderFeed));
                        java.lang.String t17 = r26.i0.t(((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(baseFinderFeed.getItemId(), baseFinderFeed.w(), V6.getInteger(i17)), ",", ";", false);
                        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
                        jz5.l[] lVarArr = new jz5.l[11];
                        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
                        lVarArr[1] = new jz5.l("finder_context_id", V6.getString(1));
                        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5)));
                        lVarArr[3] = new jz5.l("session_buffer", t17);
                        lVarArr[4] = new jz5.l("finder_username", baseFinderFeed.getFeedObject().getUserName());
                        lVarArr[5] = new jz5.l("extra_info", V6.getString(11));
                        lVarArr[6] = new jz5.l("white_pic_time", java.lang.Long.valueOf(max));
                        lVarArr[7] = new jz5.l("pic_index", 0);
                        lVarArr[8] = new jz5.l("is_livephoto", 0);
                        lVarArr[9] = new jz5.l("pic_url", str3);
                        lVarArr[10] = new jz5.l("first_expose", java.lang.Integer.valueOf(z17 ? 1 : 2));
                        ((cy1.a) rVar2).Bj("global_fav_feed_grid_item", "finder_photo_optimize", kz5.c1.k(lVarArr), 1, false);
                        com.tencent.mars.xlog.Log.i("FinderGlobalFavViewCallback", "current feed: " + hc2.o0.t(baseFinderFeed) + ", whiteScreenTime: " + max + ", isFirstExposed: " + z17 + ", picUrl: " + str3);
                        rVar.a(hc2.o0.s(baseFinderFeed));
                    }
                }
                i17 = 5;
            }
        }
    }
}
