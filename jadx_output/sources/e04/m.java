package e04;

/* loaded from: classes9.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f246022d;

    public m(java.lang.Object obj) {
        this.f246022d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj = this.f246022d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.util.List<java.lang.String> f07 = r26.n0.f0((java.lang.String) obj, new java.lang.String[]{","}, false, 0, 6, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineScanManager", "notifyMessage localStr: %d, context size: %d", java.lang.Integer.valueOf(((java.lang.String) obj).length()), java.lang.Integer.valueOf(f07.size()));
        for (java.lang.String str : f07) {
            if (str.length() > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineScanManager", "insertOfflineScanMessage");
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.u1("notifymessage");
                f9Var.j1(0);
                f9Var.r1(3);
                f9Var.setType(721420337);
                f9Var.e1(c01.w9.p());
                f9Var.d1(str);
                c01.w9.x(f9Var);
                com.tencent.mm.autogen.events.AppMsgInsertEvent appMsgInsertEvent = new com.tencent.mm.autogen.events.AppMsgInsertEvent();
                appMsgInsertEvent.f53988g.f6201a = f9Var;
                appMsgInsertEvent.e();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineScanManager", "notifyOfflineScanMessage context is empty, ignore");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineScanManager", "clearOfflineScanMessage");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_OFFLINE_SCAN_LOCAL_STORAGE_STRING_SYNC, null);
    }
}
