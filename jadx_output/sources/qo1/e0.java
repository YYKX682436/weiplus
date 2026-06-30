package qo1;

/* loaded from: classes5.dex */
public final class e0 implements com.tencent.wechat.aff.affroam.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f365470a;

    public e0(qo1.f0 f0Var) {
        this.f365470a = f0Var;
    }

    @Override // com.tencent.wechat.aff.affroam.y1
    public final void complete(int i17) {
        qo1.i0 a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "[!] Task stop ret = " + i17 + ", pkgId=" + this.f365470a.f365483i);
        qo1.h0 h0Var = qo1.i0.f365501e;
        com.tencent.wechat.aff.affroam.z a18 = com.tencent.wechat.aff.affroam.z.a(i17);
        if (a18 == null) {
            h0Var.getClass();
            a17 = qo1.i0.f365512s;
        } else {
            a17 = h0Var.a(a18);
        }
        com.tencent.wechat.aff.affroam.n0 n0Var = a17 == qo1.i0.f365502f ? com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_STOPPED : com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_ERROR;
        ku5.u0 u0Var = ku5.t0.f312615d;
        qo1.f0 f0Var = this.f365470a;
        ((ku5.t0) u0Var).h(new qo1.d0(f0Var, n0Var, a17), f0Var.n());
    }
}
