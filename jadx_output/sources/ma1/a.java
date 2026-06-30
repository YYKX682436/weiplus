package ma1;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    public static final int CTRL_INDEX = 667;
    public static final java.lang.String NAME = "onGameRecorderStateChange";

    public void x(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, java.lang.String str) {
        u(e9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch error: %d, %s", java.lang.Integer.valueOf(i17), str);
        java.util.HashMap hashMap = new java.util.HashMap(3);
        hashMap.put("state", "error");
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        hashMap.put("errMsg", str);
        t(hashMap);
        m();
    }

    public void y(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        u(e9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch pause");
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("state", "pause");
        t(hashMap);
        m();
    }

    public void z(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        u(e9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch resume");
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("state", "resume");
        t(hashMap);
        m();
    }
}
