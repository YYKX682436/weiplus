package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class y3 extends p13.c {
    public y3(com.tencent.mm.plugin.fts.logic.c4 c4Var, com.tencent.mm.plugin.fts.logic.u3 u3Var) {
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "FTSClearUnReadCountTask";
    }

    @Override // p13.c
    public boolean i() {
        gm0.j1.u().f273153f.A(null, "UPDATE rconversation SET unReadCount = 0;");
        return true;
    }
}
