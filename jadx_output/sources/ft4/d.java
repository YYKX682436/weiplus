package ft4;

/* loaded from: classes3.dex */
public final class d extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f266600d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f266601e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f266600d = root;
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.q2q);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f266601e = (android.widget.LinearLayout) findViewById;
    }
}
