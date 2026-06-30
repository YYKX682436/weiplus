package ft4;

/* loaded from: classes14.dex */
public final class w0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f266721d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f266722e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f266723f;

    /* renamed from: g, reason: collision with root package name */
    public final ft4.u f266724g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f266721d = root;
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.pyn);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f266722e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = this.itemView.findViewById(com.tencent.mm.R.id.pyl);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f266723f = (android.widget.LinearLayout) findViewById2;
        android.view.View findViewById3 = this.itemView.findViewById(com.tencent.mm.R.id.q2m);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f266724g = new ft4.u(context, (android.widget.LinearLayout) findViewById3);
    }
}
