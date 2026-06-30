package j00;

@j95.b
/* loaded from: classes9.dex */
public final class o extends i95.w implements c00.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f296845d = new java.util.concurrent.ConcurrentHashMap();

    public void Ai(java.lang.String str, bw5.j8 eventType, bw5.i8 info) {
        kotlin.jvm.internal.o.g(eventType, "eventType");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftEventService", "triggerEcsOpenEventActionWithId, eventId:" + str);
        yz5.p pVar = (yz5.p) kotlin.jvm.internal.m0.c(this.f296845d).remove(str);
        if (pVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftEventService", "triggerEcsOpenEventActionWithId:" + str + ", event action not find.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftEventService", "triggerEcsOpenEventActionWithId:" + str + ", find event action, type:" + eventType);
        pVar.invoke(eventType, info);
    }

    public java.lang.String wi(yz5.p pVar) {
        if (pVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftEventService", "eventAction is null");
            return "";
        }
        java.lang.String str = "openecs_" + java.util.UUID.randomUUID();
        this.f296845d.put(str, pVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftEventService", "add eventId:" + str + " to map");
        return str;
    }
}
