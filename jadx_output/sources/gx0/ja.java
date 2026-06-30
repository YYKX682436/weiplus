package gx0;

/* loaded from: classes5.dex */
public final class ja implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276581d;

    public ja(gx0.ac acVar) {
        this.f276581d = acVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Object obj2;
        cx0.f fVar = (cx0.f) obj;
        gx0.ac acVar = this.f276581d;
        ex0.a0 e86 = acVar.e8();
        if (e86 == null || fVar == null || acVar.A7().getWidth() <= 0) {
            return;
        }
        if (fVar.f224518a == cx0.a.f224493d) {
            gx0.sc z76 = acVar.z7();
            ug.m mVar = ug.m.Narration;
            z76.getClass();
            pv0.g gVar = (pv0.g) z76.f358564r.get(mVar);
            if (gVar != null) {
                ((vu0.s) ((jz5.n) gVar.f358523d).getValue()).a();
            }
        }
        ex0.q qVar = (ex0.q) kz5.n0.Z(e86.f257097g.f257179g);
        acVar.f222650v = qVar != null ? qVar.C() : 1.0f;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        acVar.s7(new gx0.wb(acVar, h0Var, c0Var));
        com.tencent.mars.xlog.Log.i("MovieNarrationPanelUIC", "refreshTimbre: nextRoleID = " + ((java.lang.String) h0Var.f310123d) + ", hasDifferentRoleID = " + c0Var.f310112d);
        if (c0Var.f310112d || (obj2 = h0Var.f310123d) == null) {
            com.tencent.maas.material.MJMaterialInfo mJMaterialInfo = dw0.c.f244084f;
            kotlin.jvm.internal.o.g(mJMaterialInfo, "<set-?>");
            acVar.f222647s = mJMaterialInfo;
        } else {
            dw0.c l76 = acVar.z7().l7((java.lang.String) obj2);
            com.tencent.maas.material.MJMaterialInfo mJMaterialInfo2 = l76 != null ? l76.f244086a : null;
            if (mJMaterialInfo2 != null) {
                acVar.f222647s = mJMaterialInfo2;
            }
        }
        kotlinx.coroutines.l.d(acVar.getMainScope(), null, null, new gx0.tb(acVar, fVar, e86, null), 3, null);
    }
}
