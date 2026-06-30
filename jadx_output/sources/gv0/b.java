package gv0;

/* loaded from: classes5.dex */
public abstract class b extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f275970d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f275971e;

    /* renamed from: f, reason: collision with root package name */
    public final long f275972f;

    /* renamed from: g, reason: collision with root package name */
    public long f275973g;

    public b(java.util.ArrayList dataList, yz5.p onItemClickListener, long j17, int i17, kotlin.jvm.internal.i iVar) {
        dataList = (i17 & 1) != 0 ? new java.util.ArrayList() : dataList;
        j17 = (i17 & 4) != 0 ? 0L : j17;
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(onItemClickListener, "onItemClickListener");
        this.f275970d = dataList;
        this.f275971e = onItemClickListener;
        this.f275972f = j17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f275970d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        gv0.c holder = (gv0.c) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object a07 = kz5.n0.a0(this.f275970d, i17);
        if (a07 == null) {
            return;
        }
        holder.i(a07, i17);
        holder.itemView.setOnClickListener(new gv0.a(holder, this));
    }

    public final void x(int i17, java.lang.Object obj) {
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f275970d;
            if (i17 >= arrayList.size()) {
                return;
            }
            arrayList.set(i17, obj);
            notifyItemChanged(i17);
        }
    }

    public void y(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        java.util.ArrayList arrayList = this.f275970d;
        int size = arrayList.size();
        arrayList.clear();
        if (list.isEmpty()) {
            notifyItemRangeRemoved(0, size);
        }
        arrayList.addAll(list);
        notifyDataSetChanged();
    }
}
