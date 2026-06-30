package ob0;

/* loaded from: classes7.dex */
public abstract class r3 {
    public static boolean a() {
        int i17 = j62.e.g().i("clicfg_deep_background_process_reclaim", 0, true, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessReclaimSwitch", "isAppDeepBackgroundEnabled:" + i17);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return i17 == 0;
    }

    public static boolean b() {
        int i17 = j62.e.g().i("clicfg_exdevice_auto_release", 1, true, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessReclaimSwitch", "isExDeviceProcessReclaimDisabled:" + i17);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return i17 == 0;
    }
}
