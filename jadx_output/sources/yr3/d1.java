package yr3;

/* loaded from: classes11.dex */
public final class d1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.m1 f464768d;

    /* renamed from: e, reason: collision with root package name */
    public final int f464769e;

    /* renamed from: f, reason: collision with root package name */
    public final sr3.a f464770f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f464771g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f464772h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f464773i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f464774m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f464775n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f464776o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f464777p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f464778q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f464779r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f464780s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(wr3.m1 adapter, android.view.View itemView, int i17, int i18, sr3.a accountType) {
        super(itemView);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(accountType, "accountType");
        this.f464768d = adapter;
        this.f464769e = i17;
        this.f464770f = accountType;
        this.f464771g = "MsgSinglePicViewHolder";
        this.f464772h = adapter.f448778m;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.cbi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f464773i = findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.cbu);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f464774m = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.cbs);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f464775n = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.cbl);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f464776o = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.f486223uo2);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f464777p = findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.t9p);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f464778q = findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.tencent.mm.R.id.t_n);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f464779r = (android.widget.ImageView) findViewById7;
    }
}
