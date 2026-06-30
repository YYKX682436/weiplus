package d04;

/* loaded from: classes8.dex */
public final class c2 extends in5.s0 {

    /* renamed from: n, reason: collision with root package name */
    public final android.view.ViewGroup f225393n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f225394o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ProgressBar f225395p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f225396q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.m_q);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f225393n = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.m_p);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f225394o = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.v0k);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f225395p = (android.widget.ProgressBar) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.meb);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f225396q = findViewById4;
    }
}
