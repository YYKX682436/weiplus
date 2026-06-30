package eb5;

/* loaded from: classes5.dex */
public abstract class d extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f250921d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public eb5.c f250922e = null;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f250923f;

    public abstract android.view.View B(android.view.ViewGroup viewGroup, int i17);

    public void E(java.util.List list) {
        if (list != null) {
            this.f250921d = list;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f250921d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f250923f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        eb5.e eVar = new eb5.e(B(viewGroup, i17));
        eVar.f293126m = this.f250923f;
        return eVar;
    }

    public java.lang.Object x(int i17) {
        return this.f250921d.get(i17);
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(eb5.e eVar, int i17) {
        eVar.itemView.setOnClickListener(new eb5.a(this, eVar));
        eVar.itemView.setOnLongClickListener(new eb5.b(this, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(eb5.e eVar, int i17, java.util.List list) {
        super.onBindViewHolder(eVar, i17, list);
        eVar.f293126m = this.f250923f;
    }
}
