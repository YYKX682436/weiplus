package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ng implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q0 f204925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.qf f204926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f204927c;

    public ng(com.tencent.mm.ui.chatting.viewitems.zf zfVar, ot0.q0 q0Var, com.tencent.mm.ui.chatting.viewitems.qf qfVar, int i17) {
        this.f204925a = q0Var;
        this.f204926b = qfVar;
        this.f204927c = i17;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizFrom", "query fail, liveId = 0");
        }
        ot0.q0 q0Var = this.f204925a;
        java.lang.String str = q0Var.f348741g;
        com.tencent.mm.ui.chatting.viewitems.qf qfVar = this.f204926b;
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
                hVar.j(nw1Var, rfVar.f205442u, rfVar.f205443v);
            }
        }
        java.lang.String str2 = "";
        if (z17) {
            r45.l71 l71Var2 = (r45.l71) obj;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(l71Var2.getString(4))) {
                str2 = l71Var2.getString(4);
            }
        }
        if (this.f204927c == 1) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                qfVar.f205361l.f205441t.setVisibility(8);
                return;
            } else {
                qfVar.f205361l.f205441t.setVisibility(0);
                qfVar.f205361l.f205441t.setText(str2);
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            qfVar.f205361l.f205438q.setVisibility(8);
        } else {
            qfVar.f205361l.f205438q.setVisibility(0);
            qfVar.f205361l.f205438q.setText(str2);
        }
    }
}
