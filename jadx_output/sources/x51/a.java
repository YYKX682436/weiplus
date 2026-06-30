package x51;

/* loaded from: classes11.dex */
public class a implements y61.f {
    @Override // y61.f
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AddrBookSyncHelper", "syncAddrBookAndUpload onSyncEnd suc:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            java.lang.System.currentTimeMillis();
            gm0.j1.d().g(new r61.t1(r61.q0.g(), r61.q0.e()));
        }
    }
}
