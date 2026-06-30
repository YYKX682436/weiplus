package wo;

/* loaded from: classes12.dex */
public abstract class x0 {
    public static void a(int i17, int i18, int i19, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfoDiagHelper", "[+] report idkey id: %s, key: %s, val: %s, isImportant: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17));
        jx3.f.INSTANCE.idkeyStat(i17, i18, i19, z17);
    }
}
