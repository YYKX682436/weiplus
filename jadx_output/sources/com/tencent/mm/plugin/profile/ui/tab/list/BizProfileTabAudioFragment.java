package com.tencent.mm.plugin.profile.ui.tab.list;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabAudioFragment;", "Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabCommonFragment;", "Lwr3/v;", "wr3/w", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizProfileTabAudioFragment extends com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment<wr3.v> {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f154424w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView f154425x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizProfileTabAudioFragment(boolean z17, int i17, sr3.g config) {
        super(z17, i17, config);
        kotlin.jvm.internal.o.g(config, "config");
        this.f154424w = "BizProfileTabAudioFragment";
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public void F0(r45.wl bizProfileResp, r45.tj6 tj6Var) {
        kotlin.jvm.internal.o.g(bizProfileResp, "bizProfileResp");
        bizProfileResp.E = tj6Var;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public boolean G0(vr3.h outBoxData) {
        kotlin.jvm.internal.o.g(outBoxData, "outBoxData");
        return false;
    }

    public com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView J0() {
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView bizProfileRecyclerView = this.f154425x;
        if (bizProfileRecyclerView != null) {
            return bizProfileRecyclerView;
        }
        kotlin.jvm.internal.o.o("mRecyclerView");
        throw null;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment, com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment, zy2.h5
    public void P() {
        try {
            if (this.f154425x != null) {
                com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView J0 = J0();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(J0, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabAudioFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
                J0.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(J0, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabAudioFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f154424w, "onAppBarLayoutExpand: recyclerView error: " + e17);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.e3_, viewGroup, false);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f154425x = (com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView) findViewById;
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView J0 = J0();
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.d(context);
        J0.N(new wr3.w(context));
        J0().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(inflate.getContext()));
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("contact") : null;
        kotlin.jvm.internal.o.d(string);
        this.f154411d = string;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(j0(), true);
        android.content.Context context2 = inflater.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        kotlin.jvm.internal.o.d(n17);
        this.f154432v = new wr3.v(context2, j0(), this.f154426p, this.f154427q, this.f154430t, this.f154431u, this.f154428r, n17, this);
        ((wr3.v) r0()).f448900z.alive();
        J0().setAdapter(r0());
        J0().setOnScrollToTopListener(new wr3.x(this));
        return inflate;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        p0(this.f154424w, new wr3.y(this), wr3.z.f448922d, new wr3.a0(this), new wr3.b0(this));
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public java.util.ArrayList q0(r45.wl wlVar) {
        synchronized (this) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (wlVar != null) {
                r45.tj6 tj6Var = wlVar.E;
                if ((tj6Var != null ? tj6Var.f386510f : null) != null && !tj6Var.f386510f.f388353e.isEmpty()) {
                    return new java.util.ArrayList(wlVar.E.f386510f.f388353e);
                }
            }
            return arrayList;
        }
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    /* renamed from: s0, reason: from getter */
    public java.lang.String getF154424w() {
        return this.f154424w;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public r45.tj6 t0(r45.wl bizProfileResp) {
        kotlin.jvm.internal.o.g(bizProfileResp, "bizProfileResp");
        return bizProfileResp.E;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public java.lang.String u0() {
        return "AudioList";
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public androidx.lifecycle.j0 w0(com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher) {
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        return null;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public void x0(com.tencent.mm.protobuf.g gVar) {
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher n07 = n0();
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher.g(n07, n07.C, new vr3.m(n07), 6, gVar, n07.f154287r, null, 32, null);
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public void y0(com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher, androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        kotlin.jvm.internal.o.g(observer, "observer");
        dataFetcher.f154287r.observe(this, observer);
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment
    public void z0(wr3.f0 f0Var) {
        wr3.v adapter = (wr3.v) f0Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        adapter.f448900z.dead();
    }
}
