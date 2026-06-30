package ph;

/* loaded from: classes12.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.batterycanary.BatteryEventDelegate$startListening$receiver$1 f354280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f354282f;

    public s(com.tencent.matrix.batterycanary.BatteryEventDelegate$startListening$receiver$1 batteryEventDelegate$startListening$receiver$1, java.lang.String str, android.content.Intent intent) {
        this.f354280d = batteryEventDelegate$startListening$receiver$1;
        this.f354281e = str;
        this.f354282f = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.matrix.batterycanary.stats.k kVar;
        com.tencent.matrix.batterycanary.stats.k kVar2;
        if (this.f354280d.f52556b.n(this.f354281e, false)) {
            ph.t tVar = this.f354280d.f52556b;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = tVar.f354294i;
            kotlin.jvm.internal.o.d(atomicBoolean);
            ph.t.a(tVar, atomicBoolean.get());
        }
        if (this.f354282f.getIntExtra("status", -1) == 5) {
            ph.t tVar2 = this.f354280d.f52556b;
            tVar2.getClass();
            if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                tVar2.f();
                return;
            } else {
                tVar2.m().post(new ph.o(tVar2));
                return;
            }
        }
        int i17 = wh.m.i(this.f354280d.f52556b.f354286a);
        if (i17 >= 0 && i17 <= 1000) {
            long j17 = i17;
            if (java.lang.Math.abs(j17 - this.f354280d.f52556b.f354291f) >= 5) {
                ph.t tVar3 = this.f354280d.f52556b;
                tVar3.f354291f = j17;
                qh.f0 f0Var = tVar3.f354295j;
                if (f0Var != null && (kVar2 = (com.tencent.matrix.batterycanary.stats.k) f0Var.i(com.tencent.matrix.batterycanary.stats.k.class)) != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("battery-change", java.lang.Boolean.TRUE);
                    hashMap.put("battery-pct", java.lang.Integer.valueOf(i17));
                    kVar2.k("BATTERY_STAT", 0, hashMap);
                }
                ph.t tVar4 = this.f354280d.f52556b;
                tVar4.getClass();
                if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                    tVar4.g(i17);
                } else {
                    tVar4.m().post(new ph.p(tVar4, i17));
                }
            }
        }
        try {
            int intExtra = this.f354282f.getIntExtra("temperature", -1);
            if (intExtra < 0 || i17 > 1000) {
                return;
            }
            long j18 = intExtra;
            if (java.lang.Math.abs(j18 - this.f354280d.f52556b.f354292g) >= 15) {
                ph.t tVar5 = this.f354280d.f52556b;
                tVar5.f354292g = j18;
                qh.f0 f0Var2 = tVar5.f354295j;
                if (f0Var2 != null && (kVar = (com.tencent.matrix.batterycanary.stats.k) f0Var2.i(com.tencent.matrix.batterycanary.stats.k.class)) != null) {
                    int i18 = wh.m.i(kVar.f395294a.d());
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("battery-temp", java.lang.Integer.valueOf(intExtra));
                    hashMap2.put("battery-pct", java.lang.Integer.valueOf(i18));
                    kVar.k("BATTERY_STAT", 0, hashMap2);
                }
                ph.t tVar6 = this.f354280d.f52556b;
                tVar6.getClass();
                if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                    tVar6.i(intExtra);
                } else {
                    tVar6.m().post(new ph.q(tVar6, intExtra));
                }
            }
        } catch (java.lang.Exception e17) {
            oj.j.f("Matrix.battery.LifeCycle", "get EXTRA_TEMPERATURE failed: " + e17.getMessage(), new java.lang.Object[0]);
        }
    }
}
