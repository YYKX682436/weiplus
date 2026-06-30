package dk2;

/* loaded from: classes3.dex */
public final class y7 extends dk2.t4 {

    /* renamed from: b, reason: collision with root package name */
    public int f234375b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (getType() != 20111) {
            return null;
        }
        r45.pj1 pj1Var = new r45.pj1();
        com.tencent.mm.protobuf.g byteString = this.f234101a.getByteString(4);
        pj1Var.parseFrom(byteString != null ? byteString.g() : null);
        return pj1Var;
    }

    @Override // dk2.zf
    public boolean isValid() {
        java.lang.Object D = D();
        r45.pj1 pj1Var = D instanceof r45.pj1 ? (r45.pj1) D : null;
        if (pj1Var == null) {
            return false;
        }
        if (pj1Var.getInteger(5) == 1) {
            xt2.a0 a0Var = xt2.a0.f456611a;
            r45.y23 y23Var = (r45.y23) pj1Var.getCustom(0);
            boolean c17 = a0Var.c(y23Var != null ? y23Var.getLong(0) : 0L, (r45.n32) pj1Var.getCustom(4), "notification");
            mm2.f6 f6Var = (mm2.f6) dk2.ef.f233372a.i(mm2.f6.class);
            so2.j5 j5Var = f6Var != null ? f6Var.f329049w : null;
            cm2.m0 m0Var = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
            r45.y23 y23Var2 = (r45.y23) pj1Var.getCustom(0);
            boolean z17 = !kotlin.jvm.internal.o.b(y23Var2 != null ? java.lang.Long.valueOf(y23Var2.getLong(0)) : null, m0Var != null ? java.lang.Long.valueOf(m0Var.f43369w) : null);
            if (!c17 || !z17) {
                return false;
            }
        }
        return true;
    }
}
