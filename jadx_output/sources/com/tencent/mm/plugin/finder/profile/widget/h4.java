package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class h4 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f124568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124569e;

    public h4(int i17, com.tencent.mm.plugin.finder.profile.widget.s4 s4Var) {
        this.f124568d = i17;
        this.f124569e = s4Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var != null) {
            m1Var.setHasCallbackToQueue(true);
        }
        if (i17 == 0 && i18 == 0 && this.f124568d == 3) {
            com.tencent.mm.network.v0 reqResp = m1Var != null ? m1Var.getReqResp() : null;
            com.tencent.mm.modelbase.o oVar = reqResp instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) reqResp : null;
            com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70711b.f70700a : null;
            r45.su0 su0Var = fVar instanceof r45.su0 ? (r45.su0) fVar : null;
            if (su0Var != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#doReserveInternal FinderAudienceReserveOpType_ReserveAll back coupon size: ");
                java.util.LinkedList list = su0Var.getList(3);
                sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
                com.tencent.mars.xlog.Log.i("FinderMoreLiveNoticeListWidget", sb6.toString());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedList<r45.h32> list2 = su0Var.getList(3);
                if (list2 != null) {
                    for (r45.h32 h32Var : list2) {
                        kotlin.jvm.internal.o.d(h32Var);
                        r45.ov2 a17 = zl2.t.a(h32Var);
                        if (a17 != null) {
                            if (!com.tencent.mm.plugin.finder.assist.o7.a(a17)) {
                                a17 = null;
                            }
                            if (a17 != null) {
                                java.lang.String string = h32Var.getString(4);
                                if (string == null) {
                                    string = "";
                                }
                                arrayList.add(new com.tencent.mm.plugin.finder.view.dd(a17, string));
                            }
                        }
                    }
                }
                com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124569e;
                r45.j32 j32Var = s4Var.f124764r;
                if (j32Var != null) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = s4Var.f124759m;
                    java.lang.Object layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
                    com.tencent.mm.plugin.finder.profile.widget.s4.I.a(s4Var.f124748b, j32Var, s4Var.f124765s, s4Var.D, null, "", 0L, s4Var.f124747a, arrayList, linearLayoutManager != null ? linearLayoutManager.w() : -1, s4Var);
                }
            }
        }
    }
}
