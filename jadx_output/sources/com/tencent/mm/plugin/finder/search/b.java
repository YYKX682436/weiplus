package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class b extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f125619d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f125620e;

    /* renamed from: f, reason: collision with root package name */
    public int f125621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI f125622g;

    public b(com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI, int i17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 3 : i17;
        this.f125622g = finderContactSearchIncludeFollowUI;
        this.f125619d = i17;
    }

    public static void x(com.tencent.mm.plugin.finder.search.b bVar, androidx.recyclerview.widget.k3 k3Var, int i17, boolean z17, int i18, java.lang.Object obj) {
        r45.mu2 mu2Var;
        java.lang.String str;
        bVar.getClass();
        boolean z18 = k3Var instanceof com.tencent.mm.plugin.finder.search.c;
        com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI = bVar.f125622g;
        if (z18) {
            if (bVar.getItemViewType(i17) == 1) {
                ((com.tencent.mm.plugin.finder.search.c) k3Var).f125640d.setText(finderContactSearchIncludeFollowUI.getString(com.tencent.mm.R.string.f491317dw3));
                return;
            } else {
                ((com.tencent.mm.plugin.finder.search.c) k3Var).f125640d.setText(finderContactSearchIncludeFollowUI.getString(com.tencent.mm.R.string.dw7));
                return;
            }
        }
        if (bVar.f125619d == 3 && bVar.f125620e && bVar.f125621f != finderContactSearchIncludeFollowUI.f125512i.size()) {
            int i19 = bVar.f125621f + 1;
            java.util.ArrayList arrayList = finderContactSearchIncludeFollowUI.f125512i;
            mu2Var = i17 < i19 ? (r45.mu2) arrayList.get(i17 - 1) : (r45.mu2) arrayList.get(i17 - 2);
        } else {
            mu2Var = (r45.mu2) finderContactSearchIncludeFollowUI.f125512i.get(i17);
        }
        kotlin.jvm.internal.o.d(mu2Var);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        finderContactSearchIncludeFollowUI.getClass();
        java.util.HashMap hashMap = finderContactSearchIncludeFollowUI.f125522v;
        if (!hashMap.containsKey(str)) {
            com.tencent.mm.plugin.finder.search.e0 e0Var = new com.tencent.mm.plugin.finder.search.e0();
            e0Var.f125666b = str;
            e0Var.f125665a = i17;
            e0Var.f125667c = 1;
            e0Var.f125668d = java.lang.System.currentTimeMillis();
            hashMap.put(str, e0Var);
            if (hashMap.size() % 30 == 0) {
                finderContactSearchIncludeFollowUI.Y6(false);
            }
        }
        kotlin.jvm.internal.o.e(k3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchContactItemHolder");
        com.tencent.mm.plugin.finder.search.v2 v2Var = (com.tencent.mm.plugin.finder.search.v2) k3Var;
        com.tencent.mm.plugin.finder.search.a aVar = new com.tencent.mm.plugin.finder.search.a(finderContactSearchIncludeFollowUI, i17);
        boolean z19 = i17 != 0;
        int i27 = com.tencent.mm.plugin.finder.search.v2.B;
        v2Var.k(mu2Var, aVar, null, z19);
        android.view.View findViewById = k3Var.itemView.findViewById(com.tencent.mm.R.id.gbd);
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = k3Var.itemView.findViewById(com.tencent.mm.R.id.gak);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
        if (((finderContact2 != null ? finderContact2.getOne_time_flag() : 0) & 4) > 0) {
            android.view.View findViewById3 = k3Var.itemView.findViewById(com.tencent.mm.R.id.eom);
            if (findViewById3 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById4 = k3Var.itemView.findViewById(com.tencent.mm.R.id.eom);
        if (findViewById4 == null) {
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        int i17 = this.f125619d;
        com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI = this.f125622g;
        if (i17 == 3 && finderContactSearchIncludeFollowUI.f125512i.size() != 0) {
            this.f125621f = 0;
            this.f125620e = false;
            java.util.Iterator it = finderContactSearchIncludeFollowUI.f125512i.iterator();
            while (it.hasNext()) {
                r45.mu2 mu2Var = (r45.mu2) it.next();
                int i18 = com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI.E;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getItemCount isFollow:");
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
                sb6.append(finderContact != null ? finderContact.getUsername() : null);
                com.tencent.mars.xlog.Log.i("Finder.FinderContactSearchIncludeFollowUI", sb6.toString());
                ya2.g gVar = ya2.h.f460484a;
                com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
                if (!ya2.g.h(gVar, finderContact2 != null ? finderContact2.getUsername() : null, null, false, false, 14, null)) {
                    break;
                }
                this.f125620e = true;
                this.f125621f++;
            }
            if (this.f125620e) {
                return this.f125621f == finderContactSearchIncludeFollowUI.f125512i.size() ? finderContactSearchIncludeFollowUI.f125512i.size() : finderContactSearchIncludeFollowUI.f125512i.size() + 2;
            }
        }
        return finderContactSearchIncludeFollowUI.f125512i.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (this.f125619d != 3 || !this.f125620e || this.f125621f == this.f125622g.f125512i.size()) {
            return 3;
        }
        if (i17 == 0) {
            return 1;
        }
        return i17 == this.f125621f + 1 ? 2 : 3;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        x(this, holder, i17, false, 4, null);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI = this.f125622g;
        if (i17 == 3) {
            androidx.appcompat.app.AppCompatActivity context = finderContactSearchIncludeFollowUI.getContext();
            kotlin.jvm.internal.o.d(context);
            android.view.View inflate = context.getLayoutInflater().inflate(com.tencent.mm.R.layout.av9, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new com.tencent.mm.plugin.finder.search.v2(inflate, false, false, true, 6, null);
        }
        androidx.appcompat.app.AppCompatActivity context2 = finderContactSearchIncludeFollowUI.getContext();
        kotlin.jvm.internal.o.d(context2);
        android.view.View inflate2 = context2.getLayoutInflater().inflate(com.tencent.mm.R.layout.b5j, parent, false);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new com.tencent.mm.plugin.finder.search.c(finderContactSearchIncludeFollowUI, inflate2);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        x(this, holder, i17, false, 4, null);
    }
}
