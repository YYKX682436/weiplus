package com.tencent.mm.ui.chatting.search.multi.fragment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class FTSMultiNormalResultFragment extends com.tencent.mm.ui.component.UIComponentFragment {

    /* renamed from: n, reason: collision with root package name */
    public final int f202681n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f202682o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f202683p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f202684q;

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f202685r;

    /* renamed from: s, reason: collision with root package name */
    public int f202686s;

    public FTSMultiNormalResultFragment(int i17) {
        this.f202681n = i17;
    }

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
        androidx.lifecycle.g0 g0Var;
        yj0.a.a("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        ee5.t2 s07 = s0();
        boolean z17 = ((s07 == null || (g0Var = s07.f252053i) == null) ? null : (ae5.n) g0Var.getValue()) == ae5.n.f4434f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiNormalResultFragment", "onUserVisibleFocused >> " + this.f202681n + ", " + z17 + ", " + this.f202686s);
        if (z17) {
            de5.a aVar = de5.a.f229396a;
            int i17 = this.f202686s;
            androidx.fragment.app.FragmentActivity activity = getActivity();
            kotlin.jvm.internal.o.d(activity);
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            int R6 = ((ee5.z) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(ee5.z.class)).R6();
            androidx.fragment.app.FragmentActivity activity2 = getActivity();
            kotlin.jvm.internal.o.d(activity2);
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(activity2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            aVar.h(i17, R6, ((ee5.z) zVar2.a((androidx.appcompat.app.AppCompatActivity) activity2).a(ee5.z.class)).P6());
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        androidx.lifecycle.g0 g0Var;
        kotlin.jvm.internal.o.g(inflater, "inflater");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateView >> resultType: ");
        int i17 = this.f202681n;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiNormalResultFragment", sb6.toString());
        if (this.f202682o == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiNormalResultFragment", "onCreateView >> inflate view resultType: " + i17);
            android.view.View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
            this.f202682o = onCreateView;
            androidx.recyclerview.widget.RecyclerView recyclerView = onCreateView != null ? (androidx.recyclerview.widget.RecyclerView) onCreateView.findViewById(com.tencent.mm.R.id.gg6) : null;
            this.f202683p = recyclerView;
            if (recyclerView != null) {
                recyclerView.setOnTouchListener(new be5.d(this));
            }
            android.view.View view = this.f202682o;
            this.f202684q = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kcl) : null;
            ee5.t2 s07 = s0();
            if (((s07 == null || (g0Var = s07.f252053i) == null) ? null : (ae5.n) g0Var.getValue()) == ae5.n.f4434f) {
                ee5.t2 s08 = s0();
                r0(s08 != null ? s08.f252054m : null);
            }
            ee5.t2 s09 = s0();
            androidx.lifecycle.g0 g0Var2 = s09 != null ? s09.f252053i : null;
            if (g0Var2 != null) {
                g0Var2.observe(this, new be5.c(this));
            }
        }
        return this.f202682o;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        yj0.a.a("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    public final void r0(java.util.ArrayList arrayList) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealResult >> ");
        sb6.append(this.f202681n);
        sb6.append(", ");
        boolean z17 = true;
        sb6.append(arrayList == null || arrayList.isEmpty());
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiNormalResultFragment", sb6.toString());
        int size = arrayList != null ? arrayList.size() : 0;
        this.f202686s = size;
        de5.a aVar = de5.a.f229396a;
        pf5.u uVar = pf5.u.f353936a;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        kotlin.jvm.internal.o.d(activity);
        int R6 = ((ee5.z) uVar.b(activity).a(ee5.z.class)).R6();
        androidx.fragment.app.FragmentActivity activity2 = getActivity();
        kotlin.jvm.internal.o.d(activity2);
        aVar.h(size, R6, ((ee5.z) uVar.b(activity2).a(ee5.z.class)).P6());
        if (arrayList != null && !arrayList.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            android.widget.TextView textView = this.f202684q;
            if (textView != null) {
                ee5.t2 s07 = s0();
                textView.setText(s07 != null ? s07.O6() : null);
            }
            android.widget.TextView textView2 = this.f202684q;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f202683p;
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(8);
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f202683p;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        android.widget.TextView textView3 = this.f202684q;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        zd5.n nVar = this.f202685r;
        if (nVar == null) {
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f202683p;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity()));
            }
            ee5.t2 s08 = s0();
            zd5.n P6 = s08 != null ? s08.P6() : null;
            this.f202685r = P6;
            if (P6 != null) {
                androidx.fragment.app.FragmentActivity activity3 = getActivity();
                kotlin.jvm.internal.o.d(activity3);
                java.lang.String query = ((ee5.e3) uVar.b(activity3).a(ee5.e3.class)).f251870f;
                kotlin.jvm.internal.o.g(query, "query");
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiNormalResultAdapter", "updateCurrentQuery >> ".concat(query));
                P6.f471702g = query;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f202683p;
            if (recyclerView4 == null) {
                return;
            }
            recyclerView4.setAdapter(this.f202685r);
            return;
        }
        androidx.fragment.app.FragmentActivity activity4 = getActivity();
        kotlin.jvm.internal.o.d(activity4);
        java.lang.String query2 = ((ee5.e3) uVar.b(activity4).a(ee5.e3.class)).f251870f;
        kotlin.jvm.internal.o.g(query2, "query");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiNormalResultAdapter", "updateCurrentQuery >> ".concat(query2));
        nVar.f471702g = query2;
        androidx.recyclerview.widget.RecyclerView recyclerView5 = this.f202683p;
        if (recyclerView5 != null) {
            recyclerView5.setAdapter(null);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView6 = this.f202683p;
        if (recyclerView6 != null) {
            recyclerView6.setAdapter(this.f202685r);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView7 = this.f202683p;
        if (recyclerView7 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recyclerView7, arrayList2.toArray(), "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment", "dealResult", "(Ljava/util/ArrayList;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView7.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recyclerView7, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment", "dealResult", "(Ljava/util/ArrayList;)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    public final ee5.t2 s0() {
        switch (this.f202681n) {
            case 1:
                androidx.fragment.app.FragmentActivity activity = getActivity();
                kotlin.jvm.internal.o.d(activity);
                pf5.z zVar = pf5.z.f353948a;
                if (activity instanceof androidx.appcompat.app.AppCompatActivity) {
                    return (ee5.t2) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(ee5.v0.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 2:
                androidx.fragment.app.FragmentActivity activity2 = getActivity();
                kotlin.jvm.internal.o.d(activity2);
                pf5.z zVar2 = pf5.z.f353948a;
                if (activity2 instanceof androidx.appcompat.app.AppCompatActivity) {
                    return (ee5.t2) zVar2.a((androidx.appcompat.app.AppCompatActivity) activity2).a(ee5.m2.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 3:
                androidx.fragment.app.FragmentActivity activity3 = getActivity();
                kotlin.jvm.internal.o.d(activity3);
                pf5.z zVar3 = pf5.z.f353948a;
                if (activity3 instanceof androidx.appcompat.app.AppCompatActivity) {
                    return (ee5.t2) zVar3.a((androidx.appcompat.app.AppCompatActivity) activity3).a(ee5.n1.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 4:
                androidx.fragment.app.FragmentActivity activity4 = getActivity();
                kotlin.jvm.internal.o.d(activity4);
                pf5.z zVar4 = pf5.z.f353948a;
                if (activity4 instanceof androidx.appcompat.app.AppCompatActivity) {
                    return (ee5.t2) zVar4.a((androidx.appcompat.app.AppCompatActivity) activity4).a(ee5.v1.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 5:
                androidx.fragment.app.FragmentActivity activity5 = getActivity();
                kotlin.jvm.internal.o.d(activity5);
                pf5.z zVar5 = pf5.z.f353948a;
                if (activity5 instanceof androidx.appcompat.app.AppCompatActivity) {
                    return (ee5.t2) zVar5.a((androidx.appcompat.app.AppCompatActivity) activity5).a(ee5.n0.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 6:
                androidx.fragment.app.FragmentActivity activity6 = getActivity();
                kotlin.jvm.internal.o.d(activity6);
                pf5.z zVar6 = pf5.z.f353948a;
                if (activity6 instanceof androidx.appcompat.app.AppCompatActivity) {
                    return (ee5.t2) zVar6.a((androidx.appcompat.app.AppCompatActivity) activity6).a(ee5.h2.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 7:
                androidx.fragment.app.FragmentActivity activity7 = getActivity();
                kotlin.jvm.internal.o.d(activity7);
                pf5.z zVar7 = pf5.z.f353948a;
                if (activity7 instanceof androidx.appcompat.app.AppCompatActivity) {
                    return (ee5.t2) zVar7.a((androidx.appcompat.app.AppCompatActivity) activity7).a(ee5.d1.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 8:
                androidx.fragment.app.FragmentActivity activity8 = getActivity();
                kotlin.jvm.internal.o.d(activity8);
                pf5.z zVar8 = pf5.z.f353948a;
                if (activity8 instanceof androidx.appcompat.app.AppCompatActivity) {
                    return (ee5.t2) zVar8.a((androidx.appcompat.app.AppCompatActivity) activity8).a(ee5.a2.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 9:
                androidx.fragment.app.FragmentActivity activity9 = getActivity();
                kotlin.jvm.internal.o.d(activity9);
                pf5.z zVar9 = pf5.z.f353948a;
                if (activity9 instanceof androidx.appcompat.app.AppCompatActivity) {
                    return (ee5.t2) zVar9.a((androidx.appcompat.app.AppCompatActivity) activity9).a(ee5.i1.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            case 10:
                androidx.fragment.app.FragmentActivity activity10 = getActivity();
                kotlin.jvm.internal.o.d(activity10);
                pf5.z zVar10 = pf5.z.f353948a;
                if (activity10 instanceof androidx.appcompat.app.AppCompatActivity) {
                    return (ee5.t2) zVar10.a((androidx.appcompat.app.AppCompatActivity) activity10).a(ee5.s1.class);
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            default:
                return null;
        }
    }
}
