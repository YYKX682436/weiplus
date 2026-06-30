package j0;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final j0.b0 f296216d = new j0.b0();

    public b0() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        yz5.p innerTextField = (yz5.p) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(innerTextField, "innerTextField");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e(innerTextField) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        innerTextField.invoke(oVar, java.lang.Integer.valueOf(intValue & 14));
        return jz5.f0.f302826a;
    }
}
