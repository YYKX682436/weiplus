package tp;

/* loaded from: classes7.dex */
public class b implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f421005a;

    public b(android.view.WindowManager windowManager) {
        this.f421005a = windowManager;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        boolean z17 = false;
        if (method.getName().equals("removeViewImmediate")) {
            java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
            if (stackTrace.length > 0) {
                int length = stackTrace.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        break;
                    }
                    if (stackTrace[i17].getMethodName().equals("handleDestroyActivity")) {
                        z17 = true;
                        break;
                    }
                    i17++;
                }
            }
        }
        java.lang.Object obj2 = this.f421005a;
        if (!z17) {
            return method.invoke(obj2, objArr);
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WindowManagerInvocationHandler", "removeViewImmediate");
            return method.invoke(obj2, objArr);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WindowManagerInvocationHandler", "catch it");
            return null;
        }
    }
}
