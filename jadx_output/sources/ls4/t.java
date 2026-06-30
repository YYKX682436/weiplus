package ls4;

/* loaded from: classes8.dex */
public final class t implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.u f321098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.fc5 f321099b;

    public t(ls4.u uVar, r45.fc5 fc5Var) {
        this.f321098a = uVar;
        this.f321099b = fc5Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.ns5 ns5Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("WeCoinConsumeLogic", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        r45.m80 m80Var = (r45.m80) fVar.f70618d;
        boolean g17 = os4.h.g(fVar);
        jz5.f0 f0Var = jz5.f0.f302826a;
        ls4.u uVar = this.f321098a;
        if (!g17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 74);
            com.tencent.mars.xlog.Log.i("WeCoinConsumeLogic", "success, balance: %s", java.lang.Long.valueOf(m80Var.f380228d));
            os4.h.l(m80Var.f380228d);
            long j17 = m80Var.f380228d;
            uVar.getClass();
            com.tencent.mars.xlog.Log.i("WeCoinConsumeLogic", ya.b.SUCCESS);
            uVar.e();
            uVar.f321100a.f358022c.invoke(new pr4.b(j17));
            return f0Var;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 75);
        int i17 = fVar.f70616b;
        if (i17 == 10001 && m80Var != null && (ns5Var = m80Var.f380229e) != null) {
            com.tencent.mars.xlog.Log.i("WeCoinConsumeLogic", "retry, retry time: %s", java.lang.Integer.valueOf(ns5Var.f381652d));
            return kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new ls4.s(m80Var, uVar, this.f321099b, null), 3, null);
        }
        if (i17 == 10003) {
            uVar.d(new pr4.a(pr4.j.f358013e));
            return f0Var;
        }
        uVar.d(new pr4.a(pr4.j.f358012d));
        return f0Var;
    }
}
