package com.tencent.mm.plugin.zero;

@j95.b
/* loaded from: classes12.dex */
public class x0 extends i95.w implements c25.f {

    /* renamed from: d, reason: collision with root package name */
    public c01.wc f188688d;

    /* renamed from: e, reason: collision with root package name */
    public volatile w11.d2 f188689e;

    public w11.d2 Ai() {
        gm0.j1.b().c();
        if (this.f188689e == null) {
            synchronized (com.tencent.mm.plugin.zero.x0.class) {
                if (this.f188689e == null) {
                    this.f188689e = new w11.d2();
                }
            }
        }
        return this.f188689e;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        if (this.f188689e != null) {
            w11.d2 d2Var = this.f188689e;
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) d2Var.f442000b;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(concurrentLinkedQueue.size());
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = (java.util.concurrent.ConcurrentLinkedQueue) d2Var.f442001c;
            com.tencent.mars.xlog.Log.i("MicroMsg.SyncService", "clear synclist:%s notify:%s running:%s", valueOf, java.lang.Integer.valueOf(concurrentLinkedQueue2.size()), d2Var.f442003e);
            concurrentLinkedQueue.clear();
            concurrentLinkedQueue2.clear();
        }
        c01.wc wcVar = this.f188688d;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    public c01.wc wi() {
        gm0.j1.b().c();
        if (this.f188688d == null) {
            this.f188688d = new c01.wc(new com.tencent.mm.plugin.zero.w0(this));
        }
        return this.f188688d;
    }
}
