package ft4;

/* loaded from: classes14.dex */
public final class u0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f266711d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f266712e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f266713f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f266714g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f266711d = root;
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.py9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f266712e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = this.itemView.findViewById(com.tencent.mm.R.id.py_);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f266713f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = this.itemView.findViewById(com.tencent.mm.R.id.pyc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f266714g = (android.widget.TextView) findViewById3;
    }
}
