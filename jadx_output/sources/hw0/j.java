package hw0;

/* loaded from: classes5.dex */
public final class j implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw0.g f285464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw0.n f285465e;

    public j(hw0.g gVar, hw0.n nVar) {
        this.f285464d = gVar;
        this.f285465e = nVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        kw0.e eVar = (kw0.e) obj;
        kotlin.jvm.internal.o.d(eVar);
        this.f285464d.setWhenWhereUiState(eVar);
        hw0.n nVar = this.f285465e;
        nVar.getClass();
        kw0.k kVar = eVar.f312803c;
        java.util.Objects.toString(kVar);
        if (kVar instanceof kw0.g) {
            kw0.a b17 = fv0.e.b(eVar);
            zu0.i iVar = b17 != null ? b17.f312789b : null;
            java.util.Objects.toString(iVar);
            if (iVar == zu0.i.f475675e) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = nVar.f285470o;
                if (!(u3Var2 != null && u3Var2.isShowing())) {
                    com.tencent.mm.ui.widget.dialog.u3 u3Var3 = nVar.f285470o;
                    if (u3Var3 != null) {
                        u3Var3.show();
                    }
                }
            }
            if (iVar == zu0.i.f475676f) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var4 = nVar.f285470o;
                if ((u3Var4 != null && u3Var4.isShowing()) && (u3Var = nVar.f285470o) != null) {
                    u3Var.dismiss();
                }
            }
        }
        if ((kVar instanceof kw0.j) || (kVar instanceof kw0.h)) {
            kw0.a b18 = fv0.e.b(eVar);
            if (zu0.i.f475676f == (b18 != null ? b18.f312789b : null)) {
                com.tencent.mars.xlog.Log.i("ComposingStickerPanelUI", "addWhenWhereSticker2Timeline: stickerData " + b18);
                du0.v0 R6 = nVar.R6();
                java.lang.String str = b18.f312788a.f48224b;
                kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
                R6.getClass();
                yy0.m7 m7Var = (yy0.m7) R6.O6();
                m7Var.getClass();
                kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.i4(m7Var, str, null), 3, null);
                nVar.o7(b18);
            }
        }
    }
}
