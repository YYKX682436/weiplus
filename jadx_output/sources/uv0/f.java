package uv0;

/* loaded from: classes5.dex */
public final class f extends gv0.b {

    /* renamed from: h, reason: collision with root package name */
    public final yo0.i f431328h;

    /* renamed from: i, reason: collision with root package name */
    public vv0.k f431329i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yz5.p onItemClickListener) {
        super(null, onItemClickListener, 0L, 5, null);
        kotlin.jvm.internal.o.g(onItemClickListener, "onItemClickListener");
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        this.f431328h = fVar.a();
        vv0.k kVar = vv0.k.f440383f;
        this.f431329i = vv0.k.f440383f;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.lang.Object a07 = kz5.n0.a0(this.f275970d, i17);
        vv0.k kVar = vv0.k.f440383f;
        if (kotlin.jvm.internal.o.b(a07, vv0.k.f440384g)) {
            uv0.d dVar = uv0.e.f431324e;
            return 0;
        }
        uv0.d dVar2 = uv0.e.f431324e;
        return 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        uv0.e eVar;
        kotlin.jvm.internal.o.g(parent, "parent");
        uv0.e.f431324e.getClass();
        uv0.e[] values = uv0.e.values();
        int length = values.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                eVar = null;
                break;
            }
            eVar = values[i18];
            if (eVar.f431327d == i17) {
                break;
            }
            i18++;
        }
        if (eVar == null) {
            eVar = uv0.e.f431325f;
        }
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.dfj, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new uv0.c(this, inflate);
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new uv0.b(this, new com.tencent.mm.mj_publisher.finder.movie_composing.widgets.FilterDividerView(context, null, 0, 6, null));
    }

    public final void z(vv0.k value) {
        kotlin.jvm.internal.o.g(value, "value");
        vv0.k kVar = vv0.k.f440383f;
        if (kotlin.jvm.internal.o.b(value, vv0.k.f440384g) || kotlin.jvm.internal.o.b(this.f431329i, value)) {
            return;
        }
        vv0.k kVar2 = this.f431329i;
        java.util.ArrayList arrayList = this.f275970d;
        int indexOf = arrayList.indexOf(kVar2);
        int indexOf2 = arrayList.indexOf(value);
        this.f431329i = value;
        notifyItemChanged(0);
        notifyItemChanged(indexOf);
        notifyItemChanged(indexOf2);
    }
}
