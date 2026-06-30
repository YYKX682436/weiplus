package wh;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Integer f445830a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f445831b = jz5.h.a(jz5.i.f302829d, wh.l.f445824d);

    public static final boolean A(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
            java.lang.Object systemService = context.getSystemService("power");
            if (systemService != null) {
                return ((android.os.PowerManager) systemService).isInteractive();
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.os.PowerManager");
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static final java.util.Map B(java.util.Map map, java.util.Comparator comparator) {
        kotlin.jvm.internal.o.g(map, "map");
        java.util.ArrayList<java.util.Map.Entry> arrayList = new java.util.ArrayList(map.entrySet());
        java.util.Collections.sort(arrayList, comparator);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : arrayList) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static final java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, "r");
            try {
                java.lang.String readLine = randomAccessFile.readLine();
                vz5.b.a(randomAccessFile, null);
                return readLine;
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.battery.Utils", th6, "cat file fail", new java.lang.Object[0]);
            return null;
        }
    }

    public static final wh.g b(android.content.Context context, java.lang.String from) {
        java.lang.Boolean bool;
        int intExtra;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(from, "from");
        android.content.Intent k17 = k(context);
        boolean z17 = k17 != null && ((intExtra = k17.getIntExtra("status", -1)) == 2 || intExtra == 5);
        boolean x17 = x(context);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(y(context));
        android.content.Intent k18 = k(context);
        int intExtra2 = k18 != null ? k18.getIntExtra("status", -1) : -1;
        int intExtra3 = k18 != null ? k18.getIntExtra("plugged", -1) : -1;
        if (k18 != null) {
            bool = java.lang.Boolean.valueOf(intExtra3 == 0 && intExtra2 != 1);
        } else {
            bool = null;
        }
        java.lang.Boolean bool2 = bool;
        oj.j.f("Matrix.battery.Utils", "#dumpDeviceChargeStates: " + from + ", deviceChargingV1=" + z17 + ", deviceChargingV2=" + x17 + ", deviceChargingV3=" + valueOf + ", status=" + intExtra2 + ", plugged=" + intExtra3 + ", onBattery=" + bool2, new java.lang.Object[0]);
        return new wh.g(java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(x17), valueOf, intExtra2, intExtra3, bool2);
    }

    public static java.lang.String c(long j17, java.lang.String pattern, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            pattern = com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS;
        }
        kotlin.jvm.internal.o.g(pattern, "pattern");
        if (j17 > 0) {
            java.lang.String format = new java.text.SimpleDateFormat(pattern, java.util.Locale.getDefault()).format(new java.util.Date(j17));
            kotlin.jvm.internal.o.f(format, "SimpleDateFormat(pattern….format(Date(timeStamps))");
            return format;
        }
        return j17 + "ms";
    }

    public static final int d(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        wh.k kVar = (wh.k) t();
        kVar.getClass();
        if (z17) {
            return 1;
        }
        wh.h hVar = kVar.f445818c;
        if (hVar == null || hVar.a()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(e(context, false));
            kVar.f445818c = new wh.h(valueOf, 5000);
            return valueOf.intValue();
        }
        wh.h hVar2 = kVar.f445818c;
        kotlin.jvm.internal.o.d(hVar2);
        return ((java.lang.Number) hVar2.f445793b).intValue();
    }

    public static final int e(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        if (z17) {
            return 1;
        }
        if (v(context)) {
            return 3;
        }
        return com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE.hasOverlayWindow() ? 4 : 2;
    }

    public static final int f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        wh.k kVar = (wh.k) t();
        kVar.getClass();
        wh.h hVar = kVar.f445821f;
        if (hVar == null || hVar.a()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(g(context));
            kVar.f445821f = new wh.h(valueOf, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
            return valueOf.intValue();
        }
        wh.h hVar2 = kVar.f445821f;
        kotlin.jvm.internal.o.d(hVar2);
        return ((java.lang.Number) hVar2.f445793b).intValue();
    }

    public static final int g(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
            if (kotlin.jvm.internal.o.b(wh.n1.f445841f, com.tencent.shadow.core.common.HostConstants.FRAMEWORK_APPID) || kotlin.jvm.internal.o.b(wh.n1.f445841f, "custom")) {
                wh.n1 j17 = wh.n1.j(context);
                kotlin.jvm.internal.o.f(j17, "PowerProfile.init(context)");
                return (int) j17.a("battery.capacity");
            }
        } catch (java.lang.Throwable unused) {
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.android.internal.os.PowerProfile");
            java.lang.Object newInstance = cls.getConstructor(android.content.Context.class).newInstance(context);
            try {
                java.lang.reflect.Method method = cls.getMethod("getAveragePower", java.lang.String.class);
                kotlin.jvm.internal.o.f(method, "profileClass.getMethod(\"…wer\", String::class.java)");
                java.lang.Object invoke = method.invoke(newInstance, "battery.capacity");
                if (invoke != null) {
                    return (int) ((java.lang.Double) invoke).doubleValue();
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Double");
            } catch (java.lang.Throwable th6) {
                oj.j.f("Matrix.battery.Utils", "get PowerProfile failed: " + th6.getMessage(), new java.lang.Object[0]);
                java.lang.reflect.Method method2 = cls.getMethod("getBatteryCapacity", new java.lang.Class[0]);
                kotlin.jvm.internal.o.f(method2, "profileClass.getMethod(\"getBatteryCapacity\")");
                java.lang.Object invoke2 = method2.invoke(newInstance, new java.lang.Object[0]);
                if (invoke2 != null) {
                    return ((java.lang.Integer) invoke2).intValue();
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        } catch (java.lang.Throwable unused2) {
            java.lang.Object systemService = context.getSystemService("batterymanager");
            if (systemService == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.os.BatteryManager");
            }
            android.os.BatteryManager batteryManager = (android.os.BatteryManager) systemService;
            int intProperty = batteryManager.getIntProperty(1);
            int intProperty2 = batteryManager.getIntProperty(4);
            if (intProperty <= 0 || intProperty2 <= 0) {
                return -1;
            }
            return (int) (((intProperty / intProperty2) * 100) / 1000);
        }
    }

    public static final long h(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("batterymanager");
        if (systemService != null) {
            return ((android.os.BatteryManager) systemService).getLongProperty(2);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.os.BatteryManager");
    }

    public static final int i(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        wh.k kVar = (wh.k) t();
        kVar.getClass();
        wh.h hVar = kVar.f445820e;
        if (hVar == null || hVar.a()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(j(context));
            kVar.f445820e = new wh.h(valueOf, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
            return valueOf.intValue();
        }
        wh.h hVar2 = kVar.f445820e;
        kotlin.jvm.internal.o.d(hVar2);
        return ((java.lang.Number) hVar2.f445793b).intValue();
    }

    public static final int j(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent k17 = k(context);
        if (k17 != null) {
            int intExtra = k17.getIntExtra(ya.b.LEVEL, -1);
            int intExtra2 = k17.getIntExtra("scale", -1);
            if (intExtra2 > 0) {
                return (intExtra * 100) / intExtra2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r4 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.Intent k(android.content.Context r4) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r4, r0)
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L32
            r2 = 33
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            if (r1 < r2) goto L25
            android.content.pm.ApplicationInfo r1 = r4.getApplicationInfo()     // Catch: java.lang.Exception -> L32
            int r1 = r1.targetSdkVersion     // Catch: java.lang.Exception -> L32
            r2 = 34
            if (r1 < r2) goto L25
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch: java.lang.Exception -> L32
            r1.<init>(r3)     // Catch: java.lang.Exception -> L32
            r2 = 4
            android.content.Intent r4 = r4.registerReceiver(r0, r1, r2)     // Catch: java.lang.Exception -> L32
            if (r4 == 0) goto L4d
            goto L30
        L25:
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch: java.lang.Exception -> L32
            r1.<init>(r3)     // Catch: java.lang.Exception -> L32
            android.content.Intent r4 = r4.registerReceiver(r0, r1)     // Catch: java.lang.Exception -> L32
            if (r4 == 0) goto L4d
        L30:
            r0 = r4
            goto L4d
        L32:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "get ACTION_BATTERY_CHANGED failed: "
            r1.<init>(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Matrix.battery.Utils"
            oj.j.f(r2, r4, r1)
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.m.k(android.content.Context):android.content.Intent");
    }

    public static final int l(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        wh.k kVar = (wh.k) t();
        kVar.getClass();
        wh.h hVar = kVar.f445817b;
        if (hVar == null || hVar.a()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(m(context));
            kVar.f445817b = new wh.h(valueOf, 5000);
            return valueOf.intValue();
        }
        wh.h hVar2 = kVar.f445817b;
        kotlin.jvm.internal.o.d(hVar2);
        return ((java.lang.Number) hVar2.f445793b).intValue();
    }

    public static final int m(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
            android.content.Intent k17 = k(context);
            if (k17 != null) {
                return k17.getIntExtra("temperature", 0);
            }
            return 0;
        } catch (java.lang.Exception e17) {
            oj.j.f("Matrix.battery.Utils", "get EXTRA_TEMPERATURE failed: " + e17.getMessage(), new java.lang.Object[0]);
            return 0;
        }
    }

    public static final int n(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent k17 = k(context);
        if (k17 != null) {
            int intExtra = k17.getIntExtra("max_charging_current", -1);
            int intExtra2 = k17.getIntExtra("max_charging_voltage", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                return ((intExtra / 1000) * (intExtra2 / 1000)) / 1000000;
            }
        }
        return -1;
    }

    public static final int o() {
        int availableProcessors;
        wh.k kVar = (wh.k) t();
        wh.h hVar = kVar.f445822g;
        if (hVar != null && !hVar.a()) {
            wh.h hVar2 = kVar.f445822g;
            kotlin.jvm.internal.o.d(hVar2);
            return ((java.lang.Number) hVar2.f445793b).intValue();
        }
        try {
            availableProcessors = new java.io.File("/sys/devices/system/cpu/").listFiles(wh.j.f445805a).length;
        } catch (java.lang.Exception unused) {
            availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        }
        if (availableProcessors <= 1) {
            return availableProcessors;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(availableProcessors);
        kVar.f445822g = new wh.h(valueOf, 3600000);
        return valueOf.intValue();
    }

    public static final int[] p() {
        int o17 = o();
        int[] iArr = new int[o17];
        for (int i17 = 0; i17 < o17; i17++) {
            iArr[i17] = 0;
            java.lang.String a17 = a("/sys/devices/system/cpu/cpu" + i17 + "/cpufreq/scaling_cur_freq");
            if (!android.text.TextUtils.isEmpty(a17)) {
                try {
                    kotlin.jvm.internal.o.d(a17);
                    iArr[i17] = java.lang.Integer.parseInt(a17) / 1000;
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return iArr;
    }

    public static final java.util.List q() {
        java.util.Collection collection;
        int o17 = o();
        java.util.ArrayList arrayList = new java.util.ArrayList(o17);
        for (int i17 = 0; i17 < o17; i17++) {
            java.lang.String a17 = a("/sys/devices/system/cpu/cpu" + i17 + "/cpufreq/scaling_available_frequencies");
            if (!android.text.TextUtils.isEmpty(a17)) {
                kotlin.jvm.internal.o.d(a17);
                java.util.List g17 = new r26.t(" ").g(a17, 0);
                if (!g17.isEmpty()) {
                    java.util.ListIterator listIterator = g17.listIterator(g17.size());
                    while (listIterator.hasPrevious()) {
                        if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                            collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection = kz5.p0.f313996d;
                java.lang.Object[] array = collection.toArray(new java.lang.String[0]);
                if (array == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                java.lang.String[] strArr = (java.lang.String[]) array;
                int[] iArr = new int[strArr.length];
                int length = strArr.length;
                for (int i18 = 0; i18 < length; i18++) {
                    try {
                        iArr[i18] = java.lang.Integer.parseInt(strArr[i18]) / 1000;
                    } catch (java.lang.Exception unused) {
                        iArr[i18] = 0;
                    }
                }
                arrayList.add(iArr);
            }
        }
        return arrayList;
    }

    public static final int r(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        wh.k kVar = (wh.k) t();
        kVar.getClass();
        wh.h hVar = kVar.f445819d;
        if (hVar == null || hVar.a()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper()) ? y(context) : w(context) ? 1 : !A(context) ? 3 : wh.e1.c(context) ? 4 : 2);
            kVar.f445819d = new wh.h(valueOf, 5000);
            return valueOf.intValue();
        }
        wh.h hVar2 = kVar.f445819d;
        kotlin.jvm.internal.o.d(hVar2);
        return ((java.lang.Number) hVar2.f445793b).intValue();
    }

    public static final java.lang.String s() {
        wh.k kVar = (wh.k) t();
        if (!android.text.TextUtils.isEmpty(kVar.f445816a)) {
            return kVar.f445816a;
        }
        java.lang.String b17 = oj.m.b(oj.m.a());
        kVar.f445816a = b17;
        return b17;
    }

    public static final wh.i t() {
        return (wh.i) f445831b.getValue();
    }

    public static final int u(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        try {
            java.lang.Object systemService = context.getSystemService("power");
            if (systemService != null) {
                return ((android.os.PowerManager) systemService).getCurrentThermalStatus();
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.os.PowerManager");
        } catch (java.lang.Exception e17) {
            oj.j.f("Matrix.battery.Utils", "getCurrentThermalStatus failed: " + e17.getMessage(), new java.lang.Object[0]);
            return -1;
        }
    }

    public static final boolean v(android.content.Context context) {
        java.lang.Object systemService;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            systemService = context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        } catch (java.lang.Throwable unused) {
        }
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
        java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices = ((android.app.ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE);
        if (runningServices != null) {
            for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (!android.text.TextUtils.isEmpty(runningServiceInfo.process)) {
                    java.lang.String str = runningServiceInfo.process;
                    kotlin.jvm.internal.o.f(str, "runningServiceInfo.process");
                    java.lang.String packageName = context.getPackageName();
                    kotlin.jvm.internal.o.f(packageName, "context.packageName");
                    if (r26.i0.y(str, packageName, false) && runningServiceInfo.foreground) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean w(android.content.Context context) {
        int intExtra;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Integer num = f445830a;
        if (num == null || num.intValue() != 1) {
            return (num != null && num.intValue() == 2) ? x(context) : y(context);
        }
        android.content.Intent k17 = k(context);
        return k17 != null && ((intExtra = k17.getIntExtra("status", -1)) == 2 || intExtra == 5);
    }

    public static final boolean x(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        boolean z17 = false;
        try {
            android.content.Intent k17 = k(context);
            if (k17 == null) {
                return false;
            }
            int intExtra = k17.getIntExtra("status", -1);
            if (k17.getIntExtra("plugged", -1) == 0 && intExtra != 1) {
                z17 = true;
            }
            return !z17;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static final boolean y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("batterymanager");
        if (systemService != null) {
            return ((android.os.BatteryManager) systemService).isCharging();
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.os.BatteryManager");
    }

    public static final boolean z(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
            java.lang.Object systemService = context.getSystemService("power");
            if (systemService != null) {
                return ((android.os.PowerManager) systemService).isDeviceIdleMode();
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.os.PowerManager");
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
