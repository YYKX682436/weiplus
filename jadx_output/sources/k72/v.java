package k72;

/* loaded from: classes14.dex */
public final class v implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public android.hardware.SensorManager f304769d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ju3 f304770e = new r45.ju3();

    /* renamed from: f, reason: collision with root package name */
    public long f304771f;

    public final void a() {
        r45.ju3 ju3Var = this.f304770e;
        if (ju3Var != null) {
            ju3Var.f378109d = false;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object systemService = context != null ? context.getSystemService("sensor") : null;
        android.hardware.SensorManager sensorManager = systemService instanceof android.hardware.SensorManager ? (android.hardware.SensorManager) systemService : null;
        if (sensorManager == null) {
            sensorManager = null;
        }
        this.f304769d = sensorManager;
        if (sensorManager != null) {
            android.hardware.Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(4) : null;
            if (defaultSensor != null) {
                android.hardware.SensorManager sensorManager2 = this.f304769d;
                if (sensorManager2 != null) {
                    sensorManager2.registerListener(this, defaultSensor, 3);
                }
                if (ju3Var != null) {
                    ju3Var.f378109d = true;
                }
            }
        }
        this.f304771f = 0L;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        if (sensorEvent != null) {
            r45.ku3 ku3Var = new r45.ku3();
            float[] fArr = sensorEvent.values;
            ku3Var.f378954d = fArr[0];
            ku3Var.f378955e = fArr[1];
            ku3Var.f378956f = fArr[2];
            long j17 = sensorEvent.timestamp;
            ku3Var.f378957g = j17;
            long j18 = this.f304771f;
            if (j17 - j18 > 2000000000) {
                r45.ju3 ju3Var = this.f304770e;
                if (0 == j18 && ju3Var != null && (linkedList2 = ju3Var.f378110e) != null) {
                    linkedList2.clear();
                }
                this.f304771f = sensorEvent.timestamp;
                if (ju3Var == null || (linkedList = ju3Var.f378110e) == null) {
                    return;
                }
                linkedList.add(ku3Var);
            }
        }
    }
}
