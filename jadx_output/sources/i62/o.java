package i62;

/* loaded from: classes13.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final i62.o f288963a = new i62.o();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f288964b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Vector f288965c = new java.util.Vector();

    /* renamed from: d, reason: collision with root package name */
    public static final android.content.BroadcastReceiver f288966d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f288967e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f288968f;

    static {
        android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.expt.resource.MMResReporter$reportReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                java.util.Objects.toString(context);
                if (intent != null) {
                    intent.getAction();
                }
                if (kotlin.jvm.internal.o.b(intent != null ? intent.getAction() : null, "com.tencent.mm.plugin.expt.resource.MMResReporter")) {
                    i62.o.f288963a.d(i62.k.f288957d);
                }
            }
        };
        f288966d = broadcastReceiver;
        if (fp.h.a(33)) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("com.tencent.mm.plugin.expt.resource.MMResReporter");
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
            intentFilter2.addAction("com.tencent.mm.plugin.expt.resource.MMResReporter");
            context2.registerReceiver(broadcastReceiver, intentFilter2, 4);
        }
        f288967e = jz5.h.b(i62.l.f288960d);
        f288968f = jz5.h.b(i62.m.f288961d);
    }

    public final int a() {
        c25.e eVar;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("startup_cost_info");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        int o17 = M.o("device_benchmark_level", Integer.MIN_VALUE);
        if (o17 != Integer.MIN_VALUE) {
            return o17;
        }
        int i17 = 0;
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            return 0;
        }
        try {
            eVar = (c25.e) gm0.j1.s(c25.e.class);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MMResReporter", th6, "[tomys] Cannot get config value, return 0 as benchmark level.", new java.lang.Object[0]);
        }
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MMResReporter", "[tomys] Cannot get config service on main process, return 0 as benchmark level.");
            return 0;
        }
        int b17 = ((com.tencent.mm.plugin.zero.a) eVar).b().b("ClientBenchmarkLevel", Integer.MIN_VALUE);
        if (b17 >= 0) {
            M.A("device_benchmark_level", b17);
            i17 = b17;
        } else {
            com.tencent.mars.xlog.Log.e("MMResReporter", "[tomys] Cannot get config value, return 0 as benchmark level.");
        }
        return i17;
    }

    public final int b(i62.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        java.util.HashMap hashMap = f288964b;
        if (!hashMap.containsKey(item.f288953d)) {
            hashMap.put(item.f288953d, 1);
            return 1;
        }
        java.lang.Integer num = (java.lang.Integer) hashMap.get(item.f288953d);
        if (num == null) {
            num = 0;
        }
        int intValue = 1 + num.intValue();
        hashMap.put(item.f288953d, java.lang.Integer.valueOf(intValue));
        return intValue;
    }

    public final boolean c(e42.d0 sampleKey) {
        kotlin.jvm.internal.o.g(sampleKey, "sampleKey");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(sampleKey, 10);
            if (Ni < 1000) {
                if (Ni < 1) {
                    return false;
                }
                if (java.lang.Math.abs(gm0.j1.b().h() % 1000) > Ni) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MMResReporter", th6, "get sample err:%s", sampleKey);
            return false;
        }
    }

    public final void d(i62.k reportScene) {
        kotlin.jvm.internal.o.g(reportScene, "reportScene");
        boolean c17 = c(e42.d0.clicfg_activity_cost_sample_and);
        int logLevel = com.tencent.mars.xlog.Log.getLogLevel();
        java.util.Vector vector = f288965c;
        if (logLevel <= 1) {
            reportScene.toString();
            vector.size();
            bm5.f1.a();
        }
        if (!vector.isEmpty()) {
            try {
                if (!c17) {
                    vector.clear();
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(vector);
                vector.clear();
                pm0.v.O("MMResRepThread", new i62.n(arrayList));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MMResReporter", th6, "tryReport err", new java.lang.Object[0]);
            }
        }
    }
}
