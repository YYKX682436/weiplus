package im2;

/* loaded from: classes3.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(im2.z3 z3Var) {
        super(1);
        this.f292482d = z3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.h32 it = (r45.h32) obj;
        kotlin.jvm.internal.o.g(it, "it");
        im2.z3 z3Var = this.f292482d;
        java.lang.String str = z3Var.f292635d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("originSendType:");
        r45.vw4 vw4Var = z3Var.f292666x0;
        sb6.append(vw4Var != null ? java.lang.Integer.valueOf(vw4Var.f388624d) : null);
        sb6.append(" change send Type to: ");
        sb6.append(it.getInteger(18));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        r45.vw4 vw4Var2 = z3Var.f292666x0;
        if (!(vw4Var2 != null && it.getInteger(18) == vw4Var2.f388624d)) {
            z3Var.w7(r45.vw4.a(it.getInteger(18)));
            z3Var.f292652m2 = true;
            z3Var.R6();
        }
        return jz5.f0.f302826a;
    }
}
