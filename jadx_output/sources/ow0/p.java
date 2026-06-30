package ow0;

/* loaded from: classes5.dex */
public final class p implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ow0.a0 f349343d;

    public p(ow0.a0 a0Var) {
        this.f349343d = a0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        kw0.e eVar = (kw0.e) obj;
        ow0.a0 a0Var = this.f349343d;
        a0Var.A.setValue(eVar);
        kotlin.jvm.internal.o.d(eVar);
        kw0.k kVar = eVar.f312803c;
        if (kVar instanceof kw0.g) {
            kw0.a b17 = fv0.e.b(eVar);
            zu0.i iVar = b17 != null ? b17.f312789b : null;
            if (iVar == zu0.i.f475675e) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = a0Var.f349280n;
                if (!(u3Var2 != null && u3Var2.isShowing())) {
                    com.tencent.mm.ui.widget.dialog.u3 u3Var3 = a0Var.f349280n;
                    if (u3Var3 != null) {
                        u3Var3.show();
                    }
                }
            }
            if (iVar == zu0.i.f475676f) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var4 = a0Var.f349280n;
                if ((u3Var4 != null && u3Var4.isShowing()) && (u3Var = a0Var.f349280n) != null) {
                    u3Var.dismiss();
                }
            }
        }
        if (!(kVar instanceof kw0.j) && !(kVar instanceof kw0.h)) {
            com.tencent.mars.xlog.Log.i("ComposingTextPanelUIC", "addFancyTextSticker2Timeline: updateState " + kVar);
            return;
        }
        kw0.a b18 = fv0.e.b(eVar);
        if (zu0.i.f475676f == (b18 != null ? b18.f312789b : null)) {
            com.tencent.mars.xlog.Log.i("ComposingTextPanelUIC", "addFancyTextSticker2Timeline: stickerData " + b18);
            a0Var.k7(b18);
            du0.v0 R6 = a0Var.R6();
            java.lang.String str = b18.f312788a.f48224b;
            kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
            R6.getClass();
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.d4(m7Var, str, null), 3, null);
        }
    }
}
