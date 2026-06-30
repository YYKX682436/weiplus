package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class fg implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q0 f203966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.of f203967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203968c;

    public fg(com.tencent.mm.ui.chatting.viewitems.zf zfVar, ot0.q0 q0Var, com.tencent.mm.ui.chatting.viewitems.of ofVar, java.lang.String str) {
        this.f203966a = q0Var;
        this.f203967b = ofVar;
        this.f203968c = str;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizFrom", "query fail, liveId = 0");
        }
        ot0.q0 q0Var = this.f203966a;
        java.lang.String str = q0Var.f348741g;
        com.tencent.mm.ui.chatting.viewitems.of ofVar = this.f203967b;
        if (!str.equals(ofVar.f205191d.getTag(com.tencent.mm.R.id.bph))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizFrom", "recycled");
            return;
        }
        if (obj instanceof r45.l71) {
            r45.l71 l71Var = (r45.l71) obj;
            if (((r45.nw1) l71Var.getCustom(1)) != null) {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).A(q0Var.f348741g, (r45.nw1) l71Var.getCustom(1));
                eq1.h.f255812a.k((r45.nw1) l71Var.getCustom(1), ofVar.f205191d, this.f203968c);
            }
        }
    }
}
