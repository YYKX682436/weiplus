package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class bg implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q0 f203476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.qf f203477b;

    public bg(com.tencent.mm.ui.chatting.viewitems.zf zfVar, ot0.q0 q0Var, com.tencent.mm.ui.chatting.viewitems.qf qfVar) {
        this.f203476a = q0Var;
        this.f203477b = qfVar;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizFrom", "query fail, liveId = 0");
        }
        ot0.q0 q0Var = this.f203476a;
        java.lang.String str = q0Var.f348741g;
        com.tencent.mm.ui.chatting.viewitems.qf qfVar = this.f203477b;
        if (!str.equals(qfVar.f205361l.f205263a.getTag(com.tencent.mm.R.id.bph))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizFrom", "recycled");
            return;
        }
        boolean z17 = obj instanceof r45.l71;
        if (z17) {
            r45.l71 l71Var = (r45.l71) obj;
            if (((r45.nw1) l71Var.getCustom(1)) != null) {
                r45.nw1 nw1Var = (r45.nw1) l71Var.getCustom(1);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).A(q0Var.f348741g, nw1Var);
                eq1.h hVar = eq1.h.f255812a;
                com.tencent.mm.ui.chatting.viewitems.rf rfVar = qfVar.f205361l;
                hVar.j(nw1Var, rfVar.f205431j, rfVar.f205432k);
            }
        }
        java.lang.String str2 = "";
        if (z17) {
            r45.l71 l71Var2 = (r45.l71) obj;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(l71Var2.getString(4))) {
                str2 = l71Var2.getString(4);
            }
        }
        qfVar.f205361l.f205430i.setText(str2);
    }
}
