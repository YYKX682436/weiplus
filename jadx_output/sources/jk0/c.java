package jk0;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljk0/c;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipc/GetSimpleDnsRequest;", "Lcom/tencent/mm/ipc/GetSimpleDnsResponse;", "<init>", "()V", "feature-cronet_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class c implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.util.ArrayList<java.lang.String> host;
        com.tencent.mm.ipc.GetSimpleDnsRequest request = (com.tencent.mm.ipc.GetSimpleDnsRequest) obj;
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.mmdns.MMDnsManager mMDnsManager = (com.tencent.mars.mmdns.MMDnsManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.mmdns.MMDnsManager.class);
        java.lang.String str = request.f68319d;
        if (mMDnsManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCSyncTask_GetSimpleDns", "MMDnsManager is null, cannot process DNS request for host: " + str);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipc.GetSimpleDnsResponse(new java.util.ArrayList()));
                return;
            }
            return;
        }
        if (request.f68323h) {
            host = mMDnsManager.getHostWithParam(str, request.f68320e, request.f68321f, request.f68322g);
        } else {
            host = mMDnsManager.getHost(str);
        }
        if (host == null) {
            host = new java.util.ArrayList<>();
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipc.GetSimpleDnsResponse(host));
        }
    }
}
