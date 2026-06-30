package tj4;

/* loaded from: classes11.dex */
public final class e extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f419827d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f419828e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f419829f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f419830g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f419831h;

    public e(java.util.ArrayList itemList) {
        kotlin.jvm.internal.o.g(itemList, "itemList");
        this.f419827d = itemList;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f419827d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return i17 == 0 ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("MicroMsg.TopicSelfStatusAdapter", "onBindViewHolder " + i17);
        if (holder instanceof tj4.c) {
            java.lang.Object obj = this.f419827d.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            tj4.a aVar = (tj4.a) obj;
            tj4.c cVar = (tj4.c) holder;
            cVar.f419822e.setText(aVar.f419813a);
            cVar.f419823f.b(aVar.f419815c, aVar.f419816d);
        }
        holder.itemView.setOnClickListener(new tj4.d(i17, this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mars.xlog.Log.i("MicroMsg.TopicSelfStatusAdapter", "onCreateViewHolder >> " + i17);
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dhd, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new tj4.b(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dhe, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new tj4.c(inflate2);
    }
}
