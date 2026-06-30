package ln0;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f319668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f319669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f319670f;

    public o(ln0.p pVar, kotlin.jvm.internal.h0 h0Var, java.lang.String str) {
        this.f319668d = pVar;
        this.f319669e = h0Var;
        this.f319670f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = ((java.lang.String) this.f319669e.f310123d) + this.f319670f;
        ln0.p pVar = this.f319668d;
        pVar.getClass();
        com.tencent.mm.network.h2 h2Var = null;
        try {
            h2Var = com.tencent.mm.network.n.d(str + "&token=" + pVar.f319673b, null);
            h2Var.g(10000);
            h2Var.k(10000);
            h2Var.a();
            int f17 = h2Var.f();
            if (f17 == 200) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper update video cache: " + f17 + " url: " + str);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper update video cache error, statusCode: " + f17 + " url: " + str);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMXp2pWrapper", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.MMXp2pWrapper", "xp2p Wrapper update video cache error " + str);
        }
        if (h2Var != null) {
            h2Var.disconnect();
        }
    }
}
