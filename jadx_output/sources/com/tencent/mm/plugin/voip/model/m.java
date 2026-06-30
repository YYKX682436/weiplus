package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public final class m implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.n f176742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.r27 f176743b;

    public m(com.tencent.mm.plugin.voip.model.n nVar, r45.r27 r27Var) {
        this.f176742a = nVar;
        this.f176743b = r27Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.voip.model.n nVar = this.f176742a;
        jq4.z0.c(nVar.f176753d, false, false, false, 3, null);
        com.tencent.mm.plugin.voip.model.n.b(nVar, 2);
        nVar.q();
        com.tencent.mm.plugin.voip.model.c0 c0Var = (com.tencent.mm.plugin.voip.model.c0) nVar;
        if (!gq4.v.Bi().f176558a.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "click accept, directly accept");
            c0Var.z(this.f176743b);
            nVar.p();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "click accept, hangup and waiting for accept");
        nVar.f176763q = true;
        nVar.f176761o = false;
        nVar.f176762p = true ^ gq4.v.Bi().f176563f;
        gq4.a aVar = gq4.v.Bi().f176559b;
        if (aVar != null) {
            ((com.tencent.mm.plugin.voip.model.d0) aVar).s0();
        }
    }
}
