package mx0;

/* loaded from: classes5.dex */
public final class ba extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f331859d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f331860e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f331861f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ProgressBar f331862g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f331863h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f331859d = "kEmptyTemplateId";
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f487256o14);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f331860e = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.o1a);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f331861f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.d3u);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f331862g = (android.widget.ProgressBar) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.q4i);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f331863h = findViewById4;
    }
}
