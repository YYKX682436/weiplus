package nx0;

/* loaded from: classes5.dex */
public final class n1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f341176d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f341177e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f341178f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ProgressBar f341179g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(nx0.q1 q1Var, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.rkc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f341176d = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.rk7);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f341177e = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.rk_);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f341178f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.rk9);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f341179g = (android.widget.ProgressBar) findViewById4;
    }
}
