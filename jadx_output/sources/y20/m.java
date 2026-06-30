package y20;

/* loaded from: classes.dex */
public final class m extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f459012d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f459013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.nu6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f459012d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.vbq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f459013e = (android.widget.TextView) findViewById2;
    }
}
