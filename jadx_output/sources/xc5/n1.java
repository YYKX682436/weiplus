package xc5;

/* loaded from: classes3.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.p1 f453541d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(xc5.p1 p1Var) {
        super(0);
        this.f453541d = p1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xc5.p1 p1Var = this.f453541d;
        android.view.View findViewById = p1Var.getActivity().findViewById(com.tencent.mm.R.id.tzq);
        if (findViewById != null) {
            lf3.j jVar = (lf3.j) p1Var.U6(lf3.j.class);
            if (jVar != null) {
                jVar.E2(findViewById);
            }
        } else {
            p1Var.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
