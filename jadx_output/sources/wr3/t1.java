package wr3;

/* loaded from: classes8.dex */
public final class t1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f448893d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f448894e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.an6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f448893d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.bdv);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f448894e = findViewById2;
    }
}
