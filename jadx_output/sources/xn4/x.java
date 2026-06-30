package xn4;

/* loaded from: classes11.dex */
public final class x implements com.tencent.mm.modelcdntran.q0 {
    @Override // com.tencent.mm.modelcdntran.q0
    public void a(com.tencent.mm.modelcdntran.n1 event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(event.f71105c);
        com.tencent.mm.modelcdntran.m1 m1Var = event.f71103a;
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateHelper", "CdnPLCJavaHelperListener %s %s", m1Var, valueOf);
        int ordinal = m1Var.ordinal();
        java.lang.String str = event.f71104b;
        if (ordinal != 0) {
            if (ordinal == 1) {
                dn.m mVar = event.f71106d;
                java.lang.String str2 = mVar != null ? mVar.field_fullpath : null;
                if (str2 == null) {
                    str2 = "";
                }
                if (android.text.TextUtils.isEmpty(str2)) {
                    xn4.c0.a(xn4.c0.f455604a, str, new xn4.v(event));
                }
                if (event.f71108f != null) {
                    xn4.c0.a(xn4.c0.f455604a, str, new xn4.w(event, str2));
                    return;
                }
                return;
            }
            if (ordinal == 2) {
                dn.g gVar = event.f71107e;
                if (gVar != null) {
                    kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0();
                    long j17 = gVar.field_finishedLength;
                    d0Var.f310114d = (j17 / gVar.field_toltalLength) * 100;
                    com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateHelper", "progress %s/%s percent:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(gVar.field_toltalLength), java.lang.Double.valueOf(d0Var.f310114d));
                    if (d0Var.f310114d < 0.0d) {
                        d0Var.f310114d = 0.0d;
                    }
                    if (d0Var.f310114d > 100.0d) {
                        d0Var.f310114d = 100.0d;
                    }
                    xn4.c0.a(xn4.c0.f455604a, str, new xn4.u(event, d0Var));
                    return;
                }
                return;
            }
            if (ordinal == 6 || ordinal == 7) {
                xn4.c0.a(xn4.c0.f455604a, str, new xn4.t(event));
                return;
            } else if (ordinal != 10) {
                return;
            }
        }
        xn4.c0.a(xn4.c0.f455604a, str, new xn4.s(event));
    }
}
