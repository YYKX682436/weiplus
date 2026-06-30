package sv0;

/* loaded from: classes5.dex */
public final class f extends gv0.b {

    /* renamed from: h, reason: collision with root package name */
    public sv0.g f413222h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yz5.p onItemClickListener) {
        super(null, onItemClickListener, 0L, 5, null);
        kotlin.jvm.internal.o.g(onItemClickListener, "onItemClickListener");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.dfu, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        sv0.g gVar = this.f413222h;
        if (gVar != null) {
            return new sv0.e(this, inflate, gVar);
        }
        kotlin.jvm.internal.o.o("getCoverThumbnailCallback");
        throw null;
    }
}
