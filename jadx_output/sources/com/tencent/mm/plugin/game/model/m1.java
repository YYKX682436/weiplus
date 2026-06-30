package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class m1 implements java.lang.Runnable {
    public m1(com.tencent.mm.plugin.game.model.i1 i1Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        m53.z3 z3Var;
        if (com.tencent.mm.plugin.game.commlib.i.e() != null) {
            z3Var = com.tencent.mm.plugin.game.commlib.i.f139381a.MessageDBStrategy;
        } else {
            com.tencent.mm.plugin.game.commlib.i.s();
            z3Var = null;
        }
        if (z3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageService", "getGameMessageDBStrategy fail,gameMessageDBStrategy is null");
            return;
        }
        int P0 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().P0(65536);
        n53.a.c(1000, P0, 0, "", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageService", "gamelog.clean, start clean, record count:%d", java.lang.Integer.valueOf(P0));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = z3Var.f324232f.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            m53.y yVar = (m53.y) it.next();
            if (yVar.f324180d == 0 && yVar.f324182f == 0) {
                yVar.f324182f = 14;
            }
            if (yVar.f324182f != 0) {
                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().y0(yVar.f324180d, java.lang.System.currentTimeMillis() - (yVar.f324182f * 86400000));
                if (yVar.f324180d == 0) {
                    z17 = true;
                }
            }
            if (yVar.f324181e != 0) {
                com.tencent.mm.plugin.game.model.o1 Di = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
                int i17 = yVar.f324180d;
                int i18 = yVar.f324181e;
                Di.getClass();
                android.database.Cursor rawQuery = Di.rawQuery("select count(*) from GameRawMessage where showType = " + i17, new java.lang.String[0]);
                if (rawQuery != null) {
                    if (rawQuery.moveToFirst() && rawQuery.getInt(0) > i18) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageStorage", "delMessageByMsgTypeAndQuantity  ret:%s", java.lang.Boolean.valueOf(Di.execSQL("GameRawMessage", "delete from GameRawMessage where msgId < (" + ("select msgId from GameRawMessage where showType = " + i17 + " order by msgId desc limit 1 offset " + i18) + ") and showType = " + i17)));
                    }
                    rawQuery.close();
                }
            }
        }
        if (!z17) {
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().y0(0, java.lang.System.currentTimeMillis() - 1209600000);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageService", "delExpiredMessage costTime:" + currentTimeMillis2);
        n53.a.c(1001, currentTimeMillis2, 0, "", 0);
    }
}
