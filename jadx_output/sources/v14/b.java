package v14;

/* loaded from: classes5.dex */
public final class b implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v14.g f432535d;

    public b(v14.g gVar) {
        this.f432535d = gVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        e21.f0 f0Var = (e21.f0) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditSignatureUIC", "opResult: " + f0Var);
        xg3.q0 q0Var = f0Var.f246516a;
        if (q0Var != null && q0Var.b() == 64) {
            v14.g gVar = this.f432535d;
            if (gVar.getActivity() instanceof com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI) {
                if (f0Var.f246517b != 0 || gVar.f432544e == null) {
                    com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(gVar.getActivity());
                    java.lang.String str = f0Var.f246519d;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        str = gVar.getActivity().getString(com.tencent.mm.R.string.f490005i7);
                    }
                    u1Var.g(str);
                    u1Var.a(false);
                    u1Var.b(v14.a.f432534a);
                    u1Var.q(false);
                } else {
                    gm0.j1.u().c().w(12291, gVar.f432544e);
                    gVar.getActivity().finish();
                }
                com.tencent.mm.ui.widget.dialog.u3 u3Var = gVar.f432543d;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
