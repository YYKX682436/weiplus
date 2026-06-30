package org.chromium.base.memory;

/* loaded from: classes7.dex */
public class MemoryInfoBridge {
    public static android.os.Debug.MemoryInfo getActivityManagerMemoryInfoForSelf() {
        try {
            android.os.Debug.MemoryInfo[] processMemoryInfo = ((android.app.ActivityManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getProcessMemoryInfo(new int[]{android.os.Process.myPid()});
            if (processMemoryInfo == null) {
                return null;
            }
            return processMemoryInfo[0];
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }
}
