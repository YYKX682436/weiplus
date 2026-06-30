package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class r5 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 f121925b;

    public r5(in5.s0 s0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var) {
        this.f121924a = s0Var;
        this.f121925b = t5Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        java.util.Iterator it;
        android.content.Context context;
        android.content.Context context2;
        java.lang.String str;
        boolean z17;
        java.lang.Object obj;
        pf5.u uVar;
        java.lang.String str2;
        boolean z18;
        java.lang.String str3;
        java.lang.String num;
        java.lang.String num2;
        r45.oa2 oa2Var;
        r45.h32 h32Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        r45.fa2 fa2Var;
        java.lang.String str4;
        r45.fa2 fa2Var2;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.r5 r5Var = this;
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.Iterator it6 = recordsSet.iterator();
        while (it6.hasNext()) {
            in5.j jVar = (in5.j) it6.next();
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var = r5Var.f121925b;
            t5Var.getClass();
            cl0.g gVar = new cl0.g();
            android.view.View view = jVar.f293075f;
            if (view != null && (context = view.getContext()) != null) {
                pf5.u uVar2 = pf5.u.f353936a;
                rq2.w wVar = (rq2.w) uVar2.b(context).a(rq2.w.class);
                if (wVar != null) {
                    in5.c cVar = jVar.f293070a;
                    boolean z19 = cVar instanceof vp2.r;
                    java.util.HashMap hashMap = wVar.f398905g;
                    it = it6;
                    if (z19) {
                        vp2.r rVar = z19 ? (vp2.r) cVar : null;
                        if (rVar == null || (fa2Var2 = rVar.f438953e) == null || (str4 = fa2Var2.f374127f) == null) {
                            str4 = "";
                        }
                        gVar.s("page_index", hashMap.get(str4));
                        gVar.s("column_id", str4);
                        tp2.f fVar = t5Var.f121959o;
                        java.lang.String c17 = fVar != null ? fVar.c(jVar.f293074e, jVar.f293075f, "onExpose") : null;
                        r45.qt2 qt2Var = t5Var.f121958n;
                        java.lang.String string = qt2Var != null ? qt2Var.getString(1) : null;
                        java.lang.String gVar2 = gVar.toString();
                        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                        wVar.P6(c17, string, "main_page_column_more", r26.i0.t(gVar2, ",", ";", false));
                    } else {
                        boolean z27 = cVar instanceof wp2.b;
                        wp2.b bVar = z27 ? (wp2.b) cVar : null;
                        if (bVar == null || (fa2Var = bVar.f448384p) == null || (str = fa2Var.f374127f) == null) {
                            context2 = context;
                            str = "";
                        } else {
                            context2 = context;
                        }
                        boolean z28 = cVar instanceof vp2.e0;
                        int i17 = z28 ? 2 : 1;
                        gVar.s("page_index", hashMap.get(str));
                        gVar.s("column_id", str);
                        gVar.s("card_type", java.lang.Integer.valueOf(i17));
                        gVar.s("card_index", java.lang.Integer.valueOf(jVar.f293074e));
                        wp2.b bVar2 = z27 ? (wp2.b) cVar : null;
                        if (bVar2 == null || (feedObject = bVar2.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null) {
                            z17 = z27;
                            obj = "";
                        } else {
                            z17 = z27;
                            obj = java.lang.Long.valueOf(liveInfo.getLong(0));
                        }
                        gVar.s("liveid", obj);
                        vp2.e0 e0Var = z28 ? (vp2.e0) cVar : null;
                        gVar.s("Noticeid", (e0Var == null || (oa2Var = e0Var.f438917d) == null || (h32Var = (r45.h32) oa2Var.getCustom(0)) == null) ? null : h32Var.getString(4));
                        tp2.f fVar2 = t5Var.f121959o;
                        if (fVar2 != null) {
                            uVar = uVar2;
                            str2 = fVar2.c(jVar.f293074e, jVar.f293075f, "onExpose");
                        } else {
                            uVar = uVar2;
                            str2 = null;
                        }
                        r45.qt2 qt2Var2 = t5Var.f121958n;
                        if (qt2Var2 != null) {
                            z18 = true;
                            str3 = qt2Var2.getString(1);
                        } else {
                            z18 = true;
                            str3 = null;
                        }
                        java.lang.String gVar3 = gVar.toString();
                        kotlin.jvm.internal.o.f(gVar3, "toString(...)");
                        wVar.P6(str2, str3, "main_page_column_card", r26.i0.t(gVar3, ",", ";", false));
                        cl0.g gVar4 = new cl0.g();
                        gVar4.s("main_page_position", java.lang.Integer.valueOf(t5Var.f121962r));
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar : null;
                        if (baseFinderFeed != null) {
                            t5Var.f121953f.l(baseFinderFeed, jVar.f293074e, gVar4);
                        }
                        gVar4.s("column_id", str);
                        gVar4.s("card_index", java.lang.Integer.valueOf(jVar.f293074e));
                        if (wVar.f398910o != 0) {
                            java.lang.String str5 = wVar.f398911p;
                            if (!((str5 == null || str5.length() == 0) ? z18 : false)) {
                                gVar4.s("pull_liveid", java.lang.Long.valueOf(wVar.f398910o));
                                gVar4.s("pull_commentsence", wVar.f398911p);
                            }
                        }
                        if (z28) {
                            vp2.e0 e0Var2 = z28 ? (vp2.e0) cVar : null;
                            if (e0Var2 != null) {
                                ml2.d dVar = t5Var.f121957m;
                                int i18 = jVar.f293074e;
                                ml2.x1 x1Var = ml2.x1.f328202f;
                                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                java.lang.String str6 = (nyVar == null || (num2 = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) ? "" : num2;
                                java.lang.String gVar5 = gVar4.toString();
                                kotlin.jvm.internal.o.f(gVar5, "toString(...)");
                                dVar.h(e0Var2, i18, x1Var, str6, "", gVar5);
                            }
                        } else {
                            android.content.Context context3 = context2;
                            pf5.u uVar3 = uVar;
                            wp2.b bVar3 = z17 ? (wp2.b) cVar : null;
                            if (bVar3 != null) {
                                ml2.d dVar2 = t5Var.f121957m;
                                int i19 = jVar.f293074e;
                                ml2.x1 x1Var2 = ml2.x1.f328202f;
                                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar3.b(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                java.lang.String str7 = (nyVar2 == null || (num = java.lang.Integer.valueOf(nyVar2.f135380n).toString()) == null) ? "" : num;
                                java.lang.String gVar6 = gVar4.toString();
                                kotlin.jvm.internal.o.f(gVar6, "toString(...)");
                                dVar2.h(bVar3, i19, x1Var2, str7, "", gVar6);
                            }
                        }
                    }
                    r5Var = this;
                    it6 = it;
                }
            }
            it = it6;
            r5Var = this;
            it6 = it;
        }
        sp2.j jVar2 = sp2.j.f411054a;
        android.content.Context context4 = this.f121924a.itemView.getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        jVar2.c(context4, recordsSet, null);
    }

    @Override // in5.p
    public void d(in5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        sp2.k kVar = this.f121925b.f121953f;
        int i17 = item.f293074e;
        in5.c cVar = item.f293070a;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.RVFeed");
        org.json.JSONObject q17 = kVar.q(null, i17, (so2.j5) cVar);
        so2.h1 h1Var = cVar instanceof so2.h1 ? (so2.h1) cVar : null;
        if (h1Var != null) {
            h1Var.f410378e = q17;
        }
        sp2.j jVar = sp2.j.f411054a;
        android.content.Context context = this.f121924a.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        sp2.j.e(jVar, context, item, q17, null, 8, null);
    }
}
