package ee5;

/* loaded from: classes9.dex */
public final class a extends zd5.k {

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f251789m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f251790n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f251791o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.gfu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f251789m = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.gfv);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f251790n = imageView;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.gfq);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f251791o = (android.widget.TextView) findViewById3;
        imageView.setVisibility(8);
    }
}
