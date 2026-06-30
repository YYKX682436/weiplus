package se4;

/* loaded from: classes9.dex */
public class d implements java.lang.Runnable {
    public d(se4.e eVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (cu5.b.c()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterInitManager", "bind service timeout, reinit");
        se4.h.a(false, true, new se4.c(this));
    }
}
