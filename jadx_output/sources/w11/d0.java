package w11;

/* loaded from: classes11.dex */
public class d0 implements com.tencent.mm.modelbase.u0 {
    public d0(w11.g0 g0Var) {
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetPushSync", "NetSceneNotifyData onSceneEnd: %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        m1Var.setHasCallbackToQueue(true);
    }
}
