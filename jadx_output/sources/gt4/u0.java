package gt4;

/* loaded from: classes14.dex */
public final class u0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f275560d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.RelativeLayout f275561e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f275562f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f275563g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f275564h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f275560d = root;
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.q2_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f275561e = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = this.itemView.findViewById(com.tencent.mm.R.id.q2a);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f275562f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = this.itemView.findViewById(com.tencent.mm.R.id.q29);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f275563g = findViewById3;
        android.view.View findViewById4 = this.itemView.findViewById(com.tencent.mm.R.id.q28);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f275564h = (android.widget.TextView) findViewById4;
    }
}
