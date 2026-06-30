package zv0;

/* loaded from: classes5.dex */
public final class q extends gv0.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(yz5.p onItemClickListener) {
        super(null, onItemClickListener, 0L, 5, null);
        kotlin.jvm.internal.o.g(onItemClickListener, "onItemClickListener");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.dlx, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new zv0.p(this, inflate);
    }

    public final void z(int i17, zu0.i loadedState) {
        kotlin.jvm.internal.o.g(loadedState, "loadedState");
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f275970d;
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            arrayList.set(i17, zv0.r.a((zv0.r) obj, null, loadedState, false, 5, null));
            notifyItemChanged(i17);
        }
    }
}
