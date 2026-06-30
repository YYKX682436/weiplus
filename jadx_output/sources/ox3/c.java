package ox3;

/* loaded from: classes10.dex */
public final class c extends in5.s0 {

    /* renamed from: n, reason: collision with root package name */
    public final cy3.u f349728n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f349729o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f349730p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f349731q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ox3.e eVar, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.m5n);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f349728n = new cy3.u((com.tencent.mm.plugin.gif.MMAnimateView) findViewById);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.dis);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f349729o = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.dir);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f349730p = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.m5h);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f349731q = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
    }
}
