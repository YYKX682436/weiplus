package tt2;

/* loaded from: classes3.dex */
public final class h1 extends in5.s0 {

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f421927n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f421928o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f421929p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f421930q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f421931r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f421932s;

    /* renamed from: t, reason: collision with root package name */
    public final tt2.k1 f421933t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(tt2.i1 i1Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f421927n = itemView;
        this.f421928o = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.uow);
        this.f421929p = itemView.findViewById(com.tencent.mm.R.id.uou);
        this.f421930q = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.vgj);
        androidx.recyclerview.widget.y1 y1Var = new androidx.recyclerview.widget.y1();
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) itemView.findViewById(com.tencent.mm.R.id.uor);
        recyclerView.setNestedScrollingEnabled(false);
        y1Var.b(recyclerView);
        this.f421931r = recyclerView;
        this.f421932s = new androidx.recyclerview.widget.LinearLayoutManager(itemView.getContext(), 0, false);
        this.f421933t = new tt2.k1();
    }
}
