package vi1;

/* loaded from: classes7.dex */
public final class x extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final vi1.y f437489d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f437490e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f437491f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f437492g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(vi1.y adapter, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        this.f437489d = adapter;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.kun);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f437490e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.kuo);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f437491f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.kup);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f437492g = (android.widget.TextView) findViewById3;
    }
}
