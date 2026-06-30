package m22;

/* loaded from: classes12.dex */
public final class o extends m22.g {

    /* renamed from: e, reason: collision with root package name */
    public final m22.y f323059e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f323060f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f323061g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.view.ViewGroup parent, m22.y clickListener) {
        super(parent, com.tencent.mm.R.layout.a6s);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(clickListener, "clickListener");
        this.f323059e = clickListener;
        this.f323060f = (android.widget.ImageView) this.itemView.findViewById(com.tencent.mm.R.id.f484197dc3);
        this.f323061g = (android.widget.TextView) this.itemView.findViewById(com.tencent.mm.R.id.f484198dc4);
        com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) this.itemView.findViewById(com.tencent.mm.R.id.f484196dc2);
        this.itemView.setOnClickListener(new m22.m(this));
        weButton.setOnClickListener(new m22.n(this));
    }

    @Override // m22.g
    public void i(m22.i item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f323046d = item;
        m22.p pVar = (m22.p) item;
        boolean b17 = n22.l.b(item.b());
        android.widget.ImageView imageView = this.f323060f;
        if (b17) {
            imageView.setImageResource(com.tencent.mm.R.drawable.icon_002_cover);
        } else {
            vo0.e eVar = vo0.e.f438467a;
            wo0.c a17 = vo0.e.f438468b.a(pVar.a());
            yo0.f fVar = new yo0.f();
            fVar.f464078b = true;
            a17.f447872c = fVar.a();
            kotlin.jvm.internal.o.d(imageView);
            ((wo0.b) a17).c(imageView);
        }
        this.f323061g.setText(pVar.c());
    }
}
