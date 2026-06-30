package ee5;

/* loaded from: classes9.dex */
public final class b extends zd5.k {

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f251821m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f251822n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f251823o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f251824p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.progress.RoundProgressBtn f251825q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f251826r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.gfu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f251821m = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.gfq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f251822n = (android.widget.TextView) findViewById2;
        this.f251823o = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.tz9);
        this.f251824p = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.tyz);
        this.f251825q = (com.tencent.mm.ui.widget.progress.RoundProgressBtn) itemView.findViewById(com.tencent.mm.R.id.tyq);
        this.f251826r = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView.findViewById(com.tencent.mm.R.id.tyw);
    }
}
