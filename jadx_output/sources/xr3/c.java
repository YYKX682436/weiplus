package xr3;

/* loaded from: classes8.dex */
public final class c extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f456214d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f456215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.ana);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f456214d = findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.ank);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f456215e = (android.widget.TextView) findViewById2;
    }
}
