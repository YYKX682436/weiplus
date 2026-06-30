package zj2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f473287a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.a f473288b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f473289c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f473290d;

    public b(android.view.View root, ak2.a adapter) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f473287a = root;
        this.f473288b = adapter;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f484733fb4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f473289c = viewGroup;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.jk6);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f473290d = (android.widget.TextView) findViewById2;
        viewGroup.setOnClickListener(new zj2.a(this));
    }
}
