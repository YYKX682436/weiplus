package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class x5 implements java.lang.Runnable {
    public x5(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "Dispatch sync action on tab resume");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).P.e(826259965, 13);
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).Zi(new tg0.m2());
        int i17 = ra0.y.f393481g1;
        j75.f Ni = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ni();
        if (Ni != null) {
            Ni.B3(new sa0.l());
        }
    }
}
