package zv0;

/* loaded from: classes5.dex */
public final class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f476169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zv0.r f476170e;

    public e(rv0.n1 n1Var, zv0.r rVar) {
        this.f476169d = n1Var;
        this.f476170e = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        rv0.n1 n1Var = this.f476169d;
        kotlin.jvm.internal.o.g(n1Var, "<this>");
        zv0.r transitionInfo = this.f476170e;
        kotlin.jvm.internal.o.g(transitionInfo, "transitionInfo");
        zu0.i iVar = zu0.i.f475674d;
        zu0.i iVar2 = transitionInfo.f476222b;
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo = transitionInfo.f476221a;
        if (iVar2 != iVar || kotlin.jvm.internal.o.b(mJMaterialInfo.f48224b, zv0.r.f476220d.f476221a.f48224b)) {
            ex0.a0 s76 = n1Var.s7();
            if (s76 != null) {
                java.lang.String str = mJMaterialInfo.f48224b;
                kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
                java.util.Iterator it = ((java.util.ArrayList) s76.f257097g.f257181i).iterator();
                while (it.hasNext()) {
                    s76.x((ex0.j0) it.next(), str);
                }
                s76.J(cx0.d.f224510f.a(cx0.d.f224509e), null);
            }
            ex0.a0 s77 = n1Var.s7();
            if (s77 != null) {
                ex0.i0.m(s77);
            }
            gx0.kh q76 = n1Var.q7();
            java.lang.String string = n1Var.getContext().getString(com.tencent.mm.R.string.m1t);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
            zv0.f0 f0Var = n1Var.f400137y;
            if (f0Var != null) {
                f0Var.D = false;
            }
            if (f0Var != null) {
                f0Var.e(true, true);
            }
            kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new zv0.a(n1Var, null), 3, null);
        }
    }
}
