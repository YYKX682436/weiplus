package s7;

/* loaded from: classes16.dex */
public abstract class l2 extends s7.u1 {
    @Override // s7.u1, s7.w1
    public void h(s7.a2 a2Var) {
        if (a2Var instanceof s7.k2) {
            this.f403846i.add(a2Var);
            return;
        }
        throw new s7.g3("Text content elements cannot contain " + a2Var + " elements.");
    }
}
