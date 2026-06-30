package io3;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f293515a;

    /* renamed from: b, reason: collision with root package name */
    public long f293516b;

    public g(android.hardware.SensorEvent sensorEvent) {
        this.f293515a = new float[3];
        this.f293516b = 0L;
        a(sensorEvent);
    }

    public void a(android.hardware.SensorEvent sensorEvent) {
        float[] fArr;
        float[] fArr2 = this.f293515a;
        if (sensorEvent == null || (fArr = sensorEvent.values) == null) {
            java.util.Arrays.fill(fArr2, Float.NaN);
            this.f293516b = 0L;
            return;
        }
        if (fArr.length > 0) {
            fArr2[0] = fArr[0];
        }
        if (fArr.length > 1) {
            fArr2[1] = fArr[1];
        }
        if (fArr.length > 2) {
            fArr2[2] = fArr[2];
        }
        this.f293516b = sensorEvent.timestamp / 1000000;
    }

    public g() {
        float[] fArr = new float[3];
        this.f293515a = fArr;
        this.f293516b = 0L;
        java.util.Arrays.fill(fArr, Float.NaN);
        this.f293516b = 0L;
    }
}
