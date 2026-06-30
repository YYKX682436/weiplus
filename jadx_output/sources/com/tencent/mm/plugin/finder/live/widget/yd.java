package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class yd extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.fe f120439d;

    public yd(com.tencent.mm.plugin.finder.live.widget.fe feVar) {
        this.f120439d = feVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f120439d.f118347e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        r45.h84 h84Var;
        com.tencent.mm.plugin.finder.live.widget.ce holder = (com.tencent.mm.plugin.finder.live.widget.ce) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlinx.coroutines.r2 r2Var = holder.f118001o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        holder.f117993d.setVisibility(8);
        holder.f117994e.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = holder.f117999m.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMargins(com.tencent.mm.ui.zk.a(holder.itemView.getContext(), i17 == 0 ? 32 : 16), 0, 0, 0);
        }
        com.tencent.mm.plugin.finder.live.widget.fe feVar = this.f120439d;
        java.lang.Object obj = feVar.f118347e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.h84 h84Var2 = (r45.h84) obj;
        com.tencent.mm.plugin.finder.live.widget.de deVar = feVar.f118348f;
        boolean b17 = kotlin.jvm.internal.o.b((deVar == null || (h84Var = deVar.f118100a) == null) ? null : h84Var.getString(0), ((r45.h84) feVar.f118347e.get(i17)).getString(0));
        android.view.View view = holder.f117998i;
        int i18 = b17 ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (b17) {
            feVar.f118349g = holder;
        }
        boolean b18 = kotlin.jvm.internal.o.b(h84Var2.getString(0), "-1");
        android.widget.TextView textView = holder.f117996g;
        android.widget.ImageView imageView = holder.f118000n;
        android.widget.TextView textView2 = holder.f117995f;
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
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.vd(feVar, h84Var2, holder));
        kotlinx.coroutines.y0 y0Var = feVar.f118344b;
        holder.f118001o = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.wd(h84Var2, holder, null), 3, null) : null;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        ym5.a1.h(itemView, new com.tencent.mm.plugin.finder.live.widget.xd(feVar, h84Var2));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.aoy, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.live.widget.ce(this.f120439d, inflate);
    }
}
