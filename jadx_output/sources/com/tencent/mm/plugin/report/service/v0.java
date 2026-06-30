package com.tencent.mm.plugin.report.service;

/* loaded from: classes2.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.report.service.v0 f158318d = new com.tencent.mm.plugin.report.service.v0();

    public v0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.ch chVar = new r45.ch();
        try {
            com.tencent.mm.plugin.report.service.b1 b1Var = com.tencent.mm.plugin.report.service.b1.f158148a;
            chVar.parseFrom(((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.mm.plugin.report.service.b1.f158149b).getValue()).j("userdatalistitem"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UserDataOperationReporter", e17, null, new java.lang.Object[0]);
        }
        java.util.LinkedList linkedList = chVar.f371548d;
        if (linkedList == null || linkedList.size() > 10000) {
            chVar.f371548d = new java.util.LinkedList();
        }
        return chVar;
    }
}
