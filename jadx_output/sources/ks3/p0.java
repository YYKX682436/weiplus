package ks3;

/* loaded from: classes4.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final ks3.o0 f311734a;

    public p0() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(282625, "");
        try {
            ks3.o0 o0Var = new ks3.o0();
            this.f311734a = o0Var;
            o0Var.parseFrom(android.util.Base64.decode(str, 0));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareMailInfoMgr", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.w("MicroMsg.ShareMailInfoMgr", "parse from config fail");
            this.f311734a = new ks3.o0();
        }
    }
}
