package nx0;

/* loaded from: classes5.dex */
public final class x2 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f341260d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f341261e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f341262f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ProgressBar f341263g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(nx0.a3 a3Var, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.rwe);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f341260d = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.rw9);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f341261e = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.rwb);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f341262f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.rwa);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f341263g = (android.widget.ProgressBar) findViewById4;
    }
}
