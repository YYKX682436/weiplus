package lr;

/* loaded from: classes13.dex */
public final class e0 extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f320511f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.dci);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.dch);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f320511f = findViewById2;
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        super.i(item);
        android.support.v4.media.f.a(this.f320581e);
    }
}
