package sh;

/* loaded from: classes12.dex */
public class c extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f408001b = new android.util.SparseArray();

    public static float k(long j17, long j18) {
        return (((float) j17) / (((float) j18) * 1.0f)) * 100.0f;
    }

    public static java.lang.String l(java.lang.String str, int i17) {
        if (str != null && str.length() >= i17) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(new java.lang.String(new char[i17 - (str == null ? 0 : str.length())]).replace("\u0000", " "));
        sb6.append(str);
        return sb6.toString();
    }

    public static java.lang.String m(float f17, int i17) {
        return java.lang.String.format("%." + i17 + "f", java.lang.Float.valueOf(f17));
    }

    public static java.util.List n(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.contains(context.getPackageName())) {
                    arrayList.add(new m3.d(java.lang.Integer.valueOf(runningAppProcessInfo.pid), runningAppProcessInfo.processName));
                }
            }
        }
        return arrayList;
    }

    @Override // rh.e3
    public int b() {
        return Integer.MIN_VALUE;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.TopThread";
    }

    public void o() {
        this.f408001b.clear();
    }

    public void p(int i17, m3.i iVar, sh.b bVar) {
        if (((com.tencent.matrix.batterycanary.monitor.feature.c) this.f395294a.i(com.tencent.matrix.batterycanary.monitor.feature.c.class)) == null) {
            return;
        }
        long j17 = i17 * 1000;
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(null);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("matrix_top");
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        handler.postDelayed(new sh.a(this, atomicReference, bVar, j17, handler, iVar), j17);
    }
}
