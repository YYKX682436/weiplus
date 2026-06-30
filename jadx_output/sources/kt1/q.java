package kt1;

/* loaded from: classes11.dex */
public final class q implements en1.l {
    @Override // en1.l
    public void onAuthResponse(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        kt1.z zVar = (kt1.z) ((ct1.w) i95.n0.c(ct1.w.class));
        zVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ReliableSync.Service", "onAuthResponse() called autoAuth = " + z17);
        if (w11.a1.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ReliableSync.Service", "onAuthResponse() called needInit. do not sync");
        } else {
            zVar.wi(1);
        }
    }

    @Override // en1.l
    public void onRegResponse(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
    }
}
