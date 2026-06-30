package md3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmd3/i;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/launch/MBJsApiHandleEcsAction$GetAbsoluteFilePathRequest;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/launch/MBJsApiHandleEcsAction$GetAbsoluteFilePathResult;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.vfs.r6 absoluteFile;
        com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$GetAbsoluteFilePathRequest mBJsApiHandleEcsAction$GetAbsoluteFilePathRequest = (com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$GetAbsoluteFilePathRequest) obj;
        if (mBJsApiHandleEcsAction$GetAbsoluteFilePathRequest != null && (str = mBJsApiHandleEcsAction$GetAbsoluteFilePathRequest.f148054d) != null) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 wi6 = ((com.tencent.mm.plugin.magicbrush.y5) ((com.tencent.mm.plugin.magicbrush.q4) i95.n0.c(com.tencent.mm.plugin.magicbrush.q4.class))).wi(str);
            if (wi6 == null || (absoluteFile = ((com.tencent.mm.plugin.magicbrush.fs.l) wi6).getAbsoluteFile(mBJsApiHandleEcsAction$GetAbsoluteFilePathRequest.f148055e)) == null || (str2 = absoluteFile.o()) == null) {
                str2 = "";
            }
            return new com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$GetAbsoluteFilePathResult(str2);
        }
        return new com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$GetAbsoluteFilePathResult(null);
    }
}
