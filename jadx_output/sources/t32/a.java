package t32;

/* loaded from: classes13.dex */
public abstract class a {
    public static void a(long j17, int i17) {
        v32.b b17 = com.tencent.mm.plugin.exdevice.model.l3.Ui().b1(j17 + "");
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceReport", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(11232, b17.field_deviceType + ',' + b17.field_deviceID + ',' + i17);
    }
}
