package ni3;

/* loaded from: classes12.dex */
public class d2 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni3.g2 f337563a;

    public d2(ni3.g2 g2Var) {
        this.f337563a = g2Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        action.getClass();
        char c17 = 65535;
        switch (action.hashCode()) {
            case -2128145023:
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1454123155:
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    c17 = 2;
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                this.f337563a.f337595t = false;
                break;
            case 1:
                this.f337563a.f337594s = false;
                break;
            case 2:
                this.f337563a.f337595t = true;
                break;
            case 3:
                this.f337563a.f337594s = true;
                break;
        }
        boolean z17 = this.f337563a.f337595t;
        boolean z18 = this.f337563a.f337594s;
        long j17 = this.f337563a.f337596u;
        wu5.b bVar = this.f337563a.f337597v;
        boolean a17 = z65.c.a() & false;
        ni3.g2 g2Var = this.f337563a;
        wu5.b bVar2 = g2Var.f337597v;
        if (bVar2 != null || ((!g2Var.f337594s || g2Var.f337595t) && !a17)) {
            if (bVar2 != null) {
                bVar2.b();
                ni3.g2 g2Var2 = this.f337563a;
                g2Var2.f337597v = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan remove[%s]", g2Var2.f337598w);
                return;
            }
            ni3.c1 c1Var = g2Var.f337598w;
            if (c1Var != null) {
                c1Var.f337553j = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan canceled[%s]", c1Var);
                this.f337563a.f337598w = null;
                return;
            }
            return;
        }
        if (z65.c.a()) {
            this.f337563a.f337591p = 0L;
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ni3.g2 g2Var3 = this.f337563a;
            long j18 = currentTimeMillis - g2Var3.f337596u;
            long j19 = g2Var3.f337590o;
            if (j18 < j19 * 60000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv last scan time not matched in [%d]min", java.lang.Long.valueOf(j19));
                return;
            }
        }
        this.f337563a.f337597v = new ni3.c2(this, new ni3.b2(this));
        ku5.u0 u0Var = ku5.t0.f312615d;
        ni3.g2 g2Var4 = this.f337563a;
        ((ku5.t0) u0Var).l(g2Var4.f337597v, g2Var4.f337591p * 60000, "MicroMsg.SubCoreBaseMonitor");
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan post delay[%d]min", java.lang.Long.valueOf(this.f337563a.f337591p));
    }
}
