package js1;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ljs1/k;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/brandservice/api/TransferRequestInfo;", "Lcom/tencent/mm/plugin/brandservice/api/TransferResultInfo;", "<init>", "()V", "js1/i", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class k implements com.tencent.mm.ipcinvoker.j {
    static {
        new js1.i(null);
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo = (com.tencent.mm.plugin.brandservice.api.TransferRequestInfo) obj;
        if (transferRequestInfo != null) {
            kotlinx.coroutines.l.d(js1.m.f301492d, null, null, new js1.h(transferRequestInfo, new js1.j(rVar), null), 3, null);
        } else if (rVar != null) {
            com.tencent.mm.plugin.brandservice.api.TransferResultInfo transferResultInfo = new com.tencent.mm.plugin.brandservice.api.TransferResultInfo();
            transferResultInfo.f93926d = 1;
            transferResultInfo.f93927e = "request invalid";
            rVar.a(transferResultInfo);
        }
    }
}
