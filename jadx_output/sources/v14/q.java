package v14;

/* loaded from: classes5.dex */
public final class q implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v14.v f432579d;

    public q(v14.v vVar) {
        this.f432579d = vVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        e21.f0 f0Var = (e21.f0) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsModifyNameUIC", "opResult: " + f0Var);
        xg3.q0 q0Var = f0Var.f246516a;
        if (q0Var != null && q0Var.b() == 64) {
            v14.v vVar = this.f432579d;
            if (vVar.getActivity() instanceof com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI) {
                int i17 = f0Var.f246517b;
                if (i17 != 0 && (str = f0Var.f246519d) != null) {
                    androidx.appcompat.app.AppCompatActivity activity = vVar.getActivity();
                    java.lang.String str2 = f0Var.f246518c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    db5.e1.s(activity, str, str2);
                } else if (i17 == 0) {
                    gm0.j1.u().c().w(4, vVar.f432588e);
                    ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().h(7);
                    vVar.getActivity().finish();
                    com.tencent.mm.plugin.report.service.b1.f(4, 1);
                }
                com.tencent.mm.ui.widget.dialog.u3 u3Var = vVar.f432587d;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
