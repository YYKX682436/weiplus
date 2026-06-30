package on2;

/* loaded from: classes3.dex */
public final class y2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f347076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f347077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(r45.cz1 cz1Var, on2.z2 z2Var) {
        super(0);
        this.f347076d = cz1Var;
        this.f347077e = z2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String string;
        java.lang.Object obj;
        r45.cz1 cz1Var;
        on2.z2 z2Var = this.f347077e;
        r45.cz1 cz1Var2 = this.f347076d;
        if (cz1Var2 != null && (string = cz1Var2.getString(0)) != null) {
            java.util.Iterator it = z2Var.f347091i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.cz1 cz1Var3 = ((km2.z) next).f309232d;
                if (kotlin.jvm.internal.o.b(cz1Var3 != null ? cz1Var3.getString(0) : null, string)) {
                    obj = next;
                    break;
                }
            }
            km2.z zVar = (km2.z) obj;
            if (zVar != null && ((cz1Var = zVar.f309232d) == null || z2Var.U6(cz1Var2, cz1Var))) {
                zVar.f309232d = cz1Var2;
            }
        }
        z2Var.Z6("update", false);
        return jz5.f0.f302826a;
    }
}
