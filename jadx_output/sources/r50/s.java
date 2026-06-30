package r50;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f392611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r50.j0 j0Var) {
        super(0);
        this.f392611d = j0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r50.j0 j0Var = this.f392611d;
        android.app.Activity context = j0Var.getContext();
        com.tencent.mm.ui.widget.MMEditText e17 = j0Var.W6().e();
        kotlin.jvm.internal.o.f(e17, "getEtCustomText(...)");
        em.b W6 = j0Var.W6();
        if (W6.f254084g == null) {
            W6.f254084g = (android.widget.LinearLayout) W6.f254078a.findViewById(com.tencent.mm.R.id.d6f);
        }
        android.widget.LinearLayout linearLayout = W6.f254084g;
        kotlin.jvm.internal.o.f(linearLayout, "getEditLayout(...)");
        return new gl5.d1(context, e17, linearLayout, j0Var.W6().f(), j0Var.V6());
    }
}
