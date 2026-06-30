package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.m1.class)
/* loaded from: classes9.dex */
public final class h9 extends com.tencent.mm.ui.chatting.component.a implements sb5.m1 {
    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).getClass();
        ((java.util.HashSet) com.tencent.mm.plugin.wallet_core.utils.i1.f180907c).clear();
    }

    @Override // yn.d
    public void Y(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 w0Var) {
        java.util.LinkedList linkedList;
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).getClass();
        if (!com.tencent.mm.plugin.wallet_core.utils.i1.f180906b || w0Var == null || (linkedList = w0Var.f293156i) == null || linkedList.isEmpty()) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            in5.c cVar = ((in5.x0) it.next()).f293158a;
            rd5.d dVar = cVar instanceof rd5.d ? (rd5.d) cVar : null;
            qg0.g0 g0Var = (qg0.g0) i95.n0.c(qg0.g0.class);
            com.tencent.mm.storage.f9 f9Var = dVar != null ? dVar.f394254d.f445300b : null;
            ((pg0.p3) g0Var).getClass();
            com.tencent.mm.plugin.wallet_core.utils.i1 i1Var = com.tencent.mm.plugin.wallet_core.utils.i1.f180905a;
            if (f9Var != null) {
                if (i1Var.c(f9Var) || i1Var.b(f9Var)) {
                    ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.wallet_core.utils.h1(f9Var), "WcPayMessageReporter-WxPluginMessage");
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).getClass();
        com.tencent.mm.plugin.wallet_core.utils.i1 i1Var = com.tencent.mm.plugin.wallet_core.utils.i1.f180905a;
        com.tencent.mm.plugin.wallet_core.utils.i1.f180906b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_pay_msg_report_config, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayPluginMessageReportor", "[isOpenSwitch] " + com.tencent.mm.plugin.wallet_core.utils.i1.f180906b + ' ');
    }
}
