package ha1;

/* loaded from: classes7.dex */
public final class i extends ha1.v {

    /* renamed from: c, reason: collision with root package name */
    public static final ha1.i f279769c = new ha1.i();

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f279770d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Float f279771e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f279772f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f279773g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f279774h;

    /* renamed from: i, reason: collision with root package name */
    public static android.app.ActivityManager.MemoryInfo f279775i;

    static {
        java.lang.String a17 = bm5.f1.a();
        kotlin.jvm.internal.o.f(a17, "getProcessName(...)");
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
        kotlin.jvm.internal.o.f(str, "getPackageName(...)");
        f279770d = "MicroMsg.WAGameGcFactor".concat(r26.i0.t(a17, str, "", false));
        f279772f = jz5.h.b(ha1.g.f279767d);
        f279773g = jz5.h.b(ha1.f.f279766d);
        f279774h = jz5.h.b(ha1.h.f279768d);
    }

    @Override // ha1.v
    public e42.d0 b() {
        return e42.d0.clicfg_magicbrush_gcfactor;
    }

    @Override // ha1.v
    public java.lang.String d() {
        return "gcfactor";
    }

    @Override // ha1.v
    public java.lang.Object f() {
        return java.lang.Float.valueOf(0.0f);
    }

    @Override // ha1.v
    public java.lang.Object g(java.lang.String str) {
        return java.lang.Float.valueOf(0.0f);
    }

    public final float i(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Float f17 = f279771e;
        if (f17 != null) {
            kotlin.jvm.internal.o.d(f17);
            return f17.floatValue();
        }
        float floatValue = ((java.lang.Number) e()).floatValue();
        boolean z17 = floatValue == -1.0f;
        java.lang.String str = f279770d;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(str, "rawConfig == [" + floatValue + "] != -1, just return");
            f279771e = java.lang.Float.valueOf(floatValue);
            return floatValue;
        }
        float f18 = context.getResources().getDisplayMetrics().density;
        float f19 = (context.getResources().getDisplayMetrics().widthPixels / f18) * (context.getResources().getDisplayMetrics().heightPixels / f18) * 4 * 2;
        if (f279775i == null) {
            java.lang.Object systemService = context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            f279775i = memoryInfo;
            ((android.app.ActivityManager) systemService).getMemoryInfo(memoryInfo);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getAvailableMemory avail = [");
            android.app.ActivityManager.MemoryInfo memoryInfo2 = f279775i;
            kotlin.jvm.internal.o.d(memoryInfo2);
            sb6.append(memoryInfo2.availMem);
            sb6.append("] total = [");
            android.app.ActivityManager.MemoryInfo memoryInfo3 = f279775i;
            kotlin.jvm.internal.o.d(memoryInfo3);
            sb6.append(memoryInfo3.totalMem);
            sb6.append(']');
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
        }
        android.app.ActivityManager.MemoryInfo memoryInfo4 = f279775i;
        kotlin.jvm.internal.o.d(memoryInfo4);
        long floatValue2 = ((float) memoryInfo4.totalMem) * ((java.lang.Number) ((jz5.n) f279774h).getValue()).floatValue();
        float f27 = ((float) floatValue2) / f19;
        float min = java.lang.Math.min(((java.lang.Number) ((jz5.n) f279773g).getValue()).floatValue(), java.lang.Math.max(((java.lang.Number) ((jz5.n) f279772f).getValue()).floatValue(), f27));
        float f28 = 67108864 / (min * f19);
        com.tencent.mars.xlog.Log.i(str, "calculate gc_factor automatically unit = [" + (f19 / 1024.0f) + "]kb limit = [65536]kb system = [" + (floatValue2 / 1024) + "]kb raw = [" + min + ':' + f27 + "] actually = [" + f28 + ']');
        java.lang.Float valueOf = java.lang.Float.valueOf(f28);
        f279771e = valueOf;
        kotlin.jvm.internal.o.d(valueOf);
        return valueOf.floatValue();
    }
}
