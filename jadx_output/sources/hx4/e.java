package hx4;

/* loaded from: classes8.dex */
public final class e implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hx4.p f285666d;

    public e(hx4.p pVar) {
        this.f285666d = pVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        hx4.p pVar = this.f285666d;
        pVar.getClass();
        ku5.u0 u0Var = ku5.t0.f312615d;
        hx4.o oVar = new hx4.o(pVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(oVar, 100L, false);
        hx4.s.b(pVar.f285683b, 3, pVar.f285685d);
    }
}
