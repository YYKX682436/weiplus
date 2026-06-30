package ww1;

/* loaded from: classes5.dex */
public final class c extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f450155d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f450156e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f450157f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f450158g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f450159h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f450155d = root;
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.guw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f450155d = findViewById;
        android.view.View findViewById2 = this.itemView.findViewById(com.tencent.mm.R.id.f485190gv1);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.f450156e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = this.itemView.findViewById(com.tencent.mm.R.id.guy);
        kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.f450157f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = this.itemView.findViewById(com.tencent.mm.R.id.f485189gv0);
        kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        this.f450158g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = this.itemView.findViewById(com.tencent.mm.R.id.guz);
        kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        this.f450159h = (android.widget.TextView) findViewById5;
    }
}
