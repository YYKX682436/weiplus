package pw0;

/* loaded from: classes5.dex */
public final class o extends gv0.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yz5.p onItemClickListener) {
        super(null, onItemClickListener, 0L, 5, null);
        kotlin.jvm.internal.o.g(onItemClickListener, "onItemClickListener");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.dva, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new pw0.n(this, inflate);
    }

    public final void z(int i17, zu0.i loadedState) {
        kotlin.jvm.internal.o.g(loadedState, "loadedState");
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f275970d;
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            arrayList.set(i17, sw0.d.a((sw0.d) obj, null, loadedState, false, null, 13, null));
            notifyItemChanged(i17);
        }
    }
}
