package kn4;

@j95.b
/* loaded from: classes12.dex */
public class i0 extends i95.w implements pf0.t, pf0.u {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f309709d = com.tencent.mm.sdk.platformtools.v9.a();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f309710e = new java.util.ArrayList();

    public final void Ai(java.lang.String str, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.Intent.ACTION_NET_STATS");
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        intent.putExtra("ui", str);
        intent.putExtra("opCode", i17);
        ((ku5.t0) ku5.t0.f312615d).h(new kn4.k0(this, intent), "TrafficMonitorBroadcast");
    }

    @Override // i95.w
    public void onCreate(final android.content.Context context) {
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: kn4.i0$$a
            @Override // java.lang.Runnable
            public final void run() {
                gp1.v Bi;
                kn4.i0 i0Var = kn4.i0.this;
                android.content.Context context2 = context;
                i0Var.getClass();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.tencent.mm.Intent.ACTION_NET_STATS");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                if (fp.h.a(33)) {
                    context2.registerReceiver(new com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver(), intentFilter);
                } else {
                    context2.registerReceiver(new com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver(), intentFilter, 2);
                }
                for (kn4.g0 g0Var : ((java.util.concurrent.ConcurrentHashMap) kn4.o0.b().f309735a).values()) {
                    synchronized (g0Var) {
                        if (!g0Var.f309697j) {
                            g0Var.f309697j = true;
                            g0Var.f309695h = new kn4.f0(g0Var);
                            try {
                                g0Var.f309696i = ((ku5.t0) ku5.t0.f312615d).d(g0Var.f309695h, 0L, g0Var.f309666b);
                            } catch (java.lang.IllegalArgumentException e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.TrafficInspector", "timer.schedule got an IllegalArgumentException, %s", e17.getMessage());
                            }
                        }
                    }
                }
                kn4.j0 j0Var = new kn4.j0(i0Var);
                if (fp.h.a(33)) {
                    context2.registerReceiver(j0Var, new android.content.IntentFilter("com.tencent.mm.Intent.ACTION_START_TRAFFIC_COLLECTOR"));
                } else {
                    context2.registerReceiver(j0Var, new android.content.IntentFilter("com.tencent.mm.Intent.ACTION_START_TRAFFIC_COLLECTOR"), 2);
                }
                kn4.v vVar = kn4.v.f309754a;
                pv.d0 d0Var = (pv.d0) i95.n0.c(pv.d0.class);
                if (d0Var == null || (Bi = ((ov.i0) d0Var).Bi()) == null) {
                    return;
                }
                Bi.a0(0, vVar);
            }
        });
    }

    public void wi(int i17, java.util.Map map, long j17) {
        java.util.List list = f309710e;
        synchronized (list) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ((pf0.s) it.next()).a(i17, map, j17);
            }
        }
    }
}
