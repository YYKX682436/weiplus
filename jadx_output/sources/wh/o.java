package wh;

/* loaded from: classes12.dex */
public class o implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f445843a;

    public o(java.lang.Object obj) {
        this.f445843a = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if ("startDiscovery".equals(method.getName())) {
            java.util.Iterator it = ((java.util.ArrayList) wh.r.f445858a).iterator();
            while (it.hasNext()) {
                rh.b0 b0Var = ((rh.x) ((wh.q) it.next())).f395545a;
                java.lang.String b17 = b0Var.j() ? b0Var.f395294a.f363335d.A.b() : "";
                oj.j.c("Matrix.battery.BlueToothMonitorFeature", "#onStartDiscovery, stack = " + b17, new java.lang.Object[0]);
                rh.a0 a0Var = b0Var.f395307b;
                a0Var.getClass();
                if (!android.text.TextUtils.isEmpty(b17)) {
                    a0Var.f395298d = b17;
                }
                a0Var.f395296b++;
            }
        }
        try {
            return wh.r.a(this.f445843a, method, objArr);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.battery.BluetoothHooker", th6, "invokeBluetooth fail", new java.lang.Object[0]);
            return null;
        }
    }
}
