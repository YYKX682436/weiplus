package cy5;

/* loaded from: classes13.dex */
public class i extends by5.u0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cy5.j f224880f;

    public i(cy5.j jVar) {
        this.f224880f = jVar;
    }

    @Override // by5.u0
    public java.lang.Object d(java.lang.Object[] objArr) {
        by5.n0 n0Var;
        cy5.j jVar = this.f224880f;
        jVar.f224884d.f458069k = java.lang.System.currentTimeMillis();
        cy5.h hVar = jVar.f224882b;
        if (hVar == null || (n0Var = jVar.f224883c) == null) {
            return -1;
        }
        return java.lang.Integer.valueOf(hVar.s(n0Var));
    }

    @Override // by5.u0
    public void g(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        cy5.j jVar = this.f224880f;
        jVar.f224884d.f458070l = java.lang.System.currentTimeMillis();
        int intValue = num.intValue();
        xx5.n nVar = jVar.f224884d;
        nVar.f458068j = intValue;
        int intValue2 = num.intValue();
        cy5.h hVar = jVar.f224882b;
        cy5.t tVar = jVar.f224881a;
        if (intValue2 == 0) {
            nVar.f458059a = 0;
            xx5.o.b(nVar);
            tVar.l(hVar.m(), 0);
        } else {
            nVar.f458059a = -3;
            xx5.o.b(nVar);
            tVar.l(hVar.m(), -2);
        }
    }
}
