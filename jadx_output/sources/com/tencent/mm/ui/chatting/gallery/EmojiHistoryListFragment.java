package com.tencent.mm.ui.chatting.gallery;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "com/tencent/mm/ui/chatting/gallery/i0", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EmojiHistoryListFragment extends com.tencent.mm.ui.component.UIComponentFragment {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f200545n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f200546o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f200547p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f200548q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.h0 f200549r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.presenter.h0 f200550s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f200551t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f200552u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f200553v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f200554w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f200555x;

    public EmojiHistoryListFragment(java.lang.String adapterTalker, boolean z17) {
        kotlin.jvm.internal.o.g(adapterTalker, "adapterTalker");
        this.f200545n = adapterTalker;
        this.f200546o = z17;
        this.f200552u = "";
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.efj;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.r0.f314002d;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        yj0.a.a("com/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        java.util.List list;
        kotlin.jvm.internal.o.g(context, "context");
        super.onAttach(context);
        com.tencent.mm.ui.chatting.gallery.h0 h0Var = new com.tencent.mm.ui.chatting.gallery.h0(context, this.f200545n, this.f200546o);
        this.f200549r = h0Var;
        if (this.f200553v || (list = this.f200551t) == null) {
            return;
        }
        h0Var.f200974g = kz5.n0.V0(list);
        com.tencent.mm.ui.chatting.gallery.h0 h0Var2 = this.f200549r;
        if (h0Var2 != null) {
            h0Var2.notifyDataSetChanged();
        }
        this.f200553v = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListFragment", "onCreateView >> inflate view");
        android.view.View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        if (onCreateView == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiHistoryListFragment", "onCreateView >> inflate view failed !");
            return null;
        }
        this.f200547p = (androidx.recyclerview.widget.RecyclerView) onCreateView.findViewById(com.tencent.mm.R.id.gg6);
        this.f200548q = (android.widget.TextView) onCreateView.findViewById(com.tencent.mm.R.id.kcl);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f200547p;
        if (recyclerView != null) {
            recyclerView.setOnTouchListener(new com.tencent.mm.ui.chatting.gallery.j0(this));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f200547p;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f200549r);
        }
        java.util.List list = this.f200551t;
        if (list != null) {
            kotlin.jvm.internal.o.d(list);
            r0(list, this.f200552u);
            this.f200551t = null;
        }
        return onCreateView;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        android.view.View view2 = getView();
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.d(context);
        float f17 = context.getResources().getDisplayMetrics().density;
        if (view2 != null) {
            view2.post(new com.tencent.mm.ui.chatting.gallery.m0(this, view2, f17));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        yj0.a.a("com/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    public final void r0(java.util.List dataList, java.lang.String query) {
        boolean z17;
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(query, "query");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListFragment", "[onSearchResult] :: dataList size: " + dataList.size() + " with query: " + query);
        this.f200551t = kz5.n0.V0(dataList);
        this.f200552u = query;
        if (this.f200549r == null || this.f200547p == null || this.f200548q == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListFragment", "fragment not inited !");
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            de5.a.f229396a.b(7, this.f200546o);
            java.util.List list = this.f200551t;
            if (list != null && ((java.util.ArrayList) list).size() == 0) {
                if (kotlin.jvm.internal.o.b(query, "")) {
                    android.widget.TextView textView = this.f200548q;
                    if (textView != null) {
                        textView.setText(getString(com.tencent.mm.R.string.b5e));
                    }
                } else {
                    java.lang.String string = getString(com.tencent.mm.R.string.nps, query);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    android.widget.TextView textView2 = this.f200548q;
                    if (textView2 != null) {
                        textView2.setText(o13.q.c(textView2.getContext(), string, query));
                    }
                }
                android.widget.TextView textView3 = this.f200548q;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                androidx.recyclerview.widget.RecyclerView recyclerView = this.f200547p;
                if (recyclerView == null) {
                    return;
                }
                recyclerView.setVisibility(8);
                return;
            }
            android.widget.TextView textView4 = this.f200548q;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f200547p;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
            }
            com.tencent.mm.ui.chatting.gallery.h0 h0Var = this.f200549r;
            if (h0Var == null) {
                this.f200553v = false;
                return;
            }
            java.util.List list2 = this.f200551t;
            kotlin.jvm.internal.o.d(list2);
            h0Var.f200974g = kz5.n0.V0(list2);
            com.tencent.mm.ui.chatting.gallery.h0 h0Var2 = this.f200549r;
            if (h0Var2 != null) {
                h0Var2.notifyDataSetChanged();
            }
            this.f200553v = true;
        }
    }
}
