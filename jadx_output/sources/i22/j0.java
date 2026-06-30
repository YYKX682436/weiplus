package i22;

/* loaded from: classes15.dex */
public final class j0 extends i22.m {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f287986f;

    /* renamed from: g, reason: collision with root package name */
    public final i22.w f287987g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f287988h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f287989i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView f287990m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.recyclerview.widget.GridLayoutManager f287991n;

    /* renamed from: o, reason: collision with root package name */
    public final i22.g0 f287992o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f287993p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f287994q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.content.Context context, android.view.View itemView, i22.p0 p0Var, i22.w itemSizeResolver) {
        super(itemView, p0Var);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(itemSizeResolver, "itemSizeResolver");
        this.f287986f = context;
        this.f287987g = itemSizeResolver;
        this.f287988h = "MicroMsg.EmojiStoreV3SingleProductAlbumHolder";
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.mzf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f287989i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.mzd);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.mze);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f287990m = (com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView) findViewById3;
        this.f287991n = new androidx.recyclerview.widget.GridLayoutManager(context, itemSizeResolver.f288060b);
        this.f287992o = new i22.g0(context, new java.util.ArrayList());
        this.f287993p = true;
        int d17 = i65.a.d(context, com.tencent.mm.R.color.BW_100);
        int d18 = i65.a.d(context, com.tencent.mm.R.color.BW_0_Alpha_0_0_5);
        float a17 = ym5.x.a(context, 8.0f);
        this.f287994q = n22.f.f334290a.b(d17, d18, a17, a17, a17, a17);
    }

    @Override // i22.m
    public void i(i22.n0 item, java.util.List payloads) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        super.i(item, payloads);
        this.itemView.setBackground(this.f287994q);
        i22.a1 a1Var = item instanceof i22.a1 ? (i22.a1) item : null;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.util.List list = a1Var != null ? a1Var.f287925a : null;
        h0Var.f310123d = list;
        if (list == null || list.isEmpty() || a1Var == null) {
            return;
        }
        r45.kj0 kj0Var = a1Var.f287926b;
        java.lang.String str = kj0Var != null ? kj0Var.f378727e : null;
        android.widget.TextView textView = this.f287989i;
        textView.setText(str);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        i22.g0 g0Var = this.f287992o;
        g0Var.f287967e.clear();
        boolean z17 = this.f287993p;
        i22.w wVar = this.f287987g;
        if (z17) {
            this.f287993p = false;
            android.content.res.Resources resources = this.f287986f.getResources();
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView = this.f287990m;
            emojiStoreV3SingleProductRecyclerView.setSizeResolver(wVar);
            emojiStoreV3SingleProductRecyclerView.N(new g22.f((int) resources.getDimension(com.tencent.mm.R.dimen.f479688cn), 0, 0, wVar));
            emojiStoreV3SingleProductRecyclerView.setAdapter(g0Var);
            g0Var.f287969g = this.f288002d;
            emojiStoreV3SingleProductRecyclerView.setLayoutManager(this.f287991n);
            emojiStoreV3SingleProductRecyclerView.setOnSizeChangedCallback(new i22.i0(h0Var, item, this));
        }
        g0Var.f287967e.addAll((java.util.Collection) h0Var.f310123d);
        g0Var.notifyItemRangeChanged(0, ((java.util.List) h0Var.f310123d).size());
        ((i22.a1) item).f287927c = wVar.f288060b;
    }
}
