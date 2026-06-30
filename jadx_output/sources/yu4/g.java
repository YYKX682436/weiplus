package yu4;

/* loaded from: classes8.dex */
public final class g implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu4.k f465873d;

    public g(yu4.k kVar) {
        this.f465873d = kVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        xu4.h hVar;
        su4.m1 m1Var;
        xu4.h hVar2;
        su4.m1 m1Var2;
        yu4.k kVar = this.f465873d;
        yu4.n nVar = kVar.f465886n;
        if (nVar != null && (hVar2 = nVar.f465902n) != null && (m1Var2 = hVar2.f457288i) != null) {
            gm0.j1.d().d(m1Var2);
            hVar2.f457288i = null;
        }
        yu4.o oVar = kVar.f465887o;
        if (oVar != null && (hVar = oVar.f465911i) != null && (m1Var = hVar.f457288i) != null) {
            gm0.j1.d().d(m1Var);
            hVar.f457288i = null;
        }
        kVar.f465889q = 0L;
    }
}
