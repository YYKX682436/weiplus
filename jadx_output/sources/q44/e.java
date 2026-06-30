package q44;

/* loaded from: classes4.dex */
public class e implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q44.f f360110d;

    public e(q44.f fVar) {
        this.f360110d = fVar;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        q44.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
        if (sensorEvent.sensor.getType() == 4) {
            long floor = (long) java.lang.Math.floor(sensorEvent.values[2] * 1000000.0f);
            q44.f fVar = this.f360110d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            long j17 = fVar.f360116f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            if (j17 == 0 && floor != 0) {
                q44.f fVar2 = this.f360110d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                fVar2.f360116f = floor;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            }
            q44.f fVar3 = this.f360110d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            long j18 = fVar3.f360116f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            if (j18 == floor) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
                return;
            }
            q44.f fVar4 = this.f360110d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            long j19 = fVar4.f360115e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            if (j19 != 0) {
                long j27 = sensorEvent.timestamp;
                q44.f fVar5 = this.f360110d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                long j28 = fVar5.f360115e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                float f17 = ((float) (j27 - j28)) * 1.0E-9f;
                q44.f fVar6 = this.f360110d;
                long j29 = sensorEvent.timestamp;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                fVar6.f360115e = j29;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                float abs = java.lang.Math.abs(sensorEvent.values[2]);
                q44.f fVar7 = this.f360110d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                java.lang.ref.WeakReference weakReference = fVar7.f360118h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                if (weakReference != null) {
                    q44.f fVar8 = this.f360110d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    java.lang.ref.WeakReference weakReference2 = fVar8.f360118h;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    aVar = (q44.a) weakReference2.get();
                } else {
                    aVar = null;
                }
                if (abs >= 5.0f) {
                    if (aVar != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLargeAcceleration", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
                        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView = ((e94.t) aVar).f250389a;
                        int i17 = com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView.C;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                        android.os.Handler handler = twistCoverView.f163934y;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                        android.os.Message.obtain(handler, 3).sendToTarget();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLargeAcceleration", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
                    } else {
                        com.tencent.mars.xlog.Log.e("TwistGyrosImpl", "listener is null, release sensor");
                        this.f360110d.setEnabled(false);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
                    return;
                }
                q44.f fVar9 = this.f360110d;
                double d17 = sensorEvent.values[2] * f17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$318", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                fVar9.f360114d += d17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$318", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                q44.f fVar10 = this.f360110d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                double d18 = fVar10.f360114d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                float degrees = (float) java.lang.Math.toDegrees(d18);
                if (aVar != null) {
                    ((e94.t) aVar).a(0.0f, degrees);
                } else {
                    com.tencent.mars.xlog.Log.e("TwistGyrosImpl", "listener is null, release sensor");
                    this.f360110d.setEnabled(false);
                }
            } else {
                q44.f fVar11 = this.f360110d;
                long j37 = sensorEvent.timestamp;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                fVar11.f360115e = j37;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
    }
}
