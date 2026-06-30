package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class b6 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f172937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f172938e;

    public b6(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI, int i17) {
        this.f172937d = teenModePrivatePwdUI;
        this.f172938e = i17;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        o01.a aVar = (o01.a) obj;
        if (aVar.f359284a == q01.f.f359276e) {
            com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI = this.f172937d;
            com.tencent.mm.ui.widget.dialog.u3 u3Var = teenModePrivatePwdUI.f172906m;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            if (aVar.f359286c == 0) {
                ((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h = null;
                ((vh4.t1) i95.n0.c(vh4.t1.class)).f437139i = 1;
                teenModePrivatePwdUI.finish();
                db5.t7.h(teenModePrivatePwdUI.getContext(), teenModePrivatePwdUI.getString(this.f172938e == 3 ? com.tencent.mm.R.string.jt7 : com.tencent.mm.R.string.jtr));
                ((vh4.t1) i95.n0.c(vh4.t1.class)).T(19);
            } else {
                teenModePrivatePwdUI.l7(aVar.f359287d);
                teenModePrivatePwdUI.d7().setText("");
            }
        }
        return jz5.f0.f302826a;
    }
}
