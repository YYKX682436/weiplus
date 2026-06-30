package jn2;

/* loaded from: classes5.dex */
public final class x extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f300744d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.vhk);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f300744d = (android.widget.TextView) findViewById;
    }
}
