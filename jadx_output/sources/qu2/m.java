package qu2;

/* loaded from: classes12.dex */
public final class m implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qu2.o f366797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f366798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f366799c;

    public m(qu2.o oVar, java.util.Map map, rh.c1 c1Var) {
        this.f366797a = oVar;
        this.f366798b = map;
        this.f366799c = c1Var;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        qu2.o oVar = this.f366797a;
        float c17 = oVar.c();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        float f17 = ((float) o2Var.f395487d) / 1000.0f;
        qh.b bVar = this.f366799c.f395330l;
        int i17 = bVar != null ? bVar.f363312e : 0;
        int i18 = bVar != null ? bVar.f363313f : 0;
        java.lang.String format = java.lang.String.format("%.0f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        jSONObject.put("c_record_seconds", java.lang.Float.valueOf(java.lang.Float.parseFloat(format)));
        jSONObject.put("c_charging_rate", i17);
        jSONObject.put("c_un_charging_rate", i18);
        uh.g gVar = (uh.g) o2Var.f395486c;
        java.lang.String format2 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(gVar.d())}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        jSONObject.put("c_total", java.lang.Float.valueOf(java.lang.Float.parseFloat(format2)));
        java.lang.String format3 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427709t.f395552a}, 1));
        kotlin.jvm.internal.o.f(format3, "format(...)");
        jSONObject.put("c_idle", java.lang.Float.valueOf(java.lang.Float.parseFloat(format3)));
        java.lang.String format4 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427699o.f395552a}, 1));
        kotlin.jvm.internal.o.f(format4, "format(...)");
        jSONObject.put("c_flash_light", java.lang.Float.valueOf(java.lang.Float.parseFloat(format4)));
        java.lang.String format5 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427695m.f395552a}, 1));
        kotlin.jvm.internal.o.f(format5, "format(...)");
        jSONObject.put("c_sensors", java.lang.Float.valueOf(java.lang.Float.parseFloat(format5)));
        java.lang.String format6 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427693l.f395552a}, 1));
        kotlin.jvm.internal.o.f(format6, "format(...)");
        jSONObject.put("c_gps", java.lang.Float.valueOf(java.lang.Float.parseFloat(format6)));
        java.lang.String format7 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427685h.f395552a}, 1));
        kotlin.jvm.internal.o.f(format7, "format(...)");
        jSONObject.put("c_wake_lock", java.lang.Float.valueOf(java.lang.Float.parseFloat(format7)));
        java.lang.String format8 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427691k.f395552a}, 1));
        kotlin.jvm.internal.o.f(format8, "format(...)");
        jSONObject.put("c_blue_tooth", java.lang.Float.valueOf(java.lang.Float.parseFloat(format8)));
        java.lang.String format9 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427705r.f395552a}, 1));
        kotlin.jvm.internal.o.f(format9, "format(...)");
        jSONObject.put("c_screen", java.lang.Float.valueOf(java.lang.Float.parseFloat(format9)));
        java.lang.String format10 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427683g.f395552a}, 1));
        kotlin.jvm.internal.o.f(format10, "format(...)");
        jSONObject.put("c_cpu", java.lang.Float.valueOf(java.lang.Float.parseFloat(format10)));
        java.lang.String format11 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427697n.f395552a}, 1));
        kotlin.jvm.internal.o.f(format11, "format(...)");
        jSONObject.put("c_camera", java.lang.Float.valueOf(java.lang.Float.parseFloat(format11)));
        java.lang.String format12 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427687i.f395552a}, 1));
        kotlin.jvm.internal.o.f(format12, "format(...)");
        jSONObject.put("c_mobile", java.lang.Float.valueOf(java.lang.Float.parseFloat(format12)));
        java.lang.String format13 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427689j.f395552a}, 1));
        kotlin.jvm.internal.o.f(format13, "format(...)");
        jSONObject.put("c_wifi", java.lang.Float.valueOf(java.lang.Float.parseFloat(format13)));
        java.lang.String format14 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427701p.f395552a}, 1));
        kotlin.jvm.internal.o.f(format14, "format(...)");
        jSONObject.put("c_audio", java.lang.Float.valueOf(java.lang.Float.parseFloat(format14)));
        java.lang.String format15 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427703q.f395552a}, 1));
        kotlin.jvm.internal.o.f(format15, "format(...)");
        jSONObject.put("c_video", java.lang.Float.valueOf(java.lang.Float.parseFloat(format15)));
        java.lang.String format16 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427707s.f395552a}, 1));
        kotlin.jvm.internal.o.f(format16, "format(...)");
        jSONObject.put("c_system", java.lang.Float.valueOf(java.lang.Float.parseFloat(format16)));
        java.lang.String format17 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(oVar.f366806e)}, 1));
        kotlin.jvm.internal.o.f(format17, "format(...)");
        jSONObject.put("c_start_battery", java.lang.Float.valueOf(java.lang.Float.parseFloat(format17)));
        java.lang.String format18 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(c17)}, 1));
        kotlin.jvm.internal.o.f(format18, "format(...)");
        jSONObject.put("c_end_battery", java.lang.Float.valueOf(java.lang.Float.parseFloat(format18)));
        oVar.b(jSONObject, this.f366798b);
        com.tencent.mars.xlog.Log.i("PowerConsumptionEasyCollector", "#compositor done. duration=" + gVar.f395363a + ", json=" + jSONObject);
        ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).Ai(oVar.f366802a, jSONObject);
    }
}
