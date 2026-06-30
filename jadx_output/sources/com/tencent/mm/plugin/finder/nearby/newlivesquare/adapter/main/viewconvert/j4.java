package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class j4 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4 f121741b;

    public j4(in5.s0 s0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4 p4Var) {
        this.f121740a = s0Var;
        this.f121741b = p4Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        android.content.Context context;
        java.lang.String str;
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        com.tencent.mars.xlog.Log.i("Finder.RecentWatchListConvert", "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.Iterator it = recordsSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                sp2.j jVar = sp2.j.f411054a;
                android.content.Context context2 = this.f121740a.itemView.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                jVar.c(context2, recordsSet, null);
                return;
            }
            in5.j jVar2 = (in5.j) it.next();
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4 p4Var = this.f121741b;
            p4Var.getClass();
            android.view.View view = jVar2.f293075f;
            if (view != null && (context = view.getContext()) != null) {
                pf5.z zVar = pf5.z.f353948a;
                boolean z17 = context instanceof androidx.appcompat.app.AppCompatActivity;
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
                rq2.w wVar = (rq2.w) zVar.a(appCompatActivity).a(rq2.w.class);
                if (wVar != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt("pull_liveid", java.lang.Long.valueOf(wVar.f398910o));
                    jSONObject.putOpt("pull_commentsence", wVar.f398911p);
                    jSONObject.putOpt("main_page_position", 5);
                    in5.c cVar = jVar2.f293070a;
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar : null;
                    if (baseFinderFeed != null) {
                        ml2.d dVar = p4Var.f121887m;
                        int i17 = jVar2.f293074e;
                        ml2.x1 x1Var = ml2.x1.f328202f;
                        if (!z17) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                        if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) {
                            str = "";
                        }
                        java.lang.String str2 = str;
                        java.lang.String jSONObject2 = jSONObject.toString();
                        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                        dVar.h(baseFinderFeed, i17, x1Var, str2, "", jSONObject2);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // in5.p
    public void d(in5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        sp2.j jVar = sp2.j.f411054a;
        android.content.Context context = this.f121740a.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        sp2.j.e(jVar, context, item, null, null, 12, null);
    }
}
