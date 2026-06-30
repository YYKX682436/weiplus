package vg2;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f436497a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f436498b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f436499c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f436500d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f436501e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f436502f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f436503g;

    public e0(android.content.Context context, android.view.ViewGroup parentRoot) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parentRoot, "parentRoot");
        this.f436497a = context;
        this.f436498b = parentRoot;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e_o, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f436499c = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.che);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f436500d = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.a4f);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f436501e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.u77);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f436502f = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.vii);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f436503g = (android.widget.TextView) findViewById4;
    }
}
