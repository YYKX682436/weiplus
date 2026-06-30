package ee5;

/* loaded from: classes9.dex */
public final class v2 extends zd5.k {

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f252073m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f252074n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.gfu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f252073m = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.gfq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f252074n = (android.widget.TextView) findViewById2;
    }
}
