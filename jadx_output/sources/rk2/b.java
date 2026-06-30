package rk2;

/* loaded from: classes3.dex */
public final class b extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f396445d;

    /* renamed from: e, reason: collision with root package name */
    public final tk2.a f396446e;

    public b(java.util.LinkedList dataList, tk2.a service) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(service, "service");
        this.f396445d = dataList;
        this.f396446e = service;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        int i18;
        rk2.a holder = (rk2.a) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.LinkedList linkedList = this.f396445d;
        int size = linkedList.size();
        if (size != 0) {
            i18 = i17 % size;
            if (i18 >= size) {
                i18 = size - 1;
            }
        } else {
            i18 = i17;
        }
        java.lang.Object obj = linkedList.get(i18);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        holder.f396444d.b((uk2.b) obj);
        com.tencent.mars.xlog.Log.i("MultiStreamAdapter", "onBindViewHolder ori: " + i17 + " position: " + (i17 % linkedList.size()));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.avo, parent, false);
        com.tencent.mars.xlog.Log.i("MultiStreamAdapter", "onCreateViewHolder");
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout");
        com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout finderLiveMultiStreamViewLayout = (com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout) inflate;
        tk2.a service = this.f396446e;
        kotlin.jvm.internal.o.g(service, "service");
        finderLiveMultiStreamViewLayout.f111749h = service;
        return new rk2.a(finderLiveMultiStreamViewLayout);
    }

    public final uk2.b x(int i17) {
        java.util.LinkedList linkedList = this.f396445d;
        int size = linkedList.size();
        if (size != 0 && (i17 = i17 % size) >= size) {
            i17 = size - 1;
        }
        return (uk2.b) linkedList.get(i17);
    }
}
