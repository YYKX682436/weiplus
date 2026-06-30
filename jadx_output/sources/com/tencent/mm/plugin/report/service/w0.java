package com.tencent.mm.plugin.report.service;

/* loaded from: classes2.dex */
public final class w0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.report.service.w0 f158319a = new com.tencent.mm.plugin.report.service.w0();

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70616b == 0 && fVar.f70615a == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload succ. size:");
            com.tencent.mm.plugin.report.service.b1 b1Var = com.tencent.mm.plugin.report.service.b1.f158148a;
            sb6.append(b1Var.e().f371548d.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.UserDataOperationReporter", sb6.toString());
            b1Var.e().f371548d = new java.util.LinkedList();
            b1Var.g();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.UserDataOperationReporter", "upload err.");
        }
        return jz5.f0.f302826a;
    }
}
