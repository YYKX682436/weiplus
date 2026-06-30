package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class x2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.z2 f117522d;

    public x2(com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var) {
        this.f117522d = z2Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f117522d.f117560g.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.live.viewmodel.n2 holder = (com.tencent.mm.plugin.finder.live.viewmodel.n2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var = this.f117522d;
        java.lang.Object obj = z2Var.f117560g.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.plugin.finder.live.viewmodel.m2 m2Var = (com.tencent.mm.plugin.finder.live.viewmodel.m2) obj;
        holder.f117269f.setText(m2Var.f117236b);
        holder.f117270g.setText(m2Var.f117237c);
        android.view.View view = holder.f117271h;
        int i18 = m2Var.f117238d ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f117268e.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.u2(m2Var, z2Var, this));
        com.tencent.mm.plugin.finder.live.viewmodel.l2 l2Var = m2Var.f117239e;
        if (l2Var != null) {
            holder.f117273m.setText(l2Var.f117212b);
            holder.f117274n.setText(l2Var.f117213c);
            boolean z17 = l2Var.f117214d;
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = holder.f117275o;
            mMSwitchBtn.setCheck(z17);
            mMSwitchBtn.setSwitchListener(new com.tencent.mm.plugin.finder.live.viewmodel.w2(z2Var, l2Var, this));
            if (m2Var.f117238d) {
                android.view.View view2 = holder.f117272i;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view3 = holder.f117272i;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.view.View view4 = holder.f117272i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f117522d.getContext()).inflate(com.tencent.mm.R.layout.e9j, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.live.viewmodel.n2(inflate);
    }
}
