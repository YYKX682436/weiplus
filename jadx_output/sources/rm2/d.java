package rm2;

/* loaded from: classes3.dex */
public final class d extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f397439d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f397440e;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f397439d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.util.List list;
        rm2.b holder = (rm2.b) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View view = holder.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter$ChargeModeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter$ChargeModeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = true;
        jz5.f0 f0Var = null;
        rm2.a aVar = (!(i17 >= 0 && i17 < getItemCount()) || (list = this.f397439d) == null) ? null : (rm2.a) list.get(i17);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f397435f;
        android.widget.TextView textView = holder.f397433d;
        android.widget.TextView textView2 = holder.f397434e;
        if (aVar != null) {
            textView.setText(aVar.f397429a);
            weImageView.setVisibility(aVar.f397432d ? 0 : 8);
            holder.itemView.setEnabled(true);
            java.lang.String str = aVar.f397430b;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView2.setVisibility(0);
                textView2.setText(str);
            }
            textView.setTextColor(holder.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.f478714f5));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            holder.itemView.setEnabled(false);
            textView.setText("");
            textView2.setText("");
            weImageView.setVisibility(8);
            android.view.View view2 = holder.itemView;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter$ChargeModeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter$ChargeModeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        holder.itemView.setOnClickListener(new rm2.c(this, aVar, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.f488917au0, null);
        kotlin.jvm.internal.o.d(inflate);
        return new rm2.b(inflate);
    }
}
