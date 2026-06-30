package nx0;

/* loaded from: classes5.dex */
public final class p extends nx0.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f341192d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f341193e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f341194f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f341195g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ProgressBar f341196h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(nx0.u uVar, android.view.View view) {
        super(view, null);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.f(view.getContext(), "getContext(...)");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.rdl);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f341192d = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.rdb);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f341193e = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.rdh);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f341194f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.shl);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f341195g = findViewById4;
        android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.rdg);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f341196h = (android.widget.ProgressBar) findViewById5;
    }
}
