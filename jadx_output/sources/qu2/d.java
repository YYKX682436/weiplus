package qu2;

/* loaded from: classes12.dex */
public final class d implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qu2.f f366761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f366762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f366763c;

    public d(qu2.f fVar, rh.c1 c1Var, java.util.Map map) {
        this.f366761a = fVar;
        this.f366762b = c1Var;
        this.f366763c = map;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        kotlin.jvm.internal.o.d(o2Var);
        rh.c1 c1Var = this.f366762b;
        qu2.f fVar = this.f366761a;
        qu2.f.c(fVar, c1Var, o2Var);
        java.lang.Long valueOf = java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - fVar.f366779n) / 1000);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : 1L;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("c_record_seconds", longValue);
        uh.g gVar = (uh.g) o2Var.f395486c;
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427699o.f395552a}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        jSONObject.put("c_flash_light", java.lang.Float.valueOf(java.lang.Float.parseFloat(format)));
        java.lang.String format2 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427695m.f395552a}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        jSONObject.put("c_sensors", java.lang.Float.valueOf(java.lang.Float.parseFloat(format2)));
        java.lang.String format3 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427693l.f395552a}, 1));
        kotlin.jvm.internal.o.f(format3, "format(...)");
        jSONObject.put("c_gps", java.lang.Float.valueOf(java.lang.Float.parseFloat(format3)));
        java.lang.String format4 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427685h.f395552a}, 1));
        kotlin.jvm.internal.o.f(format4, "format(...)");
        jSONObject.put("c_wake_lock", java.lang.Float.valueOf(java.lang.Float.parseFloat(format4)));
        java.lang.String format5 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427691k.f395552a}, 1));
        kotlin.jvm.internal.o.f(format5, "format(...)");
        jSONObject.put("c_blue_tooth", java.lang.Float.valueOf(java.lang.Float.parseFloat(format5)));
        java.lang.String format6 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427705r.f395552a}, 1));
        kotlin.jvm.internal.o.f(format6, "format(...)");
        jSONObject.put("c_screen", java.lang.Float.valueOf(java.lang.Float.parseFloat(format6)));
        java.lang.String format7 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427683g.f395552a}, 1));
        kotlin.jvm.internal.o.f(format7, "format(...)");
        jSONObject.put("c_cpu", java.lang.Float.valueOf(java.lang.Float.parseFloat(format7)));
        java.lang.String format8 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427697n.f395552a}, 1));
        kotlin.jvm.internal.o.f(format8, "format(...)");
        jSONObject.put("c_camera", java.lang.Float.valueOf(java.lang.Float.parseFloat(format8)));
        java.lang.String format9 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427687i.f395552a}, 1));
        kotlin.jvm.internal.o.f(format9, "format(...)");
        jSONObject.put("c_mobile", java.lang.Float.valueOf(java.lang.Float.parseFloat(format9)));
        java.lang.String format10 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427701p.f395552a}, 1));
        kotlin.jvm.internal.o.f(format10, "format(...)");
        jSONObject.put("c_audio", java.lang.Float.valueOf(java.lang.Float.parseFloat(format10)));
        java.lang.String format11 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f427703q.f395552a}, 1));
        kotlin.jvm.internal.o.f(format11, "format(...)");
        jSONObject.put("c_video", java.lang.Float.valueOf(java.lang.Float.parseFloat(format11)));
        java.lang.String format12 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(fVar.f366777l.f430576c)}, 1));
        kotlin.jvm.internal.o.f(format12, "format(...)");
        jSONObject.put("c_system", java.lang.Float.valueOf(java.lang.Float.parseFloat(format12)));
        java.lang.String format13 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(fVar.f366774i.f430579c)}, 1));
        kotlin.jvm.internal.o.f(format13, "format(...)");
        jSONObject.put("c_wifi", java.lang.Float.valueOf(java.lang.Float.parseFloat(format13)));
        java.lang.String format14 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(fVar.f366772g.f430579c)}, 1));
        kotlin.jvm.internal.o.f(format14, "format(...)");
        jSONObject.put("c_charging_rate", java.lang.Float.valueOf(java.lang.Float.parseFloat(format14)));
        java.lang.String format15 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(fVar.f366773h.f430579c)}, 1));
        kotlin.jvm.internal.o.f(format15, "format(...)");
        jSONObject.put("c_un_charging_rate", java.lang.Float.valueOf(java.lang.Float.parseFloat(format15)));
        java.lang.String format16 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(fVar.f366776k.f430576c)}, 1));
        kotlin.jvm.internal.o.f(format16, "format(...)");
        jSONObject.put("c_total", java.lang.Float.valueOf(java.lang.Float.parseFloat(format16)));
        java.lang.String format17 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(fVar.f366778m.f430576c)}, 1));
        kotlin.jvm.internal.o.f(format17, "format(...)");
        jSONObject.put("c_idle", java.lang.Float.valueOf(java.lang.Float.parseFloat(format17)));
        fVar.b(jSONObject, this.f366763c);
        com.tencent.mars.xlog.Log.i("AvgPowerConsumeCollector", "#compositor done. duration=" + gVar.f395363a + ", json=" + jSONObject);
        ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).Ai(fVar.f366766a, jSONObject);
    }
}
