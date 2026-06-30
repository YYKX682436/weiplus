package q44;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final q44.b f360119a;

    public g() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        if (defaultSensor != null) {
            this.f360119a = new q44.f(context, defaultSensor);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 10);
            return;
        }
        android.hardware.Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        if (defaultSensor2 == null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 12);
        } else {
            this.f360119a = new q44.d(context, defaultSensor2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 11);
        }
    }
}
