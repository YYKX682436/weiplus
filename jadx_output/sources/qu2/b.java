package qu2;

/* loaded from: classes12.dex */
public final class b implements ts5.d {

    /* renamed from: a, reason: collision with root package name */
    public final ts5.a f366749a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f366750b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f366751c;

    /* renamed from: d, reason: collision with root package name */
    public final us5.b f366752d;

    /* renamed from: e, reason: collision with root package name */
    public long f366753e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f366754f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f366755g;

    /* renamed from: h, reason: collision with root package name */
    public float f366756h;

    /* renamed from: i, reason: collision with root package name */
    public final int f366757i;

    public b(ts5.a collectWhat) {
        kotlin.jvm.internal.o.g(collectWhat, "collectWhat");
        this.f366749a = collectWhat;
        this.f366752d = new us5.b("memory");
        this.f366754f = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f366757i = 10;
    }

    @Override // ts5.d
    public void a(java.util.Map map) {
        if (this.f366750b && !this.f366751c) {
            this.f366751c = true;
            this.f366750b = false;
            kotlinx.coroutines.r2 r2Var = this.f366755g;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            c();
            ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
            float f17 = com.tencent.mm.plugin.performance.watchdogs.b0.B.g().f343968y / 1024.0f;
            java.lang.Long valueOf = java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - this.f366753e) / 1000);
            java.lang.Long l17 = valueOf.longValue() > 0 ? valueOf : null;
            long longValue = l17 != null ? l17.longValue() : 1L;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("start_memory", java.lang.Float.valueOf(this.f366756h));
            jSONObject.put("stop_memory", java.lang.Float.valueOf(f17));
            jSONObject.put("record_time", longValue);
            us5.b bVar = this.f366752d;
            java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(bVar.f430579c - this.f366756h)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            jSONObject.put("avg_offest_memory", java.lang.Float.valueOf(java.lang.Float.parseFloat(format)));
            java.lang.String format2 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(bVar.f430579c)}, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            jSONObject.put("avg_memory", java.lang.Float.valueOf(java.lang.Float.parseFloat(format2)));
            b(jSONObject, map);
            com.tencent.mars.xlog.Log.i("AvgMemoryConsumeCollector", "#compositor done. json=" + jSONObject);
            ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).Ai(this.f366749a, jSONObject);
        }
    }

    public final void c() {
        ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        this.f366752d.a(com.tencent.mm.plugin.performance.watchdogs.b0.B.g().f343968y / 1024.0f);
    }

    @Override // ts5.d
    public void cancel() {
        this.f366751c = true;
        this.f366750b = false;
    }

    @Override // ts5.d
    public void start() {
        if (this.f366750b) {
            return;
        }
        us5.b bVar = this.f366752d;
        bVar.f430578b = 0;
        bVar.f430579c = 0.0d;
        this.f366750b = true;
        this.f366751c = false;
        this.f366753e = java.lang.System.currentTimeMillis();
        kotlinx.coroutines.r2 r2Var = this.f366755g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        this.f366756h = com.tencent.mm.plugin.performance.watchdogs.b0.B.g().f343968y / 1024.0f;
        kotlinx.coroutines.y0 y0Var = this.f366754f;
        this.f366755g = y0Var != null ? kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new qu2.a(this, null), 2, null) : null;
    }
}
