package lx;

/* loaded from: classes7.dex */
public final class u5 implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321973a;

    public u5(yz5.l lVar) {
        this.f321973a = lVar;
    }

    @Override // zq1.g0
    public boolean a(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo) {
        return false;
    }

    @Override // zq1.g0
    public void b(com.tencent.mm.plugin.brandservice.api.TransferResultInfo result) {
        kotlin.jvm.internal.o.g(result, "result");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList<r45.cw3> header = result.f93928f.f391637g;
        kotlin.jvm.internal.o.f(header, "header");
        for (r45.cw3 cw3Var : header) {
            hashMap.put(cw3Var.f371860d, cw3Var.f371861e);
        }
        boolean z17 = result.f93926d == 0 && result.f93928f.f391634d == 0;
        java.lang.String str = result.f93928f.f391635e;
        if (str == null) {
            str = result.f93927e;
        }
        this.f321973a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.biz.BizTransferResponse(z17, result.f93926d, str, result.f93928f.f391636f, hashMap))));
    }
}
