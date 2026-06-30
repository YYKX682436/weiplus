package ky0;

/* loaded from: classes5.dex */
public final class c extends com.tencent.mm.sdk.event.n {
    public c() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BypCommonBizAIMediaGenerateCompleteEvent event = (com.tencent.mm.autogen.events.BypCommonBizAIMediaGenerateCompleteEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.BypCommonBizAIMediaGenerateCompleteEvent", "Received a BypCommonBizWebSearchRedDotEvent");
        ky0.b bVar = ky0.b.f313452a;
        boolean z17 = event.f54015g.f6625a;
        synchronized (bVar) {
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) ky0.b.f313453b).get(z17 ? ky0.a.f313449d : ky0.a.f313450e);
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((yz5.a) it.next()).invoke();
                }
            }
        }
        return true;
    }
}
