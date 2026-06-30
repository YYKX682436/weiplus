package oj;

/* loaded from: classes12.dex */
public final class o {
    public o(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.matrix.util.MemInfo[] a() {
        com.tencent.matrix.util.MemInfo[] memInfoArr;
        char c17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.ActivityManager activityManager = oj.p.f345712a;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (runningAppProcesses == null) {
            oj.j.b("Matrix.MemoryInfoFactory", "ERROR: activityManager.runningAppProcesses - no running process", new java.lang.Object[0]);
            memInfoArr = new com.tencent.matrix.util.MemInfo[0];
        } else {
            oj.j.a("Matrix.MemoryInfoFactory", "processInfoList[" + runningAppProcesses + ']', new java.lang.Object[0]);
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            com.tencent.matrix.util.SystemInfo systemInfo = new com.tencent.matrix.util.SystemInfo(memoryInfo.totalMem, memoryInfo.availMem, memoryInfo.lowMemory, memoryInfo.threshold);
            int size = runningAppProcesses.size();
            for (int i17 = 0; i17 < size; i17++) {
                android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i17);
                ih.d d17 = ih.d.d();
                kotlin.jvm.internal.o.f(d17, "Matrix.with()");
                android.app.Application application = d17.f291471b;
                kotlin.jvm.internal.o.f(application, "Matrix.with().application");
                java.lang.String pkgName = application.getPackageName();
                if (android.os.Process.myUid() == runningAppProcessInfo.uid && !android.text.TextUtils.isEmpty(runningAppProcessInfo.processName)) {
                    java.lang.String str = runningAppProcessInfo.processName;
                    kotlin.jvm.internal.o.f(str, "processInfo.processName");
                    kotlin.jvm.internal.o.f(pkgName, "pkgName");
                    if (r26.i0.y(str, pkgName, false)) {
                        int i18 = runningAppProcessInfo.pid;
                        java.lang.String str2 = runningAppProcessInfo.processName;
                        kotlin.jvm.internal.o.f(str2, "processInfo.processName");
                        arrayList.add(new com.tencent.matrix.util.MemInfo(new com.tencent.matrix.util.ProcessInfo(i18, str2, null, false, false, 28, null), null, null, null, systemInfo, new com.tencent.matrix.util.PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null), new com.tencent.matrix.util.PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null), null, 128, null));
                        c17 = ']';
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("info with uid [");
                sb6.append(runningAppProcessInfo.uid);
                sb6.append("] & process name [");
                sb6.append(runningAppProcessInfo.processName);
                sb6.append("] is not current app [");
                sb6.append(android.os.Process.myUid());
                sb6.append("][");
                sb6.append(pkgName);
                c17 = ']';
                sb6.append(']');
                oj.j.b("Matrix.MemoryInfoFactory", sb6.toString(), new java.lang.Object[0]);
            }
            java.lang.Object[] array = arrayList.toArray(new com.tencent.matrix.util.MemInfo[0]);
            if (array == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            memInfoArr = (com.tencent.matrix.util.MemInfo[]) array;
        }
        android.app.ActivityManager activityManager2 = oj.p.f345712a;
        android.app.ActivityManager activityManager3 = oj.p.f345712a;
        int[] iArr = new int[memInfoArr.length];
        int length = memInfoArr.length;
        int i19 = 0;
        int i27 = 0;
        while (i27 < length) {
            com.tencent.matrix.util.ProcessInfo processInfo = memInfoArr[i27].f53097e;
            kotlin.jvm.internal.o.d(processInfo);
            iArr[i19] = processInfo.f53108d;
            i27++;
            i19++;
        }
        android.os.Debug.MemoryInfo[] processMemoryInfo = activityManager3.getProcessMemoryInfo(iArr);
        if (processMemoryInfo != null) {
            int length2 = memInfoArr.length;
            for (int i28 = 0; i28 < length2; i28++) {
                android.os.Debug.MemoryInfo memoryInfo2 = processMemoryInfo[i28];
                if (memoryInfo2 == null) {
                    memInfoArr[i28].f53102m = new com.tencent.matrix.util.PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3584, null);
                } else {
                    com.tencent.matrix.util.MemInfo memInfo = memInfoArr[i28];
                    oj.y yVar = com.tencent.matrix.util.PssInfo.f53113s;
                    kotlin.jvm.internal.o.f(memoryInfo2, "pidMemInfoArray[i]");
                    memInfo.f53102m = yVar.a(memoryInfo2);
                }
            }
        }
        oj.j.c("Matrix.MemoryInfoFactory", "getAllProcessPss cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis), new java.lang.Object[0]);
        return memInfoArr;
    }

    public final com.tencent.matrix.util.MemInfo b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        oj.y yVar = com.tencent.matrix.util.PssInfo.f53113s;
        android.os.Debug.MemoryInfo[] processMemoryInfo = oj.p.f345712a.getProcessMemoryInfo(new int[]{java.lang.Integer.valueOf(android.os.Process.myPid()).intValue()});
        kotlin.jvm.internal.o.f(processMemoryInfo, "MemInfoFactory.activityM…ss.myPid()).toIntArray())");
        android.os.Debug.MemoryInfo memoryInfo = (android.os.Debug.MemoryInfo) kz5.z.O(processMemoryInfo);
        com.tencent.matrix.util.MemInfo memInfo = new com.tencent.matrix.util.MemInfo(null, null, null, null, null, memoryInfo != null ? yVar.a(memoryInfo) : new com.tencent.matrix.util.PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null), yVar.b(), null, com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, null);
        memInfo.f53096d = java.lang.System.currentTimeMillis() - currentTimeMillis;
        return memInfo;
    }
}
