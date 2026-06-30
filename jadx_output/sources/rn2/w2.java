package rn2;

/* loaded from: classes3.dex */
public final class w2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f397907d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f397908e;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f397907d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.util.List list;
        rn2.u2 holder = (rn2.u2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View view = holder.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter$LotteryViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter$LotteryViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jz5.f0 f0Var = null;
        rn2.b bVar = (!(i17 >= 0 && i17 < getItemCount()) || (list = this.f397907d) == null) ? null : (rn2.b) list.get(i17);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f397889f;
        android.widget.TextView textView = holder.f397887d;
        android.widget.TextView textView2 = holder.f397888e;
        if (bVar != null) {
            textView.setText(bVar.f397644a);
            weImageView.setVisibility(bVar.f397648e ? 0 : 8);
            if (bVar.f397647d) {
                holder.itemView.setEnabled(true);
                java.lang.String str = bVar.f397645b;
                if (str != null && str.length() != 0) {
                    r3 = false;
                }
                if (r3) {
                    textView2.setVisibility(8);
                    textView2.setText("");
                } else {
                    textView2.setVisibility(0);
                    textView2.setText(str);
                }
                textView.setTextColor(holder.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.f478714f5));
            } else {
                holder.itemView.setEnabled(false);
                textView2.setVisibility(0);
                textView.setTextColor(holder.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
                java.lang.String str2 = bVar.f397651h;
                if (str2.length() == 0) {
                    str2 = holder.itemView.getContext().getResources().getString(com.tencent.mm.R.string.f491623dp3, bVar.f397644a);
                }
                textView2.setText(str2);
            }
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
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter$LotteryViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter$LotteryViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        holder.itemView.setOnClickListener(new rn2.v2(this, bVar, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.f488917au0, null);
        kotlin.jvm.internal.o.d(inflate);
        return new rn2.u2(inflate);
    }
}
