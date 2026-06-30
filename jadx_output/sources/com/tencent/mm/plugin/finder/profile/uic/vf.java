package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class vf implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124300d;

    public vf(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        this.f124300d = finderProfileTabUIC;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.network.v0 reqResp;
        o45.ah respObj;
        com.tencent.mm.network.v0 reqResp2;
        o45.ah respObj2;
        com.tencent.mm.network.v0 reqResp3;
        o45.zg reqObj;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124300d;
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
            p2Var.Q6(8460, i18, new az2.g(valueOf, valueOf2, xwVar));
        }
        gm0.j1.d().q(8460, this);
        if (m1Var instanceof db2.e6) {
            db2.e6 e6Var = (db2.e6) m1Var;
            if (kotlin.jvm.internal.o.b(e6Var.f227961g, finderProfileTabUIC.F7()) && i17 == 0 && i18 == 0) {
                if (e6Var.P() && ((!e6Var.K() && !e6Var.L()) || !((java.lang.Boolean) ((jz5.n) finderProfileTabUIC.f123461w).getValue()).booleanValue())) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkTingAudioTab onSceneEnd: remove ting audio tab items  empty");
                    pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.hg(finderProfileTabUIC, false));
                    return;
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkTingAudioTab onSceneEnd: add ting audio tab items not empty, isAudioEmpty=" + e6Var.P());
                com.tencent.mm.plugin.finder.feed.model.a7 a7Var = new com.tencent.mm.plugin.finder.feed.model.a7(i17, i18, str);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.addAll(e6Var.M());
                a7Var.setIncrementList(linkedList);
                a7Var.setPullType(e6Var.f227964m);
                com.tencent.mm.modelbase.o oVar = e6Var.f227963i;
                com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
                a7Var.setHasMore(((r45.wu0) fVar).f389465f == 1);
                com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
                a7Var.setLastBuffer(((r45.wu0) fVar2).f389466g);
                pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.af(finderProfileTabUIC, e6Var, a7Var));
            }
        }
    }
}
