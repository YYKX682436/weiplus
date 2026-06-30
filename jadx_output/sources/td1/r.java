package td1;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltd1/r;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class r implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCVoid, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateCommonUsedList", "fetchNextPageFromServer");
        if (!com.tencent.mm.plugin.appbrand.appusage.j0.f()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateCommonUsedList", "not support fetch common used we app");
            return;
        }
        ft.j jVar = (ft.j) i95.n0.c(ft.j.class);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((com.tencent.mm.feature.appbrand.support.c0) jVar).getClass();
        com.tencent.mm.plugin.appbrand.appusage.c1.z0().s0(currentTimeMillis, true, null, 10, 0);
    }
}
