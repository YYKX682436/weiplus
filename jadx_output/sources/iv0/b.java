package iv0;

/* loaded from: classes5.dex */
public final class b extends gv0.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.p onItemClickListener) {
        super(null, onItemClickListener, 0L, 5, null);
        kotlin.jvm.internal.o.g(onItemClickListener, "onItemClickListener");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.dv9, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new iv0.a(this, inflate);
    }
}
