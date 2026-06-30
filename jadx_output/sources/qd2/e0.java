package qd2;

/* loaded from: classes2.dex */
public final class e0 implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g0 f361721d;

    public e0(qd2.g0 g0Var) {
        this.f361721d = g0Var;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        kotlin.jvm.internal.o.g(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent event) {
        int i17;
        kotlin.jvm.internal.o.g(event, "event");
        float[] fArr = event.values;
        boolean z17 = false;
        float f17 = -fArr[0];
        float f18 = -fArr[1];
        float f19 = -fArr[2];
        qd2.g0 g0Var = this.f361721d;
        java.lang.System.arraycopy(fArr, 0, g0Var.f361743g, 0, 3);
        float f27 = (f17 * f17) + (f18 * f18);
        float f28 = f19 * f19;
        float abs = java.lang.Math.abs(((float) java.lang.Math.sqrt(f27 + f28)) - 9.80665f);
        jz5.g gVar = g0Var.f361744h;
        if (abs > ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue()) {
            ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        } else if (java.lang.Math.abs(f18) < 0.2f) {
            kotlin.jvm.internal.o.f(java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f18)}, 1)), "format(...)");
        } else {
            z17 = true;
        }
        if (z17) {
            if (f27 * 4 >= f28) {
                i17 = 90 - ((int) java.lang.Math.rint(((float) java.lang.Math.atan2(-f18, f17)) * 57.29578f));
                while (i17 >= 360) {
                    i17 += org.chromium.net.NetError.ERR_HTTP2_INADEQUATE_TRANSPORT_SECURITY;
                }
                while (i17 < 0) {
                    i17 += com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
                }
            } else {
                i17 = -1;
            }
            if (i17 != g0Var.f361737a) {
                g0Var.f361737a = i17;
                qd2.j0 j0Var = (qd2.j0) g0Var;
                if (i17 == -1) {
                    return;
                }
                qd2.k0 k0Var = j0Var.f361783i;
                qd2.h0 h0Var = k0Var.f361785b;
                qd2.h0 h0Var2 = ((i17 < 330 || i17 >= 360) && (i17 < 0 || i17 > 30)) ? (i17 < 240 || i17 > 300) ? (i17 < 150 || i17 > 210) ? (i17 < 60 || i17 > 120) ? h0Var : qd2.h0.f361772h : qd2.h0.f361771g : qd2.h0.f361770f : qd2.h0.f361769e;
                if (h0Var2 != h0Var) {
                    qd2.i0 i0Var = k0Var.f361784a;
                    if (i0Var != null && h0Var != qd2.h0.f361768d) {
                        ((com.tencent.mm.plugin.finder.viewmodel.component.ot) i0Var).f135484a.invoke(h0Var, h0Var2);
                    }
                    k0Var.f361785b = h0Var2;
                }
            }
        }
    }
}
