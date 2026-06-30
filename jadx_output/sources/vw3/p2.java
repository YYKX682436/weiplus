package vw3;

/* loaded from: classes5.dex */
public final class p2 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f441064d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f441065e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f441066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(vw3.q2 q2Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.pzr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f441064d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.pzq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f441065e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.pzs);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f441066f = (android.widget.TextView) findViewById3;
    }
}
