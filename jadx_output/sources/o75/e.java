package o75;

/* loaded from: classes11.dex */
public final class e extends e75.g implements a75.b {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f343593a = jz5.h.b(new o75.d(this));

    @Override // e75.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void notify(o75.c event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier storagePendingEventNotifier = (com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier) ((jz5.n) this.f343593a).getValue();
        storagePendingEventNotifier.getClass();
        storagePendingEventNotifier.a().sendMessage(storagePendingEventNotifier.a().obtainMessage(1, 1, 0, event));
    }

    @Override // e75.g
    public java.lang.String getLogTag() {
        return "MicroMsg.Mvvm.StorageObserverOwner@" + hashCode();
    }

    @Override // a75.b
    public void handleEvent(java.util.List eventList) {
        o75.c cVar;
        kotlin.jvm.internal.o.g(eventList, "eventList");
        if (eventList.size() == 1) {
            cVar = (o75.c) eventList.get(0);
        } else {
            if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                getLogTag();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(eventList, 10));
                java.util.Iterator it = eventList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((o75.c) it.next()).f343588b);
                }
                arrayList.toString();
            }
            o75.b bVar = o75.b.f343581b;
            o75.c cVar2 = new o75.c(o75.b.f343585f, "BATCH_PENDING_KEY", getLogTag());
            cVar2.f343591e = new java.util.HashMap();
            java.util.Iterator it6 = eventList.iterator();
            while (it6.hasNext()) {
                o75.c cVar3 = (o75.c) it6.next();
                java.util.HashMap hashMap = cVar2.f343591e;
                if (hashMap != null) {
                }
            }
            cVar = cVar2;
        }
        super.notify(kz5.b0.c(cVar));
    }

    @Override // e75.g
    public void notify(java.util.List eventList) {
        kotlin.jvm.internal.o.g(eventList, "eventList");
        o75.b bVar = o75.b.f343581b;
        o75.c cVar = new o75.c(o75.b.f343585f, "BATCH_PENDING_KEY", getLogTag());
        cVar.f343591e = new java.util.HashMap();
        java.util.Iterator it = eventList.iterator();
        while (it.hasNext()) {
            o75.c cVar2 = (o75.c) it.next();
            java.util.HashMap hashMap = cVar.f343591e;
            if (hashMap != null) {
            }
        }
        notify(cVar);
    }
}
