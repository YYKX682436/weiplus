package ks1;

/* loaded from: classes7.dex */
public final class d implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ks1.g f311581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.api.TransferRequestInfo f311582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zq1.g0 f311583c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f311584d;

    public d(ks1.g gVar, com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo, zq1.g0 g0Var, kotlin.jvm.internal.c0 c0Var) {
        this.f311581a = gVar;
        this.f311582b = transferRequestInfo;
        this.f311583c = g0Var;
        this.f311584d = c0Var;
    }

    @Override // zq1.g0
    public boolean a(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo) {
        return false;
    }

    @Override // zq1.g0
    public void b(com.tencent.mm.plugin.brandservice.api.TransferResultInfo result) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(result, "result");
        r45.z24 z24Var = result.f93928f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[transferRequest-");
        sb6.append(this.f311581a.f());
        sb6.append("] onResult errCode: ");
        sb6.append(result.f93926d);
        sb6.append(", errMsg: ");
        sb6.append(result.f93927e);
        sb6.append(", result: ");
        sb6.append(z24Var != null ? java.lang.Integer.valueOf(z24Var.f391634d) : null);
        sb6.append(", isRetry: ");
        com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo = this.f311582b;
        sb6.append(transferRequestInfo.f93923q);
        sb6.append(", header.size: ");
        sb6.append((z24Var == null || (linkedList = z24Var.f391637g) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
        sb6.append(", resp_json: ");
        sb6.append(z24Var != null ? z24Var.f391636f : null);
        sb6.append(", errMsg: ");
        sb6.append(z24Var != null ? z24Var.f391635e : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTransferRequest", sb6.toString());
        result.f93929g = !this.f311584d.f310112d;
        result.f93930h = transferRequestInfo.f93923q;
        zq1.g0 g0Var = this.f311583c;
        if (g0Var != null) {
            g0Var.b(result);
        }
    }
}
