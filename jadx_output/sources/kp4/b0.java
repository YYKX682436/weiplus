package kp4;

/* loaded from: classes5.dex */
public final class b0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f311087d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f311088e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f311089f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f311090g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f311091h;

    /* renamed from: i, reason: collision with root package name */
    public final int f311092i;

    /* renamed from: m, reason: collision with root package name */
    public final int f311093m;

    /* renamed from: n, reason: collision with root package name */
    public final float f311094n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f311087d = view;
        this.f311088e = "MicroMsg.MediaThumb.ViewHolder";
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f487298o73);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f311089f = findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f487295o70);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f311090g = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.f487300o75);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f311091h = findViewById3;
        this.f311092i = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479644bj);
        this.f311093m = i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.Brand_100);
        this.f311094n = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479646bl);
    }
}
