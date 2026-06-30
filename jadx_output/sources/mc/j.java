package mc;

/* loaded from: classes14.dex */
public final class j implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mc.m f325524d;

    public j(mc.m mVar) {
        this.f325524d = mVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        boolean z17;
        java.lang.String str;
        boolean z18;
        if (sensorEvent.sensor.getType() == 5) {
            float f17 = sensorEvent.values[0];
            mc.l lVar = this.f325524d.f325529d;
            if (lVar != null) {
                lc.g gVar = ((lc.g$$k) lVar).f317842a;
                if (f17 < 4.0f) {
                    str = gVar.b().getString(com.tencent.mm.R.string.f493893pj2);
                    z17 = true;
                } else {
                    z17 = false;
                    str = "";
                }
                if (f17 > 235.0f) {
                    str = gVar.b().getString(com.tencent.mm.R.string.f493894pj3);
                    z18 = true;
                    z17 = true;
                } else {
                    z18 = false;
                }
                if (gVar.f317810h == null) {
                    return;
                }
                if (!z17) {
                    if (gVar.f317824y) {
                        gVar.f317824y = false;
                        pc.o oVar = gVar.f317819t;
                        if (oVar.f353217d.equals("")) {
                            return;
                        }
                        oVar.f353217d = "";
                        oVar.f353216c.setText("");
                        return;
                    }
                    return;
                }
                if (gVar.f317824y || !gVar.f317825z) {
                    return;
                }
                pc.o oVar2 = gVar.f317819t;
                if (!oVar2.f353217d.equals(str)) {
                    oVar2.f353217d = str;
                    oVar2.f353216c.setText(str);
                }
                if (z18) {
                    int i17 = ic.d.f290281k;
                    ic.c.f290280a.d(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.LIGHT_TOO_STRONG, true);
                } else {
                    int i18 = ic.d.f290281k;
                    ic.c.f290280a.d(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.LIGHT_TOO_LOW, true);
                }
                gVar.f317824y = true;
            }
        }
    }
}
