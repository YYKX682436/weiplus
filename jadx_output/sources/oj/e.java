package oj;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f345699a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public e(java.util.List fgServices, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 1) != 0) {
            fgServices = new java.util.ArrayList();
            java.util.List<android.app.ActivityManager.RunningServiceInfo> list = kz5.p0.f313996d;
            try {
                java.util.List runningServices = oj.p.f345712a.getRunningServices(Integer.MAX_VALUE);
                kotlin.jvm.internal.o.f(runningServices, "MemInfoFactory.activityM…ngServices(Int.MAX_VALUE)");
                list = runningServices;
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.MemoryInfoFactory", th6, "", new java.lang.Object[0]);
            }
            for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo : list) {
                if (runningServiceInfo.uid == android.os.Process.myUid() && runningServiceInfo.pid == android.os.Process.myPid() && runningServiceInfo.foreground) {
                    android.content.ComponentName componentName = runningServiceInfo.service;
                    kotlin.jvm.internal.o.f(componentName, "serviceInfo.service");
                    fgServices.add(componentName.getClassName());
                }
            }
        }
        kotlin.jvm.internal.o.g(fgServices, "fgServices");
        this.f345699a = fgServices;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof oj.e) && kotlin.jvm.internal.o.b(this.f345699a, ((oj.e) obj).f345699a);
        }
        return true;
    }

    public int hashCode() {
        java.util.List list = this.f345699a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        java.lang.Object[] array = this.f345699a.toArray(new java.lang.String[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        java.lang.String arrays = java.util.Arrays.toString(array);
        kotlin.jvm.internal.o.f(arrays, "java.util.Arrays.toString(this)");
        return arrays;
    }
}
