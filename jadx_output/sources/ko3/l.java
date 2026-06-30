package ko3;

/* loaded from: classes13.dex */
public class l implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ko3.m f309982a;

    public l(ko3.m mVar) {
        this.f309982a = mVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        boolean equals = ko3.u.f310011q.equals(method.getName());
        ko3.m mVar = this.f309982a;
        if (equals) {
            return mVar.f309988d.f310025e;
        }
        try {
            return method.invoke(mVar.f309992a.asBinder(), objArr);
        } catch (java.lang.reflect.InvocationTargetException e17) {
            java.lang.Throwable targetException = e17.getTargetException();
            java.lang.Class<?>[] exceptionTypes = method.getExceptionTypes();
            if (exceptionTypes != null && exceptionTypes.length > 0) {
                for (java.lang.Class<?> cls : method.getExceptionTypes()) {
                    if (cls.isAssignableFrom(targetException.getClass())) {
                        throw targetException;
                    }
                }
            }
            ko3.u.d(mVar.f309988d, targetException);
            return ko3.u.a(mVar.f309988d, method);
        } catch (java.lang.Throwable th6) {
            ko3.u.d(mVar.f309988d, th6);
            return ko3.u.a(mVar.f309988d, method);
        }
    }
}
