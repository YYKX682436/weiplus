package vi1;

/* loaded from: classes7.dex */
public final class j0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final vi1.l0 f437340d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f437341e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f437342f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f437343g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(vi1.l0 adapter, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        this.f437340d = adapter;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.kuo);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f437341e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.kup);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f437342f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.kum);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f437343g = (android.widget.ImageView) findViewById3;
    }
}
