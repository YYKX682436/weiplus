package uw0;

/* loaded from: classes5.dex */
public final class w0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.u0 f431620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.e1 f431621e;

    public w0(uw0.u0 u0Var, uw0.e1 e1Var) {
        this.f431620d = u0Var;
        this.f431621e = e1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        sw0.b bVar;
        sw0.e eVar = (sw0.e) obj;
        kotlin.jvm.internal.o.d(eVar);
        this.f431620d.setColorStyleState$plugin_mj_template_release(eVar);
        sw0.m mVar = eVar.f413428c;
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l ? true : mVar instanceof sw0.i) {
            uw0.e1 e1Var = this.f431621e;
            e1Var.getClass();
            sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f413426a, eVar.f413427b.f413435b);
            sw0.b bVar2 = null;
            if (zu0.i.f475676f == (dVar != null ? dVar.f413423b : null)) {
                java.lang.String str = dVar.f413422a.f48224b;
                sw0.b bVar3 = e1Var.f349118q;
                if (bVar3 != null) {
                    kotlin.jvm.internal.o.d(str);
                    bVar = sw0.b.a(bVar3, null, null, str, null, null, 27, null);
                } else {
                    bVar = null;
                }
                e1Var.f349118q = bVar;
                sw0.b bVar4 = e1Var.f431548t;
                if (bVar4 != null) {
                    kotlin.jvm.internal.o.d(str);
                    bVar2 = sw0.b.a(bVar4, null, null, str, null, null, 27, null);
                }
                e1Var.f431548t = bVar2;
                uw0.u0 u0Var = (uw0.u0) e1Var.f69240i;
                if (u0Var != null && u0Var.isShown()) {
                    e1Var.J7();
                } else {
                    e1Var.f431554z = true;
                }
            }
        }
    }
}
