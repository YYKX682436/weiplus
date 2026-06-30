package ft4;

/* loaded from: classes14.dex */
public final class o extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f266663d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f266664e;

    /* renamed from: f, reason: collision with root package name */
    public ft4.l f266665f;

    public o(android.content.Context context, java.util.List data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        this.f266663d = data;
        this.f266664e = "";
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f266663d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (getItemCount() <= i17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerDayCellAdapter", "itemCount:" + getItemCount() + " is small than " + i17);
            return;
        }
        dt4.u uVar = (dt4.u) this.f266663d.get(i17);
        if (holder instanceof ft4.m) {
            ft4.m mVar = (ft4.m) holder;
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(mVar.f266648f, uVar.f243293b, 0.1f);
            mVar.f266649g.setText(com.tencent.mm.wallet_core.ui.r1.A(uVar.f243293b, this.f266664e));
            mVar.f266650h.setText(com.tencent.mm.wallet_core.ui.r1.C(uVar.f243294c));
            if (i17 == r3.size() - 1) {
                android.view.View view = mVar.f266651i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerDayCellAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerDayCellAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = mVar.f266651i;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerDayCellAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerDayCellAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mVar.f266646d.setOnClickListener(new ft4.n(this, holder, i17));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ddy, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new ft4.m(inflate);
    }
}
