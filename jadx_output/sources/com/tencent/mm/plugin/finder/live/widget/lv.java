package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class lv extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.sv f118978d;

    public lv(com.tencent.mm.plugin.finder.live.widget.sv svVar) {
        this.f118978d = svVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f118978d.f119844e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        r45.h84 h84Var;
        com.tencent.mm.plugin.finder.live.widget.pv holder = (com.tencent.mm.plugin.finder.live.widget.pv) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlinx.coroutines.r2 r2Var = holder.f119453o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        holder.f119445d.setVisibility(8);
        holder.f119446e.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = holder.f119451m.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMargins(com.tencent.mm.ui.zk.a(holder.itemView.getContext(), i17 == 0 ? 32 : 16), 0, 0, 0);
        }
        com.tencent.mm.plugin.finder.live.widget.sv svVar = this.f118978d;
        java.lang.Object obj = svVar.f119844e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.h84 h84Var2 = (r45.h84) obj;
        com.tencent.mm.plugin.finder.live.widget.qv qvVar = svVar.f119845f;
        boolean b17 = kotlin.jvm.internal.o.b((qvVar == null || (h84Var = qvVar.f119555a) == null) ? null : h84Var.getString(0), ((r45.h84) svVar.f119844e.get(i17)).getString(0));
        android.view.View view = holder.f119450i;
        int i18 = b17 ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveScreenEffectWidget$ElementAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveScreenEffectWidget$ElementViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveScreenEffectWidget$ElementAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveScreenEffectWidget$ElementViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (b17) {
            svVar.f119846g = holder;
        }
        boolean b18 = kotlin.jvm.internal.o.b(h84Var2.getString(0), "-1");
        android.widget.TextView textView = holder.f119448g;
        android.widget.ImageView imageView = holder.f119452n;
        android.widget.TextView textView2 = holder.f119447f;
        if (b18) {
            textView.setVisibility(0);
            textView2.setVisibility(8);
            imageView.setVisibility(8);
        } else {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            textView2.setText(h84Var2.getString(1));
            imageView.setVisibility(0);
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().c(new mn2.q3(h84Var2.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView, g1Var.h(mn2.f1.B));
        }
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.iv(svVar, h84Var2, holder));
        kotlinx.coroutines.y0 y0Var = svVar.f119841b;
        holder.f119453o = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.jv(h84Var2, holder, null), 3, null) : null;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        ym5.a1.h(itemView, new com.tencent.mm.plugin.finder.live.widget.kv(svVar, h84Var2));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.dhf, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.live.widget.pv(this.f118978d, inflate);
    }
}
