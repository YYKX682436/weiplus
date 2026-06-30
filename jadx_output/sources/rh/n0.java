package rh;

/* loaded from: classes12.dex */
public class n0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wh.n1 f395463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f395464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f395465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f395466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f395467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rh.o0 f395468f;

    public n0(rh.o0 o0Var, wh.n1 n1Var, double d17, double d18, double d19, double d27) {
        this.f395468f = o0Var;
        this.f395463a = n1Var;
        this.f395464b = d17;
        this.f395465c = d18;
        this.f395466d = d19;
        this.f395467e = d27;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        rh.o0 o0Var = this.f395468f;
        rh.c1 c1Var = o0Var.f395482d;
        if (c1Var.f395329k == null || c1Var.f395334p == null) {
            return;
        }
        rh.n3 n3Var = (rh.n3) o2Var.f395486c;
        double longValue = ((java.lang.Long) n3Var.f395474h.f395552a).longValue();
        double d17 = this.f395464b;
        double longValue2 = ((java.lang.Long) n3Var.f395475i.f395552a).longValue();
        double d18 = this.f395465c;
        wh.n1 n1Var = this.f395463a;
        double e17 = ((n1Var.e("modem.controller.rx") / 3600000.0d) * ((long) ((longValue / (d17 / 8.0d)) * 1000.0d))) + 0.0d + ((n1Var.e("modem.controller.tx") / 3600000.0d) * ((long) ((longValue2 / (d18 / 8.0d)) * 1000.0d))) + ((n1Var.e("modem.controller.idle") / 3600000.0d) * (r12 + r4));
        uh.g gVar = o0Var.f395481c;
        gVar.f427681f.put("power-mobile-statByte", java.lang.Double.valueOf(e17));
        rh.n3 n3Var2 = (rh.n3) o2Var.f395486c;
        double e18 = n1Var.e("radio.active");
        if (e18 <= 0.0d) {
            double a17 = n1Var.a("modem.controller.rx") + 0.0d;
            int h17 = n1Var.h("modem.controller.tx");
            for (int i17 = 0; i17 < h17; i17++) {
                a17 += n1Var.b("modem.controller.tx", i17);
            }
            e18 = a17 / (h17 + 1);
        }
        gVar.f427681f.put("power-mobile-statPacket", java.lang.Double.valueOf(((((e18 / 3600.0d) / (((d17 + d18) / 8.0d) / 2048.0d)) / 3600.0d) * (((java.lang.Long) n3Var2.f395476j.f395552a).longValue() + ((java.lang.Long) n3Var2.f395477k.f395552a).longValue())) + 0.0d));
        double longValue3 = ((java.lang.Long) n3Var2.f395470d.f395552a).longValue();
        double d19 = this.f395466d;
        double longValue4 = ((java.lang.Long) n3Var2.f395471e.f395552a).longValue();
        double d27 = this.f395467e;
        gVar.f427681f.put("power-wifi-statByte", java.lang.Double.valueOf(((n1Var.e("wifi.controller.rx") / 3600000.0d) * ((long) ((longValue3 / (d19 / 8.0d)) * 1000.0d))) + 0.0d + ((n1Var.e("wifi.controller.tx") / 3600000.0d) * ((long) ((longValue4 / (d27 / 8.0d)) * 1000.0d))) + ((n1Var.e("wifi.controller.idle") / 3600000.0d) * (r10 + r4))));
        gVar.f427681f.put("power-wifi-statPacket", java.lang.Double.valueOf((((n1Var.e("wifi.active") / 3600.0d) / (((d19 + d27) / 8.0d) / 2048.0d)) * (((java.lang.Long) n3Var2.f395472f.f395552a).longValue() + ((java.lang.Long) n3Var2.f395473g.f395552a).longValue())) + 0.0d));
    }
}
