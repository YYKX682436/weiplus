package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class j0 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 f121736b;

    public j0(in5.s0 s0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 m0Var) {
        this.f121735a = s0Var;
        this.f121736b = m0Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        java.util.Iterator it;
        android.content.Context context;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String num;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.j0 j0Var = this;
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        com.tencent.mars.xlog.Log.i("BigBannerListConvert", "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.Iterator it6 = recordsSet.iterator();
        while (it6.hasNext()) {
            in5.j jVar = (in5.j) it6.next();
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 m0Var = j0Var.f121736b;
            m0Var.getClass();
            cl0.g gVar = new cl0.g();
            android.view.View view = jVar.f293075f;
            if (view != null && (context = view.getContext()) != null) {
                pf5.z zVar = pf5.z.f353948a;
                boolean z17 = context instanceof androidx.appcompat.app.AppCompatActivity;
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
                rq2.w wVar = (rq2.w) zVar.a(appCompatActivity).a(rq2.w.class);
                if (wVar != null) {
                    gVar.s("page_index", java.lang.Integer.valueOf(wVar.f398903e));
                    gVar.s("banner_live_index", java.lang.Integer.valueOf(jVar.f293074e));
                    in5.c cVar = jVar.f293070a;
                    boolean z18 = cVar instanceof wp2.b;
                    wp2.b bVar = z18 ? (wp2.b) cVar : null;
                    gVar.s("liveid", (bVar == null || (feedObject = bVar.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null) ? "" : java.lang.Long.valueOf(liveInfo.getLong(0)));
                    tp2.f fVar = m0Var.f121798h;
                    if (fVar != null) {
                        it = it6;
                        str = "";
                        str2 = fVar.c(jVar.f293074e, jVar.f293075f, "onExpose");
                    } else {
                        it = it6;
                        str = "";
                        str2 = null;
                    }
                    r45.qt2 qt2Var = m0Var.f121799i;
                    java.lang.String string = qt2Var != null ? qt2Var.getString(1) : null;
                    java.lang.String gVar2 = gVar.toString();
                    kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                    wVar.P6(str2, string, "main_page_banner_live", r26.i0.t(gVar2, ",", ";", false));
                    cl0.g gVar3 = new cl0.g();
                    gVar3.s("main_page_position", 2);
                    wp2.b bVar2 = z18 ? (wp2.b) cVar : null;
                    if (bVar2 != null) {
                        m0Var.f121796f.l(bVar2, jVar.f293074e, gVar3);
                    }
                    if (wVar.f398910o != 0) {
                        java.lang.String str3 = wVar.f398911p;
                        if (!(str3 == null || str3.length() == 0)) {
                            gVar3.s("pull_liveid", java.lang.Long.valueOf(wVar.f398910o));
                            gVar3.s("pull_commentsence", wVar.f398911p);
                        }
                    }
                    wp2.b bVar3 = z18 ? (wp2.b) cVar : null;
                    if (bVar3 != null) {
                        ml2.d dVar = m0Var.f121797g;
                        int i17 = jVar.f293074e;
                        ml2.x1 x1Var = ml2.x1.f328202f;
                        if (!z17) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                        java.lang.String str4 = (nyVar == null || (num = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) ? str : num;
                        java.lang.String gVar4 = gVar3.toString();
                        kotlin.jvm.internal.o.f(gVar4, "toString(...)");
                        dVar.h(bVar3, i17, x1Var, str4, "", gVar4);
                    } else {
                        continue;
                    }
                    j0Var = this;
                    it6 = it;
                }
            }
            it = it6;
            j0Var = this;
            it6 = it;
        }
        sp2.j jVar2 = sp2.j.f411054a;
        android.content.Context context2 = this.f121735a.itemView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        jVar2.c(context2, recordsSet, null);
    }

    @Override // in5.p
    public void d(in5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        sp2.k kVar = this.f121736b.f121796f;
        int i17 = item.f293074e;
        in5.c cVar = item.f293070a;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.RVFeed");
        org.json.JSONObject q17 = kVar.q(null, i17, (so2.j5) cVar);
        so2.h1 h1Var = cVar instanceof so2.h1 ? (so2.h1) cVar : null;
        if (h1Var != null) {
            h1Var.f410378e = q17;
        }
        sp2.j jVar = sp2.j.f411054a;
        android.content.Context context = this.f121735a.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        sp2.j.e(jVar, context, item, q17, null, 8, null);
    }
}
