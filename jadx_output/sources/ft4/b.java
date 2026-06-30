package ft4;

/* loaded from: classes14.dex */
public final class b extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f266581d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f266582e;

    /* renamed from: f, reason: collision with root package name */
    public final ft4.u f266583f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f266581d = root;
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.q2m);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f266582e = findViewById;
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f266583f = new ft4.u(context, findViewById);
    }
}
