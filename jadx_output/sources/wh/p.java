package wh;

/* loaded from: classes12.dex */
public class p implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f445846a;

    public p(java.lang.Object obj) {
        this.f445846a = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if ("registerScanner".equals(method.getName())) {
            java.util.Iterator it = ((java.util.ArrayList) wh.r.f445858a).iterator();
            while (it.hasNext()) {
                rh.b0 b0Var = ((rh.x) ((wh.q) it.next())).f395545a;
                java.lang.String b17 = b0Var.j() ? b0Var.f395294a.f363335d.A.b() : "";
                oj.j.c("Matrix.battery.BlueToothMonitorFeature", "#onRegisterScanner, stack = " + b17, new java.lang.Object[0]);
                rh.a0 a0Var = b0Var.f395307b;
                a0Var.getClass();
                if (!android.text.TextUtils.isEmpty(b17)) {
                    a0Var.f395298d = b17;
                }
                a0Var.f395295a++;
            }
        } else if ("startScan".equals(method.getName())) {
            if (objArr.length > 0) {
                java.lang.Object obj2 = objArr[0];
                r2 = obj2 instanceof java.lang.Integer ? ((java.lang.Integer) obj2).intValue() : -1;
                for (java.lang.Object obj3 : objArr) {
                    if (obj3 instanceof android.bluetooth.le.ScanSettings) {
                    }
                }
            }
            java.util.Iterator it6 = ((java.util.ArrayList) wh.r.f445858a).iterator();
            while (it6.hasNext()) {
                rh.x xVar = (rh.x) ((wh.q) it6.next());
                xVar.getClass();
                oj.j.c("Matrix.battery.BlueToothMonitorFeature", "#onStartScan, id = " + r2, new java.lang.Object[0]);
                rh.a0 a0Var2 = xVar.f395545a.f395307b;
                a0Var2.f395297c = a0Var2.f395297c + 1;
            }
        } else if ("startScanForIntent".equals(method.getName())) {
            if (objArr != null) {
                for (java.lang.Object obj4 : objArr) {
                    if (obj4 instanceof android.bluetooth.le.ScanSettings) {
                    }
                }
            }
            java.util.Iterator it7 = ((java.util.ArrayList) wh.r.f445858a).iterator();
            while (it7.hasNext()) {
                rh.x xVar2 = (rh.x) ((wh.q) it7.next());
                xVar2.getClass();
                oj.j.c("Matrix.battery.BlueToothMonitorFeature", "#onStartScanForIntent", new java.lang.Object[0]);
                xVar2.f395545a.f395307b.f395297c++;
            }
        }
        try {
            return wh.r.a(this.f445846a, method, objArr);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.battery.BluetoothHooker", th6, "invokeBluetoothGatt fail", new java.lang.Object[0]);
            return null;
        }
    }
}
