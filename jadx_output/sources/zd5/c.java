package zd5;

/* loaded from: classes.dex */
public final class c extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f471670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f471670d = (android.widget.TextView) findViewById;
    }
}
