package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class wf implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124328d;

    public wf(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        this.f124328d = finderProfileTabUIC;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.network.v0 reqResp;
        o45.ah respObj;
        com.tencent.mm.network.v0 reqResp2;
        o45.ah respObj2;
        com.tencent.mm.network.v0 reqResp3;
        o45.zg reqObj;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124328d;
        android.app.Activity context = finderProfileTabUIC.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
        if (p2Var != null) {
            r45.xw xwVar = null;
            java.lang.Integer valueOf = (m1Var == null || (reqResp3 = m1Var.getReqResp()) == null || (reqObj = reqResp3.getReqObj()) == null) ? null : java.lang.Integer.valueOf((int) reqObj.getBufferSize());
            java.lang.Integer valueOf2 = (m1Var == null || (reqResp2 = m1Var.getReqResp()) == null || (respObj2 = reqResp2.getRespObj()) == null) ? null : java.lang.Integer.valueOf((int) respObj2.getBufferSize());
            if (m1Var != null && (reqResp = m1Var.getReqResp()) != null && (respObj = reqResp.getRespObj()) != null) {
                xwVar = respObj.getProfile();
            }
            p2Var.Q6(11732, i18, new az2.g(valueOf, valueOf2, xwVar));
        }
        gm0.j1.d().q(11732, this);
        if (m1Var instanceof db2.f6) {
            db2.f6 f6Var = (db2.f6) m1Var;
            if (kotlin.jvm.internal.o.b(f6Var.f227974g, finderProfileTabUIC.F7())) {
                if (i17 == 0 && i18 == 0) {
                    finderProfileTabUIC.I7(5, new com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingMusicFragment(f6Var));
                } else {
                    finderProfileTabUIC.getClass();
                    pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.ig(finderProfileTabUIC, false));
                }
            }
        }
    }
}
