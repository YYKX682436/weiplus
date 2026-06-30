package rh;

/* loaded from: classes12.dex */
public class p1 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.d2 f395492a;

    public p1(rh.d2 d2Var) {
        this.f395492a = d2Var;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        java.lang.String str;
        rh.d2 d2Var = this.f395492a;
        int intValue = ((java.lang.Integer) obj).intValue();
        d2Var.getClass();
        wh.k kVar = (wh.k) wh.m.t();
        synchronized (kVar) {
            kVar.f445819d = new wh.h(java.lang.Integer.valueOf(intValue), 5000);
        }
        synchronized ("Matrix.battery.DeviceStatusMonitorFeature") {
            if (d2Var.f395361c != java.util.Collections.EMPTY_LIST) {
                switch (intValue) {
                    case 1:
                        str = "charging";
                        break;
                    case 2:
                        str = "non_charge";
                        break;
                    case 3:
                        str = "screen_off";
                        break;
                    case 4:
                        str = "standby_on";
                        break;
                    case 5:
                        str = "screen_on";
                        break;
                    case 6:
                        str = "standby_off";
                        break;
                    case 7:
                        str = "doze_on";
                        break;
                    case 8:
                        str = "doze_off";
                        break;
                    default:
                        str = com.eclipsesource.mmv8.Platform.UNKNOWN;
                        break;
                }
                oj.j.c("Matrix.battery.LifeCycle", "onStat >> ".concat(str), new java.lang.Object[0]);
                d2Var.f395361c.add(0, new wh.f2(java.lang.String.valueOf(intValue)));
                android.os.Handler handler = d2Var.f395294a.f363337f;
                java.lang.Runnable runnable = d2Var.f395362d;
                handler.removeCallbacks(runnable);
                d2Var.f395294a.f363337f.postDelayed(runnable, 1000L);
            }
        }
    }
}
