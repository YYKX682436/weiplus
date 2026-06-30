package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class w2 implements com.tencent.mm.modelbase.u0 {
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.d().q(2641, this);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGameIndex4TabNav", "update gameIndexTabNav data fail");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGameIndex4TabNav", "update gameIndexTabNav data success");
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.model.v2(this, (m53.c2) ((com.tencent.mm.plugin.game.model.a3) m1Var).f140203e.f70711b.f70700a));
        }
    }
}
