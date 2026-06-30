package ft4;

/* loaded from: classes3.dex */
public final class m0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f266652d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f266653e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f266652d = root;
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.py7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f266653e = (android.widget.TextView) findViewById;
    }
}
