package sc3;

/* loaded from: classes7.dex */
public final class e1 implements h8.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406441a;

    public e1(sc3.k1 k1Var) {
        this.f406441a = k1Var;
    }

    @Override // h8.c
    public java.lang.String a() {
        return "appbrand_file";
    }

    @Override // h8.c
    public boolean accept(java.lang.Object obj) {
        return true;
    }

    @Override // h8.c
    public h8.b b(java.lang.Object obj, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig) {
        h8.b bVar = new h8.b();
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) obj;
        sc3.k1 k1Var = this.f406441a;
        com.tencent.mars.xlog.Log.i(k1Var.Q, "fetch data ".concat(str));
        bf3.g0 g0Var = bf3.g0.f19627a;
        jc3.x xVar = k1Var.f406486r;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("pkgManagement");
            throw null;
        }
        java.nio.ByteBuffer c17 = g0Var.c(xVar, str);
        if (c17 != null) {
            bVar.f279511a = new nf.a(c17);
        } else {
            com.tencent.mars.xlog.Log.e(k1Var.Q, "fetch " + str + " failed");
            bVar.f279512b = "Read file " + str + " failed";
        }
        return bVar;
    }
}
