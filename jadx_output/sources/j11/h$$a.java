package j11;

/* loaded from: classes8.dex */
public final /* synthetic */ class h$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.z3 n17;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "Start post recovery.");
        java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().q(java.util.Collections.emptyList())).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (str.endsWith("@chatroom") && ((n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true)) == null || (com.tencent.mm.sdk.platformtools.t8.K0(n17.P0()) && com.tencent.mm.sdk.platformtools.t8.K0(n17.w0())))) {
                final java.lang.Object obj = new java.lang.Object();
                c01.o8 o8Var = new c01.o8() { // from class: j11.h$$c
                    @Override // c01.o8
                    public final void a(java.lang.String str2, boolean z17) {
                        java.lang.Object obj2 = obj;
                        synchronized (obj2) {
                            obj2.notifyAll();
                        }
                    }
                };
                com.tencent.mars.xlog.Log.w("MicroMsg.GetContactService", "Chatroom nickname missing, go pull: ".concat(str));
                ((c01.k7) c01.n8.a()).b(str, 6, o8Var);
                synchronized (obj) {
                    try {
                        obj.wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
        }
        gm0.j1.u().c().z(92, 0);
    }
}
