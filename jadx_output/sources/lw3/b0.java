package lw3;

/* loaded from: classes9.dex */
public class b0 implements xg3.i0 {
    @Override // xg3.i0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        kw3.p Ai = kw3.p.Ai();
        Ai.getClass();
        if (l0Var.f454411b.equals("delete")) {
            java.lang.String str = l0Var.f454410a;
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "update red flag when delete msg: %s", str);
            Ai.Vi(str, null, null);
        }
    }
}
