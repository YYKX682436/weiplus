package ee5;

/* loaded from: classes9.dex */
public final class r3 extends zd5.k {

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f252036m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f252037n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f252038o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.gfu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f252036m = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.gfq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f252037n = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.gg_);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f252038o = textView;
        textView.setVisibility(0);
    }
}
