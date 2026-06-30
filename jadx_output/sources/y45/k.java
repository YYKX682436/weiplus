package y45;

/* loaded from: classes12.dex */
public class k implements yj0.c {
    public k(android.content.Context context) {
    }

    @Override // yj0.c
    public java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, final java.lang.Object obj, final java.lang.Object[] objArr) {
        if (str4.equals("getRemoteService")) {
            y45.l.f459371a++;
            com.tencent.mars.xlog.Log.i("MicroMsg.RecoveryInspector", "BaseGmsClient#getRemoteService, args = " + java.util.Arrays.toString(objArr) + ", count = " + y45.l.f459371a);
            if (obj instanceof com.google.android.gms.common.internal.BaseGmsClient) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecoveryInspector", "post");
                ku5.u0 u0Var = ku5.t0.f312615d;
                java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: y45.k$$a
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        java.lang.Object obj2 = obj;
                        java.lang.Object[] objArr2 = objArr;
                        com.tencent.mars.xlog.Log.i("MicroMsg.RecoveryInspector", "working");
                        java.lang.reflect.Method[] declaredMethods = com.google.android.gms.common.internal.BaseGmsClient.class.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                break;
                            }
                            java.lang.reflect.Method method = declaredMethods[i17];
                            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes.length == 2 && parameterTypes[0] == com.google.android.gms.common.internal.IAccountAccessor.class && parameterTypes[1] == java.util.Set.class) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.RecoveryInspector", "delegate");
                                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                                try {
                                    method.invoke(obj2, objArr2);
                                } catch (java.lang.Throwable th6) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.RecoveryInspector", "invoke err: " + th6.getMessage());
                                }
                                long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
                                com.tencent.mars.xlog.Log.i("MicroMsg.RecoveryInspector", "cost: " + uptimeMillis2);
                                if (uptimeMillis2 > 60000) {
                                    ap.a.a(1, "GmsLagging", null, null, java.lang.String.valueOf(y45.l.f459371a), "lagging");
                                }
                            } else {
                                i17++;
                            }
                        }
                        return null;
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.n(callable, 0L, "gms-invoke");
            }
        }
        return null;
    }
}
