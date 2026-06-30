package de2;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f229380a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f229381b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f229382c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f229383d;

    /* renamed from: e, reason: collision with root package name */
    public final wd2.g f229384e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f229385f;

    public h(android.content.Context context, yz5.a block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(block, "block");
        this.f229380a = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488794ag5, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f229381b = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f485838j93);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f229382c = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.cgv);
        android.widget.Button button = (android.widget.Button) findViewById2;
        button.setOnClickListener(new de2.g(button, block, this));
        kotlin.jvm.internal.o.f(findViewById2, "apply(...)");
        this.f229383d = (android.widget.TextView) findViewById2;
        wd2.g gVar = new wd2.g(context, true, zl2.u4.f473988d, false);
        gVar.f444839f.addView(inflate);
        this.f229384e = gVar;
        this.f229385f = "";
    }
}
