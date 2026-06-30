package ee5;

/* loaded from: classes9.dex */
public final class o2 extends zd5.k {

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f251989m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f251990n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.gfu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f251989m = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.gg_);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f251990n = textView;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.gfv);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById3;
        imageView.setImageResource(com.tencent.mm.R.drawable.as8);
        imageView.setVisibility(0);
        textView.setVisibility(0);
    }
}
