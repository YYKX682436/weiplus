package com.tencent.mm.plugin.profile.ui.tab.list;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabArticleFragment;", "Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabCommonFragment;", "Lwr3/m;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizProfileTabArticleFragment extends com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment<wr3.m> {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f154421w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView f154422x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizProfileTabArticleFragment(boolean z17, int i17, sr3.g config) {
        super(z17, i17, config);
        kotlin.jvm.internal.o.g(config, "config");
        this.f154421w = "BizProfileTabArticleFragment";
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public void F0(r45.wl bizProfileResp, r45.tj6 tj6Var) {
        kotlin.jvm.internal.o.g(bizProfileResp, "bizProfileResp");
        bizProfileResp.C = tj6Var;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public boolean G0(vr3.h outBoxData) {
        r45.p5 p5Var;
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(outBoxData, "outBoxData");
        r45.s5 s5Var = outBoxData.f439631a;
        return (s5Var != null && (p5Var = s5Var.f385514i) != null && (linkedList = p5Var.f382754e) != null && (linkedList.isEmpty() ^ true)) && ((r45.o5) s5Var.f385514i.f382754e.get(0)).f381923p == 0;
    }

    public com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView J0() {
        com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView gradientBackgroundRecyclerView = this.f154422x;
        if (gradientBackgroundRecyclerView != null) {
            return gradientBackgroundRecyclerView;
        }
        kotlin.jvm.internal.o.o("mRecyclerView");
        throw null;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment, com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment, zy2.h5
    public void P() {
        try {
            if (this.f154422x != null) {
                com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView J0 = J0();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(J0, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabArticleFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
                J0.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(J0, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabArticleFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f154421w, "onAppBarLayoutExpand: recyclerView error: " + e17);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.a1c, viewGroup, false);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f154422x = (com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView) findViewById;
        com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView J0 = J0();
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.d(context);
        J0.N(new wr3.u0(context));
        J0().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(inflate.getContext()));
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("contact") : null;
        kotlin.jvm.internal.o.d(string);
        this.f154411d = string;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(j0(), true);
        android.content.Context context2 = inflater.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        kotlin.jvm.internal.o.d(n17);
        this.f154432v = new wr3.m(context2, j0(), this.f154426p, this.f154427q, this.f154430t, this.f154431u, this.f154428r, n17);
        J0().setAdapter(r0());
        J0().setOnScrollToTopListener(new wr3.n(this));
        return inflate;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        p0(this.f154421w, new wr3.o(this), new wr3.p(this), new wr3.q(this), new wr3.r(this));
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public java.util.ArrayList q0(r45.wl wlVar) {
        synchronized (this) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (wlVar != null) {
                r45.tj6 tj6Var = wlVar.C;
                if ((tj6Var != null ? tj6Var.f386510f : null) != null && !tj6Var.f386510f.f388353e.isEmpty()) {
                    J0().setHasTopic(true);
                    return new java.util.ArrayList(wlVar.C.f386510f.f388353e);
                }
            }
            return arrayList;
        }
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    /* renamed from: s0, reason: from getter */
    public java.lang.String getF154421w() {
        return this.f154421w;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public r45.tj6 t0(r45.wl bizProfileResp) {
        kotlin.jvm.internal.o.g(bizProfileResp, "bizProfileResp");
        return bizProfileResp.C;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public java.lang.String u0() {
        return "ArticleList";
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public androidx.lifecycle.j0 w0(com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher) {
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        return dataFetcher.f154291v;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public void x0(com.tencent.mm.protobuf.g gVar) {
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher n07 = n0();
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher.g(n07, n07.A, new vr3.l(n07), 4, gVar, n07.f154285p, null, 32, null);
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public void y0(com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher, androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        kotlin.jvm.internal.o.g(observer, "observer");
        dataFetcher.f154285p.observe(this, observer);
    }
}
