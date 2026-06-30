package w82;

/* loaded from: classes8.dex */
public final class d extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f443833d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f443834e;

    /* renamed from: f, reason: collision with root package name */
    public int f443835f;

    public d(java.util.List options, yz5.l onItemClick) {
        kotlin.jvm.internal.o.g(options, "options");
        kotlin.jvm.internal.o.g(onItemClick, "onItemClick");
        this.f443833d = options;
        this.f443834e = onItemClick;
        this.f443835f = -1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f443833d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        w82.b holder = (w82.b) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        w82.l option = (w82.l) this.f443833d.get(i17);
        boolean z17 = i17 == this.f443835f;
        boolean z18 = i17 == getItemCount() - 1;
        kotlin.jvm.internal.o.g(option, "option");
        android.widget.TextView textView = holder.f443813d;
        textView.setText(option.f443908b);
        holder.f443814e.setVisibility(z17 ? 0 : 8);
        android.view.View view = holder.f443815f;
        int i18 = z18 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavCleanOptionAdapter$OptionViewHolder", "bind", "(Lcom/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$FavCleanOptionItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavCleanOptionAdapter$OptionViewHolder", "bind", "(Lcom/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$FavCleanOptionItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z17) {
            com.tencent.mm.ui.fk.a(textView);
        } else {
            com.tencent.mm.ui.fk.c(textView);
        }
        holder.itemView.setOnClickListener(new w82.c(this, i17, option));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488754e51, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new w82.b(inflate);
    }

    public final void x(int i17) {
        int i18 = this.f443835f;
        java.util.List list = this.f443833d;
        if (i18 != i17) {
            this.f443835f = i17;
            if (i18 != -1) {
                notifyItemChanged(i18);
            }
            int i19 = this.f443835f;
            if (i19 != -1 && i19 < list.size()) {
                notifyItemChanged(this.f443835f);
            }
        }
        this.f443834e.invoke((w82.l) list.get(i17));
    }
}
