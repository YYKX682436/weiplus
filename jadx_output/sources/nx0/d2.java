package nx0;

/* loaded from: classes5.dex */
public final class d2 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f341092d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f341093e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f341094f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(nx0.g2 g2Var, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.e4x);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f341092d = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.rkp);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f341093e = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.rkq);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f341094f = (android.widget.TextView) findViewById3;
    }
}
