package com.tencent.mm.vending.base;

/* loaded from: classes16.dex */
public class o extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vending.base.r f212652a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.vending.base.r rVar, android.os.Looper looper) {
        super(looper);
        this.f212652a = rVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        boolean loadFromVending;
        if (this.f212652a.f212658c.get()) {
            com.tencent.mm.vending.base.Vending vending = ((com.tencent.mm.vending.base.h) this.f212652a.f212657b).f212648a;
            vending.loaderClear();
            vending.deadlock();
            return;
        }
        java.lang.Object obj = message.obj;
        com.tencent.mm.vending.base.Vending vending2 = ((com.tencent.mm.vending.base.h) this.f212652a.f212657b).f212648a;
        com.tencent.mm.vending.base.u lock = vending2.getLock(obj);
        loadFromVending = vending2.loadFromVending(lock, obj);
        if (!lock.f212669g && !loadFromVending) {
            vending2.notifyDataLoadedIfNeed(lock);
        }
        synchronized (this.f212652a.f212659d) {
            this.f212652a.f212656a.put(obj, com.tencent.mm.vending.base.q.FILLED);
        }
    }
}
