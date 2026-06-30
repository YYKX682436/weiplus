package qn2;

/* loaded from: classes3.dex */
public final class s1 implements ek2.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn2.u1 f365150a;

    public s1(qn2.u1 u1Var) {
        this.f365150a = u1Var;
    }

    @Override // ek2.z0
    public void a(int i17, int i18, java.lang.String str, r45.ht1 resp) {
        r45.cz1 cz1Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        qn2.u1 u1Var = this.f365150a;
        if (i17 == 0 && i18 == 0) {
            ((on2.z2) u1Var.f365162a.P0(on2.z2.class)).g7((r45.cz1) resp.getCustom(1));
            ((on2.z2) u1Var.f365162a.P0(on2.z2.class)).X6(resp);
            pm0.v.X(new qn2.q1(u1Var, true));
        } else {
            km2.z zVar = ((on2.z2) u1Var.f365162a.P0(on2.z2.class)).f347092m;
            if (zVar == null || (cz1Var = zVar.f309232d) == null) {
                return;
            }
            pm0.v.X(new qn2.r1(u1Var, cz1Var));
        }
    }
}
