package ez2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: t, reason: collision with root package name */
    public static boolean f257878t;

    /* renamed from: a, reason: collision with root package name */
    public final long f257879a;

    /* renamed from: b, reason: collision with root package name */
    public final ez2.f f257880b;

    /* renamed from: c, reason: collision with root package name */
    public final ez2.d f257881c;

    /* renamed from: d, reason: collision with root package name */
    public final int f257882d;

    /* renamed from: e, reason: collision with root package name */
    public final long f257883e;

    /* renamed from: f, reason: collision with root package name */
    public long f257884f;

    /* renamed from: g, reason: collision with root package name */
    public long f257885g;

    /* renamed from: h, reason: collision with root package name */
    public long f257886h;

    /* renamed from: i, reason: collision with root package name */
    public long f257887i;

    /* renamed from: j, reason: collision with root package name */
    public long f257888j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f257889k;

    /* renamed from: l, reason: collision with root package name */
    public float f257890l;

    /* renamed from: m, reason: collision with root package name */
    public int f257891m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f257892n;

    /* renamed from: o, reason: collision with root package name */
    public long f257893o;

    /* renamed from: p, reason: collision with root package name */
    public long f257894p;

    /* renamed from: q, reason: collision with root package name */
    public long f257895q;

    /* renamed from: r, reason: collision with root package name */
    public long f257896r;

    /* renamed from: s, reason: collision with root package name */
    public long f257897s;

    public e(long j17, ez2.f type, ez2.d animType, int i17, long j18) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(animType, "animType");
        this.f257879a = j17;
        this.f257880b = type;
        this.f257881c = animType;
        this.f257882d = i17;
        java.lang.Long valueOf = java.lang.Long.valueOf(j18);
        valueOf = (valueOf.longValue() > 0L ? 1 : (valueOf.longValue() == 0L ? 0 : -1)) > 0 ? valueOf : null;
        this.f257883e = valueOf != null ? valueOf.longValue() : android.os.SystemClock.elapsedRealtime();
        this.f257889k = !f257878t;
        com.tencent.mars.xlog.Log.i("ViewFluentReporter", "init click time, type: " + type + " animType: " + animType + " scene: " + i17 + " feedId: " + j17);
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("ViewFluentReporter", "tickClickPageFrameCost: clickPageFrameCost: " + this.f257894p + ' ');
        long j17 = this.f257894p;
        long j18 = this.f257883e;
        if (j17 == 0) {
            this.f257894p = android.os.SystemClock.elapsedRealtime() - j18;
        }
        com.tencent.mars.xlog.Log.i("ViewFluentReporter", "tickClickPageFrameCost - cost: " + (android.os.SystemClock.elapsedRealtime() - j18));
        f257878t = true;
        com.tencent.mm.autogen.mmdata.rpt.FluentAnimCostStruct fluentAnimCostStruct = new com.tencent.mm.autogen.mmdata.rpt.FluentAnimCostStruct();
        fluentAnimCostStruct.f58119d = this.f257880b.f257901d;
        fluentAnimCostStruct.f58120e = this.f257881c.f257877d;
        fluentAnimCostStruct.f58121f = this.f257889k ? 1 : 2;
        fluentAnimCostStruct.f58122g = this.f257882d;
        fluentAnimCostStruct.f58123h = (int) (android.os.SystemClock.elapsedRealtime() - j18);
        long j19 = this.f257885g;
        fluentAnimCostStruct.f58124i = (int) (j19 - this.f257884f);
        fluentAnimCostStruct.f58125j = (int) (j19 - j18);
        fluentAnimCostStruct.f58126k = (int) (this.f257888j - this.f257887i);
        fluentAnimCostStruct.f58127l = (int) this.f257895q;
        fluentAnimCostStruct.f58128m = (int) this.f257896r;
        fluentAnimCostStruct.f58129n = this.f257892n ? 2 : 1;
        fluentAnimCostStruct.f58130o = (int) this.f257890l;
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("exptId", pInt.value);
        jSONObject.put("groupId", pInt2.value);
        jSONObject.putOpt("clickFirstFrame", java.lang.Long.valueOf(this.f257893o));
        jSONObject.putOpt("clickPageFrame", java.lang.Long.valueOf(this.f257894p));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        fluentAnimCostStruct.f58132q = fluentAnimCostStruct.b("extInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
        fluentAnimCostStruct.f58131p = this.f257891m;
        fluentAnimCostStruct.f58133r = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;
        fluentAnimCostStruct.k();
        com.tencent.mars.xlog.Log.i("ViewFluentReporter", "realReport: " + fluentAnimCostStruct.n());
        ez2.g.f257902a = null;
    }

    public final void b() {
        this.f257888j = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("ViewFluentReporter", "tickActivityOnCreate cost: " + (this.f257888j - this.f257887i));
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("ViewFluentReporter", "tickActivityStart");
        this.f257887i = android.os.SystemClock.elapsedRealtime();
    }

    public final void d() {
        this.f257884f = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("ViewFluentReporter", "tickAnimBefore");
    }

    public final void e() {
        this.f257886h = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("ViewFluentReporter", "tickAnimEnd cost: " + (this.f257886h - this.f257885g));
    }

    public final void f(long j17) {
        this.f257885g = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("ViewFluentReporter", "tickAnimStart cost: " + (this.f257885g - this.f257884f) + " duration: " + j17);
    }

    public final void g(long j17) {
        com.tencent.mars.xlog.Log.i("ViewFluentReporter", "tickClickFirstFrameCost: clickFirstFrameCost: " + this.f257893o + " cost: " + j17);
        long j18 = this.f257893o;
        long j19 = this.f257883e;
        if (j18 == 0) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            if (!(valueOf.longValue() > 0)) {
                valueOf = null;
            }
            this.f257893o = valueOf != null ? valueOf.longValue() : android.os.SystemClock.elapsedRealtime() - j19;
        }
        com.tencent.mars.xlog.Log.i("ViewFluentReporter", "tickFirstFrameEnd - cost: " + (android.os.SystemClock.elapsedRealtime() - j19));
    }

    public final void h(boolean z17, float f17, int i17) {
        this.f257892n = z17;
        this.f257890l = f17;
        this.f257891m = i17;
        if (this.f257881c == ez2.d.f257873i) {
            return;
        }
        a();
    }

    public final void i(long j17) {
        this.f257895q = android.os.SystemClock.elapsedRealtime() - j17;
        com.tencent.mars.xlog.Log.i("ViewFluentReporter", "tickFirstFrameChangeEnd cost: " + this.f257895q);
    }

    public final void j() {
        com.tencent.mars.xlog.Log.i("ViewFluentReporter", "tickImageComplete showCost: " + (android.os.SystemClock.elapsedRealtime() - this.f257897s));
        a();
    }
}
