package yi2;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f462510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dm1 f462511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(yi2.i0 i0Var, r45.dm1 dm1Var) {
        super(0);
        this.f462510d = i0Var;
        this.f462511e = dm1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yi2.i0 i0Var = this.f462510d;
        ((java.util.LinkedHashMap) i0Var.D).clear();
        java.util.Iterator it = this.f462511e.getList(2).iterator();
        while (it.hasNext()) {
            r45.em1 em1Var = (r45.em1) it.next();
            java.lang.String string = em1Var.getString(1);
            r45.xn1 xn1Var = (r45.xn1) em1Var.getCustom(3);
            r45.bh1 bh1Var = xn1Var != null ? (r45.bh1) xn1Var.getCustom(17) : null;
            if (!(string == null)) {
                if (!(bh1Var == null)) {
                    i0Var.D.put(string, bh1Var);
                }
            }
        }
        i0Var.l();
        return jz5.f0.f302826a;
    }
}
