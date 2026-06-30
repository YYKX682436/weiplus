package y20;

/* loaded from: classes.dex */
public final class b extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f458990d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f458991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.kka);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f458990d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.srx);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f458991e = findViewById2;
    }
}
