package com.tencent.mm.plugin.report.service;

/* loaded from: classes2.dex */
public final class a1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f158146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ch f158147b;

    public a1(java.util.Map.Entry entry, r45.ch chVar) {
        this.f158146a = entry;
        this.f158147b = chVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70616b == 0 && fVar.f70615a == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UserDataOperationReporter", "upload succ. day " + ((java.lang.Number) this.f158146a.getKey()).longValue() + ", size " + ((java.util.LinkedList) this.f158146a.getValue()).size());
            return jz5.f0.f302826a;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.UserDataOperationReporter", "upload err. day " + ((java.lang.Number) this.f158146a.getKey()).longValue() + ". errCode:" + fVar.f70616b + " errType:" + fVar.f70615a + " errMsg:" + fVar.f70617c);
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.report.service.z0 z0Var = new com.tencent.mm.plugin.report.service.z0(this.f158147b, this.f158146a);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        return t0Var.l(z0Var, 0L, "MicroMsg.UserDataOperationReporter");
    }
}
