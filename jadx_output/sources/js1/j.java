package js1;

/* loaded from: classes7.dex */
public final class j implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f301490a;

    public j(com.tencent.mm.ipcinvoker.r rVar) {
        this.f301490a = rVar;
    }

    @Override // zq1.g0
    public boolean a(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo) {
        return false;
    }

    @Override // zq1.g0
    public void b(com.tencent.mm.plugin.brandservice.api.TransferResultInfo result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.ipcinvoker.r rVar = this.f301490a;
        if (rVar != null) {
            rVar.a(result);
        }
    }
}
