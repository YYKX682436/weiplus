package rm;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrm/g0;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/brandService/SyncPhotoRequest;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class g0 implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.brandService.SyncPhotoRequest, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.mm.brandService.SyncPhotoRequest request = (com.tencent.mm.brandService.SyncPhotoRequest) obj;
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (request.f63628d) {
            com.tencent.wechat.iam.biz.l0.f217758c.n(rm.f0.f397371a);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.SyncPhotoSwitchTask", "disable sync photo, invalid");
        }
        callback.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
    }
}
