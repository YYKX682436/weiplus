package y20;

/* loaded from: classes.dex */
public final class k extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f459009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.u0j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f459009d = (android.widget.TextView) findViewById;
    }
}
