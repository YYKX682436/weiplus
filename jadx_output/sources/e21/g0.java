package e21;

/* loaded from: classes11.dex */
public class g0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e21.l0 f246522d;

    public g0(e21.l0 l0Var) {
        this.f246522d = l0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OplogService", "summeroplog pusherTry onTimerExpired tryStartNetscene");
        e21.l0 l0Var = this.f246522d;
        l0Var.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (l0Var.f246541d && currentTimeMillis - l0Var.f246548n > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            l0Var.f246541d = false;
        }
        if (l0Var.f246541d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OplogService", "summeroplog tryStartNetscene netSceneRunning, return.");
        } else {
            java.util.List n07 = l0Var.b().n0(20);
            java.util.ArrayList arrayList = (java.util.ArrayList) n07;
            if (arrayList.size() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OplogService", "summeroplog tryStartNetscene list null ret");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.OplogService", "tryStartNetscene list size:%d, total:%d", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(l0Var.b().getCount()));
                if (!l0Var.f246541d && arrayList.size() > 0) {
                    l0Var.f246548n = currentTimeMillis;
                    l0Var.f246541d = true;
                    java.util.LinkedList<xg3.q0> linkedList = new java.util.LinkedList();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        xg3.q0 q0Var = (xg3.q0) it.next();
                        if (q0Var.b() == 0 && q0Var.f454427f > 0) {
                            linkedList.add(q0Var);
                        }
                    }
                    arrayList.removeAll(linkedList);
                    for (xg3.q0 q0Var2 : linkedList) {
                        if ("@openim".equals(q0Var2.f454429h)) {
                            gm0.j1.i();
                            gm0.j1.n().f273288b.g(new l41.c0(q0Var2));
                        } else if ("@byp".equals(q0Var2.f454429h)) {
                            gm0.j1.i();
                            gm0.j1.n().f273288b.g(new it1.a(q0Var2));
                        } else {
                            l0Var.b().m0(q0Var2);
                            l0Var.f246547m.c(q0Var2, null, l0Var.b().getCount(), e21.x.f246596f);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        e21.j jVar = new e21.j(n07);
                        gm0.j1.i();
                        gm0.j1.n().f273288b.g(jVar);
                        com.tencent.mars.xlog.Log.i("MicroMsg.OplogService", "doScene[%s], list size=%d", java.lang.Integer.valueOf(jVar.hashCode()), java.lang.Integer.valueOf(arrayList.size()));
                    }
                }
                java.lang.System.currentTimeMillis();
                arrayList.size();
            }
        }
        return false;
    }

    public java.lang.String toString() {
        return super.toString() + "|pusherTry";
    }
}
