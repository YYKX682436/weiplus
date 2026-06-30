package uw0;

/* loaded from: classes5.dex */
public final class y0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.e1 f431627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.u0 f431628e;

    public y0(uw0.e1 e1Var, uw0.u0 u0Var) {
        this.f431627d = e1Var;
        this.f431628e = u0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        sw0.e eVar = (sw0.e) obj;
        kotlin.jvm.internal.o.d(eVar);
        uw0.e1 e1Var = this.f431627d;
        if (e1Var.A) {
            java.util.List<sw0.d> list = eVar.f413426a;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (sw0.d dVar : list) {
                arrayList.add(sw0.d.a(dVar, null, kotlin.jvm.internal.o.b(dVar.f413422a.f48229g.get("support_multi_subtitles"), "1") ? dVar.f413423b : zu0.i.f475678h, false, null, 13, null));
            }
            eVar = sw0.e.b(eVar, arrayList, null, null, 6, null);
        }
        this.f431628e.setTextStyleState$plugin_mj_template_release(eVar);
        sw0.m mVar = eVar.f413428c;
        if (mVar instanceof sw0.h) {
            kotlinx.coroutines.l.d(e1Var.getMainScope(), null, null, new uw0.x0(e1Var, null), 3, null);
            return;
        }
        if (mVar instanceof sw0.i) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = e1Var.B;
            if (u3Var.isShowing()) {
                u3Var.dismiss();
                return;
            }
            return;
        }
        if (mVar instanceof sw0.j) {
            return;
        }
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l) {
            e1Var.H7(eVar);
        }
    }
}
