package o71;

@j95.b
/* loaded from: classes12.dex */
public final class b extends i95.w implements ct.o2 {
    public void wi(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        o71.l.Bi().g();
        s71.a aVar = o71.l.Bi().f360339a;
        java.util.LinkedList linkedList = aVar != null ? aVar.f403969d : null;
        if (!(linkedList == null || linkedList.isEmpty())) {
            callback.invoke(linkedList);
            return;
        }
        com.tencent.mm.autogen.events.RcptRecentAddrEvent rcptRecentAddrEvent = new com.tencent.mm.autogen.events.RcptRecentAddrEvent();
        rcptRecentAddrEvent.f54644h.f7253a = Integer.MAX_VALUE;
        rcptRecentAddrEvent.f192364d = new o71.a(rcptRecentAddrEvent, callback);
        rcptRecentAddrEvent.b(android.os.Looper.getMainLooper());
    }
}
