package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class k1 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.l1 f140351a;

    public k1(com.tencent.mm.plugin.game.model.l1 l1Var) {
        this.f140351a = l1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        long j17;
        com.tencent.mm.protobuf.f fVar;
        if (i17 == 0 && i18 == 0 && (fVar = oVar.f70711b.f70700a) != null) {
            m53.p4 p4Var = (m53.p4) fVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageService", "PullUserMessageResponse success NextReportSeconds: %d", java.lang.Long.valueOf(p4Var.f323966d));
            j17 = p4Var.f323966d;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageService", "PullUserMessageRequest cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, oVar.f70711b.f70700a);
            j17 = 0;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f140351a.f140357d)) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_REDDOT_PULL_MSG_MIN_DURATION_SEC_LONG, java.lang.Long.valueOf(j17));
        }
    }
}
