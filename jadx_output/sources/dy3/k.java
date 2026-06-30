package dy3;

/* loaded from: classes.dex */
public final class k implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy3.n f244583d;

    public k(dy3.n nVar) {
        this.f244583d = nVar;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        dy3.p data = (dy3.p) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String str = "";
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0("");
        com.tencent.mm.storage.z3 z3Var = data.f244596e;
        if (K0) {
            str = z3Var.f2();
            kotlin.jvm.internal.o.f(str, "getDisplayNick(...)");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            kotlin.jvm.internal.o.f(z3Var.t0(), "getAlias(...)");
        }
        java.lang.String d17 = z3Var.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        int i18 = dy3.n.C;
        dy3.n nVar = this.f244583d;
        nVar.dismiss();
        cy3.i iVar = (cy3.i) nVar.f244586r;
        iVar.getClass();
        iVar.f224778a.invoke(java.lang.Boolean.valueOf(iVar.f224779b.f310112d), d17, iVar.f224780c.f310123d);
    }
}
