package yh4;

/* loaded from: classes8.dex */
public final class c extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f462412d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f462413e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f462414f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.p1k);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f462412d = findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.b2w);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f462413e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.k3s);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f462414f = (android.widget.TextView) findViewById3;
    }
}
