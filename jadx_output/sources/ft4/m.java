package ft4;

/* loaded from: classes14.dex */
public final class m extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f266646d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f266647e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f266648f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f266649g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f266650h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f266651i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f266646d = root;
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.q2l);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f266647e = findViewById;
        android.view.View findViewById2 = this.itemView.findViewById(com.tencent.mm.R.id.pxt);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f266648f = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = this.itemView.findViewById(com.tencent.mm.R.id.pxv);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f266649g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = this.itemView.findViewById(com.tencent.mm.R.id.pxs);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f266650h = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = this.itemView.findViewById(com.tencent.mm.R.id.pxu);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f266651i = findViewById5;
    }
}
