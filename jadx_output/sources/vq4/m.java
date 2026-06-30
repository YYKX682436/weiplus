package vq4;

/* loaded from: classes12.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f439334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f439335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f439336f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.util.Map.Entry entry, rh.c1 c1Var, int i17) {
        super(1);
        this.f439334d = entry;
        this.f439335e = c1Var;
        this.f439336f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        rh.f fVar;
        rh.x2 x2Var;
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(subJson, "$this$subJson");
        java.util.Map.Entry entry = this.f439334d;
        java.lang.String str = (java.lang.String) entry.getKey();
        int size = ((java.util.List) entry.getValue()).size();
        java.lang.Object value = entry.getValue();
        kotlin.jvm.internal.o.f(value, "<get-value>(...)");
        java.util.Iterator it = ((java.lang.Iterable) value).iterator();
        long j17 = 0;
        while (it.hasNext()) {
            rh.o2 o2Var = (rh.o2) ((m3.d) it.next()).f323093b;
            java.lang.Long l17 = (o2Var == null || (fVar = (rh.f) o2Var.f395486c) == null || (x2Var = fVar.f395377g) == null) ? null : (java.lang.Long) x2Var.f395552a;
            j17 += l17 == null ? 0L : l17.longValue();
        }
        qh.b bVar = this.f439335e.f395330l;
        float b17 = vq4.x.b(j17, bVar != null ? bVar.f363321n : 0L);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPProfileReport", "runnable " + this.f439336f + ": " + str + '(' + size + ") = " + b17);
        subJson.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
        subJson.put("count", size);
        subJson.put("cpuLoad", java.lang.Float.valueOf(b17));
        return jz5.f0.f302826a;
    }
}
