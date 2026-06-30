package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class wc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.xc f136335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f136336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136337f;

    public wc(com.tencent.mm.plugin.finder.viewmodel.component.xc xcVar, yz5.l lVar, in5.s0 s0Var) {
        this.f136335d = xcVar;
        this.f136336e = lVar;
        this.f136337f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedHotCommentUIC$setupCommentLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.xc xcVar = this.f136335d;
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = xcVar.f136445p;
        if (finderCommentInfo != null) {
            if (xcVar.f136448s) {
                com.tencent.mm.plugin.finder.view.FinderHotCommentLayout finderHotCommentLayout = view instanceof com.tencent.mm.plugin.finder.view.FinderHotCommentLayout ? (com.tencent.mm.plugin.finder.view.FinderHotCommentLayout) view : null;
                if (finderHotCommentLayout != null) {
                    long commentId = finderCommentInfo.getCommentId();
                    in5.s0 holder = this.f136337f;
                    kotlin.jvm.internal.o.g(holder, "holder");
                    java.lang.Object obj = holder.f293125i;
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
                    if (baseFinderFeed == null) {
                        com.tencent.mars.xlog.Log.w("Finder.HotCommentLayout", "openDrawer failed: holder=" + holder + ", item=null");
                    } else {
                        if (commentId != finderHotCommentLayout.f131159n) {
                            com.tencent.mars.xlog.Log.w("Finder.HotCommentLayout", "openDrawer invalid: " + commentId + "!=" + finderHotCommentLayout.f131159n);
                        }
                        androidx.recyclerview.widget.f2 f2Var = holder.f293122f;
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = f2Var instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) f2Var : null;
                        in5.r w07 = wxRecyclerAdapter != null ? wxRecyclerAdapter.w0(holder.getItemViewType()) : null;
                        com.tencent.mm.plugin.finder.convert.qe qeVar = w07 instanceof com.tencent.mm.plugin.finder.convert.qe ? (com.tencent.mm.plugin.finder.convert.qe) w07 : null;
                        if (qeVar != null) {
                            com.tencent.mm.plugin.finder.convert.qe.E0(qeVar, holder, baseFinderFeed, false, commentId, null, 0, 5, false, 1500L, 0, 1, 692, null);
                        }
                    }
                }
            } else {
                yz5.l lVar = this.f136336e;
                if (lVar != null) {
                    lVar.invoke(java.lang.Long.valueOf(finderCommentInfo.getCommentId()));
                }
            }
        }
        long j17 = xcVar.f136440h;
        xcVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.Object obj2 = ((java.util.LinkedHashMap) xcVar.f136444o).get(java.lang.Long.valueOf(j17));
        if (obj2 == null) {
            obj2 = 0L;
        }
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        long j18 = xcVar.f136441i;
        ((m30.m) rVar).getClass();
        jSONObject2.put("cid", b52.b.q(j18));
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        jSONObject2.put("feedid", b52.b.q(j17));
        jSONObject2.put("current_play_sec", obj2);
        jSONObject2.put("video_duration", xcVar.f136442m);
        jSONObject2.put("expose_start_time", xcVar.f136439g);
        jSONObject2.put(ya.b.CONTENT_TYPE, xcVar.f136447r);
        jSONObject.put("hot_comment", jSONObject2);
        xcVar.k7(jSONObject2);
        android.app.Activity context = xcVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, nyVar != null ? nyVar.V6() : null, "hot_comment", 1, jSONObject, false, null, 48, null);
        xcVar.i7(xcVar.f136440h, 2);
        xcVar.f136443n = true;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedHotCommentUIC$setupCommentLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
