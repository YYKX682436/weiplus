package vg2;

/* loaded from: classes3.dex */
public final class s1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f436582d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f436583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(vg2.u1 u1Var, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.chz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f436582d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.cgi);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f436583e = (android.widget.TextView) findViewById2;
    }
}
