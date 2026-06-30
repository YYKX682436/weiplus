package ft4;

/* loaded from: classes14.dex */
public final class o0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f266666d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f266667e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f266668f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f266669g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f266670h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f266666d = root;
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.pyg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f266667e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = this.itemView.findViewById(com.tencent.mm.R.id.pyh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f266668f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = this.itemView.findViewById(com.tencent.mm.R.id.pye);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f266669g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = this.itemView.findViewById(com.tencent.mm.R.id.pyf);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f266670h = findViewById4;
    }
}
