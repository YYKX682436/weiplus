package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class d6 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f172968d;

    public d6(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI) {
        this.f172968d = teenModePrivatePwdUI;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        o01.a aVar = (o01.a) obj;
        if (aVar.f359284a == q01.f.f359276e) {
            com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI = this.f172968d;
            com.tencent.mm.ui.widget.dialog.u3 u3Var = teenModePrivatePwdUI.f172906m;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            if (aVar.f359286c == 0) {
                vh4.t1 t1Var = (vh4.t1) i95.n0.c(vh4.t1.class);
                r45.w26 w26Var = (r45.w26) aVar.f359289f;
                if (w26Var == null || (str = w26Var.f388807d) == null) {
                    str = ((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h;
                }
                t1Var.f437138h = str;
                ((vh4.t1) i95.n0.c(vh4.t1.class)).f437139i = 2;
                db5.t7.h(teenModePrivatePwdUI.getContext(), teenModePrivatePwdUI.getString(com.tencent.mm.R.string.jtf));
                ((vh4.t1) i95.n0.c(vh4.t1.class)).T(14);
                teenModePrivatePwdUI.setResult(-1);
                teenModePrivatePwdUI.finish();
            } else {
                teenModePrivatePwdUI.l7(aVar.f359287d);
                ((vh4.t1) i95.n0.c(vh4.t1.class)).T(13);
            }
        }
        return jz5.f0.f302826a;
    }
}
