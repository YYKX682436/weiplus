package p62;

/* loaded from: classes11.dex */
public class h implements xg3.i0 {
    @Override // xg3.i0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (z65.c.f470458d) {
            return;
        }
        if (m0Var == null || l0Var == null || l0Var.f454412c == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtOnMsgChanged", "onMsgChange, wrong args");
            return;
        }
        synchronized (n62.k.Di()) {
            android.database.Cursor rawQuery = n62.k.Ri().rawQuery("select * from OpenMsgListener where (status = ?) ", "1");
            if (rawQuery == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExtOnMsgChanged", "onMsgChange onNotifyChange getValidOpenMsgListener cu == null");
                return;
            }
            rawQuery.getCount();
            if (rawQuery.getCount() <= 0) {
                rawQuery.close();
                com.tencent.mars.xlog.Log.i("MicroMsg.ExtOnMsgChanged", "onMsgChange onNotifyChange cu.getCount() <= 0");
                return;
            }
            rawQuery.close();
            for (int i17 = 0; i17 < l0Var.f454412c.size(); i17++) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) l0Var.f454412c.get(i17);
                if (f9Var != null && f9Var.A0() == 0 && f9Var.P0() != 4 && f9Var.getType() != 9999 && f9Var.getType() != 10000 && !c01.e2.U(f9Var.Q0()) && !c01.e2.Q(f9Var.Q0())) {
                    java.lang.Integer num = (java.lang.Integer) n62.k.Di().f335201h.get(f9Var.Q0());
                    if (num == null) {
                        n62.k.Di().f335201h.put(f9Var.Q0(), 1);
                    } else {
                        n62.k.Di().f335201h.put(f9Var.Q0(), java.lang.Integer.valueOf(num.intValue() + 1));
                        num.intValue();
                    }
                }
            }
            if (n62.k.Di().f335201h.size() > 0) {
                com.tencent.mm.sdk.platformtools.n3 n3Var = n62.k.Di().f335203m;
                n3Var.removeMessages(0);
                n3Var.sendEmptyMessageDelayed(0, 1600L);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExtOnMsgChanged", "notifyMsgUsers.size < 1");
            }
        }
    }
}
