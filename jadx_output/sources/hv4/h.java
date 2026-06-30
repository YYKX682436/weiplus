package hv4;

/* loaded from: classes8.dex */
public final class h implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hv4.l f285296d;

    public h(hv4.l lVar) {
        this.f285296d = lVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gv4.e eVar;
        su4.m1 m1Var;
        gv4.e eVar2;
        su4.m1 m1Var2;
        hv4.l lVar = this.f285296d;
        hv4.n nVar = lVar.f285313n;
        if (nVar != null && (eVar2 = nVar.f285324m) != null && (m1Var2 = eVar2.f276121m) != null) {
            gm0.j1.d().d(m1Var2);
            eVar2.f276121m = null;
        }
        hv4.o oVar = lVar.f285314o;
        if (oVar == null || (eVar = oVar.f285331i) == null || (m1Var = eVar.f276121m) == null) {
            return;
        }
        gm0.j1.d().d(m1Var);
        eVar.f276121m = null;
    }
}
