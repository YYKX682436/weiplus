package md3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmd3/f;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/launch/MBJsApiHandleEcsAction$AllocTempFileRequest;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/launch/MBJsApiHandleEcsAction$AllocTempFileResult;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.vfs.r6 allocTempFile;
        com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileRequest mBJsApiHandleEcsAction$AllocTempFileRequest = (com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileRequest) obj;
        java.lang.String str2 = null;
        if (mBJsApiHandleEcsAction$AllocTempFileRequest != null && (str = mBJsApiHandleEcsAction$AllocTempFileRequest.f148051d) != null) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 wi6 = ((com.tencent.mm.plugin.magicbrush.y5) ((com.tencent.mm.plugin.magicbrush.q4) i95.n0.c(com.tencent.mm.plugin.magicbrush.q4.class))).wi(str);
            if (wi6 != null && (allocTempFile = ((com.tencent.mm.plugin.magicbrush.fs.j) wi6).allocTempFile(mBJsApiHandleEcsAction$AllocTempFileRequest.f148052e)) != null) {
                str2 = allocTempFile.o();
            }
            return new com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileResult(str2);
        }
        return new com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileResult(null);
    }
}
