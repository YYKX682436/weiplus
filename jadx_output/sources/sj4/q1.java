package sj4;

/* loaded from: classes8.dex */
public final class q1 extends bi4.o0 {
    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        pj4.j0 j0Var = this.f21074b;
        if (j0Var == null || !kotlin.jvm.internal.o.b(j0Var.f355139d, "9")) {
            return false;
        }
        su4.j2 j2Var = new su4.j2();
        j2Var.f412938a = context;
        j2Var.f412939b = 92;
        try {
            byte[] decode = android.util.Base64.decode(j0Var.f355142g, 0);
            pj4.y1 y1Var = new pj4.y1();
            y1Var.parseFrom(decode);
            j2Var.f412941d = y1Var.f355344d;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("WebSearchStatusService", th6, "doJumpSource err", new java.lang.Object[0]);
        }
        u50.v vVar = (u50.v) i95.n0.c(u50.v.class);
        int i17 = j2Var.f412939b;
        ((s50.g0) vVar).getClass();
        j2Var.f412942e = o13.n.l(i17);
        j2Var.f412943f = true;
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        return true;
    }

    @Override // bi4.o0
    public boolean j() {
        return false;
    }

    @Override // bi4.o0
    public void n() {
    }
}
