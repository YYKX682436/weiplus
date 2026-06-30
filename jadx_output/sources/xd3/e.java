package xd3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxd3/e;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/plugin/magicbrush/texture/IPCMBExternalInputData;", "Lcom/tencent/mm/plugin/magicbrush/texture/IPCMBExternalCallbackData;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class e implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.Object obj2;
        com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data = (com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.util.List list = xd3.b.f453615a;
        ve3.u action = data.f148162d;
        kotlin.jvm.internal.o.g(action, "action");
        java.util.Iterator it = ((java.util.ArrayList) xd3.b.f453615a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((xd3.a) obj2).a(action)) {
                    break;
                }
            }
        }
        xd3.a aVar = (xd3.a) obj2;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MB_External_surface_action", "no handler found data: " + data);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData(-1, "action invalid", null, 4, null));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MB_External_surface_action", "find handler: " + aVar.getClass().getSimpleName() + " data: " + data);
        xd3.d dVar = (xd3.d) aVar;
        try {
            dVar.f(action, data, rVar);
            dVar.c(action, data, rVar);
        } catch (java.lang.Exception e17) {
            dVar.e(rVar, -1, "Handler failed: " + e17.getMessage());
        }
    }
}
