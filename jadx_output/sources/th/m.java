package th;

/* loaded from: classes12.dex */
public class m implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f419258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f419259b;

    public m(th.n nVar, rh.o2 o2Var, java.util.Map map) {
        this.f419258a = o2Var;
        this.f419259b = map;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        rh.o2 o2Var2 = this.f419258a;
        boolean containsKey = ((uh.g) o2Var2.f395486c).f427681f.containsKey("power-wifi-statByte");
        rh.d3 d3Var = o2Var2.f395486c;
        java.util.Map map = this.f419259b;
        if (containsKey) {
            java.lang.Object obj2 = ((uh.g) d3Var).f427681f.get("power-wifi-statByte");
            if (obj2 instanceof java.lang.Double) {
                map.put(" - wifi-PowerBytes", new m3.d("mAh", java.lang.Double.valueOf(((java.lang.Double) obj2).doubleValue())));
                map.put("   - wifi-RxBytes", new m3.d("byte", java.lang.Double.valueOf(((java.lang.Long) ((rh.n3) o2Var.f395486c).f395470d.f395552a).longValue())));
                map.put("   - wifi-TxBytes", new m3.d("byte", java.lang.Double.valueOf(((java.lang.Long) ((rh.n3) o2Var.f395486c).f395471e.f395552a).longValue())));
            }
        }
        if (((uh.g) d3Var).f427681f.containsKey("power-wifi-statPacket")) {
            java.lang.Object obj3 = ((uh.g) d3Var).f427681f.get("power-wifi-statPacket");
            if (obj3 instanceof java.lang.Double) {
                map.put(" - wifi-PowerPackets", new m3.d("mAh", java.lang.Double.valueOf(((java.lang.Double) obj3).doubleValue())));
                map.put("   - wifi-RxPackets", new m3.d("packet", java.lang.Double.valueOf(((java.lang.Long) ((rh.n3) o2Var.f395486c).f395472f.f395552a).longValue())));
                map.put("   - wifi-TxPackets", new m3.d("packet", java.lang.Double.valueOf(((java.lang.Long) ((rh.n3) o2Var.f395486c).f395473g.f395552a).longValue())));
            }
        }
    }
}
