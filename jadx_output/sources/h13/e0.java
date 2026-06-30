package h13;

/* loaded from: classes10.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h13.l0 f278123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j4 f278124e;

    public e0(h13.l0 l0Var, r45.j4 j4Var) {
        this.f278123d = l0Var;
        this.f278124e = j4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h13.l0 l0Var = this.f278123d;
        l0Var.getClass();
        boolean z17 = c01.id.c() - l0Var.f278143f > 1800000;
        if (z17) {
            l0Var.f278143f = c01.id.c();
        }
        if (z17) {
            j13.a.f297177d.y0();
        }
        l0Var.getClass();
        r45.j4 j4Var = this.f278124e;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(j4Var.f377566p, "ForcePushId", null);
        java.lang.String str = d17 != null ? (java.lang.String) d17.get(".ForcePushId") : null;
        if (str != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "received msg! MsgSource:%s FromUserName:%s source:%s", j4Var.f377566p, j4Var.f377558e, str);
            java.lang.String g17 = x51.j1.g(j4Var.f377558e);
            boolean b17 = kotlin.jvm.internal.o.b(c01.z1.r(), g17);
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = l0Var.f278146i;
            if (b17 || concurrentLinkedQueue.contains(g17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ForceNotifyService", "ERROR! no show! notifyList=" + concurrentLinkedQueue);
            } else if (l0Var.Ni(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "fromUser=" + g17 + " isNeedNotify=true");
                i13.j z07 = j13.a.f297177d.z0(str);
                if (z07 != null) {
                    l0Var.f278145h.post(new h13.g0(l0Var, z07));
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.ForceNotifyService", "ERROR! no show!");
            }
        }
        l0Var.getClass();
        i13.o bj6 = l0Var.bj(x51.j1.g(j4Var.f377561h));
        if (bj6 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ForceNotifyService", "ERROR! no show!");
            return;
        }
        java.lang.String str2 = bj6.f287275d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "receive msg! livePushId:%s", str2);
        if (l0Var.Ni(str2)) {
            l0Var.f278145h.post(new h13.f0(l0Var, bj6));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ForceNotifyService", "ERROR! no show!");
        }
    }
}
