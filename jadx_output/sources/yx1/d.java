package yx1;

/* loaded from: classes13.dex */
public class d implements java.lang.reflect.InvocationHandler {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f467824b = "mShow";

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f467825a;

    public d(java.lang.Object obj) {
        this.f467825a = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.Object obj2 = this.f467825a;
        if (obj2 == null) {
            return null;
        }
        if (method.getName().equals("enqueueToast") && objArr[1].getClass().getName().equals("android.widget.Toast$TN")) {
            try {
                java.lang.reflect.Field declaredField = objArr[1].getClass().getDeclaredField(f467824b);
                declaredField.setAccessible(true);
                tx1.a.a(declaredField);
                declaredField.set(objArr[1], new yx1.a(this, (java.lang.Runnable) declaredField.get(objArr[1])));
                com.tencent.mars.xlog.Log.i("MicroMsg.INotificationManagerInvocationHandler", "replace Toast.TN.mShow succ");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.INotificationManagerInvocationHandler", e17.getMessage());
            }
        }
        return method.invoke(obj2, objArr);
    }
}
