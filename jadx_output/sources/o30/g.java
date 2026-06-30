package o30;

/* loaded from: classes.dex */
public class g implements gm0.i2 {
    @Override // gm0.i2
    public void kh(int i17) {
        h62.d vj6 = h62.d.vj();
        vj6.getClass();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExptService", "client upgrade now, reset last update time. previous version [%d]", java.lang.Integer.valueOf(i17));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_LAST_TIME_SEC_INT, 0);
            vj6.wi(3);
            vj6.Cj(false);
            vj6.Hj(3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExptService", e17, "onAccountInitialized error[%s]", e17.toString());
        }
    }
}
