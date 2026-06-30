package qi2;

/* loaded from: classes10.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.q1 f363563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(qi2.q1 q1Var) {
        super(2);
        this.f363563d = q1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String string = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(string, "string");
        qi2.q1 q1Var = this.f363563d;
        q1Var.F(q1Var.f363614t, false);
        q1Var.f363613s = intValue;
        fg2.d1 d1Var = q1Var.f363607m;
        if (d1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d1Var.f261977i.setText(string);
        q1Var.C();
        return jz5.f0.f302826a;
    }
}
