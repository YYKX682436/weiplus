package sr2;

/* loaded from: classes10.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o1 f411584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(sr2.o1 o1Var) {
        super(0);
        this.f411584d = o1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sr2.o1 o1Var = this.f411584d;
        yz5.a aVar = o1Var.f411657h;
        if (aVar != null) {
            aVar.invoke();
        }
        android.view.View view = o1Var.f411653d;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487426vi4) : null;
        if (textView != null) {
            textView.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
