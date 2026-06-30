package u32;

/* loaded from: classes11.dex */
public abstract class s {
    public static boolean a(android.content.Context context) {
        if (gm0.k2.c(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceServiceHelper", "fully exited, no need to start service");
            return false;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.exdevice.service.ExDeviceService.class);
        intent.setFlags(268435456);
        l85.h1.e(intent, "exdevice", true, j45.l.e("exdevice"));
        return true;
    }
}
