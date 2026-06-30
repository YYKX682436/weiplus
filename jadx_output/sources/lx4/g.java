package lx4;

/* loaded from: classes8.dex */
public final class g extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f322130d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f322131e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f322132f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.ayx);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f322130d = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.ayw);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f322131e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f483470az1);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f322132f = (android.widget.TextView) findViewById3;
    }
}
