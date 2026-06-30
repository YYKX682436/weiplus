package e13;

@j95.b
/* loaded from: classes8.dex */
public class e extends i95.w {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) ((h13.l0) i95.n0.c(h13.l0.class)).f278144g).getValue()).post(h13.k0.f278138d);
        j13.a aVar = j13.a.f297177d;
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyStorage", "deleteGameLife()");
        if (j13.a.f297178e.delete("ForceNotifyData", "UserName like ? ", new java.lang.String[]{"%@gamelifesess"}) > 0) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = j13.a.f297179f;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                java.lang.String field_UserName = ((i13.j) entry.getValue()).field_UserName;
                kotlin.jvm.internal.o.f(field_UserName, "field_UserName");
                if (r26.i0.n(field_UserName, "@gamelifesess", false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                concurrentHashMap.remove(((i13.j) ((java.util.Map.Entry) it.next()).getValue()).field_ForcePushId);
            }
            aVar.doNotify();
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        ((h13.l0) i95.n0.c(h13.l0.class)).getClass();
    }
}
