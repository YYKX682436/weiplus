package qu2;

/* loaded from: classes12.dex */
public final class f implements ts5.d {

    /* renamed from: a, reason: collision with root package name */
    public final ts5.a f366766a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f366767b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f366768c;

    /* renamed from: d, reason: collision with root package name */
    public nh.c f366769d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.y0 f366770e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f366771f;

    /* renamed from: g, reason: collision with root package name */
    public final us5.b f366772g;

    /* renamed from: h, reason: collision with root package name */
    public final us5.b f366773h;

    /* renamed from: i, reason: collision with root package name */
    public final us5.b f366774i;

    /* renamed from: j, reason: collision with root package name */
    public final us5.a f366775j;

    /* renamed from: k, reason: collision with root package name */
    public final us5.a f366776k;

    /* renamed from: l, reason: collision with root package name */
    public final us5.a f366777l;

    /* renamed from: m, reason: collision with root package name */
    public final us5.a f366778m;

    /* renamed from: n, reason: collision with root package name */
    public long f366779n;

    /* renamed from: o, reason: collision with root package name */
    public final int f366780o;

    public f(ts5.a collectWhat) {
        kotlin.jvm.internal.o.g(collectWhat, "collectWhat");
        this.f366766a = collectWhat;
        this.f366772g = new us5.b("charging_rate");
        this.f366773h = new us5.b("c_un_charging_rate");
        this.f366774i = new us5.b("c_wifi");
        this.f366775j = new us5.a("cpu");
        this.f366776k = new us5.a("total");
        this.f366777l = new us5.a("system");
        this.f366778m = new us5.a("idle");
        this.f366780o = 30;
    }

    public static final void c(qu2.f fVar, rh.c1 c1Var, rh.o2 o2Var) {
        fVar.getClass();
        java.lang.Number number = ((uh.g) o2Var.f395486c).f427683g.f395552a;
        kotlin.jvm.internal.o.f(number, "get(...)");
        fVar.f366775j.a(number.doubleValue());
        uh.g gVar = (uh.g) o2Var.f395486c;
        fVar.f366776k.a(gVar.d());
        java.lang.Number number2 = gVar.f427709t.f395552a;
        kotlin.jvm.internal.o.f(number2, "get(...)");
        fVar.f366778m.a(number2.doubleValue());
        java.lang.Number number3 = gVar.f427707s.f395552a;
        kotlin.jvm.internal.o.f(number3, "get(...)");
        fVar.f366777l.a(number3.doubleValue());
        fVar.f366772g.a(c1Var.f395330l != null ? r0.f363312e : 0);
        fVar.f366773h.a(c1Var.f395330l != null ? r6.f363313f : 0);
        java.lang.Number number4 = gVar.f427689j.f395552a;
        kotlin.jvm.internal.o.f(number4, "get(...)");
        fVar.f366774i.a(number4.doubleValue());
    }

    @Override // ts5.d
    public void a(java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopAndReport, profiler");
        nh.c cVar = this.f366769d;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f337069b) : null);
        com.tencent.mars.xlog.Log.i("AvgPowerConsumeCollector", sb6.toString());
        if (this.f366767b && !this.f366768c) {
            this.f366768c = true;
            this.f366767b = false;
            kotlinx.coroutines.r2 r2Var = this.f366771f;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlinx.coroutines.y0 y0Var = this.f366770e;
            if (y0Var != null) {
                kotlinx.coroutines.l.d(y0Var, null, null, new qu2.e(this, map, null), 3, null);
            }
        }
    }

    @Override // ts5.d
    public void cancel() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel, profiler");
        nh.c cVar = this.f366769d;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f337069b) : null);
        com.tencent.mars.xlog.Log.i("AvgPowerConsumeCollector", sb6.toString());
        this.f366768c = true;
        this.f366767b = false;
        nh.c cVar2 = this.f366769d;
        if (cVar2 != null) {
            cVar2.c();
        }
        kotlinx.coroutines.y0 y0Var = this.f366770e;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
    }

    @Override // ts5.d
    public void start() {
        if (this.f366767b) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start, profiler");
        nh.c cVar = this.f366769d;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f337069b) : null);
        com.tencent.mars.xlog.Log.i("AvgPowerConsumeCollector", sb6.toString());
        us5.a aVar = this.f366775j;
        aVar.f430575b = 0;
        aVar.f430576c = 0.0d;
        us5.b bVar = this.f366772g;
        bVar.f430578b = 0;
        bVar.f430579c = 0.0d;
        us5.b bVar2 = this.f366773h;
        bVar2.f430578b = 0;
        bVar2.f430579c = 0.0d;
        us5.b bVar3 = this.f366774i;
        bVar3.f430578b = 0;
        bVar3.f430579c = 0.0d;
        us5.a aVar2 = this.f366776k;
        aVar2.f430575b = 0;
        aVar2.f430576c = 0.0d;
        us5.a aVar3 = this.f366777l;
        aVar3.f430575b = 0;
        aVar3.f430576c = 0.0d;
        us5.a aVar4 = this.f366778m;
        aVar4.f430575b = 0;
        aVar4.f430576c = 0.0d;
        this.f366779n = java.lang.System.currentTimeMillis();
        kotlinx.coroutines.y0 y0Var = this.f366770e;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
        kotlinx.coroutines.y0 a18 = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(p0Var));
        this.f366770e = a18;
        this.f366767b = true;
        this.f366768c = false;
        this.f366771f = kotlinx.coroutines.l.d(a18, p0Var, null, new qu2.c(this, null), 2, null);
    }
}
