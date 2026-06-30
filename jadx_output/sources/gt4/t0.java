package gt4;

/* loaded from: classes8.dex */
public final class t0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f275556d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f275557e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f275558f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f275556d = root;
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.q2z);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f275557e = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = this.itemView.findViewById(com.tencent.mm.R.id.f487673q30);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f275558f = (android.widget.TextView) findViewById2;
    }
}
