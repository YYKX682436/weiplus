package iw0;

/* loaded from: classes5.dex */
public final class c extends gv0.b {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f295187h;

    /* renamed from: i, reason: collision with root package name */
    public final yo0.i f295188i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, yz5.p onItemClickListener) {
        super(null, onItemClickListener, 0L, 5, null);
        kotlin.jvm.internal.o.g(onItemClickListener, "onItemClickListener");
        this.f295187h = z17;
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        this.f295188i = fVar.a();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.dg6, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new iw0.b(this, inflate);
    }
}
