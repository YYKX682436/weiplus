package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public class o1 implements androidx.lifecycle.k0 {
    public o1(com.tencent.mm.plugin.game.p1 p1Var) {
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameService", "gameFindPageEntrance notify onChanged isShow=%s!", java.lang.Boolean.valueOf(aVar.f105327a));
        if (!aVar.f105327a) {
            com.tencent.mm.autogen.events.FinderGameRedDotEvent finderGameRedDotEvent = new com.tencent.mm.autogen.events.FinderGameRedDotEvent();
            finderGameRedDotEvent.f54278g.f6935a = 2;
            finderGameRedDotEvent.e();
        } else if (aVar.f105329c != null) {
            com.tencent.mm.autogen.events.FinderGameRedDotEvent finderGameRedDotEvent2 = new com.tencent.mm.autogen.events.FinderGameRedDotEvent();
            finderGameRedDotEvent2.f54278g.f6935a = 1;
            finderGameRedDotEvent2.e();
        }
        w71.m1 wi6 = ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).wi();
        if (wi6 != null) {
            urgen.ur_C563.UR_379F.UR_0A45(((w71.n1) wi6).getCppPointer(), "Game.Entrance");
        }
    }
}
