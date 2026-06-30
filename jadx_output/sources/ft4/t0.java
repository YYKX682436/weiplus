package ft4;

/* loaded from: classes3.dex */
public final class t0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f266695d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f266696e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f266695d = root;
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.py7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f266696e = (android.widget.TextView) findViewById;
    }
}
