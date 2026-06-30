package sm3;

/* loaded from: classes5.dex */
public final class i0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f409876d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f409877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.o7i);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f409876d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.d2f);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f409877e = findViewById2;
    }
}
