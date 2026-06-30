package com.tencent.mm.plugin.profile.ui.tab.list;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment;", "Lcom/tencent/mm/plugin/profile/ui/tab/list/BaseBizProfileFragment;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizProfileTabVideoFragment extends com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment {

    /* renamed from: p, reason: collision with root package name */
    public final boolean f154445p;

    /* renamed from: q, reason: collision with root package name */
    public final int f154446q;

    /* renamed from: r, reason: collision with root package name */
    public wr3.z1 f154447r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f154448s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView f154449t;

    public BizProfileTabVideoFragment(boolean z17, int i17) {
        this.f154445p = z17;
        this.f154446q = i17;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment, zy2.h5
    public void P() {
        if (this.f154449t == null) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView q07 = q0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(q07, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
        q07.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(q07, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.a1e, viewGroup, false);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f154449t = (com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView) findViewById;
        q0().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity()));
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("contact") : null;
        kotlin.jvm.internal.o.d(string);
        this.f154411d = string;
        this.f154447r = new wr3.z1(this.f154448s, j0(), this.f154445p, this.f154446q);
        androidx.recyclerview.widget.y2 recycledViewPool = q0().getRecycledViewPool();
        kotlin.jvm.internal.o.f(recycledViewPool, "getRecycledViewPool(...)");
        recycledViewPool.e(0, 20);
        q0().setRecycledViewPool(recycledViewPool);
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView q07 = q0();
        wr3.z1 z1Var = this.f154447r;
        if (z1Var == null) {
            kotlin.jvm.internal.o.o("mVideoAdapter");
            throw null;
        }
        q07.setAdapter(z1Var);
        q0().setOnScrollToTopListener(new wr3.a2(this));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        java.util.List list = this.f154448s;
        if (((java.util.ArrayList) list).isEmpty()) {
            r45.gl glVar = m0().f389237h;
            boolean z17 = false;
            if (glVar != null && (linkedList = glVar.f375323d) != null && (!linkedList.isEmpty())) {
                z17 = true;
            }
            if (z17) {
                java.util.LinkedList Msg = m0().f389237h.f375323d;
                kotlin.jvm.internal.o.f(Msg, "Msg");
                ((java.util.ArrayList) list).addAll(Msg);
                wr3.z1 z1Var = this.f154447r;
                if (z1Var == null) {
                    kotlin.jvm.internal.o.o("mVideoAdapter");
                    throw null;
                }
                z1Var.notifyDataSetChanged();
            }
        }
        wr3.z1 z1Var2 = this.f154447r;
        if (z1Var2 != null) {
            z1Var2.f448931n = new wr3.b2(this);
        } else {
            kotlin.jvm.internal.o.o("mVideoAdapter");
            throw null;
        }
    }

    public com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView q0() {
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView bizProfileRecyclerView = this.f154449t;
        if (bizProfileRecyclerView != null) {
            return bizProfileRecyclerView;
        }
        kotlin.jvm.internal.o.o("mRecyclerView");
        throw null;
    }
}
