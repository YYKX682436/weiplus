package wo;

/* loaded from: classes12.dex */
public final class s1 {
    public s1(kotlin.jvm.internal.i iVar) {
    }

    public final int a() {
        int i17 = 0;
        while (true) {
            try {
                if (!new java.io.File("/sys/devices/system/cpu/cpu" + i17).exists()) {
                    break;
                }
                i17++;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SoCFeatures", th6, "Failure on getCPUCoreCount.", new java.lang.Object[0]);
                return 1;
            }
        }
        if (i17 > 0) {
            return i17;
        }
        return 1;
    }

    public final java.lang.String b() {
        java.lang.String str = (java.lang.String) c().get("Hardware");
        return str == null ? "" : str;
    }

    public final java.util.Map c() {
        java.util.Map[] mapArr = wo.t1.f447801b;
        java.util.Map map = mapArr[0];
        if (map != null) {
            kotlin.jvm.internal.o.d(map);
            return map;
        }
        synchronized (mapArr) {
            java.util.Map map2 = mapArr[0];
            if (map2 != null) {
                kotlin.jvm.internal.o.d(map2);
                return map2;
            }
            java.util.Map d17 = wo.t1.f447800a.d();
            mapArr[0] = d17;
            return d17 == null ? kz5.q0.f314001d : d17;
        }
    }

    public final java.util.Map d() {
        try {
            lz5.m mVar = new lz5.m(64);
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File("/proc/cpuinfo")), r26.c.f368865a);
            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            try {
                for (java.lang.String str : vz5.v.b(bufferedReader)) {
                    wo.s1 s1Var = wo.t1.f447800a;
                    java.util.regex.Pattern regex = (java.util.regex.Pattern) ((jz5.n) wo.t1.f447802c).getValue();
                    kotlin.jvm.internal.o.g(str, "<this>");
                    kotlin.jvm.internal.o.g(regex, "regex");
                    r26.n0.c0(2);
                    java.lang.String[] split = regex.split(str, 2);
                    kotlin.jvm.internal.o.f(split, "split(...)");
                    java.lang.String[] strArr = (java.lang.String[]) kz5.v.f(split).toArray(new java.lang.String[0]);
                    if (strArr.length >= 2) {
                        java.lang.String obj = r26.n0.u0(strArr[0]).toString();
                        java.lang.String obj2 = r26.n0.u0(strArr[1]).toString();
                        if (!mVar.containsKey(obj)) {
                            mVar.put(obj, obj2);
                        }
                    }
                }
                vz5.b.a(bufferedReader, null);
                if (!mVar.containsKey("Hardware")) {
                    java.lang.String a17 = wo.w1.a("ro.soc.manufacturer");
                    java.lang.String a18 = wo.w1.a("ro.soc.model");
                    com.tencent.mars.xlog.Log.i("MicroMsg.SoCFeatures", "result: " + a17 + ", socModel: " + a18);
                    if (a18 != null && r26.i0.p(a18, "kirin", true)) {
                        java.lang.String a19 = wo.w1.a("ro.hardware");
                        kotlin.jvm.internal.o.f(a19, "get(...)");
                        com.tencent.mars.xlog.Log.i("MicroMsg.SoCFeatures", "cpuhardware: " + a18 + ", cpuhardwareT: " + a19);
                        if (a19.length() > a18.length()) {
                            a18 = a19;
                        }
                    }
                    if (a17 != null) {
                        a18 = a17 + ' ' + a18;
                    }
                    if (a18 != null) {
                        mVar.put("Hardware", a18);
                    }
                }
                return kz5.b1.b(mVar);
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SoCFeatures", th6, "Fail to parse /proc/cpuinfo", new java.lang.Object[0]);
            return null;
        }
    }
}
