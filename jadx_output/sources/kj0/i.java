package kj0;

@j95.b
/* loaded from: classes8.dex */
public class i extends i95.w implements kj0.l {
    public java.lang.String Ai(e42.d0 d0Var, java.lang.String str) {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(d0Var, str, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameExptManager", "gamelog.exp, getExpt, key: %s, result: %s", d0Var.name(), Zi);
        return Zi;
    }

    public boolean Bi(e42.d0 d0Var, boolean z17) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(d0Var, z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameExptManager", "gamelog.exp, getExpt, key: %s, result: %b", d0Var.name(), java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public int wi(e42.d0 d0Var, int i17) {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(d0Var, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameExptManager", "gamelog.exp, getExpt, key: %s, result: %d", d0Var.name(), java.lang.Integer.valueOf(Ni));
        return Ni;
    }
}
