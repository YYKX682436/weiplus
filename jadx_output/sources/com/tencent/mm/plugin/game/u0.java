package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public class u0 implements java.lang.Runnable {
    public u0(com.tencent.mm.plugin.game.p0 p0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageStorage", "deleteGameLifeChatMsg history ret:%s", java.lang.Boolean.valueOf(((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().execSQL("GameRawMessage", "delete from GameRawMessage where rawXML like \"%<chatmsg%\"")));
    }
}
