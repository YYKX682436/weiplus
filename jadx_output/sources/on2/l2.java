package on2;

/* loaded from: classes3.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f346965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(on2.z2 z2Var) {
        super(0);
        this.f346965d = z2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        on2.z2 z2Var = this.f346965d;
        km2.z zVar = (km2.z) kz5.n0.Z(z2Var.f347091i);
        r45.cz1 cz1Var = zVar != null ? zVar.f309232d : null;
        if (cz1Var != null) {
            cz1Var.set(8, 4);
        }
        z2Var.Z6("cancel", false);
        return jz5.f0.f302826a;
    }
}
