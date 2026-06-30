package ko3;

/* loaded from: classes9.dex */
public enum l0 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f309985d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public android.hardware.display.DisplayManager f309986e = null;

    l0() {
    }

    public r45.lw4 h() {
        try {
            byte[] j17 = com.tencent.mm.sdk.platformtools.o4.M("normsg_sri").j("sris");
            if (j17 != null && j17.length != 0) {
                r45.mw4 mw4Var = new r45.mw4();
                mw4Var.parseFrom(j17);
                java.util.Collections.sort(mw4Var.f380867d, new ko3.l0$$a());
                return (r45.lw4) mw4Var.f380867d.get(0);
            }
            return null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SRD", "get sri error:" + th6);
            return null;
        }
    }

    public final void i() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("normsg_sri");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f309985d;
        if (concurrentHashMap.isEmpty()) {
            M.W("sris");
            return;
        }
        try {
            r45.mw4 mw4Var = new r45.mw4();
            mw4Var.f380867d = new java.util.LinkedList(concurrentHashMap.values());
            if (M.H("sris", mw4Var.toByteArray())) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SRD", "encode sri failed");
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SRD", "update mmkv error: " + e17);
        }
    }
}
