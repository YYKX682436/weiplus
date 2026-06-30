package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class v implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddFriendUI f138198d;

    public v(com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI) {
        this.f138198d = fTSAddFriendUI;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.d().q(106, this);
        int i19 = com.tencent.mm.plugin.fts.ui.FTSAddFriendUI.f137869p1;
        com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI = this.f138198d;
        fTSAddFriendUI.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fts.ui.m(fTSAddFriendUI));
        tg3.r1 r1Var = (tg3.r1) m1Var;
        fTSAddFriendUI.V = r1Var.H();
        com.tencent.mm.modelbase.o oVar = r1Var.f419214e;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
            r45.hw5 hw5Var = (r45.hw5) fVar;
            r45.hw5 hw5Var2 = (r45.hw5) fVar;
            fTSAddFriendUI.Y = hw5Var2 != null ? x51.j1.g(hw5Var2.f376516d) : "";
            r45.iw5 iw5Var = fTSAddFriendUI.V;
            if (iw5Var.D > 0) {
                if (iw5Var.E.isEmpty()) {
                    db5.e1.o(fTSAddFriendUI, com.tencent.mm.R.string.icr, 0, true, null);
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("add_more_friend_search_scene", 3);
                if (fTSAddFriendUI.V.E.size() > 1) {
                    try {
                        intent.putExtra("result", fTSAddFriendUI.V.toByteArray());
                        j45.l.j(fTSAddFriendUI.getContext(), "subapp", ".ui.pluginapp.ContactSearchResultUI", intent, null);
                        return;
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSAddFriendUI", e17, "", new java.lang.Object[0]);
                        return;
                    }
                }
                ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).wi(intent, (r45.gw5) fTSAddFriendUI.V.E.getFirst(), fTSAddFriendUI.f137884y0);
            }
            fTSAddFriendUI.W = 1;
            int i27 = hw5Var.f376521i;
            com.tencent.mm.autogen.events.BizPreSearchEvent bizPreSearchEvent = new com.tencent.mm.autogen.events.BizPreSearchEvent();
            am.v0 v0Var = bizPreSearchEvent.f54005g;
            v0Var.f8151a = fTSAddFriendUI;
            v0Var.f8152b = 16;
            v0Var.f8153c = fTSAddFriendUI.f137910n;
            v0Var.f8156f = fTSAddFriendUI.getString(com.tencent.mm.R.string.ics);
            v0Var.f8154d = 1L;
            com.tencent.mm.plugin.fts.ui.l lVar = new com.tencent.mm.plugin.fts.ui.l(fTSAddFriendUI, bizPreSearchEvent, i27);
            v0Var.f8157g = lVar;
            v0Var.f8155e = 1;
            if (!bizPreSearchEvent.e()) {
                bizPreSearchEvent.f54006h.f8244a = false;
                lVar.run();
            }
        } else {
            if (i18 == -24) {
                tm.a b17 = tm.a.b(str);
                if (b17 != null) {
                    fTSAddFriendUI.C.setText(b17.f420399b);
                } else {
                    fTSAddFriendUI.C.setText(com.tencent.mm.R.string.h9y);
                }
            } else if (i18 != -4) {
                fTSAddFriendUI.C.setText(com.tencent.mm.R.string.h9y);
            } else if (i17 == 4) {
                fTSAddFriendUI.C.setText(com.tencent.mm.R.string.h9y);
            } else {
                fTSAddFriendUI.C.setText(fTSAddFriendUI.getString(com.tencent.mm.R.string.icn));
            }
            fTSAddFriendUI.W = -1;
            fTSAddFriendUI.X = 1;
        }
        com.tencent.mm.plugin.fts.ui.FTSAddFriendUI.f7(fTSAddFriendUI, ((r45.hw5) oVar.f70710a.f70684a).f376521i);
    }
}
