package com.tencent.mm.ui.chatting.search.multi.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class FTSMultiAllResultFragment extends com.tencent.mm.ui.component.UIComponentFragment {

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f202675n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f202676o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f202677p;

    /* renamed from: q, reason: collision with root package name */
    public zd5.g f202678q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f202679r = true;

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bcq;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.r0.f314002d;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        yj0.a.a("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        pf5.u uVar = pf5.u.f353936a;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        kotlin.jvm.internal.o.d(activity);
        ae5.n nVar = (ae5.n) ((ee5.h0) uVar.b(activity).a(ee5.h0.class)).f251899h.getValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultFragment", "onUserVisibleFocused >> " + nVar);
        if (nVar == ae5.n.f4433e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultFragment", "onUserVisibleFocused >> isRunning");
            androidx.fragment.app.FragmentActivity activity2 = getActivity();
            kotlin.jvm.internal.o.d(activity2);
            ee5.h0 h0Var = (ee5.h0) uVar.b(activity2).a(ee5.h0.class);
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "showDialog " + h0Var.f251897f);
            h0Var.F = pf5.e.launch$default(h0Var, null, null, new ee5.g0(h0Var, null), 3, null);
        }
        if (nVar == ae5.n.f4434f) {
            androidx.fragment.app.FragmentActivity activity3 = getActivity();
            kotlin.jvm.internal.o.d(activity3);
            ee5.h0 h0Var2 = (ee5.h0) uVar.b(activity3).a(ee5.h0.class);
            h0Var2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "reportExpose");
            de5.a aVar = de5.a.f229396a;
            int size = h0Var2.f251902n.size();
            androidx.appcompat.app.AppCompatActivity activity4 = h0Var2.getActivity();
            kotlin.jvm.internal.o.g(activity4, "activity");
            pf5.z zVar = pf5.z.f353948a;
            int R6 = ((ee5.z) zVar.a(activity4).a(ee5.z.class)).R6();
            androidx.appcompat.app.AppCompatActivity activity5 = h0Var2.getActivity();
            kotlin.jvm.internal.o.g(activity5, "activity");
            aVar.h(size, R6, ((ee5.z) zVar.a(activity5).a(ee5.z.class)).P6());
        }
        s0();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultFragment", "onCreateView");
        android.view.View view = this.f202675n;
        if (view != null) {
            return view;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultFragment", "onCreateView >> inflate view");
        android.view.View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        this.f202675n = onCreateView;
        this.f202676o = onCreateView != null ? (androidx.recyclerview.widget.RecyclerView) onCreateView.findViewById(com.tencent.mm.R.id.gg6) : null;
        android.view.View view2 = this.f202675n;
        this.f202677p = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.kcl) : null;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f202676o;
        if (recyclerView != null) {
            recyclerView.setOnTouchListener(new be5.b(this));
        }
        s0();
        androidx.fragment.app.FragmentActivity activity = getActivity();
        kotlin.jvm.internal.o.d(activity);
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((ee5.h0) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(ee5.h0.class)).f251899h.observe(this, new be5.a(this));
        return this.f202675n;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        yj0.a.a("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultFragment", "onUserVisibleUnFocused");
        this.f202679r = true;
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    public final void r0(java.util.ArrayList arrayList) {
        pf5.u uVar = pf5.u.f353936a;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        kotlin.jvm.internal.o.d(activity);
        ((ee5.h0) uVar.b(activity).a(ee5.h0.class)).Q6();
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultFragment", "dealResult to show no data no first");
            android.widget.TextView textView = this.f202677p;
            if (textView != null) {
                androidx.fragment.app.FragmentActivity activity2 = getActivity();
                kotlin.jvm.internal.o.d(activity2);
                ee5.h0 h0Var = (ee5.h0) uVar.b(activity2).a(ee5.h0.class);
                androidx.appcompat.app.AppCompatActivity activity3 = h0Var.getActivity();
                kotlin.jvm.internal.o.g(activity3, "activity");
                java.lang.String str = ((ee5.e3) pf5.z.f353948a.a(activity3).a(ee5.e3.class)).f251870f;
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "getEmptyResultString >> " + str);
                textView.setText(o13.q.m(h0Var.getString(com.tencent.mm.R.string.fgw), h0Var.getString(com.tencent.mm.R.string.fgr), str));
            }
            android.widget.TextView textView2 = this.f202677p;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f202676o;
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(8);
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f202676o;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        android.widget.TextView textView3 = this.f202677p;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        if (this.f202678q != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultFragment", "dealResult to show data no first");
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f202676o;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(null);
            }
            zd5.g gVar = this.f202678q;
            if (gVar != null) {
                gVar.f471683f = arrayList;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f202676o;
            if (recyclerView4 != null) {
                recyclerView4.setAdapter(this.f202678q);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView5 = this.f202676o;
            if (recyclerView5 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(recyclerView5, arrayList2.toArray(), "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment", "dealResult", "(Ljava/util/ArrayList;)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView5.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(recyclerView5, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiAllResultFragment", "dealResult", "(Ljava/util/ArrayList;)V", "Undefined", "scrollToPosition", "(I)V");
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultFragment", "dealResult to show data first");
        androidx.recyclerview.widget.RecyclerView recyclerView6 = this.f202676o;
        if (recyclerView6 != null) {
            recyclerView6.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity()));
        }
        androidx.fragment.app.FragmentActivity activity4 = getActivity();
        kotlin.jvm.internal.o.d(activity4);
        ee5.h0 h0Var2 = (ee5.h0) uVar.b(activity4).a(ee5.h0.class);
        if (h0Var2.f251905q == null) {
            zd5.g gVar2 = new zd5.g(h0Var2.getContext(), h0Var2.f251904p);
            h0Var2.f251905q = gVar2;
            gVar2.f471685h = h0Var2.f251903o;
            gVar2.f471684g = new ee5.c0(h0Var2);
        }
        zd5.g gVar3 = h0Var2.f251905q;
        kotlin.jvm.internal.o.d(gVar3);
        this.f202678q = gVar3;
        gVar3.f471683f = arrayList;
        androidx.recyclerview.widget.RecyclerView recyclerView7 = this.f202676o;
        if (recyclerView7 == null) {
            return;
        }
        recyclerView7.setAdapter(this.f202678q);
    }

    public final void s0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultFragment", "initFirstTimeData >> " + this.f202679r);
        if (this.f202679r) {
            pf5.u uVar = pf5.u.f353936a;
            androidx.fragment.app.FragmentActivity activity = getActivity();
            kotlin.jvm.internal.o.d(activity);
            ae5.n nVar = (ae5.n) ((ee5.h0) uVar.b(activity).a(ee5.h0.class)).f251899h.getValue();
            androidx.fragment.app.FragmentActivity activity2 = getActivity();
            kotlin.jvm.internal.o.d(activity2);
            ee5.h0 h0Var = (ee5.h0) uVar.b(activity2).a(ee5.h0.class);
            boolean z17 = h0Var.f251908t && !h0Var.B;
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultFragment", "initFirstTimeData >> state: " + nVar + ", currentAllDone: " + z17);
            if (nVar != ae5.n.f4434f || z17) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultFragment", "initFirstTimeData to update data");
            androidx.fragment.app.FragmentActivity activity3 = getActivity();
            kotlin.jvm.internal.o.d(activity3);
            r0(((ee5.h0) uVar.b(activity3).a(ee5.h0.class)).R6());
        }
    }
}
