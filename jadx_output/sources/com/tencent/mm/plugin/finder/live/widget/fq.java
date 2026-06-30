package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class fq extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.a63 f118369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.jq f118370e;

    public fq(com.tencent.mm.plugin.finder.live.widget.jq jqVar, r45.a63 categoryInfo) {
        kotlin.jvm.internal.o.g(categoryInfo, "categoryInfo");
        this.f118370e = jqVar;
        this.f118369d = categoryInfo;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f118369d.getList(2).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        mm2.g1 g1Var;
        kotlinx.coroutines.flow.j2 j2Var;
        r45.n73 n73Var;
        r45.z53 z53Var;
        java.lang.String string;
        kotlinx.coroutines.flow.j2 j2Var2;
        com.tencent.mm.plugin.finder.live.widget.cq holder = (com.tencent.mm.plugin.finder.live.widget.cq) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        r45.q12 q12Var = null;
        holder.f293125i = null;
        r45.a63 a63Var = this.f118369d;
        java.util.LinkedList list = a63Var.getList(2);
        kotlin.jvm.internal.o.f(list, "getGame_app_info_list(...)");
        r45.z53 z53Var2 = (r45.z53) kz5.n0.a0(list, i17);
        if (z53Var2 != null) {
            com.tencent.mm.plugin.finder.live.widget.nq nqVar = this.f118370e.f118770h;
            holder.f293125i = z53Var2;
            java.lang.String string2 = z53Var2.getString(1);
            java.lang.String str = "";
            if (string2 == null) {
                string2 = "";
            }
            holder.f118020o.setText(string2);
            i95.m c17 = i95.n0.c(vd2.i5.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            vd2.i5 i5Var = (vd2.i5) c17;
            java.lang.String string3 = z53Var2.getString(2);
            vd2.i5.l8(i5Var, string3 == null ? "" : string3, holder.f118019n, null, 4, null);
            nqVar.getClass();
            zl2.r4 r4Var = zl2.r4.f473950a;
            dk2.ef efVar = dk2.ef.f233372a;
            mm2.g1 g1Var2 = (mm2.g1) efVar.i(mm2.g1.class);
            if (g1Var2 != null && (j2Var2 = g1Var2.f329068f) != null) {
                q12Var = (r45.q12) ((kotlinx.coroutines.flow.h3) j2Var2).getValue();
            }
            if (r4Var.T1(q12Var) && (g1Var = (mm2.g1) efVar.i(mm2.g1.class)) != null && (j2Var = g1Var.f329071i) != null && (n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) != null && (z53Var = (r45.z53) n73Var.getCustom(1)) != null && (string = z53Var.getString(0)) != null) {
                str = string;
            }
            holder.f118021p.setVisibility(kotlin.jvm.internal.o.b(str, z53Var2.getString(0)) ? 0 : 8);
            holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.eq(z53Var2, nqVar));
            android.view.View view = holder.f118022q;
            int i18 = i17 != a63Var.getList(2).size() - 1 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePostGameChoosePanel$CustomFragmentPagerAdapter$RecyclerAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLivePostGameChoosePanel$CustomFragmentPagerAdapter$RecyclerAdapter$ItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostGameChoosePanel$CustomFragmentPagerAdapter$RecyclerAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLivePostGameChoosePanel$CustomFragmentPagerAdapter$RecyclerAdapter$ItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f118370e.f228355d).inflate(com.tencent.mm.R.layout.dkh, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.live.widget.cq(this, inflate);
    }
}
