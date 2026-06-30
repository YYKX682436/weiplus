package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class m1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI f161308d;

    public m1(com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI fakeSwitchAccountUI) {
        this.f161308d = fakeSwitchAccountUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17;
        int i18 = com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI.f160141p;
        com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI fakeSwitchAccountUI = this.f161308d;
        try {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((android.app.ActivityManager) fakeSwitchAccountUI.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.equals(com.tencent.mm.sdk.platformtools.x2.f193072b)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FakeSwitchAccountUI", "process %s, %s", runningAppProcessInfo.processName, java.lang.Integer.valueOf(runningAppProcessInfo.pid));
                    i17 = runningAppProcessInfo.pid;
                    break;
                }
            }
        } catch (java.lang.Error e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FakeSwitchAccountUI", "isMMProcessExist Error: " + e17.toString());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FakeSwitchAccountUI", "isMMProcessExist Exception: " + e18.toString());
        }
        i17 = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeSwitchAccountUI", "oldPid %d, mm pid %d", java.lang.Integer.valueOf(fakeSwitchAccountUI.f160147i), java.lang.Integer.valueOf(i17));
        int i19 = fakeSwitchAccountUI.f160147i;
        if (i19 == 0 || i17 == 0 || i19 == i17) {
            int i27 = fakeSwitchAccountUI.f160149n + 1;
            fakeSwitchAccountUI.f160149n = i27;
            if (i27 <= 20) {
                return true;
            }
            com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI.T6(fakeSwitchAccountUI);
            return false;
        }
        int i28 = fakeSwitchAccountUI.f160149n;
        if (i28 < 1) {
            fakeSwitchAccountUI.f160149n = i28 + 1;
            return true;
        }
        com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI.T6(fakeSwitchAccountUI);
        return false;
    }
}
