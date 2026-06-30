package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class v5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.x5 f208189d;

    public v5(com.tencent.mm.ui.conversation.x5 x5Var) {
        this.f208189d = x5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
        com.tencent.mm.ui.conversation.x5 x5Var = this.f208189d;
        com.tencent.mm.ui.conversation.b6 b6Var = x5Var.f208232e;
        android.app.Activity activity = b6Var.f207479e.f208009o;
        java.lang.String str = b6Var.f207478d.f380669e;
        ((yb0.c) yVar).getClass();
        com.tencent.mm.pluginsdk.model.app.n1.d(activity, str, null, false);
        if (x5Var.f208232e.f207478d.f380681t != 4) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 50L, 1L, false);
        } else {
            ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
            w73.f.k(123);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 123L, 1L, false);
        }
        dialogInterface.dismiss();
    }
}
