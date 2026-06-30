package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class z extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.b0 f124866d;

    public z(com.tencent.mm.plugin.finder.profile.b0 b0Var) {
        this.f124866d = b0Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f124866d.f123317h.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        jz5.f0 f0Var;
        r45.l95 l95Var;
        r45.e95 e95Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder instanceof com.tencent.mm.plugin.finder.profile.x) {
            com.tencent.mm.plugin.finder.profile.b0 b0Var = this.f124866d;
            java.lang.Object obj = b0Var.f123317h.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            r45.ro2 ro2Var = (r45.ro2) obj;
            r45.v96 v96Var = (r45.v96) ro2Var.getCustom(0);
            if (v96Var == null || (l95Var = v96Var.f388009d) == null || (e95Var = l95Var.f379241d) == null) {
                f0Var = null;
            } else {
                java.lang.String string = ro2Var.getString(1);
                if (string == null || string.length() == 0) {
                    ((com.tencent.mm.plugin.finder.profile.x) holder).f124860d.setText(e95Var.f373165e);
                } else {
                    com.tencent.mm.plugin.finder.profile.x xVar = (com.tencent.mm.plugin.finder.profile.x) holder;
                    com.tencent.mm.plugin.finder.search.l4 l4Var = com.tencent.mm.plugin.finder.search.l4.f125761a;
                    java.lang.String string2 = ro2Var.getString(1);
                    if (string2 == null) {
                        string2 = e95Var.f373165e;
                    }
                    kotlin.jvm.internal.o.d(string2);
                    xVar.f124860d.setText(l4Var.c(string2, ""));
                }
                java.lang.String string3 = ro2Var.getString(2);
                if (string3 == null || string3.length() == 0) {
                    ((com.tencent.mm.plugin.finder.profile.x) holder).f124863g.setText(e95Var.f373175r);
                } else {
                    com.tencent.mm.plugin.finder.profile.x xVar2 = (com.tencent.mm.plugin.finder.profile.x) holder;
                    com.tencent.mm.plugin.finder.search.l4 l4Var2 = com.tencent.mm.plugin.finder.search.l4.f125761a;
                    java.lang.String string4 = ro2Var.getString(1);
                    if (string4 == null) {
                        string4 = e95Var.f373175r;
                    }
                    kotlin.jvm.internal.o.d(string4);
                    xVar2.f124863g.setText(l4Var2.c(string4, ""));
                }
                com.tencent.mm.plugin.finder.profile.x xVar3 = (com.tencent.mm.plugin.finder.profile.x) holder;
                xVar3.f124861e.setText(e95Var.f373179v);
                android.view.View view = xVar3.f124862f;
                int i18 = (com.tencent.mm.sdk.platformtools.t8.K0(e95Var.f373179v) || com.tencent.mm.sdk.platformtools.t8.K0(xVar3.f124863g.getText().toString())) ? 8 : 0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.profile.y(b0Var, e95Var));
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mm.plugin.finder.profile.x xVar4 = (com.tencent.mm.plugin.finder.profile.x) holder;
                xVar4.f124860d.setVisibility(8);
                xVar4.f124861e.setVisibility(8);
                xVar4.f124863g.setVisibility(8);
                android.view.View view2 = xVar4.f124862f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f124866d.f123313d).inflate(com.tencent.mm.R.layout.b6q, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.profile.x(inflate);
    }
}
