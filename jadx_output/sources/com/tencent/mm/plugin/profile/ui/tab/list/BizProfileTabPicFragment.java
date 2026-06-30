package com.tencent.mm.plugin.profile.ui.tab.list;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabPicFragment;", "Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabCommonFragment;", "Lwr3/m1;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizProfileTabPicFragment extends com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment<wr3.m1> {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f154443w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.tab.view.BizProfilePicTabRecyclerView f154444x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizProfileTabPicFragment(boolean z17, int i17, sr3.g config) {
        super(z17, i17, config);
        kotlin.jvm.internal.o.g(config, "config");
        this.f154443w = "BizProfileTabPicFragment";
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public void A0(java.util.List msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        if (getContext() == null || !(getContext() instanceof com.tencent.mm.plugin.profile.ui.ContactInfoUI)) {
            return;
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.ContactInfoUI");
        gr3.c cVar = gr3.c.f274848a;
        java.lang.String a17 = gr3.c.f274848a.a((com.tencent.mm.plugin.profile.ui.ContactInfoUI) context, "piclist");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gr3.c.f274851d;
        java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(a17);
        if (l17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizProfileMonitor", "recordPicMsgListLoadEnd: startTime is null for " + a17);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2127L, 32L, java.lang.System.currentTimeMillis() - l17.longValue(), false);
            concurrentHashMap.remove(a17);
        }
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public void C0() {
        if (n0().f154278f == null || !(n0().f154278f instanceof com.tencent.mm.plugin.profile.ui.ContactInfoUI)) {
            return;
        }
        com.tencent.mm.ui.MMActivity mMActivity = n0().f154278f;
        kotlin.jvm.internal.o.e(mMActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.ContactInfoUI");
        gr3.c cVar = gr3.c.f274848a;
        gr3.c.f274851d.put(gr3.c.f274848a.a((com.tencent.mm.plugin.profile.ui.ContactInfoUI) mMActivity, "piclist"), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public void F0(r45.wl bizProfileResp, r45.tj6 tj6Var) {
        kotlin.jvm.internal.o.g(bizProfileResp, "bizProfileResp");
        bizProfileResp.D = tj6Var;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public boolean G0(vr3.h outBoxData) {
        r45.p5 p5Var;
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(outBoxData, "outBoxData");
        r45.s5 s5Var = outBoxData.f439631a;
        return (s5Var != null && (p5Var = s5Var.f385514i) != null && (linkedList = p5Var.f382754e) != null && (linkedList.isEmpty() ^ true)) && ((r45.o5) s5Var.f385514i.f382754e.get(0)).f381923p == 8;
    }

    public final com.tencent.mm.plugin.profile.ui.tab.view.BizProfilePicTabRecyclerView J0() {
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfilePicTabRecyclerView bizProfilePicTabRecyclerView = this.f154444x;
        if (bizProfilePicTabRecyclerView != null) {
            return bizProfilePicTabRecyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment, com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment, zy2.h5
    public void P() {
        try {
            if (this.f154444x != null) {
                com.tencent.mm.plugin.profile.ui.tab.view.BizProfilePicTabRecyclerView J0 = J0();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(J0, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabPicFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
                J0.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(J0, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabPicFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f154443w, "onAppBarLayoutExpand: recyclerView error: " + e17);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.e3a, viewGroup, false);
        android.content.Context context = inflater.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        new com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView(context);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f154444x = (com.tencent.mm.plugin.profile.ui.tab.view.BizProfilePicTabRecyclerView) findViewById;
        J0().setLayoutManager(new androidx.recyclerview.widget.StaggeredGridLayoutManager(2, 1));
        J0().N(new wr3.k(J0().getContext()));
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("contact") : null;
        kotlin.jvm.internal.o.d(string);
        this.f154411d = string;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(j0(), true);
        android.content.Context context2 = inflater.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        kotlin.jvm.internal.o.d(n17);
        this.f154432v = new wr3.m1(context2, j0(), this.f154426p, this.f154427q, this.f154430t, this.f154431u, this.f154428r, n17);
        wr3.m1 m1Var = (wr3.m1) r0();
        android.content.Context context3 = J0().getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        int e17 = fq1.e.f265507a.e(context3);
        int round = java.lang.Math.round(es.h.b(context3) * 8.0f);
        int i17 = e17 - (round * 2);
        int i18 = i17 / 2;
        m1Var.f448837x = i18;
        m1Var.f448838y = (int) ((i18 * 3.0d) / 4.0d);
        com.tencent.mars.xlog.Log.i("BizProfileTabPicAdapter", "initLayoutParams: screenWidth=" + e17 + ", spacing=" + round + ", availableWidth=" + i17 + ", itemWidth=" + m1Var.f448837x + ", itemHeight=" + m1Var.f448838y);
        androidx.recyclerview.widget.y2 recycledViewPool = J0().getRecycledViewPool();
        kotlin.jvm.internal.o.f(recycledViewPool, "getRecycledViewPool(...)");
        recycledViewPool.e(0, 20);
        J0().setRecycledViewPool(recycledViewPool);
        J0().setAdapter(r0());
        J0().setOnScrollToTopListener(new wr3.n1(this));
        return inflate;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        p0(this.f154443w, new wr3.o1(this), new wr3.p1(this), new wr3.q1(this), new wr3.r1(this));
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public java.util.ArrayList q0(r45.wl wlVar) {
        synchronized (this) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (wlVar != null) {
                r45.tj6 tj6Var = wlVar.D;
                if ((tj6Var != null ? tj6Var.f386510f : null) != null && !tj6Var.f386510f.f388353e.isEmpty()) {
                    J0().setHasTopic(true);
                    return new java.util.ArrayList(wlVar.D.f386510f.f388353e);
                }
            }
            return arrayList;
        }
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    /* renamed from: s0, reason: from getter */
    public java.lang.String getF154443w() {
        return this.f154443w;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public r45.tj6 t0(r45.wl bizProfileResp) {
        kotlin.jvm.internal.o.g(bizProfileResp, "bizProfileResp");
        return bizProfileResp.D;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public java.lang.String u0() {
        return "PicTab";
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public androidx.lifecycle.j0 w0(com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher) {
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        return dataFetcher.f154292w;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public void x0(com.tencent.mm.protobuf.g gVar) {
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher n07 = n0();
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher.g(n07, n07.B, new vr3.n(n07), 5, gVar, n07.f154286q, null, 32, null);
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public void y0(com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher, androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        kotlin.jvm.internal.o.g(observer, "observer");
        dataFetcher.f154286q.observe(this, observer);
    }
}
