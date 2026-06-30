package wh;

/* loaded from: classes12.dex */
public class x0 implements wh.a2 {
    @Override // wh.a2
    public java.lang.Object a(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        return null;
    }

    @Override // wh.a2
    public void b(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if ("requestLocationUpdates".equals(method.getName())) {
            long j17 = -1;
            float f17 = -1.0f;
            if (objArr != null) {
                for (java.lang.Object obj : objArr) {
                    if (obj != null && "android.location.LocationRequest".equals(obj.getClass().getName())) {
                        try {
                            java.lang.reflect.Method declaredMethod = obj.getClass().getDeclaredMethod("getFastestInterval", new java.lang.Class[0]);
                            declaredMethod.setAccessible(true);
                            j17 = ((java.lang.Long) declaredMethod.invoke(obj, new java.lang.Object[0])).longValue();
                            java.lang.reflect.Method declaredMethod2 = obj.getClass().getDeclaredMethod("getSmallestDisplacement", new java.lang.Class[0]);
                            declaredMethod2.setAccessible(true);
                            f17 = ((java.lang.Float) declaredMethod2.invoke(obj, new java.lang.Object[0])).floatValue();
                        } catch (java.lang.Throwable th6) {
                            oj.j.d("Matrix.battery.LocationHooker", th6, "", new java.lang.Object[0]);
                        }
                    }
                }
            }
            java.util.Iterator it = ((java.util.ArrayList) wh.z0.f445906a).iterator();
            while (it.hasNext()) {
                rh.m2 m2Var = ((rh.i2) ((wh.y0) it.next())).f395422a;
                java.lang.String b17 = m2Var.j() ? m2Var.f395294a.f363335d.A.b() : "";
                oj.j.c("Matrix.battery.LocationMonitorFeature", "#onRequestLocationUpdates, time = " + j17 + ", distance = " + f17 + ", stack = " + b17, new java.lang.Object[0]);
                rh.l2 l2Var = m2Var.f395460b;
                l2Var.getClass();
                if (!android.text.TextUtils.isEmpty(b17)) {
                    l2Var.f395445b = b17;
                }
                l2Var.f395444a++;
            }
        }
    }
}
