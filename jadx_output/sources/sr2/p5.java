package sr2;

/* loaded from: classes5.dex */
public final class p5 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f411674d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f411675e;

    public p5(java.util.List dataList, yz5.p onItemClick) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(onItemClick, "onItemClick");
        this.f411674d = dataList;
        this.f411675e = onItemClick;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f411674d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        sr2.q5 holder = (sr2.q5) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        r45.r03 r03Var = (r45.r03) this.f411674d.get(i17);
        java.lang.String str = "#" + r03Var.getString(0);
        android.widget.TextView textView = holder.f411688d;
        if (textView != null) {
            textView.setText(str);
        }
        holder.itemView.setOnClickListener(new sr2.o5(this, r03Var, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.f489071b64, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new sr2.q5(inflate);
    }
}
