package q35;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.SensorManager f359974a = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");

    /* renamed from: b, reason: collision with root package name */
    public q35.c f359975b;

    public d(android.content.Context context) {
    }

    public void a(q35.c cVar) {
        b();
        android.hardware.SensorManager sensorManager = this.f359974a;
        boolean z17 = false;
        if (sensorManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeSensorService", "cannot init sensor manager");
        } else {
            java.util.List<android.hardware.Sensor> sensorList = sensorManager.getSensorList(1);
            if (sensorList != null && sensorList.size() > 0) {
                z17 = true;
            }
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeSensorService", "no sensor found for shake detection");
        } else {
            this.f359975b = cVar;
            sensorManager.registerListener(cVar, sensorManager.getDefaultSensor(1), 1);
        }
    }

    public void b() {
        q35.c cVar = this.f359975b;
        if (cVar != null) {
            cVar.a();
            q35.c cVar2 = this.f359975b;
            android.hardware.SensorManager sensorManager = this.f359974a;
            sensorManager.unregisterListener(cVar2, sensorManager.getDefaultSensor(1));
            this.f359975b = null;
        }
    }
}
