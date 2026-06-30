package nx0;

/* loaded from: classes5.dex */
public final class o extends nx0.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f341181d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f341182e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f341183f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f341184g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f341185h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(nx0.u uVar, android.view.View view) {
        super(view, null);
        kotlin.jvm.internal.o.g(view, "view");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f341181d = context;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.rdf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f341182e = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.rdd);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f341183f = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.rde);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f341184g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.rdc);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f341185h = findViewById4;
    }
}
