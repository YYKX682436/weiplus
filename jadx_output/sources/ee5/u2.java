package ee5;

/* loaded from: classes9.dex */
public final class u2 extends zd5.k {

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f252068m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f252069n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.gfu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f252068m = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.gg_);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f252069n = textView;
        textView.setVisibility(0);
    }
}
