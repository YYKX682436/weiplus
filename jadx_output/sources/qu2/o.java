package qu2;

/* loaded from: classes12.dex */
public final class o implements ts5.d {

    /* renamed from: a, reason: collision with root package name */
    public final ts5.a f366802a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f366803b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f366804c;

    /* renamed from: d, reason: collision with root package name */
    public nh.c f366805d;

    /* renamed from: e, reason: collision with root package name */
    public float f366806e;

    public o(ts5.a collectWhat) {
        kotlin.jvm.internal.o.g(collectWhat, "collectWhat");
        this.f366802a = collectWhat;
    }

    @Override // ts5.d
    public void a(java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopAndReport, profiler");
        nh.c cVar = this.f366805d;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f337069b) : null);
        com.tencent.mars.xlog.Log.i("PowerConsumptionEasyCollector", sb6.toString());
        if (this.f366803b && !this.f366804c) {
            this.f366803b = false;
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310568a, null, new qu2.n(this, map, null), 2, null);
        }
    }

    public final float c() {
        try {
            if (com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
                return r0.getIntExtra(ya.b.LEVEL, -1) / r0.getIntExtra("scale", -1);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("PowerConsumptionEasyCollector", "err:%s", e17.getMessage());
        }
        return 0.0f;
    }

    @Override // ts5.d
    public void cancel() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel, profiler");
        nh.c cVar = this.f366805d;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f337069b) : null);
        com.tencent.mars.xlog.Log.i("PowerConsumptionEasyCollector", sb6.toString());
        this.f366804c = true;
        this.f366803b = false;
        nh.c cVar2 = this.f366805d;
        if (cVar2 != null) {
            cVar2.c();
        }
    }

    @Override // ts5.d
    public void start() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start, profiler");
        nh.c cVar = this.f366805d;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f337069b) : null);
        com.tencent.mars.xlog.Log.i("PowerConsumptionEasyCollector", sb6.toString());
        if (this.f366803b) {
            return;
        }
        this.f366803b = true;
        nh.c cVar2 = new nh.c("Live");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("new, profiler");
        nh.c cVar3 = this.f366805d;
        sb7.append(cVar3 != null ? java.lang.Integer.valueOf(cVar3.f337069b) : null);
        com.tencent.mars.xlog.Log.i("PowerConsumptionEasyCollector", sb7.toString());
        cVar2.d();
        this.f366805d = cVar2;
        this.f366804c = false;
        this.f366806e = c();
    }
}
