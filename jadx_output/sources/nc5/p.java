package nc5;

/* loaded from: classes.dex */
public final class p extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f336225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.hjj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f336225d = (android.widget.TextView) findViewById;
    }
}
