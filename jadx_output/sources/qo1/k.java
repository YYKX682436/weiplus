package qo1;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f365526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qo1.f0 f0Var) {
        super(1);
        this.f365526d = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        qo1.i0 a17;
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "[+] Do task complete, ret=" + intValue + ", packageId=" + this.f365526d.f365483i + ", isResume=" + this.f365526d.f365490p);
        if (intValue != 0) {
            qo1.h0 h0Var = qo1.i0.f365501e;
            com.tencent.wechat.aff.affroam.z a18 = com.tencent.wechat.aff.affroam.z.a(intValue);
            if (a18 == null) {
                h0Var.getClass();
                a17 = qo1.i0.f365512s;
            } else {
                a17 = h0Var.a(a18);
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            qo1.f0 f0Var = this.f365526d;
            ((ku5.t0) u0Var).h(new qo1.j(f0Var, a17), f0Var.n());
        }
        return jz5.f0.f302826a;
    }
}
