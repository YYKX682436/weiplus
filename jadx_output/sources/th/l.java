package th;

/* loaded from: classes12.dex */
public class l implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f419256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f419257b;

    public l(th.n nVar, rh.o2 o2Var, java.util.Map map) {
        this.f419256a = o2Var;
        this.f419257b = map;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        rh.o2 o2Var2 = this.f419256a;
        if (((uh.g) o2Var2.f395486c).f427681f.containsKey("power-mobile-statByte")) {
            java.lang.Object obj2 = ((uh.g) o2Var2.f395486c).f427681f.get("power-mobile-statByte");
            if (obj2 instanceof java.lang.Double) {
                m3.d dVar = new m3.d("mAh", java.lang.Double.valueOf(((java.lang.Double) obj2).doubleValue()));
                java.util.Map map = this.f419257b;
                map.put(" - mobile-PowerBytes", dVar);
                map.put("   - mobile-RxBytes", new m3.d("byte", java.lang.Double.valueOf(((java.lang.Long) ((rh.n3) o2Var.f395486c).f395474h.f395552a).longValue())));
                map.put("   - mobile-TxBytes", new m3.d("byte", java.lang.Double.valueOf(((java.lang.Long) ((rh.n3) o2Var.f395486c).f395475i.f395552a).longValue())));
            }
        }
    }
}
