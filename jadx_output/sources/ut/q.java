package ut;

/* loaded from: classes12.dex */
public final class q implements com.tencent.mm.modelcdntran.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430710a;

    public q(ut.q0 q0Var) {
        this.f430710a = q0Var;
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void b(com.tencent.mm.modelcdntran.n1 n1Var) {
        if (n1Var != null) {
            if (n1Var.f71103a == com.tencent.mm.modelcdntran.m1.f71077f) {
                ut.q0 q0Var = this.f430710a;
                java.lang.Integer e17 = qi3.c.e(q0Var, false, 1, null);
                if (e17 != null) {
                    e17.intValue();
                    sx.b0 b0Var = (sx.b0) i95.n0.c(sx.b0.class);
                    dn.m mVar = n1Var.f71106d;
                    java.lang.String str = mVar != null ? mVar.field_mediaId : null;
                    if (str == null) {
                        str = "";
                    }
                    ((rx.f) b0Var).Ai(str);
                    e17.intValue();
                    return;
                }
                if (q0Var.f363677f == qi3.g0.f363709h) {
                    dn.g gVar = n1Var.f71107e;
                    float f17 = gVar != null ? (float) gVar.field_finishedLength : 0.0f;
                    if (gVar != null) {
                        java.lang.Long valueOf = java.lang.Long.valueOf(gVar.field_toltalLength);
                        java.lang.Long l17 = valueOf.longValue() != 0 ? valueOf : null;
                        if (l17 != null) {
                            float longValue = (float) l17.longValue();
                            if (f17 < longValue) {
                                q0Var.d0(((f17 / longValue) * 20.0f) + 20.0f, true);
                            }
                        }
                    }
                }
            }
        }
    }
}
