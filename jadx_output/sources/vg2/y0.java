package vg2;

/* loaded from: classes3.dex */
public final class y0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f436620d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f436621e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(vg2.b1 b1Var, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.c5z);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f436620d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f483831c60);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f436621e = findViewById2;
    }
}
