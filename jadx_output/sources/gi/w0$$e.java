package gi;

/* loaded from: classes12.dex */
public final /* synthetic */ class w0$$e implements wh.u0 {
    @Override // wh.u0
    public final java.lang.Object apply(java.lang.Object obj) {
        int intValue;
        rh.c3 c3Var = (rh.c3) obj;
        if (pj.h.f354909a) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("com.oplus.util.OplusHoraeThermalHelper");
                intValue = ((java.lang.Integer) cls.getDeclaredMethod("getThermalStatus", new java.lang.Class[0]).invoke(cls.getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]), new java.lang.Object[0])).intValue();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.w("", "getThermalStatus failed: " + th6.getMessage());
            }
            com.tencent.mars.xlog.Log.i("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f395346g + " " + c3Var.f395340a + ", val = " + intValue);
            return java.lang.Integer.valueOf(intValue);
        }
        intValue = -1;
        com.tencent.mars.xlog.Log.i("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f395346g + " " + c3Var.f395340a + ", val = " + intValue);
        return java.lang.Integer.valueOf(intValue);
    }
}
