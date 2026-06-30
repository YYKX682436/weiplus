package qj0;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f363864a;

    public a() {
        android.os.Debug.MemoryInfo[] processMemoryInfo;
        android.os.Debug.MemoryInfo memoryInfo;
        int[] iArr = null;
        this.f363864a = null;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null || (processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{android.os.Process.myPid()})) == null || processMemoryInfo.length == 0 || (memoryInfo = processMemoryInfo[0]) == null) {
            return;
        }
        try {
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.os.Debug$MemoryInfo").getDeclaredField("otherStats");
            declaredField.setAccessible(true);
            iArr = (int[]) declaredField.get(memoryInfo);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("Gpu.GpuMemoryGetter", "getOtherStatsByReflect fail");
        }
        this.f363864a = iArr;
    }

    public int a() {
        int[] iArr = this.f363864a;
        if (iArr == null) {
            com.tencent.mars.xlog.Log.e("Gpu.GpuMemoryGetter", "getEGL fail, because otherStats == null");
            return 0;
        }
        try {
            return iArr[131] + iArr[129];
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("Gpu.GpuMemoryGetter", "getEGL fail, because getOtherPrivate fail");
            return 0;
        }
    }

    public int b() {
        int[] iArr = this.f363864a;
        if (iArr == null) {
            com.tencent.mars.xlog.Log.e("Gpu.GpuMemoryGetter", "getGL fail, because getOtherStats == null");
            return 0;
        }
        try {
            return iArr[140] + iArr[138];
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("Gpu.GpuMemoryGetter", "getGL fail, because getOtherStats == null");
            return 0;
        }
    }

    public int c() {
        int[] iArr = this.f363864a;
        if (iArr == null) {
            com.tencent.mars.xlog.Log.e("Gpu.GpuMemoryGetter", "getGfx fail, because otherStats == null");
            return 0;
        }
        try {
            return iArr[41] + iArr[39];
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("Gpu.GpuMemoryGetter", "getGfx fail, because getOtherPrivate fail");
            return 0;
        }
    }
}
