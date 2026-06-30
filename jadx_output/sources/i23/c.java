package i23;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i23.e f288077d;

    public c(i23.e eVar) {
        this.f288077d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        k23.x0 x0Var = k23.c1.f303536h;
        i23.e eVar = this.f288077d;
        k23.c1 a17 = x0Var.a(eVar.getActivity());
        if (a17.U6()) {
            qv4.j jVar = eVar.f288079d;
            k23.v0 v0Var = a17.f303541g;
            if (v0Var != null) {
                k23.i1 q17 = v0Var.q();
                k23.p2 p2Var = q17 instanceof k23.p2 ? (k23.p2) q17 : null;
                java.lang.Integer valueOf = p2Var != null ? java.lang.Integer.valueOf(p2Var.getSafeAreaHeight()) : null;
                if (valueOf != null) {
                    i17 = valueOf.intValue();
                    jVar.f().f367015i.f312700a = i17;
                    jVar.f().j();
                }
            }
            i17 = 0;
            jVar.f().f367015i.f312700a = i17;
            jVar.f().j();
        }
    }
}
