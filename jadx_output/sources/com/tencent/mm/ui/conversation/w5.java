package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class w5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.x5 f208218d;

    public w5(com.tencent.mm.ui.conversation.x5 x5Var) {
        this.f208218d = x5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.conversation.x5 x5Var = this.f208218d;
        if (x5Var.f208232e.f207478d.f380681t != 4) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 57L, 1L, false);
        } else {
            ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
            w73.f.k(122);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 122L, 1L, false);
        }
        dialogInterface.dismiss();
        ((un4.e) i95.n0.c(un4.e.class)).getClass();
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).tj(x5Var.f208232e.f207478d.f380680s);
    }
}
